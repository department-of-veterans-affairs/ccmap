package gov.va.vinci.mapper.pipeline;

/*
 * #%L
 * cTAKES based concept mapper
 * %%
 * Copyright (C) 2010 - 2021 Department of Veterans Affairs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import gov.va.vinci.leo.context.ae.ContextAnnotator;
import gov.va.vinci.leo.descriptors.LeoAEDescriptor;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.filter.ae.FilterAnnotator;
import gov.va.vinci.leo.sentence.ae.AnchoredSentenceAnnotator;
import gov.va.vinci.mapper.ae.AssertionMergingAE;
import gov.va.vinci.mapper.ae.ConceptWindowAE;
import org.apache.ctakes.typesystem.type.textsem.*;

import java.util.HashMap;

public class ClinicalPipeline extends BasePipeline {
    public ClinicalPipeline() {

    }

    public ClinicalPipeline(HashMap argsMap) {
        pipeline = new LeoAEDescriptor();
        try {
            pipeline.addDelegate(createLeoAEDescriptor());
        } catch (Exception e) {
            e.printStackTrace();
        }
        pipeline.setTypeSystemDescription(getLeoTypeSystemDescription());

    }

    protected LeoAEDescriptor createLeoAEDescriptor() throws Exception {
        LeoAEDescriptor pipeline = new LeoAEDescriptor();

        pipeline.addDelegate(new LeoAEDescriptor("file:descriptors/defaultPipeline.xml"
                // pipeline.addDelegate(new LeoAEDescriptor("file:descriptors/AggregatePlaintextFastUMLSProcessor.xml"
         , false)
         .setName("clinical_pipeline")
         .addTypeSystemDescription(getLeoTypeSystemDescription())
         );
        pipeline.addDelegate(new FilterAnnotator()
                .setTypesToKeep(new String[]{SignSymptomMention.class.getCanonicalName(),
                        ProcedureMention.class.getCanonicalName(),
                        AnatomicalSiteMention.class.getCanonicalName(),
                        DiseaseDisorderMention.class.getCanonicalName(),
                        MedicationMention.class.getCanonicalName()})
                .setName("FilterAnnotator")
                .addLeoTypeSystemDescription(getLeoTypeSystemDescription()).getDescriptor());
        pipeline.addDelegate(new FilterAnnotator()
                .setTypesToKeep(new String[]{DiseaseDisorderMention.class.getCanonicalName()})
                .setTypesToDelete(new String[]{ProcedureMention.class.getCanonicalName(),
                        AnatomicalSiteMention.class.getCanonicalName(),
                        SignSymptomMention.class.getCanonicalName(),
                        MedicationMention.class.getCanonicalName()})
                .setName("FilterAnnotator1")
                .addLeoTypeSystemDescription(getLeoTypeSystemDescription())
                .getDescriptor());
        pipeline.addDelegate(new FilterAnnotator()
                .setTypesToKeep(new String[]{SignSymptomMention.class.getCanonicalName()})
                .setTypesToDelete(new String[]{ProcedureMention.class.getCanonicalName(),
                        AnatomicalSiteMention.class.getCanonicalName(),
                        DiseaseDisorderMention.class.getCanonicalName(),
                        MedicationMention.class.getCanonicalName()})
                .setName("FilterAnnotator2")
                .addLeoTypeSystemDescription(getLeoTypeSystemDescription())
                .getDescriptor());
        pipeline.addDelegate(new ConceptWindowAE()
                .setInputTypes(DiseaseDisorderMention.class.getCanonicalName(),
                        ProcedureMention.class.getCanonicalName(),
                        AnatomicalSiteMention.class.getCanonicalName(),
                        SignSymptomMention.class.getCanonicalName(),
                        MedicationMention.class.getCanonicalName())
                .setOutputType("gov.va.vinci.leo.sentence.types.AnchoredSentence")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        /**/
        /**/

        pipeline.addDelegate(new ContextAnnotator()
                .setConceptFeatureName("Anchor")
                .setResourceFile("resources/contextRules.txt")
                .setInputTypes(new String[]{"gov.va.vinci.leo.sentence.types.AnchoredSentence"})
                .setOutputType("gov.va.vinci.leo.context.types.Context")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        pipeline.addDelegate(new AssertionMergingAE()
                .setInputTypes(new String[]{ "gov.va.vinci.leo.context.types.Context" })
                .setName("AssertionMergingAE")
                .addLeoTypeSystemDescription(getLeoTypeSystemDescription())
                .getDescriptor());

        return pipeline;
    }

    @Override
    protected LeoTypeSystemDescription defineTypeSystem() {
        LeoTypeSystemDescription description = new LeoTypeSystemDescription();
        try {
            description.addTypeSystemDescription(new LeoTypeSystemDescription("org.apache.ctakes.typesystem.types.TypeSystem", true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        description.addTypeSystemDescription(new AnchoredSentenceAnnotator().getLeoTypeSystemDescription());
        description.addTypeSystemDescription(new ContextAnnotator().getLeoTypeSystemDescription());
        return description;


    }

}

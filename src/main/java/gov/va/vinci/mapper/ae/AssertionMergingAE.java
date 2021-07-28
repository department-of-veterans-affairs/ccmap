package gov.va.vinci.mapper.ae;

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


import gov.va.vinci.leo.ae.LeoBaseAnnotator;
import gov.va.vinci.leo.context.types.Context;
import gov.va.vinci.leo.sentence.types.AnchoredSentence;
import org.apache.ctakes.typesystem.type.textsem.EventMention;
import org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

public class AssertionMergingAE extends LeoBaseAnnotator {
    /**
     *  The goal is to take a look at the Context features and populate the corresponding features of the EventMention
     */
    @Override
    public void annotate(JCas aJCas) throws AnalysisEngineProcessException {
       // for (String type : getInputTypes()) {
        // Hard coding context type to simplify code
        // Concept type = gov.va.vinci.leo.context.types.Context
        // Concept annotation type = org.apache.ctakes.typesystem.type.textsem.EventMention

             FSIterator<Context> annotationList = aJCas.getAnnotationIndex(Context.class).iterator();
         /*
             public enum NegationContext { Affirmed, Negated, Possible;  }
             public enum TemporalityContext { Recent, Historical, Hypothetical; }
             public enum ExperiencerContext { Patient, Other;}
         * */
        while(annotationList.hasNext()){
            Context currCon = annotationList.next();
            AnchoredSentence anchoredSentence = (AnchoredSentence) currCon.getWindow();
            IdentifiedAnnotation concept = (IdentifiedAnnotation) anchoredSentence.getAnchor();

            if(currCon.getNegation().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.NegationContext.Negated.name())) concept.setPolarity(-1);
            if(currCon.getNegation().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.NegationContext.Affirmed.name())) concept.setPolarity(1);
            if(currCon.getNegation().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.NegationContext.Possible.name())) { concept.setPolarity(1); concept.setUncertainty(1); }

            if(currCon.getTemporality().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.TemporalityContext.Recent.name())) concept.setHistoryOf(0);
            if(currCon.getTemporality().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.TemporalityContext.Historical.name())) concept.setHistoryOf(1);
            if(currCon.getTemporality().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.TemporalityContext.Hypothetical.name())) concept.setConditional(true);

            if(currCon.getExperiencer().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.ExperiencerContext.Patient.name())) concept.setSubject("patient");
            if(currCon.getExperiencer().equalsIgnoreCase(gov.va.vinci.leo.context.tools.Context.ExperiencerContext.Other.name())) concept.setSubject("other");
        }

        }
}

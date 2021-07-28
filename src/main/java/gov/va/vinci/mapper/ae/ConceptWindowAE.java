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
import org.apache.ctakes.typesystem.type.textspan.LookupWindowAnnotation;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

public class ConceptWindowAE extends LeoBaseAnnotator {
    @Override
    public void annotate(JCas aJCas) throws AnalysisEngineProcessException {
        Feature conceptFeature = aJCas.getTypeSystem().getType(outputType).getFeatureByBaseName("Anchor");
        for (String singleType : inputTypes) {
            Type conceptType = aJCas.getTypeSystem().getType(singleType);
            FSIterator iter = aJCas.getAnnotationIndex(conceptType).iterator();
            while (iter.hasNext()){
                Annotation currAnn = (Annotation) iter.next();
                Annotation newAnn = this.addOutputAnnotation(outputType, aJCas, 0, aJCas.getDocumentText().length());
                newAnn.setFeatureValue(conceptFeature, currAnn);
            }
        }
    }
}

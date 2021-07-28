package gov.va.vinci.mapper.listeners;

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


import gov.va.vinci.mapper.ae.CONST;
import org.apache.commons.lang.StringUtils;
import org.apache.ctakes.typesystem.type.refsem.OntologyConcept;
import org.apache.ctakes.typesystem.type.refsem.UmlsConcept;
import org.apache.ctakes.typesystem.type.textsem.AnatomicalSiteMention;
import org.apache.ctakes.typesystem.type.textsem.DiseaseDisorderMention;
import org.apache.ctakes.typesystem.type.textsem.MedicationMention;
import org.apache.ctakes.typesystem.type.textsem.SignSymptomMention;
import org.apache.log4j.Logger;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.Feature;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by vhaslcpatteo on 3/24/2015.
 */
public class ListenerLogic {
    private static Logger log = Logger.getLogger(gov.va.vinci.leo.tools.LeoUtils.getRuntimeClass().toString());

    /**
     *
     * @param aJCas
     * @param currAnnotation
     * @return
     * @throws CASException
     */
    public static HashMap<String, HashSet<String>> getInstanceData(JCas aJCas, Annotation currAnnotation) throws CASException {
        // output to csv
        HashMap<String, HashSet<String>> currentDoc = new HashMap<String, HashSet<String>>();
/**/
        String cui = "";
        if (currAnnotation instanceof org.apache.ctakes.typesystem.type.textsem.EventMention) {

            FSArray ontologyConceptArr =  ((org.apache.ctakes.typesystem.type.textsem.EventMention) currAnnotation).getOntologyConceptArr();
            if (ontologyConceptArr  != null) {
                int size = ontologyConceptArr.size();
                HashSet<String> cuis = new HashSet<String>();
                for (int i = 0; i < size; i++) {
                    OntologyConcept oc = (OntologyConcept)ontologyConceptArr.get(i);
                    if (oc instanceof UmlsConcept) {
                        cui = ((UmlsConcept) oc).getCui();
                        cuis.add(cui);
                    }
                }
                getFeatures(currAnnotation, currentDoc);

                HashSet<String> types = new HashSet<String>();
                types.add(currAnnotation.getClass().getSimpleName());
                currentDoc.put("Type", types);

                HashSet<String> snippets = new HashSet<String>();
                snippets.add(shortenText(currAnnotation.getCoveredText(), 400, false));
                currentDoc.put("Snippets", snippets);

                HashSet<String> begin = new HashSet<String>();
                begin.add(Integer.toString(currAnnotation.getBegin()));
                currentDoc.put("SpanStart", begin);

                HashSet<String> end = new HashSet<String>();
                end.add(Integer.toString(currAnnotation.getEnd()));
                currentDoc.put("SpanEnd", end);

                currentDoc.put("CUI", cuis);
            }
        }
        if (currAnnotation instanceof AnatomicalSiteMention) {

            FSArray anatomicalSiteMentionArr = ((AnatomicalSiteMention) currAnnotation).getOntologyConceptArr();
            if (anatomicalSiteMentionArr != null) {
                int size = anatomicalSiteMentionArr.size();
                HashSet<String> cuis = new HashSet<String>();
                for (int i = 0; i < size; i++) {
                    OntologyConcept oc = (OntologyConcept)anatomicalSiteMentionArr.get(i);
                    if (oc instanceof UmlsConcept) {
                        cui = ((UmlsConcept) oc).getCui();
                        cuis.add(cui);
                    }
                }

                getFeatures(currAnnotation, currentDoc);
                HashSet<String> types = new HashSet<String>();
                types.add(currAnnotation.getClass().getSimpleName());
                currentDoc.put("Type", types);

                HashSet<String> snippets = new HashSet<String>();
                snippets.add(shortenText(currAnnotation.getCoveredText(), 400, false));
                currentDoc.put("Snippets", snippets);

                HashSet<String> begin = new HashSet<String>();
                begin.add(Integer.toString(currAnnotation.getBegin()));
                currentDoc.put("SpanStart", begin);

                HashSet<String> end = new HashSet<String>();
                end.add(Integer.toString(currAnnotation.getEnd()));
                currentDoc.put("SpanEnd", end);

                currentDoc.put("CUI", cuis);
            }
        }
        return currentDoc;
    }

    public static String shortenText(String text, int maxSize, boolean stripNewLines) {
        int length = text.length();
        if (length > maxSize) length = maxSize;
        if (stripNewLines)
            return text.substring(0, length).replaceAll("\\s+", " ").replaceAll("\\s+", " ");
        else
            return text.substring(0, length);
    }

    public static void getFeatures(Annotation annotation, HashMap<String, HashSet<String>> currentDoc) {
        // Recurse & insert features.
        Type type = annotation.getType();
        List<Feature> featuresList = type.getFeatures();
        for (int i = 0; i < featuresList.size(); ++i) {
            Feature feature = (Feature) featuresList.get(i);
            String nameFeat = feature.getName();
            if (nameFeat.startsWith("uima.")) {
                continue;
            }
            Type typeRange = feature.getRange();
            if (typeRange.isPrimitive()) {
                String featureValue = annotation.getFeatureValueAsString(feature);
                HashSet<String> featlist = new HashSet<String>();
                featlist.add(featureValue);
                currentDoc.put(feature.getShortName(), featlist);
            } else {
                // This is a Feature Structure, recurse through it.
                FeatureStructure fs = annotation.getFeatureValue(feature);
                if (fs == null) {
                    continue;
                }
                /** See if this is a reference to another annotation. If so, add it. **/
                if (fs instanceof Annotation) {
                    HashSet<String> anns = new HashSet<>();
                    anns.add(((Annotation) annotation.getFeatureValue(feature)).getCoveredText());
                    currentDoc.put(feature.getShortName(), anns);
                    // log.debug("");
                    continue;
                } else if (fs instanceof StringArray) {
                    //TODO: sort the array alphabetically?
                    int counter = 0;
                    String out = "";
                    if (((StringArray) fs).toArray().length > 0) {
                        if (((StringArray) fs).toArray().length > 1) {
                            for (String value : ((StringArray) fs).toArray()) {
                                if (StringUtils.isBlank(out))
                                    out = "|" + counter + ":" + value + "|";
                                else
                                    out = out + counter + ":" + value + "|";
                                counter++;
                            }
                            HashSet<String> vals = new HashSet<>();
                            vals.add(out);
                            currentDoc.put(feature.getShortName(), vals);
                            continue;
                        } else {
                            HashSet<String> vals = new HashSet<>();
                            vals.add(((StringArray) fs).toArray()[0]);
                            currentDoc.put(feature.getShortName(), vals);
                            continue;
                        }
                    }
                } else if (fs instanceof FSArray) {
                    FeatureStructure[] fsArray = ((FSArray) fs).toArray();
                    int counter = 0;
                    for (FeatureStructure item : fsArray) {
                        // TODO Implement, especially on recursive features.
                    }
                    continue;
                } else {
                    throw new RuntimeException(
                            "Unknown Feature Structure Type:"
                                    + fs.getType().getName());
                }
            }
        }
    }

    public static ArrayList<Object[]> convertFromMapToArray(HashMap<String, HashSet<String>> instanceData, ArrayList<ArrayList<String>> fieldList) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList rowData = new ArrayList<String>();

        // the maximum size of the arrays
        int rows = instanceData.get("CUI").size();

        for (int i = 0; i < rows; i++) {
            result.add(new ArrayList<String>());
        }

        for (int i = 0; i < fieldList.size(); i++) {
            String field = fieldList.get(i).get(0);
            String[] data = instanceData.get(field).toArray(new String[instanceData.get(field).size()]);
            for (int j = 0; j < rows; j++) {
                if (field.equalsIgnoreCase("cui")) {
                    result.get(j).add(data[j]);
                }
                else if (field.equalsIgnoreCase("type")) {
                    String dat = data[0];
                    if (dat.equalsIgnoreCase(MedicationMention.class.getSimpleName())) {
                        result.get(j).add(CONST.MEDICATION_MENTION_TYPE);
                    }
                    else if (dat.equalsIgnoreCase(AnatomicalSiteMention.class.getSimpleName())) {
                        result.get(j).add(CONST.ANOTOMICAL_SITE_MENTION_TYPE);
                    }
                    else if (dat.equalsIgnoreCase(SignSymptomMention.class.getSimpleName())) {
                        result.get(j).add(CONST.SIGN_SYMPTOM_MENTION_TYPE);
                    }
                    else if (dat.equalsIgnoreCase(DiseaseDisorderMention.class.getSimpleName())) {
                        result.get(j).add(CONST.DISEASE_DISORDER_MENTION_TYPE);
                    }
                    else {
                        result.get(j).add(CONST.PROCEDURE_MENTION_TYPE);
                    }
                }
                else if (field.equalsIgnoreCase("generic")
                        || field.equalsIgnoreCase("conditional")) {
                    result.get(j).add(Boolean.parseBoolean(data[0]) ? "1" : "0");
                }
                else if (field.equalsIgnoreCase("subject")) {
                    String dat = data[0];
                    if (dat.equalsIgnoreCase(CONST.ATTR_SUBJECT_PATIENT)) {
                        result.get(j).add(CONST.NE_SUBJECT_PATIENT);
                    }
                    else if (dat.equalsIgnoreCase(CONST.ATTR_SUBJECT_FAMILY_MEMBER)) {
                        result.get(j).add(CONST.NE_SUBJECT_FAMILY_MEMBER);
                    }
                    else if (dat.equalsIgnoreCase(CONST.ATTR_SUBJECT_DONOR_FAMILY_MEMBER)) {
                        result.get(j).add(CONST.NE_SUBJECT_DONOR_FAMILY_MEMBER);
                    }
                    else if (dat.equalsIgnoreCase(CONST.ATTR_SUBJECT_DONOR_OTHER)) {
                        result.get(j).add(CONST.NE_SUBJECT_DONOR_OTHER);
                    }
                    else {
                        result.get(j).add(CONST.NE_SUBJECT_OTHER);
                    }
                }
                else {
                    result.get(j).add(data[0]);
                }
            }
        }

//            if (org.apache.commons.lang3.StringUtils.isNotBlank((instanceData.get(headerInfo.get(0)).get(0 )))) {
//                rowData.add(instanceData.get(headerInfo.get(0)));
//            } else {
//                rowData.add(null);
//            }
//            result.add(rowData.toArray(new Object[rowData.size()]));

        ArrayList<Object[]> retval = new ArrayList<>();

        for (ArrayList<String> val : result) {
            retval.add(val.toArray());
        }

        return retval;
    }

    public static Object[] convertFromMapToObjectArray(HashMap<String, String> instanceData, String[] fieldList) {
        ArrayList rowData = new ArrayList<String>();
        for (String headerInfo : fieldList) {
            if (org.apache.commons.lang3.StringUtils.isNotBlank((instanceData.get(headerInfo)))) {
                rowData.add(instanceData.get(headerInfo));
            } else {
                rowData.add(null);
            }
        }
        return rowData.toArray(new Object[rowData.size()]);
    }

    public static String[] convertFromMapToStringArray(HashMap<String, String> instanceData, String[] fieldList) {
        ArrayList<String> rowData = new ArrayList<String>();
        for (String headerInfo : fieldList) {
            if (org.apache.commons.lang3.StringUtils.isNotBlank((instanceData.get(headerInfo)))) {
                rowData.add(instanceData.get(headerInfo));
            } else {
                rowData.add(null);
            }
        }
        return rowData.toArray(new String[rowData.size()]);
    }
}

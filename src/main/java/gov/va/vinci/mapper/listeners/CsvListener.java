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




import gov.va.vinci.leo.listener.BaseCsvListener;
import gov.va.vinci.leo.tools.LeoUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.uima.cas.CAS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Write annotation data out to a CSV file.
 *
 * @author olga patterson
 */
public class CsvListener extends BaseCsvListener {
    public static Logger log = Logger.getLogger(LeoUtils.getRuntimeClass().toString());
    protected ArrayList<ArrayList<String>> fieldList;

    /**
     * Creating a new listener using the String path to the new file
     * and the ArrayList with field names
     *
     * @param fileName
     * @param fieldList
     * @param inTypes
     * @return
     * @throws FileNotFoundException
     */
    public static CsvListener createNewListener(String fileName,
                                                ArrayList<ArrayList<String>> fieldList,
                                                String... inTypes) throws FileNotFoundException {
        if (!new File(fileName).getParentFile().exists())
            new File(fileName).getParentFile().mkdirs();

        return new CsvListener(new File(fileName), fieldList, inTypes);

    }

    /**
     * @param file
     * @param fieldList
     * @throws FileNotFoundException
     */
    public CsvListener(File file, ArrayList<ArrayList<String>> fieldList, String... inTypes) throws FileNotFoundException {
        super(file);
        this.fieldList = fieldList;
        this.inputType = inTypes;
    }

    @Override
    /**
     *  The current project outputs values for the context annotator
     */
    protected List<String[]> getRows(CAS aCas) {
        ArrayList rowList = new ArrayList<String[]>();
        int instanceId = 0;
        try {
            org.apache.uima.jcas.JCas aJCas = aCas.getJCas();

            // EchoExtractor has three potential output types -- Relation1, Relation2, and Relation3
            // In most cases only Relation1 is needed, but others are possible
            for (String incomingType : this.inputType) {

                org.apache.uima.cas.Type inputType = aJCas.getTypeSystem().getType(incomingType);
                java.util.Iterator<org.apache.uima.jcas.tcas.Annotation> lit = aJCas.getAnnotationIndex(inputType).iterator();
                // Make sure that at least one output annotation exists before creating a row
                if (lit.hasNext()) {
                    HashMap<String, HashSet<String>> documentInfo = new HashMap<>();
                    // Step 1: set initial values to documentInfo attributes
                    HashSet<String> docId = new HashSet<>();
                    docId.add(docInfo.getID());
                    documentInfo.put("DocID", docId);
                    if (docInfo.getRowData() != null) {
                        for (ArrayList<String> headerInfo : this.fieldList) {
                            int index = -1;
                            try {
                                index = Integer.parseInt(headerInfo.get(1));
                            } catch (Exception e) {
                                log.info("Issue with parsing integer in the second position of the field list of :" + headerInfo);
                            }
                            if (index >= 0) {
                                HashSet<String> rowdata = new HashSet<>();
                                rowdata.add(docInfo.getRowData(index));
                                documentInfo.put(headerInfo.get(0), rowdata);
                            }
                        }
                    }
                    while (lit.hasNext()) {
                        instanceId++;
                        HashMap<String, HashSet<String>> instanceData = new HashMap<>();
                        // Step 2. add all other values from the Logic
                        // TODO: get fields from ListenerLogic
                        instanceData.putAll(ListenerLogic.getInstanceData(aJCas, lit.next()));
                        if (instanceData.size() > 0) {
                            HashSet<String> instanceinfo = new HashSet<>();
                            instanceinfo.add(""+instanceId);
                            instanceData.put("InstanceID", instanceinfo);
                            instanceData.putAll(documentInfo);

                            // Step 3: Convert from HashMap of fields for each instance to an array
                            // add a new instance to the rowList for output
                            ArrayList<Object[]> rows = ListenerLogic.convertFromMapToArray(instanceData, this.fieldList);
                            rowList.add(rows);
                        }
                    } // end while
                }// end if type exists
            }// end for type
        } catch (org.apache.uima.cas.CASException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    private String[] convertFromMapToArray(HashMap<String, String> instanceData) {
        ArrayList<String> rowData = new ArrayList<String>();
        for (ArrayList<String> headerInfo : this.fieldList) {
            if (StringUtils.isNotBlank((instanceData.get(headerInfo.get(0))))) {
                rowData.add(instanceData.get(headerInfo.get(0)));
            } else {
                rowData.add("");
            }
        }
        return rowData.toArray(new String[rowData.size()]);
    }


    @Override
    protected String[] getHeaders() {
        ArrayList<String> headers = new ArrayList<String>();
        for (ArrayList<String> headerInfo : fieldList) {
            headers.add(headerInfo.get(0));
        }
        return headers.toArray(new String[headers.size()]);
    }

}// EliteCsvListener class
package gov.va.vinci.mapper.readers;

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


import gov.va.vinci.leo.cr.BaseDatabaseCollectionReader;
import gov.va.vinci.leo.cr.DatabaseCollectionReader;
import gov.va.vinci.leo.descriptors.LeoConfigurationParameter;
import gov.va.vinci.leo.model.DataQueryInformation;
import gov.va.vinci.leo.model.DatabaseConnectionInformation;
import gov.va.vinci.leo.tools.LeoUtils;
import gov.va.vinci.leo.types.CSI;
import org.apache.commons.lang3.StringUtils;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.util.Progress;
import org.apache.uima.util.ProgressImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DestructiveDatabaseCollectionReader extends BaseDatabaseCollectionReader {
    /**
     * Query to be used to get the data.
     */
    @LeoConfigurationParameter(mandatory = true)
    protected String query = null;

    /**
     * Zero based index of the ID column in the query.
     */
    @LeoConfigurationParameter(mandatory = true)
    protected String idColumn = null;

    /**
     * Zero based index of the note column in the query.
     */
    @LeoConfigurationParameter(mandatory = true)
    protected String noteColumn = null;

    //@LeoConfigurationParameter(mandatory = true)
    protected static List<String[]> preprocessRules = null;

    /**
     * Default constructor used during UIMA initialization.
     */
    public DestructiveDatabaseCollectionReader() { /** Do Nothing **/ }

    /**
     * Initialize with the database connection and query information.
     *
     * @param databaseConnectionInformation database connection information to use.
     * @param dataQueryInformation database query for retrieving results, assumes one record per row.
     */
    public DestructiveDatabaseCollectionReader(DatabaseConnectionInformation databaseConnectionInformation, DataQueryInformation dataQueryInformation/*, String _preprocessRulesPath*/) {
        super(databaseConnectionInformation);
        if(dataQueryInformation == null) {
            throw new IllegalArgumentException("DataQueryInformation argument cannot be null!");
        }
        validateParams(dataQueryInformation.getQuery(), dataQueryInformation.getIdColumn(), dataQueryInformation.getNoteColumn());
        this.query     = dataQueryInformation.getQuery();
        this.idColumn = dataQueryInformation.getIdColumn();
        this.noteColumn = dataQueryInformation.getNoteColumn();
        //this.preprocessRules = openPreprocessRules(_preprocessRulesPath);
    }

    /**
     * Initialize with the database connection and query information.
     *
     * @param databaseConnectionInformation database connection information to use.
     * @param query SQL query used to retrieve the data, one record per row of results.
     * @param idColumn name of the ID column in the SQL query. Assumes only one column to use as the record ID.
     *                 Additional ID fields are propagated through the row results String array of the CSI annotation.
     * @param noteColumn name of the note column in the SQL query. Assumes only one note column.
     */
    public DestructiveDatabaseCollectionReader(DatabaseConnectionInformation databaseConnectionInformation, String query, String idColumn, String noteColumn/*, String _preprocessRulesPath*/) {
        super(databaseConnectionInformation);
        validateParams(query, idColumn, noteColumn);
        this.query = query;
        this.idColumn = idColumn;
        this.noteColumn = noteColumn;
        //this.preprocessRules = openPreprocessRules(_preprocessRulesPath);
    }

    /**
     * Initialize with the database connection and query information.
     *
     * @param driver JDBC driver class
     * @param url JDBC connection URL
     * @param username database user name.
     * @param password database user password.
     * @param query SQL query used to retrieve the data, one record per row of results.
     * @param idColumn name of the ID column in the SQL query. Assumes only one column to use as the record ID.
     *                 Additional ID fields are propagated through the row results String array of the CSI annotation.
     * @param noteColumn name of the note column in the SQL query. Assumes only one note column.
     */
    public DestructiveDatabaseCollectionReader(String driver, String url, String username, String password, String query, String idColumn, String noteColumn/*, String _preprocessRulesPath*/) {
        super(driver, url, username, password);
        validateParams(query, idColumn, noteColumn);
        this.query = query;
        this.idColumn = idColumn;
        this.noteColumn = noteColumn;
        //this.preprocessRules = openPreprocessRules(_preprocessRulesPath);
    }

    /**
     * Get the database query used to pull data.
     *
     * @return database query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Set the database query used to pull data.
     *
     * @param query database query
     * @return reference to this reader instance
     */
    public <T extends DestructiveDatabaseCollectionReader> T setQuery(String query) {
        this.query = query;
        return (T) this;
    }

    /**
     * Get the ID Column name.
     *
     * @return ID Column name
     */
    public String getIdColumn() {
        return idColumn;
    }

    /**
     * Set the ID column to be used.
     *
     * @param idColumn ID column name
     * @return reference to this reader instance
     */
    public <T extends DestructiveDatabaseCollectionReader> T setIdColumn(String idColumn) {
        this.idColumn = idColumn;
        return (T) this;
    }

    /**
     * Get the note column name.
     *
     * @return note column name
     */
    public String getNoteColumn() {
        return noteColumn;
    }

    /**
     * Set the note column name.
     *
     * @param noteColumn note column name
     * @return reference to this reader instance
     */
    public <T extends DestructiveDatabaseCollectionReader> T setNoteColumn(String noteColumn) {
        this.noteColumn = noteColumn;
        return (T) this;
    }

    /**
     * Validate the parameters for the DatabaseCollectionReader to ensure that none of the required arguments are
     * missing or invalid.
     *
     * @param query SQL query to execute to retrieve the data.
     * @param idColumn Name of the column from which the record ID will be maintained.
     * @param noteColumn Name of the column which contains the note.
     */
    protected void validateParams(String query, String idColumn, String noteColumn) {
        if(StringUtils.isBlank(query)) {
            throw new IllegalArgumentException("Query String cannot be blank!");
        }
        if(StringUtils.isBlank(idColumn)) {
            throw new IllegalArgumentException("ID column cannot be blank!");
        }
        if(StringUtils.isBlank(noteColumn)) {
            throw new IllegalArgumentException("Note column cannot blank!");
        }
        if(!query.toLowerCase().contains(idColumn.toLowerCase())) {
            throw new IllegalArgumentException("ID column, " + idColumn + " was not found in the query! " + query);
        }
        if(!query.toLowerCase().contains(noteColumn.toLowerCase())) {
            throw new IllegalArgumentException("Note column, " + noteColumn + ", was not found in the query! " + query);
        }
    }

    /**
     * @param aCAS the CAS to populate with the next document;
     * @throws org.apache.uima.collection.CollectionException if there is a problem getting the next and populating the CAS.
     */
    @Override
    public void getNext(CAS aCAS) throws CollectionException, IOException {
        JCas jCas;
        try {
            jCas = aCAS.getJCas();
        } catch (CASException e) {
            throw new CollectionException(e);
        }
        Object[] row = mRecordList.get(mRowIndex++);
        int idIndex = dataManager.getHandler().getColumnIndex(idColumn);
        int noteIndex = dataManager.getHandler().getColumnIndex(noteColumn);
        jCas.setDocumentText(preprocessNote(LeoUtils.filterText((String) row[noteIndex], filters)));
        CSI csi = new CSI(jCas);
        csi.setBegin(0);
        csi.setEnd(jCas.getDocumentText().length());
        csi.setID(row[idIndex].toString());
        csi.setLocator(query);
        //Set the row data
        StringArray rowArray = new StringArray(jCas, row.length);
        String item;
        for(int index = 0; index < row.length; index++) {
            if(index == noteIndex) {
                item = null;
            } else {
                if(row[index] != null)
                    item=row[index].toString();
                else
                    item="";
            }
            rowArray.set(index, item);
        }
        // TODO: set modified text also in a data row
        csi.setRowData(rowArray);
        csi.addToIndexes();
    }

    public static ArrayList<String[]> openPreprocessRules(String preprocessRulesPath) {
        try {
            ArrayList<String[]> results = new ArrayList<>();
            File path = new File(preprocessRulesPath);
            if (path.isDirectory()) {
                String[] fileList = path.list();
                for (String f : fileList) {
                    Scanner fr = new Scanner(new File(preprocessRulesPath+"\\"+f));
                    List<String[]> temp_res = readPreprocessRule(fr);
                    fr.close();
                    results.addAll(temp_res);
                }
            } else {
                Scanner fr = new Scanner(path);
                results = readPreprocessRule(fr);
                fr.close();
            }
            return results;
        }
        catch (Exception e) {
            throw new IllegalArgumentException("One or more preprocess files does not exist or is incorrectly formatted.");
        }
    }

    public static ArrayList<String[]> readPreprocessRule(Scanner preprocessFile) {
        ArrayList<String[]> rules = new ArrayList<>();
        while (preprocessFile.hasNextLine()) {
            String[] line = preprocessFile.nextLine().split("\t");
            String statement ;
            if(line.length > 2) {
                if (line[2].equalsIgnoreCase("CI")) {
                    statement = "(?i)" + line[0] ;
                }else {
                    statement=line[0];
                }
            }else {
                statement=line[0];
            }
            if (line.length == 4) {
                rules.add(new String[]{statement, line[1], line[2], line[3]});
            } else {
                rules.add(new String[]{statement, line[1]});

            } /**/
        }
        return rules;
    }

    protected String preprocessNote(String note) {
        String processedNote = note;
        for (String[] rule : preprocessRules) {
            String processedNote1 = processedNote.replaceAll(rule[0], rule[1]);
            if(!processedNote1.equalsIgnoreCase(processedNote)){
                if(rule.length > 3) {
                  //  System.out.println(rule[3]);
                } else {
                   // System.out.println(rule[0] + "  -- " + rule[1]);
                }
                processedNote=processedNote1;
            }
        }
        return processedNote;
    }

    /**
     * @return true if and only if there are more elements available from this CollectionReader.
     * @throws org.apache.uima.collection.CollectionException
     */
    @Override
    public boolean hasNext() throws CollectionException {
        if(mRecordList == null || mRowIndex < 0) {
            //Execute the query to get the data from the database
            getData(query);
        }
        return (mRowIndex < mRecordList.size());
    }

    /**
     * Executes the query and saves the results internally to a <code>List of Object[]</code> to be retrieved when
     * <code>getNext()</code> is called.  Validates the id and note column field names.
     *
     * @param query the sql query to run.
     * @throws org.apache.uima.collection.CollectionException if there is an error in the query or with the id or column names
     */
    @Override
    protected void getData(String query) throws CollectionException {
        try {
            super.getData(query);
            if (dataManager.getHandler().getColumnIndex(idColumn) < 0) {
                throw new CollectionException(
                        "ID column name, " + idColumn + " was not found in the query: " + query,
                        null);
            }
            if (dataManager.getHandler().getColumnIndex(noteColumn) < 0) {
                throw new CollectionException(
                        "Note column name, " + noteColumn + " was not found in the query: " + query,
                        null);
            }
        } catch (Exception e) {
            throw new CollectionException(e);
        }
    }

    /**
     * Gets information about the number of entities and/or amount of data that has been read from
     * this <code>CollectionReader</code>, and the total amount that remains (if that information
     * is available).
     * <p/>
     * This method returns an array of <code>Progress</code> objects so that results can be reported
     * using different units. For example, the CollectionReader could report progress in terms of the
     * number of documents that have been read and also in terms of the number of bytes that have been
     * read. In many cases, it will be sufficient to return just one <code>Progress</code> object.
     *
     * @return an array of <code>Progress</code> objects. Each object may have different units (for
     * example number of entities or bytes).
     */
    @Override
    public Progress[] getProgress() {
        int current = (mRowIndex > 0)? mRowIndex : 0;
        int total = (mRecordList == null)? 0 : mRecordList.size();
        return new Progress[]{ new ProgressImpl(current, total, "row(s)")};
    }
}

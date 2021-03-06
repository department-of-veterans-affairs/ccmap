

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.structured;

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


import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Information about the caregiving setting for the clinical document.  Typically comes from structured metadata.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class SourceData extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SourceData.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SourceData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SourceData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SourceData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: noteTypeCode

  /** getter for noteTypeCode - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNoteTypeCode() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteTypeCode", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteTypeCode);}
    
  /** setter for noteTypeCode - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNoteTypeCode(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteTypeCode", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteTypeCode, v);}    
   
    
  //*--------------*
  //* Feature: noteSubTypeCode

  /** getter for noteSubTypeCode - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNoteSubTypeCode() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteSubTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteSubTypeCode", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteSubTypeCode);}
    
  /** setter for noteSubTypeCode - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNoteSubTypeCode(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_noteSubTypeCode == null)
      jcasType.jcas.throwFeatMissing("noteSubTypeCode", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_noteSubTypeCode, v);}    
   
    
  //*--------------*
  //* Feature: authorSpecialty

  /** getter for authorSpecialty - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAuthorSpecialty() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_authorSpecialty == null)
      jcasType.jcas.throwFeatMissing("authorSpecialty", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_authorSpecialty);}
    
  /** setter for authorSpecialty - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthorSpecialty(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_authorSpecialty == null)
      jcasType.jcas.throwFeatMissing("authorSpecialty", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_authorSpecialty, v);}    
   
    
  //*--------------*
  //* Feature: documentStandard

  /** getter for documentStandard - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentStandard() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_documentStandard == null)
      jcasType.jcas.throwFeatMissing("documentStandard", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_documentStandard);}
    
  /** setter for documentStandard - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentStandard(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_documentStandard == null)
      jcasType.jcas.throwFeatMissing("documentStandard", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_documentStandard, v);}    
   
    
  //*--------------*
  //* Feature: sourceInstanceId

  /** getter for sourceInstanceId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceInstanceId() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstanceId == null)
      jcasType.jcas.throwFeatMissing("sourceInstanceId", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstanceId);}
    
  /** setter for sourceInstanceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceInstanceId(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstanceId == null)
      jcasType.jcas.throwFeatMissing("sourceInstanceId", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstanceId, v);}    
   
    
  //*--------------*
  //* Feature: sourceRevisionNbr

  /** getter for sourceRevisionNbr - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSourceRevisionNbr() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionNbr == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionNbr", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionNbr);}
    
  /** setter for sourceRevisionNbr - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceRevisionNbr(int v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionNbr == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionNbr", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setIntValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionNbr, v);}    
   
    
  //*--------------*
  //* Feature: sourceRevisionDate

  /** getter for sourceRevisionDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceRevisionDate() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionDate == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionDate", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionDate);}
    
  /** setter for sourceRevisionDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceRevisionDate(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceRevisionDate == null)
      jcasType.jcas.throwFeatMissing("sourceRevisionDate", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceRevisionDate, v);}    
   
    
  //*--------------*
  //* Feature: sourceOriginalDate

  /** getter for sourceOriginalDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceOriginalDate() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceOriginalDate == null)
      jcasType.jcas.throwFeatMissing("sourceOriginalDate", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceOriginalDate);}
    
  /** setter for sourceOriginalDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceOriginalDate(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceOriginalDate == null)
      jcasType.jcas.throwFeatMissing("sourceOriginalDate", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceOriginalDate, v);}    
   
    
  //*--------------*
  //* Feature: sourceInstitution

  /** getter for sourceInstitution - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceInstitution() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstitution == null)
      jcasType.jcas.throwFeatMissing("sourceInstitution", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstitution);}
    
  /** setter for sourceInstitution - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceInstitution(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceInstitution == null)
      jcasType.jcas.throwFeatMissing("sourceInstitution", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceInstitution, v);}    
   
    
  //*--------------*
  //* Feature: sourceEncounterId

  /** getter for sourceEncounterId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceEncounterId() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceEncounterId == null)
      jcasType.jcas.throwFeatMissing("sourceEncounterId", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceEncounterId);}
    
  /** setter for sourceEncounterId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceEncounterId(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceEncounterId == null)
      jcasType.jcas.throwFeatMissing("sourceEncounterId", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceEncounterId, v);}    
   
    
  //*--------------*
  //* Feature: sourceApplication

  /** getter for sourceApplication - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSourceApplication() {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceApplication == null)
      jcasType.jcas.throwFeatMissing("sourceApplication", "org.apache.ctakes.typesystem.type.structured.SourceData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceApplication);}
    
  /** setter for sourceApplication - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceApplication(String v) {
    if (SourceData_Type.featOkTst && ((SourceData_Type)jcasType).casFeat_sourceApplication == null)
      jcasType.jcas.throwFeatMissing("sourceApplication", "org.apache.ctakes.typesystem.type.structured.SourceData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceData_Type)jcasType).casFeatCode_sourceApplication, v);}    
  }

    
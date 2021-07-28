

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


/** Can specify the full path to a document source. Useful for directory retention.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class DocumentPath extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentPath.class);
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
  protected DocumentPath() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DocumentPath(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentPath(JCas jcas) {
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
  //* Feature: documentPath

  /** getter for documentPath - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentPath() {
    if (DocumentPath_Type.featOkTst && ((DocumentPath_Type)jcasType).casFeat_documentPath == null)
      jcasType.jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentPath_Type)jcasType).casFeatCode_documentPath);}
    
  /** setter for documentPath - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentPath(String v) {
    if (DocumentPath_Type.featOkTst && ((DocumentPath_Type)jcasType).casFeat_documentPath == null)
      jcasType.jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentPath_Type)jcasType).casFeatCode_documentPath, v);}    
  }

    


/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.textspan;

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

import org.apache.uima.jcas.tcas.Annotation;


/** A section of a clinical text, e.g., Diagnosis, Current Medications, Problem List.  Different segments often have differing sublanguages and clinical relevance.     
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Segment
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class Segment extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Segment.class);
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
  protected Segment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Segment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Segment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Segment(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textspan.Segment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Segment_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.apache.ctakes.typesystem.type.textspan.Segment");
    jcasType.ll_cas.ll_setStringValue(addr, ((Segment_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: preferredText

  /** getter for preferredText - gets preferredText is the normalized/resolved section name.  Normally, this is populated by the Sectionizer and would contain the HL7/CCDA section name.
   * @generated
   * @return value of the feature 
   */
  public String getPreferredText() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Segment_Type)jcasType).casFeatCode_preferredText);}
    
  /** setter for preferredText - sets preferredText is the normalized/resolved section name.  Normally, this is populated by the Sectionizer and would contain the HL7/CCDA section name. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPreferredText(String v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_preferredText == null)
      jcasType.jcas.throwFeatMissing("preferredText", "org.apache.ctakes.typesystem.type.textspan.Segment");
    jcasType.ll_cas.ll_setStringValue(addr, ((Segment_Type)jcasType).casFeatCode_preferredText, v);}    
  }

    
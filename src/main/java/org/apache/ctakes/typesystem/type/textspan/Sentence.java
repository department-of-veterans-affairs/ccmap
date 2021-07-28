

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


/** Sentences may or may not be fully-formed and grammatical.  They form the unit of analysis for some downstream components (e.g., constituency parsers).
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Sentence
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Sentence(JCas jcas, int begin, int end) {
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
  //* Feature: sentenceNumber

  /** getter for sentenceNumber - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentenceNumber() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceNumber == null)
      jcasType.jcas.throwFeatMissing("sentenceNumber", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceNumber);}
    
  /** setter for sentenceNumber - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceNumber(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceNumber == null)
      jcasType.jcas.throwFeatMissing("sentenceNumber", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceNumber, v);}    
   
    
  //*--------------*
  //* Feature: segmentId

  /** getter for segmentId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSegmentId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_segmentId == null)
      jcasType.jcas.throwFeatMissing("segmentId", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_segmentId);}
    
  /** setter for segmentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSegmentId(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_segmentId == null)
      jcasType.jcas.throwFeatMissing("segmentId", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_segmentId, v);}    
  }

    


/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package gov.va.vinci.leo.sentence.types;

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


/** Sentence Type
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class AnchoredSentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnchoredSentence.class);
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
  protected AnchoredSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnchoredSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnchoredSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnchoredSentence(JCas jcas, int begin, int end) {
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
  //* Feature: Anchor

  /** getter for Anchor - gets Anchor Annotation around which the sentence was created
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnchor() {
    if (AnchoredSentence_Type.featOkTst && ((AnchoredSentence_Type)jcasType).casFeat_Anchor == null)
      jcasType.jcas.throwFeatMissing("Anchor", "gov.va.vinci.leo.sentence.types.AnchoredSentence");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnchoredSentence_Type)jcasType).casFeatCode_Anchor)));}
    
  /** setter for Anchor - sets Anchor Annotation around which the sentence was created 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor(Annotation v) {
    if (AnchoredSentence_Type.featOkTst && ((AnchoredSentence_Type)jcasType).casFeat_Anchor == null)
      jcasType.jcas.throwFeatMissing("Anchor", "gov.va.vinci.leo.sentence.types.AnchoredSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnchoredSentence_Type)jcasType).casFeatCode_Anchor, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
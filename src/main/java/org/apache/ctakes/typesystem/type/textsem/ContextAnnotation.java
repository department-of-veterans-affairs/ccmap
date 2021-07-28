

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.textsem;

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



/** Contextual information of an entity. Equivalent to cTAKES: edu.mayo.bmi.uima.context.type.ContextAnnotation
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class ContextAnnotation extends IdentifiedAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ContextAnnotation.class);
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
  protected ContextAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ContextAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ContextAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ContextAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: FocusText

  /** getter for FocusText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFocusText() {
    if (ContextAnnotation_Type.featOkTst && ((ContextAnnotation_Type)jcasType).casFeat_FocusText == null)
      jcasType.jcas.throwFeatMissing("FocusText", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ContextAnnotation_Type)jcasType).casFeatCode_FocusText);}
    
  /** setter for FocusText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFocusText(String v) {
    if (ContextAnnotation_Type.featOkTst && ((ContextAnnotation_Type)jcasType).casFeat_FocusText == null)
      jcasType.jcas.throwFeatMissing("FocusText", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ContextAnnotation_Type)jcasType).casFeatCode_FocusText, v);}    
   
    
  //*--------------*
  //* Feature: Scope

  /** getter for Scope - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScope() {
    if (ContextAnnotation_Type.featOkTst && ((ContextAnnotation_Type)jcasType).casFeat_Scope == null)
      jcasType.jcas.throwFeatMissing("Scope", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ContextAnnotation_Type)jcasType).casFeatCode_Scope);}
    
  /** setter for Scope - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScope(String v) {
    if (ContextAnnotation_Type.featOkTst && ((ContextAnnotation_Type)jcasType).casFeat_Scope == null)
      jcasType.jcas.throwFeatMissing("Scope", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ContextAnnotation_Type)jcasType).casFeatCode_Scope, v);}    
  }

    
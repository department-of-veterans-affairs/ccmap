

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.refsem;

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



/** A normalized form for Time annotations.  Inherits from Element, but some fields may be unused.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class Time extends Element {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Time.class);
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
  protected Time() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Time(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Time(JCas jcas) {
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
  //* Feature: normalizedForm

  /** getter for normalizedForm - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNormalizedForm() {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_normalizedForm == null)
      jcasType.jcas.throwFeatMissing("normalizedForm", "org.apache.ctakes.typesystem.type.refsem.Time");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Time_Type)jcasType).casFeatCode_normalizedForm);}
    
  /** setter for normalizedForm - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNormalizedForm(String v) {
    if (Time_Type.featOkTst && ((Time_Type)jcasType).casFeat_normalizedForm == null)
      jcasType.jcas.throwFeatMissing("normalizedForm", "org.apache.ctakes.typesystem.type.refsem.Time");
    jcasType.ll_cas.ll_setStringValue(addr, ((Time_Type)jcasType).casFeatCode_normalizedForm, v);}    
  }

    
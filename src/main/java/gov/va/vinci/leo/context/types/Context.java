

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package gov.va.vinci.leo.context.types;

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


/** 
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class Context extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Context.class);
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
  protected Context() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Context(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Context(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Context(JCas jcas, int begin, int end) {
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
  //* Feature: Experiencer

  /** getter for Experiencer - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExperiencer() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_Experiencer);}
    
  /** setter for Experiencer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencer(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: ExperiencerPattern

  /** getter for ExperiencerPattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExperiencerPattern() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_ExperiencerPattern == null)
      jcasType.jcas.throwFeatMissing("ExperiencerPattern", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_ExperiencerPattern);}
    
  /** setter for ExperiencerPattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencerPattern(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_ExperiencerPattern == null)
      jcasType.jcas.throwFeatMissing("ExperiencerPattern", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_ExperiencerPattern, v);}    
   
    
  //*--------------*
  //* Feature: Negation

  /** getter for Negation - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegation() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_Negation);}
    
  /** setter for Negation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegation(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_Negation, v);}    
   
    
  //*--------------*
  //* Feature: NegationPattern

  /** getter for NegationPattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNegationPattern() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_NegationPattern == null)
      jcasType.jcas.throwFeatMissing("NegationPattern", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_NegationPattern);}
    
  /** setter for NegationPattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegationPattern(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_NegationPattern == null)
      jcasType.jcas.throwFeatMissing("NegationPattern", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_NegationPattern, v);}    
   
    
  //*--------------*
  //* Feature: Temporality

  /** getter for Temporality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTemporality() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_Temporality);}
    
  /** setter for Temporality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporality(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_Temporality, v);}    
   
    
  //*--------------*
  //* Feature: TemporalityPattern

  /** getter for TemporalityPattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTemporalityPattern() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_TemporalityPattern == null)
      jcasType.jcas.throwFeatMissing("TemporalityPattern", "gov.va.vinci.leo.context.types.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_TemporalityPattern);}
    
  /** setter for TemporalityPattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporalityPattern(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_TemporalityPattern == null)
      jcasType.jcas.throwFeatMissing("TemporalityPattern", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_TemporalityPattern, v);}    
   
    
  //*--------------*
  //* Feature: Window

  /** getter for Window - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getWindow() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Window == null)
      jcasType.jcas.throwFeatMissing("Window", "gov.va.vinci.leo.context.types.Context");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Context_Type)jcasType).casFeatCode_Window)));}
    
  /** setter for Window - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWindow(Annotation v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_Window == null)
      jcasType.jcas.throwFeatMissing("Window", "gov.va.vinci.leo.context.types.Context");
    jcasType.ll_cas.ll_setRefValue(addr, ((Context_Type)jcasType).casFeatCode_Window, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
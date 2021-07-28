

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

import org.apache.ctakes.typesystem.type.relation.Relation;


/** Predicate-argument structure used for semantic role labeling output.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class SemanticRoleRelation extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SemanticRoleRelation.class);
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
  protected SemanticRoleRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SemanticRoleRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SemanticRoleRelation(JCas jcas) {
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
  //* Feature: predicate

  /** getter for predicate - gets 
   * @generated
   * @return value of the feature 
   */
  public Predicate getPredicate() {
    if (SemanticRoleRelation_Type.featOkTst && ((SemanticRoleRelation_Type)jcasType).casFeat_predicate == null)
      jcasType.jcas.throwFeatMissing("predicate", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    return (Predicate)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticRoleRelation_Type)jcasType).casFeatCode_predicate)));}
    
  /** setter for predicate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPredicate(Predicate v) {
    if (SemanticRoleRelation_Type.featOkTst && ((SemanticRoleRelation_Type)jcasType).casFeat_predicate == null)
      jcasType.jcas.throwFeatMissing("predicate", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticRoleRelation_Type)jcasType).casFeatCode_predicate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: argument

  /** getter for argument - gets 
   * @generated
   * @return value of the feature 
   */
  public SemanticArgument getArgument() {
    if (SemanticRoleRelation_Type.featOkTst && ((SemanticRoleRelation_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    return (SemanticArgument)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticRoleRelation_Type)jcasType).casFeatCode_argument)));}
    
  /** setter for argument - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgument(SemanticArgument v) {
    if (SemanticRoleRelation_Type.featOkTst && ((SemanticRoleRelation_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticRoleRelation_Type)jcasType).casFeatCode_argument, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
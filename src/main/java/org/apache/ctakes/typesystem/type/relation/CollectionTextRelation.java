

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.relation;

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

import org.apache.uima.jcas.cas.FSList;


/** 
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class CollectionTextRelation extends Relation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CollectionTextRelation.class);
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
  protected CollectionTextRelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CollectionTextRelation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CollectionTextRelation(JCas jcas) {
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
  //* Feature: members

  /** getter for members - gets A super-type for relationships between multiple spans of text.
   * @generated
   * @return value of the feature 
   */
  public FSList getMembers() {
    if (CollectionTextRelation_Type.featOkTst && ((CollectionTextRelation_Type)jcasType).casFeat_members == null)
      jcasType.jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CollectionTextRelation_Type)jcasType).casFeatCode_members)));}
    
  /** setter for members - sets A super-type for relationships between multiple spans of text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMembers(FSList v) {
    if (CollectionTextRelation_Type.featOkTst && ((CollectionTextRelation_Type)jcasType).casFeat_members == null)
      jcasType.jcas.throwFeatMissing("members", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation");
    jcasType.ll_cas.ll_setRefValue(addr, ((CollectionTextRelation_Type)jcasType).casFeatCode_members, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    
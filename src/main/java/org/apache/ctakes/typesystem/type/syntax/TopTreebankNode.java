

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.syntax;

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

import org.apache.uima.jcas.cas.FSArray;


/** A Penn Treebank Node; as the top node, this stores the whole subsumed sentence's parse tree as a string.  It also stores all the terminals, allowing for traversal of the tree bottom-up (top-down is implied through the TreebankNode's 'children' attribute).
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class TopTreebankNode extends TreebankNode {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopTreebankNode.class);
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
  protected TopTreebankNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopTreebankNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopTreebankNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TopTreebankNode(JCas jcas, int begin, int end) {
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
  //* Feature: treebankParse

  /** getter for treebankParse - gets A bracketed sentence string representing the parse tree.
   * @generated
   * @return value of the feature 
   */
  public String getTreebankParse() {
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_treebankParse == null)
      jcasType.jcas.throwFeatMissing("treebankParse", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_treebankParse);}
    
  /** setter for treebankParse - sets A bracketed sentence string representing the parse tree. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTreebankParse(String v) {
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_treebankParse == null)
      jcasType.jcas.throwFeatMissing("treebankParse", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_treebankParse, v);}    
   
    
  //*--------------*
  //* Feature: terminals

  /** getter for terminals - gets Stores the terminal nodes of the parse tree.  This allows for bottom-up traversal of a tree.
   * @generated
   * @return value of the feature 
   */
  public FSArray getTerminals() {
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_terminals == null)
      jcasType.jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals)));}
    
  /** setter for terminals - sets Stores the terminal nodes of the parse tree.  This allows for bottom-up traversal of a tree. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerminals(FSArray v) {
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_terminals == null)
      jcasType.jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for terminals - gets an indexed value - Stores the terminal nodes of the parse tree.  This allows for bottom-up traversal of a tree.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TerminalTreebankNode getTerminals(int i) {
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_terminals == null)
      jcasType.jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals), i);
    return (TerminalTreebankNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals), i)));}

  /** indexed setter for terminals - sets an indexed value - Stores the terminal nodes of the parse tree.  This allows for bottom-up traversal of a tree.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTerminals(int i, TerminalTreebankNode v) { 
    if (TopTreebankNode_Type.featOkTst && ((TopTreebankNode_Type)jcasType).casFeat_terminals == null)
      jcasType.jcas.throwFeatMissing("terminals", "org.apache.ctakes.typesystem.type.syntax.TopTreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TopTreebankNode_Type)jcasType).casFeatCode_terminals), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    


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
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** A Penn Treebank-style tree node.  Conforms to PTB 2.0 guidelines.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class TreebankNode extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TreebankNode.class);
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
  protected TreebankNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TreebankNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TreebankNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TreebankNode(JCas jcas, int begin, int end) {
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
  //* Feature: nodeType

  /** getter for nodeType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNodeType() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeType == null)
      jcasType.jcas.throwFeatMissing("nodeType", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeType);}
    
  /** setter for nodeType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodeType(String v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeType == null)
      jcasType.jcas.throwFeatMissing("nodeType", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeType, v);}    
   
    
  //*--------------*
  //* Feature: nodeValue

  /** getter for nodeValue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNodeValue() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeValue == null)
      jcasType.jcas.throwFeatMissing("nodeValue", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeValue);}
    
  /** setter for nodeValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodeValue(String v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeValue == null)
      jcasType.jcas.throwFeatMissing("nodeValue", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setStringValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeValue, v);}    
   
    
  //*--------------*
  //* Feature: leaf

  /** getter for leaf - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getLeaf() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_leaf == null)
      jcasType.jcas.throwFeatMissing("leaf", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_leaf);}
    
  /** setter for leaf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLeaf(boolean v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_leaf == null)
      jcasType.jcas.throwFeatMissing("leaf", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_leaf, v);}    
   
    
  //*--------------*
  //* Feature: parent

  /** getter for parent - gets 
   * @generated
   * @return value of the feature 
   */
  public TreebankNode getParent() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return (TreebankNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_parent)));}
    
  /** setter for parent - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParent(TreebankNode v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_parent == null)
      jcasType.jcas.throwFeatMissing("parent", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_parent, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: children

  /** getter for children - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getChildren() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children)));}
    
  /** setter for children - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChildren(FSArray v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for children - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TreebankNode getChildren(int i) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children), i);
    return (TreebankNode)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children), i)));}

  /** indexed setter for children - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setChildren(int i, TreebankNode v) { 
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_children), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nodeTags

  /** getter for nodeTags - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getNodeTags() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeTags == null)
      jcasType.jcas.throwFeatMissing("nodeTags", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags)));}
    
  /** setter for nodeTags - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNodeTags(StringArray v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeTags == null)
      jcasType.jcas.throwFeatMissing("nodeTags", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for nodeTags - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getNodeTags(int i) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeTags == null)
      jcasType.jcas.throwFeatMissing("nodeTags", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags), i);}

  /** indexed setter for nodeTags - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNodeTags(int i, String v) { 
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_nodeTags == null)
      jcasType.jcas.throwFeatMissing("nodeTags", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_nodeTags), i, v);}
   
    
  //*--------------*
  //* Feature: headIndex

  /** getter for headIndex - gets The head index tracks the index into the word tokens which is the syntactic head of a phrase.
   * @generated
   * @return value of the feature 
   */
  public int getHeadIndex() {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_headIndex == null)
      jcasType.jcas.throwFeatMissing("headIndex", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_headIndex);}
    
  /** setter for headIndex - sets The head index tracks the index into the word tokens which is the syntactic head of a phrase. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeadIndex(int v) {
    if (TreebankNode_Type.featOkTst && ((TreebankNode_Type)jcasType).casFeat_headIndex == null)
      jcasType.jcas.throwFeatMissing("headIndex", "org.apache.ctakes.typesystem.type.syntax.TreebankNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TreebankNode_Type)jcasType).casFeatCode_headIndex, v);}    
  }

    
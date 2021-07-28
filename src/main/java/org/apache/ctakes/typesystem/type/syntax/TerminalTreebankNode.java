

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



/** A Penn Treebank Node; as a terminal, there is an associated word, and the index of the word is a feature.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * XML source: C:/Users/VHE850~1/AppData/Local/Temp/8/leoTypeDescription_c71c182f-9ec7-4684-a4d3-7b8513f9b7554711191399564954438.xml
 * @generated */
public class TerminalTreebankNode extends TreebankNode {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TerminalTreebankNode.class);
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
  protected TerminalTreebankNode() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TerminalTreebankNode(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TerminalTreebankNode(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TerminalTreebankNode(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets The index of this node in the top node's list of terminals.
   * @generated
   * @return value of the feature 
   */
  public int getIndex() {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets The index of this node in the top node's list of terminals. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_index, v);}    
   
    
  //*--------------*
  //* Feature: tokenIndex

  /** getter for tokenIndex - gets The tokenIndex of a terminal is n, where the terminal is the nth token in a sentence.  The value -1 means that this terminal does not correspond to a token (because it is a trace.)  We assume that each token corresponds to a terminal.
   * @generated
   * @return value of the feature 
   */
  public int getTokenIndex() {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_tokenIndex == null)
      jcasType.jcas.throwFeatMissing("tokenIndex", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_tokenIndex);}
    
  /** setter for tokenIndex - sets The tokenIndex of a terminal is n, where the terminal is the nth token in a sentence.  The value -1 means that this terminal does not correspond to a token (because it is a trace.)  We assume that each token corresponds to a terminal. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenIndex(int v) {
    if (TerminalTreebankNode_Type.featOkTst && ((TerminalTreebankNode_Type)jcasType).casFeat_tokenIndex == null)
      jcasType.jcas.throwFeatMissing("tokenIndex", "org.apache.ctakes.typesystem.type.syntax.TerminalTreebankNode");
    jcasType.ll_cas.ll_setIntValue(addr, ((TerminalTreebankNode_Type)jcasType).casFeatCode_tokenIndex, v);}    
  }

    
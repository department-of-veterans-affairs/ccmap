
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
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A super-type for relationships between two spans of text.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class BinaryTextRelation_Type extends Relation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BinaryTextRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
 
  /** @generated */
  final Feature casFeat_arg1;
  /** @generated */
  final int     casFeatCode_arg1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getArg1(int addr) {
        if (featOkTst && casFeat_arg1 == null)
      jcas.throwFeatMissing("arg1", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_arg1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArg1(int addr, int v) {
        if (featOkTst && casFeat_arg1 == null)
      jcas.throwFeatMissing("arg1", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_arg1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_arg2;
  /** @generated */
  final int     casFeatCode_arg2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getArg2(int addr) {
        if (featOkTst && casFeat_arg2 == null)
      jcas.throwFeatMissing("arg2", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_arg2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArg2(int addr, int v) {
        if (featOkTst && casFeat_arg2 == null)
      jcas.throwFeatMissing("arg2", "org.apache.ctakes.typesystem.type.relation.BinaryTextRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_arg2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public BinaryTextRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_arg1 = jcas.getRequiredFeatureDE(casType, "arg1", "org.apache.ctakes.typesystem.type.relation.RelationArgument", featOkTst);
    casFeatCode_arg1  = (null == casFeat_arg1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_arg1).getCode();

 
    casFeat_arg2 = jcas.getRequiredFeatureDE(casType, "arg2", "org.apache.ctakes.typesystem.type.relation.RelationArgument", featOkTst);
    casFeatCode_arg2  = (null == casFeat_arg2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_arg2).getCode();

  }
}



    
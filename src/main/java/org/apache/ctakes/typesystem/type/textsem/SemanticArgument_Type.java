
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
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** SemanticArguments are used for predicate-argument structures (SemanticRoleRelations).  The "label" features should contain the type of semantic role (e.g., ARG0, ARGM) that this argument has w.r.t. the predicate.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class SemanticArgument_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SemanticArgument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.SemanticArgument");
 
  /** @generated */
  final Feature casFeat_relation;
  /** @generated */
  final int     casFeatCode_relation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRelation(int addr) {
        if (featOkTst && casFeat_relation == null)
      jcas.throwFeatMissing("relation", "org.apache.ctakes.typesystem.type.textsem.SemanticArgument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_relation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRelation(int addr, int v) {
        if (featOkTst && casFeat_relation == null)
      jcas.throwFeatMissing("relation", "org.apache.ctakes.typesystem.type.textsem.SemanticArgument");
    ll_cas.ll_setRefValue(addr, casFeatCode_relation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_label;
  /** @generated */
  final int     casFeatCode_label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.apache.ctakes.typesystem.type.textsem.SemanticArgument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_label == null)
      jcas.throwFeatMissing("label", "org.apache.ctakes.typesystem.type.textsem.SemanticArgument");
    ll_cas.ll_setStringValue(addr, casFeatCode_label, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SemanticArgument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_relation = jcas.getRequiredFeatureDE(casType, "relation", "org.apache.ctakes.typesystem.type.textsem.SemanticRoleRelation", featOkTst);
    casFeatCode_relation  = (null == casFeat_relation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relation).getCode();

 
    casFeat_label = jcas.getRequiredFeatureDE(casType, "label", "uima.cas.String", featOkTst);
    casFeatCode_label  = (null == casFeat_label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_label).getCode();

  }
}



    
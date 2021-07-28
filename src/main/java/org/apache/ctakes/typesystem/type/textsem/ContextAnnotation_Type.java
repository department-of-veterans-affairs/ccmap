
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

/** Contextual information of an entity. Equivalent to cTAKES: edu.mayo.bmi.uima.context.type.ContextAnnotation
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class ContextAnnotation_Type extends IdentifiedAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ContextAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
 
  /** @generated */
  final Feature casFeat_FocusText;
  /** @generated */
  final int     casFeatCode_FocusText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFocusText(int addr) {
        if (featOkTst && casFeat_FocusText == null)
      jcas.throwFeatMissing("FocusText", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_FocusText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFocusText(int addr, String v) {
        if (featOkTst && casFeat_FocusText == null)
      jcas.throwFeatMissing("FocusText", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_FocusText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Scope;
  /** @generated */
  final int     casFeatCode_Scope;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScope(int addr) {
        if (featOkTst && casFeat_Scope == null)
      jcas.throwFeatMissing("Scope", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Scope);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScope(int addr, String v) {
        if (featOkTst && casFeat_Scope == null)
      jcas.throwFeatMissing("Scope", "org.apache.ctakes.typesystem.type.textsem.ContextAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Scope, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ContextAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_FocusText = jcas.getRequiredFeatureDE(casType, "FocusText", "uima.cas.String", featOkTst);
    casFeatCode_FocusText  = (null == casFeat_FocusText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_FocusText).getCode();

 
    casFeat_Scope = jcas.getRequiredFeatureDE(casType, "Scope", "uima.cas.String", featOkTst);
    casFeatCode_Scope  = (null == casFeat_Scope) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Scope).getCode();

  }
}



    
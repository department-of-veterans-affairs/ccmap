
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
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Differentiates a token as being a number rather than a punctuation, symbol, newline, word, or contraction. 
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.NumToken
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class NumToken_Type extends BaseToken_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NumToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.NumToken");
 
  /** @generated */
  final Feature casFeat_numType;
  /** @generated */
  final int     casFeatCode_numType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNumType(int addr) {
        if (featOkTst && casFeat_numType == null)
      jcas.throwFeatMissing("numType", "org.apache.ctakes.typesystem.type.syntax.NumToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumType(int addr, int v) {
        if (featOkTst && casFeat_numType == null)
      jcas.throwFeatMissing("numType", "org.apache.ctakes.typesystem.type.syntax.NumToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_numType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public NumToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_numType = jcas.getRequiredFeatureDE(casType, "numType", "uima.cas.Integer", featOkTst);
    casFeatCode_numType  = (null == casFeat_numType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numType).getCode();

  }
}



    
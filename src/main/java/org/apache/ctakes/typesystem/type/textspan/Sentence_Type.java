
/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.textspan;

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

/** Sentences may or may not be fully-formed and grammatical.  They form the unit of analysis for some downstream components (e.g., constituency parsers).
Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.Sentence
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textspan.Sentence");
 
  /** @generated */
  final Feature casFeat_sentenceNumber;
  /** @generated */
  final int     casFeatCode_sentenceNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceNumber(int addr) {
        if (featOkTst && casFeat_sentenceNumber == null)
      jcas.throwFeatMissing("sentenceNumber", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentenceNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceNumber(int addr, int v) {
        if (featOkTst && casFeat_sentenceNumber == null)
      jcas.throwFeatMissing("sentenceNumber", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentenceNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_segmentId;
  /** @generated */
  final int     casFeatCode_segmentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSegmentId(int addr) {
        if (featOkTst && casFeat_segmentId == null)
      jcas.throwFeatMissing("segmentId", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_segmentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSegmentId(int addr, String v) {
        if (featOkTst && casFeat_segmentId == null)
      jcas.throwFeatMissing("segmentId", "org.apache.ctakes.typesystem.type.textspan.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_segmentId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentenceNumber = jcas.getRequiredFeatureDE(casType, "sentenceNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_sentenceNumber  = (null == casFeat_sentenceNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentenceNumber).getCode();

 
    casFeat_segmentId = jcas.getRequiredFeatureDE(casType, "segmentId", "uima.cas.String", featOkTst);
    casFeatCode_segmentId  = (null == casFeat_segmentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_segmentId).getCode();

  }
}



    
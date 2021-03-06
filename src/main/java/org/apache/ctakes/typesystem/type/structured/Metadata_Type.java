
/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.structured;

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
import org.apache.uima.jcas.cas.TOP_Type;

/** Structured data that captures information about the document, patient, or context of the clinical text.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class Metadata_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Metadata.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.Metadata");
 
  /** @generated */
  final Feature casFeat_patientID;
  /** @generated */
  final int     casFeatCode_patientID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getPatientID(int addr) {
        if (featOkTst && casFeat_patientID == null)
      jcas.throwFeatMissing("patientID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    return ll_cas.ll_getLongValue(addr, casFeatCode_patientID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPatientID(int addr, long v) {
        if (featOkTst && casFeat_patientID == null)
      jcas.throwFeatMissing("patientID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    ll_cas.ll_setLongValue(addr, casFeatCode_patientID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_providerID;
  /** @generated */
  final int     casFeatCode_providerID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getProviderID(int addr) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_providerID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProviderID(int addr, int v) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_providerID, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public long getProviderID(int addr, int i) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
	return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setProviderID(int addr, int i, long v) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "org.apache.ctakes.typesystem.type.structured.Metadata");
    if (lowLevelTypeChecks)
      ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
    ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_sourceData;
  /** @generated */
  final int     casFeatCode_sourceData;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSourceData(int addr) {
        if (featOkTst && casFeat_sourceData == null)
      jcas.throwFeatMissing("sourceData", "org.apache.ctakes.typesystem.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sourceData);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSourceData(int addr, int v) {
        if (featOkTst && casFeat_sourceData == null)
      jcas.throwFeatMissing("sourceData", "org.apache.ctakes.typesystem.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_sourceData, v);}
    
  
 
  /** @generated */
  final Feature casFeat_demographics;
  /** @generated */
  final int     casFeatCode_demographics;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDemographics(int addr) {
        if (featOkTst && casFeat_demographics == null)
      jcas.throwFeatMissing("demographics", "org.apache.ctakes.typesystem.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_demographics);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDemographics(int addr, int v) {
        if (featOkTst && casFeat_demographics == null)
      jcas.throwFeatMissing("demographics", "org.apache.ctakes.typesystem.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_demographics, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Metadata_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_patientID = jcas.getRequiredFeatureDE(casType, "patientID", "uima.cas.Long", featOkTst);
    casFeatCode_patientID  = (null == casFeat_patientID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_patientID).getCode();

 
    casFeat_providerID = jcas.getRequiredFeatureDE(casType, "providerID", "uima.cas.LongArray", featOkTst);
    casFeatCode_providerID  = (null == casFeat_providerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_providerID).getCode();

 
    casFeat_sourceData = jcas.getRequiredFeatureDE(casType, "sourceData", "org.apache.ctakes.typesystem.type.structured.SourceData", featOkTst);
    casFeatCode_sourceData  = (null == casFeat_sourceData) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceData).getCode();

 
    casFeat_demographics = jcas.getRequiredFeatureDE(casType, "demographics", "org.apache.ctakes.typesystem.type.structured.Demographics", featOkTst);
    casFeatCode_demographics  = (null == casFeat_demographics) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_demographics).getCode();

  }
}



    
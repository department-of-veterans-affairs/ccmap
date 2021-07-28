
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

/** Equivalent to cTAKES: org.apache.ctakes.typesystem.type.DocumentID, but its supertype changed to uima.cas.TOP
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class DocumentID_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentID.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.DocumentID");
 
  /** @generated */
  final Feature casFeat_documentID;
  /** @generated */
  final int     casFeatCode_documentID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentID(int addr) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "org.apache.ctakes.typesystem.type.structured.DocumentID");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentID(int addr, String v) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "org.apache.ctakes.typesystem.type.structured.DocumentID");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentID_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentID = jcas.getRequiredFeatureDE(casType, "documentID", "uima.cas.String", featOkTst);
    casFeatCode_documentID  = (null == casFeat_documentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentID).getCode();

  }
}



    
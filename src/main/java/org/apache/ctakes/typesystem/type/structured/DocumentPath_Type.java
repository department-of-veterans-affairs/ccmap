
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

/** Can specify the full path to a document source. Useful for directory retention.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class DocumentPath_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DocumentPath.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.structured.DocumentPath");
 
  /** @generated */
  final Feature casFeat_documentPath;
  /** @generated */
  final int     casFeatCode_documentPath;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDocumentPath(int addr) {
        if (featOkTst && casFeat_documentPath == null)
      jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentPath);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDocumentPath(int addr, String v) {
        if (featOkTst && casFeat_documentPath == null)
      jcas.throwFeatMissing("documentPath", "org.apache.ctakes.typesystem.type.structured.DocumentPath");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentPath, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DocumentPath_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentPath = jcas.getRequiredFeatureDE(casType, "documentPath", "uima.cas.String", featOkTst);
    casFeatCode_documentPath  = (null == casFeat_documentPath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentPath).getCode();

  }
}



    
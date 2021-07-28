
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Chunks are syntactic groupings of tokens, and are the results of a shallow parser (chunker).  Possible chunkTypes follow Penn Treebank guidelines, e.g., noun phrase (NP) or prepositional phrase (PP) 
Equivalent to cTAKES: edu.mayo.bmi.uima.chunker.type.Chunk
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class Chunk_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Chunk.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.syntax.Chunk");
 
  /** @generated */
  final Feature casFeat_chunkType;
  /** @generated */
  final int     casFeatCode_chunkType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChunkType(int addr) {
        if (featOkTst && casFeat_chunkType == null)
      jcas.throwFeatMissing("chunkType", "org.apache.ctakes.typesystem.type.syntax.Chunk");
    return ll_cas.ll_getStringValue(addr, casFeatCode_chunkType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChunkType(int addr, String v) {
        if (featOkTst && casFeat_chunkType == null)
      jcas.throwFeatMissing("chunkType", "org.apache.ctakes.typesystem.type.syntax.Chunk");
    ll_cas.ll_setStringValue(addr, casFeatCode_chunkType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Chunk_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_chunkType = jcas.getRequiredFeatureDE(casType, "chunkType", "uima.cas.String", featOkTst);
    casFeatCode_chunkType  = (null == casFeat_chunkType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_chunkType).getCode();

  }
}



    
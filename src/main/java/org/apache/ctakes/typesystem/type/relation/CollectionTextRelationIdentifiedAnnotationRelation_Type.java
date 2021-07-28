
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

/** A relation between a chain relation and an identified annotation mention. Useful for relating a new mention to a collection of previous mentions, e.g., in coreference resolution.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class CollectionTextRelationIdentifiedAnnotationRelation_Type extends Relation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = CollectionTextRelationIdentifiedAnnotationRelation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
 
  /** @generated */
  final Feature casFeat_cluster;
  /** @generated */
  final int     casFeatCode_cluster;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCluster(int addr) {
        if (featOkTst && casFeat_cluster == null)
      jcas.throwFeatMissing("cluster", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_cluster);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCluster(int addr, int v) {
        if (featOkTst && casFeat_cluster == null)
      jcas.throwFeatMissing("cluster", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_cluster, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mention;
  /** @generated */
  final int     casFeatCode_mention;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMention(int addr) {
        if (featOkTst && casFeat_mention == null)
      jcas.throwFeatMissing("mention", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mention);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMention(int addr, int v) {
        if (featOkTst && casFeat_mention == null)
      jcas.throwFeatMissing("mention", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelationIdentifiedAnnotationRelation");
    ll_cas.ll_setRefValue(addr, casFeatCode_mention, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public CollectionTextRelationIdentifiedAnnotationRelation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_cluster = jcas.getRequiredFeatureDE(casType, "cluster", "org.apache.ctakes.typesystem.type.relation.CollectionTextRelation", featOkTst);
    casFeatCode_cluster  = (null == casFeat_cluster) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cluster).getCode();

 
    casFeat_mention = jcas.getRequiredFeatureDE(casType, "mention", "org.apache.ctakes.typesystem.type.textsem.IdentifiedAnnotation", featOkTst);
    casFeatCode_mention  = (null == casFeat_mention) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mention).getCode();

  }
}



    
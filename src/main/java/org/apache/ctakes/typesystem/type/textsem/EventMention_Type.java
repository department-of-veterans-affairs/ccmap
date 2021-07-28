
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

/** A text string (IdentifiedAnnotation) that refers to an Event.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class EventMention_Type extends IdentifiedAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EventMention.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.textsem.EventMention");
 
  /** @generated */
  final Feature casFeat_event;
  /** @generated */
  final int     casFeatCode_event;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEvent(int addr) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.apache.ctakes.typesystem.type.textsem.EventMention");
    return ll_cas.ll_getRefValue(addr, casFeatCode_event);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvent(int addr, int v) {
        if (featOkTst && casFeat_event == null)
      jcas.throwFeatMissing("event", "org.apache.ctakes.typesystem.type.textsem.EventMention");
    ll_cas.ll_setRefValue(addr, casFeatCode_event, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EventMention_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_event = jcas.getRequiredFeatureDE(casType, "event", "org.apache.ctakes.typesystem.type.refsem.Event", featOkTst);
    casFeatCode_event  = (null == casFeat_event) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_event).getCode();

  }
}



    

/* First created by JCasGen Wed Aug 19 22:32:28 CDT 2020 */
package org.apache.ctakes.typesystem.type.refsem;

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

/** A normalized form for dates, namely with day, month, and year.  A subtype of Element but may not use all inherited attributes.
 * Updated by JCasGen Wed Aug 19 22:32:28 CDT 2020
 * @generated */
public class Date_Type extends Element_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Date.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.ctakes.typesystem.type.refsem.Date");
 
  /** @generated */
  final Feature casFeat_day;
  /** @generated */
  final int     casFeatCode_day;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDay(int addr) {
        if (featOkTst && casFeat_day == null)
      jcas.throwFeatMissing("day", "org.apache.ctakes.typesystem.type.refsem.Date");
    return ll_cas.ll_getStringValue(addr, casFeatCode_day);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDay(int addr, String v) {
        if (featOkTst && casFeat_day == null)
      jcas.throwFeatMissing("day", "org.apache.ctakes.typesystem.type.refsem.Date");
    ll_cas.ll_setStringValue(addr, casFeatCode_day, v);}
    
  
 
  /** @generated */
  final Feature casFeat_month;
  /** @generated */
  final int     casFeatCode_month;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMonth(int addr) {
        if (featOkTst && casFeat_month == null)
      jcas.throwFeatMissing("month", "org.apache.ctakes.typesystem.type.refsem.Date");
    return ll_cas.ll_getStringValue(addr, casFeatCode_month);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMonth(int addr, String v) {
        if (featOkTst && casFeat_month == null)
      jcas.throwFeatMissing("month", "org.apache.ctakes.typesystem.type.refsem.Date");
    ll_cas.ll_setStringValue(addr, casFeatCode_month, v);}
    
  
 
  /** @generated */
  final Feature casFeat_year;
  /** @generated */
  final int     casFeatCode_year;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getYear(int addr) {
        if (featOkTst && casFeat_year == null)
      jcas.throwFeatMissing("year", "org.apache.ctakes.typesystem.type.refsem.Date");
    return ll_cas.ll_getStringValue(addr, casFeatCode_year);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setYear(int addr, String v) {
        if (featOkTst && casFeat_year == null)
      jcas.throwFeatMissing("year", "org.apache.ctakes.typesystem.type.refsem.Date");
    ll_cas.ll_setStringValue(addr, casFeatCode_year, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Date_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_day = jcas.getRequiredFeatureDE(casType, "day", "uima.cas.String", featOkTst);
    casFeatCode_day  = (null == casFeat_day) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_day).getCode();

 
    casFeat_month = jcas.getRequiredFeatureDE(casType, "month", "uima.cas.String", featOkTst);
    casFeatCode_month  = (null == casFeat_month) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_month).getCode();

 
    casFeat_year = jcas.getRequiredFeatureDE(casType, "year", "uima.cas.String", featOkTst);
    casFeatCode_year  = (null == casFeat_year) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_year).getCode();

  }
}



    
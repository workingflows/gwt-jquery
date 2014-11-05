/*
 * Copyright 2014 Cristian Rinaldi & Andres Testi.
 *
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
 */
package com.workingflows.js.jquery.client.factory;

import com.google.gwt.dom.client.Element;
import com.workingflows.js.jquery.client.api.Function;
import com.workingflows.js.jquery.client.api.JQueryElement;


/**
 * Fatories for low level creation. 
 * 
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
public class Factories {

    /**
     * Create a native JS function with params and call the function 
     * pased by parameter .
     * 
     * @param f
     * @param params
     * @return 
     */
    public static native Function Fn(Function f, Object... params) /*-{
     return function(){
     return f.f(params);
     };
     }-*/;
    
    /**
     * Obtain a jQuery element from selector param
     * 
     * @param selector
     * @return 
     */
    public static native JQueryElement $(Object selector) /*-{
     return $wnd.$(selector);
     }-*/;
    
    //public static native JQueryElement $(JQueryElement element) /*-{
    // return $wnd.$(element);
    // }-*/;
    
    //public static native JQueryElement $(Element element) /*-{
    // return $wnd.$(element);
    // }-*/;
}

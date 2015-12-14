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
package com.workingflows.js.jquery.client.api;

import com.workingflows.js.jscore.client.api.core.Element;
import com.workingflows.js.jscore.client.api.core.Node;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Represent a JQuery Element.
 *
 * @author Cristian Rinaldi
 */
@JsType(name = "jQuery", isNative = true, namespace = JsPackage.GLOBAL)
public class JQueryElement extends Node {

    public native JQueryElement append(JQueryElement... element);

    public native String html();

    public native String prop(String prop);

    public native JQueryElement data(String key, String value);

    public native JQueryElement text(String text);

    public native JQueryElement[] children(String selector);

    public native void remove();

    public native JQueryElement addClass(String clazz);

    public native JQueryElement removeClass(String clazz);

    public native Object val();

    public native void on(String event, Function fn);

    public native void click(Function fn);

    public native JQueryElement attr(String attr, Object value);

    public native JQueryElement before(JQueryElement element);

    public native JQueryElement prepend(JQueryElement element);

    public native void trigger(String select, Object params);
    
    public native void bind(String name, Object obj, Function f);
    
    public native JQueryElement first();
}

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

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * Represent a JQuery Element
 *
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
@JsType(prototype = "jQuery")
public interface JQueryElement extends Node {

    JQueryElement append(JQueryElement... element);

    @JsProperty
    JQueryElement html();

    JQueryElement data(String key, String value);

    JQueryElement text(String text);

    Object val();

    void on(String event, com.workingflows.js.jscore.client.api.Function<?, ?> fn);

    JQueryElement attr(String attr, Object value);

    public static class Static {

        public static native JQueryElement $(String selector) /*-{
         return $wnd.$(selector);
         }-*/;

        public static native JQueryElement $(JQueryElement element) /*-{
         return $wnd.$(element);
         }-*/;

        public static native JQueryElement $(Node element) /*-{
         return $wnd.$(element);
         }-*/;
    }
}

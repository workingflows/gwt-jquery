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

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.core.Node;

/**
 * Represent a JQuery Element
 *
 *
 * @author Cristian Rinaldi
 */
@JsType(prototype = "jQuery")
public interface JQueryElement extends Node {

    JQueryElement append(JQueryElement... element);

    String html();

    String prop(String prop);

    JQueryElement data(String key, String value);

    JQueryElement text(String text);

    JQueryElement[] children(String selector);

    void remove();

    JQueryElement addClass(String clazz);

    JQueryElement removeClass(String clazz);

    Object val();

    void on(String event, Function fn);

    void click(Function fn);

    JQueryElement attr(String attr, Object value);

    JQueryElement before(JQueryElement element);

    JQueryElement prepend(JQueryElement element);

    public void trigger(String select, Object... params);

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

        public static native JQueryElement $(com.google.gwt.user.client.Element element) /*-{
         return $wnd.$(element);
         }-*/;

        public static native JQueryElement $(com.google.gwt.dom.client.Node element) /*-{
         return $wnd.$(element);
         }-*/;
    }
}

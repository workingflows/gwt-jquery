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
 * Represent a JQuery access model.
 *
 * @author Ben Dol
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class JQuery extends Node {

    public static native JQueryElement $(String selector);

    public static native JQueryElement $(JQuery element);

    public static native JQueryElement $(Node element);

    public static native JQueryElement $(Element element);

    public static native JQueryElement $(com.google.gwt.user.client.Element element);

    public static native JQueryElement $(com.google.gwt.dom.client.Node element);
}

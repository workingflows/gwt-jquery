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

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.user.client.ui.UIObject;
import com.workingflows.js.jquery.client.api.Functions.Func;
import com.workingflows.js.jquery.client.api.Functions.Func2;
import com.workingflows.js.jquery.client.api.Functions.Func3;
import com.workingflows.js.jquery.client.api.Functions.FuncRet2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Represent a JQuery access model.
 *
 * @author Ben Dol
 */
@JsType(isNative = true)
public class JQuery {

    @JsOverlay
    public static Element window() {
        return ScriptInjector.TOP_WINDOW.<Element>cast();
    }

    // Plain Object Query

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Object plainObject);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Object plainObject, Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Object plainObject, com.workingflows.js.jscore.client.api.core.Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Object plainObject, JQueryElement context);

    @JsOverlay
    public static JQueryElement $(Object plainObject, UIObject context) {
        return $(plainObject, context.getElement());
    }

    // String Selector Query

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(String selector);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(String selector, Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(String selector, com.workingflows.js.jscore.client.api.core.Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(String selector, JQueryElement context);

    @JsOverlay
    public static JQueryElement $(String selector, UIObject context) {
        return $(selector, context.getElement());
    }

    // JQueryElement Query

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(JQueryElement element);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(JQueryElement element, Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(JQueryElement element, com.workingflows.js.jscore.client.api.core.Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(JQueryElement element, JQueryElement context);

    @JsOverlay
    public static JQueryElement $(JQueryElement element, UIObject context) {
        return $(element, context.getElement());
    }

    // Element Query

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Element element);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Element element, Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Element element, com.workingflows.js.jscore.client.api.core.Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Element element, JQueryElement context);

    @JsOverlay
    public static JQueryElement $(Element element, UIObject context) {
        return $(element, context.getElement());
    }

    // Node Query

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Node element);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Node element, Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Node element, com.workingflows.js.jscore.client.api.core.Element context);

    @JsMethod(namespace = JsPackage.GLOBAL)
    public static native JQueryElement $(Node element, JQueryElement context);

    @JsOverlay
    public static JQueryElement $(Node element, UIObject context) {
        return $(element, context.getElement());
    }

    // Generic UIObject Query

    @JsOverlay
    @SuppressWarnings("unchecked")
    public static <T extends UIObject> JQueryElement $(T uiObject) {
        return $(uiObject.getElement());
    }

    @JsOverlay
    @SuppressWarnings("unchecked")
    public static <T extends UIObject> JQueryElement<T> $(T uiObject, Element context) {
        return $(uiObject.getElement(), context);
    }

    @JsOverlay
    @SuppressWarnings("unchecked")
    public static <T extends UIObject> JQueryElement<T> $(T uiObject, com.workingflows.js.jscore.client.api.core.Element context) {
        return $(uiObject.getElement(), context);
    }

    @JsOverlay
    @SuppressWarnings("unchecked")
    public static <T extends UIObject> JQueryElement<T> $(T uiObject, JQueryElement context) {
        return $(uiObject.getElement(), context);
    }

    @JsOverlay
    @SuppressWarnings("unchecked")
    public static <T extends UIObject> JQueryElement<T> $(T uiObject, UIObject context) {
        return $(uiObject.getElement(), context.getElement());
    }

    // JQuery Global Functions

    /**
     * Check to see if a DOM element is a descendant of another DOM element.
     * @param container The DOM element that may contain the other element.
     * @param contained The DOM element that may be contained by (a descendant of) the other element.
     * @return returns true if the DOM element provided by the second argument is a descendant of the DOM
     * element provided by the first argument, whether it is a direct child or nested more deeply
     */
    @JsMethod(namespace = "$")
    public static native boolean contains(Element container, Element contained);

    /**
     * Execute the next function on the queue for the matched element.
     * @param element A DOM element from which to remove and execute a queued function.
     */
    @JsMethod(namespace = "$")
    public static native void dequeue(Element element);

    /**
     * Execute the next function on the queue for the matched element.
     * @param element A DOM element from which to remove and execute a queued function.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     */
    @JsMethod(namespace = "$")
    public static native void dequeue(Element element, String queueName);

    /**
     * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays.
     * Arrays and array-like objects with a length property (such as a function's arguments object) are
     * iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
     * @param array The array to iterate over.
     * @param callback The function that will be executed on every object.
     */
    @JsMethod(namespace = "$")
    public static native Object each(Object[] array, Func2<Integer, Object> callback);

    /**
     * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays.
     * Arrays and array-like objects with a length property (such as a function's arguments object) are
     * iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
     * @param object The object to iterate over.
     * @param callback The function that will be executed on every object.
     */
    @JsMethod(namespace = "$")
    public static native Object each(Object object, Func2<Integer, Object> callback);

    /**
     * Takes a string and throws an exception containing it.
     * @param message The message to send out.
     */
    @JsMethod(namespace = "$")
    public static native void error(String message);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     * @param url A string containing the URL to which the request is sent.
     */
    @JsMethod(namespace = "$")
    public static native Object getJSON(String url);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
    @JsMethod(namespace = "$")
    public static native Object getJSON(String url, Func3<Object, String, Object> success);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     */
    @JsMethod(namespace = "$")
    public static native Object getJSON(String url, String data);

    /**
     * Load JSON-encoded data from the server using a GET HTTP request.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds.
     */
    @JsMethod(namespace = "$")
    public static native Object getJSON(String url, String data, Func3<Object, String, Object> success);

    /**
     * Load a JavaScript file from the server using a GET HTTP request, then execute it.
     * @param url A string containing the URL to which the request is sent.
     */
    @JsMethod(namespace = "$")
    public static native Object getScript(String url);

    /**
     * Load a JavaScript file from the server using a GET HTTP request, then execute it.
     * @param url A string containing the URL to which the request is sent.
     * @param success A callback function that is executed if the request succeeds.
     */
    @JsMethod(namespace = "$")
    public static native Object getScript(String url, Func3<Object, String, Object> success);

    /**
     * Execute some JavaScript code globally.
     * @param code The JavaScript code to execute.
     */
    @JsMethod(namespace = "$")
    public static native void globalEval(String code);

    /**
     * Finds the elements of an array which satisfy a filter function. The original array is not affected.
     * @param array The array-like object to search through.
     * @param function The function to process each item against. The first argument to the function is the
     *                 item, and the second argument is the index. The function should return a Boolean value.
     *                 this will be the global window object.
     * @return an array of objects
     */
    @JsMethod(namespace = "$")
    public static native Object[] grep(Object[] array, FuncRet2<Object, Integer> function);

    /**
     * Finds the elements of an array which satisfy a filter function. The original array is not affected.
     * @param array The array-like object to search through.
     * @param function The function to process each item against. The first argument to the function is the
     *                 item, and the second argument is the index. The function should return a Boolean value.
     *                 this will be the global window object.
     * @param invert If "invert" is false, or not provided, then the function returns an array consisting of
     *               all elements for which "callback" returns true. If "invert" is true, then the function
     *               returns an array consisting of all elements for which "callback" returns false.
     * @return an array of objects
     */
    @JsMethod(namespace = "$")
    public static native Object[] grep(Object[] array, FuncRet2<Object, Integer> function, boolean invert);

    /**
     * Determine whether an element has any jQuery data associated with it.
     * @param element A DOM element to be checked for data.
     * @return If no data is associated with an element (there is no data object at all or the data
     * object is empty), the method returns false; otherwise it returns true.
     */
    @JsMethod(namespace = "$")
    public static native boolean hasData(Element element);

    /**
     * Holds or releases the execution of jQuery's ready event.
     * @param hold Indicates whether the ready hold is being requested or released
     */
    @JsMethod(namespace = "$")
    public static native void holdReady(boolean hold);

    /**
     * Search for a specified value within an array and return its index (or -1 if not found).
     * @param value The value to search for.
     * @param array An array through which to search.
     * @return similar to JavaScript's native .indexOf() method in that it returns -1 when it doesn't
     * find a match. If the first element within the array matches value, $.inArray() returns 0.
     */
    @JsMethod(namespace = "$")
    public static native int inArray(Object value, Object[] array);

    /**
     * Search for a specified value within an array and return its index (or -1 if not found).
     * @param value The value to search for.
     * @param array An array through which to search.
     * @param fromIndex The index of the array at which to begin the search. The default is 0,
     *                  which will search the whole array.
     * @return similar to JavaScript's native .indexOf() method in that it returns -1 when it doesn't
     * find a match. If the first element within the array matches value, $.inArray() returns 0.
     */
    @JsMethod(namespace = "$")
    public static native int inArray(Object value, Object[] array, double fromIndex);

    /**
     * Determine whether the argument is an array.
     * @param obj Object to test whether or not it is an array.
     * @return returns a Boolean indicating whether the object is a JavaScript
     * array (not an array-like object, such as a jQuery object).
     */
    @JsMethod(namespace = "$")
    public static native boolean isArray(Object obj);

    /**
     * Check to see if an object is empty (contains no enumerable properties).
     * @param obj The object that will be checked to see if it's empty.
     */
    @JsMethod(namespace = "$")
    public static native boolean isEmptyObject(Object obj);

    /**
     * Determine if the argument passed is a JavaScript function object.
     * @param obj Object to test whether or not it is a function.
     */
    @JsMethod(namespace = "$")
    public static native boolean isFunction(Object obj);

    /**
     * Determines whether its argument is a number.
     * @param value The value to be tested.
     * @return The $.isNumeric() method checks whether its argument represents a numeric value.
     * If so, it returns true. Otherwise it returns false. The argument can be of any type.
     */
    @JsMethod(namespace = "$")
    public static native boolean isNumeric(Object value);

    /**
     * Check to see if an object is a plain object (created using "{}" or "new Object").
     * @param object The object that will be checked to see if it's a plain object.
     */
    @JsMethod(namespace = "$")
    public static native boolean isPlainObject(Object object);

    /**
     * Determine whether the argument is a window. This is used in a number of places in
     * jQuery to determine if we're operating against a browser window
     * (such as the current window or an iframe).
     * @param object Object to test whether or not it is a window.
     */
    @JsMethod(namespace = "$")
    public static native boolean isWindow(Object object);

    /**
     * Check to see if a DOM node is within an XML document (or is an XML document).
     * @param node The DOM node that will be checked to see if it's in an XML document.
     */
    @JsMethod(namespace = "$")
    public static native boolean isXMLDoc(Element node);

    /**
     * Convert an array-like object into a true JavaScript array.
     * @param object Any object to turn into a native Array.
     */
    @JsMethod(namespace = "$")
    public static native Object[] makeArray(Object object);

    /**
     * Translate all items in an array or object to new array of items.
     * @param array The Array to translate.
     * @param callback The function to process each item against. The first argument to the
     *                 function is the array item, the second argument is the index in array
     *                 The function can return any value. A returned array will be flattened
     *                 into the resulting array. Within the function, this refers to the global
     *                 (window) object. Must return an Object type.
     * @return The final mapped array.
     */
    @JsMethod(namespace = "$")
    public static native Object[] map(Object[] array, FuncRet2<Object, Integer> callback);

    /**
     * Translate all items in an array or object to new array of items.
     * @param object The Object to translate.
     * @param callback The function to process each item against. The first argument to the
     *                 function is the array item, the second argument is the index in array
     *                 The function can return any value. A returned array will be flattened
     *                 into the resulting array. Within the function, this refers to the global
     *                 (window) object. Must return an Object type.
     * @return The final mapped array.
     */
    @JsMethod(namespace = "$")
    public static native Object[] map(Object object, FuncRet2<Object, Integer> callback);

    /**
     * Merge the contents of two arrays together into the first array.
     * @param first The first array-like object to merge, the elements of second added.
     * @param second The second array-like object to merge into the first, unaltered.
     * @return The final merged array.
     */
    @JsMethod(namespace = "$")
    public static native Object[] merge(Object[] first, Object[] second);

    /**
     * Relinquish jQuery's control of the $ variable.
     * @param removeAll A Boolean indicating whether to remove all jQuery variables from the
     *                  global scope (including jQuery itself).
     */
    @JsMethod(namespace = "$")
    public static native Object noConflict(boolean removeAll);

    /**
     * An empty function.
     */
    @JsMethod(namespace = "$")
    public static native void noop();

    /**
     * Return a number representing the current time.
     * The $.now() method is a shorthand for the number returned by the expression
     * (new Date).getTime().
     */
    @JsMethod(namespace = "$")
    public static native double now();

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj An array to serialize.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(Object[] obj);

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj An object to serialize.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(Object obj);

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj A jQuery element to serialize.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(JQueryElement obj);

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj An array to serialize.
     * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(Object[] obj, boolean traditional);

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj An object to serialize.
     * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(Object obj, boolean traditional);

    /**
     * Create a serialized representation of an array, a plain object, or a jQuery object suitable
     * for use in a URL query string or Ajax request. In case a jQuery object is passed, it should
     * contain input elements with name/value properties.
     * @param obj A jQuery element to serialize.
     * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
     * @return Serialized object result.
     */
    @JsMethod(namespace = "$")
    public static native String param(JQueryElement obj, boolean traditional);

    /**
     * Parses a string into an array of DOM nodes.
     * @param data HTML string to be parsed
     * @return Array of DOM nodes from parsed HTML string.
     */
    @JsMethod(namespace = "$")
    public static native Object[] parseHTML(String data);

    /**
     * Parses a string into an array of DOM nodes.
     * @param data HTML string to be parsed
     * @param context Document element to serve as the context in which the HTML fragment will be created
     * @return Array of DOM nodes from parsed HTML string.
     */
    @JsMethod(namespace = "$")
    public static native Object[] parseHTML(String data, Element context);

    /**
     * Parses a string into an array of DOM nodes.
     * @param data HTML string to be parsed
     * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
     * @return Array of DOM nodes from parsed HTML string.
     */
    @JsMethod(namespace = "$")
    public static native Object[] parseHTML(String data, boolean keepScripts);

    /**
     * Parses a string into an array of DOM nodes.
     * @param data HTML string to be parsed
     * @param context Document element to serve as the context in which the HTML fragment will be created
     * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
     * @return Array of DOM nodes from parsed HTML string.
     */
    @JsMethod(namespace = "$")
    public static native Object[] parseHTML(String data, Element context, boolean keepScripts);

    /**
     * Takes a well-formed JSON string and returns the resulting JavaScript value.
     * @param json The JSON string to parse.
     * @return String, Number, Object, Array or Boolean.
     */
    @JsMethod(namespace = "$")
    public static native Object parseJSON(String json);

    /**
     * Parses a string into an XML document.
     * @param data a well-formed XML string to be parsed
     * @return XMLDocument
     */
    @JsMethod(namespace = "$")
    public static native Object parseXML(String data);

    /**
     * Load data from the server using a HTTP POST request.
     * @param url A string containing the URL to which the request is sent.
     */
    @JsMethod(namespace = "$")
    public static native Object post(String url);

    /**
     * Load data from the server using a HTTP POST request.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     */
    @JsMethod(namespace = "$")
    public static native Object post(String url, String data);

    /**
     * Load data from the server using a HTTP POST request.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds. Required if
     *                dataType is provided, but can be null in that case.
     */
    @JsMethod(namespace = "$")
    public static native Object post(String url, String data, Func3<Object, String, Object> success);

    /**
     * Load data from the server using a HTTP POST request.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param success A callback function that is executed if the request succeeds. Required if
     *                dataType is provided, but can be null in that case.
     * @param dataType The type of data expected from the server. Default: Intelligent Guess
     *                 (xml, json, script, text, html).
     */
    @JsMethod(namespace = "$")
    public static native Object post(String url, String data, Func3<Object, String, Object> success, String dataType);

    /**
     * Load data from the server using a HTTP POST request.
     * @param settings A set of key/value pairs that configure the Ajax request. All properties
     *                 except for url are optional. A default can be set for any option with
     *                 $.ajaxSetup(). See jQuery.ajax( settings ) for a complete list of all
     *                 settings. Type will automatically be set to POST.
     */
    @JsMethod(namespace = "$")
    public static native Object post(Object settings);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     * @param function The function whose context will be changed.
     * @param context The object to which the context (this) of the function should be set.
     * @return The new function proxied.
     */
    @JsMethod(namespace = "$")
    public static native Func proxy(Func function, Object context);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     * @param function The function whose context will be changed.
     * @param context The object to which the context (this) of the function should be set.
     * @param additionalArguments Any number of arguments to be passed to the function referenced
     *                            in the function argument.
     * @return The new function proxied.
     */
    @JsMethod(namespace = "$")
    public static native Func proxy(Func function, Object context, Object... additionalArguments);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     * @param context The object to which the context of the function should be set.
     * @param name The name of the function whose context will be changed (should be a property
     *             of the context object).
     * @return The new function proxied.
     */
    @JsMethod(namespace = "$")
    public static native Func proxy(Object context, String name);

    /**
     * Takes a function and returns a new one that will always have a particular context.
     * @param context The object to which the context of the function should be set.
     * @param name The name of the function whose context will be changed (should be a property
     *             of the context object).
     * @param additionalArguments Any number of arguments to be passed to the function referenced
     *                            in the function argument.
     * @return The new function proxied.
     */
    @JsMethod(namespace = "$")
    public static native Func proxy(Object context, String name, Object... additionalArguments);

    /**
     * Remove a previously-stored piece of data.
     * @param element A DOM element from which to remove data.
     */
    @JsMethod(namespace = "$")
    public static native JQueryElement removeData(Element element);

    /**
     * Remove a previously-stored piece of data.
     * @param element A DOM element from which to remove data.
     * @param name A string naming the piece of data to remove.
     */
    @JsMethod(namespace = "$")
    public static native JQueryElement removeData(Element element, String name);

    /**
     * Remove the whitespace from the beginning and end of a string.
     * @param str The string to trim.
     */
    @JsMethod(namespace = "$")
    public static native String trim(String str);

    /**
     * Determine the internal JavaScript [[Class]] of an object.
     * @param obj Object to get the internal JavaScript [[Class]] of.
     */
    @JsMethod(namespace = "$")
    public static native String type(Object obj);

    /**
     * Sorts an array of DOM elements, in place, with the duplicates removed. Note that
     * this only works on arrays of DOM elements, not strings or numbers.
     * @param array The Array of DOM elements.
     */
    @JsMethod(namespace = "$")
    public static native Element[] unique(Element[] array);
}

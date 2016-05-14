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

import com.google.gwt.dom.client.Element;
import com.workingflows.js.jquery.client.api.Functions.EventFunc;
import com.workingflows.js.jquery.client.api.Functions.EventFunc1;
import com.workingflows.js.jquery.client.api.Functions.EventFunc2;
import com.workingflows.js.jquery.client.api.Functions.EventFunc3;
import com.workingflows.js.jquery.client.api.Functions.Func;
import com.workingflows.js.jquery.client.api.Functions.Func1;
import com.workingflows.js.jquery.client.api.Functions.Func2;
import com.workingflows.js.jquery.client.api.Functions.Func3;
import com.workingflows.js.jquery.client.api.Functions.FuncRet1;
import com.workingflows.js.jquery.client.api.Functions.FuncRet2;
import com.workingflows.js.jquery.client.api.Functions.FuncRet3;
import com.workingflows.js.jquery.client.api.Functions.KeyEventFunc;
import com.workingflows.js.jscore.client.api.core.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represent a JQuery Element.
 *
 * @author Cristian Rinaldi
 * @author Ben Dol
 */
@JsType(name = "jQuery", isNative = true)
public class JQueryElement<T> extends Node {

    /**
     * A string containing the jQuery version number.
     */
    @JsProperty(name="jquery")
    public native int jquery();

    /**
     * The number of elements in the jQuery object.
     */
    @JsProperty(name="length")
    public native int length();

    /**
     * Use as the raw 0 index element.
     */
    @JsOverlay
    public final Element asElement() {
        return get(0);
    }

    /**
     * Create a new jQuery object with elements added to the set of matched elements.
     * @param selectorOrHtml A string representing a selector expression to find
     *                       additional elements to add to the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> add(String selectorOrHtml);

    /**
     * Create a new jQuery object with elements added to the set of matched elements.
     * @param element One or more elements to add to the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> add(Element element);

    /**
     * Create a new jQuery object with elements added to the set of matched elements.
     * @param selection An existing jQuery object to add to the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> add(JQueryElement selection);

    /**
     * Create a new jQuery object with elements added to the set of matched elements.
     * @param selector A string representing a selector expression to find additional
     *                 elements to add to the set of matched elements.
     * @param context The point in the document at which the selector should begin matching;
     *                similar to the context argument of the $(selector, context) method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> add(String selector, Element context);

    /**
     * Add the previous set of elements on the stack to the current set, optionally
     * filtered by a selector.
     * @param selector A string containing a selector expression to match the current
     *                 set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> addBack(String... selector);

    /**
     * Adds the specified class(es) to each element in the set of matched elements.
     * @param className One or more space-separated classes to be added to the class
     *                  attribute of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> addClass(String className);

    /**
     * Adds the specified class(es) to each element in the set of matched elements.
     * @param function A function returning one or more space-separated class names
     *                 to be added to the existing class name(s). Receives the index
     *                 position of the element in the set and the existing class name(s)
     *                 as arguments. Within the function, this refers to the current
     *                 element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> addClass(Func2<Integer, String> function);

    /**
     * Insert content, specified by the parameter, after each element in the
     * set of matched elements.
     * @param content HTML string to insert after each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> after(String content);

    /**
     * Insert content, specified by the parameter, after each element in the
     * set of matched elements.
     * @param content DOM elements to insert after each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> after(Element... content);

    /**
     * Insert content, specified by the parameter, after each element in the
     * set of matched elements.
     * @param content jQuery object to insert after each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> after(JQueryElement content);

    /**
     * Insert content, specified by the parameter, after each element in the
     * set of matched elements.
     * @param function A function that returns an HTML string, DOM element(s), or jQuery
     *                 object to insert after each element in the set of matched elements.
     *                 Receives the index position of the element in the set as an argument.
     *                 Within the function, this refers to the current element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> after(Func1<Integer> function);

    /**
     * Insert content, specified by the parameter, after each element in the
     * set of matched elements.
     * @param function A function that returns an HTML string, DOM element(s), or jQuery
     *                 object to insert after each element in the set of matched elements.
     *                 Receives the index position of the element in the set and the old
     *                 HTML value of the element as arguments. Within the function, this
     *                 refers to the current element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> after(Func2<Integer, String> function);

    /**
     * TODO: Reserved for AJAX:
     * https://api.jquery.com/ajaxComplete/
     * https://api.jquery.com/ajaxError/
     * https://api.jquery.com/ajaxSend/
     * https://api.jquery.com/ajaxStart/
     * https://api.jquery.com/ajaxStop/
     * https://api.jquery.com/ajaxSuccess/
     */

    /**
     * Add the previous set of elements on the stack to the current set.
     * Note: This function has been deprecated and is now an alias for .addBack(), which
     * should be used with jQuery 1.8 and later.
     * @deprecated use {@link #addBack(String...)}
     */
    public native JQueryElement<T> andSelf();

    /**
     * Perform a custom animation of a set of CSS properties.
     * @param properties An object of CSS properties and values that the animation will move toward.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> animate(Object properties, double duration);

    /**
     * Perform a custom animation of a set of CSS properties.
     * @param properties An object of CSS properties and values that the animation will move toward.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> animate(Object properties, double duration, String easing);

    /**
     * Perform a custom animation of a set of CSS properties.
     * @param properties An object of CSS properties and values that the animation will move toward.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @param function A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> animate(Object properties, double duration, String easing, Func function);

    /**
     * Perform a custom animation of a set of CSS properties.
     * @param properties An object of CSS properties and values that the animation will move toward.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> animate(Object properties, AnimateOptions options);

    /**
     * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
     * @param htmlString HTML string to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> append(String htmlString);

    /**
     * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
     * @param element jQuery objects to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> append(JQueryElement element);

    /**
     * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
     * @param element DOM elements to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> append(Element... element);

    /**
     * Insert every element in the set of matched elements to the end of the target.
     * @param htmlString HTML string the matched set of elements will be inserted at the end of the
     *                element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> appendTo(String htmlString);

    /**
     * Insert every element in the set of matched elements to the end of the target.
     * @param element jQuery objects the matched set of elements will be inserted at the end of the
     *                element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> appendTo(JQueryElement element);

    /**
     * Insert every element in the set of matched elements to the end of the target.
     * @param element DOM elements the matched set of elements will be inserted at the end of the
     *                element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> appendTo(Element... element);

    /**
     * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
     * @param htmlString HTML string to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prepend(String htmlString);

    /**
     * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
     * @param element jQuery objects to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prepend(JQueryElement element);

    /**
     * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
     * @param element DOM elements to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prepend(Element... element);

    /**
     * Insert every element in the set of matched elements to the beginning of the target.
     * @param htmlString HTML string to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prependTo(String htmlString);

    /**
     * Insert every element in the set of matched elements to the beginning of the target.
     * @param element jQuery objects to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prependTo(JQueryElement element);

    /**
     * Insert every element in the set of matched elements to the beginning of the target.
     * @param element DOM elements to insert at the end of each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prependTo(Element... element);

    /**
     * Get the value of an attribute for the first element in the set of matched elements.
     * @param attr The name of the attribute to get.
     */
    public native Object attr(String attr);

    /**
     * Set one or more attributes for the set of matched elements.
     * @param attr The name of the attribute to set.
     * @param value A value to set for the attribute.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> attr(String attr, Object value);

    /**
     * Set one or more attributes for the set of matched elements.
     * @param attr The name of the attribute to set.
     * @param function A function returning the value to set. this is the current element.
     *                 Receives the index position of the element in the set and the old
     *                 attribute value as arguments.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> attr(String attr, Func2<Integer, Object> function);

    /**
     * Insert content, specified by the parameter, before each element in the set of matched elements.
     * @param htmlString HTML string to insert before each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> before(String htmlString);

    /**
     * Insert content, specified by the parameter, before each element in the set of matched elements.
     * @param element jQuery object to insert before each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> before(JQueryElement element);

    /**
     * Insert content, specified by the parameter, before each element in the set of matched elements.
     * @param element DOM elements to insert before each element in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> before(Element... element);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, EventFunc handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, EventFunc1 handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, EventFunc2 handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, Object eventData, EventFunc handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, Object eventData, EventFunc1 handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, Object eventData, EventFunc2 handler);

    /**
     * Attach a handler to an event for the elements.
     * @param eventType A string containing one or more DOM event types, such as "click" or
     *                  "submit," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param preventBubble Setting the third argument to false will attach a function that prevents
     *                      the default action from occurring and stops the event from bubbling.
     *                      The default is true.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(String eventType, Object eventData, boolean preventBubble);

    /**
     * Attach a handler to an event for the elements.
     * @param events An object containing one or more DOM event types and functions to execute for them.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> bind(Object events);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur(EventFunc1 handler);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur(EventFunc2 handler);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "blur" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> blur();

    /**
     * TODO: Reserved for Callbacks:
     * https://api.jquery.com/callbacks.add/
     */

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change(EventFunc1 handler);

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change(EventFunc2 handler);

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "change" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> change();

    /**
     * Get the children of each element in the set of matched elements, optionally filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> children(String selector);

    /**
     * Remove from the queue all items that have not yet been run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> clearQueue();

    /**
     * Remove from the queue all items that have not yet been run.
     * @param queueName A string containing the name of the queue. Defaults to fx, the
     *                  standard effects queue.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> clearQueue(String queueName);

    /**
     * Bind an event handler to the "click" JavaScript event, or trigger that
     * event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return  self {@link JQueryElement}
     */
    public native JQueryElement<T> click(EventFunc1 handler);

    /**
     * Bind an event handler to the "click" JavaScript event, or trigger that
     * event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return  self {@link JQueryElement}
     */
    public native JQueryElement<T> click(EventFunc2 handler);

    /**
     * Bind an event handler to the "click" JavaScript event, or trigger that
     * event on an element.
     * @return  self {@link JQueryElement}
     */
    public native JQueryElement<T> click();

    /**
     * Create a deep copy of the set of matched elements.
     * @return  self {@link JQueryElement}
     */
    public native JQueryElement<T> clone();

    /**
     * Create a deep copy of the set of matched elements.
     * @param withDataAndEvents A Boolean indicating whether event handlers should be copied along with
     *                          the elements. As of jQuery 1.4, element data will be copied as well.
     * @return  self {@link JQueryElement}
     */
    public native JQueryElement<T> clone(boolean withDataAndEvents);

    /**
     * Create a deep copy of the set of matched elements.
     * @param withDataAndEvents A Boolean indicating whether event handlers should be copied along with
     *                          the elements. As of jQuery 1.4, element data will be copied as well.
     * @param deepWithDataAndEvents A Boolean indicating whether event handlers and data for all children
     *                              of the cloned element should be copied. By default its value matches
     *                              the first argument's value (which defaults to false).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> clone(boolean withDataAndEvents, boolean deepWithDataAndEvents);

    /**
     * For each element in the set, get the first element that matches the selector by testing the
     * element itself and traversing up through its ancestors in the DOM tree.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> closest(String selector);

    /**
     * For each element in the set, get the first element that matches the selector by testing the
     * element itself and traversing up through its ancestors in the DOM tree.
     * @param selector A string containing a selector expression to match elements against.
     * @param context A DOM element within which a matching element may be found. If no context is passed
     *                in then the context of the jQuery set will be used instead.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> closest(String selector, Element context);

    /**
     * For each element in the set, get the first element that matches the selector by testing the
     * element itself and traversing up through its ancestors in the DOM tree.
     * @param selection A jQuery object to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> closest(JQueryElement selection);

    /**
     * For each element in the set, get the first element that matches the selector by testing the
     * element itself and traversing up through its ancestors in the DOM tree.
     * @param element An element to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> closest(Element element);

    /**
     * Get the children of each element in the set of matched elements, including text and comment nodes.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contents();

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu(EventFunc1 handler);

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu(EventFunc2 handler);

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "contextmenu" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> contextmenu();

    /**
     * Get the computed style properties for the first element in the set of matched elements.
     * @param propertyName A CSS property.
     */
    public native String css(String... propertyName);

    /**
     * Set one or more CSS properties for the set of matched elements.
     * @param propertyName A CSS property.
     * @param value A value to set for the property.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> css(String propertyName, String value);

    /**
     * Set one or more CSS properties for the set of matched elements.
     * @param propertyName A CSS property.
     * @param function A function returning the value to set. this is the current element. Receives
     *                 the index position of the element in the set and the old value as arguments.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> css(String propertyName, FuncRet2<Integer, Object> function);

    /**
     * Set one or more CSS properties for the set of matched elements.
     * @param properties An object of property-value pairs to set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> css(Object properties);

    /**
     * Store arbitrary data associated with the matched elements.
     * @param key A string naming the piece of data to set.
     * @param value The new data value; this can be any Javascript type except undefined.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> data(String key, String value);

    /**
     * Store arbitrary data associated with the matched elements.
     * @param obj An object of key-value pairs of data to update.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> data(Object obj);

    /**
     * Return the value at the named data store for the first element in the jQuery collection,
     * as set by data(name, value) or by an HTML5 data-* attribute.
     * @param key Name of the data stored.
     * @return data object value.
     */
    public native Object data(String key);

    /**
     * Return the value at the named data store for the first element in the jQuery collection,
     * as set by data(name, value) or by an HTML5 data-* attribute.
     * @return data object value.
     */
    public native Object data();

    /**
     * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dblclick(EventFunc1 handler);

    /**
     * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dblclick(EventFunc2 handler);

    /**
     * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dblclick(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dblclick(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "dblclick" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dblclick(Object eventData, EventFunc2 handler);

    /**
     * Set a timer to delay execution of subsequent items in the queue.
     * @param duration An integer indicating the number of milliseconds to delay execution of the next
     *                 item in the queue.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delay(int duration);

    /**
     * Set a timer to delay execution of subsequent items in the queue.
     * @param duration An integer indicating the number of milliseconds to delay execution of the next
     *                 item in the queue.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delay(int duration, String queueName);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType, EventFunc handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType, EventFunc1 handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType, EventFunc2 handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType, Object eventData, EventFunc handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType, Object eventData, EventFunc1 handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param eventType A string containing one or more space-separated JavaScript event types, such as
     *                  "click" or "keydown," or custom event names.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute at the time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, String eventType,
                                            Object eventData, EventFunc2 handler);

    /**
     * Attach a handler to one or more events for all elements that match the selector, now or in the
     * future, based on a specific set of root elements.
     * @param selector A selector to filter the elements that trigger the event.
     * @param events A plain object of one or more event types and functions to execute for them.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> delegate(String selector, Object events);

    /**
     * Execute the next function on the queue for the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dequeue();

    /**
     * Execute the next function on the queue for the matched elements.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> dequeue(String queueName);

    /**
     * Remove the set of matched elements from the DOM.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> detach();

    /**
     * Remove the set of matched elements from the DOM.
     * @param selector A selector expression that filters the set of matched elements to be removed.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> detach(String selector);

    /**
     * Iterate over a jQuery object, executing a function for each matched element.
     * @param function A function to execute for each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> each(Func2<Object, Element> function);

    /**
     * Remove all child nodes of the set of matched elements from the DOM.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> empty();

    /**
     * End the most recent filtering operation in the current chain and return the set of
     * matched elements to its previous state.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> end();

    /**
     * Reduce the set of matched elements to the one at the specified index.
     * @param index An integer indicating the 0-based position of the element. or,
     *              An integer indicating the position of the element, counting backwards
     *              from the last element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> eq(int index);

    /**
     * Bind an event handler to the "error" JavaScript event.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> error(EventFunc1 handler);

    /**
     * Bind an event handler to the "error" JavaScript event.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> error(EventFunc2 handler);

    /**
     * Bind an event handler to the "error" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> error(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "error" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> error(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "error" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> error(Object eventData, EventFunc2 handler);

    /**
     * Display the matched elements by fading them to opaque.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn();

    /**
     * Display the matched elements by fading them to opaque.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(double duration);

    /**
     * Display the matched elements by fading them to opaque.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(Func complete);

    /**
     * Display the matched elements by fading them to opaque.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(String easing);

    /**
     * Display the matched elements by fading them to opaque.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(double duration, Func complete);

    /**
     * Display the matched elements by fading them to opaque.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(double duration, String easing);

    /**
     * Display the matched elements by fading them to opaque.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(double duration, String easing, Func complete);

    /**
     * Display the matched elements by fading them to opaque.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeIn(AnimateOptions options);

    /**
     * Hide the matched elements by fading them to transparent.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut();

    /**
     * Hide the matched elements by fading them to transparent.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(double duration);

    /**
     * Display the matched elements by fading them to opaque.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(Func complete);

    /**
     * Hide the matched elements by fading them to transparent.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(String easing);

    /**
     * Hide the matched elements by fading them to transparent.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(double duration, Func complete);

    /**
     * Hide the matched elements by fading them to transparent.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(double duration, String easing);

    /**
     * Hide the matched elements by fading them to transparent.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(double duration, String easing, Func complete);

    /**
     * Hide the matched elements by fading them to transparent.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeOut(AnimateOptions options);

    /**
     * Adjust the opacity of the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param opacity A number between 0 and 1 denoting the target opacity.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeTo(double duration, double opacity);

    /**
     * Adjust the opacity of the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param opacity A number between 0 and 1 denoting the target opacity.
     * @param complete A function to call once the animation is complete.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeTo(double duration, double opacity, Func complete);

    /**
     * Adjust the opacity of the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param opacity A number between 0 and 1 denoting the target opacity.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeTo(double duration, double opacity, String easing);

    /**
     * Adjust the opacity of the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param opacity A number between 0 and 1 denoting the target opacity.
     * @param easing A string indicating which easing function to use for the transition.
     * @param complete A function to call once the animation is complete.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeTo(double duration, double opacity, String easing, Func complete);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(double duration);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(Func complete);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(String easing);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(double duration, Func complete);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(double duration, String easing);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @param complete A function to call once the animation is complete, called once per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(double duration, String easing, Func complete);

    /**
     * Display or hide the matched elements by animating their opacity.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> fadeToggle(AnimateOptions options);

    /**
     * Reduce the set of matched elements to those that match the selector or pass the function's test.
     * @param selector A string containing a selector expression to match the current set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> filter(String selector);

    /**
     * Reduce the set of matched elements to those that match the selector or pass the function's test.
     * @param function A function used as a test for each element in the set. this is the current DOM element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> filter(FuncRet2<Integer, Element> function);

    /**
     * Reduce the set of matched elements to those that match the selector or pass the function's test.
     * @param elements One or more DOM elements to match the current set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> filter(Element... elements);

    /**
     * Reduce the set of matched elements to those that match the selector or pass the function's test.
     * @param selection An existing jQuery object to match the current set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> filter(JQueryElement selection);

    /**
     * Get the descendants of each element in the current set of matched elements, filtered
     * by a selector, jQuery object, or element.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> find(String selector);

    /**
     * Get the descendants of each element in the current set of matched elements, filtered
     * by a selector, jQuery object, or element.
     * @param elements DOM elements to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> find(Element... elements);

    /**
     * Get the descendants of each element in the current set of matched elements, filtered
     * by a selector, jQuery object, or element.
     * @param selection jQuery object to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> find(JQueryElement selection);

    /**
     * Stop the currently-running animation, remove all queued animations, and complete
     * all animations for the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> finish();

    /**
     * Stop the currently-running animation, remove all queued animations, and complete
     * all animations for the matched elements.
     * @param queue The name of the queue in which to stop animations.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> finish(String queue);

    /**
     * Reduce the set of matched elements to the first in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> first();

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus(EventFunc1 handler);

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus(EventFunc2 handler);

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "focus" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focus();

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin(EventFunc1 handler);

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin(EventFunc2 handler);

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "focusin" JavaScript event.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusin();

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout(EventFunc1 handler);

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout(EventFunc2 handler);

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "focusout" JavaScript event.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> focusout();

    /**
     * Retrieve one of the elements matched by the jQuery object.
     * @param index A zero-based integer indicating which element to retrieve.
     * @return Retrieved element
     */
    public native Element get(int index);

    /**
     * Retrieve the elements matched by the jQuery object.
     * @return All of the matched DOM nodes are returned by this call, contained
     * in a standard array:
     */
    public native Element[] get();

    /**
     * Reduce the set of matched elements to those that have a descendant that matches
     * the selector or DOM element.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> has(String selector);

    /**
     * Reduce the set of matched elements to those that have a descendant that matches
     * the selector or DOM element.
     * @param contained A DOM element to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> has(Element contained);

    /**
     * Determine whether any of the matched elements are assigned the given class.
     * @param className The class name to search for.
     * @return true if the class exists
     */
    public native boolean hasClass(String className);

    /**
     * Get the current computed height for the first element in the set of matched elements.
     */
    public native double height();

    /**
     * Set the CSS height of every matched element.
     * @param height An integer representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native double height(int height);

    /**
     * Set the CSS height of every matched element.
     * @param height An integer with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> height(String height);

    /**
     * Set the CSS height of every matched element.
     * @param function A function returning the height to set. Receives the index position of the
     *                 element in the set and the old height as arguments. Within the function,
     *                 this refers to the current element in the set. You can return String or Number.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> height(FuncRet2<Integer, Integer> function);

    /**
     * Hide the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hide();

    /**
     * Hide the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hide(double duration);

    /**
     * Hide the matched elements.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hide(Func complete);

    /**
     * Hide the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hide(double duration, Func complete);

    /**
     * Hide the matched elements.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hide(AnimateOptions options);

    /**
     * Bind two handlers to the matched elements, to be executed when the mouse pointer
     * enters and leaves the elements.
     * @param handlerIn A function to execute when the mouse pointer enters the element.
     * @param handlerOut A function to execute when the mouse pointer leaves the element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hover(EventFunc1 handlerIn, EventFunc handlerOut);

    /**
     * Bind two handlers to the matched elements, to be executed when the mouse pointer
     * enters and leaves the elements.
     * @param handlerIn A function to execute when the mouse pointer enters the element.
     * @param handlerOut A function to execute when the mouse pointer leaves the element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hover(EventFunc1 handlerIn, EventFunc1 handlerOut);

    /**
     * Bind two handlers to the matched elements, to be executed when the mouse pointer
     * enters and leaves the elements.
     * @param handlerIn A function to execute when the mouse pointer enters the element.
     * @param handlerOut A function to execute when the mouse pointer leaves the element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hover(EventFunc2 handlerIn, EventFunc2 handlerOut);

    /**
     * Bind two handlers to the matched elements, to be executed when the mouse pointer
     * enters and leaves the elements.
     * @param handlerOut A function to execute when the mouse pointer leaves the element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hover(EventFunc1 handlerOut);

    /**
     * Bind two handlers to the matched elements, to be executed when the mouse pointer
     * enters and leaves the elements.
     * @param handlerOut A function to execute when the mouse pointer leaves the element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> hover(EventFunc2 handlerOut);

    /**
     * Get the HTML contents of the first element in the set of matched elements.
     */
    public native String html();

    /**
     * Set the HTML contents of each element in the set of matched elements.
     * @param htmlString A string of HTML to set as the content of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> html(String htmlString);

    /**
     * Set the HTML contents of each element in the set of matched elements.
     * @param function A function returning the HTML content to set. Receives the index position
     *                 of the element in the set and the old HTML value as arguments. jQuery
     *                 empties the element before calling the function; use the oldhtml argument
     *                 to reference the previous content. Within the function, this refers to the
     *                 current element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> html(FuncRet2<Integer, String> function);

    /**
     * Search for a given element from among the matched elements.
     */
    public native int index();

    /**
     * Search for a given element from among the matched elements.
     * @param selector A selector representing a jQuery collection in which to look for an element.
     */
    public native int index(String selector);

    /**
     * Search for a given element from among the matched elements.
     * @param element The DOM element within the jQuery object to look for.
     */
    public native int index(Element element);

    /**
     * Search for a given element from among the matched elements.
     * @param element First element within the jQuery object to look for.
     */
    public native int index(JQueryElement element);

    /**
     * Get the current computed height for the first element in the set of matched elements,
     * including padding but not border.
     */
    public native double innerHeight();

    /**
     * Set the CSS inner height of each element in the set of matched elements.
     * @param value A number along with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerHeight(String value);

    /**
     * Set the CSS inner height of each element in the set of matched elements.
     * @param value A number representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerHeight(double value);

    /**
     * Set the CSS inner height of each element in the set of matched elements.
     * @param function A function returning the inner height (including padding but not border)
     *                 to set. Receives the index position of the element in the set and the old
     *                 inner height as arguments. Within the function, this refers to the current
     *                 element in the set. Return String or Number.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerHeight(FuncRet2<Integer, Double> function);

    /**
     * Get the current computed width for the first element in the set of matched elements,
     * including padding but not border.
     */
    public native double innerWidth();

    /**
     * Set the CSS inner width of each element in the set of matched elements.
     * @param value A number along with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerWidth(String value);

    /**
     * Set the CSS inner width of each element in the set of matched elements.
     * @param value A number representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerWidth(double value);

    /**
     * Set the CSS inner width of each element in the set of matched elements.
     * @param function A function returning the inner height (including padding but not border)
     *                 to set. Receives the index position of the element in the set and the old
     *                 inner height as arguments. Within the function, this refers to the current
     *                 element in the set. Return String or Number.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> innerWidth(FuncRet2<Integer, Double> function);

    /**
     * Insert every element in the set of matched elements after the target.
     * @param selector A selector or HTML string; matched set of elements will be inserted after the
     *                 element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> insertAfter(String selector);

    /**
     * Insert every element in the set of matched elements after the target.
     * @param element An element; matched set of elements will be inserted after the
     *                 element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> insertAfter(Element... element);

    /**
     * Insert every element in the set of matched elements after the target.
     * @param element jQuery object; matched set of elements will be inserted after the
     *                 element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> insertAfter(JQueryElement element);

    /**
     * Insert every element in the set of matched elements before the target.
     * @param element jQuery object; matched set of elements will be inserted after the
     *                 element(s) specified by this parameter.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> insertBefore(JQueryElement element);

    /**
     * Check the current matched set of elements against a selector, element, or jQuery object
     * and return true if at least one of these elements matches the given arguments.
     * @param selector A string containing a selector expression to match elements against.
     * @return return true if at least one of these elements matches the given arguments
     */
    public native boolean is(String selector);

    /**
     * Check the current matched set of elements against a selector, element, or jQuery object
     * and return true if at least one of these elements matches the given arguments.
     * @param function A function used as a test for every element in the set. It accepts two
     *                 arguments, index, which is the element's index in the jQuery collection,
     *                 and element, which is the DOM element. Within the function, this refers
     *                 to the current DOM element. Return a Boolean value.
     * @return return true if at least one of these elements matches the given arguments
     */
    public native boolean is(FuncRet2<Integer, Element> function);

    /**
     * Check the current matched set of elements against a selector, element, or jQuery object
     * and return true if at least one of these elements matches the given arguments.
     * @param selection An existing jQuery object to match the current set of elements against.
     * @return return true if at least one of these elements matches the given arguments
     */
    public native boolean is(JQueryElement selection);

    /**
     * Check the current matched set of elements against a selector, element, or jQuery object
     * and return true if at least one of these elements matches the given arguments.
     * @param elements One or more elements to match the current set of elements against.
     * @return return true if at least one of these elements matches the given arguments
     */
    public native boolean is(Element... elements);

    /**
     * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keydown(KeyEventFunc handler);

    /**
     * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keydown(Object eventData, KeyEventFunc handler);

    /**
     * Bind an event handler to the "keydown" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keydown();

    /**
     * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keypress(KeyEventFunc handler);

    /**
     * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keypress(Object eventData, KeyEventFunc handler);

    /**
     * Bind an event handler to the "keypress" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keypress();

    /**
     * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keyup(KeyEventFunc handler);

    /**
     * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keyup(Object eventData, KeyEventFunc handler);

    /**
     * Bind an event handler to the "keyup" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> keyup();

    /**
     * Reduce the set of matched elements to the final one in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> last();

    /**
     * Load data from the server and place the returned HTML into the matched element.
     * @param url A string containing the URL to which the request is sent.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(String url);

    /**
     * Load data from the server and place the returned HTML into the matched element.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(String url, String data);

    /**
     * Load data from the server and place the returned HTML into the matched element.
     * @param url A string containing the URL to which the request is sent.
     * @param data A plain object or string that is sent to the server with the request.
     * @param complete A callback function that is executed when the request completes.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(String url, String data, Func3<String, String, Object> complete);

    /**
     * Bind an event handler to the "load" JavaScript event.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(EventFunc1 handler);

    /**
     * Bind an event handler to the "load" JavaScript event.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(EventFunc2 handler);

    /**
     * Bind an event handler to the "load" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "load" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "load" JavaScript event.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute when the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> load(Object eventData, EventFunc2 handler);

    /**
     * Pass each element in the current matched set through a function, producing a new jQuery
     * object containing the return values.
     * @param callback A function object that will be invoked for each element in the current set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> map(FuncRet2<Integer, Element> callback);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown(EventFunc1 handler);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown(EventFunc2 handler);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mousedown" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousedown();

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter(EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter(EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseenter" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseenter();

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave(EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave(EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseleave" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseleave();

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove(EventFunc1 handler);

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove(EventFunc2 handler);

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mousemove" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mousemove();

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout(EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout(EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseout" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseout();

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover(EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover(EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseover" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseover();

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup(EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup(EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "mouseup" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> mouseup();

    /**
     * Get the immediately following sibling of each element in the set of matched elements. If a selector
     * is provided, it retrieves the next sibling only if it matches that selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> next();

    /**
     * Get the immediately following sibling of each element in the set of matched elements. If a selector
     * is provided, it retrieves the next sibling only if it matches that selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> next(String selector);

    /**
     * Get all following siblings of each element in the set of matched elements, optionally
     * filtered by a selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextAll();

    /**
     * Get all following siblings of each element in the set of matched elements, optionally
     * filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextAll(String selector);

    /**
     * Get all following siblings of each element up to but not including the element matched by
     * the selector, DOM node, or jQuery object passed.
     * @param selector A string containing a selector expression to indicate where to stop
     *                 matching following sibling elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextUntil(String selector, String filter);

    /**
     * Get all following siblings of each element up to but not including the element matched by
     * the selector, DOM node, or jQuery object passed.
     * @param element A DOM node indicating where to stop matching following sibling elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextUntil(Element element);

    /**
     * Get all following siblings of each element up to but not including the element matched by
     * the selector, DOM node, or jQuery object passed.
     * @param element A DOM node indicating where to stop matching following sibling elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextUntil(Element element, String filter);

    /**
     * Get all following siblings of each element up to but not including the element matched by
     * the selector, DOM node, or jQuery object passed.
     * @param element A jQuery object indicating where to stop matching following sibling elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextUntil(JQueryElement element);

    /**
     * Get all following siblings of each element up to but not including the element matched by
     * the selector, DOM node, or jQuery object passed.
     * @param element A jQuery object indicating where to stop matching following sibling elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> nextUntil(JQueryElement element, String filter);

    /**
     * Remove elements from the set of matched elements.
     * @param selector A string containing a selector expression, a DOM element, or an array of
     *                 elements to match against the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> not(String selector);

    /**
     * Remove elements from the set of matched elements.
     * @param function A function used as a test for each element in the set. It accepts two arguments,
     *                 index, which is the element's index in the jQuery collection, and element, which
     *                 is the DOM element. Within the function, this refers to the current DOM element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> not(FuncRet2<Integer, Element> function);

    /**
     * Remove elements from the set of matched elements.
     * @param elements An existing jQuery object to match the current set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> not(Element... elements);

    /**
     * Remove elements from the set of matched elements.
     * @param selection An existing jQuery object to match the current set of elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> not(JQueryElement selection);

    /**
     * Remove an event handler.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off();

    /**
     * Remove an event handler.
     * @param event A jQuery.Event object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(Event event);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, EventFunc handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, EventFunc1 handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, EventFunc2 handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, EventFunc3 handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .off() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, String selector, EventFunc handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .off() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, String selector, EventFunc1 handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .off() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, String selector, EventFunc2 handler);

    /**
     * Remove an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .off() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> off(String events, String selector, EventFunc3 handler);

    /**
     * Add an event handler.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on();

    /**
     * Add an event handler.
     * @param event A jQuery.Event object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(Event event);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, EventFunc handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, EventFunc1 handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, EventFunc2 handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, EventFunc3 handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, String selector, EventFunc handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, String selector, EventFunc1 handler);

    /**
     * Add an event handler.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> on(String events, String selector, EventFunc2 handler);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one();

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param event A jQuery.Event object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(Event event);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, EventFunc handler);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, EventFunc1 handler);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, EventFunc2 handler);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, String selector, EventFunc handler);

    /**
     * Attach a handler to an event for the elements. The handler is
     * executed at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, String selector, EventFunc1 handler);

    /**
     * Attach a handler to an event for the elements. The handler is executed
     * at most once per element per event type.
     * @param events One or more space-separated event types and optional namespaces, or just
     *               namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
     * @param selector A selector which should match the one originally passed to .on() when
     *                 attaching event handlers.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> one(String events, String selector, EventFunc2 handler);

    /**
     * Get the current coordinates of the first element in the set of matched elements,
     * relative to the document.
     * @return returns an object containing the properties top and left.
     */
    public native Offset offset();

    /**
     * Set the current coordinates of every element in the set of matched elements,
     * relative to the document.
     * @param coordinates An object containing the properties top and left, which are numbers indicating
     *                    the new top and left coordinates for the elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> offset(Offset coordinates);

    /**
     * Set the current coordinates of every element in the set of matched elements,
     * relative to the document.
     * @param function A function to return the coordinates to set. Receives the index of the element in
     *                 the collection as the first argument and the current coordinates as the second argument.
     *                 The function should return an object with the new top and left properties.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> offset(FuncRet2<Integer, Offset> function);

    /**
     * Get the closest ancestor element that is positioned.
     * @return Closest jQuery parent element.
     */
    public native JQueryElement<T> offsetParent();

    /**
     * Get the current computed height for the first element in the set of matched elements, including
     * padding, border, and optionally margin. Returns a number (without "px") representation of the value
     * or null if called on an empty set of elements.
     * <pre><img src="https://api.jquery.com/resources/0042_04_03.png"/></pre>
     */
    public native int outerHeight();

    /**
     * Get the current computed height for the first element in the set of matched elements, including
     * padding, border, and optionally margin. Returns a number (without "px") representation of the value
     * or null if called on an empty set of elements.
     * <pre><img src="https://api.jquery.com/resources/0042_04_03.png"/></pre>
     * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
     */
    public native int outerHeight(boolean includeMargin);

    /**
     * Set the CSS outer Height of each element in the set of matched elements.
     * @param value A number representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerHeight(int value);

    /**
     * Set the CSS outer Height of each element in the set of matched elements.
     * @param value A number along with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerHeight(String value);

    /**
     * Set the CSS outer Height of each element in the set of matched elements.
     * @param function A function returning the outer height to set. Receives the index position
     *                 of the element in the set and the old outer height as arguments. Within the
     *                 function, this refers to the current element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerHeight(Func2<Integer, Integer> function);

    /**
     * Get the current computed width for the first element in the set of matched elements, including
     * padding, border, and optionally margin. Returns a number (without "px") representation of the value
     * or null if called on an empty set of elements.
     * <pre><img src="https://api.jquery.com/resources/0042_04_03.png"/></pre>
     */
    public native int outerWidth();

    /**
     * Get the current computed width for the first element in the set of matched elements, including
     * padding, border, and optionally margin. Returns a number (without "px") representation of the value
     * or null if called on an empty set of elements.
     * <pre><img src="https://api.jquery.com/resources/0042_04_03.png"/></pre>
     * @param includeMargin A Boolean indicating whether to include the element's margin in the calculation.
     */
    public native int outerWidth(boolean includeMargin);

    /**
     * Set the CSS outer Width of each element in the set of matched elements.
     * @param value A number representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerWidth(int value);

    /**
     * Set the CSS outer Width of each element in the set of matched elements.
     * @param value A number along with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerWidth(String value);

    /**
     * Set the CSS outer Width of each element in the set of matched elements.
     * @param function A function returning the outer height to set. Receives the index position
     *                 of the element in the set and the old outer height as arguments. Within the
     *                 function, this refers to the current element in the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> outerWidth(Func2<Integer, Integer> function);

    /**
     * Get the parent of each element in the current set of matched elements, optionally
     * filtered by a selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parent();

    /**
     * Get the parent of each element in the current set of matched elements, optionally
     * filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parent(String selector);

    /**
     * Get the ancestors of each element in the current set of matched elements, optionally
     * filtered by a selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parents();

    /**
     * Get the ancestors of each element in the current set of matched elements, optionally
     * filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parents(String selector);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param selector A string containing a selector expression to indicate where to
     *                 stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(String selector);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param selector A string containing a selector expression to indicate where to
     *                 stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(String selector, String filter);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param element A DOM node indicating where to stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(Element element);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param element A DOM node indicating where to stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(Element element, String filter);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param element A jQuery object indicating where to stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(JQueryElement element);

    /**
     * Get the ancestors of each element in the current set of matched elements, up to but not including
     * the element matched by the selector, DOM node, or jQuery object.
     * @param element A jQuery object indicating where to stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> parentsUntil(JQueryElement element, String filter);

    /**
     * Get the current coordinates of the first element in the set of matched elements,
     * relative to the offset parent.
     * @return Position value as top and left.
     */
    public native Offset position();

    /**
     * Get the immediately preceding sibling of each element in the set of matched elements,
     * optionally filtered by a selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prev();

    /**
     * Get the immediately preceding sibling of each element in the set of matched elements,
     * optionally filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prev(String selector);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevAll();

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevAll(String selector);

    /**
     * GGet all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param selector A string containing a selector expression to indicate where to
     *                 stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(String selector);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param selector A string containing a selector expression to indicate where to
     *                 stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(String selector, String filter);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param element A DOM node indicating where to stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(Element element);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param element A DOM node indicating where to stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(Element element, String filter);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param element A jQuery object indicating where to stop matching ancestor elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(JQueryElement element);

    /**
     * Get all preceding siblings of each element up to but not including the element matched
     * by the selector, DOM node, or jQuery object.
     * @param element A jQuery object indicating where to stop matching ancestor elements.
     * @param filter A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prevUntil(JQueryElement element, String filter);

    /**
     * Return a Promise object to observe when all actions of a certain type bound to the
     * collection, queued or not, have finished.
     * @return returns a dynamically generated Promise that is resolved once all actions of a certain
     * type bound to the collection, queued or not, have ended.
     */
    public native Promise promise();

    /**
     * Return a Promise object to observe when all actions of a certain type bound to the
     * collection, queued or not, have finished.
     * @param type The type of queue that needs to be observed.
     * @return returns a dynamically generated Promise that is resolved once all actions of a certain
     * type bound to the collection, queued or not, have ended.
     */
    public native Promise promise(String type);

    /**
     * Return a Promise object to observe when all actions of a certain type bound to the
     * collection, queued or not, have finished.
     * @param target Object onto which the promise methods have to be attached
     * @return returns a dynamically generated Promise that is resolved once all actions of a certain
     * type bound to the collection, queued or not, have ended.
     */
    public native Promise promise(Object target);

    /**
     * Return a Promise object to observe when all actions of a certain type bound to the
     * collection, queued or not, have finished.
     * @param type The type of queue that needs to be observed.
     * @param target Object onto which the promise methods have to be attached
     * @return returns a dynamically generated Promise that is resolved once all actions of a certain
     * type bound to the collection, queued or not, have ended.
     */
    public native Promise promise(String type, Object target);

    /**
     * Get the value of a property for the first element in the set of matched elements.
     * @param propertyName The name of the property to get.
     */
    public native Object prop(String propertyName);

    /**
     * Set one or more properties for the set of matched elements.
     * @param propertyName The name of the property to set.
     * @param value A value to set for the property.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prop(String propertyName, Object value);

    /**
     * Set one or more properties for the set of matched elements.
     * @param propertyName The name of the property to set.
     * @param function A function returning the value to set. Receives the index position of the
     *                 element in the set and the old property value as arguments. Within the function,
     *                 the keyword this refers to the current element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prop(String propertyName, FuncRet2<Integer, Object> function);

    /**
     * Set one or more properties for the set of matched elements.
     * @param properties An object of property-value pairs to set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> prop(Object properties);

    /**
     * Add a collection of DOM elements onto the jQuery stack.
     * @param elements An array of elements to push onto the stack and make into a new jQuery object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> pushStack(Element... elements);

    /**
     * Add a collection of DOM elements onto the jQuery stack.
     * @param elements An array of elements to push onto the stack and make into a new jQuery object.
     * @param name The name of a jQuery method that generated the array of elements.
     * @param arguments The arguments that were passed in to the jQuery method (for serialization).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> pushStack(Element[] elements, String name, Object... arguments);

    /**
     * Show the queue of functions to be executed on the matched elements.
     * @return Array with length matching queue items left.
     */
    public native Object[] queue();

    /**
     * Show the queue of functions to be executed on the matched elements.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard
     *                  effects queue.
     * @return Array with length matching queue items left.
     */
    public native Object[] queue(String queueName);

    /**
     * Manipulate the queue of functions to be executed, once for each matched element.
     * @param newQueue An array of functions to replace the current queue contents.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> queue(Object[] newQueue);

    /**
     * Manipulate the queue of functions to be executed, once for each matched element.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard
     *                  effects queue.
     * @param newQueue An array of functions to replace the current queue contents.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> queue(String queueName, Object... newQueue);

    /**
     * Manipulate the queue of functions to be executed, once for each matched element.
     * @param callback The new function to add to the queue, with a function to call that will
     *                 dequeue the next item.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> queue(Func1<Func> callback);

    /**
     * Manipulate the queue of functions to be executed, once for each matched element.
     * @param queueName A string containing the name of the queue. Defaults to fx, the standard
     *                  effects queue.
     * @param callback The new function to add to the queue, with a function to call that will
     *                 dequeue the next item.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> queue(String queueName, Func1<Func> callback);

    /**
     * Specify a function to execute when the DOM is fully loaded.
     * @param handler A function to execute after the DOM is ready.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> ready(Func handler);

    /**
     * Remove the set of matched elements from the DOM.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> remove();

    /**
     * Remove the set of matched elements from the DOM.
     * @param selector A selector expression that filters the set of matched elements to be removed.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> remove(String selector);

    /**
     * Remove an attribute from each element in the set of matched elements.
     * @param attributeName An attribute to remove; as of version 1.7, it can be a space-separated
     *                      list of attributes.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeAttr(String attributeName);

    /**
     * Remove a single class, multiple classes, or all classes from each element
     * in the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeClass();

    /**
     * Remove a single class, multiple classes, or all classes from each element
     * in the set of matched elements.
     * @param className One or more space-separated classes to be removed from the class
     *                  attribute of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeClass(String className);

    /**
     * Remove a single class, multiple classes, or all classes from each element in the set
     * of matched elements.
     * @param function A function returning one or more space-separated class names to be removed.
     *                 Receives the index position of the element in the set and the old class value
     *                 as arguments. Must return a String.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeClass(FuncRet2<Integer, String> function);

    /**
     * Remove a previously-stored piece of data.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeData();

    /**
     * Remove a previously-stored piece of data.
     * @param name A string naming the piece of data to delete.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeData(String name);

    /**
     * Remove a previously-stored piece of data.
     * @param list An array or space-separated string naming the pieces of data to delete.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeData(String[] list);

    /**
     * Remove a property for the set of matched elements.
     * @param propertyName The name of the property to remove.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> removeProp(String propertyName);

    /**
     * Replace each target element with the set of matched elements.
     * @param target A selector string of elements indicating which element(s) to replace.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceAll(String target);

    /**
     * Replace each target element with the set of matched elements.
     * @param target A jQuery object of elements indicating which element(s) to replace.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceAll(JQueryElement target);

    /**
     * Replace each target element with the set of matched elements.
     * @param target DOM element(s) indicating which element(s) to replace.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceAll(Element... target);

    /**
     * Replace each element in the set of matched elements with the provided new content and
     * return the set of elements that was removed.
     * @param newContent The content to insert an HTML string.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceWith(String newContent);

    /**
     * Replace each element in the set of matched elements with the provided new content and
     * return the set of elements that was removed.
     * @param newContent The content to insert, a jQuery object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceWith(JQueryElement newContent);

    /**
     * Replace each element in the set of matched elements with the provided new content and
     * return the set of elements that was removed.
     * @param newContent The content to insert, a DOM element(s).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceWith(Element... newContent);

    /**
     * Replace each element in the set of matched elements with the provided new content and
     * return the set of elements that was removed.
     * @param function A function that returns content with which to replace the set of matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> replaceWith(Func function);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize(EventFunc1 handler);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize(EventFunc2 handler);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "resize" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> resize();

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll(EventFunc1 handler);

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll(EventFunc2 handler);

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "scroll" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scroll();

    /**
     * Get the current horizontal position of the scroll bar for the first element in the
     * set of matched elements.
     * @return The horizontal scroll position is the same as the number of pixels that are
     * hidden from view to the left of the scrollable area. If the scroll bar is at the very
     * left, or if the element is not scrollable, this number will be 0.
     */
    public native int scrollLeft();

    /**
     * Set the current horizontal position of the scroll bar for each of the set of matched elements.
     * @param value An integer indicating the new position to set the scroll bar to.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scrollLeft(int value);

    /**
     * Get the current vertical position of the scroll bar for the first element in the set of
     * matched elements or set the vertical position of the scroll bar for every matched element.
     * @return The vertical scroll position is the same as the number of pixels that are hidden
     * from view above the scrollable area. If the scroll bar is at the very top, or if the element
     * is not scrollable, this number will be 0.
     */
    public native int scrollTop();

    /**
     * Set the current vertical position of the scroll bar for each of the set of matched elements.
     * @param value An integer indicating the new position to set the scroll bar to.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> scrollTop(int value);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select(EventFunc1 handler);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select(EventFunc2 handler);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "select" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> select();

    /**
     * Encode a set of form elements as a string for submission.
     * @return he .serialize() method creates a text string in standard URL-encoded notation.
     * It can act on a jQuery object that has selected individual form controls.
     */
    public native String serialize();

    /**
     * Encode a set of form elements as an array of names and values.
     * @return creates a JavaScript array of objects, ready to be encoded as a JSON string.
     * It operates on a jQuery collection of forms and/or form controls.
     */
    public native Object[] serializeArray();

    /**
     * Display the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> show();

    /**
     * Display the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> show(double duration);

    /**
     * Display the matched elements.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> show(Func complete);

    /**
     * Display the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> show(double duration, Func complete);

    /**
     * Display the matched elements.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> show(AnimateOptions options);

    /**
     * Get the siblings of each element in the set of matched elements, optionally
     * filtered by a selector.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> siblings();

    /**
     * Get the siblings of each element in the set of matched elements, optionally
     * filtered by a selector.
     * @param selector A string containing a selector expression to match elements against.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> siblings(String selector);

    /**
     * Return the number of elements in the jQuery object.
     * @deprecated Use the .length property instead.
     */
    public native int size();

    /**
     * Reduce the set of matched elements to a subset specified by a range of indices.
     * @param start An integer indicating the 0-based position at which the elements begin to be
     *              selected. If negative, it indicates an offset from the end of the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slice(int start);

    /**
     * Reduce the set of matched elements to a subset specified by a range of indices.
     * @param start An integer indicating the 0-based position at which the elements begin to be
     *              selected. If negative, it indicates an offset from the end of the set.
     * @param end An integer indicating the 0-based position at which the elements stop being selected.
     *            If negative, it indicates an offset from the end of the set. If omitted, the range
     *            continues until the end of the set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slice(int start, int end);

    /**
     * Display the matched elements with a sliding motion.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideDown();

    /**
     * Display the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideDown(double duration);

    /**
     * Display the matched elements with a sliding motion.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideDown(Func complete);

    /**
     * Display the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideDown(double duration, Func complete);

    /**
     * Display the matched elements with a sliding motion.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideDown(AnimateOptions options);

    /**
     * Display or hide the matched elements with a sliding motion.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideToggle();

    /**
     * Display or hide the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideToggle(double duration);

    /**
     * Display or hide the matched elements with a sliding motion.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideToggle(Func complete);

    /**
     * Display or hide the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideToggle(double duration, Func complete);

    /**
     * Display or hide the matched elements with a sliding motion.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideToggle(AnimateOptions options);

    /**
     * Hide the matched elements with a sliding motion.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideUp();

    /**
     * Hide the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideUp(double duration);

    /**
     * Hide the matched elements with a sliding motion.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideUp(Func complete);

    /**
     * Hide the matched elements with a sliding motion.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once per
     *                 matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideUp(double duration, Func complete);

    /**
     * Hide the matched elements with a sliding motion.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> slideUp(AnimateOptions options);

    /**
     * Stop the currently-running animation on the matched elements.
     * @param clearQueue A Boolean indicating whether to remove queued animation as well.
     *                   Defaults to false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> stop(boolean clearQueue);

    /**
     * Stop the currently-running animation on the matched elements.
     * @param queue The name of the queue in which to stop animations.
     * @param clearQueue A Boolean indicating whether to remove queued animation as well.
     *                   Defaults to false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> stop(String queue, boolean clearQueue);

    /**
     * Stop the currently-running animation on the matched elements.
     * @param clearQueue A Boolean indicating whether to remove queued animation as well.
     *                   Defaults to false.
     * @param jumpToEnd A Boolean indicating whether to complete the current animation
     *                  immediately. Defaults to false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> stop(boolean clearQueue, boolean jumpToEnd);

    /**
     * Stop the currently-running animation on the matched elements.
     * @param queue The name of the queue in which to stop animations.
     * @param clearQueue A Boolean indicating whether to remove queued animation as well.
     *                   Defaults to false.
     * @param jumpToEnd A Boolean indicating whether to complete the current animation
     *                  immediately. Defaults to false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> stop(String queue, boolean clearQueue, boolean jumpToEnd);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit(EventFunc1 handler);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit(EventFunc2 handler);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit(Object eventData, EventFunc handler);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit(Object eventData, EventFunc1 handler);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @param eventData An object containing data that will be passed to the event handler.
     * @param handler A function to execute each time the event is triggered.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit(Object eventData, EventFunc2 handler);

    /**
     * Bind an event handler to the "submit" JavaScript event, or trigger that event on an element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> submit();

    /**
     * Get the combined text contents of each element in the set of matched elements,
     * including their descendants.
     * @return a string containing the combined text of all matched elements.
     */
    public native String text();

    /**
     * Set the content of each element in the set of matched elements to the specified text.
     * @param text The text to set as the content of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> text(String text);

    /**
     * Set the content of each element in the set of matched elements to the specified text.
     * @param value The text to set as the content of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> text(int value);

    /**
     * Set the content of each element in the set of matched elements to the specified text.
     * @param value The text to set as the content of each matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> text(boolean value);

    /**
     * Set the content of each element in the set of matched elements to the specified text.
     * @param function  A function returning the text content to set. Receives the index
     *                  position of the element in the set and the old text value as arguments.
     *                  Must return a String value.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> text(FuncRet2<Integer, String> function);

    /**
     * Retrieve all the elements contained in the jQuery set, as an array.
     * @return all of the elements in the jQuery set.
     */
    public native Element[] toArray();

    /**
     * Display or hide the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle();

    /**
     * Display or hide the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle(double duration);

    /**
     * Display or hide the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param easing A string indicating which easing function to use for the transition.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle(double duration, String easing);

    /**
     * Display or hide the matched elements.
     * @param duration A string or number determining how long the animation will run.
     * @param complete A function to call once the animation is complete, called once
     *                 per matched element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle(double duration, Func complete);

    /**
     * Display or hide the matched elements.
     * @param options A map of additional options to pass to the method.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle(AnimateOptions options);

    /**
     * Display or hide the matched elements.
     * @param display Use true to show the element or false to hide it.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggle(boolean display);

    /**
     * Add or remove one or more classes from each element in the set of matched elements,
     * depending on either the class's presence or the value of the state argument.
     * @param className One or more class names (separated by spaces) to be toggled for
     *                  each element in the matched set.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggleClass(String className);

    /**
     * Add or remove one or more classes from each element in the set of matched elements,
     * depending on either the class's presence or the value of the state argument.
     * @param state A Boolean (not just truthy/falsy) value to determine whether the class
     *              should be added or removed.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggleClass(boolean state);

    /**
     * Add or remove one or more classes from each element in the set of matched elements,
     * depending on either the class's presence or the value of the state argument.
     * @param className One or more class names (separated by spaces) to be toggled for
     *                  each element in the matched set.
     * @param state A Boolean (not just truthy/falsy) value to determine whether the class
     *              should be added or removed.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggleClass(String className, boolean state);

    /**
     * Add or remove one or more classes from each element in the set of matched elements,
     * depending on either the class's presence or the value of the state argument.
     * @param function A function that returns class names to be toggled in the class attribute
     *                 of each element in the matched set. Receives the index position of the element
     *                 in the set, the old class value, and the state as arguments.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggleClass(FuncRet3<Integer, String, Boolean> function);

    /**
     * Add or remove one or more classes from each element in the set of matched elements,
     * depending on either the class's presence or the value of the state argument.
     * @param function A function that returns class names to be toggled in the class attribute
     *                 of each element in the matched set. Receives the index position of the element
     *                 in the set, the old class value, and the state as arguments.
     * @param state A Boolean (not just truthy/falsy) value to determine whether the class
     *              should be added or removed.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> toggleClass(FuncRet3<Integer, String, Boolean> function, boolean state);

    /**
     * Execute all handlers and behaviors attached to the matched elements for
     * the given event type.
     * @param event A jQuery.Event object.
     * @param extraParameters Additional parameters to pass along to the event handler.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> trigger(Event event, Object... extraParameters);

    /**
     * Execute all handlers and behaviors attached to the matched elements for
     * the given event type.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param extraParameters Additional parameters to pass along to the event handler.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> trigger(String eventType, Object[] extraParameters);

    /**
     * Execute all handlers and behaviors attached to the matched elements for
     * the given event type.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param extraParameters Additional parameter to pass along to the event handler.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> trigger(String eventType, Object extraParameters);

    /**
     * Execute all handlers attached to an element for an event.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param extraParameters Additional parameters to pass along to the event handler.
     * @return self {@link JQueryElement}
     */
    public native Object triggerHandler(String eventType, Object... extraParameters);

    /**
     * Execute all handlers attached to an element for an event.
     * @param event A jQuery.Event object.
     * @param extraParameters Additional parameters to pass along to the event handler.
     * @return self {@link JQueryElement}
     */
    public native Object triggerHandler(Event event, Object... extraParameters);

    /**
     * Remove a previously-attached event handler from the elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind();

    /**
     * Remove a previously-attached event handler from the elements.
     * @param event A jQuery.Event object.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(Event event);

    /**
     * Remove a previously-attached event handler from the elements.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(String eventType);

    /**
     * Remove a previously-attached event handler from the elements.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(String eventType, EventFunc handler);

    /**
     * Remove a previously-attached event handler from the elements.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(String eventType, EventFunc1 handler);

    /**
     * Remove a previously-attached event handler from the elements.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param handler A handler function previously attached for the event(s), or the special
     *                value false.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(String eventType, EventFunc2 handler);

    /**
     * Remove a previously-attached event handler from the elements.
     * @param eventType A string containing a JavaScript event type, such as click or submit.
     * @param falsed Unbinds the corresponding 'return false' function that was bound
     *               using .bind( eventType, false ).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unbind(String eventType, boolean falsed);

    /**
     * Wrap an HTML structure around each element in the set of matched elements.
     * @param wrappingElement A selector or HTML string specifying the structure to wrap around the
     *                        matched elements. A selector matching more than one element, the first
     *                        element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrap(String wrappingElement);

    /**
     * Wrap an HTML structure around each element in the set of matched elements.
     * @param wrappingElement An element specifying the structure to wrap around the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrap(Element wrappingElement);

    /**
     * Wrap an HTML structure around each element in the set of matched elements.
     * @param wrappingElement A jQuery object specifying the structure to wrap around the matched elements.
     *                        When you pass a jQuery collection containing more than one element, or a
     *                        selector matching more than one element, the first element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrap(JQueryElement wrappingElement);

    /**
     * Wrap an HTML structure around each element in the set of matched elements.
     * @param function A callback function returning the HTML content or jQuery object to wrap around the
     *                 matched elements. Receives the index position of the element in the set as an argument.
     *                 Within the function, this refers to the current element in the set. Must return a String
     *                 or jQuery element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrap(FuncRet1<Integer> function);

    /**
     * Wrap an HTML structure around all elements in the set of matched elements.
     * @param wrappingElement A selector or HTML string specifying the structure to wrap around the
     *                        matched elements. A selector matching more than one element, the first
     *                        element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapAll(String wrappingElement);

    /**
     * Wrap an HTML structure around all elements in the set of matched elements.
     * @param wrappingElement An element specifying the structure to wrap around the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapAll(Element wrappingElement);

    /**
     * Wrap an HTML structure around all elements in the set of matched elements.
     * @param wrappingElement A jQuery object specifying the structure to wrap around the matched elements.
     *                        When you pass a jQuery collection containing more than one element, or a
     *                        selector matching more than one element, the first element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapAll(JQueryElement wrappingElement);

    /**
     * Wrap an HTML structure around all elements in the set of matched elements.
     * @param function A callback function returning the HTML content or jQuery object to wrap around the
     *                 matched elements. Receives the index position of the element in the set as an argument.
     *                 Within the function, this refers to the current element in the set. Must return a String
     *                 or jQuery element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapAll(FuncRet1<Integer> function);

    /**
     * Wrap an HTML structure around the content of each element in the set of matched elements.
     * @param wrappingElement A selector or HTML string specifying the structure to wrap around the
     *                        matched elements. A selector matching more than one element, the first
     *                        element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapInner(String wrappingElement);

    /**
     * Wrap an HTML structure around the content of each element in the set of matched elements.
     * @param wrappingElement An element specifying the structure to wrap around the matched elements.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapInner(Element wrappingElement);

    /**
     * Wrap an HTML structure around the content of each element in the set of matched elements.
     * @param wrappingElement A jQuery object specifying the structure to wrap around the matched elements.
     *                        When you pass a jQuery collection containing more than one element, or a
     *                        selector matching more than one element, the first element will be used.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapInner(JQueryElement wrappingElement);

    /**
     * Wrap an HTML structure around the content of each element in the set of matched elements.
     * @param function A callback function returning the HTML content or jQuery object to wrap around the
     *                 matched elements. Receives the index position of the element in the set as an argument.
     *                 Within the function, this refers to the current element in the set. Must return a String
     *                 or jQuery element.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> wrapInner(FuncRet1<Integer> function);

    /**
     * Remove the parents of the set of matched elements from the DOM,
     * leaving the matched elements in their place.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> unwrap();

    /**
     * Get the current value of the first element in the set of matched elements.
     */
    public native Object val();

    /**
     * Set the value of each element in the set of matched elements.
     * @param value A string of text corresponding to the value of each matched element
     *              to set as selected/checked.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> val(String value);

    /**
     * Set the value of each element in the set of matched elements.
     * @param value a number corresponding to the value of each matched element to set
     *              as selected/checked.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> val(int value);

    /**
     * Set the value of each element in the set of matched elements.
     * @param value An array of strings corresponding to the value of each matched element
     *              to set as selected/checked.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> val(String[] value);

    /**
     * Get the current computed width for the first element in the set of matched elements.
     * <pre><img src="https://api.jquery.com/resources/0042_04_04.png"/></pre>
     */
    public native int width();

    /**
     * Set the CSS width of each element in the set of matched elements.
     * @param width An integer representing the number of pixels.
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> width(int width);

    /**
     * Set the CSS width of each element in the set of matched elements.
     * @param width An integer along with an optional unit of measure appended (as a string).
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> width(String width);

    /**
     * Set the CSS width of each element in the set of matched elements.
     * @param function A function returning the width to set. Receives the index position of
     *                 the element in the set and the old width as arguments. Within the function,
     *                 this refers to the current element in the set. Must return a String or Number
     * @return self {@link JQueryElement}
     */
    public native JQueryElement<T> width(FuncRet2<Integer, Integer> function);
}

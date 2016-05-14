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

import jsinterop.annotations.JsFunction;

/**
 * Represent a Function in JS Environment.
 *
 * @author Ben Dol
 */
public interface Functions {

    // No Return Type

    @FunctionalInterface
    @JsFunction
    interface Func {
        void call();
    }

    @FunctionalInterface
    @JsFunction
    interface Func1<A> {
        void call(A param1);
    }

    @FunctionalInterface
    @JsFunction
    interface Func2<A, B> {
        void call(A param1, B param2);
    }

    @FunctionalInterface
    @JsFunction
    interface Func3<A, B, C> {
        void call(A param1, B param2, C param3);
    }

    // With Object Return Type

    @FunctionalInterface
    @JsFunction
    interface FuncRet {
        Object call();
    }

    @FunctionalInterface
    @JsFunction
    interface FuncRet1<A> {
        Object call(A param1);
    }

    @FunctionalInterface
    @JsFunction
    interface FuncRet2<A, B> {
        Object call(A param1, B param2);
    }

    @FunctionalInterface
    @JsFunction
    interface FuncRet3<A, B, C> {
        Object call(A param1, B param2, C param3);
    }

    // Event Functions

    @FunctionalInterface
    @JsFunction
    interface EventFunc {
        Object call(Event e);
    }

    @FunctionalInterface
    @JsFunction
    interface EventFunc1<A> {
        Object call(Event e, A param1);
    }

    @FunctionalInterface
    @JsFunction
    interface EventFunc2<A, B> {
        Object call(Event e, A param1, B param2);
    }

    @FunctionalInterface
    @JsFunction
    interface EventFunc3<A, B, C> {
        Object call(Event e, A param1, B param2, C param3);
    }

    @FunctionalInterface
    @JsFunction
    interface KeyEventFunc {
        Object call(KeyEvent e);
    }
}

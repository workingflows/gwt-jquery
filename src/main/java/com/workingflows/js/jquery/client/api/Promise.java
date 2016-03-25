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

import com.workingflows.js.jquery.client.api.Functions.FuncRet2;
import jsinterop.annotations.JsType;

/**
 * Represent a JQuery Promise 
 *
 * @author Cristian Rinaldi
 */
@JsType(name = "Promise")
public interface Promise {
    
    Promise then(FuncRet2<Event, Object> f);
    
    Promise done(FuncRet2<Event, Object> f);
    
    Promise when(FuncRet2<Event, Object> f);
    
    Promise fail(FuncRet2<Event, Object> f);
    
    Promise always(FuncRet2<Event, Object> f);
}

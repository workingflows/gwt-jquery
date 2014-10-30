package com.workingflows.js.jquery.client.api;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iron
 */
@JsType(prototype = "jQuery.Event")
public interface Event {

    @JsProperty
    Object data();

    @JsProperty
    Object currentTarget();

    @JsProperty
    Object delegateTarget();

    @JsProperty
    Object result();

    @JsProperty
    String type();

    @JsProperty
    String metaKey();

    @JsProperty
    long timeStamp();

    @JsProperty
    JQueryElement relatedTarget();

    @JsProperty
    String namespace();

    void stopPropagation();

    void stopImmediatePropagation();

    void preventDefault();

    boolean isPropagationStopped();

    boolean isDefaultPrevented();

    boolean isImmediatePropagationStopped();

}

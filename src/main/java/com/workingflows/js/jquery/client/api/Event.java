package com.workingflows.js.jquery.client.api;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.core.Element;

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
    Object getData();

    @JsProperty
    Element getCurrentTarget();

    @JsProperty
    Element getDelegateTarget();

    @JsProperty
    Object getResult();

    @JsProperty
    String getType();

    @JsProperty
    String getMetaKey();

    @JsProperty
    long getTimeStamp();

    @JsProperty
    JQueryElement getRelatedTarget();

    @JsProperty
    String getNamespace();

    void stopPropagation();

    void stopImmediatePropagation();

    void preventDefault();

    boolean isPropagationStopped();

    boolean isDefaultPrevented();

    boolean isImmediatePropagationStopped();

}

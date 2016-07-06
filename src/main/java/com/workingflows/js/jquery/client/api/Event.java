package com.workingflows.js.jquery.client.api;

import com.workingflows.js.jscore.client.api.core.Element;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Event for JQuery.
 * 
 * @author Cristian Rinaldi
 */
@JsType(name = "jQuery", isNative=true)
public class Event {

    @JsProperty
    public native Object getData();

    @JsProperty
    public native Element getCurrentTarget();

    @JsProperty
    public native Element getDelegateTarget();

    @JsProperty
    public native Object getResult();

    @JsProperty
    public native String getType();

    @JsProperty
    public native String getMetaKey();

    @JsProperty
    public native int getTimeStamp();

    @JsProperty
    public native JQueryElement getRelatedTarget();

    @JsProperty
    public native String getNamespace();

    public native void stopPropagation();

    public native void stopImmediatePropagation();

    public native void preventDefault();

    public native Boolean isPropagationStopped();

    public native Boolean isDefaultPrevented();

    public native Boolean isImmediatePropagationStopped();
}

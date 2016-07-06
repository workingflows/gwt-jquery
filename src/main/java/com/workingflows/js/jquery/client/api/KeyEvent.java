package com.workingflows.js.jquery.client.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * KeyEvent for JQuery.
 * 
 * @author Ben Dol
 */
@JsType(isNative=true)
public class KeyEvent extends Event {

    @JsProperty
    public native int getWhich();

    @JsProperty
    public native int getKeyCode();

    @JsProperty
    public native String getCharCode();

    @JsProperty
    public native boolean isShiftKey();

    @JsProperty
    public native boolean isCtrlKey();

    @JsProperty
    public native boolean isAltKey();

    @JsProperty
    public native boolean isCancelable();

    @JsProperty
    public native boolean isBubbles();
}

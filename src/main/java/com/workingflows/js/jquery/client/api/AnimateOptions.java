package com.workingflows.js.jquery.client.api;

import com.workingflows.js.jquery.client.api.Functions.Func;
import com.workingflows.js.jquery.client.api.Functions.Func1;
import com.workingflows.js.jquery.client.api.Functions.Func2;
import com.workingflows.js.jquery.client.api.Functions.Func3;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Ben Dol
 */
@JsType
public class AnimateOptions {

    @JsProperty public native double getDuration();
    @JsProperty public native void setDuration(double duration);

    @JsProperty public native String getEasing();
    @JsProperty public native void setEasing(String easing);

    @JsProperty public native boolean isQueue();
    @JsProperty public native void setQueue(boolean queue);

    @JsProperty public native Object getSpecialEasing();
    @JsProperty public native void setSpecialEasing(Object specialEasing);

    @JsProperty public native Func3<Promise, Double, Double> getProgress();
    @JsProperty public native void setProgress(Func3<Promise, Double, Double> progress);

    @JsProperty public native Func getComplete();
    @JsProperty public native void setComplete(Func complete);

    @JsProperty public native Func1<Promise> getStart();
    @JsProperty public native void setStart(Func1<Promise> start);

    @JsProperty public native Func2<Promise, Boolean> getDone();
    @JsProperty public native void setDone(Func2<Promise, Boolean> done);

    @JsProperty public native Func2<Promise, Boolean> getFail();
    @JsProperty public native void setFail(Func2<Promise, Boolean> fail);

    @JsProperty public native Func2<Promise, Boolean> getAlways();
    @JsProperty public native void setAlways(Func2<Promise, Boolean> always);
}

package org.greenrobot.eventbus.util;

public class ThrowableFailureEvent implements HasExecutionScope {

    /* renamed from: a  reason: collision with root package name */
    public Object f21913a;
    public final boolean suppressErrorUi;
    public final Throwable throwable;

    public ThrowableFailureEvent(Throwable th2) {
        this.throwable = th2;
        this.suppressErrorUi = false;
    }

    public ThrowableFailureEvent(Throwable th2, boolean z10) {
        this.throwable = th2;
        this.suppressErrorUi = z10;
    }

    public Object getExecutionScope() {
        return this.f21913a;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSuppressErrorUi() {
        return this.suppressErrorUi;
    }

    public void setExecutionScope(Object obj) {
        this.f21913a = obj;
    }
}

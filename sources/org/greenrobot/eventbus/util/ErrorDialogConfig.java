package org.greenrobot.eventbus.util;

import android.content.res.Resources;
import org.greenrobot.eventbus.EventBus;

public class ErrorDialogConfig {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f21903a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21904b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21905c;

    /* renamed from: d  reason: collision with root package name */
    public final ExceptionToResourceMapping f21906d;

    /* renamed from: e  reason: collision with root package name */
    public EventBus f21907e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21908f = true;

    /* renamed from: g  reason: collision with root package name */
    public String f21909g;

    /* renamed from: h  reason: collision with root package name */
    public int f21910h;

    /* renamed from: i  reason: collision with root package name */
    public Class<?> f21911i;

    public ErrorDialogConfig(Resources resources, int i10, int i11) {
        this.f21903a = resources;
        this.f21904b = i10;
        this.f21905c = i11;
        this.f21906d = new ExceptionToResourceMapping();
    }

    public EventBus a() {
        EventBus eventBus = this.f21907e;
        return eventBus != null ? eventBus : EventBus.getDefault();
    }

    public ErrorDialogConfig addMapping(Class<? extends Throwable> cls, int i10) {
        this.f21906d.addMapping(cls, i10);
        return this;
    }

    public void disableExceptionLogging() {
        this.f21908f = false;
    }

    public int getMessageIdForThrowable(Throwable th2) {
        Integer mapThrowable = this.f21906d.mapThrowable(th2);
        if (mapThrowable != null) {
            return mapThrowable.intValue();
        }
        String str = EventBus.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No specific message ressource ID found for ");
        sb2.append(th2);
        return this.f21905c;
    }

    public void setDefaultDialogIconId(int i10) {
        this.f21910h = i10;
    }

    public void setDefaultEventTypeOnDialogClosed(Class<?> cls) {
        this.f21911i = cls;
    }

    public void setEventBus(EventBus eventBus) {
        this.f21907e = eventBus;
    }

    public void setTagForLoggingExceptions(String str) {
        this.f21909g = str;
    }
}

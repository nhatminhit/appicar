package com.google.android.exoplayer2.drm;

import d.o0;
import h6.m;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public interface c<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5130a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f5131b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5132c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5133d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5134e = 4;

    public static class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @o0
    Map<String, String> a();

    @o0
    T b();

    @o0
    byte[] c();

    @o0
    a d();

    int getState();
}

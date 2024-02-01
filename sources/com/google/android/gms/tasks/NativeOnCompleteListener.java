package com.google.android.gms.tasks;

import d.m0;
import d.o0;
import e8.a;
import h9.f;
import h9.m;

@a
public class NativeOnCompleteListener implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final long f5980a;

    @a
    public NativeOnCompleteListener(long j10) {
        this.f5980a = j10;
    }

    @a
    public static void b(@m0 m<Object> mVar, long j10) {
        mVar.e(new NativeOnCompleteListener(j10));
    }

    @a
    public void a(@m0 m<Object> mVar) {
        String str;
        Object obj;
        Exception q10;
        if (mVar.v()) {
            obj = mVar.r();
            str = null;
        } else if (mVar.t() || (q10 = mVar.q()) == null) {
            obj = null;
            str = null;
        } else {
            str = q10.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f5980a, obj, mVar.v(), mVar.t(), str);
    }

    @a
    public native void nativeOnComplete(long j10, @o0 Object obj, boolean z10, boolean z11, @o0 String str);
}

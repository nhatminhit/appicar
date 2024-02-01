package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import d.j0;
import d.m0;
import d.o0;
import e8.a;
import g8.g;
import g8.h;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@a
public class LifecycleCallback {
    @a
    @m0
    public final h O;

    @a
    public LifecycleCallback(@m0 h hVar) {
        this.O = hVar;
    }

    @a
    @m0
    public static h c(@m0 Activity activity) {
        return e(new g(activity));
    }

    @a
    @m0
    public static h d(@m0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @a
    @m0
    public static h e(@m0 g gVar) {
        if (gVar.d()) {
            return zzd.L0(gVar.b());
        }
        if (gVar.c()) {
            return zzb.c(gVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static h getChimeraLifecycleFragmentImpl(g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @a
    @j0
    public void a(@m0 String str, @m0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @m0 String[] strArr) {
    }

    @a
    @m0
    public Activity b() {
        Activity p10 = this.O.p();
        s.l(p10);
        return p10;
    }

    @a
    @j0
    public void f(int i10, int i11, @m0 Intent intent) {
    }

    @a
    @j0
    public void g(@o0 Bundle bundle) {
    }

    @a
    @j0
    public void h() {
    }

    @a
    @j0
    public void i() {
    }

    @a
    @j0
    public void j(@m0 Bundle bundle) {
    }

    @a
    @j0
    public void k() {
    }

    @a
    @j0
    public void l() {
    }
}

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import d.m0;
import d.o0;
import g8.f2;
import g8.p1;
import g8.v;
import h9.n;

public final class b0 extends f2 {

    /* renamed from: c  reason: collision with root package name */
    public final p1 f5650c;

    public b0(p1 p1Var, n nVar) {
        super(3, nVar);
        this.f5650c = p1Var;
    }

    public final /* bridge */ /* synthetic */ void d(@m0 v vVar, boolean z10) {
    }

    public final boolean f(u uVar) {
        return this.f5650c.f8253a.f();
    }

    @o0
    public final Feature[] g(u uVar) {
        return this.f5650c.f8253a.c();
    }

    public final void h(u uVar) throws RemoteException {
        this.f5650c.f8253a.d(uVar.s(), this.f8211b);
        f.a b10 = this.f5650c.f8253a.b();
        if (b10 != null) {
            uVar.u().put(b10, this.f5650c);
        }
    }
}

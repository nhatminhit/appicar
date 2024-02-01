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

public final class c0 extends f2 {

    /* renamed from: c  reason: collision with root package name */
    public final f.a f5652c;

    public c0(f.a aVar, n nVar) {
        super(4, nVar);
        this.f5652c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(@m0 v vVar, boolean z10) {
    }

    public final boolean f(u uVar) {
        p1 p1Var = (p1) uVar.u().get(this.f5652c);
        return p1Var != null && p1Var.f8253a.f();
    }

    @o0
    public final Feature[] g(u uVar) {
        p1 p1Var = (p1) uVar.u().get(this.f5652c);
        if (p1Var == null) {
            return null;
        }
        return p1Var.f8253a.c();
    }

    public final void h(u uVar) throws RemoteException {
        p1 p1Var = (p1) uVar.u().remove(this.f5652c);
        if (p1Var != null) {
            p1Var.f8254b.b(uVar.s(), this.f8211b);
            p1Var.f8253a.a();
            return;
        }
        this.f8211b.e(Boolean.FALSE);
    }
}

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import d.z;
import g8.m;
import h9.n;

public final class q0 implements m, v1 {

    /* renamed from: a  reason: collision with root package name */
    public final p0 f5906a;
    @z("this")

    /* renamed from: b  reason: collision with root package name */
    public f f5907b;
    @z("this")

    /* renamed from: c  reason: collision with root package name */
    public boolean f5908c = true;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r0 f5909d;

    public q0(r0 r0Var, f fVar, p0 p0Var) {
        this.f5909d = r0Var;
        this.f5907b = fVar;
        this.f5906a = p0Var;
    }

    public final synchronized void a(f fVar) {
        f fVar2 = this.f5907b;
        if (fVar2 != fVar) {
            fVar2.a();
            this.f5907b = fVar;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        f.a b10;
        boolean z10;
        d2 d2Var = (d2) obj;
        n nVar = (n) obj2;
        synchronized (this) {
            b10 = this.f5907b.b();
            z10 = this.f5908c;
            this.f5907b.a();
        }
        if (b10 == null) {
            nVar.c(Boolean.FALSE);
        } else {
            this.f5906a.a(d2Var, b10, z10, nVar);
        }
    }

    public final synchronized f b() {
        return this.f5907b;
    }

    public final void l() {
        f.a b10;
        synchronized (this) {
            this.f5908c = false;
            b10 = this.f5907b.b();
        }
        if (b10 != null) {
            this.f5909d.S(b10, 2441);
        }
    }
}

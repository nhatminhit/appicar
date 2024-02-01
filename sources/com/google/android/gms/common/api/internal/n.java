package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import d.o0;
import f8.a;
import g8.g2;
import g8.z;
import j8.s;
import java.util.Set;

public final class n implements r {

    /* renamed from: a  reason: collision with root package name */
    public final s f5686a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5687b = false;

    public n(s sVar) {
        this.f5686a = sVar;
    }

    public final void a(ConnectionResult connectionResult, a aVar, boolean z10) {
    }

    public final void b(@o0 Bundle bundle) {
    }

    public final void c() {
        if (this.f5687b) {
            this.f5687b = false;
            this.f5686a.s(new z(this, this));
        }
    }

    public final void d(int i10) {
        this.f5686a.e((ConnectionResult) null);
        this.f5686a.f5734c0.b(i10, this.f5687b);
    }

    public final void e() {
    }

    public final b.a f(b.a aVar) {
        h(aVar);
        return aVar;
    }

    public final boolean g() {
        if (this.f5687b) {
            return false;
        }
        Set<g2> set = this.f5686a.f5733b0.f5731z;
        if (set == null || set.isEmpty()) {
            this.f5686a.e((ConnectionResult) null);
            return true;
        }
        this.f5687b = true;
        for (g2 k10 : set) {
            k10.k();
        }
        return false;
    }

    public final b.a h(b.a aVar) {
        try {
            this.f5686a.f5733b0.A.a(aVar);
            q qVar = this.f5686a.f5733b0;
            a.f fVar = (a.f) qVar.f5723r.get(aVar.y());
            s.m(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.f5686a.U.containsKey(aVar.y())) {
                aVar.A(fVar);
            } else {
                aVar.a(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f5686a.s(new m(this, this));
        }
        return aVar;
    }

    public final void j() {
        if (this.f5687b) {
            this.f5687b = false;
            this.f5686a.f5733b0.A.b();
            g();
        }
    }
}

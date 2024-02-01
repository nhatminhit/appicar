package com.google.android.gms.internal.location;

import android.location.Location;
import f8.a;
import h9.c;
import h9.m;
import h9.n;

public final /* synthetic */ class k0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f5884a;

    public /* synthetic */ k0(n nVar) {
        this.f5884a = nVar;
    }

    public final Object a(m mVar) {
        n nVar = this.f5884a;
        a aVar = r0.f5913n;
        if (mVar.v()) {
            nVar.e((Location) mVar.r());
            return null;
        }
        Exception q10 = mVar.q();
        q10.getClass();
        nVar.d(q10);
        return null;
    }
}

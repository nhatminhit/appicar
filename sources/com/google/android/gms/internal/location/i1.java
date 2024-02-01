package com.google.android.gms.internal.location;

import android.os.RemoteException;
import h9.i;
import j8.l;

public final /* synthetic */ class i1 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f5875a;

    public /* synthetic */ i1(l lVar) {
        this.f5875a = lVar;
    }

    public final void b() {
        l lVar = this.f5875a;
        int i10 = d2.F0;
        try {
            lVar.cancel();
        } catch (RemoteException unused) {
        }
    }
}

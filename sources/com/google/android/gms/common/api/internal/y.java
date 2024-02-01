package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.i;
import f8.a;
import h9.n;

public final class y extends h {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i.a f5738e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(i.a aVar, f fVar, Feature[] featureArr, boolean z10, int i10) {
        super(fVar, featureArr, z10, i10);
        this.f5738e = aVar;
    }

    public final void d(a.b bVar, n<Void> nVar) throws RemoteException {
        this.f5738e.f5675a.accept(bVar, nVar);
    }
}

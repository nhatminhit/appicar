package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import f8.a;
import f8.k;

public final class s extends u {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Location f5916t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(v vVar, k kVar, Location location) {
        super(kVar);
        this.f5916t = location;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).J0(this.f5916t, v.m(this));
    }
}

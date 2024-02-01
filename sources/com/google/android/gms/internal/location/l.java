package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import f8.a;
import f8.k;

public final class l extends u {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ f f5887t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LocationRequest f5888u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(v vVar, k kVar, f fVar, LocationRequest locationRequest) {
        super(kVar);
        this.f5887t = fVar;
        this.f5888u = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).F0(new t(this.f5887t), this.f5888u, v.m(this));
    }
}

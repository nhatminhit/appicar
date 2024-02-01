package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.location.LocationRequest;
import f8.a;
import f8.k;

public final class m extends u {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ f f5892t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LocationRequest f5893u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(v vVar, k kVar, f fVar, LocationRequest locationRequest) {
        super(kVar);
        this.f5892t = fVar;
        this.f5893u = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).E0(new t(this.f5892t), this.f5893u, v.m(this));
    }
}

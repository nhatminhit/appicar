package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsRequest;
import f8.a;
import f8.k;
import j8.s;

public final class d1 extends e1 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ LocationSettingsRequest f5862t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, k kVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(kVar);
        this.f5862t = locationSettingsRequest;
    }

    public final /* synthetic */ void w(a.b bVar) throws RemoteException {
        d2 d2Var = (d2) bVar;
        LocationSettingsRequest locationSettingsRequest = this.f5862t;
        s.b(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((g3) d2Var.M()).t0(locationSettingsRequest, new u1(this), (String) null);
    }
}

package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsRequest;
import g8.m;
import h9.n;
import j8.s;

public final /* synthetic */ class g1 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocationSettingsRequest f5867a;

    public /* synthetic */ g1(LocationSettingsRequest locationSettingsRequest) {
        this.f5867a = locationSettingsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        LocationSettingsRequest locationSettingsRequest = this.f5867a;
        d2 d2Var = (d2) obj;
        n nVar = (n) obj2;
        s.b(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((g3) d2Var.M()).t0(locationSettingsRequest, new t1(nVar), (String) null);
    }
}

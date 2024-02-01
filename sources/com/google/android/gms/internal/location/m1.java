package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.location.LocationResult;
import d9.l;
import h9.n;

public final class m1 extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f5894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d2 f5895b;

    public m1(d2 d2Var, n nVar) {
        this.f5895b = d2Var;
        this.f5894a = nVar;
    }

    public final void b(LocationResult locationResult) {
        this.f5894a.e(locationResult.f1());
        try {
            this.f5895b.v0(g.c(this, "GetCurrentLocation"), false, new n());
        } catch (RemoteException unused) {
        }
    }
}

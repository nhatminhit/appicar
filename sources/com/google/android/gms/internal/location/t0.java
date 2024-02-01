package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import f8.a;
import f8.k;

public final class t0 extends w0 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ GeofencingRequest f5919t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5920u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, k kVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(kVar);
        this.f5919t = geofencingRequest;
        this.f5920u = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).A0(this.f5919t, this.f5920u, x0.e(this));
    }
}

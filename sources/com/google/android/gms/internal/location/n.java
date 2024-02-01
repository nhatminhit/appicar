package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import f8.a;
import f8.k;

public final class n extends u {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5897t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LocationRequest f5898u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(v vVar, k kVar, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(kVar);
        this.f5897t = pendingIntent;
        this.f5898u = locationRequest;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).G0(this.f5897t, this.f5898u, v.m(this));
    }
}

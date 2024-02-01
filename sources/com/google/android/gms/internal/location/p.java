package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import f8.a;
import f8.k;

public final class p extends u {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5903t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(v vVar, k kVar, PendingIntent pendingIntent) {
        super(kVar);
        this.f5903t = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).x0(this.f5903t, v.m(this), (Object) null);
    }
}

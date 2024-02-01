package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import f8.a;
import f8.k;

public final class u0 extends w0 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5921t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, k kVar, PendingIntent pendingIntent) {
        super(kVar);
        this.f5921t = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((d2) bVar).H0(this.f5921t, x0.e(this));
    }
}

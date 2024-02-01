package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f8.a;
import f8.k;

public final class m3 extends n3 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5896t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m3(o3 o3Var, k kVar, PendingIntent pendingIntent) {
        super(kVar);
        this.f5896t = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        ((y2) bVar).u0(this.f5896t);
        o(Status.U);
    }
}

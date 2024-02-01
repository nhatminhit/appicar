package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f8.a;
import f8.k;
import j8.s;

public final class l3 extends n3 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f5890t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5891u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l3(o3 o3Var, k kVar, long j10, PendingIntent pendingIntent) {
        super(kVar);
        this.f5890t = j10;
        this.f5891u = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void w(a.b bVar) throws RemoteException {
        y2 y2Var = (y2) bVar;
        long j10 = this.f5890t;
        PendingIntent pendingIntent = this.f5891u;
        s.l(pendingIntent);
        s.b(j10 >= 0, "detectionIntervalMillis must be >= 0");
        ((g3) y2Var.M()).g1(j10, true, pendingIntent);
        o(Status.U);
    }
}

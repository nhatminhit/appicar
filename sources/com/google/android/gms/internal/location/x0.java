package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.location.GeofencingRequest;
import d9.f;
import d9.h;
import f8.k;
import f8.o;
import h9.n;
import java.util.List;

public final class x0 implements h {
    public static /* bridge */ /* synthetic */ n e(b.C0094b bVar) {
        n nVar = new n();
        nVar.a().e(new s0(bVar));
        return nVar;
    }

    public final o<Status> a(k kVar, PendingIntent pendingIntent) {
        return kVar.m(new u0(this, kVar, pendingIntent));
    }

    public final o<Status> b(k kVar, List<String> list) {
        return kVar.m(new v0(this, kVar, list));
    }

    @Deprecated
    public final o<Status> c(k kVar, List<f> list, PendingIntent pendingIntent) {
        GeofencingRequest.a aVar = new GeofencingRequest.a();
        aVar.b(list);
        aVar.d(5);
        return kVar.m(new t0(this, kVar, aVar.c(), pendingIntent));
    }

    public final o<Status> d(k kVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return kVar.m(new t0(this, kVar, geofencingRequest, pendingIntent));
    }
}

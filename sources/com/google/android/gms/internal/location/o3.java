package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import d9.b;
import f8.k;
import f8.o;

public final class o3 implements b {
    public final o<Status> a(k kVar, long j10, PendingIntent pendingIntent) {
        return kVar.m(new l3(this, kVar, j10, pendingIntent));
    }

    public final o<Status> b(k kVar, PendingIntent pendingIntent) {
        return kVar.m(new m3(this, kVar, pendingIntent));
    }
}

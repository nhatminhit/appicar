package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.location.LocationRequest;
import f8.a;
import g8.m;
import h9.n;

public final /* synthetic */ class a0 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5847a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LocationRequest f5848b;

    public /* synthetic */ a0(PendingIntent pendingIntent, LocationRequest locationRequest) {
        this.f5847a = pendingIntent;
        this.f5848b = locationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        a aVar = r0.f5913n;
        ((d2) obj).G0(this.f5847a, this.f5848b, (n) obj2);
    }
}

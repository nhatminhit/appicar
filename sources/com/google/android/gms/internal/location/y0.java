package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;
import g8.m;
import h9.n;

public final /* synthetic */ class y0 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GeofencingRequest f5928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5929b;

    public /* synthetic */ y0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f5928a = geofencingRequest;
        this.f5929b = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((d2) obj).A0(this.f5928a, this.f5929b, (n) obj2);
    }
}

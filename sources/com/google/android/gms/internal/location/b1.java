package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.GeofencingRequest;
import d.m0;
import d9.i;
import f8.a;
import f8.j;
import g8.q;
import h9.m;
import java.util.List;

public final class b1 extends j implements i {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f5853m = 0;

    public b1(@m0 Activity activity) {
        super(activity, r0.f5913n, a.d.f7423w, j.a.f7467c);
    }

    public b1(@m0 Context context) {
        super(context, r0.f5913n, a.d.f7423w, j.a.f7467c);
    }

    public final m<Void> a(PendingIntent pendingIntent) {
        return U(q.a().c(new a1(pendingIntent)).f(2425).a());
    }

    public final m<Void> d(List<String> list) {
        return U(q.a().c(new z0(list)).f(2425).a());
    }

    public final m<Void> y(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return U(q.a().c(new y0(geofencingRequest.f1(X()), pendingIntent)).f(2424).a());
    }
}

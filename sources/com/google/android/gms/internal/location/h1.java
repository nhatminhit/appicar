package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.location.LocationSettingsRequest;
import d.m0;
import d9.o;
import d9.u;
import f8.a;
import f8.j;
import g8.q;
import h9.m;

public final class h1 extends j implements u {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f5872m = 0;

    public h1(@m0 Activity activity) {
        super(activity, r0.f5913n, a.d.f7423w, j.a.f7467c);
    }

    public h1(@m0 Context context) {
        super(context, r0.f5913n, a.d.f7423w, j.a.f7467c);
    }

    public final m<o> b(LocationSettingsRequest locationSettingsRequest) {
        return O(q.a().c(new g1(locationSettingsRequest)).f(2426).a());
    }
}

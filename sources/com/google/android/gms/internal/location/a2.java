package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.f;
import d9.m;

public final class a2 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Location f5850a;

    public a2(c2 c2Var, Location location) {
        this.f5850a = location;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((m) obj).onLocationChanged(this.f5850a);
    }

    public final void b() {
    }
}

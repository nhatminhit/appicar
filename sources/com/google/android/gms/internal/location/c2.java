package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.f;
import d9.w0;

public final class c2 extends w0 {
    public final v1 O;

    public c2(v1 v1Var) {
        this.O = v1Var;
    }

    public final void P(Location location) {
        this.O.b().d(new a2(this, location));
    }

    public final void Y1() {
        this.O.b().a();
    }

    public final c2 b0(f fVar) {
        this.O.a(fVar);
        return this;
    }

    public final void h() {
        this.O.b().d(new b2(this));
    }
}

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.b;
import d.m0;
import f8.a;
import f8.j;
import f8.u;
import g8.g2;
import g8.y;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class v extends y {
    @NotOnlyInitialized

    /* renamed from: f  reason: collision with root package name */
    public final j f5737f;

    public v(j jVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f5737f = jVar;
    }

    public final void H(g2 g2Var) {
    }

    public final void I(g2 g2Var) {
    }

    public final <A extends a.b, R extends u, T extends b.a<R, A>> T l(@m0 T t10) {
        return this.f5737f.N(t10);
    }

    public final <A extends a.b, T extends b.a<? extends u, A>> T m(@m0 T t10) {
        return this.f5737f.T(t10);
    }

    public final Context q() {
        return this.f5737f.W();
    }

    public final Looper r() {
        return this.f5737f.Z();
    }
}

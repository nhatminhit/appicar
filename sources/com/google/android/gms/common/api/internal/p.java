package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import d.o0;
import f8.a;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class p implements r {
    @NotOnlyInitialized

    /* renamed from: a  reason: collision with root package name */
    public final s f5709a;

    public p(s sVar) {
        this.f5709a = sVar;
    }

    public final void a(ConnectionResult connectionResult, a aVar, boolean z10) {
    }

    public final void b(@o0 Bundle bundle) {
    }

    public final void c() {
        this.f5709a.d();
    }

    public final void d(int i10) {
    }

    public final void e() {
        for (a.f d10 : this.f5709a.T.values()) {
            d10.d();
        }
        this.f5709a.f5733b0.f5724s = Collections.emptySet();
    }

    public final b.a f(b.a aVar) {
        this.f5709a.f5733b0.f5716k.add(aVar);
        return aVar;
    }

    public final boolean g() {
        return true;
    }

    public final b.a h(b.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}

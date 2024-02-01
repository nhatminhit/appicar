package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.f;
import d.z;

public final class t implements v1 {
    @z("this")

    /* renamed from: a  reason: collision with root package name */
    public f f5918a;

    public t(f fVar) {
        this.f5918a = fVar;
    }

    public final synchronized void a(f fVar) {
        f fVar2 = this.f5918a;
        if (fVar2 != fVar) {
            fVar2.a();
            this.f5918a = fVar;
        }
    }

    public final synchronized f b() {
        return this.f5918a;
    }

    public final void l() {
    }
}

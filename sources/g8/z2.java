package g8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.l;
import d.m0;
import d.o0;

public final class z2 implements g1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f8288a;

    public /* synthetic */ z2(l lVar, y2 y2Var) {
        this.f8288a = lVar;
    }

    public final void a(@o0 Bundle bundle) {
        this.f8288a.f5683a0.lock();
        try {
            l.B(this.f8288a, bundle);
            this.f8288a.X = ConnectionResult.f5624r0;
            l.C(this.f8288a);
        } finally {
            this.f8288a.f5683a0.unlock();
        }
    }

    public final void b(int i10, boolean z10) {
        this.f8288a.f5683a0.lock();
        try {
            l lVar = this.f8288a;
            if (!lVar.Z && lVar.Y != null) {
                if (lVar.Y.h1()) {
                    this.f8288a.Z = true;
                    this.f8288a.S.D(i10);
                }
            }
            this.f8288a.Z = false;
            l.A(this.f8288a, i10, z10);
        } finally {
            this.f8288a.f5683a0.unlock();
        }
    }

    public final void c(@m0 ConnectionResult connectionResult) {
        this.f8288a.f5683a0.lock();
        try {
            this.f8288a.X = connectionResult;
            l.C(this.f8288a);
        } finally {
            this.f8288a.f5683a0.unlock();
        }
    }
}

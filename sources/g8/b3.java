package g8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.l;
import d.m0;
import d.o0;

public final class b3 implements g1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f8188a;

    public /* synthetic */ b3(l lVar, a3 a3Var) {
        this.f8188a = lVar;
    }

    public final void a(@o0 Bundle bundle) {
        this.f8188a.f5683a0.lock();
        try {
            this.f8188a.Y = ConnectionResult.f5624r0;
            l.C(this.f8188a);
        } finally {
            this.f8188a.f5683a0.unlock();
        }
    }

    public final void b(int i10, boolean z10) {
        this.f8188a.f5683a0.lock();
        try {
            l lVar = this.f8188a;
            if (lVar.Z) {
                lVar.Z = false;
                l.A(this.f8188a, i10, z10);
            } else {
                lVar.Z = true;
                this.f8188a.R.D(i10);
            }
        } finally {
            this.f8188a.f5683a0.unlock();
        }
    }

    public final void c(@m0 ConnectionResult connectionResult) {
        this.f8188a.f5683a0.lock();
        try {
            this.f8188a.Y = connectionResult;
            l.C(this.f8188a);
        } finally {
            this.f8188a.f5683a0.unlock();
        }
    }
}

package g8;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import d.h1;
import d.m0;
import d.o0;
import h9.f;
import h9.m;
import j8.u;
import w8.b;
import w8.d0;

public final class k1 implements f {

    /* renamed from: a  reason: collision with root package name */
    public final d f8232a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8233b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8234c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8235d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8236e;

    @d0
    public k1(d dVar, int i10, c cVar, long j10, long j11, @o0 String str, @o0 String str2) {
        this.f8232a = dVar;
        this.f8233b = i10;
        this.f8234c = cVar;
        this.f8235d = j10;
        this.f8236e = j11;
    }

    @o0
    public static k1 b(d dVar, int i10, c cVar) {
        boolean z10;
        if (!dVar.g()) {
            return null;
        }
        RootTelemetryConfiguration a10 = u.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.f1()) {
            return null;
        } else {
            z10 = a10.g1();
            com.google.android.gms.common.api.internal.u x10 = dVar.x(cVar);
            if (x10 != null) {
                if (!(x10.s() instanceof j8.d)) {
                    return null;
                }
                j8.d dVar2 = (j8.d) x10.s();
                if (dVar2.S() && !dVar2.k()) {
                    ConnectionTelemetryConfiguration c10 = c(x10, dVar2, i10);
                    if (c10 == null) {
                        return null;
                    }
                    x10.E();
                    z10 = c10.h1();
                }
            }
        }
        return new k1(dVar, i10, cVar, z10 ? System.currentTimeMillis() : 0, z10 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    @o0
    public static ConnectionTelemetryConfiguration c(com.google.android.gms.common.api.internal.u uVar, j8.d dVar, int i10) {
        int[] Z0;
        int[] f12;
        ConnectionTelemetryConfiguration Q = dVar.Q();
        if (Q == null || !Q.g1() || ((Z0 = Q.Z0()) != null ? !b.c(Z0, i10) : !((f12 = Q.f1()) == null || !b.c(f12, i10))) || uVar.p() >= Q.X0()) {
            return null;
        }
        return Q;
    }

    @h1
    public final void a(@m0 m mVar) {
        com.google.android.gms.common.api.internal.u x10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        if (this.f8232a.g()) {
            RootTelemetryConfiguration a10 = u.b().a();
            if ((a10 == null || a10.f1()) && (x10 = this.f8232a.x(this.f8234c)) != null && (x10.s() instanceof j8.d)) {
                j8.d dVar = (j8.d) x10.s();
                boolean z10 = true;
                int i15 = 0;
                boolean z11 = this.f8235d > 0;
                int H = dVar.H();
                if (a10 != null) {
                    boolean g12 = z11 & a10.g1();
                    int X0 = a10.X0();
                    int Z0 = a10.Z0();
                    i12 = a10.C1();
                    if (dVar.S() && !dVar.k()) {
                        ConnectionTelemetryConfiguration c10 = c(x10, dVar, this.f8233b);
                        if (c10 != null) {
                            if (!c10.h1() || this.f8235d <= 0) {
                                z10 = false;
                            }
                            Z0 = c10.X0();
                            g12 = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = X0;
                    i10 = Z0;
                } else {
                    i12 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                d dVar2 = this.f8232a;
                if (mVar.v()) {
                    i13 = 0;
                } else {
                    if (mVar.t()) {
                        i15 = 100;
                    } else {
                        Exception q10 = mVar.q();
                        if (q10 instanceof f8.b) {
                            Status a11 = ((f8.b) q10).a();
                            int f12 = a11.f1();
                            ConnectionResult X02 = a11.X0();
                            i13 = X02 == null ? -1 : X02.X0();
                            i15 = f12;
                        } else {
                            i15 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f8235d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - this.f8236e);
                    j11 = j12;
                    j10 = currentTimeMillis;
                } else {
                    j11 = 0;
                    j10 = 0;
                    i14 = -1;
                }
                dVar2.L(new MethodInvocation(this.f8233b, i15, i13, j11, j10, (String) null, (String) null, H, i14), i12, (long) i11, i10);
            }
        }
    }
}

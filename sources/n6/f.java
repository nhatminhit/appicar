package n6;

import d.o0;
import j6.o;
import j6.q;
import j6.r;
import n6.e;
import p3.a;
import w7.p;
import w7.q0;
import w7.w;

public final class f implements e.b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f10914h = "VbriSeeker";

    /* renamed from: d  reason: collision with root package name */
    public final long[] f10915d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f10916e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10917f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10918g;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f10915d = jArr;
        this.f10916e = jArr2;
        this.f10917f = j10;
        this.f10918g = j11;
    }

    @o0
    public static f a(long j10, long j11, o oVar, w wVar) {
        int i10;
        long j12 = j10;
        o oVar2 = oVar;
        w wVar2 = wVar;
        wVar2.R(10);
        int l10 = wVar.l();
        if (l10 <= 0) {
            return null;
        }
        int i11 = oVar2.f9606d;
        long L0 = q0.L0((long) l10, 1000000 * ((long) (i11 >= 32000 ? 1152 : a.f11391i1)), (long) i11);
        int J = wVar.J();
        int J2 = wVar.J();
        int J3 = wVar.J();
        wVar2.R(2);
        long j13 = j11 + ((long) oVar2.f9605c);
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i12 = 0;
        long j14 = j11;
        while (i12 < J) {
            int i13 = J2;
            jArr[i12] = (((long) i12) * L0) / ((long) J);
            long j15 = j13;
            jArr2[i12] = Math.max(j14, j15);
            if (J3 == 1) {
                i10 = wVar.D();
            } else if (J3 == 2) {
                i10 = wVar.J();
            } else if (J3 == 3) {
                i10 = wVar.G();
            } else if (J3 != 4) {
                return null;
            } else {
                i10 = wVar.H();
            }
            j14 += (long) (i10 * i13);
            i12++;
            j13 = j15;
            J2 = i13;
        }
        if (!(j12 == -1 || j12 == j14)) {
            p.l(f10914h, "VBRI data size mismatch: " + j12 + ", " + j14);
        }
        return new f(jArr, jArr2, L0, j14);
    }

    public long b() {
        return this.f10918g;
    }

    public boolean d() {
        return true;
    }

    public long e(long j10) {
        return this.f10915d[q0.k(this.f10916e, j10, true, true)];
    }

    public q.a i(long j10) {
        int k10 = q0.k(this.f10915d, j10, true, true);
        r rVar = new r(this.f10915d[k10], this.f10916e[k10]);
        if (rVar.f9616a >= j10 || k10 == this.f10915d.length - 1) {
            return new q.a(rVar);
        }
        int i10 = k10 + 1;
        return new q.a(rVar, new r(this.f10915d[i10], this.f10916e[i10]));
    }

    public long j() {
        return this.f10917f;
    }
}

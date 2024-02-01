package n6;

import d.o0;
import j6.o;
import j6.q;
import j6.r;
import n6.e;
import w7.a;
import w7.p;
import w7.q0;
import w7.w;

public final class g implements e.b {

    /* renamed from: j  reason: collision with root package name */
    public static final String f10919j = "XingSeeker";

    /* renamed from: d  reason: collision with root package name */
    public final long f10920d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10921e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10922f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10923g;

    /* renamed from: h  reason: collision with root package name */
    public final long f10924h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public final long[] f10925i;

    public g(long j10, int i10, long j11) {
        this(j10, i10, j11, -1, (long[]) null);
    }

    public g(long j10, int i10, long j11, long j12, @o0 long[] jArr) {
        this.f10920d = j10;
        this.f10921e = i10;
        this.f10922f = j11;
        this.f10925i = jArr;
        this.f10923g = j12;
        this.f10924h = j12 != -1 ? j10 + j12 : -1;
    }

    @o0
    public static g a(long j10, long j11, o oVar, w wVar) {
        int H;
        long j12 = j10;
        o oVar2 = oVar;
        int i10 = oVar2.f9609g;
        int i11 = oVar2.f9606d;
        int l10 = wVar.l();
        if ((l10 & 1) != 1 || (H = wVar.H()) == 0) {
            return null;
        }
        long L0 = q0.L0((long) H, ((long) i10) * 1000000, (long) i11);
        if ((l10 & 6) != 6) {
            return new g(j11, oVar2.f9605c, L0);
        }
        long H2 = (long) wVar.H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = (long) wVar.D();
        }
        if (j12 != -1) {
            long j13 = j11 + H2;
            if (j12 != j13) {
                p.l(f10919j, "XING data size mismatch: " + j12 + ", " + j13);
            }
        }
        return new g(j11, oVar2.f9605c, L0, H2, jArr);
    }

    public long b() {
        return this.f10924h;
    }

    public final long c(int i10) {
        return (this.f10922f * ((long) i10)) / 100;
    }

    public boolean d() {
        return this.f10925i != null;
    }

    public long e(long j10) {
        long j11 = j10 - this.f10920d;
        if (!d() || j11 <= ((long) this.f10921e)) {
            return 0;
        }
        long[] jArr = (long[]) a.g(this.f10925i);
        double d10 = (((double) j11) * 256.0d) / ((double) this.f10923g);
        int k10 = q0.k(jArr, (long) d10, true, true);
        long c10 = c(k10);
        long j12 = jArr[k10];
        int i10 = k10 + 1;
        long c11 = c(i10);
        long j13 = k10 == 99 ? 256 : jArr[i10];
        return c10 + Math.round((j12 == j13 ? 0.0d : (d10 - ((double) j12)) / ((double) (j13 - j12))) * ((double) (c11 - c10)));
    }

    public q.a i(long j10) {
        if (!d()) {
            return new q.a(new r(0, this.f10920d + ((long) this.f10921e)));
        }
        long v10 = q0.v(j10, 0, this.f10922f);
        double d10 = (((double) v10) * 100.0d) / ((double) this.f10922f);
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) a.g(this.f10925i);
                double d12 = (double) jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : (double) jArr[i10 + 1]) - d12));
            }
        }
        return new q.a(new r(v10, this.f10920d + q0.v(Math.round((d11 / 256.0d) * ((double) this.f10923g)), (long) this.f10921e, this.f10923g - 1)));
    }

    public long j() {
        return this.f10922f;
    }
}

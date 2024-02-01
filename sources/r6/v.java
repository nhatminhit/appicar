package r6;

import b6.c;
import d6.f0;
import j6.a;
import j6.j;
import java.io.IOException;
import w7.j0;
import w7.q0;
import w7.w;

public final class v extends j6.a {

    /* renamed from: f  reason: collision with root package name */
    public static final long f12528f = 100000;

    /* renamed from: g  reason: collision with root package name */
    public static final int f12529g = 1000;

    /* renamed from: h  reason: collision with root package name */
    public static final int f12530h = 20000;

    public static final class b implements a.g {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f12531a;

        /* renamed from: b  reason: collision with root package name */
        public final w f12532b;

        public b(j0 j0Var) {
            this.f12531a = j0Var;
            this.f12532b = new w();
        }

        public static void d(w wVar) {
            int d10 = wVar.d();
            if (wVar.a() < 10) {
                wVar.Q(d10);
                return;
            }
            wVar.R(9);
            int D = wVar.D() & 7;
            if (wVar.a() < D) {
                wVar.Q(d10);
                return;
            }
            wVar.R(D);
            if (wVar.a() < 4) {
                wVar.Q(d10);
                return;
            }
            if (v.k(wVar.f14880a, wVar.c()) == 443) {
                wVar.R(4);
                int J = wVar.J();
                if (wVar.a() < J) {
                    wVar.Q(d10);
                    return;
                }
                wVar.R(J);
            }
            while (wVar.a() >= 4 && (r1 = v.k(wVar.f14880a, wVar.c())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                wVar.R(4);
                if (wVar.a() < 2) {
                    wVar.Q(d10);
                    return;
                } else {
                    wVar.Q(Math.min(wVar.d(), wVar.c() + wVar.J()));
                }
            }
        }

        public a.f a(j jVar, long j10, a.c cVar) throws IOException, InterruptedException {
            long position = jVar.getPosition();
            int min = (int) Math.min(f0.f6302r, jVar.getLength() - position);
            this.f12532b.M(min);
            jVar.k(this.f12532b.f14880a, 0, min);
            return c(this.f12532b, j10, position);
        }

        public void b() {
            this.f12532b.N(q0.f14791f);
        }

        public final a.f c(w wVar, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (wVar.a() >= 4) {
                if (v.k(wVar.f14880a, wVar.c()) != 442) {
                    wVar.R(1);
                } else {
                    wVar.R(4);
                    long l10 = w.l(wVar);
                    if (l10 != c.f4201b) {
                        long b10 = this.f12531a.b(l10);
                        if (b10 > j10) {
                            return j12 == c.f4201b ? a.f.d(b10, j11) : a.f.e(j11 + ((long) i11));
                        }
                        if (100000 + b10 > j10) {
                            return a.f.e(j11 + ((long) wVar.c()));
                        }
                        i11 = wVar.c();
                        j12 = b10;
                    }
                    d(wVar);
                    i10 = wVar.c();
                }
            }
            return j12 != c.f4201b ? a.f.f(j12, j11 + ((long) i10)) : a.f.f9550h;
        }
    }

    public v(j0 j0Var, long j10, long j11) {
        super(new a.b(), new b(j0Var), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}

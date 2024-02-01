package r6;

import b6.c;
import j6.a;
import j6.j;
import java.io.IOException;
import w7.j0;
import w7.q0;
import w7.w;

public final class d0 extends j6.a {

    /* renamed from: f  reason: collision with root package name */
    public static final long f12157f = 100000;

    /* renamed from: g  reason: collision with root package name */
    public static final int f12158g = 940;

    /* renamed from: h  reason: collision with root package name */
    public static final int f12159h = 112800;

    public static final class a implements a.g {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f12160a;

        /* renamed from: b  reason: collision with root package name */
        public final w f12161b = new w();

        /* renamed from: c  reason: collision with root package name */
        public final int f12162c;

        public a(int i10, j0 j0Var) {
            this.f12162c = i10;
            this.f12160a = j0Var;
        }

        public a.f a(j jVar, long j10, a.c cVar) throws IOException, InterruptedException {
            long position = jVar.getPosition();
            int min = (int) Math.min(112800, jVar.getLength() - position);
            this.f12161b.M(min);
            jVar.k(this.f12161b.f14880a, 0, min);
            return c(this.f12161b, j10, position);
        }

        public void b() {
            this.f12161b.N(q0.f14791f);
        }

        public final a.f c(w wVar, long j10, long j11) {
            int a10;
            int i10;
            w wVar2 = wVar;
            long j12 = j11;
            int d10 = wVar.d();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (wVar.a() >= 188 && (i10 = a10 + 188) <= d10) {
                long b10 = i0.b(wVar2, (a10 = i0.a(wVar2.f14880a, wVar.c(), d10)), this.f12162c);
                if (b10 != c.f4201b) {
                    long b11 = this.f12160a.b(b10);
                    if (b11 > j10) {
                        return j15 == c.f4201b ? a.f.d(b11, j12) : a.f.e(j12 + j14);
                    }
                    if (100000 + b11 > j10) {
                        return a.f.e(j12 + ((long) a10));
                    }
                    j14 = (long) a10;
                    j15 = b11;
                }
                wVar2.Q(i10);
                j13 = (long) i10;
            }
            return j15 != c.f4201b ? a.f.f(j15, j12 + j13) : a.f.f9550h;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d0(w7.j0 r17, long r18, long r20, int r22) {
        /*
            r16 = this;
            j6.a$b r1 = new j6.a$b
            r1.<init>()
            r6.d0$a r2 = new r6.d0$a
            r0 = r17
            r3 = r22
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.d0.<init>(w7.j0, long, long, int):void");
    }
}

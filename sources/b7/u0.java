package b7;

import b6.c;
import b6.c0;
import b6.v0;
import b7.w;
import b7.y;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import g6.f;
import java.util.ArrayList;
import java.util.List;
import t7.r0;
import w7.q0;
import w7.s;

public final class u0 extends c {
    public static final int U = 44100;
    public static final int V = 2;
    public static final int W = 2;
    public static final Format X = Format.q((String) null, s.f14841z, (String) null, -1, -1, 2, U, 2, (List<byte[]>) null, (DrmInitData) null, 0, (String) null);
    public static final byte[] Y = new byte[(q0.Z(2, 2) * 1024)];
    public final long T;

    public static final class a implements w {
        public static final TrackGroupArray Q = new TrackGroupArray(new TrackGroup(u0.X));
        public final long O;
        public final ArrayList<r0> P = new ArrayList<>();

        public a(long j10) {
            this.O = j10;
        }

        public final long a(long j10) {
            return q0.v(j10, 0, this.O);
        }

        public long b() {
            return Long.MIN_VALUE;
        }

        public long c(long j10, v0 v0Var) {
            return a(j10);
        }

        public boolean d(long j10) {
            return false;
        }

        public long e() {
            return Long.MIN_VALUE;
        }

        public void f(long j10) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long h(com.google.android.exoplayer2.trackselection.f[] r5, boolean[] r6, b7.r0[] r7, boolean[] r8, long r9) {
            /*
                r4 = this;
                long r9 = r4.a(r9)
                r0 = 0
            L_0x0005:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x003b
                r1 = r7[r0]
                if (r1 == 0) goto L_0x001c
                r2 = r5[r0]
                if (r2 == 0) goto L_0x0014
                boolean r2 = r6[r0]
                if (r2 != 0) goto L_0x001c
            L_0x0014:
                java.util.ArrayList<b7.r0> r2 = r4.P
                r2.remove(r1)
                r1 = 0
                r7[r0] = r1
            L_0x001c:
                r1 = r7[r0]
                if (r1 != 0) goto L_0x0038
                r1 = r5[r0]
                if (r1 == 0) goto L_0x0038
                b7.u0$b r1 = new b7.u0$b
                long r2 = r4.O
                r1.<init>(r2)
                r1.b(r9)
                java.util.ArrayList<b7.r0> r2 = r4.P
                r2.add(r1)
                r7[r0] = r1
                r1 = 1
                r8[r0] = r1
            L_0x0038:
                int r0 = r0 + 1
                goto L_0x0005
            L_0x003b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: b7.u0.a.h(com.google.android.exoplayer2.trackselection.f[], boolean[], b7.r0[], boolean[], long):long");
        }

        public /* synthetic */ List m(List list) {
            return v.a(this, list);
        }

        public void n(w.a aVar, long j10) {
            aVar.i(this);
        }

        public void o() {
        }

        public long p(long j10) {
            long a10 = a(j10);
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                ((b) this.P.get(i10)).b(a10);
            }
            return a10;
        }

        public long s() {
            return c.f4201b;
        }

        public TrackGroupArray t() {
            return Q;
        }

        public void u(long j10, boolean z10) {
        }
    }

    public static final class b implements r0 {
        public final long O;
        public boolean P;
        public long Q;

        public b(long j10) {
            this.O = u0.v(j10);
            b(0);
        }

        public void a() {
        }

        public void b(long j10) {
            this.Q = q0.v(u0.v(j10), 0, this.O);
        }

        public boolean isReady() {
            return true;
        }

        public int l(long j10) {
            long j11 = this.Q;
            b(j10);
            return (int) ((this.Q - j11) / ((long) u0.Y.length));
        }

        public int q(c0 c0Var, f fVar, boolean z10) {
            if (!this.P || z10) {
                c0Var.f4302c = u0.X;
                this.P = true;
                return -5;
            }
            long j10 = this.O - this.Q;
            if (j10 == 0) {
                fVar.i(4);
                return -4;
            }
            int min = (int) Math.min((long) u0.Y.length, j10);
            fVar.r(min);
            fVar.i(1);
            fVar.Q.put(u0.Y, 0, min);
            fVar.R = u0.w(this.Q);
            this.Q += (long) min;
            return -4;
        }
    }

    public u0(long j10) {
        w7.a.a(j10 >= 0);
        this.T = j10;
    }

    public static long v(long j10) {
        return ((long) q0.Z(2, 2)) * ((j10 * 44100) / 1000000);
    }

    public static long w(long j10) {
        return ((j10 / ((long) q0.Z(2, 2))) * 1000000) / 44100;
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        return new a(this.T);
    }

    public void h() {
    }

    public void i(w wVar) {
    }

    public void o(@o0 r0 r0Var) {
        p(new v0(this.T, true, false), (Object) null);
    }

    public void q() {
    }
}

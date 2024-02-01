package b7;

import b6.c;
import b6.c0;
import b6.v0;
import b7.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import g6.f;
import java.io.IOException;
import java.util.List;
import w7.q0;
import w7.s;

public final class e implements w, w.a {
    public final w O;
    public w.a P;
    public a[] Q = new a[0];
    public long R;
    public long S;
    public long T;

    public final class a implements r0 {
        public final r0 O;
        public boolean P;

        public a(r0 r0Var) {
            this.O = r0Var;
        }

        public void a() throws IOException {
            this.O.a();
        }

        public void b() {
            this.P = false;
        }

        public boolean isReady() {
            return !e.this.j() && this.O.isReady();
        }

        public int l(long j10) {
            if (e.this.j()) {
                return -3;
            }
            return this.O.l(j10);
        }

        public int q(c0 c0Var, f fVar, boolean z10) {
            if (e.this.j()) {
                return -3;
            }
            if (this.P) {
                fVar.p(4);
                return -4;
            }
            int q10 = this.O.q(c0Var, fVar, z10);
            if (q10 == -5) {
                Format format = c0Var.f4302c;
                int i10 = format.f5080m0;
                if (!(i10 == 0 && format.f5081n0 == 0)) {
                    e eVar = e.this;
                    int i11 = 0;
                    if (eVar.S != 0) {
                        i10 = 0;
                    }
                    if (eVar.T == Long.MIN_VALUE) {
                        i11 = format.f5081n0;
                    }
                    c0Var.f4302c = format.e(i10, i11);
                }
                return -5;
            }
            e eVar2 = e.this;
            long j10 = eVar2.T;
            if (j10 == Long.MIN_VALUE || ((q10 != -4 || fVar.R < j10) && (q10 != -3 || eVar2.e() != Long.MIN_VALUE))) {
                return q10;
            }
            fVar.j();
            fVar.p(4);
            this.P = true;
            return -4;
        }
    }

    public e(w wVar, boolean z10, long j10, long j11) {
        this.O = wVar;
        this.R = z10 ? j10 : c.f4201b;
        this.S = j10;
        this.T = j11;
    }

    public static boolean r(long j10, com.google.android.exoplayer2.trackselection.f[] fVarArr) {
        if (j10 != 0) {
            for (com.google.android.exoplayer2.trackselection.f fVar : fVarArr) {
                if (fVar != null && !s.l(fVar.l().W)) {
                    return true;
                }
            }
        }
        return false;
    }

    public long b() {
        long b10 = this.O.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.T;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    public long c(long j10, v0 v0Var) {
        long j11 = this.S;
        if (j10 == j11) {
            return j11;
        }
        return this.O.c(j10, g(j10, v0Var));
    }

    public boolean d(long j10) {
        return this.O.d(j10);
    }

    public long e() {
        long e10 = this.O.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.T;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void f(long j10) {
        this.O.f(j10);
    }

    public final v0 g(long j10, v0 v0Var) {
        long v10 = q0.v(v0Var.f4477a, 0, j10 - this.S);
        long j11 = v0Var.f4478b;
        long j12 = this.T;
        long v11 = q0.v(j11, 0, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (v10 == v0Var.f4477a && v11 == v0Var.f4478b) ? v0Var : new v0(v10, v11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long h(com.google.android.exoplayer2.trackselection.f[] r13, boolean[] r14, b7.r0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            b7.e$a[] r2 = new b7.e.a[r2]
            r0.Q = r2
            int r2 = r1.length
            b7.r0[] r9 = new b7.r0[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            b7.e$a[] r3 = r0.Q
            r4 = r1[r2]
            b7.e$a r4 = (b7.e.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            b7.r0 r11 = r4.O
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            b7.w r2 = r0.O
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.h(r3, r4, r5, r6, r7)
            boolean r4 = r12.j()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.S
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = r(r4, r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.R = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.S
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            long r4 = r0.T
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r4 = r10
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            w7.a.i(r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0091
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            b7.e$a[] r4 = r0.Q
            r4[r10] = r11
            goto L_0x0088
        L_0x0073:
            r5 = r1[r10]
            if (r5 == 0) goto L_0x007f
            b7.e$a[] r5 = r0.Q
            r5 = r5[r10]
            b7.r0 r5 = r5.O
            if (r5 == r4) goto L_0x0088
        L_0x007f:
            b7.e$a[] r5 = r0.Q
            b7.e$a r6 = new b7.e$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0088:
            b7.e$a[] r4 = r0.Q
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.e.h(com.google.android.exoplayer2.trackselection.f[], boolean[], b7.r0[], boolean[], long):long");
    }

    public void i(w wVar) {
        this.P.i(this);
    }

    public boolean j() {
        return this.R != c.f4201b;
    }

    public /* synthetic */ List m(List list) {
        return v.a(this, list);
    }

    public void n(w.a aVar, long j10) {
        this.P = aVar;
        this.O.n(this, j10);
    }

    public void o() throws IOException {
        this.O.o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long p(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.R = r0
            b7.e$a[] r0 = r5.Q
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            b7.w r0 = r5.O
            long r0 = r0.p(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.S
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.T
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            w7.a.i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.e.p(long):long");
    }

    /* renamed from: q */
    public void k(w wVar) {
        this.P.k(this);
    }

    public long s() {
        if (j()) {
            long j10 = this.R;
            this.R = c.f4201b;
            long s10 = s();
            return s10 != c.f4201b ? s10 : j10;
        }
        long s11 = this.O.s();
        if (s11 == c.f4201b) {
            return c.f4201b;
        }
        boolean z10 = true;
        w7.a.i(s11 >= this.S);
        long j11 = this.T;
        if (j11 != Long.MIN_VALUE && s11 > j11) {
            z10 = false;
        }
        w7.a.i(z10);
        return s11;
    }

    public TrackGroupArray t() {
        return this.O.t();
    }

    public void u(long j10, boolean z10) {
        this.O.u(j10, z10);
    }

    public void v(long j10, long j11) {
        this.S = j10;
        this.T = j11;
    }
}

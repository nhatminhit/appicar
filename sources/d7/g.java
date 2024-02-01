package d7;

import b6.c;
import b6.c0;
import b6.v0;
import b7.i0;
import b7.q0;
import b7.r0;
import b7.s0;
import com.google.android.exoplayer2.Format;
import d.o0;
import d7.h;
import g6.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t7.g0;
import t7.h0;
import t7.x;
import w7.p;

public class g<T extends h> implements r0, s0, h0.b<d>, h0.f {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f6532k0 = "ChunkSampleStream";
    public final int O;
    public final int[] P;
    public final Format[] Q;
    public final boolean[] R;
    public final T S;
    public final s0.a<g<T>> T;
    public final i0.a U;
    public final g0 V;
    public final h0 W;
    public final f X;
    public final ArrayList<a> Y;
    public final List<a> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final q0 f6533a0;

    /* renamed from: b0  reason: collision with root package name */
    public final q0[] f6534b0;

    /* renamed from: c0  reason: collision with root package name */
    public final c f6535c0;

    /* renamed from: d0  reason: collision with root package name */
    public Format f6536d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public b<T> f6537e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f6538f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f6539g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6540h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f6541i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6542j0;

    public final class a implements r0 {
        public final g<T> O;
        public final q0 P;
        public final int Q;
        public boolean R;

        public a(g<T> gVar, q0 q0Var, int i10) {
            this.O = gVar;
            this.P = q0Var;
            this.Q = i10;
        }

        public void a() throws IOException {
        }

        public final void b() {
            if (!this.R) {
                g.this.U.l(g.this.P[this.Q], g.this.Q[this.Q], 0, (Object) null, g.this.f6539g0);
                this.R = true;
            }
        }

        public void c() {
            w7.a.i(g.this.R[this.Q]);
            g.this.R[this.Q] = false;
        }

        public boolean isReady() {
            g gVar = g.this;
            return gVar.f6542j0 || (!gVar.F() && this.P.u());
        }

        public int l(long j10) {
            if (g.this.F()) {
                return 0;
            }
            b();
            if (g.this.f6542j0 && j10 > this.P.q()) {
                return this.P.g();
            }
            int f10 = this.P.f(j10, true, true);
            if (f10 == -1) {
                return 0;
            }
            return f10;
        }

        public int q(c0 c0Var, f fVar, boolean z10) {
            if (g.this.F()) {
                return -3;
            }
            b();
            q0 q0Var = this.P;
            g gVar = g.this;
            return q0Var.z(c0Var, fVar, z10, gVar.f6542j0, gVar.f6541i0);
        }
    }

    public interface b<T extends h> {
        void a(g<T> gVar);
    }

    @Deprecated
    public g(int i10, int[] iArr, Format[] formatArr, T t10, s0.a<g<T>> aVar, t7.b bVar, long j10, int i11, i0.a aVar2) {
        this(i10, iArr, formatArr, t10, aVar, bVar, j10, (g0) new x(i11), aVar2);
    }

    public g(int i10, int[] iArr, Format[] formatArr, T t10, s0.a<g<T>> aVar, t7.b bVar, long j10, g0 g0Var, i0.a aVar2) {
        this.O = i10;
        this.P = iArr;
        this.Q = formatArr;
        this.S = t10;
        this.T = aVar;
        this.U = aVar2;
        this.V = g0Var;
        this.W = new h0("Loader:ChunkSampleStream");
        this.X = new f();
        ArrayList<a> arrayList = new ArrayList<>();
        this.Y = arrayList;
        this.Z = Collections.unmodifiableList(arrayList);
        int i11 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.f6534b0 = new q0[length];
        this.R = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        q0[] q0VarArr = new q0[i12];
        q0 q0Var = new q0(bVar);
        this.f6533a0 = q0Var;
        iArr2[0] = i10;
        q0VarArr[0] = q0Var;
        while (i11 < length) {
            q0 q0Var2 = new q0(bVar);
            this.f6534b0[i11] = q0Var2;
            int i13 = i11 + 1;
            q0VarArr[i13] = q0Var2;
            iArr2[i13] = iArr[i11];
            i11 = i13;
        }
        this.f6535c0 = new c(iArr2, q0VarArr);
        this.f6538f0 = j10;
        this.f6539g0 = j10;
    }

    public final a A(int i10) {
        a aVar = this.Y.get(i10);
        ArrayList<a> arrayList = this.Y;
        w7.q0.J0(arrayList, i10, arrayList.size());
        this.f6540h0 = Math.max(this.f6540h0, this.Y.size());
        q0 q0Var = this.f6533a0;
        int i11 = 0;
        while (true) {
            q0Var.m(aVar.i(i11));
            q0[] q0VarArr = this.f6534b0;
            if (i11 >= q0VarArr.length) {
                return aVar;
            }
            q0Var = q0VarArr[i11];
            i11++;
        }
    }

    public T B() {
        return this.S;
    }

    public final a C() {
        ArrayList<a> arrayList = this.Y;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean D(int i10) {
        int r10;
        a aVar = this.Y.get(i10);
        if (this.f6533a0.r() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            q0[] q0VarArr = this.f6534b0;
            if (i11 >= q0VarArr.length) {
                return false;
            }
            r10 = q0VarArr[i11].r();
            i11++;
        } while (r10 <= aVar.i(i11));
        return true;
    }

    public final boolean E(d dVar) {
        return dVar instanceof a;
    }

    public boolean F() {
        return this.f6538f0 != c.f4201b;
    }

    public final void G() {
        int L = L(this.f6533a0.r(), this.f6540h0 - 1);
        while (true) {
            int i10 = this.f6540h0;
            if (i10 <= L) {
                this.f6540h0 = i10 + 1;
                H(i10);
            } else {
                return;
            }
        }
    }

    public final void H(int i10) {
        a aVar = this.Y.get(i10);
        Format format = aVar.f6517c;
        if (!format.equals(this.f6536d0)) {
            this.U.l(this.O, format, aVar.f6518d, aVar.f6519e, aVar.f6520f);
        }
        this.f6536d0 = format;
    }

    /* renamed from: I */
    public void k(d dVar, long j10, long j11, boolean z10) {
        d dVar2 = dVar;
        this.U.x(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, dVar.a());
        if (!z10) {
            this.f6533a0.D();
            for (q0 D : this.f6534b0) {
                D.D();
            }
            this.T.k(this);
        }
    }

    /* renamed from: J */
    public void g(d dVar, long j10, long j11) {
        d dVar2 = dVar;
        this.S.b(dVar2);
        this.U.A(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, dVar.a());
        this.T.k(this);
    }

    /* renamed from: K */
    public h0.c j(d dVar, long j10, long j11, IOException iOException, int i10) {
        d dVar2 = dVar;
        long a10 = dVar.a();
        boolean E = E(dVar);
        int size = this.Y.size() - 1;
        boolean z10 = a10 == 0 || !E || !D(size);
        h0.c cVar = null;
        if (this.S.d(dVar, z10, iOException, z10 ? this.V.b(dVar2.f6516b, j11, iOException, i10) : -9223372036854775807L)) {
            if (z10) {
                cVar = h0.f13084j;
                if (E) {
                    w7.a.i(A(size) == dVar2);
                    if (this.Y.isEmpty()) {
                        this.f6538f0 = this.f6539g0;
                    }
                }
            } else {
                p.l(f6532k0, "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVar == null) {
            long a11 = this.V.a(dVar2.f6516b, j11, iOException, i10);
            cVar = a11 != c.f4201b ? h0.h(false, a11) : h0.f13085k;
        }
        h0.c cVar2 = cVar;
        boolean z11 = !cVar2.c();
        this.U.D(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, a10, iOException, z11);
        if (z11) {
            this.T.k(this);
        }
        return cVar2;
    }

    public final int L(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.Y.size()) {
                return this.Y.size() - 1;
            }
        } while (this.Y.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    public void M() {
        N((b) null);
    }

    public void N(@o0 b<T> bVar) {
        this.f6537e0 = bVar;
        this.f6533a0.k();
        for (q0 k10 : this.f6534b0) {
            k10.k();
        }
        this.W.k(this);
    }

    public void O(long j10) {
        boolean z10;
        long j11;
        this.f6539g0 = j10;
        if (F()) {
            this.f6538f0 = j10;
            return;
        }
        a aVar = null;
        int i10 = 0;
        while (true) {
            if (i10 >= this.Y.size()) {
                break;
            }
            a aVar2 = this.Y.get(i10);
            int i11 = (aVar2.f6520f > j10 ? 1 : (aVar2.f6520f == j10 ? 0 : -1));
            if (i11 == 0 && aVar2.f6505j == c.f4201b) {
                aVar = aVar2;
                break;
            } else if (i11 > 0) {
                break;
            } else {
                i10++;
            }
        }
        this.f6533a0.F();
        if (aVar != null) {
            z10 = this.f6533a0.G(aVar.i(0));
            j11 = 0;
        } else {
            z10 = this.f6533a0.f(j10, true, (j10 > b() ? 1 : (j10 == b() ? 0 : -1)) < 0) != -1;
            j11 = this.f6539g0;
        }
        this.f6541i0 = j11;
        if (z10) {
            this.f6540h0 = L(this.f6533a0.r(), 0);
            for (q0 q0Var : this.f6534b0) {
                q0Var.F();
                q0Var.f(j10, true, false);
            }
            return;
        }
        this.f6538f0 = j10;
        this.f6542j0 = false;
        this.Y.clear();
        this.f6540h0 = 0;
        if (this.W.i()) {
            this.W.g();
            return;
        }
        this.f6533a0.D();
        for (q0 D : this.f6534b0) {
            D.D();
        }
    }

    public g<T>.a P(long j10, int i10) {
        for (int i11 = 0; i11 < this.f6534b0.length; i11++) {
            if (this.P[i11] == i10) {
                w7.a.i(!this.R[i11]);
                this.R[i11] = true;
                this.f6534b0[i11].F();
                this.f6534b0[i11].f(j10, true, true);
                return new a(this, this.f6534b0[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public void a() throws IOException {
        this.W.a();
        if (!this.W.i()) {
            this.S.a();
        }
    }

    public long b() {
        if (F()) {
            return this.f6538f0;
        }
        if (this.f6542j0) {
            return Long.MIN_VALUE;
        }
        return C().f6521g;
    }

    public long c(long j10, v0 v0Var) {
        return this.S.c(j10, v0Var);
    }

    public boolean d(long j10) {
        long j11;
        List<a> list;
        boolean z10 = false;
        if (this.f6542j0 || this.W.i()) {
            return false;
        }
        boolean F = F();
        if (F) {
            list = Collections.emptyList();
            j11 = this.f6538f0;
        } else {
            list = this.Z;
            j11 = C().f6521g;
        }
        this.S.e(j10, j11, list, this.X);
        f fVar = this.X;
        boolean z11 = fVar.f6531b;
        d dVar = fVar.f6530a;
        fVar.a();
        if (z11) {
            this.f6538f0 = c.f4201b;
            this.f6542j0 = true;
            return true;
        } else if (dVar == null) {
            return false;
        } else {
            if (E(dVar)) {
                a aVar = (a) dVar;
                if (F) {
                    long j12 = aVar.f6520f;
                    long j13 = this.f6538f0;
                    if (j12 == j13) {
                        z10 = true;
                    }
                    if (z10) {
                        j13 = 0;
                    }
                    this.f6541i0 = j13;
                    this.f6538f0 = c.f4201b;
                }
                aVar.k(this.f6535c0);
                this.Y.add(aVar);
            }
            this.U.G(dVar.f6515a, dVar.f6516b, this.O, dVar.f6517c, dVar.f6518d, dVar.f6519e, dVar.f6520f, dVar.f6521g, this.W.l(dVar, this, this.V.c(dVar.f6516b)));
            return true;
        }
    }

    public long e() {
        if (this.f6542j0) {
            return Long.MIN_VALUE;
        }
        if (F()) {
            return this.f6538f0;
        }
        long j10 = this.f6539g0;
        a C = C();
        if (!C.h()) {
            if (this.Y.size() > 1) {
                ArrayList<a> arrayList = this.Y;
                C = arrayList.get(arrayList.size() - 2);
            } else {
                C = null;
            }
        }
        if (C != null) {
            j10 = Math.max(j10, C.f6521g);
        }
        return Math.max(j10, this.f6533a0.q());
    }

    public void f(long j10) {
        int size;
        int f10;
        if (!this.W.i() && !F() && (size = this.Y.size()) > (f10 = this.S.f(j10, this.Z))) {
            while (true) {
                if (f10 >= size) {
                    f10 = size;
                    break;
                } else if (!D(f10)) {
                    break;
                } else {
                    f10++;
                }
            }
            if (f10 != size) {
                long j11 = C().f6521g;
                a A = A(f10);
                if (this.Y.isEmpty()) {
                    this.f6538f0 = this.f6539g0;
                }
                this.f6542j0 = false;
                this.U.N(this.O, A.f6520f, j11);
            }
        }
    }

    public void i() {
        this.f6533a0.D();
        for (q0 D : this.f6534b0) {
            D.D();
        }
        b<T> bVar = this.f6537e0;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public boolean isReady() {
        return this.f6542j0 || (!F() && this.f6533a0.u());
    }

    public int l(long j10) {
        int i10 = 0;
        if (F()) {
            return 0;
        }
        if (!this.f6542j0 || j10 <= this.f6533a0.q()) {
            int f10 = this.f6533a0.f(j10, true, true);
            if (f10 != -1) {
                i10 = f10;
            }
        } else {
            i10 = this.f6533a0.g();
        }
        G();
        return i10;
    }

    public int q(c0 c0Var, f fVar, boolean z10) {
        if (F()) {
            return -3;
        }
        G();
        return this.f6533a0.z(c0Var, fVar, z10, this.f6542j0, this.f6541i0);
    }

    public void u(long j10, boolean z10) {
        if (!F()) {
            int o10 = this.f6533a0.o();
            this.f6533a0.j(j10, z10, true);
            int o11 = this.f6533a0.o();
            if (o11 > o10) {
                long p10 = this.f6533a0.p();
                int i10 = 0;
                while (true) {
                    q0[] q0VarArr = this.f6534b0;
                    if (i10 >= q0VarArr.length) {
                        break;
                    }
                    q0VarArr[i10].j(p10, z10, this.R[i10]);
                    i10++;
                }
            }
            z(o11);
        }
    }

    public final void z(int i10) {
        int min = Math.min(L(i10, 0), this.f6540h0);
        if (min > 0) {
            w7.q0.J0(this.Y, 0, min);
            this.f6540h0 -= min;
        }
    }
}

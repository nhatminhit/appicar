package r6;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import j6.a;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.q;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import r6.h0;
import w7.j0;
import w7.q0;
import w7.v;
import w7.w;

public final class g0 implements i {
    public static final int A = 4;
    public static final int B = 15;
    public static final int C = 17;
    public static final int D = 129;
    public static final int E = 138;
    public static final int F = 130;
    public static final int G = 135;
    public static final int H = 172;
    public static final int I = 2;
    public static final int J = 27;
    public static final int K = 36;
    public static final int L = 21;
    public static final int M = 134;
    public static final int N = 89;
    public static final int O = 188;
    public static final int P = 71;
    public static final int Q = 0;
    public static final int R = 8192;
    public static final long S = ((long) q0.T("AC-3"));
    public static final long T = ((long) q0.T("EAC3"));
    public static final long U = ((long) q0.T("AC-4"));
    public static final long V = ((long) q0.T("HEVC"));
    public static final int W = 9400;
    public static final int X = 5;

    /* renamed from: v  reason: collision with root package name */
    public static final l f12197v = new f0();

    /* renamed from: w  reason: collision with root package name */
    public static final int f12198w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12199x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f12200y = 2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12201z = 3;

    /* renamed from: d  reason: collision with root package name */
    public final int f12202d;

    /* renamed from: e  reason: collision with root package name */
    public final List<j0> f12203e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12204f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseIntArray f12205g;

    /* renamed from: h  reason: collision with root package name */
    public final h0.c f12206h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray<h0> f12207i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseBooleanArray f12208j;

    /* renamed from: k  reason: collision with root package name */
    public final SparseBooleanArray f12209k;

    /* renamed from: l  reason: collision with root package name */
    public final e0 f12210l;

    /* renamed from: m  reason: collision with root package name */
    public d0 f12211m;

    /* renamed from: n  reason: collision with root package name */
    public k f12212n;

    /* renamed from: o  reason: collision with root package name */
    public int f12213o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12214p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12215q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12216r;

    /* renamed from: s  reason: collision with root package name */
    public h0 f12217s;

    /* renamed from: t  reason: collision with root package name */
    public int f12218t;

    /* renamed from: u  reason: collision with root package name */
    public int f12219u;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public class b implements z {

        /* renamed from: a  reason: collision with root package name */
        public final v f12220a = new v(new byte[4]);

        public b() {
        }

        public void a(j0 j0Var, k kVar, h0.e eVar) {
        }

        public void b(w wVar) {
            if (wVar.D() == 0) {
                wVar.R(7);
                int a10 = wVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    wVar.h(this.f12220a, 4);
                    int h10 = this.f12220a.h(16);
                    this.f12220a.p(3);
                    if (h10 == 0) {
                        this.f12220a.p(13);
                    } else {
                        int h11 = this.f12220a.h(13);
                        g0.this.f12207i.put(h11, new a0(new c(h11)));
                        g0.l(g0.this);
                    }
                }
                if (g0.this.f12202d != 2) {
                    g0.this.f12207i.remove(0);
                }
            }
        }
    }

    public class c implements z {

        /* renamed from: f  reason: collision with root package name */
        public static final int f12222f = 5;

        /* renamed from: g  reason: collision with root package name */
        public static final int f12223g = 10;

        /* renamed from: h  reason: collision with root package name */
        public static final int f12224h = 106;

        /* renamed from: i  reason: collision with root package name */
        public static final int f12225i = 122;

        /* renamed from: j  reason: collision with root package name */
        public static final int f12226j = 123;

        /* renamed from: k  reason: collision with root package name */
        public static final int f12227k = 127;

        /* renamed from: l  reason: collision with root package name */
        public static final int f12228l = 89;

        /* renamed from: m  reason: collision with root package name */
        public static final int f12229m = 21;

        /* renamed from: a  reason: collision with root package name */
        public final v f12230a = new v(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<h0> f12231b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public final SparseIntArray f12232c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        public final int f12233d;

        public c(int i10) {
            this.f12233d = i10;
        }

        public void a(j0 j0Var, k kVar, h0.e eVar) {
        }

        public void b(w wVar) {
            j0 j0Var;
            w wVar2 = wVar;
            if (wVar.D() == 2) {
                int i10 = 0;
                if (g0.this.f12202d == 1 || g0.this.f12202d == 2 || g0.this.f12213o == 1) {
                    j0Var = (j0) g0.this.f12203e.get(0);
                } else {
                    j0Var = new j0(((j0) g0.this.f12203e.get(0)).c());
                    g0.this.f12203e.add(j0Var);
                }
                wVar2.R(2);
                int J = wVar.J();
                int i11 = 3;
                wVar2.R(3);
                wVar2.h(this.f12230a, 2);
                this.f12230a.p(3);
                int i12 = 13;
                int unused = g0.this.f12219u = this.f12230a.h(13);
                wVar2.h(this.f12230a, 2);
                int i13 = 4;
                this.f12230a.p(4);
                wVar2.R(this.f12230a.h(12));
                if (g0.this.f12202d == 2 && g0.this.f12217s == null) {
                    h0.b bVar = new h0.b(21, (String) null, (List<h0.a>) null, q0.f14791f);
                    g0 g0Var = g0.this;
                    h0 unused2 = g0Var.f12217s = g0Var.f12206h.b(21, bVar);
                    g0.this.f12217s.a(j0Var, g0.this.f12212n, new h0.e(J, 21, 8192));
                }
                this.f12231b.clear();
                this.f12232c.clear();
                int a10 = wVar.a();
                while (a10 > 0) {
                    wVar2.h(this.f12230a, 5);
                    int h10 = this.f12230a.h(8);
                    this.f12230a.p(i11);
                    int h11 = this.f12230a.h(i12);
                    this.f12230a.p(i13);
                    int h12 = this.f12230a.h(12);
                    h0.b c10 = c(wVar2, h12);
                    if (h10 == 6) {
                        h10 = c10.f12260a;
                    }
                    a10 -= h12 + 5;
                    int i14 = g0.this.f12202d == 2 ? h10 : h11;
                    if (!g0.this.f12208j.get(i14)) {
                        h0 t10 = (g0.this.f12202d == 2 && h10 == 21) ? g0.this.f12217s : g0.this.f12206h.b(h10, c10);
                        if (g0.this.f12202d != 2 || h11 < this.f12232c.get(i14, 8192)) {
                            this.f12232c.put(i14, h11);
                            this.f12231b.put(i14, t10);
                        }
                    }
                    i11 = 3;
                    i13 = 4;
                    i12 = 13;
                }
                int size = this.f12232c.size();
                for (int i15 = 0; i15 < size; i15++) {
                    int keyAt = this.f12232c.keyAt(i15);
                    int valueAt = this.f12232c.valueAt(i15);
                    g0.this.f12208j.put(keyAt, true);
                    g0.this.f12209k.put(valueAt, true);
                    h0 valueAt2 = this.f12231b.valueAt(i15);
                    if (valueAt2 != null) {
                        if (valueAt2 != g0.this.f12217s) {
                            valueAt2.a(j0Var, g0.this.f12212n, new h0.e(J, keyAt, 8192));
                        }
                        g0.this.f12207i.put(valueAt, valueAt2);
                    }
                }
                if (g0.this.f12202d != 2) {
                    g0.this.f12207i.remove(this.f12233d);
                    g0 g0Var2 = g0.this;
                    if (g0Var2.f12202d != 1) {
                        i10 = g0.this.f12213o - 1;
                    }
                    int unused3 = g0Var2.f12213o = i10;
                    if (g0.this.f12213o == 0) {
                        g0.this.f12212n.r();
                    } else {
                        return;
                    }
                } else if (!g0.this.f12214p) {
                    g0.this.f12212n.r();
                    int unused4 = g0.this.f12213o = 0;
                } else {
                    return;
                }
                boolean unused5 = g0.this.f12214p = true;
            }
        }

        public final h0.b c(w wVar, int i10) {
            int c10 = wVar.c();
            int i11 = i10 + c10;
            String str = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (wVar.c() < i11) {
                int D = wVar.D();
                int c11 = wVar.c() + wVar.D();
                if (D == 5) {
                    long F = wVar.F();
                    if (F != g0.S) {
                        if (F != g0.T) {
                            if (F != g0.U) {
                                if (F == g0.V) {
                                    i12 = 36;
                                }
                                wVar.R(c11 - wVar.c());
                            }
                        }
                        i12 = 135;
                        wVar.R(c11 - wVar.c());
                    }
                    i12 = 129;
                    wVar.R(c11 - wVar.c());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (wVar.D() != 21) {
                                }
                            } else if (D == 123) {
                                i12 = 138;
                            } else if (D == 10) {
                                str = wVar.A(3).trim();
                            } else if (D == 89) {
                                arrayList = new ArrayList();
                                while (wVar.c() < c11) {
                                    String trim = wVar.A(3).trim();
                                    int D2 = wVar.D();
                                    byte[] bArr = new byte[4];
                                    wVar.i(bArr, 0, 4);
                                    arrayList.add(new h0.a(trim, D2, bArr));
                                }
                                i12 = 89;
                            }
                            wVar.R(c11 - wVar.c());
                        }
                        i12 = 135;
                        wVar.R(c11 - wVar.c());
                    }
                    i12 = 129;
                    wVar.R(c11 - wVar.c());
                }
                i12 = 172;
                wVar.R(c11 - wVar.c());
            }
            wVar.Q(i11);
            return new h0.b(i12, str, arrayList, Arrays.copyOfRange(wVar.f14880a, c10, i11));
        }
    }

    public g0() {
        this(0);
    }

    public g0(int i10) {
        this(1, i10);
    }

    public g0(int i10, int i11) {
        this(i10, new j0(0), new j(i11));
    }

    public g0(int i10, j0 j0Var, h0.c cVar) {
        this.f12206h = (h0.c) w7.a.g(cVar);
        this.f12202d = i10;
        if (i10 == 1 || i10 == 2) {
            this.f12203e = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f12203e = arrayList;
            arrayList.add(j0Var);
        }
        this.f12204f = new w(new byte[W], 0);
        this.f12208j = new SparseBooleanArray();
        this.f12209k = new SparseBooleanArray();
        this.f12207i = new SparseArray<>();
        this.f12205g = new SparseIntArray();
        this.f12210l = new e0();
        this.f12219u = -1;
        D();
    }

    public static /* synthetic */ i[] B() {
        return new i[]{new g0()};
    }

    public static /* synthetic */ int l(g0 g0Var) {
        int i10 = g0Var.f12213o;
        g0Var.f12213o = i10 + 1;
        return i10;
    }

    public final int A() throws b6.j0 {
        int c10 = this.f12204f.c();
        int d10 = this.f12204f.d();
        int a10 = i0.a(this.f12204f.f14880a, c10, d10);
        this.f12204f.Q(a10);
        int i10 = a10 + 188;
        if (i10 > d10) {
            int i11 = this.f12218t + (a10 - c10);
            this.f12218t = i11;
            if (this.f12202d == 2 && i11 > 376) {
                throw new b6.j0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f12218t = 0;
        }
        return i10;
    }

    public final void C(long j10) {
        q qVar;
        k kVar;
        if (!this.f12215q) {
            this.f12215q = true;
            if (this.f12210l.b() != b6.c.f4201b) {
                d0 d0Var = new d0(this.f12210l.c(), this.f12210l.b(), j10, this.f12219u);
                this.f12211m = d0Var;
                kVar = this.f12212n;
                qVar = d0Var.b();
            } else {
                kVar = this.f12212n;
                qVar = new q.b(this.f12210l.b());
            }
            kVar.q(qVar);
        }
    }

    public final void D() {
        this.f12208j.clear();
        this.f12207i.clear();
        SparseArray<h0> a10 = this.f12206h.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12207i.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f12207i.put(0, new a0(new b()));
        this.f12217s = null;
    }

    public final boolean E(int i10) {
        return this.f12202d == 2 || this.f12214p || !this.f12209k.get(i10, false);
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        boolean z10;
        byte[] bArr = this.f12204f.f14880a;
        jVar.k(bArr, 0, d0.f12158g);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                jVar.i(i10);
                return true;
            }
        }
        return false;
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        j jVar2 = jVar;
        p pVar2 = pVar;
        long length = jVar.getLength();
        h0 h0Var = null;
        if (this.f12214p) {
            if (((length == -1 || this.f12202d == 2) ? false : true) && !this.f12210l.d()) {
                return this.f12210l.e(jVar2, pVar2, this.f12219u);
            }
            C(length);
            if (this.f12216r) {
                this.f12216r = false;
                h(0, 0);
                if (jVar.getPosition() != 0) {
                    pVar2.f9610a = 0;
                    return 1;
                }
            }
            d0 d0Var = this.f12211m;
            if (d0Var != null && d0Var.d()) {
                return this.f12211m.c(jVar2, pVar2, (a.c) null);
            }
        }
        if (!z(jVar)) {
            return -1;
        }
        int A2 = A();
        int d10 = this.f12204f.d();
        if (A2 > d10) {
            return 0;
        }
        int l10 = this.f12204f.l();
        if ((8388608 & l10) == 0) {
            int i10 = ((4194304 & l10) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & l10) >> 8;
            boolean z10 = (l10 & 32) != 0;
            if ((l10 & 16) != 0) {
                h0Var = this.f12207i.get(i11);
            }
            if (h0Var != null) {
                if (this.f12202d != 2) {
                    int i12 = l10 & 15;
                    int i13 = this.f12205g.get(i11, i12 - 1);
                    this.f12205g.put(i11, i12);
                    if (i13 != i12) {
                        if (i12 != ((i13 + 1) & 15)) {
                            h0Var.c();
                        }
                    }
                }
                if (z10) {
                    int D2 = this.f12204f.D();
                    i10 |= (this.f12204f.D() & 64) != 0 ? 2 : 0;
                    this.f12204f.R(D2 - 1);
                }
                boolean z11 = this.f12214p;
                if (E(i11)) {
                    this.f12204f.P(A2);
                    h0Var.b(this.f12204f, i10);
                    this.f12204f.P(d10);
                }
                if (this.f12202d != 2 && !z11 && this.f12214p && length != -1) {
                    this.f12216r = true;
                }
            }
        }
        this.f12204f.Q(A2);
        return 0;
    }

    public void g(k kVar) {
        this.f12212n = kVar;
    }

    public void h(long j10, long j11) {
        d0 d0Var;
        w7.a.i(this.f12202d != 2);
        int size = this.f12203e.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = this.f12203e.get(i10);
            if ((j0Var.e() == b6.c.f4201b) || !(j0Var.e() == 0 || j0Var.c() == j11)) {
                j0Var.g();
                j0Var.h(j11);
            }
        }
        if (!(j11 == 0 || (d0Var = this.f12211m) == null)) {
            d0Var.h(j11);
        }
        this.f12204f.L();
        this.f12205g.clear();
        for (int i11 = 0; i11 < this.f12207i.size(); i11++) {
            this.f12207i.valueAt(i11).c();
        }
        this.f12218t = 0;
    }

    public final boolean z(j jVar) throws IOException, InterruptedException {
        w wVar = this.f12204f;
        byte[] bArr = wVar.f14880a;
        if (9400 - wVar.c() < 188) {
            int a10 = this.f12204f.a();
            if (a10 > 0) {
                System.arraycopy(bArr, this.f12204f.c(), bArr, 0, a10);
            }
            this.f12204f.O(bArr, a10);
        }
        while (this.f12204f.a() < 188) {
            int d10 = this.f12204f.d();
            int read = jVar.read(bArr, d10, 9400 - d10);
            if (read == -1) {
                return false;
            }
            this.f12204f.P(d10 + read);
        }
        return true;
    }
}

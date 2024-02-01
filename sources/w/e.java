package w;

import g7.h;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import w.i;
import z.d;

public class e {
    public static boolean A = false;
    public static int B = 1000;
    public static f C = null;
    public static long D = 0;
    public static long E = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f14246r = false;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f14247s = false;

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f14248t = false;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f14249u = false;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f14250v = false;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f14251w = true;

    /* renamed from: x  reason: collision with root package name */
    public static boolean f14252x = true;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f14253y = true;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f14254z = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14255a;

    /* renamed from: b  reason: collision with root package name */
    public int f14256b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, i> f14257c;

    /* renamed from: d  reason: collision with root package name */
    public a f14258d;

    /* renamed from: e  reason: collision with root package name */
    public int f14259e;

    /* renamed from: f  reason: collision with root package name */
    public int f14260f;

    /* renamed from: g  reason: collision with root package name */
    public b[] f14261g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14262h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14263i;

    /* renamed from: j  reason: collision with root package name */
    public boolean[] f14264j;

    /* renamed from: k  reason: collision with root package name */
    public int f14265k;

    /* renamed from: l  reason: collision with root package name */
    public int f14266l;

    /* renamed from: m  reason: collision with root package name */
    public int f14267m;

    /* renamed from: n  reason: collision with root package name */
    public final c f14268n;

    /* renamed from: o  reason: collision with root package name */
    public i[] f14269o;

    /* renamed from: p  reason: collision with root package name */
    public int f14270p;

    /* renamed from: q  reason: collision with root package name */
    public a f14271q;

    public interface a {
        void a(e eVar, i iVar, boolean z10);

        void b(e eVar);

        i c(e eVar, boolean[] zArr);

        void clear();

        void d(a aVar);

        void e(i iVar);

        void f(e eVar, b bVar, boolean z10);

        i getKey();

        boolean isEmpty();
    }

    public class b extends b {
        public b(c cVar) {
            this.f14240e = new j(this, cVar);
        }
    }

    public e() {
        this.f14255a = false;
        this.f14256b = 0;
        this.f14257c = null;
        this.f14259e = 32;
        this.f14260f = 32;
        this.f14261g = null;
        this.f14262h = false;
        this.f14263i = false;
        this.f14264j = new boolean[32];
        this.f14265k = 1;
        this.f14266l = 0;
        this.f14267m = 32;
        this.f14269o = new i[B];
        this.f14270p = 0;
        this.f14261g = new b[32];
        W();
        c cVar = new c();
        this.f14268n = cVar;
        this.f14258d = new h(cVar);
        this.f14271q = A ? new b(cVar) : new b(cVar);
    }

    public static f L() {
        return C;
    }

    public static b w(e eVar, i iVar, i iVar2, float f10) {
        return eVar.v().m(iVar, iVar2, f10);
    }

    public final void A() {
        B();
        String str = "";
        for (int i10 = 0; i10 < this.f14266l; i10++) {
            str = (str + this.f14261g[i10]) + "\n";
        }
        System.out.println(str + this.f14258d + "\n");
    }

    public final void B() {
        System.out.println("Display Rows (" + this.f14266l + "x" + this.f14265k + ")\n");
    }

    public void C() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14259e; i11++) {
            b bVar = this.f14261g[i11];
            if (bVar != null) {
                i10 += bVar.E();
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f14266l; i13++) {
            b bVar2 = this.f14261g[i13];
            if (bVar2 != null) {
                i12 += bVar2.E();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Linear System -> Table size: ");
        sb2.append(this.f14259e);
        sb2.append(" (");
        int i14 = this.f14259e;
        sb2.append(H(i14 * i14));
        sb2.append(") -- row sizes: ");
        sb2.append(H(i10));
        sb2.append(", actual size: ");
        sb2.append(H(i12));
        sb2.append(" rows: ");
        sb2.append(this.f14266l);
        sb2.append("/");
        sb2.append(this.f14267m);
        sb2.append(" cols: ");
        sb2.append(this.f14265k);
        sb2.append("/");
        sb2.append(this.f14260f);
        sb2.append(" ");
        sb2.append(0);
        sb2.append(" occupied cells, ");
        sb2.append(H(0));
        printStream.println(sb2.toString());
    }

    public void D() {
        B();
        String str = "";
        for (int i10 = 0; i10 < this.f14266l; i10++) {
            if (this.f14261g[i10].f14236a.f14329j == i.b.UNRESTRICTED) {
                str = (str + this.f14261g[i10].F()) + "\n";
            }
        }
        System.out.println(str + this.f14258d + "\n");
    }

    public final int E(a aVar) throws Exception {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f14266l) {
                z10 = false;
                break;
            }
            b bVar = this.f14261g[i10];
            if (bVar.f14236a.f14329j != i.b.UNRESTRICTED && bVar.f14237b < 0.0f) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return 0;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar = C;
            if (fVar != null) {
                fVar.f14287o++;
            }
            i11++;
            float f10 = Float.MAX_VALUE;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < this.f14266l; i15++) {
                b bVar2 = this.f14261g[i15];
                if (bVar2.f14236a.f14329j != i.b.UNRESTRICTED && !bVar2.f14241f && bVar2.f14237b < 0.0f) {
                    int i16 = 9;
                    if (f14254z) {
                        int d10 = bVar2.f14240e.d();
                        int i17 = 0;
                        while (i17 < d10) {
                            i h10 = bVar2.f14240e.h(i17);
                            float a10 = bVar2.f14240e.a(h10);
                            if (a10 > 0.0f) {
                                int i18 = 0;
                                while (i18 < i16) {
                                    float f11 = h10.f14327h[i18] / a10;
                                    if ((f11 < f10 && i18 == i14) || i18 > i14) {
                                        i13 = h10.f14322c;
                                        i14 = i18;
                                        i12 = i15;
                                        f10 = f11;
                                    }
                                    i18++;
                                    i16 = 9;
                                }
                            }
                            i17++;
                            i16 = 9;
                        }
                    } else {
                        for (int i19 = 1; i19 < this.f14265k; i19++) {
                            i iVar = this.f14268n.f14245d[i19];
                            float a11 = bVar2.f14240e.a(iVar);
                            if (a11 > 0.0f) {
                                for (int i20 = 0; i20 < 9; i20++) {
                                    float f12 = iVar.f14327h[i20] / a11;
                                    if ((f12 < f10 && i20 == i14) || i20 > i14) {
                                        i13 = i19;
                                        i14 = i20;
                                        i12 = i15;
                                        f10 = f12;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i12 != -1) {
                b bVar3 = this.f14261g[i12];
                bVar3.f14236a.f14323d = -1;
                f fVar2 = C;
                if (fVar2 != null) {
                    fVar2.f14286n++;
                }
                bVar3.C(this.f14268n.f14245d[i13]);
                i iVar2 = bVar3.f14236a;
                iVar2.f14323d = i12;
                iVar2.m(this, bVar3);
            } else {
                z11 = true;
            }
            if (i11 > this.f14265k / 2) {
                z11 = true;
            }
        }
        return i11;
    }

    public void F(f fVar) {
        C = fVar;
    }

    public c G() {
        return this.f14268n;
    }

    public final String H(int i10) {
        int i11 = i10 * 4;
        int i12 = i11 / 1024;
        int i13 = i12 / 1024;
        if (i13 > 0) {
            return "" + i13 + " Mb";
        } else if (i12 > 0) {
            return "" + i12 + " Kb";
        } else {
            return "" + i11 + " bytes";
        }
    }

    public final String I(int i10) {
        return i10 == 1 ? "LOW" : i10 == 2 ? "MEDIUM" : i10 == 3 ? "HIGH" : i10 == 4 ? "HIGHEST" : i10 == 5 ? "EQUALITY" : i10 == 8 ? "FIXED" : i10 == 6 ? "BARRIER" : h.A;
    }

    public a J() {
        return this.f14258d;
    }

    public int K() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14266l; i11++) {
            b bVar = this.f14261g[i11];
            if (bVar != null) {
                i10 += bVar.E();
            }
        }
        return i10;
    }

    public int M() {
        return this.f14266l;
    }

    public int N() {
        return this.f14256b;
    }

    public int O(Object obj) {
        i j10 = ((d) obj).j();
        if (j10 != null) {
            return (int) (j10.f14325f + 0.5f);
        }
        return 0;
    }

    public b P(int i10) {
        return this.f14261g[i10];
    }

    public float Q(String str) {
        i R = R(str, i.b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f14325f;
    }

    public i R(String str, i.b bVar) {
        if (this.f14257c == null) {
            this.f14257c = new HashMap<>();
        }
        i iVar = this.f14257c.get(str);
        return iVar == null ? y(str, bVar) : iVar;
    }

    public final void S() {
        int i10 = this.f14259e * 2;
        this.f14259e = i10;
        this.f14261g = (b[]) Arrays.copyOf(this.f14261g, i10);
        c cVar = this.f14268n;
        cVar.f14245d = (i[]) Arrays.copyOf(cVar.f14245d, this.f14259e);
        int i11 = this.f14259e;
        this.f14264j = new boolean[i11];
        this.f14260f = i11;
        this.f14267m = i11;
        f fVar = C;
        if (fVar != null) {
            fVar.f14280h++;
            fVar.f14292t = Math.max(fVar.f14292t, (long) i11);
            f fVar2 = C;
            fVar2.J = fVar2.f14292t;
        }
    }

    public void T() throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f14281i++;
        }
        if (this.f14258d.isEmpty()) {
            r();
            return;
        }
        if (this.f14262h || this.f14263i) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f14294v++;
            }
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f14266l) {
                    z10 = true;
                    break;
                } else if (!this.f14261g[i10].f14241f) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                f fVar3 = C;
                if (fVar3 != null) {
                    fVar3.f14293u++;
                }
                r();
                return;
            }
        }
        U(this.f14258d);
    }

    public void U(a aVar) throws Exception {
        f fVar = C;
        if (fVar != null) {
            fVar.f14298z++;
            fVar.A = Math.max(fVar.A, (long) this.f14265k);
            f fVar2 = C;
            fVar2.B = Math.max(fVar2.B, (long) this.f14266l);
        }
        E(aVar);
        V(aVar, false);
        r();
    }

    public final int V(a aVar, boolean z10) {
        f fVar = C;
        if (fVar != null) {
            fVar.f14284l++;
        }
        for (int i10 = 0; i10 < this.f14265k; i10++) {
            this.f14264j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            f fVar2 = C;
            if (fVar2 != null) {
                fVar2.f14285m++;
            }
            i11++;
            if (i11 >= this.f14265k * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f14264j[aVar.getKey().f14322c] = true;
            }
            i c10 = aVar.c(this, this.f14264j);
            if (c10 != null) {
                boolean[] zArr = this.f14264j;
                int i12 = c10.f14322c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (c10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f14266l; i14++) {
                    b bVar = this.f14261g[i14];
                    if (bVar.f14236a.f14329j != i.b.UNRESTRICTED && !bVar.f14241f && bVar.y(c10)) {
                        float a10 = bVar.f14240e.a(c10);
                        if (a10 < 0.0f) {
                            float f11 = (-bVar.f14237b) / a10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f14261g[i13];
                    bVar2.f14236a.f14323d = -1;
                    f fVar3 = C;
                    if (fVar3 != null) {
                        fVar3.f14286n++;
                    }
                    bVar2.C(c10);
                    i iVar = bVar2.f14236a;
                    iVar.f14323d = i13;
                    iVar.m(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    public final void W() {
        int i10 = 0;
        if (A) {
            while (i10 < this.f14266l) {
                b bVar = this.f14261g[i10];
                if (bVar != null) {
                    this.f14268n.f14242a.a(bVar);
                }
                this.f14261g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f14266l) {
            b bVar2 = this.f14261g[i10];
            if (bVar2 != null) {
                this.f14268n.f14243b.a(bVar2);
            }
            this.f14261g[i10] = null;
            i10++;
        }
    }

    public void X(b bVar) {
        i iVar;
        int i10;
        if (bVar.f14241f && (iVar = bVar.f14236a) != null) {
            int i11 = iVar.f14323d;
            if (i11 != -1) {
                while (true) {
                    i10 = this.f14266l;
                    if (i11 >= i10 - 1) {
                        break;
                    }
                    b[] bVarArr = this.f14261g;
                    int i12 = i11 + 1;
                    b bVar2 = bVarArr[i12];
                    i iVar2 = bVar2.f14236a;
                    if (iVar2.f14323d == i12) {
                        iVar2.f14323d = i11;
                    }
                    bVarArr[i11] = bVar2;
                    i11 = i12;
                }
                this.f14266l = i10 - 1;
            }
            i iVar3 = bVar.f14236a;
            if (!iVar3.f14326g) {
                iVar3.h(this, bVar.f14237b);
            }
            (A ? this.f14268n.f14242a : this.f14268n.f14243b).a(bVar);
        }
    }

    public void Y() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f14268n;
            i[] iVarArr = cVar.f14245d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.g();
            }
            i10++;
        }
        cVar.f14244c.c(this.f14269o, this.f14270p);
        this.f14270p = 0;
        Arrays.fill(this.f14268n.f14245d, (Object) null);
        HashMap<String, i> hashMap = this.f14257c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f14256b = 0;
        this.f14258d.clear();
        this.f14265k = 1;
        for (int i11 = 0; i11 < this.f14266l; i11++) {
            b bVar = this.f14261g[i11];
            if (bVar != null) {
                bVar.f14238c = false;
            }
        }
        W();
        this.f14266l = 0;
        this.f14271q = A ? new b(this.f14268n) : new b(this.f14268n);
    }

    public final i a(i.b bVar, String str) {
        i b10 = this.f14268n.f14244c.b();
        if (b10 == null) {
            b10 = new i(bVar, str);
        } else {
            b10.g();
        }
        b10.k(bVar, str);
        int i10 = this.f14270p;
        int i11 = B;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            B = i12;
            this.f14269o = (i[]) Arrays.copyOf(this.f14269o, i12);
        }
        i[] iVarArr = this.f14269o;
        int i13 = this.f14270p;
        this.f14270p = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    public void b(z.e eVar, z.e eVar2, float f10, int i10) {
        z.e eVar3 = eVar;
        z.e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i u10 = u(eVar3.r(bVar));
        d.b bVar2 = d.b.TOP;
        i u11 = u(eVar3.r(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i u12 = u(eVar3.r(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i u13 = u(eVar3.r(bVar4));
        i u14 = u(eVar4.r(bVar));
        i u15 = u(eVar4.r(bVar2));
        i u16 = u(eVar4.r(bVar3));
        i u17 = u(eVar4.r(bVar4));
        b v10 = v();
        double d10 = (double) f10;
        i iVar = u16;
        double d11 = (double) i10;
        v10.v(u11, u13, u15, u17, (float) (Math.sin(d10) * d11));
        d(v10);
        b v11 = v();
        v11.v(u10, u12, u14, iVar, (float) (Math.cos(d10) * d11));
        d(v11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13 = i12;
        b v10 = v();
        v10.k(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            v10.g(this, i13);
        }
        d(v10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(w.b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            w.f r0 = C
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f14282j
            long r3 = r3 + r1
            r0.f14282j = r3
            boolean r3 = r8.f14241f
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f14283k
            long r3 = r3 + r1
            r0.f14283k = r3
        L_0x0017:
            int r0 = r7.f14266l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f14267m
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f14265k
            int r0 = r0 + r3
            int r4 = r7.f14260f
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.S()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.f14241f
            if (r4 != 0) goto L_0x009e
            r8.b(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.w()
            boolean r4 = r8.i(r7)
            if (r4 == 0) goto L_0x0095
            w.i r4 = r7.t()
            r8.f14236a = r4
            int r5 = r7.f14266l
            r7.m(r8)
            int r6 = r7.f14266l
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0095
            w.e$a r0 = r7.f14271q
            r0.d(r8)
            w.e$a r0 = r7.f14271q
            r7.V(r0, r3)
            int r0 = r4.f14323d
            r5 = -1
            if (r0 != r5) goto L_0x0096
            w.i r0 = r8.f14236a
            if (r0 != r4) goto L_0x0076
            w.i r0 = r8.A(r4)
            if (r0 == 0) goto L_0x0076
            w.f r4 = C
            if (r4 == 0) goto L_0x0073
            long r5 = r4.f14286n
            long r5 = r5 + r1
            r4.f14286n = r5
        L_0x0073:
            r8.C(r0)
        L_0x0076:
            boolean r0 = r8.f14241f
            if (r0 != 0) goto L_0x007f
            w.i r0 = r8.f14236a
            r0.m(r7, r8)
        L_0x007f:
            boolean r0 = A
            if (r0 == 0) goto L_0x0088
            w.c r0 = r7.f14268n
            w.g$a<w.b> r0 = r0.f14242a
            goto L_0x008c
        L_0x0088:
            w.c r0 = r7.f14268n
            w.g$a<w.b> r0 = r0.f14243b
        L_0x008c:
            r0.a(r8)
            int r0 = r7.f14266l
            int r0 = r0 - r3
            r7.f14266l = r0
            goto L_0x0096
        L_0x0095:
            r3 = r0
        L_0x0096:
            boolean r0 = r8.x()
            if (r0 != 0) goto L_0x009d
            return
        L_0x009d:
            r0 = r3
        L_0x009e:
            if (r0 != 0) goto L_0x00a3
            r7.m(r8)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.d(w.b):void");
    }

    public b e(i iVar, i iVar2, int i10, int i11) {
        if (!f14251w || i11 != 8 || !iVar2.f14326g || iVar.f14323d != -1) {
            b v10 = v();
            v10.r(iVar, iVar2, i10);
            if (i11 != 8) {
                v10.g(this, i11);
            }
            d(v10);
            return v10;
        }
        iVar.h(this, iVar2.f14325f + ((float) i10));
        return null;
    }

    public void f(i iVar, int i10) {
        b bVar;
        if (!f14251w || iVar.f14323d != -1) {
            int i11 = iVar.f14323d;
            if (i11 != -1) {
                b bVar2 = this.f14261g[i11];
                if (!bVar2.f14241f) {
                    if (bVar2.f14240e.d() == 0) {
                        bVar2.f14241f = true;
                    } else {
                        bVar = v();
                        bVar.q(iVar, i10);
                    }
                }
                bVar2.f14237b = (float) i10;
                return;
            }
            bVar = v();
            bVar.l(iVar, i10);
            d(bVar);
            return;
        }
        float f10 = (float) i10;
        iVar.h(this, f10);
        for (int i12 = 0; i12 < this.f14256b + 1; i12++) {
            i iVar2 = this.f14268n.f14245d[i12];
            if (iVar2 != null && iVar2.f14333n && iVar2.f14334o == iVar.f14322c) {
                iVar2.h(this, iVar2.f14335p + f10);
            }
        }
    }

    public final void g(b bVar) {
        bVar.g(this, 0);
    }

    public void h(i iVar, i iVar2, int i10, boolean z10) {
        b v10 = v();
        i x10 = x();
        x10.f14324e = 0;
        v10.t(iVar, iVar2, x10, i10);
        d(v10);
    }

    public void i(i iVar, i iVar2, int i10, int i11) {
        b v10 = v();
        i x10 = x();
        x10.f14324e = 0;
        v10.t(iVar, iVar2, x10, i10);
        if (i11 != 8) {
            o(v10, (int) (v10.f14240e.a(x10) * -1.0f), i11);
        }
        d(v10);
    }

    public void j(i iVar, i iVar2, int i10, boolean z10) {
        b v10 = v();
        i x10 = x();
        x10.f14324e = 0;
        v10.u(iVar, iVar2, x10, i10);
        d(v10);
    }

    public void k(i iVar, i iVar2, int i10, int i11) {
        b v10 = v();
        i x10 = x();
        x10.f14324e = 0;
        v10.u(iVar, iVar2, x10, i10);
        if (i11 != 8) {
            o(v10, (int) (v10.f14240e.a(x10) * -1.0f), i11);
        }
        d(v10);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b v10 = v();
        v10.n(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            v10.g(this, i10);
        }
        d(v10);
    }

    public final void m(b bVar) {
        int i10;
        if (!f14252x || !bVar.f14241f) {
            b[] bVarArr = this.f14261g;
            int i11 = this.f14266l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f14236a;
            iVar.f14323d = i11;
            this.f14266l = i11 + 1;
            iVar.m(this, bVar);
        } else {
            bVar.f14236a.h(this, bVar.f14237b);
        }
        if (f14252x && this.f14255a) {
            int i12 = 0;
            while (i12 < this.f14266l) {
                if (this.f14261g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f14261g[i12];
                if (bVar2 != null && bVar2.f14241f) {
                    bVar2.f14236a.h(this, bVar2.f14237b);
                    (A ? this.f14268n.f14242a : this.f14268n.f14243b).a(bVar2);
                    this.f14261g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f14266l;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f14261g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f14236a;
                        if (iVar2.f14323d == i13) {
                            iVar2.f14323d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f14261g[i14] = null;
                    }
                    this.f14266l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f14255a = false;
        }
    }

    public final void n(b bVar, int i10) {
        o(bVar, i10, 0);
    }

    public void o(b bVar, int i10, int i11) {
        bVar.h(s(i11, (String) null), i10);
    }

    public void p(i iVar, i iVar2, int i10) {
        if (iVar.f14323d == -1 && i10 == 0) {
            if (iVar2.f14333n) {
                iVar2 = this.f14268n.f14245d[iVar2.f14334o];
            }
            if (iVar.f14333n) {
                i iVar3 = this.f14268n.f14245d[iVar.f14334o];
            } else {
                iVar.j(this, iVar2, 0.0f);
            }
        } else {
            e(iVar, iVar2, i10, 8);
        }
    }

    public final void q() {
        int i10;
        int i11 = 0;
        while (i11 < this.f14266l) {
            b bVar = this.f14261g[i11];
            if (bVar.f14240e.d() == 0) {
                bVar.f14241f = true;
            }
            if (bVar.f14241f) {
                i iVar = bVar.f14236a;
                iVar.f14325f = bVar.f14237b;
                iVar.f(bVar);
                int i12 = i11;
                while (true) {
                    i10 = this.f14266l;
                    if (i12 >= i10 - 1) {
                        break;
                    }
                    b[] bVarArr = this.f14261g;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f14261g[i10 - 1] = null;
                this.f14266l = i10 - 1;
                i11--;
                (A ? this.f14268n.f14242a : this.f14268n.f14243b).a(bVar);
            }
            i11++;
        }
    }

    public final void r() {
        for (int i10 = 0; i10 < this.f14266l; i10++) {
            b bVar = this.f14261g[i10];
            bVar.f14236a.f14325f = bVar.f14237b;
        }
    }

    public i s(int i10, String str) {
        f fVar = C;
        if (fVar != null) {
            fVar.f14289q++;
        }
        if (this.f14265k + 1 >= this.f14260f) {
            S();
        }
        i a10 = a(i.b.ERROR, str);
        int i11 = this.f14256b + 1;
        this.f14256b = i11;
        this.f14265k++;
        a10.f14322c = i11;
        a10.f14324e = i10;
        this.f14268n.f14245d[i11] = a10;
        this.f14258d.e(a10);
        return a10;
    }

    public i t() {
        f fVar = C;
        if (fVar != null) {
            fVar.f14291s++;
        }
        if (this.f14265k + 1 >= this.f14260f) {
            S();
        }
        i a10 = a(i.b.SLACK, (String) null);
        int i10 = this.f14256b + 1;
        this.f14256b = i10;
        this.f14265k++;
        a10.f14322c = i10;
        this.f14268n.f14245d[i10] = a10;
        return a10;
    }

    public i u(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f14265k + 1 >= this.f14260f) {
            S();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            iVar = dVar.j();
            if (iVar == null) {
                dVar.z(this.f14268n);
                iVar = dVar.j();
            }
            int i10 = iVar.f14322c;
            if (i10 == -1 || i10 > this.f14256b || this.f14268n.f14245d[i10] == null) {
                if (i10 != -1) {
                    iVar.g();
                }
                int i11 = this.f14256b + 1;
                this.f14256b = i11;
                this.f14265k++;
                iVar.f14322c = i11;
                iVar.f14329j = i.b.UNRESTRICTED;
                this.f14268n.f14245d[i11] = iVar;
            }
        }
        return iVar;
    }

    public b v() {
        b bVar;
        if (A) {
            bVar = this.f14268n.f14242a.b();
            if (bVar == null) {
                bVar = new b(this.f14268n);
                E++;
                i.e();
                return bVar;
            }
        } else {
            bVar = this.f14268n.f14243b.b();
            if (bVar == null) {
                bVar = new b(this.f14268n);
                D++;
                i.e();
                return bVar;
            }
        }
        bVar.D();
        i.e();
        return bVar;
    }

    public i x() {
        f fVar = C;
        if (fVar != null) {
            fVar.f14290r++;
        }
        if (this.f14265k + 1 >= this.f14260f) {
            S();
        }
        i a10 = a(i.b.SLACK, (String) null);
        int i10 = this.f14256b + 1;
        this.f14256b = i10;
        this.f14265k++;
        a10.f14322c = i10;
        this.f14268n.f14245d[i10] = a10;
        return a10;
    }

    public final i y(String str, i.b bVar) {
        f fVar = C;
        if (fVar != null) {
            fVar.f14288p++;
        }
        if (this.f14265k + 1 >= this.f14260f) {
            S();
        }
        i a10 = a(bVar, (String) null);
        a10.i(str);
        int i10 = this.f14256b + 1;
        this.f14256b = i10;
        this.f14265k++;
        a10.f14322c = i10;
        if (this.f14257c == null) {
            this.f14257c = new HashMap<>();
        }
        this.f14257c.put(str, a10);
        this.f14268n.f14245d[this.f14256b] = a10;
        return a10;
    }

    public void z() {
        B();
        String str = " num vars " + this.f14256b + "\n";
        for (int i10 = 0; i10 < this.f14256b + 1; i10++) {
            i iVar = this.f14268n.f14245d[i10];
            if (iVar != null && iVar.f14326g) {
                str = str + " $[" + i10 + "] => " + iVar + " = " + iVar.f14325f + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i11 = 0; i11 < this.f14256b + 1; i11++) {
            i[] iVarArr = this.f14268n.f14245d;
            i iVar2 = iVarArr[i11];
            if (iVar2 != null && iVar2.f14333n) {
                str2 = str2 + " ~[" + i11 + "] => " + iVar2 + " = " + iVarArr[iVar2.f14334o] + " + " + iVar2.f14335p + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i12 = 0; i12 < this.f14266l; i12++) {
            str3 = (str3 + this.f14261g[i12].F()) + "\n #  ";
        }
        if (this.f14258d != null) {
            str3 = str3 + "Goal: " + this.f14258d + "\n";
        }
        System.out.println(str3);
    }
}

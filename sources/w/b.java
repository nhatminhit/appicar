package w;

import java.util.ArrayList;
import w.e;
import w.i;

public class b implements e.a {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f14234g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f14235h = false;

    /* renamed from: a  reason: collision with root package name */
    public i f14236a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f14237b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14238c = false;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<i> f14239d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f14240e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14241f = false;

    public interface a {
        float a(i iVar);

        void b();

        float c(i iVar, boolean z10);

        void clear();

        int d();

        void e(i iVar, float f10, boolean z10);

        boolean f(i iVar);

        int g(i iVar);

        i h(int i10);

        void i();

        float j(int i10);

        void k(i iVar, float f10);

        float l(b bVar, boolean z10);

        int m();

        void n(float f10);
    }

    public b() {
    }

    public b(c cVar) {
        this.f14240e = new a(this, cVar);
    }

    public i A(i iVar) {
        return B((boolean[]) null, iVar);
    }

    public final i B(boolean[] zArr, i iVar) {
        i.b bVar;
        int d10 = this.f14240e.d();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < d10; i10++) {
            float j10 = this.f14240e.j(i10);
            if (j10 < 0.0f) {
                i h10 = this.f14240e.h(i10);
                if ((zArr == null || !zArr[h10.f14322c]) && h10 != iVar && (((bVar = h10.f14329j) == i.b.SLACK || bVar == i.b.ERROR) && j10 < f10)) {
                    f10 = j10;
                    iVar2 = h10;
                }
            }
        }
        return iVar2;
    }

    public void C(i iVar) {
        i iVar2 = this.f14236a;
        if (iVar2 != null) {
            this.f14240e.k(iVar2, -1.0f);
            this.f14236a.f14323d = -1;
            this.f14236a = null;
        }
        float c10 = this.f14240e.c(iVar, true) * -1.0f;
        this.f14236a = iVar;
        if (c10 != 1.0f) {
            this.f14237b /= c10;
            this.f14240e.n(c10);
        }
    }

    public void D() {
        this.f14236a = null;
        this.f14240e.clear();
        this.f14237b = 0.0f;
        this.f14241f = false;
    }

    public int E() {
        return (this.f14236a != null ? 4 : 0) + 4 + 4 + this.f14240e.m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String F() {
        /*
            r10 = this;
            w.i r0 = r10.f14236a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            w.i r1 = r10.f14236a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f14237b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f14237b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            w.b$a r5 = r10.f14240e
            int r5 = r5.d()
        L_0x0059:
            if (r3 >= r5) goto L_0x00d1
            w.b$a r6 = r10.f14240e
            w.i r6 = r6.h(r3)
            if (r6 != 0) goto L_0x0064
            goto L_0x00ce
        L_0x0064:
            w.b$a r7 = r10.f14240e
            float r7 = r7.j(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
            goto L_0x00ce
        L_0x006f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0086
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a2
        L_0x0086:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x009a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00aa
        L_0x009a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00aa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c3
        L_0x00b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        L_0x00ce:
            int r3 = r3 + 1
            goto L_0x0059
        L_0x00d1:
            if (r1 != 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.F():java.lang.String");
    }

    public void G(e eVar, i iVar, boolean z10) {
        if (iVar.f14333n) {
            float a10 = this.f14240e.a(iVar);
            this.f14237b += iVar.f14335p * a10;
            this.f14240e.c(iVar, z10);
            if (z10) {
                iVar.f(this);
            }
            this.f14240e.e(eVar.f14268n.f14245d[iVar.f14334o], a10, z10);
            if (e.f14252x && this.f14240e.d() == 0) {
                this.f14241f = true;
                eVar.f14255a = true;
            }
        }
    }

    public void a(e eVar, i iVar, boolean z10) {
        if (iVar.f14326g) {
            this.f14237b += iVar.f14325f * this.f14240e.a(iVar);
            this.f14240e.c(iVar, z10);
            if (z10) {
                iVar.f(this);
            }
            if (e.f14252x && this.f14240e.d() == 0) {
                this.f14241f = true;
                eVar.f14255a = true;
            }
        }
    }

    public void b(e eVar) {
        if (eVar.f14261g.length != 0) {
            boolean z10 = false;
            while (!z10) {
                int d10 = this.f14240e.d();
                for (int i10 = 0; i10 < d10; i10++) {
                    i h10 = this.f14240e.h(i10);
                    if (h10.f14323d != -1 || h10.f14326g || h10.f14333n) {
                        this.f14239d.add(h10);
                    }
                }
                int size = this.f14239d.size();
                if (size > 0) {
                    for (int i11 = 0; i11 < size; i11++) {
                        i iVar = this.f14239d.get(i11);
                        if (iVar.f14326g) {
                            a(eVar, iVar, true);
                        } else if (iVar.f14333n) {
                            G(eVar, iVar, true);
                        } else {
                            f(eVar, eVar.f14261g[iVar.f14323d], true);
                        }
                    }
                    this.f14239d.clear();
                } else {
                    z10 = true;
                }
            }
            if (e.f14252x && this.f14236a != null && this.f14240e.d() == 0) {
                this.f14241f = true;
                eVar.f14255a = true;
            }
        }
    }

    public i c(e eVar, boolean[] zArr) {
        return B(zArr, (i) null);
    }

    public void clear() {
        this.f14240e.clear();
        this.f14236a = null;
        this.f14237b = 0.0f;
    }

    public void d(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f14236a = null;
            this.f14240e.clear();
            for (int i10 = 0; i10 < bVar.f14240e.d(); i10++) {
                this.f14240e.e(bVar.f14240e.h(i10), bVar.f14240e.j(i10), true);
            }
        }
    }

    public void e(i iVar) {
        int i10 = iVar.f14324e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f14240e.k(iVar, f10);
    }

    public void f(e eVar, b bVar, boolean z10) {
        this.f14237b += bVar.f14237b * this.f14240e.l(bVar, z10);
        if (z10) {
            bVar.f14236a.f(this);
        }
        if (e.f14252x && this.f14236a != null && this.f14240e.d() == 0) {
            this.f14241f = true;
            eVar.f14255a = true;
        }
    }

    public b g(e eVar, int i10) {
        this.f14240e.k(eVar.s(i10, "ep"), 1.0f);
        this.f14240e.k(eVar.s(i10, "em"), -1.0f);
        return this;
    }

    public i getKey() {
        return this.f14236a;
    }

    public b h(i iVar, int i10) {
        this.f14240e.k(iVar, (float) i10);
        return this;
    }

    public boolean i(e eVar) {
        boolean z10;
        i j10 = j(eVar);
        if (j10 == null) {
            z10 = true;
        } else {
            C(j10);
            z10 = false;
        }
        if (this.f14240e.d() == 0) {
            this.f14241f = true;
        }
        return z10;
    }

    public boolean isEmpty() {
        return this.f14236a == null && this.f14237b == 0.0f && this.f14240e.d() == 0;
    }

    public i j(e eVar) {
        int d10 = this.f14240e.d();
        i iVar = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        i iVar2 = null;
        for (int i10 = 0; i10 < d10; i10++) {
            float j10 = this.f14240e.j(i10);
            i h10 = this.f14240e.h(i10);
            if (h10.f14329j == i.b.UNRESTRICTED) {
                if (iVar == null || f10 > j10) {
                    z10 = z(h10, eVar);
                    f10 = j10;
                    iVar = h10;
                } else if (!z10 && z(h10, eVar)) {
                    f10 = j10;
                    iVar = h10;
                    z10 = true;
                }
            } else if (iVar == null && j10 < 0.0f) {
                if (iVar2 == null || f11 > j10) {
                    z11 = z(h10, eVar);
                    f11 = j10;
                    iVar2 = h10;
                } else if (!z11 && z(h10, eVar)) {
                    f11 = j10;
                    iVar2 = h10;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public b k(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        float f11;
        int i12;
        if (iVar2 == iVar3) {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar4, 1.0f);
            this.f14240e.k(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar3, -1.0f);
            this.f14240e.k(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
            }
            return this;
        }
        if (f10 <= 0.0f) {
            this.f14240e.k(iVar, -1.0f);
            this.f14240e.k(iVar2, 1.0f);
            f11 = (float) i10;
        } else if (f10 >= 1.0f) {
            this.f14240e.k(iVar4, -1.0f);
            this.f14240e.k(iVar3, 1.0f);
            i12 = -i11;
        } else {
            float f12 = 1.0f - f10;
            this.f14240e.k(iVar, f12 * 1.0f);
            this.f14240e.k(iVar2, f12 * -1.0f);
            this.f14240e.k(iVar3, -1.0f * f10);
            this.f14240e.k(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                f11 = (((float) (-i10)) * f12) + (((float) i11) * f10);
            }
            return this;
        }
        this.f14237b = f11;
        return this;
        f11 = (float) i12;
        this.f14237b = f11;
        return this;
    }

    public b l(i iVar, int i10) {
        this.f14236a = iVar;
        float f10 = (float) i10;
        iVar.f14325f = f10;
        this.f14237b = f10;
        this.f14241f = true;
        return this;
    }

    public b m(i iVar, i iVar2, float f10) {
        this.f14240e.k(iVar, -1.0f);
        this.f14240e.k(iVar2, f10);
        return this;
    }

    public b n(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f14240e.k(iVar, -1.0f);
        this.f14240e.k(iVar2, 1.0f);
        this.f14240e.k(iVar3, f10);
        this.f14240e.k(iVar4, -f10);
        return this;
    }

    public b o(float f10, float f11, float f12, i iVar, int i10, i iVar2, int i11, i iVar3, int i12, i iVar4, int i13) {
        if (f11 == 0.0f || f10 == f12) {
            this.f14237b = (float) (((-i10) - i11) + i12 + i13);
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar4, 1.0f);
            this.f14240e.k(iVar3, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f14237b = ((float) ((-i10) - i11)) + (((float) i12) * f13) + (((float) i13) * f13);
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar4, f13);
            this.f14240e.k(iVar3, -f13);
        }
        return this;
    }

    public b p(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f14237b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar4, 1.0f);
            this.f14240e.k(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f14240e.k(iVar3, 1.0f);
            this.f14240e.k(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar4, f13);
            this.f14240e.k(iVar3, -f13);
        }
        return this;
    }

    public b q(i iVar, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f14237b = (float) (i10 * -1);
            aVar = this.f14240e;
            f10 = 1.0f;
        } else {
            this.f14237b = (float) i10;
            aVar = this.f14240e;
            f10 = -1.0f;
        }
        aVar.k(iVar, f10);
        return this;
    }

    public b r(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f14237b = (float) i10;
        }
        if (!z10) {
            this.f14240e.k(iVar, -1.0f);
            this.f14240e.k(iVar2, 1.0f);
        } else {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
        }
        return this;
    }

    public b s(i iVar, int i10, i iVar2) {
        this.f14237b = (float) i10;
        this.f14240e.k(iVar, -1.0f);
        return this;
    }

    public b t(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f14237b = (float) i10;
        }
        if (!z10) {
            this.f14240e.k(iVar, -1.0f);
            this.f14240e.k(iVar2, 1.0f);
            this.f14240e.k(iVar3, 1.0f);
        } else {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar3, -1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f14237b = (float) i10;
        }
        if (!z10) {
            this.f14240e.k(iVar, -1.0f);
            this.f14240e.k(iVar2, 1.0f);
            this.f14240e.k(iVar3, -1.0f);
        } else {
            this.f14240e.k(iVar, 1.0f);
            this.f14240e.k(iVar2, -1.0f);
            this.f14240e.k(iVar3, 1.0f);
        }
        return this;
    }

    public b v(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f14240e.k(iVar3, 0.5f);
        this.f14240e.k(iVar4, 0.5f);
        this.f14240e.k(iVar, -0.5f);
        this.f14240e.k(iVar2, -0.5f);
        this.f14237b = -f10;
        return this;
    }

    public void w() {
        float f10 = this.f14237b;
        if (f10 < 0.0f) {
            this.f14237b = f10 * -1.0f;
            this.f14240e.i();
        }
    }

    public boolean x() {
        i iVar = this.f14236a;
        return iVar != null && (iVar.f14329j == i.b.UNRESTRICTED || this.f14237b >= 0.0f);
    }

    public boolean y(i iVar) {
        return this.f14240e.f(iVar);
    }

    public final boolean z(i iVar, e eVar) {
        return iVar.f14332m <= 1;
    }
}

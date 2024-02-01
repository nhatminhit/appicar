package z;

import java.util.ArrayList;
import z.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f15594a;

    /* renamed from: b  reason: collision with root package name */
    public e f15595b;

    /* renamed from: c  reason: collision with root package name */
    public e f15596c;

    /* renamed from: d  reason: collision with root package name */
    public e f15597d;

    /* renamed from: e  reason: collision with root package name */
    public e f15598e;

    /* renamed from: f  reason: collision with root package name */
    public e f15599f;

    /* renamed from: g  reason: collision with root package name */
    public e f15600g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<e> f15601h;

    /* renamed from: i  reason: collision with root package name */
    public int f15602i;

    /* renamed from: j  reason: collision with root package name */
    public int f15603j;

    /* renamed from: k  reason: collision with root package name */
    public float f15604k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f15605l;

    /* renamed from: m  reason: collision with root package name */
    public int f15606m;

    /* renamed from: n  reason: collision with root package name */
    public int f15607n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15608o;

    /* renamed from: p  reason: collision with root package name */
    public int f15609p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15610q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15611r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15612s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15613t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15614u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15615v;

    public c(e eVar, int i10, boolean z10) {
        this.f15594a = eVar;
        this.f15609p = i10;
        this.f15610q = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f15676r[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(z.e r2, int r3) {
        /*
            int r0 = r2.i0()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            z.e$b[] r0 = r2.U
            r0 = r0[r3]
            z.e$b r1 = z.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f15676r
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.c.k(z.e, int):boolean");
    }

    public void a() {
        if (!this.f15615v) {
            b();
        }
        this.f15615v = true;
    }

    public final void b() {
        int i10 = this.f15609p * 2;
        e eVar = this.f15594a;
        boolean z10 = true;
        this.f15608o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f15602i++;
            e[] eVarArr = eVar.H0;
            int i11 = this.f15609p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.G0[i11] = null;
            if (eVar.i0() != 8) {
                this.f15605l++;
                e.b z12 = eVar.z(this.f15609p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z12 != bVar) {
                    this.f15606m += eVar.M(this.f15609p);
                }
                int g10 = this.f15606m + eVar.R[i10].g();
                this.f15606m = g10;
                int i12 = i10 + 1;
                this.f15606m = g10 + eVar.R[i12].g();
                int g11 = this.f15607n + eVar.R[i10].g();
                this.f15607n = g11;
                this.f15607n = g11 + eVar.R[i12].g();
                if (this.f15595b == null) {
                    this.f15595b = eVar;
                }
                this.f15597d = eVar;
                e.b[] bVarArr = eVar.U;
                int i13 = this.f15609p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f15676r[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f15603j++;
                        float f10 = eVar.F0[i13];
                        if (f10 > 0.0f) {
                            this.f15604k += f10;
                        }
                        if (k(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f15611r = true;
                            } else {
                                this.f15612s = true;
                            }
                            if (this.f15601h == null) {
                                this.f15601h = new ArrayList<>();
                            }
                            this.f15601h.add(eVar);
                        }
                        if (this.f15599f == null) {
                            this.f15599f = eVar;
                        }
                        e eVar4 = this.f15600g;
                        if (eVar4 != null) {
                            eVar4.G0[this.f15609p] = eVar;
                        }
                        this.f15600g = eVar;
                    }
                    if (this.f15609p != 0 ? !(eVar.f15674q == 0 && eVar.f15684v == 0 && eVar.f15686w == 0) : !(eVar.f15672p == 0 && eVar.f15678s == 0 && eVar.f15680t == 0)) {
                        this.f15608o = false;
                    }
                    if (eVar.Y != 0.0f) {
                        this.f15608o = false;
                        this.f15614u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.H0[this.f15609p] = eVar;
            }
            d dVar = eVar.R[i10 + 1].f15623f;
            if (dVar != null) {
                e eVar5 = dVar.f15621d;
                d dVar2 = eVar5.R[i10].f15623f;
                if (dVar2 != null && dVar2.f15621d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f15595b;
        if (eVar6 != null) {
            this.f15606m -= eVar6.R[i10].g();
        }
        e eVar7 = this.f15597d;
        if (eVar7 != null) {
            this.f15606m -= eVar7.R[i10 + 1].g();
        }
        this.f15596c = eVar;
        if (this.f15609p != 0 || !this.f15610q) {
            this.f15598e = this.f15594a;
        } else {
            this.f15598e = eVar;
        }
        if (!this.f15612s || !this.f15611r) {
            z10 = false;
        }
        this.f15613t = z10;
    }

    public e c() {
        return this.f15594a;
    }

    public e d() {
        return this.f15599f;
    }

    public e e() {
        return this.f15595b;
    }

    public e f() {
        return this.f15598e;
    }

    public e g() {
        return this.f15596c;
    }

    public e h() {
        return this.f15600g;
    }

    public e i() {
        return this.f15597d;
    }

    public float j() {
        return this.f15604k;
    }
}

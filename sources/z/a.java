package z;

import java.util.HashMap;
import w.e;
import w.i;
import z.d;
import z.e;

public class a extends j {

    /* renamed from: u1  reason: collision with root package name */
    public static final int f15582u1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f15583v1 = 1;

    /* renamed from: w1  reason: collision with root package name */
    public static final int f15584w1 = 2;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f15585x1 = 3;

    /* renamed from: y1  reason: collision with root package name */
    public static final boolean f15586y1 = true;

    /* renamed from: z1  reason: collision with root package name */
    public static final boolean f15587z1 = false;

    /* renamed from: q1  reason: collision with root package name */
    public int f15588q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f15589r1 = true;

    /* renamed from: s1  reason: collision with root package name */
    public int f15590s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f15591t1 = false;

    public a() {
    }

    public a(String str) {
        O0(str);
    }

    public boolean Q1() {
        int i10;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i11;
        int i12;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f15751p1;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f15750o1[i13];
            if ((this.f15589r1 || eVar.h()) && ((((i11 = this.f15588q1) == 0 || i11 == 1) && !eVar.x0()) || (((i12 = this.f15588q1) == 2 || i12 == 3) && !eVar.y0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f15751p1; i15++) {
            e eVar2 = this.f15750o1[i15];
            if (this.f15589r1 || eVar2.h()) {
                if (!z11) {
                    int i16 = this.f15588q1;
                    if (i16 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i16 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i16 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i16 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z11 = true;
                    }
                    i14 = eVar2.r(bVar3).f();
                    z11 = true;
                }
                int i17 = this.f15588q1;
                if (i17 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i17 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i17 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i17 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i14 = Math.max(i14, eVar2.r(bVar).f());
                }
                i14 = Math.min(i14, eVar2.r(bVar2).f());
            }
        }
        int i18 = i14 + this.f15590s1;
        int i19 = this.f15588q1;
        if (i19 == 0 || i19 == 1) {
            V0(i18, i18);
        } else {
            Y0(i18, i18);
        }
        this.f15591t1 = true;
        return true;
    }

    public boolean R1() {
        return this.f15589r1;
    }

    public int S1() {
        return this.f15588q1;
    }

    public int T1() {
        return this.f15590s1;
    }

    public int U1() {
        int i10 = this.f15588q1;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void V1() {
        for (int i10 = 0; i10 < this.f15751p1; i10++) {
            e eVar = this.f15750o1[i10];
            int i11 = this.f15588q1;
            if (i11 == 0 || i11 == 1) {
                eVar.l1(0, true);
            } else if (i11 == 2 || i11 == 3) {
                eVar.l1(1, true);
            }
        }
    }

    public void W1(boolean z10) {
        this.f15589r1 = z10;
    }

    public void X1(int i10) {
        this.f15588q1 = i10;
    }

    public void Y1(int i10) {
        this.f15590s1 = i10;
    }

    public void g(e eVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        i iVar;
        d dVar;
        int i10;
        int i11;
        int i12;
        i iVar2;
        int i13;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i14 = 0;
        while (true) {
            dVarArr = this.R;
            if (i14 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i14];
            dVar2.f15626i = eVar.u(dVar2);
            i14++;
        }
        int i15 = this.f15588q1;
        if (i15 >= 0 && i15 < 4) {
            d dVar3 = dVarArr[i15];
            if (!this.f15591t1) {
                Q1();
            }
            if (this.f15591t1) {
                this.f15591t1 = false;
                int i16 = this.f15588q1;
                if (i16 == 0 || i16 == 1) {
                    eVar.f(this.J.f15626i, this.f15643a0);
                    iVar2 = this.L.f15626i;
                    i13 = this.f15643a0;
                } else if (i16 == 2 || i16 == 3) {
                    eVar.f(this.K.f15626i, this.f15645b0);
                    iVar2 = this.M.f15626i;
                    i13 = this.f15645b0;
                } else {
                    return;
                }
                eVar.f(iVar2, i13);
                return;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= this.f15751p1) {
                    z11 = false;
                    break;
                }
                e eVar2 = this.f15750o1[i17];
                if ((this.f15589r1 || eVar2.h()) && ((((i11 = this.f15588q1) == 0 || i11 == 1) && eVar2.H() == e.b.MATCH_CONSTRAINT && eVar2.J.f15623f != null && eVar2.L.f15623f != null) || (((i12 = this.f15588q1) == 2 || i12 == 3) && eVar2.g0() == e.b.MATCH_CONSTRAINT && eVar2.K.f15623f != null && eVar2.M.f15623f != null))) {
                    z11 = true;
                } else {
                    i17++;
                }
            }
            z11 = true;
            boolean z12 = this.J.m() || this.L.m();
            boolean z13 = this.K.m() || this.M.m();
            boolean z14 = !z11 && (((i10 = this.f15588q1) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))));
            int i18 = 5;
            if (!z14) {
                i18 = 4;
            }
            for (int i19 = 0; i19 < this.f15751p1; i19++) {
                e eVar3 = this.f15750o1[i19];
                if (this.f15589r1 || eVar3.h()) {
                    i u10 = eVar.u(eVar3.R[this.f15588q1]);
                    d[] dVarArr3 = eVar3.R;
                    int i20 = this.f15588q1;
                    d dVar4 = dVarArr3[i20];
                    dVar4.f15626i = u10;
                    d dVar5 = dVar4.f15623f;
                    int i21 = (dVar5 == null || dVar5.f15621d != this) ? 0 : dVar4.f15624g + 0;
                    if (i20 == 0 || i20 == 2) {
                        eVar.j(dVar3.f15626i, u10, this.f15590s1 - i21, z11);
                    } else {
                        eVar.h(dVar3.f15626i, u10, this.f15590s1 + i21, z11);
                    }
                    eVar.e(dVar3.f15626i, u10, this.f15590s1 + i21, i18);
                }
            }
            int i22 = this.f15588q1;
            if (i22 == 0) {
                eVar.e(this.L.f15626i, this.J.f15626i, 0, 8);
                eVar.e(this.J.f15626i, this.V.L.f15626i, 0, 4);
                iVar = this.J.f15626i;
                dVar = this.V.J;
            } else if (i22 == 1) {
                eVar.e(this.J.f15626i, this.L.f15626i, 0, 8);
                eVar.e(this.J.f15626i, this.V.J.f15626i, 0, 4);
                iVar = this.J.f15626i;
                dVar = this.V.L;
            } else if (i22 == 2) {
                eVar.e(this.M.f15626i, this.K.f15626i, 0, 8);
                eVar.e(this.K.f15626i, this.V.M.f15626i, 0, 4);
                iVar = this.K.f15626i;
                dVar = this.V.K;
            } else if (i22 == 3) {
                eVar.e(this.K.f15626i, this.M.f15626i, 0, 8);
                eVar.e(this.K.f15626i, this.V.K.f15626i, 0, 4);
                iVar = this.K.f15626i;
                dVar = this.V.M;
            } else {
                return;
            }
            eVar.e(iVar, dVar.f15626i, 0, 0);
        }
    }

    public boolean h() {
        return true;
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        a aVar = (a) eVar;
        this.f15588q1 = aVar.f15588q1;
        this.f15589r1 = aVar.f15589r1;
        this.f15590s1 = aVar.f15590s1;
    }

    public String toString() {
        String str = "[Barrier] " + y() + " {";
        for (int i10 = 0; i10 < this.f15751p1; i10++) {
            e eVar = this.f15750o1[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.y();
        }
        return str + p7.a.f11639j;
    }

    public boolean x0() {
        return this.f15591t1;
    }

    public boolean y0() {
        return this.f15591t1;
    }
}

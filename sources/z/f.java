package z;

import a0.b;
import a0.e;
import a0.h;
import a0.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import z.e;

public class f extends n {
    public static final int S1 = 8;
    public static final boolean T1 = false;
    public static final boolean U1 = false;
    public static final boolean V1 = false;
    public static int W1;
    public int A1 = 0;
    public c[] B1 = new c[4];
    public c[] C1 = new c[4];
    public boolean D1 = false;
    public boolean E1 = false;
    public boolean F1 = false;
    public int G1 = 0;
    public int H1 = 0;
    public int I1 = 257;
    public boolean J1 = false;
    public boolean K1 = false;
    public boolean L1 = false;
    public int M1 = 0;
    public WeakReference<d> N1 = null;
    public WeakReference<d> O1 = null;
    public WeakReference<d> P1 = null;
    public WeakReference<d> Q1 = null;
    public b.a R1 = new b.a();

    /* renamed from: p1  reason: collision with root package name */
    public b f15696p1 = new b(this);

    /* renamed from: q1  reason: collision with root package name */
    public e f15697q1 = new e(this);

    /* renamed from: r1  reason: collision with root package name */
    public b.C0002b f15698r1 = null;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f15699s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    public w.f f15700t1;

    /* renamed from: u1  reason: collision with root package name */
    public w.e f15701u1 = new w.e();

    /* renamed from: v1  reason: collision with root package name */
    public int f15702v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f15703w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f15704x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f15705y1;

    /* renamed from: z1  reason: collision with root package name */
    public int f15706z1 = 0;

    public f() {
    }

    public f(int i10, int i11) {
        super(i10, i11);
    }

    public f(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public f(String str, int i10, int i11) {
        super(i10, i11);
        O0(str);
    }

    public static boolean v2(e eVar, b.C0002b bVar, b.a aVar, int i10) {
        int i11;
        int i12;
        if (bVar == null) {
            return false;
        }
        aVar.f16a = eVar.H();
        aVar.f17b = eVar.g0();
        aVar.f18c = eVar.j0();
        aVar.f19d = eVar.D();
        aVar.f24i = false;
        aVar.f25j = i10;
        e.b bVar2 = aVar.f16a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f17b == bVar3;
        boolean z12 = z10 && eVar.Y > 0.0f;
        boolean z13 = z11 && eVar.Y > 0.0f;
        if (z10 && eVar.n0(0) && eVar.f15672p == 0 && !z12) {
            aVar.f16a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f15674q == 0) {
                aVar.f16a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.n0(1) && eVar.f15674q == 0 && !z13) {
            aVar.f17b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f15672p == 0) {
                aVar.f17b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.x0()) {
            aVar.f16a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.y0()) {
            aVar.f17b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f15676r[0] == 4) {
                aVar.f16a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar4 = aVar.f17b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i12 = aVar.f19d;
                } else {
                    aVar.f16a = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i12 = aVar.f21f;
                }
                aVar.f16a = bVar5;
                int i13 = eVar.Z;
                aVar.f18c = (int) ((i13 == 0 || i13 == -1) ? eVar.A() * ((float) i12) : eVar.A() / ((float) i12));
            }
        }
        if (z13) {
            if (eVar.f15676r[1] == 4) {
                aVar.f17b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar6 = aVar.f16a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i11 = aVar.f18c;
                } else {
                    aVar.f17b = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i11 = aVar.f20e;
                }
                aVar.f17b = bVar7;
                int i14 = eVar.Z;
                aVar.f19d = (int) ((i14 == 0 || i14 == -1) ? ((float) i11) / eVar.A() : ((float) i11) * eVar.A());
            }
        }
        bVar.b(eVar, aVar);
        eVar.H1(aVar.f20e);
        eVar.d1(aVar.f21f);
        eVar.c1(aVar.f23h);
        eVar.L0(aVar.f22g);
        aVar.f25j = b.a.f13k;
        return aVar.f24i;
    }

    public void A2(int i10, int i11, int i12, int i13) {
        this.f15702v1 = i10;
        this.f15703w1 = i11;
        this.f15704x1 = i12;
        this.f15705y1 = i13;
    }

    public void B2(boolean z10) {
        this.f15699s1 = z10;
    }

    public void C2(w.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean w22 = w2(64);
        N1(eVar, w22);
        int size = this.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15783o1.get(i10).N1(eVar, w22);
        }
    }

    public void D2() {
        this.f15696p1.e(this);
    }

    public void F0() {
        this.f15701u1.Y();
        this.f15702v1 = 0;
        this.f15704x1 = 0;
        this.f15703w1 = 0;
        this.f15705y1 = 0;
        this.J1 = false;
        super.F0();
    }

    public void M1(boolean z10, boolean z11) {
        super.M1(z10, z11);
        int size = this.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15783o1.get(i10).M1(z10, z11);
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    public void R1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ? r62;
        boolean z12;
        e.b bVar;
        int i12 = 0;
        this.f15643a0 = 0;
        this.f15645b0 = 0;
        this.K1 = false;
        this.L1 = false;
        int size = this.f15783o1.size();
        int max = Math.max(0, j0());
        int max2 = Math.max(0, D());
        e.b[] bVarArr = this.U;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        w.f fVar = this.f15700t1;
        if (fVar != null) {
            fVar.P++;
        }
        if (k.b(this.I1, 1)) {
            h.i(this, k2());
            for (int i13 = 0; i13 < size; i13++) {
                e eVar = this.f15783o1.get(i13);
                if (eVar.w0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof m) && !eVar.v0()) {
                    e.b z13 = eVar.z(0);
                    e.b z14 = eVar.z(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(z13 == bVar4 && eVar.f15672p != 1 && z14 == bVar4 && eVar.f15674q != 1)) {
                        v2(eVar, this.f15698r1, new b.a(), b.a.f13k);
                    }
                }
            }
        }
        if (size <= 2 || (!(bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) || !k.b(this.I1, 1024) || !i.c(this, k2()))) {
            i10 = max2;
            i11 = max;
            z10 = false;
        } else {
            if (bVar3 == bVar) {
                if (max >= j0() || max <= 0) {
                    max = j0();
                } else {
                    H1(max);
                    this.K1 = true;
                }
            }
            if (bVar2 == bVar) {
                if (max2 >= D() || max2 <= 0) {
                    max2 = D();
                } else {
                    d1(max2);
                    this.L1 = true;
                }
            }
            i10 = max2;
            i11 = max;
            z10 = true;
        }
        boolean z15 = w2(64) || w2(128);
        w.e eVar2 = this.f15701u1;
        eVar2.f14262h = false;
        eVar2.f14263i = false;
        if (this.I1 != 0 && z15) {
            eVar2.f14263i = true;
        }
        ArrayList<e> arrayList = this.f15783o1;
        e.b H = H();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z16 = H == bVar5 || g0() == bVar5;
        x2();
        for (int i14 = 0; i14 < size; i14++) {
            e eVar3 = this.f15783o1.get(i14);
            if (eVar3 instanceof n) {
                ((n) eVar3).R1();
            }
        }
        boolean w22 = w2(64);
        boolean z17 = z10;
        int i15 = 0;
        boolean z18 = true;
        while (z18) {
            int i16 = i15 + 1;
            try {
                this.f15701u1.Y();
                x2();
                o(this.f15701u1);
                for (int i17 = i12; i17 < size; i17++) {
                    this.f15783o1.get(i17).o(this.f15701u1);
                }
                z18 = V1(this.f15701u1);
                WeakReference<d> weakReference = this.N1;
                if (!(weakReference == null || weakReference.get() == null)) {
                    a2(this.N1.get(), this.f15701u1.u(this.K));
                    this.N1 = null;
                }
                WeakReference<d> weakReference2 = this.P1;
                if (!(weakReference2 == null || weakReference2.get() == null)) {
                    Z1(this.P1.get(), this.f15701u1.u(this.M));
                    this.P1 = null;
                }
                WeakReference<d> weakReference3 = this.O1;
                if (!(weakReference3 == null || weakReference3.get() == null)) {
                    a2(this.O1.get(), this.f15701u1.u(this.J));
                    this.O1 = null;
                }
                WeakReference<d> weakReference4 = this.Q1;
                if (!(weakReference4 == null || weakReference4.get() == null)) {
                    Z1(this.Q1.get(), this.f15701u1.u(this.L));
                    this.Q1 = null;
                }
                if (z18) {
                    this.f15701u1.T();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            w.e eVar4 = this.f15701u1;
            if (z18) {
                C2(eVar4, k.f15765n);
            } else {
                N1(eVar4, w22);
                for (int i18 = 0; i18 < size; i18++) {
                    this.f15783o1.get(i18).N1(this.f15701u1, w22);
                }
            }
            if (!z16 || i16 >= 8 || !k.f15765n[2]) {
                z11 = false;
            } else {
                int i19 = 0;
                int i20 = 0;
                for (int i21 = 0; i21 < size; i21++) {
                    e eVar5 = this.f15783o1.get(i21);
                    i19 = Math.max(i19, eVar5.f15643a0 + eVar5.j0());
                    i20 = Math.max(i20, eVar5.f15645b0 + eVar5.D());
                }
                int max3 = Math.max(this.f15657h0, i19);
                int max4 = Math.max(this.f15659i0, i20);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || j0() >= max3) {
                    z11 = false;
                } else {
                    H1(max3);
                    this.U[0] = bVar6;
                    z11 = true;
                    z17 = true;
                }
                if (bVar2 == bVar6 && D() < max4) {
                    d1(max4);
                    this.U[1] = bVar6;
                    z11 = true;
                    z17 = true;
                }
            }
            int max5 = Math.max(this.f15657h0, j0());
            if (max5 > j0()) {
                H1(max5);
                this.U[0] = e.b.FIXED;
                z11 = true;
                z17 = true;
            }
            int max6 = Math.max(this.f15659i0, D());
            if (max6 > D()) {
                d1(max6);
                r62 = 1;
                this.U[1] = e.b.FIXED;
                z11 = true;
                z12 = true;
            } else {
                r62 = 1;
                z12 = z17;
            }
            if (!z12) {
                e.b bVar7 = this.U[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i11 > 0 && j0() > i11) {
                    this.K1 = r62;
                    this.U[0] = e.b.FIXED;
                    H1(i11);
                    z11 = r62;
                    z12 = z11;
                }
                if (this.U[r62] == bVar8 && i10 > 0 && D() > i10) {
                    this.L1 = r62;
                    this.U[r62] = e.b.FIXED;
                    d1(i10);
                    z17 = true;
                    z18 = true;
                    i15 = i16;
                    i12 = 0;
                }
            }
            z18 = z11;
            z17 = z12;
            i15 = i16;
            i12 = 0;
        }
        this.f15783o1 = arrayList;
        if (z17) {
            e.b[] bVarArr2 = this.U;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        K0(this.f15701u1.G());
    }

    public void U1(e eVar, int i10) {
        if (i10 == 0) {
            W1(eVar);
        } else if (i10 == 1) {
            b2(eVar);
        }
    }

    public boolean V1(w.e eVar) {
        boolean w22 = w2(64);
        g(eVar, w22);
        int size = this.f15783o1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.f15783o1.get(i10);
            eVar2.l1(0, false);
            eVar2.l1(1, false);
            if (eVar2 instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar3 = this.f15783o1.get(i11);
                if (eVar3 instanceof a) {
                    ((a) eVar3).V1();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar4 = this.f15783o1.get(i12);
            if (eVar4.f()) {
                eVar4.g(eVar, w22);
            }
        }
        if (w.e.f14250v) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar5 = this.f15783o1.get(i13);
                if (!eVar5.f()) {
                    hashSet.add(eVar5);
                }
            }
            e(this, eVar, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e eVar6 = (e) it.next();
                k.a(this, eVar, eVar6);
                eVar6.g(eVar, w22);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar7 = this.f15783o1.get(i14);
                if (eVar7 instanceof f) {
                    e.b[] bVarArr = eVar7.U;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.i1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D1(e.b.FIXED);
                    }
                    eVar7.g(eVar, w22);
                    if (bVar == bVar3) {
                        eVar7.i1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D1(bVar2);
                    }
                } else {
                    k.a(this, eVar, eVar7);
                    if (!eVar7.f()) {
                        eVar7.g(eVar, w22);
                    }
                }
            }
        }
        if (this.f15706z1 > 0) {
            b.b(this, eVar, (ArrayList<e>) null, 0);
        }
        if (this.A1 > 0) {
            b.b(this, eVar, (ArrayList<e>) null, 1);
        }
        return true;
    }

    public final void W1(e eVar) {
        int i10 = this.f15706z1 + 1;
        c[] cVarArr = this.C1;
        if (i10 >= cVarArr.length) {
            this.C1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.C1[this.f15706z1] = new c(eVar, 0, s2());
        this.f15706z1++;
    }

    public void X1(d dVar) {
        WeakReference<d> weakReference = this.Q1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.Q1.get().f()) {
            this.Q1 = new WeakReference<>(dVar);
        }
    }

    public void Y1(d dVar) {
        WeakReference<d> weakReference = this.O1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.O1.get().f()) {
            this.O1 = new WeakReference<>(dVar);
        }
    }

    public final void Z1(d dVar, w.i iVar) {
        this.f15701u1.i(iVar, this.f15701u1.u(dVar), 0, 5);
    }

    public final void a2(d dVar, w.i iVar) {
        this.f15701u1.i(this.f15701u1.u(dVar), iVar, 0, 5);
    }

    public final void b2(e eVar) {
        int i10 = this.A1 + 1;
        c[] cVarArr = this.B1;
        if (i10 >= cVarArr.length) {
            this.B1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B1[this.A1] = new c(eVar, 1, s2());
        this.A1++;
    }

    public String c0() {
        return ConstraintLayout.f1775r0;
    }

    public void c2(d dVar) {
        WeakReference<d> weakReference = this.P1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.P1.get().f()) {
            this.P1 = new WeakReference<>(dVar);
        }
    }

    public void d2(d dVar) {
        WeakReference<d> weakReference = this.N1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.N1.get().f()) {
            this.N1 = new WeakReference<>(dVar);
        }
    }

    public void e2() {
        this.f15697q1.f(H(), g0());
    }

    public boolean f2(boolean z10) {
        return this.f15697q1.g(z10);
    }

    public boolean g2(boolean z10) {
        return this.f15697q1.h(z10);
    }

    public boolean h2(boolean z10, int i10) {
        return this.f15697q1.i(z10, i10);
    }

    public void i2(w.f fVar) {
        this.f15700t1 = fVar;
        this.f15701u1.F(fVar);
    }

    public ArrayList<h> j2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f15783o1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.C0002b k2() {
        return this.f15698r1;
    }

    public int l2() {
        return this.I1;
    }

    public w.e m2() {
        return this.f15701u1;
    }

    public ArrayList<h> n2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f15783o1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean o2() {
        return false;
    }

    public void p2() {
        this.f15697q1.o();
    }

    public void q2() {
        this.f15697q1.p();
    }

    public boolean r2() {
        return this.L1;
    }

    public boolean s2() {
        return this.f15699s1;
    }

    public boolean t2() {
        return this.K1;
    }

    public long u2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17;
        this.f15702v1 = i19;
        int i20 = i18;
        this.f15703w1 = i20;
        return this.f15696p1.d(this, i10, i19, i20, i11, i12, i13, i14, i15, i16);
    }

    public boolean w2(int i10) {
        return (this.I1 & i10) == i10;
    }

    public final void x2() {
        this.f15706z1 = 0;
        this.A1 = 0;
    }

    public void y2(b.C0002b bVar) {
        this.f15698r1 = bVar;
        this.f15697q1.u(bVar);
    }

    public void z2(int i10) {
        this.I1 = i10;
        w.e.f14250v = w2(512);
    }
}

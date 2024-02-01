package z;

import a0.b;
import z.e;

public class m extends j {
    public int A1 = 0;
    public b.a B1 = new b.a();
    public b.C0002b C1 = null;

    /* renamed from: q1  reason: collision with root package name */
    public int f15773q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    public int f15774r1 = 0;

    /* renamed from: s1  reason: collision with root package name */
    public int f15775s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    public int f15776t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    public int f15777u1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    public int f15778v1 = 0;

    /* renamed from: w1  reason: collision with root package name */
    public int f15779w1 = 0;

    /* renamed from: x1  reason: collision with root package name */
    public int f15780x1 = 0;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f15781y1 = false;

    /* renamed from: z1  reason: collision with root package name */
    public int f15782z1 = 0;

    public void Q1(boolean z10) {
        int i10 = this.f15777u1;
        if (i10 <= 0 && this.f15778v1 <= 0) {
            return;
        }
        if (z10) {
            this.f15779w1 = this.f15778v1;
            this.f15780x1 = i10;
            return;
        }
        this.f15779w1 = i10;
        this.f15780x1 = this.f15778v1;
    }

    public void R1() {
        for (int i10 = 0; i10 < this.f15751p1; i10++) {
            e eVar = this.f15750o1[i10];
            if (eVar != null) {
                eVar.n1(true);
            }
        }
    }

    public int S1() {
        return this.A1;
    }

    public int T1() {
        return this.f15782z1;
    }

    public int U1() {
        return this.f15774r1;
    }

    public int V1() {
        return this.f15779w1;
    }

    public int W1() {
        return this.f15780x1;
    }

    public int X1() {
        return this.f15773q1;
    }

    public void Y1(int i10, int i11, int i12, int i13) {
    }

    public void Z1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.C1 == null && U() != null) {
            this.C1 = ((f) U()).k2();
        }
        b.a aVar = this.B1;
        aVar.f16a = bVar;
        aVar.f17b = bVar2;
        aVar.f18c = i10;
        aVar.f19d = i11;
        this.C1.b(eVar, aVar);
        eVar.H1(this.B1.f20e);
        eVar.d1(this.B1.f21f);
        eVar.c1(this.B1.f23h);
        eVar.L0(this.B1.f22g);
    }

    public boolean a2() {
        e eVar = this.V;
        b.C0002b k22 = eVar != null ? ((f) eVar).k2() : null;
        if (k22 == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f15751p1) {
                return true;
            }
            e eVar2 = this.f15750o1[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b z11 = eVar2.z(0);
                e.b z12 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (z11 != bVar || eVar2.f15672p == 1 || z12 != bVar || eVar2.f15674q == 1) {
                    z10 = false;
                }
                if (!z10) {
                    if (z11 == bVar) {
                        z11 = e.b.WRAP_CONTENT;
                    }
                    if (z12 == bVar) {
                        z12 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.B1;
                    aVar.f16a = z11;
                    aVar.f17b = z12;
                    aVar.f18c = eVar2.j0();
                    this.B1.f19d = eVar2.D();
                    k22.b(eVar2, this.B1);
                    eVar2.H1(this.B1.f20e);
                    eVar2.d1(this.B1.f21f);
                    eVar2.L0(this.B1.f22g);
                }
            }
            i10++;
        }
    }

    public boolean b2() {
        return this.f15781y1;
    }

    public void c(f fVar) {
        R1();
    }

    public void c2(boolean z10) {
        this.f15781y1 = z10;
    }

    public void d2(int i10, int i11) {
        this.f15782z1 = i10;
        this.A1 = i11;
    }

    public void e2(int i10) {
        this.f15775s1 = i10;
        this.f15773q1 = i10;
        this.f15776t1 = i10;
        this.f15774r1 = i10;
        this.f15777u1 = i10;
        this.f15778v1 = i10;
    }

    public void f2(int i10) {
        this.f15774r1 = i10;
    }

    public void g2(int i10) {
        this.f15778v1 = i10;
    }

    public void h2(int i10) {
        this.f15775s1 = i10;
        this.f15779w1 = i10;
    }

    public void i2(int i10) {
        this.f15776t1 = i10;
        this.f15780x1 = i10;
    }

    public void j2(int i10) {
        this.f15777u1 = i10;
        this.f15779w1 = i10;
        this.f15780x1 = i10;
    }

    public void k2(int i10) {
        this.f15773q1 = i10;
    }
}

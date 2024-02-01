package a0;

import a0.f;
import z.a;
import z.e;

public class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    public void a(d dVar) {
        a aVar = (a) this.f89b;
        int S1 = aVar.S1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f95h.f49l) {
            int i12 = fVar.f44g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (S1 == 0 || S1 == 2) {
            this.f95h.e(i11 + aVar.T1());
        } else {
            this.f95h.e(i10 + aVar.T1());
        }
    }

    public void d() {
        p pVar;
        e eVar = this.f89b;
        if (eVar instanceof a) {
            this.f95h.f39b = true;
            a aVar = (a) eVar;
            int S1 = aVar.S1();
            boolean R1 = aVar.R1();
            int i10 = 0;
            if (S1 == 0) {
                this.f95h.f42e = f.a.LEFT;
                while (i10 < aVar.f15751p1) {
                    e eVar2 = aVar.f15750o1[i10];
                    if (R1 || eVar2.i0() != 8) {
                        f fVar = eVar2.f15650e.f95h;
                        fVar.f48k.add(this.f95h);
                        this.f95h.f49l.add(fVar);
                    }
                    i10++;
                }
            } else if (S1 != 1) {
                if (S1 == 2) {
                    this.f95h.f42e = f.a.TOP;
                    while (i10 < aVar.f15751p1) {
                        e eVar3 = aVar.f15750o1[i10];
                        if (R1 || eVar3.i0() != 8) {
                            f fVar2 = eVar3.f15652f.f95h;
                            fVar2.f48k.add(this.f95h);
                            this.f95h.f49l.add(fVar2);
                        }
                        i10++;
                    }
                } else if (S1 == 3) {
                    this.f95h.f42e = f.a.BOTTOM;
                    while (i10 < aVar.f15751p1) {
                        e eVar4 = aVar.f15750o1[i10];
                        if (R1 || eVar4.i0() != 8) {
                            f fVar3 = eVar4.f15652f.f96i;
                            fVar3.f48k.add(this.f95h);
                            this.f95h.f49l.add(fVar3);
                        }
                        i10++;
                    }
                } else {
                    return;
                }
                u(this.f89b.f15652f.f95h);
                pVar = this.f89b.f15652f;
                u(pVar.f96i);
            } else {
                this.f95h.f42e = f.a.RIGHT;
                while (i10 < aVar.f15751p1) {
                    e eVar5 = aVar.f15750o1[i10];
                    if (R1 || eVar5.i0() != 8) {
                        f fVar4 = eVar5.f15650e.f96i;
                        fVar4.f48k.add(this.f95h);
                        this.f95h.f49l.add(fVar4);
                    }
                    i10++;
                }
            }
            u(this.f89b.f15650e.f95h);
            pVar = this.f89b.f15650e;
            u(pVar.f96i);
        }
    }

    public void e() {
        e eVar = this.f89b;
        if (eVar instanceof a) {
            int S1 = ((a) eVar).S1();
            if (S1 == 0 || S1 == 1) {
                this.f89b.J1(this.f95h.f44g);
            } else {
                this.f89b.K1(this.f95h.f44g);
            }
        }
    }

    public void f() {
        this.f90c = null;
        this.f95h.c();
    }

    public void n() {
        this.f95h.f47j = false;
    }

    public boolean p() {
        return false;
    }

    public final void u(f fVar) {
        this.f95h.f48k.add(fVar);
        fVar.f49l.add(this.f95h);
    }
}

package a0;

import z.e;
import z.h;

public class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f15650e.f();
        eVar.f15652f.f();
        this.f93f = ((h) eVar).Q1();
    }

    public void a(d dVar) {
        f fVar = this.f95h;
        if (fVar.f40c && !fVar.f47j) {
            this.f95h.e((int) ((((float) fVar.f49l.get(0).f44g) * ((h) this.f89b).U1()) + 0.5f));
        }
    }

    public void d() {
        p pVar;
        f fVar;
        f fVar2;
        h hVar = (h) this.f89b;
        int R1 = hVar.R1();
        int T1 = hVar.T1();
        hVar.U1();
        if (hVar.Q1() == 1) {
            f fVar3 = this.f95h;
            if (R1 != -1) {
                fVar3.f49l.add(this.f89b.V.f15650e.f95h);
                this.f89b.V.f15650e.f95h.f48k.add(this.f95h);
                fVar2 = this.f95h;
            } else if (T1 != -1) {
                fVar3.f49l.add(this.f89b.V.f15650e.f96i);
                this.f89b.V.f15650e.f96i.f48k.add(this.f95h);
                fVar2 = this.f95h;
                R1 = -T1;
            } else {
                fVar3.f39b = true;
                fVar3.f49l.add(this.f89b.V.f15650e.f96i);
                this.f89b.V.f15650e.f96i.f48k.add(this.f95h);
                u(this.f89b.f15650e.f95h);
                pVar = this.f89b.f15650e;
            }
            fVar2.f43f = R1;
            u(this.f89b.f15650e.f95h);
            pVar = this.f89b.f15650e;
        } else {
            f fVar4 = this.f95h;
            if (R1 != -1) {
                fVar4.f49l.add(this.f89b.V.f15652f.f95h);
                this.f89b.V.f15652f.f95h.f48k.add(this.f95h);
                fVar = this.f95h;
            } else if (T1 != -1) {
                fVar4.f49l.add(this.f89b.V.f15652f.f96i);
                this.f89b.V.f15652f.f96i.f48k.add(this.f95h);
                fVar = this.f95h;
                R1 = -T1;
            } else {
                fVar4.f39b = true;
                fVar4.f49l.add(this.f89b.V.f15652f.f96i);
                this.f89b.V.f15652f.f96i.f48k.add(this.f95h);
                u(this.f89b.f15652f.f95h);
                pVar = this.f89b.f15652f;
            }
            fVar.f43f = R1;
            u(this.f89b.f15652f.f95h);
            pVar = this.f89b.f15652f;
        }
        u(pVar.f96i);
    }

    public void e() {
        if (((h) this.f89b).Q1() == 1) {
            this.f89b.J1(this.f95h.f44g);
        } else {
            this.f89b.K1(this.f95h.f44g);
        }
    }

    public void f() {
        this.f95h.c();
    }

    public void n() {
        this.f95h.f47j = false;
        this.f96i.f47j = false;
    }

    public boolean p() {
        return false;
    }

    public final void u(f fVar) {
        this.f95h.f48k.add(fVar);
        fVar.f49l.add(this.f95h);
    }
}

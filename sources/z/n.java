package z;

import java.util.ArrayList;
import w.c;

public class n extends e {

    /* renamed from: o1  reason: collision with root package name */
    public ArrayList<e> f15783o1 = new ArrayList<>();

    public n() {
    }

    public n(int i10, int i11) {
        super(i10, i11);
    }

    public n(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public void F0() {
        this.f15783o1.clear();
        super.F0();
    }

    public void K0(c cVar) {
        super.K0(cVar);
        int size = this.f15783o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15783o1.get(i10).K0(cVar);
        }
    }

    public void O1(e... eVarArr) {
        for (e b10 : eVarArr) {
            b(b10);
        }
    }

    public ArrayList<e> P1() {
        return this.f15783o1;
    }

    public f Q1() {
        e U = U();
        f fVar = this instanceof f ? (f) this : null;
        while (U != null) {
            e U2 = U.U();
            if (U instanceof f) {
                fVar = (f) U;
            }
            U = U2;
        }
        return fVar;
    }

    public void R1() {
        ArrayList<e> arrayList = this.f15783o1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f15783o1.get(i10);
                if (eVar instanceof n) {
                    ((n) eVar).R1();
                }
            }
        }
    }

    public void S1(e eVar) {
        this.f15783o1.remove(eVar);
        eVar.F0();
    }

    public void T1() {
        this.f15783o1.clear();
    }

    public void b(e eVar) {
        this.f15783o1.add(eVar);
        if (eVar.U() != null) {
            ((n) eVar.U()).S1(eVar);
        }
        eVar.x1(this);
    }

    public void v1(int i10, int i11) {
        super.v1(i10, i11);
        int size = this.f15783o1.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f15783o1.get(i12).v1(Y(), Z());
        }
    }
}

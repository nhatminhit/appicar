package z;

import a0.i;
import a0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class j extends e implements i {

    /* renamed from: o1  reason: collision with root package name */
    public e[] f15750o1 = new e[4];

    /* renamed from: p1  reason: collision with root package name */
    public int f15751p1 = 0;

    public void O1(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f15751p1; i11++) {
            oVar.a(this.f15750o1[i11]);
        }
        for (int i12 = 0; i12 < this.f15751p1; i12++) {
            i.a(this.f15750o1[i12], i10, arrayList, oVar);
        }
    }

    public int P1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f15751p1; i13++) {
            e eVar = this.f15750o1[i13];
            if (i10 == 0 && (i12 = eVar.K0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.L0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    public void a() {
        this.f15751p1 = 0;
        Arrays.fill(this.f15750o1, (Object) null);
    }

    public void b(e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.f15751p1 + 1;
            e[] eVarArr = this.f15750o1;
            if (i10 > eVarArr.length) {
                this.f15750o1 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.f15750o1;
            int i11 = this.f15751p1;
            eVarArr2[i11] = eVar;
            this.f15751p1 = i11 + 1;
        }
    }

    public void c(f fVar) {
    }

    public void n(e eVar, HashMap<e, e> hashMap) {
        super.n(eVar, hashMap);
        j jVar = (j) eVar;
        this.f15751p1 = 0;
        int i10 = jVar.f15751p1;
        for (int i11 = 0; i11 < i10; i11++) {
            b(hashMap.get(jVar.f15750o1[i11]));
        }
    }
}

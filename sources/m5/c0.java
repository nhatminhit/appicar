package m5;

import a6.b0;
import a6.s;
import i5.g;
import i5.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l5.v;
import w4.l;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<v> f10368a;

    public c0() {
        this.f10368a = new ArrayList();
    }

    public c0(List<v> list) {
        this.f10368a = list;
    }

    public void a(v vVar) {
        this.f10368a.add(vVar);
    }

    public Object b(l lVar, g gVar, Object obj, b0 b0Var) throws IOException {
        int size = this.f10368a.size();
        for (int i10 = 0; i10 < size; i10++) {
            l t32 = b0Var.t3();
            t32.D2();
            this.f10368a.get(i10).t(t32, gVar, obj);
        }
        return obj;
    }

    public c0 c(s sVar) {
        k<Object> v10;
        ArrayList arrayList = new ArrayList(this.f10368a.size());
        for (v next : this.f10368a) {
            v U = next.U(sVar.d(next.getName()));
            k<Object> E = U.E();
            if (!(E == null || (v10 = E.v(sVar)) == E)) {
                U = U.V(v10);
            }
            arrayList.add(U);
        }
        return new c0(arrayList);
    }
}

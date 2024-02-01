package a0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z.b;
import z.d;
import z.e;
import z.f;

public class o {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f72g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f73h;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f74a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f75b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f77d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f78e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f79f = -1;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<e> f80a;

        /* renamed from: b  reason: collision with root package name */
        public int f81b;

        /* renamed from: c  reason: collision with root package name */
        public int f82c;

        /* renamed from: d  reason: collision with root package name */
        public int f83d;

        /* renamed from: e  reason: collision with root package name */
        public int f84e;

        /* renamed from: f  reason: collision with root package name */
        public int f85f;

        /* renamed from: g  reason: collision with root package name */
        public int f86g;

        public a(e eVar, w.e eVar2, int i10) {
            this.f80a = new WeakReference<>(eVar);
            this.f81b = eVar2.O(eVar.J);
            this.f82c = eVar2.O(eVar.K);
            this.f83d = eVar2.O(eVar.L);
            this.f84e = eVar2.O(eVar.M);
            this.f85f = eVar2.O(eVar.N);
            this.f86g = i10;
        }

        public void a() {
            e eVar = this.f80a.get();
            if (eVar != null) {
                eVar.U0(this.f81b, this.f82c, this.f83d, this.f84e, this.f85f, this.f86g);
            }
        }
    }

    public o(int i10) {
        int i11 = f73h;
        f73h = i11 + 1;
        this.f75b = i11;
        this.f77d = i10;
    }

    public boolean a(e eVar) {
        if (this.f74a.contains(eVar)) {
            return false;
        }
        this.f74a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f78e != null && this.f76c) {
            for (int i10 = 0; i10 < this.f78e.size(); i10++) {
                this.f78e.get(i10).a();
            }
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f74a.size();
        if (this.f79f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f79f == oVar.f75b) {
                    m(this.f77d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f74a.clear();
    }

    public final boolean e(e eVar) {
        return this.f74a.contains(eVar);
    }

    public int f() {
        return this.f75b;
    }

    public int g() {
        return this.f77d;
    }

    public final String h() {
        int i10 = this.f77d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public boolean i(o oVar) {
        for (int i10 = 0; i10 < this.f74a.size(); i10++) {
            if (oVar.e(this.f74a.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f76c;
    }

    public final int k(int i10, e eVar) {
        e.b z10 = eVar.z(i10);
        if (z10 == e.b.WRAP_CONTENT || z10 == e.b.MATCH_PARENT || z10 == e.b.FIXED) {
            return i10 == 0 ? eVar.j0() : eVar.D();
        }
        return -1;
    }

    public int l(w.e eVar, int i10) {
        if (this.f74a.size() == 0) {
            return 0;
        }
        return q(eVar, this.f74a, i10);
    }

    public void m(int i10, o oVar) {
        Iterator<e> it = this.f74a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            int f10 = oVar.f();
            if (i10 == 0) {
                next.K0 = f10;
            } else {
                next.L0 = f10;
            }
        }
        this.f79f = oVar.f75b;
    }

    public void n(boolean z10) {
        this.f76c = z10;
    }

    public void o(int i10) {
        this.f77d = i10;
    }

    public int p() {
        return this.f74a.size();
    }

    public final int q(w.e eVar, ArrayList<e> arrayList, int i10) {
        int O;
        d dVar;
        f fVar = (f) arrayList.get(0).U();
        eVar.Y();
        fVar.g(eVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(eVar, false);
        }
        if (i10 == 0 && fVar.f15706z1 > 0) {
            b.b(fVar, eVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.A1 > 0) {
            b.b(fVar, eVar, arrayList, 1);
        }
        try {
            eVar.T();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f78e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f78e.add(new a(arrayList.get(i12), eVar, i10));
        }
        if (i10 == 0) {
            O = eVar.O(fVar.J);
            dVar = fVar.L;
        } else {
            O = eVar.O(fVar.K);
            dVar = fVar.M;
        }
        int O2 = eVar.O(dVar);
        eVar.Y();
        return O2 - O;
    }

    public String toString() {
        String str = h() + " [" + this.f75b + "] <";
        Iterator<e> it = this.f74a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().y();
        }
        return str + " >";
    }
}

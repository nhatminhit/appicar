package mh;

import hh.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jh.e;
import jh.h;
import jh.k;
import jh.m;
import jh.p;

public class c extends ArrayList<h> {
    public c() {
    }

    public c(int i10) {
        super(i10);
    }

    public c(Collection<h> collection) {
        super(collection);
    }

    public c(List<h> list) {
        super(list);
    }

    public c(h... hVarArr) {
        super(Arrays.asList(hVarArr));
    }

    public List<k> A() {
        return M(k.class);
    }

    public boolean B(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((h) it.next()).G(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean C(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((h) it.next()).v1(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean D() {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((h) it.next()).w1()) {
                return true;
            }
        }
        return false;
    }

    public String E() {
        StringBuilder b10 = ih.c.b();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (b10.length() != 0) {
                b10.append("\n");
            }
            b10.append(hVar.x1());
        }
        return ih.c.o(b10);
    }

    public c F(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).y1(str);
        }
        return this;
    }

    public boolean G(String str) {
        d t10 = h.t(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((h) it.next()).E1(t10)) {
                return true;
            }
        }
        return false;
    }

    public h H() {
        if (isEmpty()) {
            return null;
        }
        return (h) get(size() - 1);
    }

    public c I() {
        return a0((String) null, true, false);
    }

    public c J(String str) {
        return a0(str, true, false);
    }

    public c K() {
        return a0((String) null, true, true);
    }

    public c L(String str) {
        return a0(str, true, true);
    }

    public final <T extends m> List<T> M(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.getClass().isInstance(cls)) {
                arrayList.add(cls.cast(hVar));
            } else if (m.class.isAssignableFrom(cls)) {
                for (int i10 = 0; i10 < hVar.u(); i10++) {
                    m t10 = hVar.t(i10);
                    if (cls.isInstance(t10)) {
                        arrayList.add(cls.cast(t10));
                    }
                }
            }
        }
        return arrayList;
    }

    public c O(String str) {
        return i.a(this, i.b(str, this));
    }

    public String P() {
        StringBuilder b10 = ih.c.b();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (b10.length() != 0) {
                b10.append("\n");
            }
            b10.append(hVar.P());
        }
        return ih.c.o(b10);
    }

    public c Q() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((h) it.next()).Q1());
        }
        return new c((Collection<h>) linkedHashSet);
    }

    public c R(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).R1(str);
        }
        return this;
    }

    public c S() {
        return a0((String) null, false, false);
    }

    public c T(String str) {
        return a0(str, false, false);
    }

    public c U() {
        return a0((String) null, false, true);
    }

    public c V(String str) {
        return a0(str, false, true);
    }

    public c W() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).Y();
        }
        return this;
    }

    public c X(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).Z(str);
        }
        return this;
    }

    public c Y(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).Z1(str);
        }
        return this;
    }

    public c Z(String str) {
        return i.b(str, this);
    }

    public final c a0(String str, boolean z10, boolean z11) {
        c cVar = new c();
        d t10 = str != null ? h.t(str) : null;
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            do {
                hVar = z10 ? hVar.J1() : hVar.W1();
                if (hVar == null) {
                    break;
                } else if (t10 == null || hVar.E1(t10)) {
                    cVar.add(hVar);
                    continue;
                }
            } while (z11);
        }
        return cVar;
    }

    public c b0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).k2(str);
        }
        return this;
    }

    public String c0() {
        StringBuilder b10 = ih.c.b();
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (b10.length() != 0) {
                b10.append(" ");
            }
            b10.append(hVar.l2());
        }
        return ih.c.o(b10);
    }

    public List<p> e0() {
        return M(p.class);
    }

    public c f0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).o2(str);
        }
        return this;
    }

    public c g0(g gVar) {
        f.d(gVar, this);
        return this;
    }

    public c h0() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).m0();
        }
        return this;
    }

    public c i(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).r0(str);
        }
        return this;
    }

    public String i0() {
        return size() > 0 ? z().q2() : "";
    }

    public c j(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).j(str);
        }
        return this;
    }

    public c j0(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).r2(str);
        }
        return this;
    }

    public c k0(String str) {
        d.h(str);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).n0(str);
        }
        return this;
    }

    public c m(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).u0(str);
        }
        return this;
    }

    public String n(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.G(str)) {
                return hVar.m(str);
            }
        }
        return "";
    }

    public c p(String str, String str2) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).n(str, str2);
        }
        return this;
    }

    public c q(String str) {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).r(str);
        }
        return this;
    }

    /* renamed from: r */
    public c clone() {
        c cVar = new c(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            cVar.add(((h) it.next()).z());
        }
        return cVar;
    }

    public List<jh.d> s() {
        return M(jh.d.class);
    }

    public List<e> t() {
        return M(e.class);
    }

    public String toString() {
        return P();
    }

    public List<String> u(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.G(str)) {
                arrayList.add(hVar.m(str));
            }
        }
        return arrayList;
    }

    public List<String> v() {
        ArrayList arrayList = new ArrayList(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.w1()) {
                arrayList.add(hVar.l2());
            }
        }
        return arrayList;
    }

    public c w() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((h) it.next()).C();
        }
        return this;
    }

    public c x(int i10) {
        if (size() <= i10) {
            return new c();
        }
        return new c((h) get(i10));
    }

    public c y(e eVar) {
        f.b(eVar, this);
        return this;
    }

    public h z() {
        if (isEmpty()) {
            return null;
        }
        return (h) get(0);
    }
}

package jh;

import gh.a;
import hh.c;
import hh.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.h;
import mh.c;
import pf.y0;

public class k extends h {
    public final c Y = new c();

    public k(h hVar, String str, b bVar) {
        super(hVar, str, bVar);
    }

    public void a0(m mVar) {
        super.a0(mVar);
        this.Y.remove(mVar);
    }

    public k u2(h hVar) {
        this.Y.add(hVar);
        return this;
    }

    /* renamed from: v2 */
    public k z() {
        return (k) super.z();
    }

    public c w2() {
        return this.Y;
    }

    public List<a.b> x2() {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.i2().m() && !hVar.G("disabled")) {
                String m10 = hVar.m("name");
                if (m10.length() != 0) {
                    String m11 = hVar.m("type");
                    if (!m11.equalsIgnoreCase("button")) {
                        if ("select".equals(hVar.M1())) {
                            boolean z10 = false;
                            Iterator it2 = hVar.c2("option[selected]").iterator();
                            while (it2.hasNext()) {
                                arrayList.add(c.C0320c.b(m10, ((h) it2.next()).q2()));
                                z10 = true;
                            }
                            if (!z10) {
                                hVar = hVar.c2("option").z();
                                if (hVar == null) {
                                }
                            }
                        } else if ("checkbox".equalsIgnoreCase(m11) || "radio".equalsIgnoreCase(m11)) {
                            if (hVar.G("checked")) {
                                if (hVar.q2().length() <= 0) {
                                    str = y0.f22056d;
                                    arrayList.add(c.C0320c.b(m10, str));
                                }
                            }
                        }
                        str = hVar.q2();
                        arrayList.add(c.C0320c.b(m10, str));
                    }
                }
            }
        }
        return arrayList;
    }

    public a y2() {
        String a10 = G("action") ? a("action") : q();
        d.i(a10, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        return gh.c.d(a10).u(x2()).a(m("method").toUpperCase().equals("POST") ? a.c.POST : a.c.GET);
    }
}

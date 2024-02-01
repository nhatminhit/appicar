package jh;

import hh.d;
import java.util.Collections;
import java.util.List;

public abstract class l extends m {
    public static final List<m> S = Collections.emptyList();
    public Object R;

    public void B(String str) {
    }

    public m C() {
        return this;
    }

    public List<m> D() {
        return S;
    }

    public boolean G(String str) {
        r0();
        return super.G(str);
    }

    public final boolean H() {
        return this.R instanceof b;
    }

    public m Z(String str) {
        r0();
        return super.Z(str);
    }

    public String a(String str) {
        r0();
        return super.a(str);
    }

    public String m(String str) {
        d.j(str);
        return !H() ? str.equals(N()) ? (String) this.R : "" : super.m(str);
    }

    public m n(String str, String str2) {
        if (H() || !str.equals(N())) {
            r0();
            super.n(str, str2);
        } else {
            this.R = str2;
        }
        return this;
    }

    public String o0() {
        return m(N());
    }

    public final b p() {
        r0();
        return (b) this.R;
    }

    public void p0(String str) {
        n(N(), str);
    }

    public String q() {
        return I() ? U().q() : "";
    }

    /* renamed from: q0 */
    public l A(m mVar) {
        l lVar = (l) super.A(mVar);
        if (H()) {
            lVar.R = ((b) this.R).clone();
        }
        return lVar;
    }

    public final void r0() {
        if (!H()) {
            Object obj = this.R;
            b bVar = new b();
            this.R = bVar;
            if (obj != null) {
                bVar.M(N(), (String) obj);
            }
        }
    }

    public int u() {
        return 0;
    }
}

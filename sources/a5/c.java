package a5;

import w4.m;

public class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final m f197b;

    public c(String str) {
        this(m.j(str));
    }

    public c(m mVar) {
        this.f197b = mVar;
    }

    public boolean a() {
        return this.f197b.s();
    }

    public d d() {
        return this;
    }

    public d e() {
        return this;
    }

    public d h(int i10) {
        m q10 = this.f197b.q(i10);
        if (q10 == null) {
            return null;
        }
        return q10.s() ? d.f198a : new c(q10);
    }

    public d q(String str) {
        m r10 = this.f197b.r(str);
        if (r10 == null) {
            return null;
        }
        return r10.s() ? d.f198a : new c(r10);
    }

    public String toString() {
        return "[JsonPointerFilter at: " + this.f197b + "]";
    }
}

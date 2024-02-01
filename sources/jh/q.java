package jh;

import hh.d;
import ih.c;
import java.io.IOException;
import java.util.Iterator;
import jh.f;

public class q extends l {
    public final boolean T;

    public q(String str, boolean z10) {
        d.j(str);
        this.R = str;
        this.T = z10;
    }

    public /* bridge */ /* synthetic */ m C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ boolean G(String str) {
        return super.G(str);
    }

    public String N() {
        return "#declaration";
    }

    public void R(Appendable appendable, int i10, f.a aVar) throws IOException {
        String str = "!";
        appendable.append("<").append(this.T ? str : "?").append(o0());
        u0(appendable, aVar);
        if (!this.T) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    public void S(Appendable appendable, int i10, f.a aVar) {
    }

    public /* bridge */ /* synthetic */ m Z(String str) {
        return super.Z(str);
    }

    public /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    public /* bridge */ /* synthetic */ String m(String str) {
        return super.m(str);
    }

    public /* bridge */ /* synthetic */ m n(String str, String str2) {
        return super.n(str, str2);
    }

    public /* bridge */ /* synthetic */ String q() {
        return super.q();
    }

    /* renamed from: s0 */
    public q z() {
        return (q) super.clone();
    }

    public String t0() {
        StringBuilder b10 = c.b();
        try {
            u0(b10, new f.a());
            return c.o(b10).trim();
        } catch (IOException e10) {
            throw new gh.d((Throwable) e10);
        }
    }

    public String toString() {
        return P();
    }

    public /* bridge */ /* synthetic */ int u() {
        return super.u();
    }

    public final void u0(Appendable appendable, f.a aVar) throws IOException {
        Iterator<a> it = p().iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.getKey().equals(N())) {
                appendable.append(p7.f.f11698i);
                next.m(appendable, aVar);
            }
        }
    }

    public String v0() {
        return o0();
    }
}

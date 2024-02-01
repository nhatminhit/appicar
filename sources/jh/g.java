package jh;

import hh.d;
import ih.c;
import java.io.IOException;
import jh.f;

public class g extends l {
    public static final String T = "PUBLIC";
    public static final String U = "SYSTEM";
    public static final String V = "name";
    public static final String W = "pubSysKey";
    public static final String X = "publicId";
    public static final String Y = "systemId";

    public g(String str, String str2, String str3) {
        d.j(str);
        d.j(str2);
        d.j(str3);
        n("name", str);
        n(X, str2);
        n(Y, str3);
        x0();
    }

    public /* bridge */ /* synthetic */ m C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ boolean G(String str) {
        return super.G(str);
    }

    public String N() {
        return "#doctype";
    }

    public void R(Appendable appendable, int i10, f.a aVar) throws IOException {
        appendable.append((aVar.v() != f.a.C0340a.html || s0(X) || s0(Y)) ? "<!DOCTYPE" : "<!doctype");
        if (s0("name")) {
            appendable.append(" ").append(m("name"));
        }
        if (s0(W)) {
            appendable.append(" ").append(m(W));
        }
        if (s0(X)) {
            appendable.append(" \"").append(m(X)).append('\"');
        }
        if (s0(Y)) {
            appendable.append(" \"").append(m(Y)).append('\"');
        }
        appendable.append('>');
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

    public final boolean s0(String str) {
        return !c.f(m(str));
    }

    public String t0() {
        return m("name");
    }

    public /* bridge */ /* synthetic */ int u() {
        return super.u();
    }

    public String u0() {
        return m(X);
    }

    public void v0(String str) {
        if (str != null) {
            n(W, str);
        }
    }

    public String w0() {
        return m(Y);
    }

    public final void x0() {
        String str;
        if (s0(X)) {
            str = T;
        } else if (s0(Y)) {
            str = U;
        } else {
            return;
        }
        n(W, str);
    }
}

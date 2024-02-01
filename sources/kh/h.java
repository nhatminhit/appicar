package kh;

import b4.a;
import bc.p;
import h0.w1;
import hh.d;
import java.util.HashMap;
import java.util.Map;
import k.g;
import n7.b;
import p7.f;
import w7.s;
import zb.q;

public class h implements Cloneable {
    public static final Map<String, h> X = new HashMap();
    public static final String[] Y;
    public static final String[] Z = {"object", "base", "font", b.f10945m, "i", f.f11703n, f.f11705p, "big", p.f16191j, "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", b.f10951s, "wbr", "map", q.f25095b, "sub", "sup", "bdo", "iframe", "embed", b.f10950r, "input", "select", "textarea", w1.f8777k, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", a.P, "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", a.P, "track", "data", "bdi", "s"};

    /* renamed from: a0  reason: collision with root package name */
    public static final String[] f20299a0 = {"meta", "link", "base", "frame", "img", b.f10951s, "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", a.P, "track"};

    /* renamed from: b0  reason: collision with root package name */
    public static final String[] f20300b0 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};

    /* renamed from: c0  reason: collision with root package name */
    public static final String[] f20301c0 = {"pre", "plaintext", "title", "textarea"};

    /* renamed from: d0  reason: collision with root package name */
    public static final String[] f20302d0 = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};

    /* renamed from: e0  reason: collision with root package name */
    public static final String[] f20303e0 = {"input", "keygen", "object", "select", "textarea"};
    public String O;
    public String P;
    public boolean Q = true;
    public boolean R = true;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;

    static {
        String[] strArr = {"html", b.f10946n, "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", b.f10948p, "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", s.f14799a, s.f14801b, "canvas", "details", g.f9834f, "plaintext", "template", "article", "main", "svg", "math", b.V};
        Y = strArr;
        for (String hVar : strArr) {
            u(new h(hVar));
        }
        for (String hVar2 : Z) {
            h hVar3 = new h(hVar2);
            hVar3.Q = false;
            hVar3.R = false;
            u(hVar3);
        }
        for (String str : f20299a0) {
            h hVar4 = X.get(str);
            d.j(hVar4);
            hVar4.S = true;
        }
        for (String str2 : f20300b0) {
            h hVar5 = X.get(str2);
            d.j(hVar5);
            hVar5.R = false;
        }
        for (String str3 : f20301c0) {
            h hVar6 = X.get(str3);
            d.j(hVar6);
            hVar6.U = true;
        }
        for (String str4 : f20302d0) {
            h hVar7 = X.get(str4);
            d.j(hVar7);
            hVar7.V = true;
        }
        for (String str5 : f20303e0) {
            h hVar8 = X.get(str5);
            d.j(hVar8);
            hVar8.W = true;
        }
    }

    public h(String str) {
        this.O = str;
        this.P = ih.b.a(str);
    }

    public static boolean q(String str) {
        return X.containsKey(str);
    }

    public static void u(h hVar) {
        X.put(hVar.O, hVar);
    }

    public static h w(String str) {
        return x(str, f.f20293d);
    }

    public static h x(String str, f fVar) {
        d.j(str);
        Map<String, h> map = X;
        h hVar = map.get(str);
        if (hVar != null) {
            return hVar;
        }
        String c10 = fVar.c(str);
        d.h(c10);
        String a10 = ih.b.a(c10);
        h hVar2 = map.get(a10);
        if (hVar2 == null) {
            h hVar3 = new h(c10);
            hVar3.Q = false;
            return hVar3;
        } else if (!fVar.e() || c10.equals(a10)) {
            return hVar2;
        } else {
            h a11 = hVar2.clone();
            a11.O = c10;
            return a11;
        }
    }

    /* renamed from: a */
    public h clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean d() {
        return this.R;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.O.equals(hVar.O) && this.S == hVar.S && this.R == hVar.R && this.Q == hVar.Q && this.U == hVar.U && this.T == hVar.T && this.V == hVar.V) {
            return this.W == hVar.W;
        }
        return false;
    }

    public String g() {
        return this.O;
    }

    public int hashCode() {
        return (((((((((((((this.O.hashCode() * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 31) + (this.S ? 1 : 0)) * 31) + (this.T ? 1 : 0)) * 31) + (this.U ? 1 : 0)) * 31) + (this.V ? 1 : 0)) * 31) + (this.W ? 1 : 0);
    }

    public boolean i() {
        return this.Q;
    }

    public boolean j() {
        return this.S;
    }

    public boolean k() {
        return this.V;
    }

    public boolean m() {
        return this.W;
    }

    public boolean n() {
        return !this.Q;
    }

    public boolean p() {
        return X.containsKey(this.O);
    }

    public boolean r() {
        return this.S || this.T;
    }

    public String s() {
        return this.P;
    }

    public boolean t() {
        return this.U;
    }

    public String toString() {
        return this.O;
    }

    public h v() {
        this.T = true;
        return this;
    }
}

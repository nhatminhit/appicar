package jh;

import bc.p;
import hh.d;
import ih.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import jh.f;

public class a implements Map.Entry<String, String>, Cloneable {
    public static final String[] R = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", p.f16197p, "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public String O;
    public String P;
    public b Q;

    public a(String str, String str2) {
        this(str, str2, (b) null);
    }

    public a(String str, String str2, b bVar) {
        d.j(str);
        String trim = str.trim();
        d.h(trim);
        this.O = trim;
        this.P = str2;
        this.Q = bVar;
    }

    public static a d(String str, String str2) {
        return new a(str, i.m(str2, true), (b) null);
    }

    public static void n(String str, String str2, Appendable appendable, f.a aVar) throws IOException {
        appendable.append(str);
        if (!u(str, str2, aVar)) {
            appendable.append("=\"");
            i.g(appendable, b.t(str2), aVar, true, false, false);
            appendable.append('\"');
        }
    }

    public static boolean p(String str) {
        return Arrays.binarySearch(R, str) >= 0;
    }

    public static boolean r(String str) {
        return str.startsWith(b.R) && str.length() > 5;
    }

    public static boolean u(String str, String str2, f.a aVar) {
        return aVar.v() == f.a.C0340a.html && (str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && p(str)));
    }

    /* renamed from: a */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.O;
        if (str == null ? aVar.O != null : !str.equals(aVar.O)) {
            return false;
        }
        String str2 = this.P;
        String str3 = aVar.P;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    /* renamed from: g */
    public String getKey() {
        return this.O;
    }

    public int hashCode() {
        String str = this.O;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.P;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    /* renamed from: i */
    public String getValue() {
        return b.t(this.P);
    }

    public boolean j() {
        return this.P != null;
    }

    public String k() {
        StringBuilder b10 = c.b();
        try {
            m(b10, new f("").I2());
            return c.o(b10);
        } catch (IOException e10) {
            throw new gh.d((Throwable) e10);
        }
    }

    public void m(Appendable appendable, f.a aVar) throws IOException {
        n(this.O, this.P, appendable, aVar);
    }

    public boolean q() {
        return r(this.O);
    }

    public void s(String str) {
        int H;
        d.j(str);
        String trim = str.trim();
        d.h(trim);
        b bVar = this.Q;
        if (!(bVar == null || (H = bVar.H(this.O)) == -1)) {
            this.Q.P[H] = trim;
        }
        this.O = trim;
    }

    /* renamed from: t */
    public String setValue(String str) {
        String str2 = this.P;
        b bVar = this.Q;
        if (bVar != null) {
            str2 = bVar.z(this.O);
            int H = this.Q.H(this.O);
            if (H != -1) {
                this.Q.Q[H] = str;
            }
        }
        this.P = str;
        return b.t(str2);
    }

    public String toString() {
        return k();
    }

    public final boolean v(f.a aVar) {
        return u(this.O, this.P, aVar);
    }
}

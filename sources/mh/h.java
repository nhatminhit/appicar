package mh;

import com.google.android.material.badge.BadgeDrawable;
import hh.d;
import ih.b;
import ih.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh.j;
import mh.b;
import mh.d;
import mh.i;
import mh.j;
import w7.l;

public class h {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f21133d = {",", ">", BadgeDrawable.f16655n0, "~", " "};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f21134e = {l.f14755k, "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f21135f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f21136g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a  reason: collision with root package name */
    public j f21137a;

    /* renamed from: b  reason: collision with root package name */
    public String f21138b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f21139c = new ArrayList();

    public h(String str) {
        d.h(str);
        String trim = str.trim();
        this.f21138b = trim;
        this.f21137a = new j(trim);
    }

    public static d t(String str) {
        try {
            return new h(str).s();
        } catch (IllegalArgumentException e10) {
            throw new i.a(e10.getMessage(), new Object[0]);
        }
    }

    public final void a() {
        this.f21139c.add(new d.a());
    }

    public final void b() {
        List<d> list;
        Object hVar;
        Object obj;
        List<d> list2;
        j jVar = new j(this.f21137a.d('[', ']'));
        String n10 = jVar.n(f21134e);
        hh.d.h(n10);
        jVar.p();
        if (jVar.r()) {
            if (n10.startsWith("^")) {
                list2 = this.f21139c;
                obj = new d.C0367d(n10.substring(1));
            } else {
                list2 = this.f21139c;
                obj = new d.b(n10);
            }
            list2.add(obj);
            return;
        }
        if (jVar.s(l.f14755k)) {
            list = this.f21139c;
            hVar = new d.e(n10, jVar.B());
        } else if (jVar.s("!=")) {
            list = this.f21139c;
            hVar = new d.i(n10, jVar.B());
        } else if (jVar.s("^=")) {
            list = this.f21139c;
            hVar = new d.j(n10, jVar.B());
        } else if (jVar.s("$=")) {
            list = this.f21139c;
            hVar = new d.g(n10, jVar.B());
        } else if (jVar.s("*=")) {
            list = this.f21139c;
            hVar = new d.f(n10, jVar.B());
        } else if (jVar.s("~=")) {
            list = this.f21139c;
            hVar = new d.h(n10, Pattern.compile(jVar.B()));
        } else {
            throw new i.a("Could not parse attribute query '%s': unexpected token at '%s'", this.f21138b, jVar.B());
        }
        list.add(hVar);
    }

    public final void c() {
        String j10 = this.f21137a.j();
        hh.d.h(j10);
        this.f21139c.add(new d.k(j10.trim()));
    }

    public final void d() {
        String j10 = this.f21137a.j();
        hh.d.h(j10);
        this.f21139c.add(new d.p(j10));
    }

    public final void e() {
        String b10 = b.b(this.f21137a.k());
        hh.d.h(b10);
        if (b10.startsWith("*|")) {
            this.f21139c.add(new b.C0366b(new d.j0(b10), new d.k0(b10.replace("*|", ":"))));
            return;
        }
        if (b10.contains("|")) {
            b10 = b10.replace("|", ":");
        }
        this.f21139c.add(new d.j0(b10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(char r11) {
        /*
            r10 = this;
            kh.j r0 = r10.f21137a
            r0.p()
            java.lang.String r0 = r10.h()
            mh.d r0 = t(r0)
            java.util.List<mh.d> r1 = r10.f21139c
            int r1 = r1.size()
            r2 = 44
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0033
            java.util.List<mh.d> r1 = r10.f21139c
            java.lang.Object r1 = r1.get(r4)
            mh.d r1 = (mh.d) r1
            boolean r5 = r1 instanceof mh.b.C0366b
            if (r5 == 0) goto L_0x003a
            if (r11 == r2) goto L_0x003a
            r5 = r1
            mh.b$b r5 = (mh.b.C0366b) r5
            mh.d r5 = r5.c()
            r6 = r3
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x003c
        L_0x0033:
            mh.b$a r1 = new mh.b$a
            java.util.List<mh.d> r5 = r10.f21139c
            r1.<init>((java.util.Collection<mh.d>) r5)
        L_0x003a:
            r5 = r1
            r6 = r4
        L_0x003c:
            java.util.List<mh.d> r7 = r10.f21139c
            r7.clear()
            r7 = 62
            r8 = 2
            if (r11 != r7) goto L_0x0057
            mh.b$a r11 = new mh.b$a
            mh.d[] r2 = new mh.d[r8]
            r2[r4] = r0
            mh.j$b r0 = new mh.j$b
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((mh.d[]) r2)
            goto L_0x00ae
        L_0x0057:
            r7 = 32
            if (r11 != r7) goto L_0x006c
            mh.b$a r11 = new mh.b$a
            mh.d[] r2 = new mh.d[r8]
            r2[r4] = r0
            mh.j$e r0 = new mh.j$e
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((mh.d[]) r2)
            goto L_0x00ae
        L_0x006c:
            r7 = 43
            if (r11 != r7) goto L_0x0081
            mh.b$a r11 = new mh.b$a
            mh.d[] r2 = new mh.d[r8]
            r2[r4] = r0
            mh.j$c r0 = new mh.j$c
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((mh.d[]) r2)
            goto L_0x00ae
        L_0x0081:
            r7 = 126(0x7e, float:1.77E-43)
            if (r11 != r7) goto L_0x0096
            mh.b$a r11 = new mh.b$a
            mh.d[] r2 = new mh.d[r8]
            r2[r4] = r0
            mh.j$f r0 = new mh.j$f
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((mh.d[]) r2)
            goto L_0x00ae
        L_0x0096:
            if (r11 != r2) goto L_0x00be
            boolean r11 = r1 instanceof mh.b.C0366b
            if (r11 == 0) goto L_0x00a3
            mh.b$b r1 = (mh.b.C0366b) r1
            r1.e(r0)
            r11 = r1
            goto L_0x00ae
        L_0x00a3:
            mh.b$b r11 = new mh.b$b
            r11.<init>()
            r11.e(r1)
            r11.e(r0)
        L_0x00ae:
            if (r6 == 0) goto L_0x00b7
            r0 = r5
            mh.b$b r0 = (mh.b.C0366b) r0
            r0.b(r11)
            goto L_0x00b8
        L_0x00b7:
            r5 = r11
        L_0x00b8:
            java.util.List<mh.d> r11 = r10.f21139c
            r11.add(r5)
            return
        L_0x00be:
            mh.i$a r0 = new mh.i$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.h.f(char):void");
    }

    public final int g() {
        String trim = this.f21137a.e(")").trim();
        hh.d.e(c.h(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    public final String h() {
        String str;
        StringBuilder b10 = c.b();
        while (!this.f21137a.r()) {
            if (this.f21137a.t("(")) {
                b10.append("(");
                b10.append(this.f21137a.d('(', ')'));
                str = ")";
            } else if (this.f21137a.t("[")) {
                b10.append("[");
                b10.append(this.f21137a.d('[', ']'));
                str = "]";
            } else if (this.f21137a.v(f21133d)) {
                break;
            } else {
                b10.append(this.f21137a.g());
            }
            b10.append(str);
        }
        return c.o(b10);
    }

    public final void i(boolean z10) {
        List<d> list;
        Object obj;
        this.f21137a.h(z10 ? ":containsOwn" : ":contains");
        String D = j.D(this.f21137a.d('(', ')'));
        hh.d.i(D, ":contains(text) query must not be empty");
        if (z10) {
            list = this.f21139c;
            obj = new d.m(D);
        } else {
            list = this.f21139c;
            obj = new d.n(D);
        }
        list.add(obj);
    }

    public final void j() {
        this.f21137a.h(":containsData");
        String D = j.D(this.f21137a.d('(', ')'));
        hh.d.i(D, ":containsData(text) query must not be empty");
        this.f21139c.add(new d.l(D));
    }

    public final void k(boolean z10, boolean z11) {
        Object obj;
        List<d> list;
        String b10 = ih.b.b(this.f21137a.e(")"));
        Matcher matcher = f21135f.matcher(b10);
        Matcher matcher2 = f21136g.matcher(b10);
        int i10 = 2;
        int i11 = 0;
        if ("odd".equals(b10)) {
            i11 = 1;
        } else if (!"even".equals(b10)) {
            if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i11 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
                i10 = parseInt;
            } else if (matcher2.matches()) {
                i10 = 0;
                i11 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            } else {
                throw new i.a("Could not parse nth-index '%s': unexpected format", b10);
            }
        }
        if (z11) {
            if (z10) {
                list = this.f21139c;
                obj = new d.b0(i10, i11);
            } else {
                list = this.f21139c;
                obj = new d.c0(i10, i11);
            }
        } else if (z10) {
            list = this.f21139c;
            obj = new d.a0(i10, i11);
        } else {
            list = this.f21139c;
            obj = new d.z(i10, i11);
        }
        list.add(obj);
    }

    public final void l() {
        List<d> list;
        Object g0Var;
        if (this.f21137a.s("#")) {
            d();
        } else if (this.f21137a.s(".")) {
            c();
        } else if (this.f21137a.z() || this.f21137a.t("*|")) {
            e();
        } else if (this.f21137a.t("[")) {
            b();
        } else if (this.f21137a.s("*")) {
            a();
        } else if (this.f21137a.s(":lt(")) {
            p();
        } else if (this.f21137a.s(":gt(")) {
            o();
        } else if (this.f21137a.s(":eq(")) {
            n();
        } else if (this.f21137a.t(":has(")) {
            m();
        } else if (this.f21137a.t(":contains(")) {
            i(false);
        } else if (this.f21137a.t(":containsOwn(")) {
            i(true);
        } else if (this.f21137a.t(":containsData(")) {
            j();
        } else if (this.f21137a.t(":matches(")) {
            q(false);
        } else if (this.f21137a.t(":matchesOwn(")) {
            q(true);
        } else if (this.f21137a.t(":not(")) {
            r();
        } else if (this.f21137a.s(":nth-child(")) {
            k(false, false);
        } else if (this.f21137a.s(":nth-last-child(")) {
            k(true, false);
        } else if (this.f21137a.s(":nth-of-type(")) {
            k(false, true);
        } else if (this.f21137a.s(":nth-last-of-type(")) {
            k(true, true);
        } else {
            if (this.f21137a.s(":first-child")) {
                list = this.f21139c;
                g0Var = new d.v();
            } else if (this.f21137a.s(":last-child")) {
                list = this.f21139c;
                g0Var = new d.x();
            } else if (this.f21137a.s(":first-of-type")) {
                list = this.f21139c;
                g0Var = new d.w();
            } else if (this.f21137a.s(":last-of-type")) {
                list = this.f21139c;
                g0Var = new d.y();
            } else if (this.f21137a.s(":only-child")) {
                list = this.f21139c;
                g0Var = new d.d0();
            } else if (this.f21137a.s(":only-of-type")) {
                list = this.f21139c;
                g0Var = new d.e0();
            } else if (this.f21137a.s(":empty")) {
                list = this.f21139c;
                g0Var = new d.u();
            } else if (this.f21137a.s(":root")) {
                list = this.f21139c;
                g0Var = new d.f0();
            } else if (this.f21137a.s(":matchText")) {
                list = this.f21139c;
                g0Var = new d.g0();
            } else {
                throw new i.a("Could not parse query '%s': unexpected token at '%s'", this.f21138b, this.f21137a.B());
            }
            list.add(g0Var);
        }
    }

    public final void m() {
        this.f21137a.h(":has");
        String d10 = this.f21137a.d('(', ')');
        hh.d.i(d10, ":has(el) subselect must not be empty");
        this.f21139c.add(new j.a(t(d10)));
    }

    public final void n() {
        this.f21139c.add(new d.q(g()));
    }

    public final void o() {
        this.f21139c.add(new d.s(g()));
    }

    public final void p() {
        this.f21139c.add(new d.t(g()));
    }

    public final void q(boolean z10) {
        List<d> list;
        Object obj;
        this.f21137a.h(z10 ? ":matchesOwn" : ":matches");
        String d10 = this.f21137a.d('(', ')');
        hh.d.i(d10, ":matches(regex) query must not be empty");
        if (z10) {
            list = this.f21139c;
            obj = new d.i0(Pattern.compile(d10));
        } else {
            list = this.f21139c;
            obj = new d.h0(Pattern.compile(d10));
        }
        list.add(obj);
    }

    public final void r() {
        this.f21137a.h(":not");
        String d10 = this.f21137a.d('(', ')');
        hh.d.i(d10, ":not(selector) subselect must not be empty");
        this.f21139c.add(new j.d(t(d10)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mh.d s() {
        /*
            r3 = this;
            kh.j r0 = r3.f21137a
            r0.p()
            kh.j r0 = r3.f21137a
            java.lang.String[] r1 = f21133d
            boolean r0 = r0.v(r1)
            if (r0 == 0) goto L_0x0023
            java.util.List<mh.d> r0 = r3.f21139c
            mh.j$g r1 = new mh.j$g
            r1.<init>()
            r0.add(r1)
        L_0x0019:
            kh.j r0 = r3.f21137a
            char r0 = r0.g()
        L_0x001f:
            r3.f(r0)
            goto L_0x0026
        L_0x0023:
            r3.l()
        L_0x0026:
            kh.j r0 = r3.f21137a
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0044
            kh.j r0 = r3.f21137a
            boolean r0 = r0.p()
            kh.j r1 = r3.f21137a
            java.lang.String[] r2 = f21133d
            boolean r1 = r1.v(r2)
            if (r1 == 0) goto L_0x003f
            goto L_0x0019
        L_0x003f:
            if (r0 == 0) goto L_0x0023
            r0 = 32
            goto L_0x001f
        L_0x0044:
            java.util.List<mh.d> r0 = r3.f21139c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0057
            java.util.List<mh.d> r0 = r3.f21139c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            mh.d r0 = (mh.d) r0
            return r0
        L_0x0057:
            mh.b$a r0 = new mh.b$a
            java.util.List<mh.d> r1 = r3.f21139c
            r0.<init>((java.util.Collection<mh.d>) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.h.s():mh.d");
    }
}

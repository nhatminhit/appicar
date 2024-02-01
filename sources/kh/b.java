package kh;

import hh.d;
import ih.c;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.e;
import jh.f;
import jh.h;
import jh.k;
import jh.m;
import jh.p;
import k.g;
import kh.i;

public class b extends m {
    public static final String[] A = {"html", "table"};
    public static final String[] B = {"optgroup", "option"};
    public static final String[] C = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    public static final String[] D = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", n7.b.f10951s, "button", "caption", n7.b.V, "col", "colgroup", "command", "dd", "details", "dir", n7.b.f10948p, "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", n7.b.f10946n, "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", g.f9834f, "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final int E = 100;
    public static final /* synthetic */ boolean F = false;

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f20234x = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f20235y = {"ol", "ul"};

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f20236z = {"button"};

    /* renamed from: k  reason: collision with root package name */
    public c f20237k;

    /* renamed from: l  reason: collision with root package name */
    public c f20238l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f20239m;

    /* renamed from: n  reason: collision with root package name */
    public h f20240n;

    /* renamed from: o  reason: collision with root package name */
    public k f20241o;

    /* renamed from: p  reason: collision with root package name */
    public h f20242p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<h> f20243q;

    /* renamed from: r  reason: collision with root package name */
    public List<String> f20244r;

    /* renamed from: s  reason: collision with root package name */
    public i.g f20245s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20246t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f20247u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f20248v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f20249w = {null};

    public h A(String str) {
        for (int size = this.f20389e.size() - 1; size >= 0; size--) {
            h hVar = this.f20389e.get(size);
            if (hVar.M1().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    public void A0(boolean z10) {
        this.f20247u = z10;
    }

    public h B() {
        return this.f20240n;
    }

    public void B0(h hVar) {
        this.f20240n = hVar;
    }

    public List<String> C() {
        return this.f20244r;
    }

    public c C0() {
        return this.f20237k;
    }

    public ArrayList<h> D() {
        return this.f20389e;
    }

    public void D0(c cVar) {
        this.f20237k = cVar;
    }

    public boolean E(String str) {
        return H(str, f20236z);
    }

    public boolean F(String str) {
        return H(str, f20235y);
    }

    public boolean G(String str) {
        return H(str, (String[]) null);
    }

    public boolean H(String str, String[] strArr) {
        return K(str, f20234x, strArr);
    }

    public boolean I(String[] strArr) {
        return L(strArr, f20234x, (String[]) null);
    }

    public boolean J(String str) {
        for (int size = this.f20389e.size() - 1; size >= 0; size--) {
            String M1 = this.f20389e.get(size).M1();
            if (M1.equals(str)) {
                return true;
            }
            if (!c.d(M1, B)) {
                return false;
            }
        }
        d.a("Should not be reachable");
        return false;
    }

    public final boolean K(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.f20249w;
        strArr3[0] = str;
        return L(strArr3, strArr, strArr2);
    }

    public final boolean L(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f20389e.size() - 1;
        int i10 = size > 100 ? size - 100 : 0;
        while (size >= i10) {
            String M1 = this.f20389e.get(size).M1();
            if (c.d(M1, strArr)) {
                return true;
            }
            if (c.d(M1, strArr2)) {
                return false;
            }
            if (strArr3 != null && c.d(M1, strArr3)) {
                return false;
            }
            size--;
        }
        return false;
    }

    public boolean M(String str) {
        return K(str, A, (String[]) null);
    }

    public h N(i.h hVar) {
        jh.b bVar = hVar.f20322j;
        if (bVar != null && !bVar.isEmpty() && hVar.f20322j.y(this.f20392h) > 0) {
            c("Duplicate attribute");
        }
        if (hVar.A()) {
            h R = R(hVar);
            this.f20389e.add(R);
            this.f20387c.y(l.Data);
            this.f20387c.m(this.f20245s.m().C(R.j2()));
            return R;
        }
        h hVar2 = new h(h.x(hVar.B(), this.f20392h), (String) null, this.f20392h.b(hVar.f20322j));
        O(hVar2);
        return hVar2;
    }

    public void O(h hVar) {
        V(hVar);
        this.f20389e.add(hVar);
    }

    public void P(i.c cVar) {
        h a10 = a();
        if (a10 == null) {
            a10 = this.f20388d;
        }
        String M1 = a10.M1();
        String q10 = cVar.q();
        a10.v0(cVar.f() ? new jh.c(q10) : (M1.equals("script") || M1.equals("style")) ? new e(q10) : new p(q10));
    }

    public void Q(i.d dVar) {
        V(new jh.d(dVar.s()));
    }

    public h R(i.h hVar) {
        h x10 = h.x(hVar.B(), this.f20392h);
        h hVar2 = new h(x10, (String) null, this.f20392h.b(hVar.f20322j));
        V(hVar2);
        if (hVar.A()) {
            if (!x10.p()) {
                x10.v();
            } else if (!x10.j()) {
                this.f20387c.t("Tag cannot be self closing; not a void tag");
            }
        }
        return hVar2;
    }

    public k S(i.h hVar, boolean z10) {
        k kVar = new k(h.x(hVar.B(), this.f20392h), (String) null, this.f20392h.b(hVar.f20322j));
        z0(kVar);
        V(kVar);
        if (z10) {
            this.f20389e.add(kVar);
        }
        return kVar;
    }

    public void T(m mVar) {
        h hVar;
        h A2 = A("table");
        boolean z10 = false;
        if (A2 == null) {
            hVar = this.f20389e.get(0);
        } else if (A2.U() != null) {
            hVar = A2.U();
            z10 = true;
        } else {
            hVar = l(A2);
        }
        if (z10) {
            d.j(A2);
            A2.s(mVar);
            return;
        }
        hVar.v0(mVar);
    }

    public void U() {
        this.f20243q.add((Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(jh.m r2) {
        /*
            r1 = this;
            java.util.ArrayList<jh.h> r0 = r1.f20389e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            jh.f r0 = r1.f20388d
        L_0x000a:
            r0.v0(r2)
            goto L_0x001d
        L_0x000e:
            boolean r0 = r1.Z()
            if (r0 == 0) goto L_0x0018
            r1.T(r2)
            goto L_0x001d
        L_0x0018:
            jh.h r0 = r1.a()
            goto L_0x000a
        L_0x001d:
            boolean r0 = r2 instanceof jh.h
            if (r0 == 0) goto L_0x0034
            jh.h r2 = (jh.h) r2
            kh.h r0 = r2.i2()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0034
            jh.k r0 = r1.f20241o
            if (r0 == 0) goto L_0x0034
            r0.u2(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.b.V(jh.m):void");
    }

    public void W(h hVar, h hVar2) {
        int lastIndexOf = this.f20389e.lastIndexOf(hVar);
        d.d(lastIndexOf != -1);
        this.f20389e.add(lastIndexOf + 1, hVar2);
    }

    public h X(String str) {
        h hVar = new h(h.x(str, this.f20392h), (String) null);
        O(hVar);
        return hVar;
    }

    public final boolean Y(ArrayList<h> arrayList, h hVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVar) {
                return true;
            }
        }
        return false;
    }

    public boolean Z() {
        return this.f20247u;
    }

    public boolean a0() {
        return this.f20248v;
    }

    public f b() {
        return f.f20292c;
    }

    public boolean b0(h hVar) {
        return Y(this.f20243q, hVar);
    }

    public final boolean c0(h hVar, h hVar2) {
        return hVar.M1().equals(hVar2.M1()) && hVar.p().equals(hVar2.p());
    }

    public void d(Reader reader, String str, g gVar) {
        super.d(reader, str, gVar);
        this.f20237k = c.Initial;
        this.f20238l = null;
        this.f20239m = false;
        this.f20240n = null;
        this.f20241o = null;
        this.f20242p = null;
        this.f20243q = new ArrayList<>();
        this.f20244r = new ArrayList();
        this.f20245s = new i.g();
        this.f20246t = true;
        this.f20247u = false;
        this.f20248v = false;
    }

    public boolean d0(h hVar) {
        return c.d(hVar.M1(), D);
    }

    public h e0() {
        if (this.f20243q.size() <= 0) {
            return null;
        }
        ArrayList<h> arrayList = this.f20243q;
        return arrayList.get(arrayList.size() - 1);
    }

    public List<m> f(String str, h hVar, String str2, g gVar) {
        h hVar2;
        k kVar;
        l lVar;
        this.f20237k = c.Initial;
        d(new StringReader(str), str2, gVar);
        this.f20242p = hVar;
        this.f20248v = true;
        if (hVar != null) {
            if (hVar.T() != null) {
                this.f20388d.N2(hVar.T().M2());
            }
            String M1 = hVar.M1();
            if (c.c(M1, "title", "textarea")) {
                kVar = this.f20387c;
                lVar = l.Rcdata;
            } else if (c.c(M1, "iframe", "noembed", "noframes", "style", "xmp")) {
                kVar = this.f20387c;
                lVar = l.Rawtext;
            } else if (M1.equals("script")) {
                kVar = this.f20387c;
                lVar = l.ScriptData;
            } else {
                if (!M1.equals("noscript")) {
                    boolean equals = M1.equals("plaintext");
                }
                kVar = this.f20387c;
                lVar = l.Data;
            }
            kVar.y(lVar);
            hVar2 = new h(h.x("html", this.f20392h), str2);
            this.f20388d.v0(hVar2);
            this.f20389e.add(hVar2);
            y0();
            mh.c Q1 = hVar.Q1();
            Q1.add(0, hVar);
            Iterator it = Q1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar3 = (h) it.next();
                if (hVar3 instanceof k) {
                    this.f20241o = (k) hVar3;
                    break;
                }
            }
        } else {
            hVar2 = null;
        }
        k();
        return hVar != null ? hVar2.v() : this.f20388d.v();
    }

    public void f0() {
        this.f20238l = this.f20237k;
    }

    public boolean g(i iVar) {
        this.f20391g = iVar;
        return this.f20237k.n(iVar, this);
    }

    public void g0(h hVar) {
        if (!this.f20239m) {
            String a10 = hVar.a("href");
            if (a10.length() != 0) {
                this.f20390f = a10;
                this.f20239m = true;
                this.f20388d.f0(a10);
            }
        }
    }

    public void h0() {
        this.f20244r = new ArrayList();
    }

    public boolean i0(h hVar) {
        return Y(this.f20389e, hVar);
    }

    public /* bridge */ /* synthetic */ boolean j(String str, jh.b bVar) {
        return super.j(str, bVar);
    }

    public c j0() {
        return this.f20238l;
    }

    public h k0() {
        return this.f20389e.remove(this.f20389e.size() - 1);
    }

    public h l(h hVar) {
        for (int size = this.f20389e.size() - 1; size >= 0; size--) {
            if (this.f20389e.get(size) == hVar) {
                return this.f20389e.get(size - 1);
            }
        }
        return null;
    }

    public void l0(String str) {
        int size = this.f20389e.size() - 1;
        while (size >= 0 && !this.f20389e.get(size).M1().equals(str)) {
            this.f20389e.remove(size);
            size--;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<jh.h> r0 = r1.f20243q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            jh.h r0 = r1.u0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.b.m():void");
    }

    public h m0(String str) {
        for (int size = this.f20389e.size() - 1; size >= 0; size--) {
            h hVar = this.f20389e.get(size);
            this.f20389e.remove(size);
            if (hVar.M1().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    public final void n(String... strArr) {
        int size = this.f20389e.size() - 1;
        while (size >= 0) {
            h hVar = this.f20389e.get(size);
            if (!c.c(hVar.M1(), strArr) && !hVar.M1().equals("html")) {
                this.f20389e.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    public void n0(String... strArr) {
        int size = this.f20389e.size() - 1;
        while (size >= 0) {
            this.f20389e.remove(size);
            if (!c.d(this.f20389e.get(size).M1(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    public void o() {
        n("tbody", "tfoot", "thead", "template");
    }

    public boolean o0(i iVar, c cVar) {
        this.f20391g = iVar;
        return cVar.n(iVar, this);
    }

    public void p() {
        n("table");
    }

    public void p0(h hVar) {
        this.f20389e.add(hVar);
    }

    public void q() {
        n("tr", "template");
    }

    public void q0(h hVar) {
        int size = this.f20243q.size() - 1;
        int i10 = 0;
        while (true) {
            if (size >= 0) {
                h hVar2 = this.f20243q.get(size);
                if (hVar2 == null) {
                    break;
                }
                if (c0(hVar, hVar2)) {
                    i10++;
                }
                if (i10 == 3) {
                    this.f20243q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f20243q.add(hVar);
    }

    public void r(c cVar) {
        if (this.f20385a.a().i()) {
            this.f20385a.a().add(new d(this.f20386b.H(), "Unexpected token [%s] when in state [%s]", this.f20391g.o(), cVar));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    public void r0() {
        /*
            r7 = this;
            jh.h r0 = r7.e0()
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.i0(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            java.util.ArrayList<jh.h> r1 = r7.f20243q
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = r1
        L_0x0016:
            r4 = 0
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.util.ArrayList<jh.h> r0 = r7.f20243q
            int r3 = r3 + -1
            java.lang.Object r0 = r0.get(r3)
            jh.h r0 = (jh.h) r0
            if (r0 == 0) goto L_0x002c
            boolean r5 = r7.i0(r0)
            if (r5 == 0) goto L_0x0016
        L_0x002c:
            r2 = r4
        L_0x002d:
            if (r2 != 0) goto L_0x0039
            java.util.ArrayList<jh.h> r0 = r7.f20243q
            int r3 = r3 + 1
            java.lang.Object r0 = r0.get(r3)
            jh.h r0 = (jh.h) r0
        L_0x0039:
            hh.d.j(r0)
            java.lang.String r2 = r0.M1()
            jh.h r2 = r7.X(r2)
            jh.b r5 = r2.p()
            jh.b r6 = r0.p()
            r5.q(r6)
            java.util.ArrayList<jh.h> r5 = r7.f20243q
            r5.set(r3, r2)
            if (r3 != r1) goto L_0x002c
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.b.r0():void");
    }

    public void s(boolean z10) {
        this.f20246t = z10;
    }

    public void s0(h hVar) {
        for (int size = this.f20243q.size() - 1; size >= 0; size--) {
            if (this.f20243q.get(size) == hVar) {
                this.f20243q.remove(size);
                return;
            }
        }
    }

    public boolean t() {
        return this.f20246t;
    }

    public boolean t0(h hVar) {
        for (int size = this.f20389e.size() - 1; size >= 0; size--) {
            if (this.f20389e.get(size) == hVar) {
                this.f20389e.remove(size);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f20391g + ", state=" + this.f20237k + ", currentElement=" + a() + '}';
    }

    public void u() {
        v((String) null);
    }

    public h u0() {
        int size = this.f20243q.size();
        if (size > 0) {
            return this.f20243q.remove(size - 1);
        }
        return null;
    }

    public void v(String str) {
        while (str != null && !a().M1().equals(str) && c.d(a().M1(), C)) {
            k0();
        }
    }

    public void v0(h hVar, h hVar2) {
        w0(this.f20243q, hVar, hVar2);
    }

    public h w(String str) {
        for (int size = this.f20243q.size() - 1; size >= 0; size--) {
            h hVar = this.f20243q.get(size);
            if (hVar == null) {
                return null;
            }
            if (hVar.M1().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    public final void w0(ArrayList<h> arrayList, h hVar, h hVar2) {
        int lastIndexOf = arrayList.lastIndexOf(hVar);
        d.d(lastIndexOf != -1);
        arrayList.set(lastIndexOf, hVar2);
    }

    public String x() {
        return this.f20390f;
    }

    public void x0(h hVar, h hVar2) {
        w0(this.f20389e, hVar, hVar2);
    }

    public f y() {
        return this.f20388d;
    }

    public void y0() {
        c cVar;
        int size = this.f20389e.size() - 1;
        boolean z10 = false;
        while (size >= 0) {
            h hVar = this.f20389e.get(size);
            if (size == 0) {
                hVar = this.f20242p;
                z10 = true;
            }
            String M1 = hVar.M1();
            if ("select".equals(M1)) {
                cVar = c.InSelect;
            } else if ("td".equals(M1) || ("th".equals(M1) && !z10)) {
                cVar = c.InCell;
            } else if ("tr".equals(M1)) {
                cVar = c.InRow;
            } else if ("tbody".equals(M1) || "thead".equals(M1) || "tfoot".equals(M1)) {
                cVar = c.InTableBody;
            } else if ("caption".equals(M1)) {
                cVar = c.InCaption;
            } else if ("colgroup".equals(M1)) {
                cVar = c.InColumnGroup;
            } else if ("table".equals(M1)) {
                cVar = c.InTable;
            } else {
                if (!n7.b.f10946n.equals(M1) && !"body".equals(M1)) {
                    if ("frameset".equals(M1)) {
                        cVar = c.InFrameset;
                    } else if ("html".equals(M1)) {
                        cVar = c.BeforeHead;
                    } else if (!z10) {
                        size--;
                    }
                }
                cVar = c.InBody;
            }
            D0(cVar);
            return;
        }
    }

    public k z() {
        return this.f20241o;
    }

    public void z0(k kVar) {
        this.f20241o = kVar;
    }
}

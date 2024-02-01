package kh;

import dg.a;
import hh.d;
import ih.c;
import java.util.Arrays;
import kh.i;
import p7.f;
import w4.l;

public final class k {

    /* renamed from: r  reason: collision with root package name */
    public static final char f20326r = '�';

    /* renamed from: s  reason: collision with root package name */
    public static final char[] f20327s;

    /* renamed from: t  reason: collision with root package name */
    public static final int f20328t = 128;

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f20329u = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, a.nq, 8249, a.pp, 141, a.Dt, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, a.Dq, 8250, a.qp, 157, a.Et, a.Ts};

    /* renamed from: a  reason: collision with root package name */
    public final a f20330a;

    /* renamed from: b  reason: collision with root package name */
    public final e f20331b;

    /* renamed from: c  reason: collision with root package name */
    public l f20332c = l.Data;

    /* renamed from: d  reason: collision with root package name */
    public i f20333d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20334e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f20335f = null;

    /* renamed from: g  reason: collision with root package name */
    public StringBuilder f20336g = new StringBuilder(1024);

    /* renamed from: h  reason: collision with root package name */
    public StringBuilder f20337h = new StringBuilder(1024);

    /* renamed from: i  reason: collision with root package name */
    public i.C0348i f20338i;

    /* renamed from: j  reason: collision with root package name */
    public i.h f20339j = new i.h();

    /* renamed from: k  reason: collision with root package name */
    public i.g f20340k = new i.g();

    /* renamed from: l  reason: collision with root package name */
    public i.c f20341l = new i.c();

    /* renamed from: m  reason: collision with root package name */
    public i.e f20342m = new i.e();

    /* renamed from: n  reason: collision with root package name */
    public i.d f20343n = new i.d();

    /* renamed from: o  reason: collision with root package name */
    public String f20344o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f20345p = new int[1];

    /* renamed from: q  reason: collision with root package name */
    public final int[] f20346q = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, f.f11698i, '<', '&'};
        f20327s = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, e eVar) {
        this.f20330a = aVar;
        this.f20331b = eVar;
    }

    public void a(l lVar) {
        this.f20330a.a();
        this.f20332c = lVar;
    }

    public String b() {
        return this.f20344o;
    }

    public final void c(String str) {
        if (this.f20331b.i()) {
            this.f20331b.add(new d(this.f20330a.H(), "Invalid character reference: %s", str));
        }
    }

    public int[] d(Character ch2, boolean z10) {
        int i10;
        if (this.f20330a.t()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.f20330a.s()) || this.f20330a.B(f20327s)) {
            return null;
        }
        int[] iArr = this.f20345p;
        this.f20330a.v();
        if (this.f20330a.w("#")) {
            boolean x10 = this.f20330a.x("X");
            a aVar = this.f20330a;
            String h10 = x10 ? aVar.h() : aVar.g();
            if (h10.length() == 0) {
                c("numeric reference with no numerals");
            } else {
                this.f20330a.M();
                if (!this.f20330a.w(";")) {
                    c("missing semicolon");
                }
                try {
                    i10 = Integer.valueOf(h10, x10 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i10 = -1;
                }
                if (i10 == -1 || ((i10 >= 55296 && i10 <= 57343) || i10 > 1114111)) {
                    c("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (i10 >= 128) {
                    int[] iArr2 = f20329u;
                    if (i10 < iArr2.length + 128) {
                        c("character is not a valid unicode code point");
                        i10 = iArr2[i10 + l.Q];
                    }
                }
                iArr[0] = i10;
                return iArr;
            }
        } else {
            String j10 = this.f20330a.j();
            boolean y10 = this.f20330a.y(f.f11697h);
            if (!(jh.i.i(j10) || (jh.i.j(j10) && y10))) {
                this.f20330a.K();
                if (y10) {
                    c("invalid named reference");
                }
                return null;
            } else if (!z10 || (!this.f20330a.E() && !this.f20330a.C() && !this.f20330a.A('=', '-', '_'))) {
                this.f20330a.M();
                if (!this.f20330a.w(";")) {
                    c("missing semicolon");
                }
                int d10 = jh.i.d(j10, this.f20346q);
                if (d10 == 1) {
                    iArr[0] = this.f20346q[0];
                    return iArr;
                } else if (d10 == 2) {
                    return this.f20346q;
                } else {
                    d.a("Unexpected characters returned for " + j10);
                    return this.f20346q;
                }
            }
        }
        this.f20330a.K();
        return null;
    }

    public void e() {
        this.f20343n.m();
        this.f20343n.f20308d = true;
    }

    public void f() {
        this.f20343n.m();
    }

    public void g() {
        this.f20342m.m();
    }

    public i.C0348i h(boolean z10) {
        i.C0348i F = z10 ? this.f20339j.m() : this.f20340k.m();
        this.f20338i = F;
        return F;
    }

    public void i() {
        i.n(this.f20337h);
    }

    public boolean j() {
        return true;
    }

    public void k(char c10) {
        l(String.valueOf(c10));
    }

    public void l(String str) {
        if (this.f20335f == null) {
            this.f20335f = str;
            return;
        }
        if (this.f20336g.length() == 0) {
            this.f20336g.append(this.f20335f);
        }
        this.f20336g.append(str);
    }

    public void m(i iVar) {
        d.b(this.f20334e);
        this.f20333d = iVar;
        this.f20334e = true;
        i.j jVar = iVar.f20304a;
        if (jVar == i.j.StartTag) {
            this.f20344o = ((i.h) iVar).f20314b;
        } else if (jVar == i.j.EndTag && ((i.g) iVar).f20322j != null) {
            t("Attributes incorrectly present on end tag");
        }
    }

    public void n(char[] cArr) {
        l(String.valueOf(cArr));
    }

    public void o(int[] iArr) {
        l(new String(iArr, 0, iArr.length));
    }

    public void p() {
        m(this.f20343n);
    }

    public void q() {
        m(this.f20342m);
    }

    public void r() {
        this.f20338i.y();
        m(this.f20338i);
    }

    public void s(l lVar) {
        if (this.f20331b.i()) {
            this.f20331b.add(new d(this.f20330a.H(), "Unexpectedly reached end of file (EOF) in input state [%s]", lVar));
        }
    }

    public void t(String str) {
        if (this.f20331b.i()) {
            this.f20331b.add(new d(this.f20330a.H(), str));
        }
    }

    public void u(l lVar) {
        if (this.f20331b.i()) {
            this.f20331b.add(new d(this.f20330a.H(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f20330a.s()), lVar));
        }
    }

    public l v() {
        return this.f20332c;
    }

    public boolean w() {
        return this.f20344o != null && this.f20338i.B().equalsIgnoreCase(this.f20344o);
    }

    public i x() {
        while (!this.f20334e) {
            this.f20332c.m(this, this.f20330a);
        }
        StringBuilder sb2 = this.f20336g;
        if (sb2.length() != 0) {
            String sb3 = sb2.toString();
            sb2.delete(0, sb2.length());
            this.f20335f = null;
            return this.f20341l.p(sb3);
        }
        String str = this.f20335f;
        if (str != null) {
            i.c p10 = this.f20341l.p(str);
            this.f20335f = null;
            return p10;
        }
        this.f20334e = false;
        return this.f20333d;
    }

    public void y(l lVar) {
        this.f20332c = lVar;
    }

    public String z(boolean z10) {
        StringBuilder b10 = c.b();
        while (!this.f20330a.t()) {
            b10.append(this.f20330a.m('&'));
            if (this.f20330a.y('&')) {
                this.f20330a.e();
                int[] d10 = d((Character) null, z10);
                if (d10 == null || d10.length == 0) {
                    b10.append('&');
                } else {
                    b10.appendCodePoint(d10[0]);
                    if (d10.length == 2) {
                        b10.appendCodePoint(d10[1]);
                    }
                }
            }
        }
        return c.o(b10);
    }
}

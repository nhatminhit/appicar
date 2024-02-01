package jh;

import gh.c;
import jh.f;
import kh.g;

public class d extends l {
    public d(String str) {
        this.R = str;
    }

    public /* bridge */ /* synthetic */ m C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ boolean G(String str) {
        return super.G(str);
    }

    public String N() {
        return "#comment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        L(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (((jh.h) r0).i2().d() != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5.r() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R(java.lang.Appendable r3, int r4, jh.f.a r5) throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r5.u()
            if (r0 == 0) goto L_0x0027
            int r0 = r2.j0()
            if (r0 != 0) goto L_0x001e
            jh.m r0 = r2.O
            boolean r1 = r0 instanceof jh.h
            if (r1 == 0) goto L_0x001e
            jh.h r0 = (jh.h) r0
            kh.h r0 = r0.i2()
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0024
        L_0x001e:
            boolean r0 = r5.r()
            if (r0 == 0) goto L_0x0027
        L_0x0024:
            r2.L(r3, r4, r5)
        L_0x0027:
            java.lang.String r4 = "<!--"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.u0()
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = "-->"
            r3.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.d.R(java.lang.Appendable, int, jh.f$a):void");
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

    public q s0() {
        String u02 = u0();
        f l10 = c.l("<" + u02.substring(1, u02.length() - 1) + ">", q(), g.r());
        if (l10.H0().size() <= 0) {
            return null;
        }
        h F0 = l10.F0(0);
        q qVar = new q(n.b(l10).o().c(F0.j2()), u02.startsWith("!"));
        qVar.p().q(F0.p());
        return qVar;
    }

    /* renamed from: t0 */
    public d z() {
        return (d) super.clone();
    }

    public String toString() {
        return P();
    }

    public /* bridge */ /* synthetic */ int u() {
        return super.u();
    }

    public String u0() {
        return o0();
    }

    public boolean v0() {
        String u02 = u0();
        return u02.length() > 1 && (u02.startsWith("!") || u02.startsWith("?"));
    }

    public d w0(String str) {
        p0(str);
        return this;
    }
}

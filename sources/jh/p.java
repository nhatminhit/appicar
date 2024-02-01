package jh;

import hh.d;
import ih.c;
import jh.f;

public class p extends l {
    public p(String str) {
        this.R = str;
    }

    public static p t0(String str) {
        return new p(i.l(str));
    }

    public static boolean w0(StringBuilder sb2) {
        return sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ';
    }

    public static String x0(String str) {
        return c.m(str);
    }

    public static String z0(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    public String A0() {
        return c.m(u0());
    }

    public p B0(String str) {
        p0(str);
        return this;
    }

    public /* bridge */ /* synthetic */ m C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ boolean G(String str) {
        return super.G(str);
    }

    public String N() {
        return "#text";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (v0() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        L(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (v0() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void R(java.lang.Appendable r10, int r11, jh.f.a r12) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r12.u()
            if (r0 == 0) goto L_0x003d
            int r1 = r9.j0()
            if (r1 != 0) goto L_0x0024
            jh.m r1 = r9.O
            boolean r2 = r1 instanceof jh.h
            if (r2 == 0) goto L_0x0024
            jh.h r1 = (jh.h) r1
            kh.h r1 = r1.i2()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0024
            boolean r1 = r9.v0()
            if (r1 == 0) goto L_0x003a
        L_0x0024:
            boolean r1 = r12.r()
            if (r1 == 0) goto L_0x003d
            java.util.List r1 = r9.k0()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x003d
            boolean r1 = r9.v0()
            if (r1 != 0) goto L_0x003d
        L_0x003a:
            r9.L(r10, r11, r12)
        L_0x003d:
            r11 = 1
            r1 = 0
            if (r0 == 0) goto L_0x004b
            jh.m r2 = r9.O
            boolean r2 = jh.h.V1(r2)
            if (r2 != 0) goto L_0x004b
            r7 = r11
            goto L_0x004c
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r0 == 0) goto L_0x0056
            jh.m r0 = r9.O
            boolean r0 = r0 instanceof jh.f
            if (r0 == 0) goto L_0x0056
            r8 = r11
            goto L_0x0057
        L_0x0056:
            r8 = r1
        L_0x0057:
            java.lang.String r4 = r9.o0()
            r6 = 0
            r3 = r10
            r5 = r12
            jh.i.g(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.p.R(java.lang.Appendable, int, jh.f$a):void");
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
    public p z() {
        return (p) super.clone();
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
        return c.f(o0());
    }

    public p y0(int i10) {
        String o02 = o0();
        d.e(i10 >= 0, "Split offset must be not be negative");
        d.e(i10 < o02.length(), "Split offset must not be greater than current text length");
        String substring = o02.substring(0, i10);
        String substring2 = o02.substring(i10);
        B0(substring);
        p pVar = new p(substring2);
        if (U() != null) {
            U().d(j0() + 1, pVar);
        }
        return pVar;
    }
}

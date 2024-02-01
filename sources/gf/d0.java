package gf;

import bh.c;
import fh.g;
import fh.h;
import gf.w;
import gf.z;
import java.util.NoSuchElementException;
import oe.f;
import xe.l0;
import zd.a2;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.p2;
import zd.r;
import zd.t;
import zd.y2;

public class d0 {
    @h1(version = "1.7")
    public static final int A(@g w wVar) {
        l0.p(wVar, "<this>");
        if (!wVar.isEmpty()) {
            return wVar.l();
        }
        throw new NoSuchElementException("Progression " + wVar + " is empty.");
    }

    @h1(version = "1.7")
    public static final long B(@g z zVar) {
        l0.p(zVar, "<this>");
        if (!zVar.isEmpty()) {
            return zVar.l();
        }
        throw new NoSuchElementException("Progression " + zVar + " is empty.");
    }

    @h1(version = "1.7")
    @h
    public static final e2 C(@g w wVar) {
        l0.p(wVar, "<this>");
        if (wVar.isEmpty()) {
            return null;
        }
        return e2.b(wVar.l());
    }

    @h1(version = "1.7")
    @h
    public static final j2 D(@g z zVar) {
        l0.p(zVar, "<this>");
        if (zVar.isEmpty()) {
            return null;
        }
        return j2.b(zVar.l());
    }

    @h1(version = "1.7")
    public static final int E(@g w wVar) {
        l0.p(wVar, "<this>");
        if (!wVar.isEmpty()) {
            return wVar.m();
        }
        throw new NoSuchElementException("Progression " + wVar + " is empty.");
    }

    @h1(version = "1.7")
    public static final long F(@g z zVar) {
        l0.p(zVar, "<this>");
        if (!zVar.isEmpty()) {
            return zVar.m();
        }
        throw new NoSuchElementException("Progression " + zVar + " is empty.");
    }

    @h1(version = "1.7")
    @h
    public static final e2 G(@g w wVar) {
        l0.p(wVar, "<this>");
        if (wVar.isEmpty()) {
            return null;
        }
        return e2.b(wVar.m());
    }

    @h1(version = "1.7")
    @h
    public static final j2 H(@g z zVar) {
        l0.p(zVar, "<this>");
        if (zVar.isEmpty()) {
            return null;
        }
        return j2.b(zVar.m());
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final int I(y yVar) {
        l0.p(yVar, "<this>");
        return J(yVar, ef.f.O);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int J(@g y yVar, @g ef.f fVar) {
        l0.p(yVar, "<this>");
        l0.p(fVar, "random");
        try {
            return ef.h.h(fVar, yVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final long K(b0 b0Var) {
        l0.p(b0Var, "<this>");
        return L(b0Var, ef.f.O);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long L(@g b0 b0Var, @g ef.f fVar) {
        l0.p(b0Var, "<this>");
        l0.p(fVar, "random");
        try {
            return ef.h.l(fVar, b0Var);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final e2 M(y yVar) {
        l0.p(yVar, "<this>");
        return N(yVar, ef.f.O);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class, t.class})
    @h
    public static final e2 N(@g y yVar, @g ef.f fVar) {
        l0.p(yVar, "<this>");
        l0.p(fVar, "random");
        if (yVar.isEmpty()) {
            return null;
        }
        return e2.b(ef.h.h(fVar, yVar));
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class, t.class})
    @f
    public static final j2 O(b0 b0Var) {
        l0.p(b0Var, "<this>");
        return P(b0Var, ef.f.O);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class, t.class})
    @h
    public static final j2 P(@g b0 b0Var, @g ef.f fVar) {
        l0.p(b0Var, "<this>");
        l0.p(fVar, "random");
        if (b0Var.isEmpty()) {
            return null;
        }
        return j2.b(ef.h.l(fVar, b0Var));
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final w Q(@g w wVar) {
        l0.p(wVar, "<this>");
        return w.R.a(wVar.m(), wVar.l(), -wVar.n());
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final z R(@g z zVar) {
        l0.p(zVar, "<this>");
        return z.R.a(zVar.m(), zVar.l(), -zVar.n());
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final w S(@g w wVar, int i10) {
        l0.p(wVar, "<this>");
        u.a(i10 > 0, Integer.valueOf(i10));
        w.a aVar = w.R;
        int l10 = wVar.l();
        int m10 = wVar.m();
        if (wVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar.a(l10, m10, i10);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final z T(@g z zVar, long j10) {
        l0.p(zVar, "<this>");
        u.a(j10 > 0, Long.valueOf(j10));
        z.a aVar = z.R;
        long l10 = zVar.l();
        long m10 = zVar.m();
        if (zVar.n() <= 0) {
            j10 = -j10;
        }
        return aVar.a(l10, m10, j10);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final y U(short s10, short s11) {
        short s12 = s11 & p2.R;
        return l0.t(s12, 0) <= 0 ? y.S.a() : new y(e2.l(s10 & p2.R), e2.l(e2.l(s12) - 1), (xe.w) null);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final y V(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0 ? y.S.a() : new y(i10, e2.l(i11 - 1), (xe.w) null);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final y W(byte b10, byte b11) {
        byte b12 = b11 & 255;
        return l0.t(b12, 0) <= 0 ? y.S.a() : new y(e2.l(b10 & 255), e2.l(e2.l(b12) - 1), (xe.w) null);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final b0 X(long j10, long j11) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return b0.S.a();
        }
        return new b0(j10, j2.l(j11 - j2.l(((long) 1) & 4294967295L)), (xe.w) null);
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short a(short s10, short s11) {
        return l0.t(s10 & p2.R, 65535 & s11) < 0 ? s11 : s10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte c(byte b10, byte b11) {
        return l0.t(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long d(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short e(short s10, short s11) {
        return l0.t(s10 & p2.R, 65535 & s11) > 0 ? s11 : s10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int f(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0 ? i11 : i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte g(byte b10, byte b11) {
        return l0.t(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long h(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0 ? j11 : j10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [gf.h<zd.j2>, gf.h, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {zd.t.class})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long i(long r2, @fh.g gf.h<zd.j2> r4) {
        /*
            java.lang.String r0 = "range"
            xe.l0.p(r4, r0)
            boolean r0 = r4 instanceof gf.g
            if (r0 == 0) goto L_0x001a
            zd.j2 r2 = zd.j2.b(r2)
            gf.g r4 = (gf.g) r4
            java.lang.Comparable r2 = gf.v.M(r2, r4)
            zd.j2 r2 = (zd.j2) r2
            long r2 = r2.l0()
            return r2
        L_0x001a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.lang.Comparable r0 = r4.c()
            zd.j2 r0 = (zd.j2) r0
            long r0 = r0.l0()
            int r0 = java.lang.Long.compare(r2 ^ Long.MIN_VALUE, r0 ^ Long.MIN_VALUE)
            if (r0 >= 0) goto L_0x003b
            java.lang.Comparable r2 = r4.c()
        L_0x0034:
            zd.j2 r2 = (zd.j2) r2
            long r2 = r2.l0()
            goto L_0x0050
        L_0x003b:
            java.lang.Comparable r0 = r4.h()
            zd.j2 r0 = (zd.j2) r0
            long r0 = r0.l0()
            int r0 = java.lang.Long.compare(r2 ^ Long.MIN_VALUE, r0 ^ Long.MIN_VALUE)
            if (r0 <= 0) goto L_0x0050
            java.lang.Comparable r2 = r4.h()
            goto L_0x0034
        L_0x0050:
            return r2
        L_0x0051:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r3.append(r0)
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d0.i(long, gf.h):long");
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final short j(short s10, short s11, short s12) {
        short s13 = s11 & p2.R;
        short s14 = s12 & p2.R;
        if (l0.t(s13, s14) <= 0) {
            short s15 = 65535 & s10;
            return l0.t(s15, s13) < 0 ? s11 : l0.t(s15, s14) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + p2.e0(s12) + " is less than minimum " + p2.e0(s11) + '.');
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final int k(int i10, int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) <= 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + e2.g0(i12) + " is less than minimum " + e2.g0(i11) + '.');
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final byte l(byte b10, byte b11, byte b12) {
        byte b13 = b11 & 255;
        byte b14 = b12 & 255;
        if (l0.t(b13, b14) <= 0) {
            byte b15 = b10 & 255;
            return l0.t(b15, b13) < 0 ? b11 : l0.t(b15, b14) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + a2.e0(b12) + " is less than minimum " + a2.e0(b11) + '.');
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final long m(long j10, long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : Long.compare(j10 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j2.g0(j12) + " is less than minimum " + j2.g0(j11) + '.');
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [gf.h, java.lang.Object, gf.h<zd.e2>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {zd.t.class})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int n(int r2, @fh.g gf.h<zd.e2> r3) {
        /*
            java.lang.String r0 = "range"
            xe.l0.p(r3, r0)
            boolean r0 = r3 instanceof gf.g
            if (r0 == 0) goto L_0x001a
            zd.e2 r2 = zd.e2.b(r2)
            gf.g r3 = (gf.g) r3
            java.lang.Comparable r2 = gf.v.M(r2, r3)
            zd.e2 r2 = (zd.e2) r2
            int r2 = r2.l0()
            return r2
        L_0x001a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0051
            java.lang.Comparable r0 = r3.c()
            zd.e2 r0 = (zd.e2) r0
            int r0 = r0.l0()
            int r0 = java.lang.Integer.compare(r2 ^ Integer.MIN_VALUE, r0 ^ Integer.MIN_VALUE)
            if (r0 >= 0) goto L_0x003b
            java.lang.Comparable r2 = r3.c()
        L_0x0034:
            zd.e2 r2 = (zd.e2) r2
            int r2 = r2.l0()
            goto L_0x0050
        L_0x003b:
            java.lang.Comparable r0 = r3.h()
            zd.e2 r0 = (zd.e2) r0
            int r0 = r0.l0()
            int r0 = java.lang.Integer.compare(r2 ^ Integer.MIN_VALUE, r0 ^ Integer.MIN_VALUE)
            if (r0 <= 0) goto L_0x0050
            java.lang.Comparable r2 = r3.h()
            goto L_0x0034
        L_0x0050:
            return r2
        L_0x0051:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.append(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d0.n(int, gf.h):int");
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean o(@g y yVar, byte b10) {
        l0.p(yVar, "$this$contains");
        return yVar.p(e2.l(b10 & 255));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final boolean p(b0 b0Var, j2 j2Var) {
        l0.p(b0Var, "$this$contains");
        return j2Var != null && b0Var.p(j2Var.l0());
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean q(@g b0 b0Var, int i10) {
        l0.p(b0Var, "$this$contains");
        return b0Var.p(j2.l(((long) i10) & 4294967295L));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean r(@g b0 b0Var, byte b10) {
        l0.p(b0Var, "$this$contains");
        return b0Var.p(j2.l(((long) b10) & 255));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean s(@g y yVar, short s10) {
        l0.p(yVar, "$this$contains");
        return yVar.p(e2.l(s10 & p2.R));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @f
    public static final boolean t(y yVar, e2 e2Var) {
        l0.p(yVar, "$this$contains");
        return e2Var != null && yVar.p(e2Var.l0());
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean u(@g y yVar, long j10) {
        l0.p(yVar, "$this$contains");
        return j2.l(j10 >>> 32) == 0 && yVar.p(e2.l((int) j10));
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final boolean v(@g b0 b0Var, short s10) {
        l0.p(b0Var, "$this$contains");
        return b0Var.p(j2.l(((long) s10) & c.f16306s));
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final w w(short s10, short s11) {
        return w.R.a(e2.l(s10 & p2.R), e2.l(s11 & p2.R), -1);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final w x(int i10, int i11) {
        return w.R.a(i10, i11, -1);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final w y(byte b10, byte b11) {
        return w.R.a(e2.l(b10 & 255), e2.l(b11 & 255), -1);
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    public static final z z(long j10, long j11) {
        return z.R.a(j10, j11, -1);
    }
}

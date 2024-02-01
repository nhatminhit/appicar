package gf;

import fh.g;
import fh.h;
import gf.a;
import gf.k;
import gf.n;
import java.util.NoSuchElementException;
import oe.f;
import w4.l;
import xe.l0;
import y4.c;
import zd.h1;
import zd.r;
import zd.y2;

public class v extends u {
    public static final float A(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @h1(version = "1.7")
    @h
    public static final Integer A0(@g k kVar) {
        l0.p(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.l());
    }

    @g
    public static final a A1(@g a aVar, int i10) {
        l0.p(aVar, "<this>");
        u.a(i10 > 0, Integer.valueOf(i10));
        a.C0313a aVar2 = a.R;
        char l10 = aVar.l();
        char m10 = aVar.m();
        if (aVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar2.a(l10, m10, i10);
    }

    public static final int B(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @h1(version = "1.7")
    @h
    public static final Long B0(@g n nVar) {
        l0.p(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.l());
    }

    @g
    public static final k B1(@g k kVar, int i10) {
        l0.p(kVar, "<this>");
        u.a(i10 > 0, Integer.valueOf(i10));
        k.a aVar = k.R;
        int l10 = kVar.l();
        int m10 = kVar.m();
        if (kVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar.a(l10, m10, i10);
    }

    public static final long C(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @g
    public static final n C1(@g n nVar, long j10) {
        l0.p(nVar, "<this>");
        u.a(j10 > 0, Long.valueOf(j10));
        n.a aVar = n.R;
        long l10 = nVar.l();
        long m10 = nVar.m();
        if (nVar.n() <= 0) {
            j10 = -j10;
        }
        return aVar.a(l10, m10, j10);
    }

    @g
    public static final <T extends Comparable<? super T>> T D(@g T t10, @g T t11) {
        l0.p(t10, "<this>");
        l0.p(t11, "maximumValue");
        return t10.compareTo(t11) > 0 ? t11 : t10;
    }

    @ve.h(name = "floatRangeContains")
    public static final boolean D0(@g h<Float> hVar, double d10) {
        l0.p(hVar, "<this>");
        return hVar.b(Float.valueOf((float) d10));
    }

    @h
    public static final Byte D1(double d10) {
        boolean z10 = false;
        if (-128.0d <= d10 && d10 <= 127.0d) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) ((int) d10));
        }
        return null;
    }

    public static final short E(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    @h
    public static final Byte E1(float f10) {
        boolean z10 = false;
        if (-128.0f <= f10 && f10 <= 127.0f) {
            z10 = true;
        }
        if (z10) {
            return Byte.valueOf((byte) ((int) f10));
        }
        return null;
    }

    public static final byte F(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            return b10 < b11 ? b11 : b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + b12 + " is less than minimum " + b11 + '.');
    }

    @h
    public static final Byte F1(int i10) {
        if (new m(l.Q, 127).q(i10)) {
            return Byte.valueOf((byte) i10);
        }
        return null;
    }

    public static final double G(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    @h
    public static final Byte G1(long j10) {
        if (new p(-128, 127).q(j10)) {
            return Byte.valueOf((byte) ((int) j10));
        }
        return null;
    }

    public static final float H(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    @ve.h(name = "intRangeContains")
    public static final boolean H0(@g h<Integer> hVar, byte b10) {
        l0.p(hVar, "<this>");
        return hVar.b(Integer.valueOf(b10));
    }

    @h
    public static final Byte H1(short s10) {
        if (L0(new m(l.Q, 127), s10)) {
            return Byte.valueOf((byte) s10);
        }
        return null;
    }

    public static final int I(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "intRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean I0(h hVar, double d10) {
        l0.p(hVar, "<this>");
        Integer I1 = I1(d10);
        if (I1 != null) {
            return hVar.b(I1);
        }
        return false;
    }

    @h
    public static final Integer I1(double d10) {
        boolean z10 = false;
        if (-2.147483648E9d <= d10 && d10 <= 2.147483647E9d) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) d10);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [gf.h<java.lang.Integer>, gf.h, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int J(int r2, @fh.g gf.h<java.lang.Integer> r3) {
        /*
            java.lang.String r0 = "range"
            xe.l0.p(r3, r0)
            boolean r0 = r3 instanceof gf.g
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            gf.g r3 = (gf.g) r3
            java.lang.Comparable r2 = M(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L_0x001a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0049
            java.lang.Comparable r0 = r3.c()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 >= r0) goto L_0x0037
            java.lang.Comparable r2 = r3.c()
        L_0x0030:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L_0x0048
        L_0x0037:
            java.lang.Comparable r0 = r3.h()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 <= r0) goto L_0x0048
            java.lang.Comparable r2 = r3.h()
            goto L_0x0030
        L_0x0048:
            return r2
        L_0x0049:
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
        throw new UnsupportedOperationException("Method not decompiled: gf.v.J(int, gf.h):int");
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "intRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean J0(h hVar, float f10) {
        l0.p(hVar, "<this>");
        Integer J1 = J1(f10);
        if (J1 != null) {
            return hVar.b(J1);
        }
        return false;
    }

    @h
    public static final Integer J1(float f10) {
        boolean z10 = false;
        if (-2.14748365E9f <= f10 && f10 <= 2.14748365E9f) {
            z10 = true;
        }
        if (z10) {
            return Integer.valueOf((int) f10);
        }
        return null;
    }

    public static final long K(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    @ve.h(name = "intRangeContains")
    public static final boolean K0(@g h<Integer> hVar, long j10) {
        l0.p(hVar, "<this>");
        Integer K1 = K1(j10);
        if (K1 != null) {
            return hVar.b(K1);
        }
        return false;
    }

    @h
    public static final Integer K1(long j10) {
        if (new p(c.L0, c.M0).q(j10)) {
            return Integer.valueOf((int) j10);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [gf.h<java.lang.Long>, gf.h, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long L(long r2, @fh.g gf.h<java.lang.Long> r4) {
        /*
            java.lang.String r0 = "range"
            xe.l0.p(r4, r0)
            boolean r0 = r4 instanceof gf.g
            if (r0 == 0) goto L_0x001a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            gf.g r4 = (gf.g) r4
            java.lang.Comparable r2 = M(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            return r2
        L_0x001a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x004d
            java.lang.Comparable r0 = r4.c()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            java.lang.Comparable r2 = r4.c()
        L_0x0032:
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            goto L_0x004c
        L_0x0039:
            java.lang.Comparable r0 = r4.h()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            java.lang.Comparable r2 = r4.h()
            goto L_0x0032
        L_0x004c:
            return r2
        L_0x004d:
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
        throw new UnsupportedOperationException("Method not decompiled: gf.v.L(long, gf.h):long");
    }

    @ve.h(name = "intRangeContains")
    public static final boolean L0(@g h<Integer> hVar, short s10) {
        l0.p(hVar, "<this>");
        return hVar.b(Integer.valueOf(s10));
    }

    @h
    public static final Long L1(double d10) {
        boolean z10 = false;
        if (-9.223372036854776E18d <= d10 && d10 <= 9.223372036854776E18d) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf((long) d10);
        }
        return null;
    }

    @g
    @h1(version = "1.1")
    public static final <T extends Comparable<? super T>> T M(@g T t10, @g g<T> gVar) {
        l0.p(t10, "<this>");
        l0.p(gVar, "range");
        if (!gVar.isEmpty()) {
            return (!gVar.e(t10, gVar.c()) || gVar.e(gVar.c(), t10)) ? (!gVar.e(gVar.h(), t10) || gVar.e(t10, gVar.h())) ? t10 : gVar.h() : gVar.c();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    @h1(version = "1.7")
    @ve.h(name = "intRangeContains")
    @r
    public static final boolean M0(@g s<Integer> sVar, byte b10) {
        l0.p(sVar, "<this>");
        return sVar.b(Integer.valueOf(b10));
    }

    @h
    public static final Long M1(float f10) {
        boolean z10 = false;
        if (-9.223372E18f <= f10 && f10 <= 9.223372E18f) {
            z10 = true;
        }
        if (z10) {
            return Long.valueOf((long) f10);
        }
        return null;
    }

    @g
    public static final <T extends Comparable<? super T>> T N(@g T t10, @g h<T> hVar) {
        l0.p(t10, "<this>");
        l0.p(hVar, "range");
        if (hVar instanceof g) {
            return M(t10, (g) hVar);
        }
        if (!hVar.isEmpty()) {
            return t10.compareTo(hVar.c()) < 0 ? hVar.c() : t10.compareTo(hVar.h()) > 0 ? hVar.h() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + hVar + '.');
    }

    @h1(version = "1.7")
    @ve.h(name = "intRangeContains")
    @r
    public static final boolean N0(@g s<Integer> sVar, long j10) {
        l0.p(sVar, "<this>");
        Integer K1 = K1(j10);
        if (K1 != null) {
            return sVar.b(K1);
        }
        return false;
    }

    @h
    public static final Short N1(double d10) {
        boolean z10 = false;
        if (-32768.0d <= d10 && d10 <= 32767.0d) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) ((int) d10));
        }
        return null;
    }

    @g
    public static final <T extends Comparable<? super T>> T O(@g T t10, @h T t11, @h T t12) {
        l0.p(t10, "<this>");
        if (t11 == null || t12 == null) {
            return (t11 == null || t10.compareTo(t11) >= 0) ? (t12 == null || t10.compareTo(t12) <= 0) ? t10 : t12 : t11;
        }
        if (t11.compareTo(t12) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
        } else if (t10.compareTo(t11) < 0) {
            return t11;
        } else {
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
    }

    @h1(version = "1.7")
    @ve.h(name = "intRangeContains")
    @r
    public static final boolean O0(@g s<Integer> sVar, short s10) {
        l0.p(sVar, "<this>");
        return sVar.b(Integer.valueOf(s10));
    }

    @h
    public static final Short O1(float f10) {
        boolean z10 = false;
        if (-32768.0f <= f10 && f10 <= 32767.0f) {
            z10 = true;
        }
        if (z10) {
            return Short.valueOf((short) ((int) f10));
        }
        return null;
    }

    public static final short P(short s10, short s11, short s12) {
        if (s11 <= s12) {
            return s10 < s11 ? s11 : s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + s12 + " is less than minimum " + s11 + '.');
    }

    @h1(version = "1.7")
    public static final char P0(@g a aVar) {
        l0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.m();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @h
    public static final Short P1(int i10) {
        if (new m(l.S, l.T).q(i10)) {
            return Short.valueOf((short) i10);
        }
        return null;
    }

    @h1(version = "1.3")
    @f
    public static final boolean Q(c cVar, Character ch2) {
        l0.p(cVar, "<this>");
        return ch2 != null && cVar.q(ch2.charValue());
    }

    @h1(version = "1.7")
    public static final int Q0(@g k kVar) {
        l0.p(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.m();
        }
        throw new NoSuchElementException("Progression " + kVar + " is empty.");
    }

    @h
    public static final Short Q1(long j10) {
        if (new p(-32768, 32767).q(j10)) {
            return Short.valueOf((short) ((int) j10));
        }
        return null;
    }

    @f
    public static final boolean R(m mVar, byte b10) {
        l0.p(mVar, "<this>");
        return H0(mVar, b10);
    }

    @h1(version = "1.7")
    public static final long R0(@g n nVar) {
        l0.p(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.m();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    @g
    public static final c R1(char c10, char c11) {
        return l0.t(c11, 0) <= 0 ? c.S.a() : new c(c10, (char) (c11 - 1));
    }

    @f
    public static final boolean S(m mVar, long j10) {
        l0.p(mVar, "<this>");
        return K0(mVar, j10);
    }

    @h1(version = "1.7")
    @h
    public static final Character S0(@g a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.m());
    }

    @g
    public static final m S1(byte b10, byte b11) {
        return new m(b10, b11 - 1);
    }

    @h1(version = "1.3")
    @f
    public static final boolean T(m mVar, Integer num) {
        l0.p(mVar, "<this>");
        return num != null && mVar.q(num.intValue());
    }

    @h1(version = "1.7")
    @h
    public static final Integer T0(@g k kVar) {
        l0.p(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.m());
    }

    @g
    public static final m T1(byte b10, int i10) {
        return i10 <= Integer.MIN_VALUE ? m.S.a() : new m(b10, i10 - 1);
    }

    @f
    public static final boolean U(m mVar, short s10) {
        l0.p(mVar, "<this>");
        return L0(mVar, s10);
    }

    @h1(version = "1.7")
    @h
    public static final Long U0(@g n nVar) {
        l0.p(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.m());
    }

    @g
    public static final m U1(byte b10, short s10) {
        return new m(b10, s10 - 1);
    }

    @f
    public static final boolean V(p pVar, byte b10) {
        l0.p(pVar, "<this>");
        return V0(pVar, b10);
    }

    @ve.h(name = "longRangeContains")
    public static final boolean V0(@g h<Long> hVar, byte b10) {
        l0.p(hVar, "<this>");
        return hVar.b(Long.valueOf((long) b10));
    }

    @g
    public static final m V1(int i10, byte b10) {
        return new m(i10, b10 - 1);
    }

    @f
    public static final boolean W(p pVar, int i10) {
        l0.p(pVar, "<this>");
        return Y0(pVar, i10);
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "longRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean W0(h hVar, double d10) {
        l0.p(hVar, "<this>");
        Long L1 = L1(d10);
        if (L1 != null) {
            return hVar.b(L1);
        }
        return false;
    }

    @g
    public static final m W1(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? m.S.a() : new m(i10, i11 - 1);
    }

    @h1(version = "1.3")
    @f
    public static final boolean X(p pVar, Long l10) {
        l0.p(pVar, "<this>");
        return l10 != null && pVar.q(l10.longValue());
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "longRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean X0(h hVar, float f10) {
        l0.p(hVar, "<this>");
        Long M1 = M1(f10);
        if (M1 != null) {
            return hVar.b(M1);
        }
        return false;
    }

    @g
    public static final m X1(int i10, short s10) {
        return new m(i10, s10 - 1);
    }

    @f
    public static final boolean Y(p pVar, short s10) {
        l0.p(pVar, "<this>");
        return Z0(pVar, s10);
    }

    @ve.h(name = "longRangeContains")
    public static final boolean Y0(@g h<Long> hVar, int i10) {
        l0.p(hVar, "<this>");
        return hVar.b(Long.valueOf((long) i10));
    }

    @g
    public static final m Y1(short s10, byte b10) {
        return new m(s10, b10 - 1);
    }

    @ve.h(name = "longRangeContains")
    public static final boolean Z0(@g h<Long> hVar, short s10) {
        l0.p(hVar, "<this>");
        return hVar.b(Long.valueOf((long) s10));
    }

    @g
    public static final m Z1(short s10, int i10) {
        return i10 <= Integer.MIN_VALUE ? m.S.a() : new m(s10, i10 - 1);
    }

    @ve.h(name = "doubleRangeContains")
    public static final boolean a0(@g h<Double> hVar, float f10) {
        l0.p(hVar, "<this>");
        return hVar.b(Double.valueOf((double) f10));
    }

    @h1(version = "1.7")
    @ve.h(name = "longRangeContains")
    @r
    public static final boolean a1(@g s<Long> sVar, byte b10) {
        l0.p(sVar, "<this>");
        return sVar.b(Long.valueOf((long) b10));
    }

    @g
    public static final m a2(short s10, short s11) {
        return new m(s10, s11 - 1);
    }

    @h1(version = "1.7")
    @ve.h(name = "longRangeContains")
    @r
    public static final boolean b1(@g s<Long> sVar, int i10) {
        l0.p(sVar, "<this>");
        return sVar.b(Long.valueOf((long) i10));
    }

    @g
    public static final p b2(byte b10, long j10) {
        return j10 <= Long.MIN_VALUE ? p.S.a() : new p((long) b10, j10 - 1);
    }

    @h1(version = "1.7")
    @ve.h(name = "longRangeContains")
    @r
    public static final boolean c1(@g s<Long> sVar, short s10) {
        l0.p(sVar, "<this>");
        return sVar.b(Long.valueOf((long) s10));
    }

    @g
    public static final p c2(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? p.S.a() : new p((long) i10, j10 - 1);
    }

    @h1(version = "1.3")
    @f
    public static final char d1(c cVar) {
        l0.p(cVar, "<this>");
        return e1(cVar, ef.f.O);
    }

    @g
    public static final p d2(long j10, byte b10) {
        return new p(j10, ((long) b10) - 1);
    }

    @h1(version = "1.7")
    @ve.h(name = "doubleRangeContains")
    @r
    public static final boolean e0(@g s<Double> sVar, float f10) {
        l0.p(sVar, "<this>");
        return sVar.b(Double.valueOf((double) f10));
    }

    @h1(version = "1.3")
    public static final char e1(@g c cVar, @g ef.f fVar) {
        l0.p(cVar, "<this>");
        l0.p(fVar, "random");
        try {
            return (char) fVar.n(cVar.l(), cVar.m() + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @g
    public static final p e2(long j10, int i10) {
        return new p(j10, ((long) i10) - 1);
    }

    @g
    public static final a f0(char c10, char c11) {
        return a.R.a(c10, c11, -1);
    }

    @h1(version = "1.3")
    @f
    public static final int f1(m mVar) {
        l0.p(mVar, "<this>");
        return g1(mVar, ef.f.O);
    }

    @g
    public static final p f2(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? p.S.a() : new p(j10, j11 - 1);
    }

    @g
    public static final k g0(byte b10, byte b11) {
        return k.R.a(b10, b11, -1);
    }

    @h1(version = "1.3")
    public static final int g1(@g m mVar, @g ef.f fVar) {
        l0.p(mVar, "<this>");
        l0.p(fVar, "random");
        try {
            return ef.g.h(fVar, mVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @g
    public static final p g2(long j10, short s10) {
        return new p(j10, ((long) s10) - 1);
    }

    @g
    public static final k h0(byte b10, int i10) {
        return k.R.a(b10, i10, -1);
    }

    @h1(version = "1.3")
    @f
    public static final long h1(p pVar) {
        l0.p(pVar, "<this>");
        return i1(pVar, ef.f.O);
    }

    @g
    public static final p h2(short s10, long j10) {
        return j10 <= Long.MIN_VALUE ? p.S.a() : new p((long) s10, j10 - 1);
    }

    @g
    public static final k i0(byte b10, short s10) {
        return k.R.a(b10, s10, -1);
    }

    @h1(version = "1.3")
    public static final long i1(@g p pVar, @g ef.f fVar) {
        l0.p(pVar, "<this>");
        l0.p(fVar, "random");
        try {
            return ef.g.i(fVar, pVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "byteRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean j(h hVar, double d10) {
        l0.p(hVar, "<this>");
        Byte D1 = D1(d10);
        if (D1 != null) {
            return hVar.b(D1);
        }
        return false;
    }

    @g
    public static final k j0(int i10, byte b10) {
        return k.R.a(i10, b10, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final Character j1(c cVar) {
        l0.p(cVar, "<this>");
        return k1(cVar, ef.f.O);
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "byteRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean k(h hVar, float f10) {
        l0.p(hVar, "<this>");
        Byte E1 = E1(f10);
        if (E1 != null) {
            return hVar.b(E1);
        }
        return false;
    }

    @g
    public static final k k0(int i10, int i11) {
        return k.R.a(i10, i11, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final Character k1(@g c cVar, @g ef.f fVar) {
        l0.p(cVar, "<this>");
        l0.p(fVar, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) fVar.n(cVar.l(), cVar.m() + 1));
    }

    @ve.h(name = "byteRangeContains")
    public static final boolean l(@g h<Byte> hVar, int i10) {
        l0.p(hVar, "<this>");
        Byte F1 = F1(i10);
        if (F1 != null) {
            return hVar.b(F1);
        }
        return false;
    }

    @g
    public static final k l0(int i10, short s10) {
        return k.R.a(i10, s10, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final Integer l1(m mVar) {
        l0.p(mVar, "<this>");
        return m1(mVar, ef.f.O);
    }

    @ve.h(name = "byteRangeContains")
    public static final boolean m(@g h<Byte> hVar, long j10) {
        l0.p(hVar, "<this>");
        Byte G1 = G1(j10);
        if (G1 != null) {
            return hVar.b(G1);
        }
        return false;
    }

    @g
    public static final k m0(short s10, byte b10) {
        return k.R.a(s10, b10, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final Integer m1(@g m mVar, @g ef.f fVar) {
        l0.p(mVar, "<this>");
        l0.p(fVar, "random");
        if (mVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(ef.g.h(fVar, mVar));
    }

    @ve.h(name = "byteRangeContains")
    public static final boolean n(@g h<Byte> hVar, short s10) {
        l0.p(hVar, "<this>");
        Byte H1 = H1(s10);
        if (H1 != null) {
            return hVar.b(H1);
        }
        return false;
    }

    @g
    public static final k n0(short s10, int i10) {
        return k.R.a(s10, i10, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @f
    public static final Long n1(p pVar) {
        l0.p(pVar, "<this>");
        return o1(pVar, ef.f.O);
    }

    @h1(version = "1.7")
    @ve.h(name = "byteRangeContains")
    @r
    public static final boolean o(@g s<Byte> sVar, int i10) {
        l0.p(sVar, "<this>");
        Byte F1 = F1(i10);
        if (F1 != null) {
            return sVar.b(F1);
        }
        return false;
    }

    @g
    public static final k o0(short s10, short s11) {
        return k.R.a(s10, s11, -1);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @h
    public static final Long o1(@g p pVar, @g ef.f fVar) {
        l0.p(pVar, "<this>");
        l0.p(fVar, "random");
        if (pVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(ef.g.i(fVar, pVar));
    }

    @h1(version = "1.7")
    @ve.h(name = "byteRangeContains")
    @r
    public static final boolean p(@g s<Byte> sVar, long j10) {
        l0.p(sVar, "<this>");
        Byte G1 = G1(j10);
        if (G1 != null) {
            return sVar.b(G1);
        }
        return false;
    }

    @g
    public static final n p0(byte b10, long j10) {
        return n.R.a((long) b10, j10, -1);
    }

    @g
    public static final a p1(@g a aVar) {
        l0.p(aVar, "<this>");
        return a.R.a(aVar.m(), aVar.l(), -aVar.n());
    }

    @h1(version = "1.7")
    @ve.h(name = "byteRangeContains")
    @r
    public static final boolean q(@g s<Byte> sVar, short s10) {
        l0.p(sVar, "<this>");
        Byte H1 = H1(s10);
        if (H1 != null) {
            return sVar.b(H1);
        }
        return false;
    }

    @g
    public static final n q0(int i10, long j10) {
        return n.R.a((long) i10, j10, -1);
    }

    @g
    public static final k q1(@g k kVar) {
        l0.p(kVar, "<this>");
        return k.R.a(kVar.m(), kVar.l(), -kVar.n());
    }

    public static final byte r(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    @g
    public static final n r0(long j10, byte b10) {
        return n.R.a(j10, (long) b10, -1);
    }

    @g
    public static final n r1(@g n nVar) {
        l0.p(nVar, "<this>");
        return n.R.a(nVar.m(), nVar.l(), -nVar.n());
    }

    public static final double s(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    @g
    public static final n s0(long j10, int i10) {
        return n.R.a(j10, (long) i10, -1);
    }

    @ve.h(name = "shortRangeContains")
    public static final boolean s1(@g h<Short> hVar, byte b10) {
        l0.p(hVar, "<this>");
        return hVar.b(Short.valueOf((short) b10));
    }

    public static final float t(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    @g
    public static final n t0(long j10, long j11) {
        return n.R.a(j10, j11, -1);
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "shortRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean t1(h hVar, double d10) {
        l0.p(hVar, "<this>");
        Short N1 = N1(d10);
        if (N1 != null) {
            return hVar.b(N1);
        }
        return false;
    }

    public static final int u(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    @g
    public static final n u0(long j10, short s10) {
        return n.R.a(j10, (long) s10, -1);
    }

    @zd.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @ve.h(name = "shortRangeContains")
    @zd.k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean u1(h hVar, float f10) {
        l0.p(hVar, "<this>");
        Short O1 = O1(f10);
        if (O1 != null) {
            return hVar.b(O1);
        }
        return false;
    }

    public static final long v(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @g
    public static final n v0(short s10, long j10) {
        return n.R.a((long) s10, j10, -1);
    }

    @ve.h(name = "shortRangeContains")
    public static final boolean v1(@g h<Short> hVar, int i10) {
        l0.p(hVar, "<this>");
        Short P1 = P1(i10);
        if (P1 != null) {
            return hVar.b(P1);
        }
        return false;
    }

    @g
    public static final <T extends Comparable<? super T>> T w(@g T t10, @g T t11) {
        l0.p(t10, "<this>");
        l0.p(t11, "minimumValue");
        return t10.compareTo(t11) < 0 ? t11 : t10;
    }

    @h1(version = "1.7")
    public static final char w0(@g a aVar) {
        l0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.l();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @ve.h(name = "shortRangeContains")
    public static final boolean w1(@g h<Short> hVar, long j10) {
        l0.p(hVar, "<this>");
        Short Q1 = Q1(j10);
        if (Q1 != null) {
            return hVar.b(Q1);
        }
        return false;
    }

    public static final short x(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    @h1(version = "1.7")
    public static final int x0(@g k kVar) {
        l0.p(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.l();
        }
        throw new NoSuchElementException("Progression " + kVar + " is empty.");
    }

    @h1(version = "1.7")
    @ve.h(name = "shortRangeContains")
    @r
    public static final boolean x1(@g s<Short> sVar, byte b10) {
        l0.p(sVar, "<this>");
        return sVar.b(Short.valueOf((short) b10));
    }

    public static final byte y(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @h1(version = "1.7")
    public static final long y0(@g n nVar) {
        l0.p(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.l();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    @h1(version = "1.7")
    @ve.h(name = "shortRangeContains")
    @r
    public static final boolean y1(@g s<Short> sVar, int i10) {
        l0.p(sVar, "<this>");
        Short P1 = P1(i10);
        if (P1 != null) {
            return sVar.b(P1);
        }
        return false;
    }

    public static final double z(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @h1(version = "1.7")
    @h
    public static final Character z0(@g a aVar) {
        l0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.l());
    }

    @h1(version = "1.7")
    @ve.h(name = "shortRangeContains")
    @r
    public static final boolean z1(@g s<Short> sVar, long j10) {
        l0.p(sVar, "<this>");
        Short Q1 = Q1(j10);
        if (Q1 != null) {
            return sVar.b(Q1);
        }
        return false;
    }
}

package ee;

import be.p;
import be.s0;
import fh.g;
import gf.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import oe.f;
import ve.h;
import xe.l0;
import zd.a2;
import zd.b1;
import zd.b2;
import zd.e2;
import zd.f2;
import zd.h1;
import zd.j2;
import zd.k;
import zd.k2;
import zd.l;
import zd.p2;
import zd.q2;
import zd.t;
import zd.t0;
import zd.x2;

public class b {

    public static final class a extends be.c<e2> implements RandomAccess {
        public final /* synthetic */ int[] P;

        public a(int[] iArr) {
            this.P = iArr;
        }

        public int b() {
            return f2.r(this.P);
        }

        public boolean c(int i10) {
            return f2.l(this.P, i10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof e2)) {
                return false;
            }
            return c(((e2) obj).l0());
        }

        public int e(int i10) {
            return f2.p(this.P, i10);
        }

        public int f(int i10) {
            return p.hg(this.P, i10);
        }

        public /* bridge */ /* synthetic */ Object get(int i10) {
            return e2.b(e(i10));
        }

        public int h(int i10) {
            return p.li(this.P, i10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof e2)) {
                return -1;
            }
            return f(((e2) obj).l0());
        }

        public boolean isEmpty() {
            return f2.u(this.P);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof e2)) {
                return -1;
            }
            return h(((e2) obj).l0());
        }
    }

    /* renamed from: ee.b$b  reason: collision with other inner class name */
    public static final class C0298b extends be.c<j2> implements RandomAccess {
        public final /* synthetic */ long[] P;

        public C0298b(long[] jArr) {
            this.P = jArr;
        }

        public int b() {
            return k2.r(this.P);
        }

        public boolean c(long j10) {
            return k2.l(this.P, j10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof j2)) {
                return false;
            }
            return c(((j2) obj).l0());
        }

        public long e(int i10) {
            return k2.p(this.P, i10);
        }

        public int f(long j10) {
            return p.ig(this.P, j10);
        }

        public /* bridge */ /* synthetic */ Object get(int i10) {
            return j2.b(e(i10));
        }

        public int h(long j10) {
            return p.mi(this.P, j10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof j2)) {
                return -1;
            }
            return f(((j2) obj).l0());
        }

        public boolean isEmpty() {
            return k2.u(this.P);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof j2)) {
                return -1;
            }
            return h(((j2) obj).l0());
        }
    }

    public static final class c extends be.c<a2> implements RandomAccess {
        public final /* synthetic */ byte[] P;

        public c(byte[] bArr) {
            this.P = bArr;
        }

        public int b() {
            return b2.r(this.P);
        }

        public boolean c(byte b10) {
            return b2.l(this.P, b10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof a2)) {
                return false;
            }
            return c(((a2) obj).j0());
        }

        public byte e(int i10) {
            return b2.p(this.P, i10);
        }

        public int f(byte b10) {
            return p.dg(this.P, b10);
        }

        public /* bridge */ /* synthetic */ Object get(int i10) {
            return a2.b(e(i10));
        }

        public int h(byte b10) {
            return p.hi(this.P, b10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof a2)) {
                return -1;
            }
            return f(((a2) obj).j0());
        }

        public boolean isEmpty() {
            return b2.u(this.P);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof a2)) {
                return -1;
            }
            return h(((a2) obj).j0());
        }
    }

    public static final class d extends be.c<p2> implements RandomAccess {
        public final /* synthetic */ short[] P;

        public d(short[] sArr) {
            this.P = sArr;
        }

        public int b() {
            return q2.r(this.P);
        }

        public boolean c(short s10) {
            return q2.l(this.P, s10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof p2)) {
                return false;
            }
            return c(((p2) obj).j0());
        }

        public short e(int i10) {
            return q2.p(this.P, i10);
        }

        public int f(short s10) {
            return p.kg(this.P, s10);
        }

        public /* bridge */ /* synthetic */ Object get(int i10) {
            return p2.b(e(i10));
        }

        public int h(short s10) {
            return p.oi(this.P, s10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof p2)) {
                return -1;
            }
            return f(((p2) obj).j0());
        }

        public boolean isEmpty() {
            return q2.u(this.P);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof p2)) {
                return -1;
            }
            return h(((p2) obj).j0());
        }
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ p2 A(short[] sArr, Comparator comparator) {
        l0.p(sArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return c.M6(sArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ j2 B(long[] jArr, Comparator comparator) {
        l0.p(jArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return c.N6(jArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> a2 G(byte[] bArr, we.l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        int Re = p.Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.A(a2.b(p10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> j2 H(long[] jArr, we.l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        int We = p.We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.A(j2.b(p10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> e2 I(int[] iArr, we.l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.A(e2.b(p10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> p2 J(short[] sArr, we.l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.A(p2.b(p10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ a2 K(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return c.O7(bArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ e2 L(int[] iArr, Comparator comparator) {
        l0.p(iArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return c.P7(iArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ p2 M(short[] sArr, Comparator comparator) {
        l0.p(sArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return c.Q7(sArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ j2 N(long[] jArr, Comparator comparator) {
        l0.p(jArr, "$this$minWith");
        l0.p(comparator, "comparator");
        return c.R7(jArr, comparator);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final BigDecimal O(byte[] bArr, we.l<? super a2, ? extends BigDecimal> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigDecimal) lVar.A(a2.b(b2.p(bArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final BigDecimal P(int[] iArr, we.l<? super e2, ? extends BigDecimal> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigDecimal) lVar.A(e2.b(f2.p(iArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final BigDecimal Q(long[] jArr, we.l<? super j2, ? extends BigDecimal> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigDecimal) lVar.A(j2.b(k2.p(jArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final BigDecimal R(short[] sArr, we.l<? super p2, ? extends BigDecimal> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigDecimal) lVar.A(p2.b(q2.p(sArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final BigInteger S(byte[] bArr, we.l<? super a2, ? extends BigInteger> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigInteger) lVar.A(a2.b(b2.p(bArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final BigInteger T(int[] iArr, we.l<? super e2, ? extends BigInteger> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigInteger) lVar.A(e2.b(f2.p(iArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final BigInteger U(long[] jArr, we.l<? super j2, ? extends BigInteger> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigInteger) lVar.A(j2.b(k2.p(jArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final BigInteger V(short[] sArr, we.l<? super p2, ? extends BigInteger> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            valueOf = valueOf.add((BigInteger) lVar.A(p2.b(q2.p(sArr, i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> a(@g int[] iArr) {
        l0.p(iArr, "$this$asList");
        return new a(iArr);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> b(@g byte[] bArr) {
        l0.p(bArr, "$this$asList");
        return new c(bArr);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> c(@g long[] jArr) {
        l0.p(jArr, "$this$asList");
        return new C0298b(jArr);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> d(@g short[] sArr) {
        l0.p(sArr, "$this$asList");
        return new d(sArr);
    }

    @h1(version = "1.3")
    @t
    public static final int e(@g int[] iArr, int i10, int i11, int i12) {
        l0.p(iArr, "$this$binarySearch");
        be.c.O.d(i11, i12, f2.r(iArr));
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int c10 = x2.c(iArr[i14], i10);
            if (c10 < 0) {
                i11 = i14 + 1;
            } else if (c10 <= 0) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int f(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = f2.r(iArr);
        }
        return e(iArr, i10, i11, i12);
    }

    @h1(version = "1.3")
    @t
    public static final int g(@g short[] sArr, short s10, int i10, int i11) {
        l0.p(sArr, "$this$binarySearch");
        be.c.O.d(i10, i11, q2.r(sArr));
        short s11 = s10 & p2.R;
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int c10 = x2.c(sArr[i13], s11);
            if (c10 < 0) {
                i10 = i13 + 1;
            } else if (c10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int h(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q2.r(sArr);
        }
        return g(sArr, s10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    public static final int i(@g long[] jArr, long j10, int i10, int i11) {
        l0.p(jArr, "$this$binarySearch");
        be.c.O.d(i10, i11, k2.r(jArr));
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int g10 = x2.g(jArr[i13], j10);
            if (g10 < 0) {
                i10 = i13 + 1;
            } else if (g10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = k2.r(jArr);
        }
        return i(jArr, j10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    public static final int k(@g byte[] bArr, byte b10, int i10, int i11) {
        l0.p(bArr, "$this$binarySearch");
        be.c.O.d(i10, i11, b2.r(bArr));
        byte b11 = b10 & 255;
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int c10 = x2.c(bArr[i13], b11);
            if (c10 < 0) {
                i10 = i13 + 1;
            } else if (c10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int l(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = b2.r(bArr);
        }
        return k(bArr, b10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte m(byte[] bArr, int i10) {
        l0.p(bArr, "$this$elementAt");
        return b2.p(bArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short n(short[] sArr, int i10) {
        l0.p(sArr, "$this$elementAt");
        return q2.p(sArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int o(int[] iArr, int i10) {
        l0.p(iArr, "$this$elementAt");
        return f2.p(iArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long p(long[] jArr, int i10) {
        l0.p(jArr, "$this$elementAt");
        return k2.p(jArr, i10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> a2 u(byte[] bArr, we.l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        int Re = p.Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.A(a2.b(p10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> j2 v(long[] jArr, we.l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        int We = p.We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.A(j2.b(p10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> e2 w(int[] iArr, we.l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.A(e2.b(p10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> p2 x(short[] sArr, we.l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.A(p2.b(p10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ a2 y(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return c.K6(bArr, comparator);
    }

    @h1(version = "1.3")
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ e2 z(int[] iArr, Comparator comparator) {
        l0.p(iArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        return c.L6(iArr, comparator);
    }
}

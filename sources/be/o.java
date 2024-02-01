package be;

import gf.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import xe.l0;
import zd.a1;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.t0;

public class o extends n {

    public static final class a extends c<Byte> implements RandomAccess {
        public final /* synthetic */ byte[] P;

        public a(byte[] bArr) {
            this.P = bArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(byte b10) {
            return p.N8(this.P, b10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return c(((Number) obj).byteValue());
        }

        @fh.g
        /* renamed from: e */
        public Byte get(int i10) {
            return Byte.valueOf(this.P[i10]);
        }

        public int f(byte b10) {
            return p.dg(this.P, b10);
        }

        public int h(byte b10) {
            return p.hi(this.P, b10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return f(((Number) obj).byteValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return h(((Number) obj).byteValue());
        }
    }

    public static final class b extends c<Short> implements RandomAccess {
        public final /* synthetic */ short[] P;

        public b(short[] sArr) {
            this.P = sArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(short s10) {
            return p.U8(this.P, s10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return c(((Number) obj).shortValue());
        }

        @fh.g
        /* renamed from: e */
        public Short get(int i10) {
            return Short.valueOf(this.P[i10]);
        }

        public int f(short s10) {
            return p.kg(this.P, s10);
        }

        public int h(short s10) {
            return p.oi(this.P, s10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return f(((Number) obj).shortValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return h(((Number) obj).shortValue());
        }
    }

    public static final class c extends c<Integer> implements RandomAccess {
        public final /* synthetic */ int[] P;

        public c(int[] iArr) {
            this.P = iArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(int i10) {
            return p.R8(this.P, i10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return c(((Number) obj).intValue());
        }

        @fh.g
        /* renamed from: e */
        public Integer get(int i10) {
            return Integer.valueOf(this.P[i10]);
        }

        public int f(int i10) {
            return p.hg(this.P, i10);
        }

        public int h(int i10) {
            return p.li(this.P, i10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return f(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return h(((Number) obj).intValue());
        }
    }

    public static final class d extends c<Long> implements RandomAccess {
        public final /* synthetic */ long[] P;

        public d(long[] jArr) {
            this.P = jArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(long j10) {
            return p.S8(this.P, j10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return c(((Number) obj).longValue());
        }

        @fh.g
        /* renamed from: e */
        public Long get(int i10) {
            return Long.valueOf(this.P[i10]);
        }

        public int f(long j10) {
            return p.ig(this.P, j10);
        }

        public int h(long j10) {
            return p.mi(this.P, j10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return f(((Number) obj).longValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return h(((Number) obj).longValue());
        }
    }

    public static final class e extends c<Float> implements RandomAccess {
        public final /* synthetic */ float[] P;

        public e(float[] fArr) {
            this.P = fArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(float f10) {
            float[] fArr = this.P;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            return c(((Number) obj).floatValue());
        }

        @fh.g
        /* renamed from: e */
        public Float get(int i10) {
            return Float.valueOf(this.P[i10]);
        }

        public int f(float f10) {
            float[] fArr = this.P;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int h(float f10) {
            float[] fArr = this.P;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return f(((Number) obj).floatValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return h(((Number) obj).floatValue());
        }
    }

    public static final class f extends c<Double> implements RandomAccess {
        public final /* synthetic */ double[] P;

        public f(double[] dArr) {
            this.P = dArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(double d10) {
            double[] dArr = this.P;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return true;
                }
            }
            return false;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            return c(((Number) obj).doubleValue());
        }

        @fh.g
        /* renamed from: e */
        public Double get(int i10) {
            return Double.valueOf(this.P[i10]);
        }

        public int f(double d10) {
            double[] dArr = this.P;
            int length = dArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Double.doubleToLongBits(dArr[i10]) == Double.doubleToLongBits(d10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int h(double d10) {
            double[] dArr = this.P;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i10 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d10)) {
                    return length;
                }
                if (i10 < 0) {
                    return -1;
                }
                length = i10;
            }
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return f(((Number) obj).doubleValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return h(((Number) obj).doubleValue());
        }
    }

    public static final class g extends c<Boolean> implements RandomAccess {
        public final /* synthetic */ boolean[] P;

        public g(boolean[] zArr) {
            this.P = zArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(boolean z10) {
            return p.V8(this.P, z10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return c(((Boolean) obj).booleanValue());
        }

        @fh.g
        /* renamed from: e */
        public Boolean get(int i10) {
            return Boolean.valueOf(this.P[i10]);
        }

        public int f(boolean z10) {
            return p.lg(this.P, z10);
        }

        public int h(boolean z10) {
            return p.pi(this.P, z10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return f(((Boolean) obj).booleanValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return h(((Boolean) obj).booleanValue());
        }
    }

    public static final class h extends c<Character> implements RandomAccess {
        public final /* synthetic */ char[] P;

        public h(char[] cArr) {
            this.P = cArr;
        }

        public int b() {
            return this.P.length;
        }

        public boolean c(char c10) {
            return p.O8(this.P, c10);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return c(((Character) obj).charValue());
        }

        @fh.g
        /* renamed from: e */
        public Character get(int i10) {
            return Character.valueOf(this.P[i10]);
        }

        public int f(char c10) {
            return p.eg(this.P, c10);
        }

        public int h(char c10) {
            return p.ii(this.P, c10);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return f(((Character) obj).charValue());
        }

        public boolean isEmpty() {
            return this.P.length == 0;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return h(((Character) obj).charValue());
        }
    }

    public static final int A(@fh.g int[] iArr, int i10, int i11, int i12) {
        l0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int A0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @oe.f
    public static final <T> T[] A1(T[] tArr) {
        l0.p(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @fh.g
    public static final <C extends Collection<? super R>, R> C A2(@fh.g Object[] objArr, @fh.g C c10, @fh.g Class<R> cls) {
        l0.p(objArr, "<this>");
        l0.p(c10, "destination");
        l0.p(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c10.add(obj);
            }
        }
        return c10;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float A3(float[] fArr, Comparator comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        return p.eo(fArr, comparator);
    }

    public static /* synthetic */ void A4(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        k4(cArr, i10, i11);
    }

    public static final int B(@fh.g long[] jArr, long j10, int i10, int i11) {
        l0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final <T> int B0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @oe.f
    public static final <T> T[] B1(T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer B3(int[] iArr, Comparator comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        return p.fo(iArr, comparator);
    }

    public static /* synthetic */ void B4(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        m4(dArr, i10, i11);
    }

    public static final <T> int C(@fh.g T[] tArr, T t10, int i10, int i11) {
        l0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int C0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @oe.f
    public static final short[] C1(short[] sArr) {
        l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long C3(long[] jArr, Comparator comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        return p.go(jArr, comparator);
    }

    public static /* synthetic */ void C4(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        o4(fArr, i10, i11);
    }

    public static final <T> int D(@fh.g T[] tArr, T t10, @fh.g Comparator<? super T> comparator, int i10, int i11) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int D0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @oe.f
    public static final short[] D1(short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object D3(Object[] objArr, Comparator comparator) {
        l0.p(objArr, "<this>");
        l0.p(comparator, "comparator");
        return p.ho(objArr, comparator);
    }

    public static /* synthetic */ void D4(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        q4(iArr, i10, i11);
    }

    public static final int E(@fh.g short[] sArr, short s10, int i10, int i11) {
        l0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String E0(byte[] bArr) {
        l0.p(bArr, "<this>");
        String arrays = Arrays.toString(bArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    public static final boolean[] E1(boolean[] zArr) {
        l0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short E3(short[] sArr, Comparator comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        return p.io(sArr, comparator);
    }

    public static /* synthetic */ void E4(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        s4(jArr, i10, i11);
    }

    public static /* synthetic */ int F(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return w(bArr, b10, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String F0(char[] cArr) {
        l0.p(cArr, "<this>");
        String arrays = Arrays.toString(cArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    public static final boolean[] F1(boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @fh.g
    public static final byte[] F3(@fh.g byte[] bArr, byte b10) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void F4(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        u4(comparableArr, i10, i11);
    }

    public static /* synthetic */ int G(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return x(cArr, c10, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String G0(double[] dArr) {
        l0.p(dArr, "<this>");
        String arrays = Arrays.toString(dArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final byte[] G1(@fh.g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        m.c(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @fh.g
    public static final byte[] G3(@fh.g byte[] bArr, @fh.g Collection<Byte> collection) {
        l0.p(bArr, "<this>");
        l0.p(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        for (Byte byteValue : collection) {
            copyOf[length] = byteValue.byteValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void G4(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        w4(objArr, i10, i11);
    }

    public static /* synthetic */ int H(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return y(dArr, d10, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String H0(float[] fArr) {
        l0.p(fArr, "<this>");
        String arrays = Arrays.toString(fArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final char[] H1(@fh.g char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        m.c(i11, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @fh.g
    public static final byte[] H3(@fh.g byte[] bArr, @fh.g byte[] bArr2) {
        l0.p(bArr, "<this>");
        l0.p(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void H4(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        y4(sArr, i10, i11);
    }

    public static /* synthetic */ int I(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return z(fArr, f10, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String I0(int[] iArr) {
        l0.p(iArr, "<this>");
        String arrays = Arrays.toString(iArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final double[] I1(@fh.g double[] dArr, int i10, int i11) {
        l0.p(dArr, "<this>");
        m.c(i11, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @fh.g
    public static final char[] I3(@fh.g char[] cArr, char c10) {
        l0.p(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static final <T> void I4(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ int J(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return A(iArr, i10, i11, i12);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String J0(long[] jArr) {
        l0.p(jArr, "<this>");
        String arrays = Arrays.toString(jArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final float[] J1(@fh.g float[] fArr, int i10, int i11) {
        l0.p(fArr, "<this>");
        m.c(i11, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @fh.g
    public static final char[] J3(@fh.g char[] cArr, @fh.g Collection<Character> collection) {
        l0.p(cArr, "<this>");
        l0.p(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        for (Character charValue : collection) {
            copyOf[length] = charValue.charValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static final <T> void J4(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator, int i10, int i11) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static /* synthetic */ int K(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return B(jArr, j10, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ <T> String K0(T[] tArr) {
        l0.p(tArr, "<this>");
        String arrays = Arrays.toString(tArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final int[] K1(@fh.g int[] iArr, int i10, int i11) {
        l0.p(iArr, "<this>");
        m.c(i11, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @fh.g
    public static final char[] K3(@fh.g char[] cArr, @fh.g char[] cArr2) {
        l0.p(cArr, "<this>");
        l0.p(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void K4(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        J4(objArr, comparator, i10, i11);
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return C(objArr, obj, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String L0(short[] sArr) {
        l0.p(sArr, "<this>");
        String arrays = Arrays.toString(sArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final long[] L1(@fh.g long[] jArr, int i10, int i11) {
        l0.p(jArr, "<this>");
        m.c(i11, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean L2(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int Ze = p.Ze(zArr);
        if (Ze != 0) {
            Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
            s0 o10 = new m(1, Ze).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) < 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    @fh.g
    public static final double[] L3(@fh.g double[] dArr, double d10) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal L4(byte[] bArr, we.l<? super Byte, ? extends BigDecimal> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (byte valueOf2 : bArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Byte.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return D(objArr, obj, comparator, i10, i11);
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String M0(boolean[] zArr) {
        l0.p(zArr, "<this>");
        String arrays = Arrays.toString(zArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final <T> T[] M1(@fh.g T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        m.c(i11, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte M2(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int Re = p.Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) < 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
            }
        }
        return Byte.valueOf(b10);
    }

    @fh.g
    public static final double[] M3(@fh.g double[] dArr, @fh.g Collection<Double> collection) {
        l0.p(dArr, "<this>");
        l0.p(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        for (Double doubleValue : collection) {
            copyOf[length] = doubleValue.doubleValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal M4(char[] cArr, we.l<? super Character, ? extends BigDecimal> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (char valueOf2 : cArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Character.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static /* synthetic */ int N(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return E(sArr, s10, i10, i11);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String N0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final short[] N1(@fh.g short[] sArr, int i10, int i11) {
        l0.p(sArr, "<this>");
        m.c(i11, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character N2(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int Se = p.Se(cArr);
        if (Se != 0) {
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
            s0 o10 = new m(1, Se).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) < 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(c10);
    }

    @fh.g
    public static final double[] N3(@fh.g double[] dArr, @fh.g double[] dArr2) {
        l0.p(dArr, "<this>");
        l0.p(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal N4(double[] dArr, we.l<? super Double, ? extends BigDecimal> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (double valueOf2 : dArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Double.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @oe.h
    @oe.f
    @ve.h(name = "contentDeepEqualsInline")
    public static final <T> boolean O(T[] tArr, T[] tArr2) {
        l0.p(tArr, "<this>");
        l0.p(tArr2, "other");
        return n.g(tArr, tArr2);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String O0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @h1(version = "1.3")
    @a1
    @fh.g
    @ve.h(name = "copyOfRange")
    public static final boolean[] O1(@fh.g boolean[] zArr, int i10, int i11) {
        l0.p(zArr, "<this>");
        m.c(i11, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double O2(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int Te = p.Te(dArr);
        if (Te != 0) {
            Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
            s0 o10 = new m(1, Te).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                    d10 = d11;
                }
            }
        }
        return Double.valueOf(d10);
    }

    @fh.g
    public static final float[] O3(@fh.g float[] fArr, float f10) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal O4(float[] fArr, we.l<? super Float, ? extends BigDecimal> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (float valueOf2 : fArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Float.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentDeepEqualsNullable")
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return oe.m.a(1, 3, 0) ? n.g(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String P0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final byte[] P1(byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return G1(bArr, i10, i11);
        }
        if (i11 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + bArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float P2(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int Ue = p.Ue(fArr);
        if (Ue != 0) {
            Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
            s0 o10 = new m(1, Ue).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) < 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
            }
        }
        return Float.valueOf(f10);
    }

    @fh.g
    public static final float[] P3(@fh.g float[] fArr, @fh.g Collection<Float> collection) {
        l0.p(fArr, "<this>");
        l0.p(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        for (Float floatValue : collection) {
            copyOf[length] = floatValue.floatValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal P4(int[] iArr, we.l<? super Integer, ? extends BigDecimal> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int valueOf2 : iArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Integer.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @oe.h
    @oe.f
    @ve.h(name = "contentDeepHashCodeInline")
    public static final <T> int Q(T[] tArr) {
        l0.p(tArr, "<this>");
        return m.b(tArr);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String Q0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final char[] Q1(char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return H1(cArr, i10, i11);
        }
        if (i11 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + cArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer Q2(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
                if (comparable.compareTo(comparable2) < 0) {
                    i10 = i11;
                    comparable = comparable2;
                }
            }
        }
        return Integer.valueOf(i10);
    }

    @fh.g
    public static final float[] Q3(@fh.g float[] fArr, @fh.g float[] fArr2) {
        l0.p(fArr, "<this>");
        l0.p(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal Q4(long[] jArr, we.l<? super Long, ? extends BigDecimal> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (long valueOf2 : jArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Long.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentDeepHashCodeNullable")
    public static final <T> int R(T[] tArr) {
        return oe.m.a(1, 3, 0) ? m.b(tArr) : Arrays.deepHashCode(tArr);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String R0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final double[] R1(double[] dArr, int i10, int i11) {
        l0.p(dArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return I1(dArr, i10, i11);
        }
        if (i11 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + dArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long R2(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int We = p.We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                    j10 = j11;
                }
            }
        }
        return Long.valueOf(j10);
    }

    @fh.g
    public static final int[] R3(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final <T> BigDecimal R4(T[] tArr, we.l<? super T, ? extends BigDecimal> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (T A : tArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @oe.h
    @oe.f
    @ve.h(name = "contentDeepToStringInline")
    public static final <T> String S(T[] tArr) {
        l0.p(tArr, "<this>");
        return n.h(tArr);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String S0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final float[] S1(float[] fArr, int i10, int i11) {
        l0.p(fArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return J1(fArr, i10, i11);
        }
        if (i11 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + fArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T S2(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int Xe = p.Xe(tArr);
        if (Xe != 0) {
            Comparable comparable = (Comparable) lVar.A(t10);
            s0 o10 = new m(1, Xe).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(t11);
                if (comparable.compareTo(comparable2) < 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
            }
        }
        return t10;
    }

    @fh.g
    public static final int[] S3(@fh.g int[] iArr, @fh.g Collection<Integer> collection) {
        l0.p(iArr, "<this>");
        l0.p(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        for (Integer intValue : collection) {
            copyOf[length] = intValue.intValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal S4(short[] sArr, we.l<? super Short, ? extends BigDecimal> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (short valueOf2 : sArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Short.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentDeepToStringNullable")
    public static final <T> String T(T[] tArr) {
        if (oe.m.a(1, 3, 0)) {
            return n.h(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        l0.o(deepToString, "deepToString(this)");
        return deepToString;
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final <T> String T0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final int[] T1(int[] iArr, int i10, int i11) {
        l0.p(iArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return K1(iArr, i10, i11);
        }
        if (i11 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + iArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short T2(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) < 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
            }
        }
        return Short.valueOf(s10);
    }

    @fh.g
    public static final int[] T3(@fh.g int[] iArr, @fh.g int[] iArr2) {
        l0.p(iArr, "<this>");
        l0.p(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final BigDecimal T4(boolean[] zArr, we.l<? super Boolean, ? extends BigDecimal> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (boolean valueOf2 : zArr) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Boolean.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean U(byte[] bArr, byte[] bArr2) {
        l0.p(bArr, "<this>");
        l0.p(bArr2, "other");
        return Arrays.equals(bArr, bArr2);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String U0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final long[] U1(long[] jArr, int i10, int i11) {
        l0.p(jArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return L1(jArr, i10, i11);
        }
        if (i11 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + jArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean U2(boolean[] zArr, Comparator comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Cl(zArr, comparator);
    }

    @fh.g
    public static final long[] U3(@fh.g long[] jArr, long j10) {
        l0.p(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger U4(byte[] bArr, we.l<? super Byte, ? extends BigInteger> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (byte valueOf2 : bArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Byte.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean V(char[] cArr, char[] cArr2) {
        l0.p(cArr, "<this>");
        l0.p(cArr2, "other");
        return Arrays.equals(cArr, cArr2);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentToStringNullable")
    public static final String V0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        l0.o(arrays, "toString(this)");
        return arrays;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final <T> T[] V1(T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return M1(tArr, i10, i11);
        }
        if (i11 <= tArr.length) {
            T[] copyOfRange = Arrays.copyOfRange(tArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + tArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte V2(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Dl(bArr, comparator);
    }

    @fh.g
    public static final long[] V3(@fh.g long[] jArr, @fh.g Collection<Long> collection) {
        l0.p(jArr, "<this>");
        l0.p(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        for (Long longValue : collection) {
            copyOf[length] = longValue.longValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger V4(char[] cArr, we.l<? super Character, ? extends BigInteger> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (char valueOf2 : cArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Character.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean W(double[] dArr, double[] dArr2) {
        l0.p(dArr, "<this>");
        l0.p(dArr2, "other");
        return Arrays.equals(dArr, dArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final byte[] W0(@fh.g byte[] bArr, @fh.g byte[] bArr2, int i10, int i11, int i12) {
        l0.p(bArr, "<this>");
        l0.p(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final short[] W1(short[] sArr, int i10, int i11) {
        l0.p(sArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return N1(sArr, i10, i11);
        }
        if (i11 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + sArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character W2(char[] cArr, Comparator comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        return p.El(cArr, comparator);
    }

    @fh.g
    public static final long[] W3(@fh.g long[] jArr, @fh.g long[] jArr2) {
        l0.p(jArr, "<this>");
        l0.p(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger W4(double[] dArr, we.l<? super Double, ? extends BigInteger> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (double valueOf2 : dArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Double.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean X(float[] fArr, float[] fArr2) {
        l0.p(fArr, "<this>");
        l0.p(fArr2, "other");
        return Arrays.equals(fArr, fArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final char[] X0(@fh.g char[] cArr, @fh.g char[] cArr2, int i10, int i11, int i12) {
        l0.p(cArr, "<this>");
        l0.p(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    @oe.f
    @ve.h(name = "copyOfRangeInline")
    public static final boolean[] X1(boolean[] zArr, int i10, int i11) {
        l0.p(zArr, "<this>");
        if (oe.m.a(1, 3, 0)) {
            return O1(zArr, i10, i11);
        }
        if (i11 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i10, i11);
            l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i11 + ", size: " + zArr.length);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double X2(double[] dArr, Comparator comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Fl(dArr, comparator);
    }

    @fh.g
    public static final <T> T[] X3(@fh.g T[] tArr, T t10) {
        l0.p(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger X4(float[] fArr, we.l<? super Float, ? extends BigInteger> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (float valueOf2 : fArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Float.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean Y(int[] iArr, int[] iArr2) {
        l0.p(iArr, "<this>");
        l0.p(iArr2, "other");
        return Arrays.equals(iArr, iArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final double[] Y0(@fh.g double[] dArr, @fh.g double[] dArr2, int i10, int i11, int i12) {
        l0.p(dArr, "<this>");
        l0.p(dArr2, "destination");
        System.arraycopy(dArr, i11, dArr2, i10, i12 - i11);
        return dArr2;
    }

    @oe.f
    public static final byte Y1(byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        return bArr[i10];
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Float Y2(float[] fArr, Comparator comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Gl(fArr, comparator);
    }

    @fh.g
    public static final <T> T[] Y3(@fh.g T[] tArr, @fh.g Collection<? extends T> collection) {
        l0.p(tArr, "<this>");
        l0.p(collection, "elements");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, collection.size() + length);
        for (T t10 : collection) {
            copyOf[length] = t10;
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger Y4(int[] iArr, we.l<? super Integer, ? extends BigInteger> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int valueOf2 : iArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Integer.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean Z(long[] jArr, long[] jArr2) {
        l0.p(jArr, "<this>");
        l0.p(jArr2, "other");
        return Arrays.equals(jArr, jArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final float[] Z0(@fh.g float[] fArr, @fh.g float[] fArr2, int i10, int i11, int i12) {
        l0.p(fArr, "<this>");
        l0.p(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    @oe.f
    public static final char Z1(char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        return cArr[i10];
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Integer Z2(int[] iArr, Comparator comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Hl(iArr, comparator);
    }

    @fh.g
    public static final <T> T[] Z3(@fh.g T[] tArr, @fh.g T[] tArr2) {
        l0.p(tArr, "<this>");
        l0.p(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger Z4(long[] jArr, we.l<? super Long, ? extends BigInteger> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (long valueOf2 : jArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Long.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ <T> boolean a0(T[] tArr, T[] tArr2) {
        l0.p(tArr, "<this>");
        l0.p(tArr2, "other");
        return Arrays.equals(tArr, tArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final int[] a1(@fh.g int[] iArr, @fh.g int[] iArr2, int i10, int i11, int i12) {
        l0.p(iArr, "<this>");
        l0.p(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    @oe.f
    public static final double a2(double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        return dArr[i10];
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Long a3(long[] jArr, Comparator comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Il(jArr, comparator);
    }

    @fh.g
    public static final short[] a4(@fh.g short[] sArr, @fh.g Collection<Short> collection) {
        l0.p(sArr, "<this>");
        l0.p(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        for (Short shortValue : collection) {
            copyOf[length] = shortValue.shortValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final <T> BigInteger a5(T[] tArr, we.l<? super T, ? extends BigInteger> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (T A : tArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean b0(short[] sArr, short[] sArr2) {
        l0.p(sArr, "<this>");
        l0.p(sArr2, "other");
        return Arrays.equals(sArr, sArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final long[] b1(@fh.g long[] jArr, @fh.g long[] jArr2, int i10, int i11, int i12) {
        l0.p(jArr, "<this>");
        l0.p(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    @oe.f
    public static final float b2(float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        return fArr[i10];
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object b3(Object[] objArr, Comparator comparator) {
        l0.p(objArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Jl(objArr, comparator);
    }

    @fh.g
    public static final short[] b4(@fh.g short[] sArr, short s10) {
        l0.p(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger b5(short[] sArr, we.l<? super Short, ? extends BigInteger> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (short valueOf2 : sArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Short.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.1")
    @l(hiddenSince = "1.4")
    @oe.f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean c0(boolean[] zArr, boolean[] zArr2) {
        l0.p(zArr, "<this>");
        l0.p(zArr2, "other");
        return Arrays.equals(zArr, zArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final <T> T[] c1(@fh.g T[] tArr, @fh.g T[] tArr2, int i10, int i11, int i12) {
        l0.p(tArr, "<this>");
        l0.p(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    @oe.f
    public static final int c2(int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        return iArr[i10];
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Short c3(short[] sArr, Comparator comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        return p.Kl(sArr, comparator);
    }

    @fh.g
    public static final short[] c4(@fh.g short[] sArr, @fh.g short[] sArr2) {
        l0.p(sArr, "<this>");
        l0.p(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final BigInteger c5(boolean[] zArr, we.l<? super Boolean, ? extends BigInteger> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (boolean valueOf2 : zArr) {
            valueOf = valueOf.add((BigInteger) lVar.A(Boolean.valueOf(valueOf2)));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean d0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final short[] d1(@fh.g short[] sArr, @fh.g short[] sArr2, int i10, int i11, int i12) {
        l0.p(sArr, "<this>");
        l0.p(sArr2, "destination");
        System.arraycopy(sArr, i11, sArr2, i10, i12 - i11);
        return sArr2;
    }

    @oe.f
    public static final long d2(long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        return jArr[i10];
    }

    @fh.g
    public static final boolean[] d4(@fh.g boolean[] zArr, @fh.g Collection<Boolean> collection) {
        l0.p(zArr, "<this>");
        l0.p(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        for (Boolean booleanValue : collection) {
            copyOf[length] = booleanValue.booleanValue();
            length++;
        }
        l0.o(copyOf, "result");
        return copyOf;
    }

    @fh.g
    public static final SortedSet<Byte> d5(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return (SortedSet) p.Jy(bArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean e0(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @fh.g
    @h1(version = "1.3")
    public static final boolean[] e1(@fh.g boolean[] zArr, @fh.g boolean[] zArr2, int i10, int i11, int i12) {
        l0.p(zArr, "<this>");
        l0.p(zArr2, "destination");
        System.arraycopy(zArr, i11, zArr2, i10, i12 - i11);
        return zArr2;
    }

    @oe.f
    public static final <T> T e2(T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        return tArr[i10];
    }

    @fh.g
    public static final boolean[] e4(@fh.g boolean[] zArr, boolean z10) {
        l0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z10;
        l0.o(copyOf, "result");
        return copyOf;
    }

    @fh.g
    public static final SortedSet<Character> e5(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return (SortedSet) p.Ky(cArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean f0(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    public static /* synthetic */ byte[] f1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return W0(bArr, bArr2, i10, i11, i12);
    }

    @oe.f
    public static final short f2(short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        return sArr[i10];
    }

    @fh.g
    public static final boolean[] f4(@fh.g boolean[] zArr, @fh.g boolean[] zArr2) {
        l0.p(zArr, "<this>");
        l0.p(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        l0.o(copyOf, "result");
        return copyOf;
    }

    @fh.g
    public static final SortedSet<Double> f5(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return (SortedSet) p.Ly(dArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean g0(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static /* synthetic */ char[] g1(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return X0(cArr, cArr2, i10, i11, i12);
    }

    @oe.f
    public static final boolean g2(boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        return zArr[i10];
    }

    @oe.f
    public static final <T> T[] g4(T[] tArr, T t10) {
        l0.p(tArr, "<this>");
        return X3(tArr, t10);
    }

    @fh.g
    public static final SortedSet<Float> g5(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return (SortedSet) p.My(fArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean h0(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static /* synthetic */ double[] h1(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return Y0(dArr, dArr2, i10, i11, i12);
    }

    public static final void h2(@fh.g byte[] bArr, byte b10, int i10, int i11) {
        l0.p(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static final void h4(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @fh.g
    public static final SortedSet<Integer> h5(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return (SortedSet) p.Ny(iArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean i0(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static /* synthetic */ float[] i1(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return Z0(fArr, fArr2, i10, i11, i12);
    }

    public static final void i2(@fh.g char[] cArr, char c10, int i10, int i11) {
        l0.p(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    public static final void i4(@fh.g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    @fh.g
    public static final SortedSet<Long> i5(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return (SortedSet) p.Oy(jArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final <T> boolean j0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    public static /* synthetic */ int[] j1(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return a1(iArr, iArr2, i10, i11, i12);
    }

    public static final void j2(@fh.g double[] dArr, double d10, int i10, int i11) {
        l0.p(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    public static final void j4(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @fh.g
    public static final <T extends Comparable<? super T>> SortedSet<T> j5(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return (SortedSet) p.Py(tArr, new TreeSet());
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean k0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static /* synthetic */ long[] k1(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return b1(jArr, jArr2, i10, i11, i12);
    }

    public static final void k2(@fh.g float[] fArr, float f10, int i10, int i11) {
        l0.p(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    public static final void k4(@fh.g char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    @fh.g
    public static final <T> SortedSet<T> k5(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        return (SortedSet) p.Py(tArr, new TreeSet(comparator));
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentEqualsNullable")
    public static final boolean l0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    public static /* synthetic */ Object[] l1(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return c1(objArr, objArr2, i10, i11, i12);
    }

    public static final void l2(@fh.g int[] iArr, int i10, int i11, int i12) {
        l0.p(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void l4(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @fh.g
    public static final SortedSet<Short> l5(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return (SortedSet) p.Qy(sArr, new TreeSet());
    }

    public static /* synthetic */ short[] m1(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return d1(sArr, sArr2, i10, i11, i12);
    }

    public static final void m2(@fh.g long[] jArr, long j10, int i10, int i11) {
        l0.p(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static final void m4(@fh.g double[] dArr, int i10, int i11) {
        l0.p(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    @fh.g
    public static final SortedSet<Boolean> m5(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return (SortedSet) p.Ry(zArr, new TreeSet());
    }

    @fh.g
    public static final List<Byte> n(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return new a(bArr);
    }

    public static /* synthetic */ boolean[] n1(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return e1(zArr, zArr2, i10, i11, i12);
    }

    public static final <T> void n2(@fh.g T[] tArr, T t10, int i10, int i11) {
        l0.p(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean n3(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int Ze = p.Ze(zArr);
        if (Ze != 0) {
            Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
            s0 o10 = new m(1, Ze).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) > 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public static final void n4(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @fh.g
    public static final Boolean[] n5(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    @fh.g
    public static final List<Character> o(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return new h(cArr);
    }

    @oe.f
    public static final byte[] o1(byte[] bArr) {
        l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static final void o2(@fh.g short[] sArr, short s10, int i10, int i11) {
        l0.p(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte o3(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int Re = p.Re(bArr);
        if (Re != 0) {
            Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) > 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
            }
        }
        return Byte.valueOf(b10);
    }

    public static final void o4(@fh.g float[] fArr, int i10, int i11) {
        l0.p(fArr, "<this>");
        Arrays.sort(fArr, i10, i11);
    }

    @fh.g
    public static final Byte[] o5(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    @fh.g
    public static final List<Double> p(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return new f(dArr);
    }

    @oe.f
    public static final byte[] p1(byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void p2(@fh.g boolean[] zArr, boolean z10, int i10, int i11) {
        l0.p(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character p3(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int Se = p.Se(cArr);
        if (Se != 0) {
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
            s0 o10 = new m(1, Se).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) > 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(c10);
    }

    public static final void p4(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @fh.g
    public static final Character[] p5(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    @fh.g
    public static final List<Float> q(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return new e(fArr);
    }

    @oe.f
    public static final char[] q1(char[] cArr) {
        l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void q2(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        h2(bArr, b10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Double q3(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int Te = p.Te(dArr);
        if (Te != 0) {
            Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
            s0 o10 = new m(1, Te).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                    d10 = d11;
                }
            }
        }
        return Double.valueOf(d10);
    }

    public static final void q4(@fh.g int[] iArr, int i10, int i11) {
        l0.p(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    @fh.g
    public static final Double[] q5(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    @fh.g
    public static final List<Integer> r(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return new c(iArr);
    }

    @oe.f
    public static final char[] r1(char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void r2(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        i2(cArr, c10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Float r3(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int Ue = p.Ue(fArr);
        if (Ue != 0) {
            Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
            s0 o10 = new m(1, Ue).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) > 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
            }
        }
        return Float.valueOf(f10);
    }

    public static final void r4(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @fh.g
    public static final Float[] r5(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    @fh.g
    public static final List<Long> s(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return new d(jArr);
    }

    @oe.f
    public static final double[] s1(double[] dArr) {
        l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void s2(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        j2(dArr, d10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer s3(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int Ve = p.Ve(iArr);
        if (Ve != 0) {
            Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
                if (comparable.compareTo(comparable2) > 0) {
                    i10 = i11;
                    comparable = comparable2;
                }
            }
        }
        return Integer.valueOf(i10);
    }

    public static final void s4(@fh.g long[] jArr, int i10, int i11) {
        l0.p(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    @fh.g
    public static final Integer[] s5(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @fh.g
    public static final <T> List<T> t(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        List<T> a10 = q.a(tArr);
        l0.o(a10, "asList(this)");
        return a10;
    }

    @oe.f
    public static final double[] t1(double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void t2(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        k2(fArr, f10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Long t3(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int We = p.We(jArr);
        if (We != 0) {
            Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                    j10 = j11;
                }
            }
        }
        return Long.valueOf(j10);
    }

    @oe.f
    public static final <T extends Comparable<? super T>> void t4(T[] tArr) {
        l0.p(tArr, "<this>");
        v4(tArr);
    }

    @fh.g
    public static final Long[] t5(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    @fh.g
    public static final List<Short> u(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return new b(sArr);
    }

    @oe.f
    public static final float[] u1(float[] fArr) {
        l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void u2(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        l2(iArr, i10, i11, i12);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T u3(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int Xe = p.Xe(tArr);
        if (Xe != 0) {
            Comparable comparable = (Comparable) lVar.A(t10);
            s0 o10 = new m(1, Xe).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(t11);
                if (comparable.compareTo(comparable2) > 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    public static final <T extends Comparable<? super T>> void u4(@fh.g T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    @fh.g
    public static final Short[] u5(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    @fh.g
    public static final List<Boolean> v(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return new g(zArr);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int v0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @oe.f
    public static final float[] v1(float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void v2(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m2(jArr, j10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Short v3(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int Ye = p.Ye(sArr);
        if (Ye != 0) {
            Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) > 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
            }
        }
        return Short.valueOf(s10);
    }

    public static final <T> void v4(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final int w(@fh.g byte[] bArr, byte b10, int i10, int i11) {
        l0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int w0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @oe.f
    public static final int[] w1(int[] iArr) {
        l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void w2(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        n2(objArr, obj, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Boolean w3(boolean[] zArr, Comparator comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        return p.ao(zArr, comparator);
    }

    public static final <T> void w4(@fh.g T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    public static final int x(@fh.g char[] cArr, char c10, int i10, int i11) {
        l0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int x0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @oe.f
    public static final int[] x1(int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void x2(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        o2(sArr, s10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Byte x3(byte[] bArr, Comparator comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        return p.bo(bArr, comparator);
    }

    public static final void x4(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final int y(@fh.g double[] dArr, double d10, int i10, int i11) {
        l0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int y0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @oe.f
    public static final long[] y1(long[] jArr) {
        l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void y2(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        p2(zArr, z10, i10, i11);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character y3(char[] cArr, Comparator comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        return p.co(cArr, comparator);
    }

    public static final void y4(@fh.g short[] sArr, int i10, int i11) {
        l0.p(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    public static final int z(@fh.g float[] fArr, float f10, int i10, int i11) {
        l0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    @h1(version = "1.4")
    @oe.f
    @ve.h(name = "contentHashCodeNullable")
    public static final int z0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @oe.f
    public static final long[] z1(long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @fh.g
    public static final <R> List<R> z2(@fh.g Object[] objArr, @fh.g Class<R> cls) {
        l0.p(objArr, "<this>");
        l0.p(cls, "klass");
        return (List) A2(objArr, new ArrayList(), cls);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Double z3(double[] dArr, Comparator comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        return p.m0do(dArr, comparator);
    }

    public static /* synthetic */ void z4(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        i4(bArr, i10, i11);
    }
}

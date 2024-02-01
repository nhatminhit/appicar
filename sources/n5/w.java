package n5;

import a6.c;
import i5.k;
import i5.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import l5.i;
import l5.s;
import m5.q;
import m5.r;
import v4.k0;
import v4.n;
import w4.l;
import w4.p;

public abstract class w<T> extends a0<T> implements i {
    public final Boolean T;
    public transient Object U;
    public final s V;

    @j5.a
    public static final class a extends w<boolean[]> {
        public static final long W = 1;

        public a() {
            super(boolean[].class);
        }

        public a(a aVar, s sVar, Boolean bool) {
            super(aVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new a(this, sVar, bool);
        }

        /* renamed from: L0 */
        public boolean[] E0(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public boolean[] F0() {
            return new boolean[0];
        }

        /* renamed from: N0 */
        public boolean[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            boolean z10;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.b c10 = gVar.R().c();
                boolean[] zArr = (boolean[]) c10.f();
                int i10 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        }
                        if (D2 == p.VALUE_TRUE) {
                            z10 = true;
                        } else {
                            if (D2 != p.VALUE_FALSE) {
                                if (D2 == p.VALUE_NULL) {
                                    s sVar = this.V;
                                    if (sVar != null) {
                                        sVar.d(gVar);
                                    } else {
                                        k0(gVar);
                                    }
                                } else {
                                    z10 = R(gVar, lVar, Boolean.TYPE);
                                }
                            }
                            z10 = false;
                        }
                        if (i10 >= zArr.length) {
                            boolean[] zArr2 = (boolean[]) c10.c(zArr, i10);
                            i10 = 0;
                            zArr = zArr2;
                        }
                        int i11 = i10 + 1;
                        try {
                            zArr[i10] = z10;
                            i10 = i11;
                        } catch (Exception e11) {
                            e = e11;
                            i10 = i11;
                            throw i5.l.x(e, zArr, c10.d() + i10);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        throw i5.l.x(e, zArr, c10.d() + i10);
                    }
                }
                e10 = c10.e(zArr, i10);
            }
            return (boolean[]) e10;
        }

        /* renamed from: O0 */
        public boolean[] J0(l lVar, i5.g gVar) throws IOException {
            return new boolean[]{R(gVar, lVar, Boolean.TYPE)};
        }
    }

    @j5.a
    public static final class b extends w<byte[]> {
        public static final long W = 1;

        public b() {
            super(byte[].class);
        }

        public b(b bVar, s sVar, Boolean bool) {
            super(bVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new b(this, sVar, bool);
        }

        /* renamed from: L0 */
        public byte[] E0(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public byte[] F0() {
            return new byte[0];
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0089 A[Catch:{ Exception -> 0x009f }] */
        /* renamed from: N0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte[] f(w4.l r7, i5.g r8) throws java.io.IOException {
            /*
                r6 = this;
                w4.p r0 = r7.P()
                w4.p r1 = w4.p.VALUE_STRING
                r2 = 0
                if (r0 != r1) goto L_0x002e
                w4.a r1 = r8.S()     // Catch:{ k -> 0x0012 }
                byte[] r7 = r7.m0(r1)     // Catch:{ k -> 0x0012 }
                return r7
            L_0x0012:
                r1 = move-exception
                java.lang.String r1 = r1.d()
                java.lang.String r3 = "base64"
                boolean r3 = r1.contains(r3)
                if (r3 == 0) goto L_0x002e
                java.lang.Class<byte[]> r0 = byte[].class
                java.lang.String r7 = r7.Y1()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Object r7 = r8.p0(r0, r7, r1, r2)
            L_0x002b:
                byte[] r7 = (byte[]) r7
                return r7
            L_0x002e:
                w4.p r1 = w4.p.VALUE_EMBEDDED_OBJECT
                if (r0 != r1) goto L_0x0041
                java.lang.Object r0 = r7.p1()
                if (r0 != 0) goto L_0x003a
                r7 = 0
                return r7
            L_0x003a:
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L_0x0041
                byte[] r0 = (byte[]) r0
                return r0
            L_0x0041:
                boolean r0 = r7.u2()
                if (r0 != 0) goto L_0x004c
                java.lang.Object r7 = r6.I0(r7, r8)
                goto L_0x002b
            L_0x004c:
                a6.c r0 = r8.R()
                a6.c$c r0 = r0.d()
                java.lang.Object r1 = r0.f()
                byte[] r1 = (byte[]) r1
                r3 = r2
            L_0x005b:
                w4.p r4 = r7.D2()     // Catch:{ Exception -> 0x009f }
                w4.p r5 = w4.p.END_ARRAY     // Catch:{ Exception -> 0x009f }
                if (r4 == r5) goto L_0x009a
                w4.p r5 = w4.p.VALUE_NUMBER_INT     // Catch:{ Exception -> 0x009f }
                if (r4 == r5) goto L_0x0082
                w4.p r5 = w4.p.VALUE_NUMBER_FLOAT     // Catch:{ Exception -> 0x009f }
                if (r4 != r5) goto L_0x006c
                goto L_0x0082
            L_0x006c:
                w4.p r5 = w4.p.VALUE_NULL     // Catch:{ Exception -> 0x009f }
                if (r4 != r5) goto L_0x007d
                l5.s r4 = r6.V     // Catch:{ Exception -> 0x009f }
                if (r4 == 0) goto L_0x0078
                r4.d(r8)     // Catch:{ Exception -> 0x009f }
                goto L_0x005b
            L_0x0078:
                r6.k0(r8)     // Catch:{ Exception -> 0x009f }
                r4 = r2
                goto L_0x0086
            L_0x007d:
                byte r4 = r6.T(r7, r8)     // Catch:{ Exception -> 0x009f }
                goto L_0x0086
            L_0x0082:
                byte r4 = r7.H0()     // Catch:{ Exception -> 0x009f }
            L_0x0086:
                int r5 = r1.length     // Catch:{ Exception -> 0x009f }
                if (r3 < r5) goto L_0x0091
                java.lang.Object r5 = r0.c(r1, r3)     // Catch:{ Exception -> 0x009f }
                byte[] r5 = (byte[]) r5     // Catch:{ Exception -> 0x009f }
                r3 = r2
                r1 = r5
            L_0x0091:
                int r5 = r3 + 1
                r1[r3] = r4     // Catch:{ Exception -> 0x0097 }
                r3 = r5
                goto L_0x005b
            L_0x0097:
                r7 = move-exception
                r3 = r5
                goto L_0x00a0
            L_0x009a:
                java.lang.Object r7 = r0.e(r1, r3)
                goto L_0x002b
            L_0x009f:
                r7 = move-exception
            L_0x00a0:
                int r8 = r0.d()
                int r8 = r8 + r3
                i5.l r7 = i5.l.x(r7, r1, r8)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.w.b.f(w4.l, i5.g):byte[]");
        }

        /* renamed from: O0 */
        public byte[] J0(l lVar, i5.g gVar) throws IOException {
            byte b10;
            p P = lVar.P();
            if (P == p.VALUE_NUMBER_INT || P == p.VALUE_NUMBER_FLOAT) {
                b10 = lVar.H0();
            } else if (P == p.VALUE_NULL) {
                s sVar = this.V;
                if (sVar != null) {
                    sVar.d(gVar);
                    return (byte[]) n(gVar);
                }
                k0(gVar);
                return null;
            } else {
                b10 = ((Number) gVar.i0(this.O.getComponentType(), lVar)).byteValue();
            }
            return new byte[]{b10};
        }
    }

    @j5.a
    public static final class c extends w<char[]> {
        public static final long W = 1;

        public c() {
            super(char[].class);
        }

        public c(c cVar, s sVar, Boolean bool) {
            super(cVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return this;
        }

        /* renamed from: L0 */
        public char[] E0(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public char[] F0() {
            return new char[0];
        }

        /* renamed from: N0 */
        public char[] f(l lVar, i5.g gVar) throws IOException {
            String str;
            if (lVar.q2(p.VALUE_STRING)) {
                char[] Z1 = lVar.Z1();
                int b22 = lVar.b2();
                int a22 = lVar.a2();
                char[] cArr = new char[a22];
                System.arraycopy(Z1, b22, cArr, 0, a22);
                return cArr;
            } else if (lVar.u2()) {
                StringBuilder sb2 = new StringBuilder(64);
                while (true) {
                    p D2 = lVar.D2();
                    if (D2 == p.END_ARRAY) {
                        return sb2.toString().toCharArray();
                    }
                    if (D2 == p.VALUE_STRING) {
                        str = lVar.Y1();
                    } else if (D2 == p.VALUE_NULL) {
                        s sVar = this.V;
                        if (sVar != null) {
                            sVar.d(gVar);
                        } else {
                            k0(gVar);
                            str = "\u0000";
                        }
                    } else {
                        str = ((CharSequence) gVar.i0(Character.TYPE, lVar)).toString();
                    }
                    if (str.length() != 1) {
                        gVar.O0(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(str.length()));
                    }
                    sb2.append(str.charAt(0));
                }
            } else {
                if (lVar.q2(p.VALUE_EMBEDDED_OBJECT)) {
                    Object p12 = lVar.p1();
                    if (p12 == null) {
                        return null;
                    }
                    if (p12 instanceof char[]) {
                        return (char[]) p12;
                    }
                    if (p12 instanceof String) {
                        return ((String) p12).toCharArray();
                    }
                    if (p12 instanceof byte[]) {
                        return w4.b.a().i((byte[]) p12, false).toCharArray();
                    }
                }
                return (char[]) gVar.i0(this.O, lVar);
            }
        }

        /* renamed from: O0 */
        public char[] J0(l lVar, i5.g gVar) throws IOException {
            return (char[]) gVar.i0(this.O, lVar);
        }
    }

    @j5.a
    public static final class d extends w<double[]> {
        public static final long W = 1;

        public d() {
            super(double[].class);
        }

        public d(d dVar, s sVar, Boolean bool) {
            super(dVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new d(this, sVar, bool);
        }

        /* renamed from: L0 */
        public double[] E0(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public double[] F0() {
            return new double[0];
        }

        /* renamed from: N0 */
        public double[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            s sVar;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.d e11 = gVar.R().e();
                double[] dArr = (double[]) e11.f();
                int i10 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        } else if (D2 != p.VALUE_NULL || (sVar = this.V) == null) {
                            double Y = Y(lVar, gVar);
                            if (i10 >= dArr.length) {
                                double[] dArr2 = (double[]) e11.c(dArr, i10);
                                i10 = 0;
                                dArr = dArr2;
                            }
                            int i11 = i10 + 1;
                            try {
                                dArr[i10] = Y;
                                i10 = i11;
                            } catch (Exception e12) {
                                e = e12;
                                i10 = i11;
                                throw i5.l.x(e, dArr, e11.d() + i10);
                            }
                        } else {
                            sVar.d(gVar);
                        }
                    } catch (Exception e13) {
                        e = e13;
                        throw i5.l.x(e, dArr, e11.d() + i10);
                    }
                }
                e10 = e11.e(dArr, i10);
            }
            return (double[]) e10;
        }

        /* renamed from: O0 */
        public double[] J0(l lVar, i5.g gVar) throws IOException {
            return new double[]{Y(lVar, gVar)};
        }
    }

    @j5.a
    public static final class e extends w<float[]> {
        public static final long W = 1;

        public e() {
            super(float[].class);
        }

        public e(e eVar, s sVar, Boolean bool) {
            super(eVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new e(this, sVar, bool);
        }

        /* renamed from: L0 */
        public float[] E0(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public float[] F0() {
            return new float[0];
        }

        /* renamed from: N0 */
        public float[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            s sVar;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.e f10 = gVar.R().f();
                float[] fArr = (float[]) f10.f();
                int i10 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        } else if (D2 != p.VALUE_NULL || (sVar = this.V) == null) {
                            float a02 = a0(lVar, gVar);
                            if (i10 >= fArr.length) {
                                float[] fArr2 = (float[]) f10.c(fArr, i10);
                                i10 = 0;
                                fArr = fArr2;
                            }
                            int i11 = i10 + 1;
                            try {
                                fArr[i10] = a02;
                                i10 = i11;
                            } catch (Exception e11) {
                                e = e11;
                                i10 = i11;
                                throw i5.l.x(e, fArr, f10.d() + i10);
                            }
                        } else {
                            sVar.d(gVar);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        throw i5.l.x(e, fArr, f10.d() + i10);
                    }
                }
                e10 = f10.e(fArr, i10);
            }
            return (float[]) e10;
        }

        /* renamed from: O0 */
        public float[] J0(l lVar, i5.g gVar) throws IOException {
            return new float[]{a0(lVar, gVar)};
        }
    }

    @j5.a
    public static final class f extends w<int[]> {
        public static final long W = 1;
        public static final f X = new f();

        public f() {
            super(int[].class);
        }

        public f(f fVar, s sVar, Boolean bool) {
            super(fVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new f(this, sVar, bool);
        }

        /* renamed from: L0 */
        public int[] E0(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public int[] F0() {
            return new int[0];
        }

        /* renamed from: N0 */
        public int[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            int i10;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.f g10 = gVar.R().g();
                int[] iArr = (int[]) g10.f();
                int i11 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        }
                        if (D2 == p.VALUE_NUMBER_INT) {
                            i10 = lVar.N1();
                        } else if (D2 == p.VALUE_NULL) {
                            s sVar = this.V;
                            if (sVar != null) {
                                sVar.d(gVar);
                            } else {
                                k0(gVar);
                                i10 = 0;
                            }
                        } else {
                            i10 = c0(lVar, gVar);
                        }
                        if (i11 >= iArr.length) {
                            int[] iArr2 = (int[]) g10.c(iArr, i11);
                            i11 = 0;
                            iArr = iArr2;
                        }
                        int i12 = i11 + 1;
                        try {
                            iArr[i11] = i10;
                            i11 = i12;
                        } catch (Exception e11) {
                            e = e11;
                            i11 = i12;
                            throw i5.l.x(e, iArr, g10.d() + i11);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        throw i5.l.x(e, iArr, g10.d() + i11);
                    }
                }
                e10 = g10.e(iArr, i11);
            }
            return (int[]) e10;
        }

        /* renamed from: O0 */
        public int[] J0(l lVar, i5.g gVar) throws IOException {
            return new int[]{c0(lVar, gVar)};
        }
    }

    @j5.a
    public static final class g extends w<long[]> {
        public static final long W = 1;
        public static final g X = new g();

        public g() {
            super(long[].class);
        }

        public g(g gVar, s sVar, Boolean bool) {
            super(gVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new g(this, sVar, bool);
        }

        /* renamed from: L0 */
        public long[] E0(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public long[] F0() {
            return new long[0];
        }

        /* renamed from: N0 */
        public long[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            long j10;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.g h10 = gVar.R().h();
                long[] jArr = (long[]) h10.f();
                int i10 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        }
                        if (D2 == p.VALUE_NUMBER_INT) {
                            j10 = lVar.P1();
                        } else if (D2 == p.VALUE_NULL) {
                            s sVar = this.V;
                            if (sVar != null) {
                                sVar.d(gVar);
                            } else {
                                k0(gVar);
                                j10 = 0;
                            }
                        } else {
                            j10 = e0(lVar, gVar);
                        }
                        if (i10 >= jArr.length) {
                            long[] jArr2 = (long[]) h10.c(jArr, i10);
                            i10 = 0;
                            jArr = jArr2;
                        }
                        int i11 = i10 + 1;
                        try {
                            jArr[i10] = j10;
                            i10 = i11;
                        } catch (Exception e11) {
                            e = e11;
                            i10 = i11;
                            throw i5.l.x(e, jArr, h10.d() + i10);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        throw i5.l.x(e, jArr, h10.d() + i10);
                    }
                }
                e10 = h10.e(jArr, i10);
            }
            return (long[]) e10;
        }

        /* renamed from: O0 */
        public long[] J0(l lVar, i5.g gVar) throws IOException {
            return new long[]{e0(lVar, gVar)};
        }
    }

    @j5.a
    public static final class h extends w<short[]> {
        public static final long W = 1;

        public h() {
            super(short[].class);
        }

        public h(h hVar, s sVar, Boolean bool) {
            super(hVar, sVar, bool);
        }

        public w<?> K0(s sVar, Boolean bool) {
            return new h(this, sVar, bool);
        }

        /* renamed from: L0 */
        public short[] E0(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        /* renamed from: M0 */
        public short[] F0() {
            return new short[0];
        }

        /* renamed from: N0 */
        public short[] f(l lVar, i5.g gVar) throws IOException {
            Object e10;
            short s10;
            if (!lVar.u2()) {
                e10 = I0(lVar, gVar);
            } else {
                c.h i10 = gVar.R().i();
                short[] sArr = (short[]) i10.f();
                int i11 = 0;
                while (true) {
                    try {
                        p D2 = lVar.D2();
                        if (D2 == p.END_ARRAY) {
                            break;
                        }
                        if (D2 == p.VALUE_NULL) {
                            s sVar = this.V;
                            if (sVar != null) {
                                sVar.d(gVar);
                            } else {
                                k0(gVar);
                                s10 = 0;
                            }
                        } else {
                            s10 = f0(lVar, gVar);
                        }
                        if (i11 >= sArr.length) {
                            short[] sArr2 = (short[]) i10.c(sArr, i11);
                            i11 = 0;
                            sArr = sArr2;
                        }
                        int i12 = i11 + 1;
                        try {
                            sArr[i11] = s10;
                            i11 = i12;
                        } catch (Exception e11) {
                            e = e11;
                            i11 = i12;
                            throw i5.l.x(e, sArr, i10.d() + i11);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        throw i5.l.x(e, sArr, i10.d() + i11);
                    }
                }
                e10 = i10.e(sArr, i11);
            }
            return (short[]) e10;
        }

        /* renamed from: O0 */
        public short[] J0(l lVar, i5.g gVar) throws IOException {
            return new short[]{f0(lVar, gVar)};
        }
    }

    public w(Class<T> cls) {
        super((Class<?>) cls);
        this.T = null;
        this.V = null;
    }

    public w(w<?> wVar, s sVar, Boolean bool) {
        super(wVar.O);
        this.T = bool;
        this.V = sVar;
    }

    public static k<?> H0(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return f.X;
        }
        if (cls == Long.TYPE) {
            return g.X;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    public abstract T E0(T t10, T t11);

    public abstract T F0();

    public void G0(i5.g gVar) throws IOException {
        throw o5.d.E(gVar, (y) null, gVar.H(this.O));
    }

    public T I0(l lVar, i5.g gVar) throws IOException {
        if (lVar.q2(p.VALUE_STRING) && gVar.v0(i5.h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && lVar.Y1().length() == 0) {
            return null;
        }
        Boolean bool = this.T;
        return bool == Boolean.TRUE || (bool == null && gVar.v0(i5.h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) ? J0(lVar, gVar) : gVar.i0(this.O, lVar);
    }

    public abstract T J0(l lVar, i5.g gVar) throws IOException;

    public abstract w<?> K0(s sVar, Boolean bool);

    public k<?> a(i5.g gVar, i5.d dVar) throws i5.l {
        Boolean t02 = t0(gVar, dVar, this.O, n.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        k0 q02 = q0(gVar, dVar);
        s g10 = q02 == k0.SKIP ? q.g() : q02 == k0.FAIL ? dVar == null ? r.e(gVar.H(this.O.getComponentType())) : r.b(dVar, dVar.e().d()) : null;
        return (t02 == this.T && g10 == this.V) ? this : K0(g10, t02);
    }

    public T g(l lVar, i5.g gVar, T t10) throws IOException {
        T f10 = f(lVar, gVar);
        return (t10 == null || Array.getLength(t10) == 0) ? f10 : E0(t10, f10);
    }

    public Object h(l lVar, i5.g gVar, u5.f fVar) throws IOException {
        return fVar.d(lVar, gVar);
    }

    public a6.a l() {
        return a6.a.CONSTANT;
    }

    public Object n(i5.g gVar) throws i5.l {
        Object obj = this.U;
        if (obj != null) {
            return obj;
        }
        Object F0 = F0();
        this.U = F0;
        return F0;
    }

    public Boolean u(i5.f fVar) {
        return Boolean.TRUE;
    }
}

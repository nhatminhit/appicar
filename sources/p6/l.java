package p6;

import b6.j0;
import java.util.Arrays;
import w7.p;
import w7.w;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11609a = "VorbisUtil";

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11611b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f11612c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11613d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11614e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f11610a = i10;
            this.f11611b = i11;
            this.f11612c = jArr;
            this.f11613d = i12;
            this.f11614e = z10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f11615a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f11616b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11617c;

        public b(String str, String[] strArr, int i10) {
            this.f11615a = str;
            this.f11616b = strArr;
            this.f11617c = i10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f11618a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11619b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11620c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11621d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f11618a = z10;
            this.f11619b = i10;
            this.f11620c = i11;
            this.f11621d = i12;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f11622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11623b;

        /* renamed from: c  reason: collision with root package name */
        public final long f11624c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11625d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11626e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11627f;

        /* renamed from: g  reason: collision with root package name */
        public final int f11628g;

        /* renamed from: h  reason: collision with root package name */
        public final int f11629h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f11630i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f11631j;

        public d(long j10, int i10, long j11, int i11, int i12, int i13, int i14, int i15, boolean z10, byte[] bArr) {
            this.f11622a = j10;
            this.f11623b = i10;
            this.f11624c = j11;
            this.f11625d = i11;
            this.f11626e = i12;
            this.f11627f = i13;
            this.f11628g = i14;
            this.f11629h = i15;
            this.f11630i = z10;
            this.f11631j = bArr;
        }

        public int a() {
            int i10 = this.f11626e;
            return i10 == 0 ? (this.f11627f + this.f11625d) / 2 : i10;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    public static a c(j jVar) throws j0 {
        if (jVar.e(24) == 5653314) {
            int e10 = jVar.e(16);
            int e11 = jVar.e(24);
            long[] jArr = new long[e11];
            boolean d10 = jVar.d();
            long j10 = 0;
            if (!d10) {
                boolean d11 = jVar.d();
                for (int i10 = 0; i10 < e11; i10++) {
                    if (!d11) {
                        jArr[i10] = (long) (jVar.e(5) + 1);
                    } else if (jVar.d()) {
                        jArr[i10] = (long) (jVar.e(5) + 1);
                    } else {
                        jArr[i10] = 0;
                    }
                }
            } else {
                int e12 = jVar.e(5) + 1;
                int i11 = 0;
                while (i11 < e11) {
                    int e13 = jVar.e(a(e11 - i11));
                    for (int i12 = 0; i12 < e13 && i11 < e11; i12++) {
                        jArr[i11] = (long) e12;
                        i11++;
                    }
                    e12++;
                }
            }
            int e14 = jVar.e(4);
            if (e14 <= 2) {
                if (e14 == 1 || e14 == 2) {
                    jVar.h(32);
                    jVar.h(32);
                    int e15 = jVar.e(4) + 1;
                    jVar.h(1);
                    if (e14 != 1) {
                        j10 = ((long) e11) * ((long) e10);
                    } else if (e10 != 0) {
                        j10 = b((long) e11, (long) e10);
                    }
                    jVar.h((int) (j10 * ((long) e15)));
                }
                return new a(e10, e11, jArr, e14, d10);
            }
            throw new j0("lookup type greater than 2 not decodable: " + e14);
        }
        throw new j0("expected code book to start with [0x56, 0x43, 0x42] at " + jVar.c());
    }

    public static void d(j jVar) throws j0 {
        int e10 = jVar.e(6) + 1;
        for (int i10 = 0; i10 < e10; i10++) {
            int e11 = jVar.e(16);
            if (e11 == 0) {
                jVar.h(8);
                jVar.h(16);
                jVar.h(16);
                jVar.h(6);
                jVar.h(8);
                int e12 = jVar.e(4) + 1;
                for (int i11 = 0; i11 < e12; i11++) {
                    jVar.h(8);
                }
            } else if (e11 == 1) {
                int e13 = jVar.e(5);
                int i12 = -1;
                int[] iArr = new int[e13];
                for (int i13 = 0; i13 < e13; i13++) {
                    int e14 = jVar.e(4);
                    iArr[i13] = e14;
                    if (e14 > i12) {
                        i12 = e14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = jVar.e(3) + 1;
                    int e15 = jVar.e(2);
                    if (e15 > 0) {
                        jVar.h(8);
                    }
                    for (int i16 = 0; i16 < (1 << e15); i16++) {
                        jVar.h(8);
                    }
                }
                jVar.h(2);
                int e16 = jVar.e(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < e13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        jVar.h(e16);
                        i18++;
                    }
                }
            } else {
                throw new j0("floor type greater than 1 not decodable: " + e11);
            }
        }
    }

    public static void e(int i10, j jVar) throws j0 {
        int e10 = jVar.e(6) + 1;
        for (int i11 = 0; i11 < e10; i11++) {
            int e11 = jVar.e(16);
            if (e11 != 0) {
                p.d(f11609a, "mapping type other than 0 not supported: " + e11);
            } else {
                int e12 = jVar.d() ? jVar.e(4) + 1 : 1;
                if (jVar.d()) {
                    int e13 = jVar.e(8) + 1;
                    for (int i12 = 0; i12 < e13; i12++) {
                        int i13 = i10 - 1;
                        jVar.h(a(i13));
                        jVar.h(a(i13));
                    }
                }
                if (jVar.e(2) == 0) {
                    if (e12 > 1) {
                        for (int i14 = 0; i14 < i10; i14++) {
                            jVar.h(4);
                        }
                    }
                    for (int i15 = 0; i15 < e12; i15++) {
                        jVar.h(8);
                        jVar.h(8);
                        jVar.h(8);
                    }
                } else {
                    throw new j0("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    public static c[] f(j jVar) {
        int e10 = jVar.e(6) + 1;
        c[] cVarArr = new c[e10];
        for (int i10 = 0; i10 < e10; i10++) {
            cVarArr[i10] = new c(jVar.d(), jVar.e(16), jVar.e(16), jVar.e(8));
        }
        return cVarArr;
    }

    public static void g(j jVar) throws j0 {
        int e10 = jVar.e(6) + 1;
        int i10 = 0;
        while (i10 < e10) {
            if (jVar.e(16) <= 2) {
                jVar.h(24);
                jVar.h(24);
                jVar.h(24);
                int e11 = jVar.e(6) + 1;
                jVar.h(8);
                int[] iArr = new int[e11];
                for (int i11 = 0; i11 < e11; i11++) {
                    iArr[i11] = ((jVar.d() ? jVar.e(5) : 0) * 8) + jVar.e(3);
                }
                for (int i12 = 0; i12 < e11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            jVar.h(8);
                        }
                    }
                }
                i10++;
            } else {
                throw new j0("residueType greater than 2 is not decodable");
            }
        }
    }

    public static b h(w wVar) throws j0 {
        k(3, wVar, false);
        String A = wVar.A((int) wVar.s());
        int length = 11 + A.length();
        long s10 = wVar.s();
        String[] strArr = new String[((int) s10)];
        int i10 = length + 4;
        for (int i11 = 0; ((long) i11) < s10; i11++) {
            String A2 = wVar.A((int) wVar.s());
            strArr[i11] = A2;
            i10 = i10 + 4 + A2.length();
        }
        if ((wVar.D() & 1) != 0) {
            return new b(A, strArr, i10 + 1);
        }
        throw new j0("framing bit expected to be set");
    }

    public static d i(w wVar) throws j0 {
        w wVar2 = wVar;
        k(1, wVar2, false);
        long s10 = wVar.s();
        int D = wVar.D();
        long s11 = wVar.s();
        int o10 = wVar.o();
        int o11 = wVar.o();
        int o12 = wVar.o();
        int D2 = wVar.D();
        return new d(s10, D, s11, o10, o11, o12, (int) Math.pow(2.0d, (double) (D2 & 15)), (int) Math.pow(2.0d, (double) ((D2 & 240) >> 4)), (wVar.D() & 1) > 0, Arrays.copyOf(wVar2.f14880a, wVar.d()));
    }

    public static c[] j(w wVar, int i10) throws j0 {
        int i11 = 0;
        k(5, wVar, false);
        int D = wVar.D() + 1;
        j jVar = new j(wVar.f14880a);
        jVar.h(wVar.c() * 8);
        for (int i12 = 0; i12 < D; i12++) {
            c(jVar);
        }
        int e10 = jVar.e(6) + 1;
        while (i11 < e10) {
            if (jVar.e(16) == 0) {
                i11++;
            } else {
                throw new j0("placeholder of time domain transforms not zeroed out");
            }
        }
        d(jVar);
        g(jVar);
        e(i10, jVar);
        c[] f10 = f(jVar);
        if (jVar.d()) {
            return f10;
        }
        throw new j0("framing bit after modes not set as expected");
    }

    public static boolean k(int i10, w wVar, boolean z10) throws j0 {
        if (wVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw new j0("too short header: " + wVar.a());
        } else if (wVar.D() != i10) {
            if (z10) {
                return false;
            }
            throw new j0("expected header type " + Integer.toHexString(i10));
        } else if (wVar.D() == 118 && wVar.D() == 111 && wVar.D() == 114 && wVar.D() == 98 && wVar.D() == 105 && wVar.D() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw new j0("expected characters 'vorbis'");
        }
    }
}

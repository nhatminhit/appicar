package w7;

import d6.b0;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14845a = "NalUnitUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14846b = {0, 0, 0, 1};

    /* renamed from: c  reason: collision with root package name */
    public static final int f14847c = 255;

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f14848d = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: e  reason: collision with root package name */
    public static final int f14849e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14850f = 7;

    /* renamed from: g  reason: collision with root package name */
    public static final int f14851g = 39;

    /* renamed from: h  reason: collision with root package name */
    public static final Object f14852h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static int[] f14853i = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f14854a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14855b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f14856c;

        public a(int i10, int i11, boolean z10) {
            this.f14854a = i10;
            this.f14855b = i11;
            this.f14856c = z10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14857a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14858b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14859c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14860d;

        /* renamed from: e  reason: collision with root package name */
        public final int f14861e;

        /* renamed from: f  reason: collision with root package name */
        public final int f14862f;

        /* renamed from: g  reason: collision with root package name */
        public final float f14863g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f14864h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f14865i;

        /* renamed from: j  reason: collision with root package name */
        public final int f14866j;

        /* renamed from: k  reason: collision with root package name */
        public final int f14867k;

        /* renamed from: l  reason: collision with root package name */
        public final int f14868l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f14869m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f14857a = i10;
            this.f14858b = i11;
            this.f14859c = i12;
            this.f14860d = i13;
            this.f14861e = i14;
            this.f14862f = i15;
            this.f14863g = f10;
            this.f14864h = z10;
            this.f14865i = z11;
            this.f14866j = i16;
            this.f14867k = i17;
            this.f14868l = i18;
            this.f14869m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                byte b10 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (b10 == 1 && (byteBuffer.get(i12) & b0.f6265f) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b10 == 0) {
                    i11++;
                }
                if (b10 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0095, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            w7.a.i(r3)
            if (r0 != 0) goto L_0x000f
            return r10
        L_0x000f:
            r3 = 2
            if (r11 == 0) goto L_0x0040
            boolean r4 = r11[r1]
            if (r4 == 0) goto L_0x001c
            a(r11)
            int r9 = r9 + -3
            return r9
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r11[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r8[r9]
            if (r4 != r2) goto L_0x002b
            a(r11)
            int r9 = r9 - r3
            return r9
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r11[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r8[r9]
            if (r4 != 0) goto L_0x0040
            int r4 = r9 + 1
            byte r4 = r8[r4]
            if (r4 != r2) goto L_0x0040
            a(r11)
            int r9 = r9 - r2
            return r9
        L_0x0040:
            int r4 = r10 + -1
            int r9 = r9 + r3
        L_0x0043:
            if (r9 >= r4) goto L_0x0065
            byte r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            int r6 = r9 + -2
            byte r7 = r8[r6]
            if (r7 != 0) goto L_0x0060
            int r7 = r9 + -1
            byte r7 = r8[r7]
            if (r7 != 0) goto L_0x0060
            if (r5 != r2) goto L_0x0060
            if (r11 == 0) goto L_0x005f
            a(r11)
        L_0x005f:
            return r6
        L_0x0060:
            int r9 = r9 + -2
        L_0x0062:
            int r9 = r9 + 3
            goto L_0x0043
        L_0x0065:
            if (r11 == 0) goto L_0x00b9
            if (r0 <= r3) goto L_0x007c
            int r9 = r10 + -3
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
            goto L_0x0095
        L_0x007a:
            r9 = r1
            goto L_0x0096
        L_0x007c:
            if (r0 != r3) goto L_0x008d
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x007a
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
            goto L_0x0095
        L_0x008d:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L_0x007a
            byte r9 = r8[r4]
            if (r9 != r2) goto L_0x007a
        L_0x0095:
            r9 = r2
        L_0x0096:
            r11[r1] = r9
            if (r0 <= r2) goto L_0x00a5
            int r9 = r10 + -2
            byte r9 = r8[r9]
            if (r9 != 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
            goto L_0x00ad
        L_0x00a5:
            boolean r9 = r11[r3]
            if (r9 == 0) goto L_0x00af
            byte r9 = r8[r4]
            if (r9 != 0) goto L_0x00af
        L_0x00ad:
            r9 = r2
            goto L_0x00b0
        L_0x00af:
            r9 = r1
        L_0x00b0:
            r11[r2] = r9
            byte r8 = r8[r4]
            if (r8 != 0) goto L_0x00b7
            r1 = r2
        L_0x00b7:
            r11[r3] = r1
        L_0x00b9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.t.c(byte[], int, int, boolean[]):int");
    }

    public static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & b0.f6265f;
    }

    public static boolean g(String str, byte b10) {
        if (!s.f14813h.equals(str) || (b10 & b0.f6265f) != 6) {
            return s.f14815i.equals(str) && ((b10 & 126) >> 1) == 39;
        }
        return true;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        x xVar = new x(bArr, i10, i11);
        xVar.l(8);
        int h10 = xVar.h();
        int h11 = xVar.h();
        xVar.k();
        return new a(h10, h11, xVar.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static w7.t.b i(byte[] r21, int r22, int r23) {
        /*
            w7.x r0 = new w7.x
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.l(r1)
            int r3 = r0.e(r1)
            int r4 = r0.e(r1)
            int r5 = r0.e(r1)
            int r6 = r0.h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = r9
            r11 = 0
            goto L_0x0086
        L_0x004e:
            int r10 = r0.h()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.d()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.h()
            r0.h()
            r0.k()
            boolean r12 = r0.d()
            if (r12 == 0) goto L_0x0086
            if (r10 == r2) goto L_0x006d
            r12 = r1
            goto L_0x006f
        L_0x006d:
            r12 = 12
        L_0x006f:
            r13 = 0
        L_0x0070:
            if (r13 >= r12) goto L_0x0086
            boolean r14 = r0.d()
            if (r14 == 0) goto L_0x0083
            r14 = 6
            if (r13 >= r14) goto L_0x007e
            r14 = 16
            goto L_0x0080
        L_0x007e:
            r14 = 64
        L_0x0080:
            j(r0, r14)
        L_0x0083:
            int r13 = r13 + 1
            goto L_0x0070
        L_0x0086:
            int r12 = r0.h()
            int r12 = r12 + 4
            int r13 = r0.h()
            if (r13 != 0) goto L_0x0099
            int r14 = r0.h()
            int r14 = r14 + 4
            goto L_0x00ba
        L_0x0099:
            if (r13 != r9) goto L_0x00b9
            boolean r14 = r0.d()
            r0.g()
            r0.g()
            int r15 = r0.h()
            long r1 = (long) r15
            r15 = 0
        L_0x00ab:
            long r7 = (long) r15
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b6
            r0.h()
            int r15 = r15 + 1
            goto L_0x00ab
        L_0x00b6:
            r15 = r14
            r14 = 0
            goto L_0x00bb
        L_0x00b9:
            r14 = 0
        L_0x00ba:
            r15 = 0
        L_0x00bb:
            r0.h()
            r0.k()
            int r1 = r0.h()
            int r1 = r1 + r9
            int r2 = r0.h()
            int r2 = r2 + r9
            boolean r16 = r0.d()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d7
            r0.k()
        L_0x00d7:
            r0.k()
            r2 = 16
            int r1 = r1 * r2
            int r7 = r7 * r2
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x0117
            int r2 = r0.h()
            int r8 = r0.h()
            int r17 = r0.h()
            int r18 = r0.h()
            if (r10 != 0) goto L_0x00f9
            int r10 = 2 - r16
            goto L_0x010e
        L_0x00f9:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0102
            r9 = 1
            r20 = 1
            goto L_0x0105
        L_0x0102:
            r20 = r19
            r9 = 1
        L_0x0105:
            if (r10 != r9) goto L_0x0109
            r9 = r19
        L_0x0109:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x010e:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x0117:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x0162
            boolean r2 = r0.d()
            if (r2 == 0) goto L_0x0162
            r2 = 8
            int r2 = r0.e(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0143
            r9 = 16
            int r2 = r0.e(r9)
            int r0 = r0.e(r9)
            if (r2 == 0) goto L_0x0162
            if (r0 == 0) goto L_0x0162
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x0162
        L_0x0143:
            float[] r0 = f14848d
            int r9 = r0.length
            if (r2 >= r9) goto L_0x014c
            r0 = r0[r2]
            r9 = r0
            goto L_0x0163
        L_0x014c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            w7.p.l(r2, r0)
        L_0x0162:
            r9 = r1
        L_0x0163:
            w7.t$b r0 = new w7.t$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.t.i(byte[], int, int):w7.t$b");
    }

    public static void j(x xVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((xVar.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    public static int k(byte[] bArr, int i10) {
        int i11;
        synchronized (f14852h) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f14853i;
                        if (iArr.length <= i13) {
                            f14853i = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f14853i[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f14853i[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}

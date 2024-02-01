package c5;

import h5.c;
import kh.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4848a = a.e();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4849b = a.d();

    /* renamed from: c  reason: collision with root package name */
    public static final int f4850c = 55296;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4851d = 56319;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4852e = 56320;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4853f = 57343;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4854g = 120;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4855h = 200;

    /* renamed from: i  reason: collision with root package name */
    public static final g f4856i = new g();

    public static int d(int i10, int i11) {
        if (i11 >= 56320 && i11 <= 57343) {
            return ((i10 - 55296) << 10) + 65536 + (i11 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    public static void e(int i10) {
        throw new IllegalArgumentException(o.g(i10));
    }

    public static g i() {
        return f4856i;
    }

    public final int a(int i10, int i11, c cVar, int i12) {
        byte b10;
        cVar.A(i12);
        cVar.f(92);
        if (i11 < 0) {
            cVar.f(117);
            if (i10 > 255) {
                int i13 = i10 >> 8;
                byte[] bArr = f4849b;
                cVar.f(bArr[i13 >> 4]);
                cVar.f(bArr[i13 & 15]);
                i10 &= 255;
            } else {
                cVar.f(48);
                cVar.f(48);
            }
            byte[] bArr2 = f4849b;
            cVar.f(bArr2[i10 >> 4]);
            b10 = bArr2[i10 & 15];
        } else {
            b10 = (byte) i11;
        }
        cVar.f(b10);
        return cVar.q();
    }

    public final int b(int i10, char[] cArr) {
        cArr[1] = (char) i10;
        return 2;
    }

    public final int c(int i10, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f4848a;
        cArr[4] = cArr2[i10 >> 4];
        cArr[5] = cArr2[i10 & 15];
        return 6;
    }

    public final char[] f() {
        char[] cArr = new char[6];
        cArr[0] = j.f20323c;
        cArr[2] = '0';
        cArr[3] = '0';
        return cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] g(java.lang.CharSequence r12) {
        /*
            r11 = this;
            int r0 = r12.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
        L_0x000c:
            if (r5 >= r0) goto L_0x00f5
            int r7 = r5 + 1
            char r5 = r12.charAt(r5)
        L_0x0014:
            r8 = 127(0x7f, float:1.78E-43)
            if (r5 > r8) goto L_0x003d
            if (r6 < r1) goto L_0x0029
            if (r4 != 0) goto L_0x0020
            h5.c r4 = h5.c.m(r2, r6)
        L_0x0020:
            byte[] r1 = r4.l()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x0029:
            int r8 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r7 < r0) goto L_0x0033
            r6 = r8
            goto L_0x00f5
        L_0x0033:
            int r5 = r7 + 1
            char r6 = r12.charAt(r7)
            r7 = r5
            r5 = r6
            r6 = r8
            goto L_0x0014
        L_0x003d:
            if (r4 != 0) goto L_0x0043
            h5.c r4 = h5.c.m(r2, r6)
        L_0x0043:
            if (r6 < r1) goto L_0x004b
            byte[] r2 = r4.l()
            int r1 = r2.length
            r6 = r3
        L_0x004b:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 >= r8) goto L_0x005c
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
        L_0x0058:
            r6 = r5
            r5 = r7
            goto L_0x00de
        L_0x005c:
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r8) goto L_0x00bc
            r8 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r8) goto L_0x0067
            goto L_0x00bc
        L_0x0067:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r5 <= r8) goto L_0x006f
            e(r5)
        L_0x006f:
            if (r7 < r0) goto L_0x0074
            e(r5)
        L_0x0074:
            int r8 = r7 + 1
            char r7 = r12.charAt(r7)
            int r5 = d(r5, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 <= r7) goto L_0x0086
            e(r5)
        L_0x0086:
            int r7 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r7 < r1) goto L_0x0097
            byte[] r2 = r4.l()
            int r1 = r2.length
            r7 = r3
        L_0x0097:
            int r6 = r7 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            if (r6 < r1) goto L_0x00ad
            byte[] r1 = r4.l()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00ad:
            int r7 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r6 = r5
            r5 = r8
            r8 = r7
            goto L_0x00de
        L_0x00bc:
            int r8 = r6 + 1
            int r9 = r5 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r8 < r1) goto L_0x00d0
            byte[] r1 = r4.l()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00d0:
            int r6 = r8 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r8] = r9
            r8 = r6
            goto L_0x0058
        L_0x00de:
            if (r8 < r1) goto L_0x00e9
            byte[] r1 = r4.l()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00e9:
            int r7 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r7
            goto L_0x000c
        L_0x00f5:
            if (r4 != 0) goto L_0x00fc
            byte[] r12 = java.util.Arrays.copyOfRange(r2, r3, r6)
            return r12
        L_0x00fc:
            byte[] r12 = r4.k(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.g(java.lang.CharSequence):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] h(java.lang.String r12) {
        /*
            r11 = this;
            int r0 = r12.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
        L_0x000c:
            if (r5 >= r0) goto L_0x00f5
            int r7 = r5 + 1
            char r5 = r12.charAt(r5)
        L_0x0014:
            r8 = 127(0x7f, float:1.78E-43)
            if (r5 > r8) goto L_0x003d
            if (r6 < r1) goto L_0x0029
            if (r4 != 0) goto L_0x0020
            h5.c r4 = h5.c.m(r2, r6)
        L_0x0020:
            byte[] r1 = r4.l()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x0029:
            int r8 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r7 < r0) goto L_0x0033
            r6 = r8
            goto L_0x00f5
        L_0x0033:
            int r5 = r7 + 1
            char r6 = r12.charAt(r7)
            r7 = r5
            r5 = r6
            r6 = r8
            goto L_0x0014
        L_0x003d:
            if (r4 != 0) goto L_0x0043
            h5.c r4 = h5.c.m(r2, r6)
        L_0x0043:
            if (r6 < r1) goto L_0x004b
            byte[] r2 = r4.l()
            int r1 = r2.length
            r6 = r3
        L_0x004b:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 >= r8) goto L_0x005c
            int r8 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
        L_0x0058:
            r6 = r5
            r5 = r7
            goto L_0x00de
        L_0x005c:
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r8) goto L_0x00bc
            r8 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r8) goto L_0x0067
            goto L_0x00bc
        L_0x0067:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r5 <= r8) goto L_0x006f
            e(r5)
        L_0x006f:
            if (r7 < r0) goto L_0x0074
            e(r5)
        L_0x0074:
            int r8 = r7 + 1
            char r7 = r12.charAt(r7)
            int r5 = d(r5, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 <= r7) goto L_0x0086
            e(r5)
        L_0x0086:
            int r7 = r6 + 1
            int r9 = r5 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r7 < r1) goto L_0x0097
            byte[] r2 = r4.l()
            int r1 = r2.length
            r7 = r3
        L_0x0097:
            int r6 = r7 + 1
            int r9 = r5 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            if (r6 < r1) goto L_0x00ad
            byte[] r1 = r4.l()
            int r2 = r1.length
            r6 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00ad:
            int r7 = r6 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            r6 = r5
            r5 = r8
            r8 = r7
            goto L_0x00de
        L_0x00bc:
            int r8 = r6 + 1
            int r9 = r5 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            if (r8 < r1) goto L_0x00d0
            byte[] r1 = r4.l()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00d0:
            int r6 = r8 + 1
            int r9 = r5 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r2[r8] = r9
            r8 = r6
            goto L_0x0058
        L_0x00de:
            if (r8 < r1) goto L_0x00e9
            byte[] r1 = r4.l()
            int r2 = r1.length
            r8 = r3
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00e9:
            int r7 = r8 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r8] = r6
            r6 = r7
            goto L_0x000c
        L_0x00f5:
            if (r4 != 0) goto L_0x00fc
            byte[] r12 = java.util.Arrays.copyOfRange(r2, r3, r6)
            return r12
        L_0x00fc:
            byte[] r12 = r4.k(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.h(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r5 = c(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r5 = b(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r10.append(r4, 0, r5);
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r4 = f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r6 = r5 + 1;
        r5 = r9.charAt(r5);
        r7 = r0[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r7 >= 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(java.lang.CharSequence r9, java.lang.StringBuilder r10) {
        /*
            r8 = this;
            int[] r0 = c5.a.f()
            int r1 = r0.length
            int r2 = r9.length()
            r3 = 0
            r4 = 0
            r5 = r3
        L_0x000c:
            if (r5 >= r2) goto L_0x003d
        L_0x000e:
            char r6 = r9.charAt(r5)
            if (r6 >= r1) goto L_0x0036
            r7 = r0[r6]
            if (r7 == 0) goto L_0x0036
            if (r4 != 0) goto L_0x001e
            char[] r4 = r8.f()
        L_0x001e:
            int r6 = r5 + 1
            char r5 = r9.charAt(r5)
            r7 = r0[r5]
            if (r7 >= 0) goto L_0x002d
            int r5 = r8.c(r5, r4)
            goto L_0x0031
        L_0x002d:
            int r5 = r8.b(r7, r4)
        L_0x0031:
            r10.append(r4, r3, r5)
            r5 = r6
            goto L_0x000c
        L_0x0036:
            r10.append(r6)
            int r5 = r5 + 1
            if (r5 < r2) goto L_0x000e
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.j(java.lang.CharSequence, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r6 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r6 = f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r1[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r10 >= 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r7 = c(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r7 = b(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r10 <= r0.length) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r10 = r0.length - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r10 <= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r4 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r4 = h5.n.t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r0 = r4.s();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r0, 0, r7);
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r7);
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        r7 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] k(java.lang.CharSequence r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto L_0x000b
            java.lang.String r13 = (java.lang.String) r13
            char[] r13 = r12.l(r13)
            return r13
        L_0x000b:
            r0 = 120(0x78, float:1.68E-43)
            char[] r0 = new char[r0]
            int[] r1 = c5.a.f()
            int r2 = r1.length
            int r3 = r13.length()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L_0x001d:
            if (r7 >= r3) goto L_0x007b
        L_0x001f:
            char r9 = r13.charAt(r7)
            if (r9 >= r2) goto L_0x0064
            r10 = r1[r9]
            if (r10 == 0) goto L_0x0064
            if (r6 != 0) goto L_0x002f
            char[] r6 = r12.f()
        L_0x002f:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r1[r7]
            if (r10 >= 0) goto L_0x003e
            int r7 = r12.c(r7, r6)
            goto L_0x0042
        L_0x003e:
            int r7 = r12.b(r10, r6)
        L_0x0042:
            int r10 = r8 + r7
            int r11 = r0.length
            if (r10 <= r11) goto L_0x005e
            int r10 = r0.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L_0x004e
            java.lang.System.arraycopy(r6, r5, r0, r8, r10)
        L_0x004e:
            if (r4 != 0) goto L_0x0054
            h5.n r4 = h5.n.t(r0)
        L_0x0054:
            char[] r0 = r4.s()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r0, r5, r7)
            r8 = r7
            goto L_0x0062
        L_0x005e:
            java.lang.System.arraycopy(r6, r5, r0, r8, r7)
            r8 = r10
        L_0x0062:
            r7 = r9
            goto L_0x001d
        L_0x0064:
            int r10 = r0.length
            if (r8 < r10) goto L_0x0072
            if (r4 != 0) goto L_0x006d
            h5.n r4 = h5.n.t(r0)
        L_0x006d:
            char[] r0 = r4.s()
            r8 = r5
        L_0x0072:
            int r10 = r8 + 1
            r0[r8] = r9
            int r7 = r7 + 1
            r8 = r10
            if (r7 < r3) goto L_0x001f
        L_0x007b:
            if (r4 != 0) goto L_0x0082
            char[] r13 = java.util.Arrays.copyOfRange(r0, r5, r8)
            return r13
        L_0x0082:
            r4.J(r8)
            char[] r13 = r4.g()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.k(java.lang.CharSequence):char[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r7 = c(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r7 = b(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r10 <= r0.length) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r10 = r0.length - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r10 <= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r4 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r4 = h5.n.t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = r4.s();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r0, 0, r7);
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r7);
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r6 = f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r1[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r10 >= 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] l(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 120(0x78, float:1.68E-43)
            char[] r0 = new char[r0]
            int[] r1 = c5.a.f()
            int r2 = r1.length
            int r3 = r13.length()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L_0x0012:
            if (r7 >= r3) goto L_0x0070
        L_0x0014:
            char r9 = r13.charAt(r7)
            if (r9 >= r2) goto L_0x0059
            r10 = r1[r9]
            if (r10 == 0) goto L_0x0059
            if (r6 != 0) goto L_0x0024
            char[] r6 = r12.f()
        L_0x0024:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r1[r7]
            if (r10 >= 0) goto L_0x0033
            int r7 = r12.c(r7, r6)
            goto L_0x0037
        L_0x0033:
            int r7 = r12.b(r10, r6)
        L_0x0037:
            int r10 = r8 + r7
            int r11 = r0.length
            if (r10 <= r11) goto L_0x0053
            int r10 = r0.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L_0x0043
            java.lang.System.arraycopy(r6, r5, r0, r8, r10)
        L_0x0043:
            if (r4 != 0) goto L_0x0049
            h5.n r4 = h5.n.t(r0)
        L_0x0049:
            char[] r0 = r4.s()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r0, r5, r7)
            r8 = r7
            goto L_0x0057
        L_0x0053:
            java.lang.System.arraycopy(r6, r5, r0, r8, r7)
            r8 = r10
        L_0x0057:
            r7 = r9
            goto L_0x0012
        L_0x0059:
            int r10 = r0.length
            if (r8 < r10) goto L_0x0067
            if (r4 != 0) goto L_0x0062
            h5.n r4 = h5.n.t(r0)
        L_0x0062:
            char[] r0 = r4.s()
            r8 = r5
        L_0x0067:
            int r10 = r8 + 1
            r0[r8] = r9
            int r7 = r7 + 1
            r8 = r10
            if (r7 < r3) goto L_0x0014
        L_0x0070:
            if (r4 != 0) goto L_0x0077
            char[] r13 = java.util.Arrays.copyOfRange(r0, r5, r8)
            return r13
        L_0x0077:
            r4.J(r8)
            char[] r13 = r4.g()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.l(java.lang.String):char[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] m(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        L_0x000c:
            if (r4 >= r0) goto L_0x0104
            int[] r6 = c5.a.f()
        L_0x0012:
            char r7 = r11.charAt(r4)
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 > r8) goto L_0x0039
            r9 = r6[r7]
            if (r9 == 0) goto L_0x001f
            goto L_0x0039
        L_0x001f:
            int r8 = r1.length
            if (r5 < r8) goto L_0x002d
            if (r3 != 0) goto L_0x0028
            h5.c r3 = h5.c.m(r1, r5)
        L_0x0028:
            byte[] r1 = r3.l()
            r5 = r2
        L_0x002d:
            int r8 = r5 + 1
            byte r7 = (byte) r7
            r1[r5] = r7
            int r4 = r4 + 1
            r5 = r8
            if (r4 < r0) goto L_0x0012
            goto L_0x0104
        L_0x0039:
            if (r3 != 0) goto L_0x003f
            h5.c r3 = h5.c.m(r1, r5)
        L_0x003f:
            int r7 = r1.length
            if (r5 < r7) goto L_0x0047
            byte[] r1 = r3.l()
            r5 = r2
        L_0x0047:
            int r7 = r4 + 1
            char r4 = r11.charAt(r4)
            if (r4 > r8) goto L_0x005b
            r1 = r6[r4]
            int r5 = r10.a(r4, r1, r3, r5)
            byte[] r1 = r3.o()
            r4 = r7
            goto L_0x000c
        L_0x005b:
            r6 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r6) goto L_0x0070
            int r6 = r5 + 1
            int r8 = r4 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r4
            r4 = r7
            goto L_0x00f4
        L_0x0070:
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x00d1
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r6) goto L_0x007b
            goto L_0x00d1
        L_0x007b:
            r6 = 56319(0xdbff, float:7.892E-41)
            if (r4 <= r6) goto L_0x0083
            e(r4)
        L_0x0083:
            if (r7 < r0) goto L_0x0088
            e(r4)
        L_0x0088:
            int r6 = r7 + 1
            char r7 = r11.charAt(r7)
            int r4 = d(r4, r7)
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 <= r7) goto L_0x009a
            e(r4)
        L_0x009a:
            int r7 = r5 + 1
            int r8 = r4 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            int r5 = r1.length
            if (r7 < r5) goto L_0x00ab
            byte[] r1 = r3.l()
            r7 = r2
        L_0x00ab:
            int r5 = r7 + 1
            int r8 = r4 >> 12
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            int r7 = r1.length
            if (r5 < r7) goto L_0x00be
            byte[] r1 = r3.l()
            r5 = r2
        L_0x00be:
            int r7 = r5 + 1
            int r8 = r4 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5 = r4
            r4 = r6
            r6 = r7
            goto L_0x00f4
        L_0x00d1:
            int r6 = r5 + 1
            int r8 = r4 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8
            r1[r5] = r8
            int r5 = r1.length
            if (r6 < r5) goto L_0x00e2
            byte[] r1 = r3.l()
            r6 = r2
        L_0x00e2:
            int r5 = r6 + 1
            int r8 = r4 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            byte r8 = (byte) r8
            r1[r6] = r8
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r6 = r5
            goto L_0x006c
        L_0x00f4:
            int r7 = r1.length
            if (r6 < r7) goto L_0x00fc
            byte[] r1 = r3.l()
            r6 = r2
        L_0x00fc:
            int r7 = r6 + 1
            byte r5 = (byte) r5
            r1[r6] = r5
            r5 = r7
            goto L_0x000c
        L_0x0104:
            if (r3 != 0) goto L_0x010b
            byte[] r11 = java.util.Arrays.copyOfRange(r1, r2, r5)
            return r11
        L_0x010b:
            byte[] r11 = r3.k(r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.g.m(java.lang.String):byte[]");
    }
}

package xb;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24492a = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final int f24493b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final int f24494c = 40;

    /* renamed from: d  reason: collision with root package name */
    public static final int f24495d = 10;

    public static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    public static int b(b bVar, boolean z10) {
        int d10 = z10 ? bVar.d() : bVar.e();
        int e10 = z10 ? bVar.e() : bVar.d();
        byte[][] c10 = bVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < e10; i13++) {
                byte b11 = z10 ? c10[i11][i13] : c10[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += (i12 - 5) + 3;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 += (i12 - 5) + 3;
            }
        }
        return i10;
    }

    public static int c(b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10 - 1; i11++) {
            byte[] bArr = c10[i11];
            int i12 = 0;
            while (i12 < e10 - 1) {
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = c10[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    public static int d(b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            for (int i12 = 0; i12 < e10; i12++) {
                byte[] bArr = c10[i11];
                int i13 = i12 + 6;
                if (i13 < e10 && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (g(bArr, i12 - 4, i12) || g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < d10 && c10[i11][i12] == 1 && c10[i11 + 1][i12] == 0 && c10[i11 + 2][i12] == 1 && c10[i11 + 3][i12] == 1 && c10[i11 + 4][i12] == 1 && c10[i11 + 5][i12] == 0 && c10[i14][i12] == 1 && (h(c10, i12, i11 - 4, i11) || h(c10, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    public static int e(b bVar) {
        byte[][] c10 = bVar.c();
        int e10 = bVar.e();
        int d10 = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            byte[] bArr = c10[i11];
            for (int i12 = 0; i12 < e10; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int d11 = bVar.d() * bVar.e();
        return ((Math.abs((i10 << 1) - d11) * 10) / d11) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r1 = r1 & 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0039;
                case 2: goto L_0x0035;
                case 3: goto L_0x0031;
                case 4: goto L_0x002c;
                case 5: goto L_0x0025;
                case 6: goto L_0x001d;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0023
        L_0x001d:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0023:
            r1 = r1 & r0
            goto L_0x003b
        L_0x0025:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003b
        L_0x002c:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x0038
        L_0x0031:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003b
        L_0x0035:
            int r1 = r2 % 3
            goto L_0x003b
        L_0x0038:
            int r3 = r3 + r2
        L_0x0039:
            r1 = r3 & 1
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            return r0
        L_0x003e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.d.f(int, int, int):boolean");
    }

    public static boolean g(byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, bArr.length);
        for (int max = Math.max(i10, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i10, int i11, int i12) {
        int min = Math.min(i12, bArr.length);
        for (int max = Math.max(i11, 0); max < min; max++) {
            if (bArr[max][i10] == 1) {
                return false;
            }
        }
        return true;
    }
}

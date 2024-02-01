package ya;

import qa.b;
import qa.m;

public final class j extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final int f24675i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f24676j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static final int f24677k = 7;

    /* renamed from: l  reason: collision with root package name */
    public static final int f24678l = 40;

    /* renamed from: m  reason: collision with root package name */
    public static final int f24679m = 24;

    /* renamed from: h  reason: collision with root package name */
    public b f24680h;

    public j(qa.j jVar) {
        super(jVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[][] i(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = 8
            int r3 = r21 + -8
            int r4 = r20 + -8
            r5 = 2
            int[] r6 = new int[r5]
            r7 = 1
            r6[r7] = r0
            r8 = 0
            r6[r8] = r1
            java.lang.Class r9 = java.lang.Integer.TYPE
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r9 = r8
        L_0x001c:
            if (r9 >= r1) goto L_0x00b1
            int r10 = r9 << 3
            if (r10 <= r3) goto L_0x0023
            r10 = r3
        L_0x0023:
            r11 = r8
        L_0x0024:
            if (r11 >= r0) goto L_0x00a8
            int r12 = r11 << 3
            if (r12 <= r4) goto L_0x002b
            r12 = r4
        L_0x002b:
            int r13 = r10 * r20
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = r8
            r15 = r14
            r16 = r15
            r8 = r12
        L_0x0035:
            if (r14 >= r2) goto L_0x0073
            r7 = r16
            r5 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x004d
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            if (r2 >= r8) goto L_0x0045
            r8 = r2
        L_0x0045:
            if (r2 <= r7) goto L_0x0048
            r7 = r2
        L_0x0048:
            int r5 = r5 + 1
            r2 = 8
            goto L_0x003a
        L_0x004d:
            int r2 = r7 - r8
            r5 = 24
            if (r2 <= r5) goto L_0x0069
        L_0x0053:
            int r14 = r14 + 1
            int r13 = r13 + r20
            r2 = 8
            if (r14 >= r2) goto L_0x0069
            r5 = 0
        L_0x005c:
            if (r5 >= r2) goto L_0x0053
            int r16 = r13 + r5
            byte r2 = r17[r16]
            r2 = r2 & r12
            int r15 = r15 + r2
            int r5 = r5 + 1
            r2 = 8
            goto L_0x005c
        L_0x0069:
            r2 = 1
            int r14 = r14 + r2
            int r13 = r13 + r20
            r16 = r7
            r7 = r2
            r2 = 8
            goto L_0x0035
        L_0x0073:
            r2 = r7
            int r5 = r15 >> 6
            int r7 = r16 - r8
            r12 = 24
            if (r7 > r12) goto L_0x009a
            int r5 = r8 / 2
            if (r9 <= 0) goto L_0x009a
            if (r11 <= 0) goto L_0x009a
            int r7 = r9 + -1
            r7 = r6[r7]
            r12 = r7[r11]
            r13 = r6[r9]
            int r14 = r11 + -1
            r13 = r13[r14]
            r15 = 2
            int r13 = r13 * r15
            int r12 = r12 + r13
            r7 = r7[r14]
            int r12 = r12 + r7
            int r7 = r12 / 4
            if (r8 >= r7) goto L_0x009b
            r5 = r7
            goto L_0x009b
        L_0x009a:
            r15 = 2
        L_0x009b:
            r7 = r6[r9]
            r7[r11] = r5
            int r11 = r11 + 1
            r7 = r2
            r5 = r15
            r2 = 8
            r8 = 0
            goto L_0x0024
        L_0x00a8:
            r15 = r5
            r2 = r7
            int r9 = r9 + 1
            r2 = 8
            r8 = 0
            goto L_0x001c
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.j.i(byte[], int, int, int, int):int[][]");
    }

    public static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i10;
        int i15 = i11;
        int i16 = i13 - 8;
        int i17 = i12 - 8;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i18 << 3;
            int i20 = i19 > i16 ? i16 : i19;
            int k10 = k(i18, i15 - 3);
            for (int i21 = 0; i21 < i14; i21++) {
                int i22 = i21 << 3;
                int i23 = i22 > i17 ? i17 : i22;
                int k11 = k(i21, i14 - 3);
                int i24 = 0;
                for (int i25 = -2; i25 <= 2; i25++) {
                    int[] iArr2 = iArr[k10 + i25];
                    i24 += iArr2[k11 - 2] + iArr2[k11 - 1] + iArr2[k11] + iArr2[k11 + 1] + iArr2[2 + k11];
                }
                l(bArr, i23, i20, i24 / 25, i12, bVar);
            }
        }
    }

    public static int k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    public static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.w(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    public b a(qa.j jVar) {
        return new j(jVar);
    }

    public b b() throws m {
        b bVar;
        b bVar2 = this.f24680h;
        if (bVar2 != null) {
            return bVar2;
        }
        qa.j e10 = e();
        int e11 = e10.e();
        int b10 = e10.b();
        if (e11 < 40 || b10 < 40) {
            bVar = super.b();
        } else {
            byte[] c10 = e10.c();
            int i10 = e11 >> 3;
            if ((e11 & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = b10 >> 3;
            if ((b10 & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] i14 = i(c10, i11, i13, e11, b10);
            bVar = new b(e11, b10);
            j(c10, i11, i13, e11, b10, i14, bVar);
        }
        this.f24680h = bVar;
        return this.f24680h;
    }
}

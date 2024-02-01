package lb;

import qa.m;

public final class a extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final float f20403d = 2.0f;

    /* renamed from: e  reason: collision with root package name */
    public static final float f20404e = 1.5f;

    /* renamed from: f  reason: collision with root package name */
    public static final String f20405f = "0123456789-$:/.+ABCD";

    /* renamed from: g  reason: collision with root package name */
    public static final char[] f20406g = f20405f.toCharArray();

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f20407h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: i  reason: collision with root package name */
    public static final int f20408i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f20409j = {'A', 'B', 'C', 'D'};

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f20410a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    public int[] f20411b = new int[80];

    /* renamed from: c  reason: collision with root package name */
    public int f20412c = 0;

    public static boolean h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qa.r c(int r11, ya.a r12, java.util.Map<qa.e, ?> r13) throws qa.m {
        /*
            r10 = this;
            int[] r0 = r10.f20411b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.k(r12)
            int r12 = r10.j()
            java.lang.StringBuilder r0 = r10.f20410a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.l(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f20410a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f20410a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f20409j
            char[] r6 = f20406g
            char r2 = r6[r2]
            boolean r2 = h(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f20412c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f20411b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = r1
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f20411b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f20412c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x005d:
            r10.m(r12)
            r0 = r1
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f20410a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f20410a
            char[] r3 = f20406g
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f20410a
            char r0 = r0.charAt(r1)
            char[] r2 = f20409j
            boolean r0 = h(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f20410a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = h(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f20410a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            qa.e r0 = qa.e.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f20410a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f20410a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = r1
            r0 = r13
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f20411b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f20411b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            qa.r r0 = new qa.r
            java.lang.StringBuilder r2 = r10.f20410a
            java.lang.String r2 = r2.toString()
            r3 = 0
            qa.t[] r4 = new qa.t[r6]
            qa.t r6 = new qa.t
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            qa.t r13 = new qa.t
            r13.<init>(r12, r11)
            r4[r5] = r13
            qa.a r11 = qa.a.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f2:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x00f7:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x00fc:
            qa.m r11 = qa.m.a()
            throw r11
        L_0x0101:
            qa.m r11 = qa.m.a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.a.c(int, ya.a, java.util.Map):qa.r");
    }

    public final void i(int i10) {
        int[] iArr = this.f20411b;
        int i11 = this.f20412c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f20412c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[(i12 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f20411b = iArr2;
        }
    }

    public final int j() throws m {
        for (int i10 = 1; i10 < this.f20412c; i10 += 2) {
            int l10 = l(i10);
            if (l10 != -1 && h(f20409j, f20406g[l10])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f20411b[i12];
                }
                if (i10 == 1 || this.f20411b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw m.a();
    }

    public final void k(ya.a aVar) throws m {
        int i10 = 0;
        this.f20412c = 0;
        int r10 = aVar.r(0);
        int s10 = aVar.s();
        if (r10 < s10) {
            boolean z10 = true;
            while (r10 < s10) {
                if (aVar.n(r10) != z10) {
                    i10++;
                } else {
                    i(i10);
                    z10 = !z10;
                    i10 = 1;
                }
                r10++;
            }
            i(i10);
            return;
        }
        throw m.a();
    }

    public final int l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f20412c) {
            return -1;
        }
        int[] iArr = this.f20411b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f20407h;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    public final void m(int i10) throws m {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f20410a.length() - 1;
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (true) {
            int i14 = f20407h[this.f20410a.charAt(i13)];
            for (int i15 = 6; i15 >= 0; i15--) {
                int i16 = (i15 & 1) + ((i14 & 1) << 1);
                iArr[i16] = iArr[i16] + this.f20411b[i12 + i15];
                iArr2[i16] = iArr2[i16] + 1;
                i14 >>= 1;
            }
            if (i13 >= length) {
                break;
            }
            i12 += 8;
            i13++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i17 = 0; i17 < 2; i17++) {
            fArr2[i17] = 0.0f;
            int i18 = i17 + 2;
            float f10 = ((float) iArr[i17]) / ((float) iArr2[i17]);
            int i19 = iArr[i18];
            int i20 = iArr2[i18];
            float f11 = (f10 + (((float) i19) / ((float) i20))) / 2.0f;
            fArr2[i18] = f11;
            fArr[i17] = f11;
            fArr[i18] = ((((float) i19) * 2.0f) + 1.5f) / ((float) i20);
        }
        loop3:
        while (true) {
            int i21 = f20407h[this.f20410a.charAt(i11)];
            int i22 = 6;
            while (i22 >= 0) {
                int i23 = (i22 & 1) + ((i21 & 1) << 1);
                float f12 = (float) this.f20411b[i10 + i22];
                if (f12 >= fArr2[i23] && f12 <= fArr[i23]) {
                    i21 >>= 1;
                    i22--;
                }
            }
            if (i11 < length) {
                i10 += 8;
                i11++;
            } else {
                return;
            }
        }
        throw m.a();
    }
}

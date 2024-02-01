package f5;

import java.util.Arrays;

public final class g extends f {

    /* renamed from: c  reason: collision with root package name */
    public final int f7402c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7403d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7404e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7405f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7406g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f7407h;

    public g(String str, int i10, int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        super(str, i10);
        this.f7402c = i11;
        this.f7403d = i12;
        this.f7404e = i13;
        this.f7405f = i14;
        this.f7407h = iArr;
        this.f7406g = i15;
    }

    public static g g(String str, int i10, int[] iArr, int i11) {
        if (i11 >= 4) {
            return new g(str, i10, iArr[0], iArr[1], iArr[2], iArr[3], i11 + -4 > 0 ? Arrays.copyOfRange(iArr, 4, i11) : null, i11);
        }
        throw new IllegalArgumentException();
    }

    public boolean a(int i10) {
        return false;
    }

    public boolean b(int i10, int i11) {
        return false;
    }

    public boolean c(int i10, int i11, int i12) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r7[6] == r6.f7407h[2]) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r7[5] == r6.f7407h[1]) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r7[4] == r6.f7407h[0]) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int[] r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.f7406g
            r1 = 0
            if (r8 == r0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = r7[r1]
            int r2 = r6.f7402c
            if (r0 == r2) goto L_0x000d
            return r1
        L_0x000d:
            r0 = 1
            r2 = r7[r0]
            int r3 = r6.f7403d
            if (r2 == r3) goto L_0x0015
            return r1
        L_0x0015:
            r2 = 2
            r3 = r7[r2]
            int r4 = r6.f7404e
            if (r3 == r4) goto L_0x001d
            return r1
        L_0x001d:
            r3 = 3
            r4 = r7[r3]
            int r5 = r6.f7405f
            if (r4 == r5) goto L_0x0025
            return r1
        L_0x0025:
            switch(r8) {
                case 4: goto L_0x0055;
                case 5: goto L_0x004b;
                case 6: goto L_0x0041;
                case 7: goto L_0x0037;
                case 8: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r7 = r6.f(r7)
            return r7
        L_0x002d:
            r8 = 7
            r8 = r7[r8]
            int[] r4 = r6.f7407h
            r3 = r4[r3]
            if (r8 == r3) goto L_0x0037
            return r1
        L_0x0037:
            r8 = 6
            r8 = r7[r8]
            int[] r3 = r6.f7407h
            r2 = r3[r2]
            if (r8 == r2) goto L_0x0041
            return r1
        L_0x0041:
            r8 = 5
            r8 = r7[r8]
            int[] r2 = r6.f7407h
            r2 = r2[r0]
            if (r8 == r2) goto L_0x004b
            return r1
        L_0x004b:
            r8 = 4
            r7 = r7[r8]
            int[] r8 = r6.f7407h
            r8 = r8[r1]
            if (r7 == r8) goto L_0x0055
            return r1
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.g.d(int[], int):boolean");
    }

    public final boolean f(int[] iArr) {
        int i10 = this.f7406g - 4;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11 + 4] != this.f7407h[i11]) {
                return false;
            }
        }
        return true;
    }
}

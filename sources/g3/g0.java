package g3;

import android.graphics.Rect;
import android.view.ViewGroup;

public class g0 extends t1 {

    /* renamed from: d  reason: collision with root package name */
    public float f7701d = 3.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f7702e = 80;

    public long c(ViewGroup viewGroup, j0 j0Var, r0 r0Var, r0 r0Var2) {
        int i10;
        int i11;
        int i12;
        r0 r0Var3 = r0Var;
        if (r0Var3 == null && r0Var2 == null) {
            return 0;
        }
        Rect N = j0Var.N();
        if (r0Var2 == null || e(r0Var3) == 0) {
            i10 = -1;
        } else {
            r0Var3 = r0Var2;
            i10 = 1;
        }
        int f10 = f(r0Var3);
        int g10 = g(r0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (N != null) {
            i12 = N.centerX();
            i11 = N.centerY();
        } else {
            i12 = (round + width) / 2;
            i11 = (round2 + height) / 2;
        }
        float h10 = ((float) h(viewGroup, f10, g10, i12, i11, round, round2, width, height)) / ((float) i(viewGroup));
        long M = j0Var.M();
        if (M < 0) {
            M = 300;
        }
        return (long) Math.round((((float) (M * ((long) i10))) / this.f7701d) * h10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f7702e
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = f1.w1.X(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = r3
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x0029
        L_0x0017:
            r0 = r2
            goto L_0x0029
        L_0x0019:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x0029
            int r7 = f1.w1.X(r7)
            if (r7 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g0.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public final int i(ViewGroup viewGroup) {
        int i10 = this.f7702e;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(float f10) {
        if (f10 != 0.0f) {
            this.f7701d = f10;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void k(int i10) {
        this.f7702e = i10;
    }
}

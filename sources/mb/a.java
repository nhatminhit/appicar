package mb;

import lb.r;
import qa.m;

public abstract class a extends r {

    /* renamed from: g  reason: collision with root package name */
    public static final float f21001g = 0.2f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f21002h = 0.45f;

    /* renamed from: i  reason: collision with root package name */
    public static final float f21003i = 0.7916667f;

    /* renamed from: j  reason: collision with root package name */
    public static final float f21004j = 0.89285713f;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f21005a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f21006b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f21007c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f21008d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f21009e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f21010f;

    public a() {
        int[] iArr = new int[8];
        this.f21006b = iArr;
        this.f21007c = new float[4];
        this.f21008d = new float[4];
        this.f21009e = new int[(iArr.length / 2)];
        this.f21010f = new int[(iArr.length / 2)];
    }

    @Deprecated
    public static int h(int[] iArr) {
        return za.a.d(iArr);
    }

    public static void i(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void p(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean q(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = ((float) i10) / ((float) ((iArr[2] + i10) + iArr[3]));
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int r(int[] iArr, int[][] iArr2) throws m {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (r.e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw m.a();
    }

    public final int[] j() {
        return this.f21006b;
    }

    public final int[] k() {
        return this.f21005a;
    }

    public final int[] l() {
        return this.f21010f;
    }

    public final float[] m() {
        return this.f21008d;
    }

    public final int[] n() {
        return this.f21009e;
    }

    public final float[] o() {
        return this.f21007c;
    }
}

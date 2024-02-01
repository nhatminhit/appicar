package qb;

import java.lang.reflect.Array;
import pb.a;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f22255a;

    static {
        int i10;
        int length = a.f21961i.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f22255a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i11 = 0;
        while (true) {
            int[] iArr2 = a.f21961i;
            if (i11 < iArr2.length) {
                int i12 = iArr2[i11];
                int i13 = i12 & 1;
                int i14 = 0;
                while (i14 < 8) {
                    float f10 = 0.0f;
                    while (true) {
                        i10 = i12 & 1;
                        if (i10 != i13) {
                            break;
                        }
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                    f22255a[i11][(8 - i14) - 1] = f10 / 17.0f;
                    i14++;
                    i13 = i10;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public static int a(int[] iArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                int i12 = 1;
                long j11 = j10 << 1;
                if (i10 % 2 != 0) {
                    i12 = 0;
                }
                j10 = j11 | ((long) i12);
            }
        }
        return (int) j10;
    }

    public static int b(int[] iArr) {
        int d10 = za.a.d(iArr);
        float[] fArr = new float[8];
        if (d10 > 1) {
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = ((float) iArr[i10]) / ((float) d10);
            }
        }
        float f10 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            float[][] fArr2 = f22255a;
            if (i12 >= fArr2.length) {
                return i11;
            }
            float f11 = 0.0f;
            float[] fArr3 = fArr2[i12];
            for (int i13 = 0; i13 < 8; i13++) {
                float f12 = fArr3[i13] - fArr[i13];
                f11 += f12 * f12;
                if (f11 >= f10) {
                    break;
                }
            }
            if (f11 < f10) {
                i11 = a.f21961i[i12];
                f10 = f11;
            }
            i12++;
        }
    }

    public static int c(int[] iArr) {
        int a10 = a(iArr);
        if (a.b(a10) == -1) {
            return -1;
        }
        return a10;
    }

    public static int d(int[] iArr) {
        int c10 = c(e(iArr));
        return c10 != -1 ? c10 : b(iArr);
    }

    public static int[] e(int[] iArr) {
        float d10 = (float) za.a.d(iArr);
        int[] iArr2 = new int[8];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 17; i12++) {
            float f10 = (d10 / 34.0f) + ((((float) i12) * d10) / 17.0f);
            int i13 = iArr[i11];
            if (((float) (i10 + i13)) <= f10) {
                i10 += i13;
                i11++;
            }
            iArr2[i11] = iArr2[i11] + 1;
        }
        return iArr2;
    }
}

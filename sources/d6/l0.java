package d6;

import b6.c;
import gc.j0;
import w7.q0;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6435a = q0.T(j0.I);

    /* renamed from: b  reason: collision with root package name */
    public static final int f6436b = q0.T("WAVE");

    /* renamed from: c  reason: collision with root package name */
    public static final int f6437c = q0.T("fmt ");

    /* renamed from: d  reason: collision with root package name */
    public static final int f6438d = q0.T("data");

    /* renamed from: e  reason: collision with root package name */
    public static final int f6439e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f6440f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f6441g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final int f6442h = 7;

    /* renamed from: i  reason: collision with root package name */
    public static final int f6443i = 65534;

    public static int a(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                if (i10 == 6) {
                    return 536870912;
                }
                if (i10 != 7) {
                    return 0;
                }
                return c.A;
            }
        }
        return q0.Y(i11);
    }

    public static int b(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return 1;
        }
        if (i10 == 268435456) {
            return 7;
        }
        if (i10 == 536870912) {
            return 6;
        }
        if (i10 == 1073741824 || i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IllegalArgumentException();
    }
}

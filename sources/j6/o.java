package j6;

import b7.u0;
import k6.b;
import p3.a;
import p6.h;
import w7.s;
import y7.e;

public final class o {

    /* renamed from: h  reason: collision with root package name */
    public static final int f9595h = 4096;

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f9596i = {s.f14839x, s.f14840y, s.f14838w};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f9597j = {u0.U, h.f11572t, e.f15575h};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f9598k = {e.f15575h, 64000, 96000, e.f15576i, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f9599l = {e.f15575h, h.f11572t, 56000, 64000, 80000, 96000, 112000, e.f15576i, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f9600m = {e.f15575h, h.f11572t, 56000, 64000, 80000, 96000, 112000, e.f15576i, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f9601n = {e.f15575h, 40000, h.f11572t, 56000, 64000, 80000, 96000, 112000, e.f15576i, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9602o = {8000, b.A, 24000, e.f15575h, 40000, h.f11572t, 56000, 64000, 80000, 96000, 112000, e.f15576i, 144000, 160000};

    /* renamed from: a  reason: collision with root package name */
    public int f9603a;

    /* renamed from: b  reason: collision with root package name */
    public String f9604b;

    /* renamed from: c  reason: collision with root package name */
    public int f9605c;

    /* renamed from: d  reason: collision with root package name */
    public int f9606d;

    /* renamed from: e  reason: collision with root package name */
    public int f9607e;

    /* renamed from: f  reason: collision with root package name */
    public int f9608f;

    /* renamed from: g  reason: collision with root package name */
    public int f9609g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & -2097152) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f9597j[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f9598k[i13 - 1] : f9599l[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f9600m[i13 - 1] : f9601n[i13 - 1] : f9602o[i13 - 1];
        int i18 = 144;
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return ((i18 * i17) / i15) + i16;
    }

    public static boolean b(int i10, o oVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if ((i10 & -2097152) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i20 = f9597j[i14];
        if (i11 == 2) {
            i20 /= 2;
        } else if (i11 == 0) {
            i20 /= 4;
        }
        int i21 = i20;
        int i22 = (i10 >>> 9) & 1;
        int i23 = 1152;
        if (i12 == 3) {
            int i24 = i11 == 3 ? f9598k[i13 - 1] : f9599l[i13 - 1];
            i15 = 384;
            i17 = i24;
            i16 = (((i24 * 12) / i21) + i22) * 4;
        } else {
            if (i11 == 3) {
                i18 = i12 == 2 ? f9600m[i13 - 1] : f9601n[i13 - 1];
                i19 = i18 * 144;
            } else {
                i18 = f9602o[i13 - 1];
                if (i12 == 1) {
                    i23 = a.f11391i1;
                }
                i19 = (i12 == 1 ? 72 : 144) * i18;
            }
            i16 = (i19 / i21) + i22;
            i17 = i18;
            i15 = i23;
        }
        oVar.c(i11, f9596i[3 - i12], i16, i21, ((i10 >> 6) & 3) == 3 ? 1 : 2, i17, i15);
        return true;
    }

    public final void c(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.f9603a = i10;
        this.f9604b = str;
        this.f9605c = i11;
        this.f9606d = i12;
        this.f9607e = i13;
        this.f9608f = i14;
        this.f9609g = i15;
    }
}

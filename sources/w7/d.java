package w7;

import android.util.Pair;
import b6.j0;
import b7.u0;
import d.o0;
import dg.a;
import java.util.ArrayList;
import k6.b;
import p6.h;
import y7.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14696a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final int f14697b = 15;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14698c = {96000, 88200, 64000, h.f11572t, u0.U, e.f15575h, 24000, 22050, b.A, f5.b.f7371q, 11025, 8000, 7350};

    /* renamed from: d  reason: collision with root package name */
    public static final int f14699d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f14700e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: f  reason: collision with root package name */
    public static final int f14701f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f14702g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f14703h = 22;

    /* renamed from: i  reason: collision with root package name */
    public static final int f14704i = 29;

    /* renamed from: j  reason: collision with root package name */
    public static final int f14705j = 31;

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & a.f17849ah) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] b(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f14698c;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f14700e;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return a(2, i14, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static String c(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f14696a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static int e(byte[] bArr, int i10) {
        int length = bArr.length - f14696a.length;
        while (i10 <= length) {
            if (h(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int f(v vVar) {
        int h10 = vVar.h(5);
        return h10 == 31 ? vVar.h(6) + 32 : h10;
    }

    public static int g(v vVar) {
        int h10 = vVar.h(4);
        if (h10 == 15) {
            return vVar.h(24);
        }
        a.a(h10 < 13);
        return f14698c[h10];
    }

    public static boolean h(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f14696a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f14696a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static Pair<Integer, Integer> i(v vVar, boolean z10) throws j0 {
        int f10 = f(vVar);
        int g10 = g(vVar);
        int h10 = vVar.h(4);
        if (f10 == 5 || f10 == 29) {
            g10 = g(vVar);
            f10 = f(vVar);
            if (f10 == 22) {
                h10 = vVar.h(4);
            }
        }
        boolean z11 = true;
        if (z10) {
            if (!(f10 == 1 || f10 == 2 || f10 == 3 || f10 == 4 || f10 == 6 || f10 == 7 || f10 == 17)) {
                switch (f10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new j0("Unsupported audio object type: " + f10);
                }
            }
            k(vVar, f10, h10);
            switch (f10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = vVar.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw new j0("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f14700e[h10];
        if (i10 == -1) {
            z11 = false;
        }
        a.a(z11);
        return Pair.create(Integer.valueOf(g10), Integer.valueOf(i10));
    }

    public static Pair<Integer, Integer> j(byte[] bArr) throws j0 {
        return i(new v(bArr), false);
    }

    public static void k(v vVar, int i10, int i11) {
        vVar.p(1);
        if (vVar.g()) {
            vVar.p(14);
        }
        boolean g10 = vVar.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                vVar.p(3);
            }
            if (g10) {
                if (i10 == 22) {
                    vVar.p(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    vVar.p(3);
                }
                vVar.p(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    @o0
    public static byte[][] l(byte[] bArr) {
        if (!h(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = e(bArr, i10 + f14696a.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() + -1 ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }
}

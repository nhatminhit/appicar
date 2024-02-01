package wb;

import java.util.ArrayList;
import java.util.List;
import qa.m;
import qa.u;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ya.b f24001a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f24002b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    public final int f24003c;

    /* renamed from: d  reason: collision with root package name */
    public final int f24004d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24005e;

    /* renamed from: f  reason: collision with root package name */
    public final int f24006f;

    /* renamed from: g  reason: collision with root package name */
    public final float f24007g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f24008h;

    /* renamed from: i  reason: collision with root package name */
    public final u f24009i;

    public b(ya.b bVar, int i10, int i11, int i12, int i13, float f10, u uVar) {
        this.f24001a = bVar;
        this.f24003c = i10;
        this.f24004d = i11;
        this.f24005e = i12;
        this.f24006f = i13;
        this.f24007g = f10;
        this.f24008h = new int[3];
        this.f24009i = uVar;
    }

    public static float a(int[] iArr, int i10) {
        return ((float) (i10 - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    public final float b(int i10, int i11, int i12, int i13) {
        ya.b bVar = this.f24001a;
        int n10 = bVar.n();
        int[] iArr = this.f24008h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i14 = i10;
        while (i14 >= 0 && bVar.j(i11, i14)) {
            int i15 = iArr[1];
            if (i15 > i12) {
                break;
            }
            iArr[1] = i15 + 1;
            i14--;
        }
        if (i14 >= 0 && iArr[1] <= i12) {
            while (i14 >= 0 && !bVar.j(i11, i14)) {
                int i16 = iArr[0];
                if (i16 > i12) {
                    break;
                }
                iArr[0] = i16 + 1;
                i14--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i17 = i10 + 1;
            while (i17 < n10 && bVar.j(i11, i17)) {
                int i18 = iArr[1];
                if (i18 > i12) {
                    break;
                }
                iArr[1] = i18 + 1;
                i17++;
            }
            if (i17 != n10 && iArr[1] <= i12) {
                while (i17 < n10 && !bVar.j(i11, i17)) {
                    int i19 = iArr[2];
                    if (i19 > i12) {
                        break;
                    }
                    iArr[2] = i19 + 1;
                    i17++;
                }
                int i20 = iArr[2];
                if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i17);
                }
            }
        }
        return Float.NaN;
    }

    public a c() throws m {
        a e10;
        a e11;
        int i10 = this.f24003c;
        int i11 = this.f24006f;
        int i12 = this.f24005e + i10;
        int i13 = this.f24004d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f24001a.j(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f24001a.j(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else if (d(iArr) && (e11 = e(iArr, i15, i16)) != null) {
                    return e11;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (e10 = e(iArr, i15, i12)) != null) {
                return e10;
            }
        }
        if (!this.f24002b.isEmpty()) {
            return this.f24002b.get(0);
        }
        throw m.a();
    }

    public final boolean d(int[] iArr) {
        float f10 = this.f24007g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - ((float) iArr[i10])) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[1] * 2, i12);
        if (Float.isNaN(b10)) {
            return null;
        }
        float f10 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (a next : this.f24002b) {
            if (next.f(f10, b10, a10)) {
                return next.g(b10, a10, f10);
            }
        }
        a aVar = new a(a10, b10, f10);
        this.f24002b.add(aVar);
        u uVar = this.f24009i;
        if (uVar == null) {
            return null;
        }
        uVar.a(aVar);
        return null;
    }
}

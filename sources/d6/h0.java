package d6;

import java.nio.ShortBuffer;
import java.util.Arrays;
import w7.a;

public final class h0 {

    /* renamed from: w  reason: collision with root package name */
    public static final int f6342w = 65;

    /* renamed from: x  reason: collision with root package name */
    public static final int f6343x = 400;

    /* renamed from: y  reason: collision with root package name */
    public static final int f6344y = 4000;

    /* renamed from: z  reason: collision with root package name */
    public static final int f6345z = 2;

    /* renamed from: a  reason: collision with root package name */
    public final int f6346a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6347b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6348c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6349d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6350e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6351f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6352g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6353h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f6354i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f6355j;

    /* renamed from: k  reason: collision with root package name */
    public int f6356k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f6357l;

    /* renamed from: m  reason: collision with root package name */
    public int f6358m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f6359n;

    /* renamed from: o  reason: collision with root package name */
    public int f6360o;

    /* renamed from: p  reason: collision with root package name */
    public int f6361p;

    /* renamed from: q  reason: collision with root package name */
    public int f6362q;

    /* renamed from: r  reason: collision with root package name */
    public int f6363r;

    /* renamed from: s  reason: collision with root package name */
    public int f6364s;

    /* renamed from: t  reason: collision with root package name */
    public int f6365t;

    /* renamed from: u  reason: collision with root package name */
    public int f6366u;

    /* renamed from: v  reason: collision with root package name */
    public int f6367v;

    public h0(int i10, int i11, float f10, float f11, int i12) {
        this.f6346a = i10;
        this.f6347b = i11;
        this.f6348c = f10;
        this.f6349d = f11;
        this.f6350e = ((float) i10) / ((float) i12);
        this.f6351f = i10 / 400;
        int i13 = i10 / 65;
        this.f6352g = i13;
        int i14 = i13 * 2;
        this.f6353h = i14;
        this.f6354i = new short[i14];
        this.f6355j = new short[(i14 * i11)];
        this.f6357l = new short[(i14 * i11)];
        this.f6359n = new short[(i14 * i11)];
    }

    public static void o(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f6358m != i10) {
            int i13 = this.f6346a;
            int i14 = (int) (((float) i13) / f10);
            while (true) {
                if (i14 <= 16384 && i13 <= 16384) {
                    break;
                }
                i14 /= 2;
                i13 /= 2;
            }
            n(i10);
            int i15 = 0;
            while (true) {
                int i16 = this.f6360o;
                boolean z10 = true;
                if (i15 < i16 - 1) {
                    while (true) {
                        i11 = this.f6361p;
                        int i17 = (i11 + 1) * i14;
                        i12 = this.f6362q;
                        if (i17 <= i12 * i13) {
                            break;
                        }
                        this.f6357l = f(this.f6357l, this.f6358m, 1);
                        int i18 = 0;
                        while (true) {
                            int i19 = this.f6347b;
                            if (i18 >= i19) {
                                break;
                            }
                            this.f6357l[(this.f6358m * i19) + i18] = m(this.f6359n, (i19 * i15) + i18, i13, i14);
                            i18++;
                        }
                        this.f6362q++;
                        this.f6358m++;
                    }
                    int i20 = i11 + 1;
                    this.f6361p = i20;
                    if (i20 == i13) {
                        this.f6361p = 0;
                        if (i12 != i14) {
                            z10 = false;
                        }
                        a.i(z10);
                        this.f6362q = 0;
                    }
                    i15++;
                } else {
                    t(i16 - 1);
                    return;
                }
            }
        }
    }

    public final void b(float f10) {
        int v10;
        int i10 = this.f6356k;
        if (i10 >= this.f6353h) {
            int i11 = 0;
            do {
                if (this.f6363r > 0) {
                    v10 = c(i11);
                } else {
                    int g10 = g(this.f6355j, i11);
                    v10 = ((double) f10) > 1.0d ? g10 + v(this.f6355j, i11, f10, g10) : l(this.f6355j, i11, f10, g10);
                }
                i11 += v10;
            } while (this.f6353h + i11 <= i10);
            u(i11);
        }
    }

    public final int c(int i10) {
        int min = Math.min(this.f6353h, this.f6363r);
        d(this.f6355j, i10, min);
        this.f6363r -= min;
        return min;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f6357l, this.f6358m, i11);
        this.f6357l = f10;
        int i12 = this.f6347b;
        System.arraycopy(sArr, i10 * i12, f10, this.f6358m * i12, i12 * i11);
        this.f6358m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f6353h / i11;
        int i13 = this.f6347b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f6354i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f6347b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f6346a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f6347b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f6351f, this.f6352g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f6354i, 0, this.f6351f / i13, this.f6352g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f6351f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f6352g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f6347b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f6354i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = p(this.f6366u, this.f6367v) ? this.f6364s : i11;
        this.f6365t = this.f6366u;
        this.f6364s = i11;
        return i20;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f6347b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f6366u = i14 / i16;
        this.f6367v = i17 / i15;
        return i16;
    }

    public void i() {
        this.f6356k = 0;
        this.f6358m = 0;
        this.f6360o = 0;
        this.f6361p = 0;
        this.f6362q = 0;
        this.f6363r = 0;
        this.f6364s = 0;
        this.f6365t = 0;
        this.f6366u = 0;
        this.f6367v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6347b, this.f6358m);
        shortBuffer.put(this.f6357l, 0, this.f6347b * min);
        int i10 = this.f6358m - min;
        this.f6358m = i10;
        short[] sArr = this.f6357l;
        int i11 = this.f6347b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f6358m * this.f6347b * 2;
    }

    public final int l(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((((float) i11) * f10) / (1.0f - f10));
        } else {
            this.f6363r = (int) ((((float) i11) * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f6357l, this.f6358m, i13);
        this.f6357l = f11;
        int i14 = this.f6347b;
        System.arraycopy(sArr, i10 * i14, f11, this.f6358m * i14, i14 * i11);
        o(i12, this.f6347b, this.f6357l, this.f6358m + i11, sArr, i10 + i11, sArr, i10);
        this.f6358m += i13;
        return i12;
    }

    public final short m(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f6347b];
        int i13 = this.f6362q * i11;
        int i14 = this.f6361p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    public final void n(int i10) {
        int i11 = this.f6358m - i10;
        short[] f10 = f(this.f6359n, this.f6360o, i11);
        this.f6359n = f10;
        short[] sArr = this.f6357l;
        int i12 = this.f6347b;
        System.arraycopy(sArr, i10 * i12, f10, this.f6360o * i12, i12 * i11);
        this.f6358m = i10;
        this.f6360o += i11;
    }

    public final boolean p(int i10, int i11) {
        return i10 != 0 && this.f6364s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f6365t * 3;
    }

    public final void q() {
        int i10 = this.f6358m;
        float f10 = this.f6348c;
        float f11 = this.f6349d;
        float f12 = f10 / f11;
        float f13 = this.f6350e * f11;
        double d10 = (double) f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f6355j, 0, this.f6356k);
            this.f6356k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    public void r() {
        int i10;
        int i11 = this.f6356k;
        float f10 = this.f6348c;
        float f11 = this.f6349d;
        int i12 = this.f6358m + ((int) ((((((float) i11) / (f10 / f11)) + ((float) this.f6360o)) / (this.f6350e * f11)) + 0.5f));
        this.f6355j = f(this.f6355j, i11, (this.f6353h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f6353h;
            int i14 = this.f6347b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f6355j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f6356k += i10 * 2;
        q();
        if (this.f6358m > i12) {
            this.f6358m = i12;
        }
        this.f6356k = 0;
        this.f6363r = 0;
        this.f6360o = 0;
    }

    public void s(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f6347b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f6355j, this.f6356k, i11);
        this.f6355j = f10;
        shortBuffer.get(f10, this.f6356k * this.f6347b, ((i10 * i11) * 2) / 2);
        this.f6356k += i11;
        q();
    }

    public final void t(int i10) {
        if (i10 != 0) {
            short[] sArr = this.f6359n;
            int i11 = this.f6347b;
            System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f6360o - i10) * i11);
            this.f6360o -= i10;
        }
    }

    public final void u(int i10) {
        int i11 = this.f6356k - i10;
        short[] sArr = this.f6355j;
        int i12 = this.f6347b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f6356k = i11;
    }

    public final int v(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (((float) i11) / (f10 - 1.0f));
        } else {
            this.f6363r = (int) ((((float) i11) * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f6357l, this.f6358m, i12);
        this.f6357l = f11;
        o(i12, this.f6347b, f11, this.f6358m, sArr, i10, sArr, i10 + i11);
        this.f6358m += i12;
        return i12;
    }
}

package w;

import java.io.PrintStream;
import java.util.Arrays;
import w.b;

public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f14219l = false;

    /* renamed from: m  reason: collision with root package name */
    public static final int f14220m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f14221n = false;

    /* renamed from: o  reason: collision with root package name */
    public static float f14222o = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public int f14223a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f14224b;

    /* renamed from: c  reason: collision with root package name */
    public final c f14225c;

    /* renamed from: d  reason: collision with root package name */
    public int f14226d = 8;

    /* renamed from: e  reason: collision with root package name */
    public i f14227e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f14228f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f14229g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f14230h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f14231i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f14232j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14233k = false;

    public a(b bVar, c cVar) {
        this.f14224b = bVar;
        this.f14225c = cVar;
    }

    public final float a(i iVar) {
        int i10 = this.f14231i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14228f[i10] == iVar.f14322c) {
                return this.f14230h[i10];
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        return 0.0f;
    }

    public void b() {
        int i10 = this.f14223a;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                PrintStream printStream = System.out;
                printStream.print(h10 + " = " + j(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    public final float c(i iVar, boolean z10) {
        if (this.f14227e == iVar) {
            this.f14227e = null;
        }
        int i10 = this.f14231i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14228f[i10] == iVar.f14322c) {
                if (i10 == this.f14231i) {
                    this.f14231i = this.f14229g[i10];
                } else {
                    int[] iArr = this.f14229g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.f(this.f14224b);
                }
                iVar.f14332m--;
                this.f14223a--;
                this.f14228f[i10] = -1;
                if (this.f14233k) {
                    this.f14232j = i10;
                }
                return this.f14230h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f14229g[i10];
        }
        return 0.0f;
    }

    public final void clear() {
        int i10 = this.f14231i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            i iVar = this.f14225c.f14245d[this.f14228f[i10]];
            if (iVar != null) {
                iVar.f(this.f14224b);
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        this.f14231i = -1;
        this.f14232j = -1;
        this.f14233k = false;
        this.f14223a = 0;
    }

    public int d() {
        return this.f14223a;
    }

    public void e(i iVar, float f10, boolean z10) {
        float f11 = f14222o;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f14231i;
            if (i10 == -1) {
                this.f14231i = 0;
                this.f14230h[0] = f10;
                this.f14228f[0] = iVar.f14322c;
                this.f14229g[0] = -1;
                iVar.f14332m++;
                iVar.a(this.f14224b);
                this.f14223a++;
                if (!this.f14233k) {
                    int i11 = this.f14232j + 1;
                    this.f14232j = i11;
                    int[] iArr = this.f14228f;
                    if (i11 >= iArr.length) {
                        this.f14233k = true;
                        this.f14232j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f14223a) {
                int i14 = this.f14228f[i10];
                int i15 = iVar.f14322c;
                if (i14 == i15) {
                    float[] fArr = this.f14230h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f14222o;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f14231i) {
                            this.f14231i = this.f14229g[i10];
                        } else {
                            int[] iArr2 = this.f14229g;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.f(this.f14224b);
                        }
                        if (this.f14233k) {
                            this.f14232j = i10;
                        }
                        iVar.f14332m--;
                        this.f14223a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f14229g[i10];
                i12++;
            }
            int i16 = this.f14232j;
            int i17 = i16 + 1;
            if (this.f14233k) {
                int[] iArr3 = this.f14228f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f14228f;
            if (i16 >= iArr4.length && this.f14223a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f14228f;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f14228f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f14226d * 2;
                this.f14226d = i19;
                this.f14233k = false;
                this.f14232j = i16 - 1;
                this.f14230h = Arrays.copyOf(this.f14230h, i19);
                this.f14228f = Arrays.copyOf(this.f14228f, this.f14226d);
                this.f14229g = Arrays.copyOf(this.f14229g, this.f14226d);
            }
            this.f14228f[i16] = iVar.f14322c;
            this.f14230h[i16] = f10;
            int[] iArr7 = this.f14229g;
            if (i13 != -1) {
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                iArr7[i16] = this.f14231i;
                this.f14231i = i16;
            }
            iVar.f14332m++;
            iVar.a(this.f14224b);
            this.f14223a++;
            if (!this.f14233k) {
                this.f14232j++;
            }
            int i20 = this.f14232j;
            int[] iArr8 = this.f14228f;
            if (i20 >= iArr8.length) {
                this.f14233k = true;
                this.f14232j = iArr8.length - 1;
            }
        }
    }

    public boolean f(i iVar) {
        int i10 = this.f14231i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14228f[i10] == iVar.f14322c) {
                return true;
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        return false;
    }

    public int g(i iVar) {
        int i10 = this.f14231i;
        if (i10 == -1) {
            return -1;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14228f[i10] == iVar.f14322c) {
                return i10;
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        return -1;
    }

    public i h(int i10) {
        int i11 = this.f14231i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f14223a) {
            if (i12 == i10) {
                return this.f14225c.f14245d[this.f14228f[i11]];
            }
            i11 = this.f14229g[i11];
            i12++;
        }
        return null;
    }

    public void i() {
        int i10 = this.f14231i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            float[] fArr = this.f14230h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f14229g[i10];
            i11++;
        }
    }

    public float j(int i10) {
        int i11 = this.f14231i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f14223a) {
            if (i12 == i10) {
                return this.f14230h[i11];
            }
            i11 = this.f14229g[i11];
            i12++;
        }
        return 0.0f;
    }

    public final void k(i iVar, float f10) {
        if (f10 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i10 = this.f14231i;
        if (i10 == -1) {
            this.f14231i = 0;
            this.f14230h[0] = f10;
            this.f14228f[0] = iVar.f14322c;
            this.f14229g[0] = -1;
            iVar.f14332m++;
            iVar.a(this.f14224b);
            this.f14223a++;
            if (!this.f14233k) {
                int i11 = this.f14232j + 1;
                this.f14232j = i11;
                int[] iArr = this.f14228f;
                if (i11 >= iArr.length) {
                    this.f14233k = true;
                    this.f14232j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f14223a) {
            int i14 = this.f14228f[i10];
            int i15 = iVar.f14322c;
            if (i14 == i15) {
                this.f14230h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f14229g[i10];
            i12++;
        }
        int i16 = this.f14232j;
        int i17 = i16 + 1;
        if (this.f14233k) {
            int[] iArr2 = this.f14228f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f14228f;
        if (i16 >= iArr3.length && this.f14223a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f14228f;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f14228f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f14226d * 2;
            this.f14226d = i19;
            this.f14233k = false;
            this.f14232j = i16 - 1;
            this.f14230h = Arrays.copyOf(this.f14230h, i19);
            this.f14228f = Arrays.copyOf(this.f14228f, this.f14226d);
            this.f14229g = Arrays.copyOf(this.f14229g, this.f14226d);
        }
        this.f14228f[i16] = iVar.f14322c;
        this.f14230h[i16] = f10;
        int[] iArr6 = this.f14229g;
        if (i13 != -1) {
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            iArr6[i16] = this.f14231i;
            this.f14231i = i16;
        }
        iVar.f14332m++;
        iVar.a(this.f14224b);
        int i20 = this.f14223a + 1;
        this.f14223a = i20;
        if (!this.f14233k) {
            this.f14232j++;
        }
        int[] iArr7 = this.f14228f;
        if (i20 >= iArr7.length) {
            this.f14233k = true;
        }
        if (this.f14232j >= iArr7.length) {
            this.f14233k = true;
            this.f14232j = iArr7.length - 1;
        }
    }

    public float l(b bVar, boolean z10) {
        float a10 = a(bVar.f14236a);
        c(bVar.f14236a, z10);
        b.a aVar = bVar.f14240e;
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            i h10 = aVar.h(i10);
            e(h10, aVar.a(h10) * a10, z10);
        }
        return a10;
    }

    public int m() {
        return (this.f14228f.length * 4 * 3) + 0 + 36;
    }

    public void n(float f10) {
        int i10 = this.f14231i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            float[] fArr = this.f14230h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f14229g[i10];
            i11++;
        }
    }

    public int o() {
        return this.f14231i;
    }

    public final int p(int i10) {
        return this.f14228f[i10];
    }

    public final int q(int i10) {
        return this.f14229g[i10];
    }

    public i r() {
        i iVar = this.f14227e;
        if (iVar != null) {
            return iVar;
        }
        int i10 = this.f14231i;
        int i11 = 0;
        i iVar2 = null;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14230h[i10] < 0.0f) {
                i iVar3 = this.f14225c.f14245d[this.f14228f[i10]];
                if (iVar2 == null || iVar2.f14324e < iVar3.f14324e) {
                    iVar2 = iVar3;
                }
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        return iVar2;
    }

    public final float s(int i10) {
        return this.f14230h[i10];
    }

    public boolean t() {
        int i10 = this.f14231i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            if (this.f14230h[i10] > 0.0f) {
                return true;
            }
            i10 = this.f14229g[i10];
            i11++;
        }
        return false;
    }

    public String toString() {
        int i10 = this.f14231i;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14223a) {
            str = ((str + " -> ") + this.f14230h[i10] + " : ") + this.f14225c.f14245d[this.f14228f[i10]];
            i10 = this.f14229g[i10];
            i11++;
        }
        return str;
    }
}

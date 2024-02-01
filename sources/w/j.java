package w;

import java.io.PrintStream;
import java.util.Arrays;
import w.b;

public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f14338n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f14339o = true;

    /* renamed from: p  reason: collision with root package name */
    public static float f14340p = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    public final int f14341a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f14342b = 16;

    /* renamed from: c  reason: collision with root package name */
    public int f14343c = 16;

    /* renamed from: d  reason: collision with root package name */
    public int[] f14344d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public int[] f14345e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f14346f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public float[] f14347g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public int[] f14348h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    public int[] f14349i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    public int f14350j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f14351k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final b f14352l;

    /* renamed from: m  reason: collision with root package name */
    public final c f14353m;

    public j(b bVar, c cVar) {
        this.f14352l = bVar;
        this.f14353m = cVar;
        clear();
    }

    public float a(i iVar) {
        int g10 = g(iVar);
        if (g10 != -1) {
            return this.f14347g[g10];
        }
        return 0.0f;
    }

    public void b() {
        int i10 = this.f14350j;
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

    public float c(i iVar, boolean z10) {
        int g10 = g(iVar);
        if (g10 == -1) {
            return 0.0f;
        }
        u(iVar);
        float f10 = this.f14347g[g10];
        if (this.f14351k == g10) {
            this.f14351k = this.f14349i[g10];
        }
        this.f14346f[g10] = -1;
        int[] iArr = this.f14348h;
        int i10 = iArr[g10];
        if (i10 != -1) {
            int[] iArr2 = this.f14349i;
            iArr2[i10] = iArr2[g10];
        }
        int i11 = this.f14349i[g10];
        if (i11 != -1) {
            iArr[i11] = iArr[g10];
        }
        this.f14350j--;
        iVar.f14332m--;
        if (z10) {
            iVar.f(this.f14352l);
        }
        return f10;
    }

    public void clear() {
        int i10 = this.f14350j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                h10.f(this.f14352l);
            }
        }
        for (int i12 = 0; i12 < this.f14342b; i12++) {
            this.f14346f[i12] = -1;
            this.f14345e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f14343c; i13++) {
            this.f14344d[i13] = -1;
        }
        this.f14350j = 0;
        this.f14351k = -1;
    }

    public int d() {
        return this.f14350j;
    }

    public void e(i iVar, float f10, boolean z10) {
        float f11 = f14340p;
        if (f10 <= (-f11) || f10 >= f11) {
            int g10 = g(iVar);
            if (g10 == -1) {
                k(iVar, f10);
                return;
            }
            float[] fArr = this.f14347g;
            float f12 = fArr[g10] + f10;
            fArr[g10] = f12;
            float f13 = f14340p;
            if (f12 > (-f13) && f12 < f13) {
                fArr[g10] = 0.0f;
                c(iVar, z10);
            }
        }
    }

    public boolean f(i iVar) {
        return g(iVar) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g(w.i r4) {
        /*
            r3 = this;
            int r0 = r3.f14350j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f14322c
            int r0 = r3.f14343c
            int r0 = r4 % r0
            int[] r2 = r3.f14344d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f14346f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f14345e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f14346f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f14346f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.g(w.i):int");
    }

    public i h(int i10) {
        int i11 = this.f14350j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f14351k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f14353m.f14245d[this.f14346f[i12]];
            }
            i12 = this.f14349i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    public void i() {
        int i10 = this.f14350j;
        int i11 = this.f14351k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f14347g;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f14349i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public float j(int i10) {
        int i11 = this.f14350j;
        int i12 = this.f14351k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f14347g[i12];
            }
            i12 = this.f14349i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void k(i iVar, float f10) {
        float f11 = f14340p;
        if (f10 <= (-f11) || f10 >= f11) {
            if (this.f14350j == 0) {
                p(0, iVar, f10);
                o(iVar, 0);
                this.f14351k = 0;
                return;
            }
            int g10 = g(iVar);
            if (g10 != -1) {
                this.f14347g[g10] = f10;
                return;
            }
            if (this.f14350j + 1 >= this.f14342b) {
                s();
            }
            int i10 = this.f14350j;
            int i11 = this.f14351k;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.f14346f[i11];
                int i15 = iVar.f14322c;
                if (i14 == i15) {
                    this.f14347g[i11] = f10;
                    return;
                }
                if (i14 < i15) {
                    i12 = i11;
                }
                i11 = this.f14349i[i11];
                if (i11 == -1) {
                    break;
                }
            }
            t(i12, iVar, f10);
            return;
        }
        c(iVar, true);
    }

    public float l(b bVar, boolean z10) {
        float a10 = a(bVar.f14236a);
        c(bVar.f14236a, z10);
        j jVar = (j) bVar.f14240e;
        int d10 = jVar.d();
        int i10 = 0;
        int i11 = 0;
        while (i10 < d10) {
            int i12 = jVar.f14346f[i11];
            if (i12 != -1) {
                e(this.f14353m.f14245d[i12], jVar.f14347g[i11] * a10, z10);
                i10++;
            }
            i11++;
        }
        return a10;
    }

    public int m() {
        return 0;
    }

    public void n(float f10) {
        int i10 = this.f14350j;
        int i11 = this.f14351k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f14347g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f14349i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public final void o(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f14322c % this.f14343c;
        int[] iArr2 = this.f14344d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f14345e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f14345e[i10] = -1;
    }

    public final void p(int i10, i iVar, float f10) {
        this.f14346f[i10] = iVar.f14322c;
        this.f14347g[i10] = f10;
        this.f14348h[i10] = -1;
        this.f14349i[i10] = -1;
        iVar.a(this.f14352l);
        iVar.f14332m++;
        this.f14350j++;
    }

    public final void q() {
        for (int i10 = 0; i10 < this.f14343c; i10++) {
            if (this.f14344d[i10] != -1) {
                String str = hashCode() + " hash [" + i10 + "] => ";
                int i11 = this.f14344d[i10];
                boolean z10 = false;
                while (!z10) {
                    str = str + " " + this.f14346f[i11];
                    int i12 = this.f14345e[i11];
                    if (i12 != -1) {
                        i11 = i12;
                    } else {
                        z10 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    public final int r() {
        for (int i10 = 0; i10 < this.f14342b; i10++) {
            if (this.f14346f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        int i10 = this.f14342b * 2;
        this.f14346f = Arrays.copyOf(this.f14346f, i10);
        this.f14347g = Arrays.copyOf(this.f14347g, i10);
        this.f14348h = Arrays.copyOf(this.f14348h, i10);
        this.f14349i = Arrays.copyOf(this.f14349i, i10);
        this.f14345e = Arrays.copyOf(this.f14345e, i10);
        for (int i11 = this.f14342b; i11 < i10; i11++) {
            this.f14346f[i11] = -1;
            this.f14345e[i11] = -1;
        }
        this.f14342b = i10;
    }

    public final void t(int i10, i iVar, float f10) {
        int r10 = r();
        p(r10, iVar, f10);
        if (i10 != -1) {
            this.f14348h[r10] = i10;
            int[] iArr = this.f14349i;
            iArr[r10] = iArr[i10];
            iArr[i10] = r10;
        } else {
            this.f14348h[r10] = -1;
            if (this.f14350j > 0) {
                this.f14349i[r10] = this.f14351k;
                this.f14351k = r10;
            } else {
                this.f14349i[r10] = -1;
            }
        }
        int i11 = this.f14349i[r10];
        if (i11 != -1) {
            this.f14348h[i11] = r10;
        }
        o(iVar, r10);
    }

    public String toString() {
        StringBuilder sb2;
        String str;
        String str2 = hashCode() + " { ";
        int i10 = this.f14350j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                String str3 = str2 + h10 + " = " + j(i11) + " ";
                int g10 = g(h10);
                String str4 = str3 + "[p: ";
                if (this.f14348h[g10] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(this.f14353m.f14245d[this.f14346f[this.f14348h[g10]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append("none");
                }
                String str5 = sb2.toString() + ", n: ";
                if (this.f14349i[g10] != -1) {
                    str = str5 + this.f14353m.f14245d[this.f14346f[this.f14349i[g10]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(w.i r6) {
        /*
            r5 = this;
            int r6 = r6.f14322c
            int r0 = r5.f14343c
            int r0 = r6 % r0
            int[] r1 = r5.f14344d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f14346f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f14345e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f14345e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f14346f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f14346f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.j.u(w.i):void");
    }
}

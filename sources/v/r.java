package v;

import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import d.m0;
import java.util.LinkedHashMap;
import u.c;

public class r implements Comparable<r> {

    /* renamed from: d0  reason: collision with root package name */
    public static final String f14109d0 = "MotionPaths";

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f14110e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f14111f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f14112g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f14113h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f14114i0 = 2;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f14115j0 = 3;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f14116k0 = 4;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f14117l0 = 5;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f14118m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f14119n0 = 2;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f14120o0 = 3;

    /* renamed from: p0  reason: collision with root package name */
    public static String[] f14121p0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public c O;
    public int P = 0;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W = Float.NaN;
    public float X = Float.NaN;
    public int Y = e.f13910f;
    public LinkedHashMap<String, a> Z = new LinkedHashMap<>();

    /* renamed from: a0  reason: collision with root package name */
    public int f14122a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public double[] f14123b0 = new double[18];

    /* renamed from: c0  reason: collision with root package name */
    public double[] f14124c0 = new double[18];

    public r() {
    }

    public r(int i10, int i11, k kVar, r rVar, r rVar2) {
        int i12 = kVar.J;
        if (i12 == 1) {
            q(kVar, rVar, rVar2);
        } else if (i12 != 2) {
            p(kVar, rVar, rVar2);
        } else {
            r(i10, i11, kVar, rVar, rVar2);
        }
    }

    public static final float v(float f10, float f11, float f12, float f13, float f14, float f15) {
        return (((f14 - f12) * f11) - ((f15 - f13) * f10)) + f12;
    }

    public static final float w(float f10, float f11, float f12, float f13, float f14, float f15) {
        return ((f14 - f12) * f10) + ((f15 - f13) * f11) + f13;
    }

    public void a(d.a aVar) {
        this.O = c.c(aVar.f1998c.f2074c);
        d.c cVar = aVar.f1998c;
        this.Y = cVar.f2075d;
        this.W = cVar.f2078g;
        this.P = cVar.f2076e;
        this.X = aVar.f1997b.f2083e;
        for (String next : aVar.f2001f.keySet()) {
            a aVar2 = aVar.f2001f.get(next);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.Z.put(next, aVar2);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(@m0 r rVar) {
        return Float.compare(this.R, rVar.R);
    }

    public final boolean d(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void e(r rVar, boolean[] zArr, String[] strArr, boolean z10) {
        zArr[0] = zArr[0] | d(this.R, rVar.R);
        zArr[1] = zArr[1] | d(this.S, rVar.S) | z10;
        zArr[2] = z10 | d(this.T, rVar.T) | zArr[2];
        zArr[3] = zArr[3] | d(this.U, rVar.U);
        zArr[4] = d(this.V, rVar.V) | zArr[4];
    }

    public void i(double[] dArr, int[] iArr) {
        float[] fArr = {this.R, this.S, this.T, this.U, this.V, this.W};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = (double) fArr[i11];
                i10++;
            }
        }
    }

    public void j(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.U;
        float f11 = this.V;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
    }

    public void k(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.S;
        float f11 = this.T;
        float f12 = this.U;
        float f13 = this.V;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        fArr[i10] = f10 + (f12 / 2.0f) + 0.0f;
        fArr[i10 + 1] = f11 + (f13 / 2.0f) + 0.0f;
    }

    public int l(String str, double[] dArr, int i10) {
        a aVar = this.Z.get(str);
        if (aVar.g() == 1) {
            dArr[i10] = (double) aVar.e();
            return 1;
        }
        int g10 = aVar.g();
        float[] fArr = new float[g10];
        aVar.f(fArr);
        int i11 = 0;
        while (i11 < g10) {
            dArr[i10] = (double) fArr[i11];
            i11++;
            i10++;
        }
        return g10;
    }

    public int m(String str) {
        return this.Z.get(str).g();
    }

    public void n(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.S;
        float f11 = this.T;
        float f12 = this.U;
        float f13 = this.V;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        float f15 = f12 + f10;
        float f16 = f13 + f11;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i13 = i10 + 1;
        fArr[i10] = f10 + 0.0f;
        int i14 = i13 + 1;
        fArr[i13] = f11 + 0.0f;
        int i15 = i14 + 1;
        fArr[i14] = f15 + 0.0f;
        int i16 = i15 + 1;
        fArr[i15] = f11 + 0.0f;
        int i17 = i16 + 1;
        fArr[i16] = f15 + 0.0f;
        int i18 = i17 + 1;
        fArr[i17] = f16 + 0.0f;
        fArr[i18] = f10 + 0.0f;
        fArr[i18 + 1] = f16 + 0.0f;
    }

    public boolean o(String str) {
        return this.Z.containsKey(str);
    }

    public void p(k kVar, r rVar, r rVar2) {
        k kVar2 = kVar;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        float f10 = ((float) kVar2.f13929a) / 100.0f;
        this.Q = f10;
        this.P = kVar2.C;
        float f11 = Float.isNaN(kVar2.D) ? f10 : kVar2.D;
        float f12 = Float.isNaN(kVar2.E) ? f10 : kVar2.E;
        float f13 = rVar4.U;
        float f14 = rVar3.U;
        float f15 = rVar4.V;
        float f16 = rVar3.V;
        this.R = this.Q;
        float f17 = rVar3.S;
        float f18 = rVar3.T;
        float f19 = (rVar4.S + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (rVar4.T + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = (f13 - f14) * f11;
        float f22 = f21 / 2.0f;
        this.S = (float) ((int) ((f17 + (f19 * f10)) - f22));
        float f23 = (f15 - f16) * f12;
        float f24 = f23 / 2.0f;
        this.T = (float) ((int) ((f18 + (f20 * f10)) - f24));
        this.U = (float) ((int) (f14 + f21));
        this.V = (float) ((int) (f16 + f23));
        k kVar3 = kVar;
        float f25 = Float.isNaN(kVar3.F) ? f10 : kVar3.F;
        float f26 = 0.0f;
        float f27 = Float.isNaN(kVar3.I) ? 0.0f : kVar3.I;
        if (!Float.isNaN(kVar3.G)) {
            f10 = kVar3.G;
        }
        if (!Float.isNaN(kVar3.H)) {
            f26 = kVar3.H;
        }
        this.f14122a0 = 2;
        r rVar5 = rVar;
        this.S = (float) ((int) (((rVar5.S + (f25 * f19)) + (f26 * f20)) - f22));
        this.T = (float) ((int) (((rVar5.T + (f19 * f27)) + (f20 * f10)) - f24));
        this.O = c.c(kVar3.A);
        this.Y = kVar3.B;
    }

    public void q(k kVar, r rVar, r rVar2) {
        k kVar2 = kVar;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        float f10 = ((float) kVar2.f13929a) / 100.0f;
        this.Q = f10;
        this.P = kVar2.C;
        float f11 = Float.isNaN(kVar2.D) ? f10 : kVar2.D;
        float f12 = Float.isNaN(kVar2.E) ? f10 : kVar2.E;
        float f13 = rVar4.U - rVar3.U;
        float f14 = rVar4.V - rVar3.V;
        this.R = this.Q;
        if (!Float.isNaN(kVar2.F)) {
            f10 = kVar2.F;
        }
        float f15 = rVar3.S;
        float f16 = rVar3.U;
        float f17 = rVar3.T;
        float f18 = rVar3.V;
        float f19 = (rVar4.S + (rVar4.U / 2.0f)) - ((f16 / 2.0f) + f15);
        float f20 = (rVar4.T + (rVar4.V / 2.0f)) - ((f18 / 2.0f) + f17);
        float f21 = f19 * f10;
        float f22 = f13 * f11;
        float f23 = f22 / 2.0f;
        this.S = (float) ((int) ((f15 + f21) - f23));
        float f24 = f10 * f20;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.T = (float) ((int) ((f17 + f24) - f26));
        this.U = (float) ((int) (f16 + f22));
        this.V = (float) ((int) (f18 + f25));
        k kVar3 = kVar;
        float f27 = Float.isNaN(kVar3.G) ? 0.0f : kVar3.G;
        float f28 = (-f20) * f27;
        float f29 = f19 * f27;
        this.f14122a0 = 1;
        r rVar5 = rVar;
        this.S = ((float) ((int) ((rVar5.S + f21) - f23))) + f28;
        this.T = ((float) ((int) ((rVar5.T + f24) - f26))) + f29;
        this.O = c.c(kVar3.A);
        this.Y = kVar3.B;
    }

    public void r(int i10, int i11, k kVar, r rVar, r rVar2) {
        k kVar2 = kVar;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        float f10 = ((float) kVar2.f13929a) / 100.0f;
        this.Q = f10;
        this.P = kVar2.C;
        float f11 = Float.isNaN(kVar2.D) ? f10 : kVar2.D;
        float f12 = Float.isNaN(kVar2.E) ? f10 : kVar2.E;
        float f13 = rVar4.U;
        float f14 = rVar3.U;
        float f15 = rVar4.V;
        float f16 = rVar3.V;
        this.R = this.Q;
        float f17 = rVar3.S;
        float f18 = rVar3.T;
        float f19 = rVar4.S + (f13 / 2.0f);
        float f20 = rVar4.T + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.S = (float) ((int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f)));
        float f22 = (f15 - f16) * f12;
        this.T = (float) ((int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f)));
        this.U = (float) ((int) (f14 + f21));
        this.V = (float) ((int) (f16 + f22));
        this.f14122a0 = 3;
        k kVar3 = kVar;
        if (!Float.isNaN(kVar3.F)) {
            this.S = (float) ((int) (kVar3.F * ((float) ((int) (((float) i10) - this.U)))));
        }
        if (!Float.isNaN(kVar3.G)) {
            this.T = (float) ((int) (kVar3.G * ((float) ((int) (((float) i11) - this.V)))));
        }
        this.O = c.c(kVar3.A);
        this.Y = kVar3.B;
    }

    public void s(float f10, float f11, float f12, float f13) {
        this.S = f10;
        this.T = f11;
        this.U = f12;
        this.V = f13;
    }

    public void t(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (java.lang.Float.isNaN(Float.NaN) == false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            float r3 = r0.S
            float r4 = r0.T
            float r5 = r0.U
            float r6 = r0.V
            int r7 = r2.length
            r8 = 1
            if (r7 == 0) goto L_0x0028
            double[] r7 = r0.f14123b0
            int r7 = r7.length
            int r9 = r2.length
            int r9 = r9 - r8
            r9 = r2[r9]
            if (r7 > r9) goto L_0x0028
            int r7 = r2.length
            int r7 = r7 - r8
            r7 = r2[r7]
            int r7 = r7 + r8
            double[] r9 = new double[r7]
            r0.f14123b0 = r9
            double[] r7 = new double[r7]
            r0.f14124c0 = r7
        L_0x0028:
            double[] r7 = r0.f14123b0
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r7, r9)
            r9 = 0
        L_0x0030:
            int r10 = r2.length
            if (r9 >= r10) goto L_0x0044
            double[] r10 = r0.f14123b0
            r11 = r2[r9]
            r12 = r24[r9]
            r10[r11] = r12
            double[] r10 = r0.f14124c0
            r12 = r25[r9]
            r10[r11] = r12
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0044:
            r10 = 0
            r11 = 2143289344(0x7fc00000, float:NaN)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x004b:
            double[] r7 = r0.f14123b0
            int r9 = r7.length
            if (r10 >= r9) goto L_0x00aa
            r17 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r17)
            r17 = 0
            if (r7 == 0) goto L_0x0066
            if (r26 == 0) goto L_0x0062
            r19 = r26[r10]
            int r7 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0066
        L_0x0062:
            r25 = r3
            r7 = r8
            goto L_0x0094
        L_0x0066:
            if (r26 == 0) goto L_0x006a
            r17 = r26[r10]
        L_0x006a:
            double[] r7 = r0.f14123b0
            r19 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r19)
            if (r7 == 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            double[] r7 = r0.f14123b0
            r19 = r7[r10]
            double r17 = r19 + r17
        L_0x007b:
            r25 = r3
            r2 = r17
            float r2 = (float) r2
            double[] r3 = r0.f14124c0
            r8 = r3[r10]
            float r3 = (float) r8
            r7 = 1
            if (r10 == r7) goto L_0x00a4
            r8 = 2
            if (r10 == r8) goto L_0x00a1
            r8 = 3
            if (r10 == r8) goto L_0x009e
            r8 = 4
            if (r10 == r8) goto L_0x009b
            r3 = 5
            if (r10 == r3) goto L_0x0097
        L_0x0094:
            r3 = r25
            goto L_0x00a6
        L_0x0097:
            r3 = r25
            r11 = r2
            goto L_0x00a6
        L_0x009b:
            r6 = r2
            r15 = r3
            goto L_0x0094
        L_0x009e:
            r5 = r2
            r13 = r3
            goto L_0x0094
        L_0x00a1:
            r4 = r2
            r14 = r3
            goto L_0x0094
        L_0x00a4:
            r12 = r3
            r3 = r2
        L_0x00a6:
            int r10 = r10 + 1
            r8 = r7
            goto L_0x004b
        L_0x00aa:
            r25 = r3
            r7 = r8
            boolean r2 = java.lang.Float.isNaN(r11)
            if (r2 == 0) goto L_0x00bf
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x00de
        L_0x00bb:
            r1.setRotation(r2)
            goto L_0x00de
        L_0x00bf:
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L_0x00c8
            r2 = 0
        L_0x00c8:
            r3 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r3
            float r12 = r12 + r13
            float r15 = r15 / r3
            float r14 = r14 + r15
            double r2 = (double) r2
            double r8 = (double) r11
            double r10 = (double) r14
            double r12 = (double) r12
            double r10 = java.lang.Math.atan2(r10, r12)
            double r10 = java.lang.Math.toDegrees(r10)
            double r8 = r8 + r10
            double r2 = r2 + r8
            float r2 = (float) r2
            goto L_0x00bb
        L_0x00de:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r25 + r2
            int r8 = (int) r3
            float r4 = r4 + r2
            int r2 = (int) r4
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            int r5 = r3 - r8
            int r6 = r4 - r2
            int r9 = r22.getMeasuredWidth()
            if (r5 != r9) goto L_0x00fd
            int r9 = r22.getMeasuredHeight()
            if (r6 == r9) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            r16 = 0
            goto L_0x00ff
        L_0x00fd:
            r16 = r7
        L_0x00ff:
            if (r16 == 0) goto L_0x010e
            r7 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r1.measure(r5, r6)
        L_0x010e:
            r1.layout(r8, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.r.u(android.view.View, int[], double[], double[], double[]):void");
    }
}

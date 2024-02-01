package v;

import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.d;
import java.util.HashSet;
import java.util.LinkedHashMap;
import u.c;
import z.e;

public class o implements Comparable<o> {

    /* renamed from: q0  reason: collision with root package name */
    public static final String f14062q0 = "MotionPaths";

    /* renamed from: r0  reason: collision with root package name */
    public static final boolean f14063r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f14064s0 = 1;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f14065t0 = 2;

    /* renamed from: u0  reason: collision with root package name */
    public static String[] f14066u0 = {"position", "x", "y", "width", "height", "pathRotate"};
    public float O = 1.0f;
    public int P = 0;
    public int Q;
    public boolean R = false;
    public float S = 0.0f;
    public float T = 0.0f;
    public float U = 0.0f;
    public float V = 0.0f;
    public float W = 1.0f;
    public float X = 1.0f;
    public float Y = Float.NaN;
    public float Z = Float.NaN;

    /* renamed from: a0  reason: collision with root package name */
    public float f14067a0 = 0.0f;

    /* renamed from: b0  reason: collision with root package name */
    public float f14068b0 = 0.0f;

    /* renamed from: c0  reason: collision with root package name */
    public float f14069c0 = 0.0f;

    /* renamed from: d0  reason: collision with root package name */
    public c f14070d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f14071e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public float f14072f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f14073g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f14074h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f14075i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f14076j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f14077k0 = Float.NaN;

    /* renamed from: l0  reason: collision with root package name */
    public float f14078l0 = Float.NaN;

    /* renamed from: m0  reason: collision with root package name */
    public LinkedHashMap<String, a> f14079m0 = new LinkedHashMap<>();

    /* renamed from: n0  reason: collision with root package name */
    public int f14080n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public double[] f14081o0 = new double[18];

    /* renamed from: p0  reason: collision with root package name */
    public double[] f14082p0 = new double[18];

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
        r2.f(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        r2.f(r9, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, v.t> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            v.t r2 = (v.t) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00c9;
                case -1249320805: goto L_0x00be;
                case -1225497657: goto L_0x00b3;
                case -1225497656: goto L_0x00a8;
                case -1225497655: goto L_0x009d;
                case -1001078227: goto L_0x0092;
                case -908189618: goto L_0x0087;
                case -908189617: goto L_0x007c;
                case -760884510: goto L_0x006e;
                case -760884509: goto L_0x0060;
                case -40300674: goto L_0x0052;
                case -4379043: goto L_0x0044;
                case 37232917: goto L_0x0036;
                case 92909918: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00d3
        L_0x0028:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00d3
        L_0x0032:
            r3 = 13
            goto L_0x00d3
        L_0x0036:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00d3
        L_0x0040:
            r3 = 12
            goto L_0x00d3
        L_0x0044:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00d3
        L_0x004e:
            r3 = 11
            goto L_0x00d3
        L_0x0052:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00d3
        L_0x005c:
            r3 = 10
            goto L_0x00d3
        L_0x0060:
            java.lang.String r4 = "transformPivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00d3
        L_0x006a:
            r3 = 9
            goto L_0x00d3
        L_0x006e:
            java.lang.String r4 = "transformPivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0078
            goto L_0x00d3
        L_0x0078:
            r3 = 8
            goto L_0x00d3
        L_0x007c:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0085
            goto L_0x00d3
        L_0x0085:
            r3 = 7
            goto L_0x00d3
        L_0x0087:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0090
            goto L_0x00d3
        L_0x0090:
            r3 = 6
            goto L_0x00d3
        L_0x0092:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x009b
            goto L_0x00d3
        L_0x009b:
            r3 = 5
            goto L_0x00d3
        L_0x009d:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r3 = 4
            goto L_0x00d3
        L_0x00a8:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b1
            goto L_0x00d3
        L_0x00b1:
            r3 = 3
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00bc
            goto L_0x00d3
        L_0x00bc:
            r3 = 2
            goto L_0x00d3
        L_0x00be:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            r3 = r5
            goto L_0x00d3
        L_0x00c9:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = 0
        L_0x00d3:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01db;
                case 2: goto L_0x01cf;
                case 3: goto L_0x01c3;
                case 4: goto L_0x01b7;
                case 5: goto L_0x01ab;
                case 6: goto L_0x019f;
                case 7: goto L_0x0193;
                case 8: goto L_0x0187;
                case 9: goto L_0x017b;
                case 10: goto L_0x016f;
                case 11: goto L_0x015f;
                case 12: goto L_0x0153;
                case 13: goto L_0x0143;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0134
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r4 = r7.f14079m0
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0125
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r4 = r7.f14079m0
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.a) r3
            boolean r4 = r2 instanceof v.t.b
            if (r4 == 0) goto L_0x0104
            v.t$b r2 = (v.t.b) r2
            r2.j(r9, r3)
            goto L_0x0008
        L_0x0104:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " splineSet not a CustomSet frame = "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = ", value"
            r4.append(r1)
            float r1 = r3.e()
            r4.append(r1)
            r4.append(r2)
            goto L_0x0008
        L_0x0125:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UNKNOWN customName "
            r1.append(r2)
            r1.append(r3)
            goto L_0x0008
        L_0x0134:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            goto L_0x0008
        L_0x0143:
            float r1 = r7.O
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            float r4 = r7.O
        L_0x014e:
            r2.f(r9, r4)
            goto L_0x0008
        L_0x0153:
            float r1 = r7.f14077k0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x015c
            goto L_0x016a
        L_0x015c:
            float r6 = r7.f14077k0
            goto L_0x016a
        L_0x015f:
            float r1 = r7.S
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            float r6 = r7.S
        L_0x016a:
            r2.f(r9, r6)
            goto L_0x0008
        L_0x016f:
            float r1 = r7.T
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0178
            goto L_0x016a
        L_0x0178:
            float r6 = r7.T
            goto L_0x016a
        L_0x017b:
            float r1 = r7.Z
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0184
            goto L_0x016a
        L_0x0184:
            float r6 = r7.Z
            goto L_0x016a
        L_0x0187:
            float r1 = r7.Y
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0190
            goto L_0x016a
        L_0x0190:
            float r6 = r7.Y
            goto L_0x016a
        L_0x0193:
            float r1 = r7.X
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x019c
            goto L_0x014e
        L_0x019c:
            float r4 = r7.X
            goto L_0x014e
        L_0x019f:
            float r1 = r7.W
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a8
            goto L_0x014e
        L_0x01a8:
            float r4 = r7.W
            goto L_0x014e
        L_0x01ab:
            float r1 = r7.f14078l0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b4
            goto L_0x016a
        L_0x01b4:
            float r6 = r7.f14078l0
            goto L_0x016a
        L_0x01b7:
            float r1 = r7.f14069c0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c0
            goto L_0x016a
        L_0x01c0:
            float r6 = r7.f14069c0
            goto L_0x016a
        L_0x01c3:
            float r1 = r7.f14068b0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01cc
            goto L_0x016a
        L_0x01cc:
            float r6 = r7.f14068b0
            goto L_0x016a
        L_0x01cf:
            float r1 = r7.f14067a0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01d8
            goto L_0x016a
        L_0x01d8:
            float r6 = r7.f14067a0
            goto L_0x016a
        L_0x01db:
            float r1 = r7.V
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01e4
            goto L_0x016a
        L_0x01e4:
            float r6 = r7.V
            goto L_0x016a
        L_0x01e7:
            float r1 = r7.U
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01f1
            goto L_0x016a
        L_0x01f1:
            float r6 = r7.U
            goto L_0x016a
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.o.a(java.util.HashMap, int):void");
    }

    public void b(View view) {
        this.Q = view.getVisibility();
        this.O = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.R = false;
        this.S = view.getElevation();
        this.T = view.getRotation();
        this.U = view.getRotationX();
        this.V = view.getRotationY();
        this.W = view.getScaleX();
        this.X = view.getScaleY();
        this.Y = view.getPivotX();
        this.Z = view.getPivotY();
        this.f14067a0 = view.getTranslationX();
        this.f14068b0 = view.getTranslationY();
        this.f14069c0 = view.getTranslationZ();
    }

    public void d(d.a aVar) {
        d.C0030d dVar = aVar.f1997b;
        int i10 = dVar.f2081c;
        this.P = i10;
        int i11 = dVar.f2080b;
        this.Q = i11;
        this.O = (i11 == 0 || i10 != 0) ? dVar.f2082d : 0.0f;
        d.e eVar = aVar.f2000e;
        this.R = eVar.f2107l;
        this.S = eVar.f2108m;
        this.T = eVar.f2097b;
        this.U = eVar.f2098c;
        this.V = eVar.f2099d;
        this.W = eVar.f2100e;
        this.X = eVar.f2101f;
        this.Y = eVar.f2102g;
        this.Z = eVar.f2103h;
        this.f14067a0 = eVar.f2104i;
        this.f14068b0 = eVar.f2105j;
        this.f14069c0 = eVar.f2106k;
        this.f14070d0 = c.c(aVar.f1998c.f2074c);
        d.c cVar = aVar.f1998c;
        this.f14077k0 = cVar.f2078g;
        this.f14071e0 = cVar.f2076e;
        this.f14078l0 = aVar.f1997b.f2083e;
        for (String next : aVar.f2001f.keySet()) {
            a aVar2 = aVar.f2001f.get(next);
            if (aVar2.d() != a.b.STRING_TYPE) {
                this.f14079m0.put(next, aVar2);
            }
        }
    }

    /* renamed from: e */
    public int compareTo(o oVar) {
        return Float.compare(this.f14072f0, oVar.f14072f0);
    }

    public final boolean i(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void j(o oVar, HashSet<String> hashSet) {
        if (i(this.O, oVar.O)) {
            hashSet.add(e.f13911g);
        }
        if (i(this.S, oVar.S)) {
            hashSet.add(e.f13912h);
        }
        int i10 = this.Q;
        int i11 = oVar.Q;
        if (i10 != i11 && this.P == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add(e.f13911g);
        }
        if (i(this.T, oVar.T)) {
            hashSet.add(e.f13913i);
        }
        if (!Float.isNaN(this.f14077k0) || !Float.isNaN(oVar.f14077k0)) {
            hashSet.add(e.f13918n);
        }
        if (!Float.isNaN(this.f14078l0) || !Float.isNaN(oVar.f14078l0)) {
            hashSet.add("progress");
        }
        if (i(this.U, oVar.U)) {
            hashSet.add(e.f13914j);
        }
        if (i(this.V, oVar.V)) {
            hashSet.add(e.f13915k);
        }
        if (i(this.Y, oVar.Y)) {
            hashSet.add(e.f13916l);
        }
        if (i(this.Z, oVar.Z)) {
            hashSet.add(e.f13917m);
        }
        if (i(this.W, oVar.W)) {
            hashSet.add(e.f13919o);
        }
        if (i(this.X, oVar.X)) {
            hashSet.add(e.f13920p);
        }
        if (i(this.f14067a0, oVar.f14067a0)) {
            hashSet.add(e.f13924t);
        }
        if (i(this.f14068b0, oVar.f14068b0)) {
            hashSet.add(e.f13925u);
        }
        if (i(this.f14069c0, oVar.f14069c0)) {
            hashSet.add(e.f13926v);
        }
    }

    public void k(o oVar, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | i(this.f14072f0, oVar.f14072f0);
        zArr[1] = zArr[1] | i(this.f14073g0, oVar.f14073g0);
        zArr[2] = zArr[2] | i(this.f14074h0, oVar.f14074h0);
        zArr[3] = zArr[3] | i(this.f14075i0, oVar.f14075i0);
        zArr[4] = i(this.f14076j0, oVar.f14076j0) | zArr[4];
    }

    public void l(double[] dArr, int[] iArr) {
        float[] fArr = {this.f14072f0, this.f14073g0, this.f14074h0, this.f14075i0, this.f14076j0, this.O, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f14067a0, this.f14068b0, this.f14069c0, this.f14077k0};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 18) {
                dArr[i10] = (double) fArr[i11];
                i10++;
            }
        }
    }

    public int m(String str, double[] dArr, int i10) {
        a aVar = this.f14079m0.get(str);
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

    public int n(String str) {
        return this.f14079m0.get(str).g();
    }

    public boolean o(String str) {
        return this.f14079m0.containsKey(str);
    }

    public void p(float f10, float f11, float f12, float f13) {
        this.f14073g0 = f10;
        this.f14074h0 = f11;
        this.f14075i0 = f12;
        this.f14076j0 = f13;
    }

    public void q(View view) {
        p(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        b(view);
    }

    public void r(e eVar, d dVar, int i10) {
        p((float) eVar.k0(), (float) eVar.l0(), (float) eVar.j0(), (float) eVar.D());
        d(dVar.h0(i10));
    }
}

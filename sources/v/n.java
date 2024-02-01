package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class n extends e {
    public static final String S = "KeyTrigger";
    public static final String T = "KeyTrigger";
    public static final int U = 5;
    public int A;
    public String B;
    public String C;
    public int D;
    public int E;
    public View F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float K;
    public Method L;
    public Method M;
    public Method N;
    public float O;
    public boolean P;
    public RectF Q;
    public RectF R;

    /* renamed from: y  reason: collision with root package name */
    public int f14049y = -1;

    /* renamed from: z  reason: collision with root package name */
    public String f14050z = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f14051a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f14052b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f14053c = 4;

        /* renamed from: d  reason: collision with root package name */
        public static final int f14054d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final int f14055e = 6;

        /* renamed from: f  reason: collision with root package name */
        public static final int f14056f = 7;

        /* renamed from: g  reason: collision with root package name */
        public static final int f14057g = 8;

        /* renamed from: h  reason: collision with root package name */
        public static final int f14058h = 9;

        /* renamed from: i  reason: collision with root package name */
        public static final int f14059i = 10;

        /* renamed from: j  reason: collision with root package name */
        public static final int f14060j = 11;

        /* renamed from: k  reason: collision with root package name */
        public static SparseIntArray f14061k;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14061k = sparseIntArray;
            sparseIntArray.append(e.m.KeyTrigger_framePosition, 8);
            f14061k.append(e.m.KeyTrigger_onCross, 4);
            f14061k.append(e.m.KeyTrigger_onNegativeCross, 1);
            f14061k.append(e.m.KeyTrigger_onPositiveCross, 2);
            f14061k.append(e.m.KeyTrigger_motionTarget, 7);
            f14061k.append(e.m.KeyTrigger_triggerId, 6);
            f14061k.append(e.m.KeyTrigger_triggerSlack, 5);
            f14061k.append(e.m.KeyTrigger_motion_triggerOnCollision, 9);
            f14061k.append(e.m.KeyTrigger_motion_postLayoutCollision, 10);
            f14061k.append(e.m.KeyTrigger_triggerReceiver, 11);
        }

        public static void a(n nVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f14061k.get(index)) {
                    case 1:
                        String unused = nVar.B = typedArray.getString(index);
                        continue;
                    case 2:
                        String unused2 = nVar.C = typedArray.getString(index);
                        continue;
                    case 4:
                        String unused3 = nVar.f14050z = typedArray.getString(index);
                        continue;
                    case 5:
                        nVar.G = typedArray.getFloat(index, nVar.G);
                        continue;
                    case 6:
                        int unused4 = nVar.D = typedArray.getResourceId(index, nVar.D);
                        continue;
                    case 7:
                        if (!MotionLayout.S1) {
                            if (typedArray.peekValue(index).type != 3) {
                                nVar.f13930b = typedArray.getResourceId(index, nVar.f13930b);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, nVar.f13930b);
                            nVar.f13930b = resourceId;
                            if (resourceId != -1) {
                                continue;
                            }
                        }
                        nVar.f13931c = typedArray.getString(index);
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, nVar.f13929a);
                        nVar.f13929a = integer;
                        float unused5 = nVar.K = (((float) integer) + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        int unused6 = nVar.E = typedArray.getResourceId(index, nVar.E);
                        continue;
                    case 10:
                        boolean unused7 = nVar.P = typedArray.getBoolean(index, nVar.P);
                        continue;
                    case 11:
                        int unused8 = nVar.A = typedArray.getResourceId(index, nVar.A);
                        break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unused attribute 0x");
                sb2.append(Integer.toHexString(index));
                sb2.append("   ");
                sb2.append(f14061k.get(index));
            }
        }
    }

    public n() {
        int i10 = e.f13910f;
        this.A = i10;
        this.B = null;
        this.C = null;
        this.D = i10;
        this.E = i10;
        this.F = null;
        this.G = 0.1f;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = Float.NaN;
        this.P = false;
        this.Q = new RectF();
        this.R = new RectF();
        this.f13932d = 5;
        this.f13933e = new HashMap<>();
    }

    public void a(HashMap<String, t> hashMap) {
    }

    public void b(HashSet<String> hashSet) {
    }

    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, e.m.KeyTrigger), context);
    }

    public void f(String str, Object obj) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.E
            int r1 = v.e.f13910f
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            android.view.View r0 = r9.F
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.E
            android.view.View r0 = r0.findViewById(r1)
            r9.F = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.Q
            android.view.View r1 = r9.F
            boolean r4 = r9.P
            r9.x(r0, r1, r4)
            android.graphics.RectF r0 = r9.R
            boolean r1 = r9.P
            r9.x(r0, r11, r1)
            android.graphics.RectF r0 = r9.Q
            android.graphics.RectF r1 = r9.R
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.H
            if (r0 == 0) goto L_0x003c
            r9.H = r3
            r0 = r2
            goto L_0x003d
        L_0x003c:
            r0 = r3
        L_0x003d:
            boolean r1 = r9.J
            if (r1 == 0) goto L_0x0045
            r9.J = r3
            r1 = r2
            goto L_0x0046
        L_0x0045:
            r1 = r3
        L_0x0046:
            r9.I = r2
            r2 = r1
            r1 = r3
            goto L_0x00db
        L_0x004c:
            boolean r0 = r9.H
            if (r0 != 0) goto L_0x0054
            r9.H = r2
            r0 = r2
            goto L_0x0055
        L_0x0054:
            r0 = r3
        L_0x0055:
            boolean r1 = r9.I
            if (r1 == 0) goto L_0x005d
            r9.I = r3
            r1 = r2
            goto L_0x005e
        L_0x005d:
            r1 = r3
        L_0x005e:
            r9.J = r2
            r2 = r3
            goto L_0x00db
        L_0x0063:
            boolean r0 = r9.H
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.K
            float r4 = r10 - r0
            float r5 = r9.O
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.H = r3
            r0 = r2
            goto L_0x0089
        L_0x0078:
            float r0 = r9.K
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.G
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.H = r2
        L_0x0088:
            r0 = r3
        L_0x0089:
            boolean r4 = r9.I
            if (r4 == 0) goto L_0x00a1
            float r4 = r9.K
            float r5 = r10 - r4
            float r6 = r9.O
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b1
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b1
            r9.I = r3
            r4 = r2
            goto L_0x00b2
        L_0x00a1:
            float r4 = r9.K
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.G
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b1
            r9.I = r2
        L_0x00b1:
            r4 = r3
        L_0x00b2:
            boolean r5 = r9.J
            if (r5 == 0) goto L_0x00c9
            float r5 = r9.K
            float r6 = r10 - r5
            float r7 = r9.O
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00d9
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d9
            r9.J = r3
            goto L_0x00da
        L_0x00c9:
            float r1 = r9.K
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.G
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d9
            r9.J = r2
        L_0x00d9:
            r2 = r3
        L_0x00da:
            r1 = r4
        L_0x00db:
            r9.O = r10
            if (r1 != 0) goto L_0x00e3
            if (r0 != 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00ee
        L_0x00e3:
            android.view.ViewParent r4 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r9.D
            r4.q0(r5, r2, r10)
        L_0x00ee:
            int r10 = r9.A
            int r4 = v.e.f13910f
            if (r10 != r4) goto L_0x00f5
            goto L_0x0101
        L_0x00f5:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r11 = r9.A
            android.view.View r11 = r10.findViewById(r11)
        L_0x0101:
            java.lang.String r10 = "Could not find method \""
            java.lang.String r4 = "Exception in call \""
            java.lang.String r5 = " "
            java.lang.String r6 = "\"on class "
            if (r1 == 0) goto L_0x0174
            java.lang.String r1 = r9.B
            if (r1 == 0) goto L_0x0174
            java.lang.reflect.Method r1 = r9.M
            if (r1 != 0) goto L_0x0147
            java.lang.Class r1 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x0122 }
            java.lang.String r7 = r9.B     // Catch:{ NoSuchMethodException -> 0x0122 }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0122 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0122 }
            r9.M = r1     // Catch:{ NoSuchMethodException -> 0x0122 }
            goto L_0x0147
        L_0x0122:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r7 = r9.B
            r1.append(r7)
            r1.append(r6)
            java.lang.Class r7 = r11.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = v.c.k(r11)
            r1.append(r7)
        L_0x0147:
            java.lang.reflect.Method r1 = r9.M     // Catch:{ Exception -> 0x014f }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x014f }
            r1.invoke(r11, r7)     // Catch:{ Exception -> 0x014f }
            goto L_0x0174
        L_0x014f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r7 = r9.B
            r1.append(r7)
            r1.append(r6)
            java.lang.Class r7 = r11.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = v.c.k(r11)
            r1.append(r7)
        L_0x0174:
            if (r2 == 0) goto L_0x01df
            java.lang.String r1 = r9.C
            if (r1 == 0) goto L_0x01df
            java.lang.reflect.Method r1 = r9.N
            if (r1 != 0) goto L_0x01b2
            java.lang.Class r1 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.String r2 = r9.C     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x018d }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch:{ NoSuchMethodException -> 0x018d }
            r9.N = r1     // Catch:{ NoSuchMethodException -> 0x018d }
            goto L_0x01b2
        L_0x018d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r2 = r9.C
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = v.c.k(r11)
            r1.append(r2)
        L_0x01b2:
            java.lang.reflect.Method r1 = r9.N     // Catch:{ Exception -> 0x01ba }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01ba }
            r1.invoke(r11, r2)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01df
        L_0x01ba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r9.C
            r1.append(r2)
            r1.append(r6)
            java.lang.Class r2 = r11.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = v.c.k(r11)
            r1.append(r2)
        L_0x01df:
            if (r0 == 0) goto L_0x024a
            java.lang.String r0 = r9.f14050z
            if (r0 == 0) goto L_0x024a
            java.lang.reflect.Method r0 = r9.L
            if (r0 != 0) goto L_0x021d
            java.lang.Class r0 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x01f8 }
            java.lang.String r1 = r9.f14050z     // Catch:{ NoSuchMethodException -> 0x01f8 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x01f8 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x01f8 }
            r9.L = r0     // Catch:{ NoSuchMethodException -> 0x01f8 }
            goto L_0x021d
        L_0x01f8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = r9.f14050z
            r0.append(r10)
            r0.append(r6)
            java.lang.Class r10 = r11.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r0.append(r10)
            r0.append(r5)
            java.lang.String r10 = v.c.k(r11)
            r0.append(r10)
        L_0x021d:
            java.lang.reflect.Method r10 = r9.L     // Catch:{ Exception -> 0x0225 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0225 }
            r10.invoke(r11, r0)     // Catch:{ Exception -> 0x0225 }
            goto L_0x024a
        L_0x0225:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r0 = r9.f14050z
            r10.append(r0)
            r10.append(r6)
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r11 = v.c.k(r11)
            r10.append(r11)
        L_0x024a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.v(float, android.view.View):void");
    }

    public int w() {
        return this.f14049y;
    }

    public final void x(RectF rectF, View view, boolean z10) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }
}

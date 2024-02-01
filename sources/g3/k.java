package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import f1.w1;
import g3.d0;
import k0.l;
import org.xmlpull.v1.XmlPullParser;

public class k extends j0 {
    public static final String N0 = "android:changeTransform:matrix";
    public static final String O0 = "android:changeTransform:transforms";
    public static final String P0 = "android:changeTransform:parent";
    public static final String Q0 = "android:changeTransform:parentMatrix";
    public static final String R0 = "android:changeTransform:intermediateParentMatrix";
    public static final String S0 = "android:changeTransform:intermediateMatrix";
    public static final String[] T0 = {N0, O0, Q0};
    public static final Property<e, float[]> U0 = new a(float[].class, "nonTranslations");
    public static final Property<e, PointF> V0 = new b(PointF.class, "translations");
    public static final boolean W0 = true;
    public boolean K0 = true;
    public boolean L0 = true;
    public Matrix M0 = new Matrix();

    public static class a extends Property<e, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    public static class b extends Property<e, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7778a;

        /* renamed from: b  reason: collision with root package name */
        public Matrix f7779b = new Matrix();

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f7780c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Matrix f7781d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ View f7782e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f f7783f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f7784g;

        public c(boolean z10, Matrix matrix, View view, f fVar, e eVar) {
            this.f7780c = z10;
            this.f7781d = matrix;
            this.f7782e = view;
            this.f7783f = fVar;
            this.f7784g = eVar;
        }

        public final void a(Matrix matrix) {
            this.f7779b.set(matrix);
            this.f7782e.setTag(d0.e.transition_transform, this.f7779b);
            this.f7783f.a(this.f7782e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f7778a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7778a) {
                if (!this.f7780c || !k.this.K0) {
                    this.f7782e.setTag(d0.e.transition_transform, (Object) null);
                    this.f7782e.setTag(d0.e.parent_matrix, (Object) null);
                } else {
                    a(this.f7781d);
                }
            }
            e1.f(this.f7782e, (Matrix) null);
            this.f7783f.a(this.f7782e);
        }

        public void onAnimationPause(Animator animator) {
            a(this.f7784g.a());
        }

        public void onAnimationResume(Animator animator) {
            k.N0(this.f7782e);
        }
    }

    public static class d extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public View f7786a;

        /* renamed from: b  reason: collision with root package name */
        public q f7787b;

        public d(View view, q qVar) {
            this.f7786a = view;
            this.f7787b = qVar;
        }

        public void a(@m0 j0 j0Var) {
            this.f7787b.setVisibility(4);
        }

        public void c(@m0 j0 j0Var) {
            this.f7787b.setVisibility(0);
        }

        public void e(@m0 j0 j0Var) {
            j0Var.o0(this);
            u.b(this.f7786a);
            this.f7786a.setTag(d0.e.transition_transform, (Object) null);
            this.f7786a.setTag(d0.e.parent_matrix, (Object) null);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f7788a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final View f7789b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f7790c;

        /* renamed from: d  reason: collision with root package name */
        public float f7791d;

        /* renamed from: e  reason: collision with root package name */
        public float f7792e;

        public e(View view, float[] fArr) {
            this.f7789b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f7790c = fArr2;
            this.f7791d = fArr2[2];
            this.f7792e = fArr2[5];
            b();
        }

        public Matrix a() {
            return this.f7788a;
        }

        public final void b() {
            float[] fArr = this.f7790c;
            fArr[2] = this.f7791d;
            fArr[5] = this.f7792e;
            this.f7788a.setValues(fArr);
            e1.f(this.f7789b, this.f7788a);
        }

        public void c(PointF pointF) {
            this.f7791d = pointF.x;
            this.f7792e = pointF.y;
            b();
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f7790c, 0, fArr.length);
            b();
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final float f7793a;

        /* renamed from: b  reason: collision with root package name */
        public final float f7794b;

        /* renamed from: c  reason: collision with root package name */
        public final float f7795c;

        /* renamed from: d  reason: collision with root package name */
        public final float f7796d;

        /* renamed from: e  reason: collision with root package name */
        public final float f7797e;

        /* renamed from: f  reason: collision with root package name */
        public final float f7798f;

        /* renamed from: g  reason: collision with root package name */
        public final float f7799g;

        /* renamed from: h  reason: collision with root package name */
        public final float f7800h;

        public f(View view) {
            this.f7793a = view.getTranslationX();
            this.f7794b = view.getTranslationY();
            this.f7795c = w1.z0(view);
            this.f7796d = view.getScaleX();
            this.f7797e = view.getScaleY();
            this.f7798f = view.getRotationX();
            this.f7799g = view.getRotationY();
            this.f7800h = view.getRotation();
        }

        public void a(View view) {
            k.R0(view, this.f7793a, this.f7794b, this.f7795c, this.f7796d, this.f7797e, this.f7798f, this.f7799g, this.f7800h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f7793a == this.f7793a && fVar.f7794b == this.f7794b && fVar.f7795c == this.f7795c && fVar.f7796d == this.f7796d && fVar.f7797e == this.f7797e && fVar.f7798f == this.f7798f && fVar.f7799g == this.f7799g && fVar.f7800h == this.f7800h;
        }

        public int hashCode() {
            float f10 = this.f7793a;
            int i10 = 0;
            int floatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f7794b;
            int floatToIntBits2 = (floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f7795c;
            int floatToIntBits3 = (floatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f7796d;
            int floatToIntBits4 = (floatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f7797e;
            int floatToIntBits5 = (floatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f7798f;
            int floatToIntBits6 = (floatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f7799g;
            int floatToIntBits7 = (floatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f7800h;
            if (f17 != 0.0f) {
                i10 = Float.floatToIntBits(f17);
            }
            return floatToIntBits7 + i10;
        }
    }

    public k() {
    }

    @SuppressLint({"RestrictedApi"})
    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7715g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.K0 = l.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.L0 = l.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public static void N0(View view) {
        R0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void R0(View view, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        w1.u2(view, f12);
        view.setScaleX(f13);
        view.setScaleY(f14);
        view.setRotationX(f15);
        view.setRotationY(f16);
        view.setRotation(f17);
    }

    public final void H0(r0 r0Var) {
        View view = r0Var.f7848b;
        if (view.getVisibility() != 8) {
            r0Var.f7847a.put(P0, view.getParent());
            r0Var.f7847a.put(O0, new f(view));
            Matrix matrix = view.getMatrix();
            r0Var.f7847a.put(N0, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.L0) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                e1.j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                r0Var.f7847a.put(Q0, matrix2);
                r0Var.f7847a.put(S0, view.getTag(d0.e.transition_transform));
                r0Var.f7847a.put(R0, view.getTag(d0.e.parent_matrix));
            }
        }
    }

    public final void I0(ViewGroup viewGroup, r0 r0Var, r0 r0Var2) {
        View view = r0Var2.f7848b;
        Matrix matrix = new Matrix((Matrix) r0Var2.f7847a.get(Q0));
        e1.k(viewGroup, matrix);
        q a10 = u.a(view, viewGroup, matrix);
        if (a10 != null) {
            a10.a((ViewGroup) r0Var.f7847a.get(P0), r0Var.f7848b);
            j0 j0Var = this;
            while (true) {
                j0 j0Var2 = j0Var.f7754f0;
                if (j0Var2 == null) {
                    break;
                }
                j0Var = j0Var2;
            }
            j0Var.a(new d(view, a10));
            if (W0) {
                View view2 = r0Var.f7848b;
                if (view2 != r0Var2.f7848b) {
                    e1.h(view2, 0.0f);
                }
                e1.h(view, 1.0f);
            }
        }
    }

    public final ObjectAnimator J0(r0 r0Var, r0 r0Var2, boolean z10) {
        Matrix matrix = (Matrix) r0Var.f7847a.get(N0);
        Matrix matrix2 = (Matrix) r0Var2.f7847a.get(N0);
        if (matrix == null) {
            matrix = x.f7895a;
        }
        if (matrix2 == null) {
            matrix2 = x.f7895a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = r0Var2.f7848b;
        N0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(U0, new o(new float[9]), new float[][]{fArr, fArr2}), c0.a(V0, S().a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        c cVar = new c(z10, matrix3, view, (f) r0Var2.f7847a.get(O0), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    public boolean K0() {
        return this.L0;
    }

    public boolean L0() {
        return this.K0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f7848b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.e0(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.e0(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            g3.r0 r4 = r3.Q(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f7848b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.k.M0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    public final void O0(r0 r0Var, r0 r0Var2) {
        Matrix matrix = (Matrix) r0Var2.f7847a.get(Q0);
        r0Var2.f7848b.setTag(d0.e.parent_matrix, matrix);
        Matrix matrix2 = this.M0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) r0Var.f7847a.get(N0);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            r0Var.f7847a.put(N0, matrix3);
        }
        matrix3.postConcat((Matrix) r0Var.f7847a.get(Q0));
        matrix3.postConcat(matrix2);
    }

    public void P0(boolean z10) {
        this.L0 = z10;
    }

    public void Q0(boolean z10) {
        this.K0 = z10;
    }

    public String[] a0() {
        return T0;
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
        if (!W0) {
            ((ViewGroup) r0Var.f7848b.getParent()).startViewTransition(r0Var.f7848b);
        }
    }

    public Animator x(@m0 ViewGroup viewGroup, r0 r0Var, r0 r0Var2) {
        if (r0Var == null || r0Var2 == null || !r0Var.f7847a.containsKey(P0) || !r0Var2.f7847a.containsKey(P0)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) r0Var.f7847a.get(P0);
        boolean z10 = this.L0 && !M0(viewGroup2, (ViewGroup) r0Var2.f7847a.get(P0));
        Matrix matrix = (Matrix) r0Var.f7847a.get(S0);
        if (matrix != null) {
            r0Var.f7847a.put(N0, matrix);
        }
        Matrix matrix2 = (Matrix) r0Var.f7847a.get(R0);
        if (matrix2 != null) {
            r0Var.f7847a.put(Q0, matrix2);
        }
        if (z10) {
            O0(r0Var, r0Var2);
        }
        ObjectAnimator J0 = J0(r0Var, r0Var2, z10);
        if (z10 && J0 != null && this.K0) {
            I0(viewGroup, r0Var, r0Var2);
        } else if (!W0) {
            viewGroup2.endViewTransition(r0Var.f7848b);
        }
        return J0;
    }
}

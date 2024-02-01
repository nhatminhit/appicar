package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import f1.w1;
import java.util.Map;
import k0.l;

public class g extends j0 {
    public static final String N0 = "android:changeBounds:bounds";
    public static final String O0 = "android:changeBounds:clip";
    public static final String P0 = "android:changeBounds:parent";
    public static final String Q0 = "android:changeBounds:windowX";
    public static final String R0 = "android:changeBounds:windowY";
    public static final String[] S0 = {N0, O0, P0, Q0, R0};
    public static final Property<Drawable, PointF> T0 = new b(PointF.class, "boundsOrigin");
    public static final Property<k, PointF> U0 = new c(PointF.class, "topLeft");
    public static final Property<k, PointF> V0 = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> W0 = new e(PointF.class, "bottomRight");
    public static final Property<View, PointF> X0 = new f(PointF.class, "topLeft");
    public static final Property<View, PointF> Y0 = new C0134g(PointF.class, "position");
    public static e0 Z0 = new e0();
    public int[] K0 = new int[2];
    public boolean L0 = false;
    public boolean M0 = false;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7675a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f7676b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7677c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f7678d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f7675a = viewGroup;
            this.f7676b = bitmapDrawable;
            this.f7677c = view;
            this.f7678d = f10;
        }

        public void onAnimationEnd(Animator animator) {
            e1.b(this.f7675a).b(this.f7676b);
            e1.h(this.f7677c, this.f7678d);
        }
    }

    public static class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f7680a = new Rect();

        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f7680a);
            Rect rect = this.f7680a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f7680a);
            this.f7680a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f7680a);
        }
    }

    public static class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    public static class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            e1.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            e1.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: g3.g$g  reason: collision with other inner class name */
    public static class C0134g extends Property<View, PointF> {
        public C0134g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            e1.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f7681a;
        private k mViewBounds;

        public h(k kVar) {
            this.f7681a = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7683a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7684b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f7685c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f7686d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f7687e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7688f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f7689g;

        public i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f7684b = view;
            this.f7685c = rect;
            this.f7686d = i10;
            this.f7687e = i11;
            this.f7688f = i12;
            this.f7689g = i13;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7683a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7683a) {
                w1.K1(this.f7684b, this.f7685c);
                e1.g(this.f7684b, this.f7686d, this.f7687e, this.f7688f, this.f7689g);
            }
        }
    }

    public class j extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7691a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7692b;

        public j(ViewGroup viewGroup) {
            this.f7692b = viewGroup;
        }

        public void a(@m0 j0 j0Var) {
            z0.d(this.f7692b, false);
        }

        public void c(@m0 j0 j0Var) {
            z0.d(this.f7692b, true);
        }

        public void d(@m0 j0 j0Var) {
            z0.d(this.f7692b, false);
            this.f7691a = true;
        }

        public void e(@m0 j0 j0Var) {
            if (!this.f7691a) {
                z0.d(this.f7692b, false);
            }
            j0Var.o0(this);
        }
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f7694a;

        /* renamed from: b  reason: collision with root package name */
        public int f7695b;

        /* renamed from: c  reason: collision with root package name */
        public int f7696c;

        /* renamed from: d  reason: collision with root package name */
        public int f7697d;

        /* renamed from: e  reason: collision with root package name */
        public View f7698e;

        /* renamed from: f  reason: collision with root package name */
        public int f7699f;

        /* renamed from: g  reason: collision with root package name */
        public int f7700g;

        public k(View view) {
            this.f7698e = view;
        }

        public void a(PointF pointF) {
            this.f7696c = Math.round(pointF.x);
            this.f7697d = Math.round(pointF.y);
            int i10 = this.f7700g + 1;
            this.f7700g = i10;
            if (this.f7699f == i10) {
                b();
            }
        }

        public final void b() {
            e1.g(this.f7698e, this.f7694a, this.f7695b, this.f7696c, this.f7697d);
            this.f7699f = 0;
            this.f7700g = 0;
        }

        public void c(PointF pointF) {
            this.f7694a = Math.round(pointF.x);
            this.f7695b = Math.round(pointF.y);
            int i10 = this.f7699f + 1;
            this.f7699f = i10;
            if (i10 == this.f7700g) {
                b();
            }
        }
    }

    public g() {
    }

    @SuppressLint({"RestrictedApi"})
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7712d);
        boolean e10 = l.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        K0(e10);
    }

    public final void H0(r0 r0Var) {
        View view = r0Var.f7848b;
        if (w1.T0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            r0Var.f7847a.put(N0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            r0Var.f7847a.put(P0, r0Var.f7848b.getParent());
            if (this.M0) {
                r0Var.f7848b.getLocationInWindow(this.K0);
                r0Var.f7847a.put(Q0, Integer.valueOf(this.K0[0]));
                r0Var.f7847a.put(R0, Integer.valueOf(this.K0[1]));
            }
            if (this.L0) {
                r0Var.f7847a.put(O0, w1.N(view));
            }
        }
    }

    public boolean I0() {
        return this.L0;
    }

    public final boolean J0(View view, View view2) {
        if (!this.M0) {
            return true;
        }
        r0 Q = Q(view, true);
        if (Q == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == Q.f7848b) {
            return true;
        }
        return false;
    }

    public void K0(boolean z10) {
        this.L0 = z10;
    }

    @o0
    public String[] a0() {
        return S0;
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
    }

    @o0
    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        int i10;
        View view;
        Animator animator;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        r0 r0Var3 = r0Var;
        r0 r0Var4 = r0Var2;
        if (r0Var3 == null || r0Var4 == null) {
            return null;
        }
        Map<String, Object> map = r0Var3.f7847a;
        Map<String, Object> map2 = r0Var4.f7847a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(P0);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(P0);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = r0Var4.f7848b;
        if (J0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) r0Var3.f7847a.get(N0);
            Rect rect3 = (Rect) r0Var4.f7847a.get(N0);
            int i12 = rect2.left;
            int i13 = rect3.left;
            int i14 = rect2.top;
            int i15 = rect3.top;
            int i16 = rect2.right;
            int i17 = rect3.right;
            int i18 = rect2.bottom;
            int i19 = rect3.bottom;
            int i20 = i16 - i12;
            int i21 = i18 - i14;
            int i22 = i17 - i13;
            int i23 = i19 - i15;
            View view3 = view2;
            Rect rect4 = (Rect) r0Var3.f7847a.get(O0);
            Rect rect5 = (Rect) r0Var4.f7847a.get(O0);
            if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
                i10 = 0;
            } else {
                i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
                if (!(i16 == i17 && i18 == i19)) {
                    i10++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i10++;
            }
            if (i10 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.L0) {
                view = view3;
                e1.g(view, i12, i14, i16, i18);
                if (i10 == 2) {
                    if (i20 == i22 && i21 == i23) {
                        path = S().a((float) i12, (float) i14, (float) i13, (float) i15);
                        property = Y0;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a10 = y.a(kVar, U0, S().a((float) i12, (float) i14, (float) i13, (float) i15));
                        ObjectAnimator a11 = y.a(kVar, V0, S().a((float) i16, (float) i18, (float) i17, (float) i19));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a10, a11});
                        animatorSet.addListener(new h(kVar));
                        animator = animatorSet;
                    }
                } else if (i12 == i13 && i14 == i15) {
                    path = S().a((float) i16, (float) i18, (float) i17, (float) i19);
                    property = W0;
                } else {
                    path = S().a((float) i12, (float) i14, (float) i13, (float) i15);
                    property = X0;
                }
                animator = y.a(view, property, path);
            } else {
                view = view3;
                e1.g(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                ObjectAnimator a12 = (i12 == i13 && i14 == i15) ? null : y.a(view, Y0, S().a((float) i12, (float) i14, (float) i13, (float) i15));
                if (rect7 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i11, i11, i22, i23) : rect6;
                if (!rect.equals(rect8)) {
                    w1.K1(view, rect);
                    e0 e0Var = Z0;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", e0Var, objArr);
                    ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = q0.c(a12, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                z0.d(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) r0Var3.f7847a.get(Q0)).intValue();
        int intValue2 = ((Integer) r0Var3.f7847a.get(R0)).intValue();
        int intValue3 = ((Integer) r0Var4.f7847a.get(Q0)).intValue();
        int intValue4 = ((Integer) r0Var4.f7847a.get(R0)).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.K0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c10 = e1.c(view2);
        e1.h(view2, 0.0f);
        e1.b(viewGroup).a(bitmapDrawable);
        z S = S();
        int[] iArr = this.K0;
        int i24 = iArr[0];
        int i25 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{c0.a(T0, S.a((float) (intValue - i24), (float) (intValue2 - i25), (float) (intValue3 - i24), (float) (intValue4 - i25)))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c10));
        return ofPropertyValuesHolder;
    }
}

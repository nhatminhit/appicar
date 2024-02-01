package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import d.m0;
import d.o0;
import e1.n;
import f1.w1;
import i9.a;
import java.util.ArrayList;
import java.util.Iterator;
import z9.o;
import z9.s;

public class a {
    public static final TimeInterpolator F = j9.a.f19830c;
    public static final long G = 100;
    public static final long H = 100;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final float L = 1.5f;
    public static final float M = 0.0f;
    public static final float N = 0.0f;
    public static final float O = 0.0f;
    public static final float P = 1.0f;
    public static final float Q = 1.0f;
    public static final float R = 1.0f;
    public static final int[] S = {16842919, 16842910};
    public static final int[] T = {16843623, 16842908, 16842910};
    public static final int[] U = {16842908, 16842910};
    public static final int[] V = {16843623, 16842910};
    public static final int[] W = {16842910};
    public static final int[] X = new int[0];
    public final Rect A = new Rect();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public final Matrix D = new Matrix();
    @o0
    public ViewTreeObserver.OnPreDrawListener E;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public o f17086a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public z9.j f17087b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public Drawable f17088c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public t9.c f17089d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public Drawable f17090e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17091f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17092g = true;

    /* renamed from: h  reason: collision with root package name */
    public float f17093h;

    /* renamed from: i  reason: collision with root package name */
    public float f17094i;

    /* renamed from: j  reason: collision with root package name */
    public float f17095j;

    /* renamed from: k  reason: collision with root package name */
    public int f17096k;
    @m0

    /* renamed from: l  reason: collision with root package name */
    public final com.google.android.material.internal.i f17097l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public j9.h f17098m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public j9.h f17099n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public Animator f17100o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public j9.h f17101p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public j9.h f17102q;

    /* renamed from: r  reason: collision with root package name */
    public float f17103r;

    /* renamed from: s  reason: collision with root package name */
    public float f17104s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public int f17105t;

    /* renamed from: u  reason: collision with root package name */
    public int f17106u = 0;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f17107v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f17108w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<i> f17109x;

    /* renamed from: y  reason: collision with root package name */
    public final FloatingActionButton f17110y;

    /* renamed from: z  reason: collision with root package name */
    public final y9.c f17111z;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    public class C0279a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17112a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f17113b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f17114c;

        public C0279a(boolean z10, j jVar) {
            this.f17113b = z10;
            this.f17114c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f17112a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = a.this.f17106u = 0;
            Animator unused2 = a.this.f17100o = null;
            if (!this.f17112a) {
                FloatingActionButton floatingActionButton = a.this.f17110y;
                boolean z10 = this.f17113b;
                floatingActionButton.c(z10 ? 8 : 4, z10);
                j jVar = this.f17114c;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f17110y.c(0, this.f17113b);
            int unused = a.this.f17106u = 1;
            Animator unused2 = a.this.f17100o = animator;
            this.f17112a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17116a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f17117b;

        public b(boolean z10, j jVar) {
            this.f17116a = z10;
            this.f17117b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = a.this.f17106u = 0;
            Animator unused2 = a.this.f17100o = null;
            j jVar = this.f17117b;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f17110y.c(0, this.f17116a);
            int unused = a.this.f17106u = 2;
            Animator unused2 = a.this.f17100o = animator;
        }
    }

    public class c extends j9.g {
        public c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f10, @m0 Matrix matrix, @m0 Matrix matrix2) {
            float unused = a.this.f17104s = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        public FloatEvaluator f17120a = new FloatEvaluator();

        public d() {
        }

        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f17120a.evaluate(f10, f11, f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        public boolean onPreDraw() {
            a.this.H();
            return true;
        }
    }

    public class f extends l {
        public f() {
            super(a.this, (C0279a) null);
        }

        public float a() {
            return 0.0f;
        }
    }

    public class g extends l {
        public g() {
            super(a.this, (C0279a) null);
        }

        public float a() {
            a aVar = a.this;
            return aVar.f17093h + aVar.f17094i;
        }
    }

    public class h extends l {
        public h() {
            super(a.this, (C0279a) null);
        }

        public float a() {
            a aVar = a.this;
            return aVar.f17093h + aVar.f17095j;
        }
    }

    public interface i {
        void a();

        void b();
    }

    public interface j {
        void a();

        void b();
    }

    public class k extends l {
        public k() {
            super(a.this, (C0279a) null);
        }

        public float a() {
            return a.this.f17093h;
        }
    }

    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17126a;

        /* renamed from: b  reason: collision with root package name */
        public float f17127b;

        /* renamed from: c  reason: collision with root package name */
        public float f17128c;

        public l() {
        }

        public /* synthetic */ l(a aVar, C0279a aVar2) {
            this();
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            a.this.j0((float) ((int) this.f17128c));
            this.f17126a = false;
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            if (!this.f17126a) {
                z9.j jVar = a.this.f17087b;
                this.f17127b = jVar == null ? 0.0f : jVar.x();
                this.f17128c = a();
                this.f17126a = true;
            }
            a aVar = a.this;
            float f10 = this.f17127b;
            aVar.j0((float) ((int) (f10 + ((this.f17128c - f10) * valueAnimator.getAnimatedFraction()))));
        }
    }

    public a(FloatingActionButton floatingActionButton, y9.c cVar) {
        this.f17110y = floatingActionButton;
        this.f17111z = cVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f17097l = iVar;
        iVar.a(S, i(new h()));
        iVar.a(T, i(new g()));
        iVar.a(U, i(new g()));
        iVar.a(V, i(new g()));
        iVar.a(W, i(new k()));
        iVar.a(X, i(new f()));
        this.f17103r = floatingActionButton.getRotation();
    }

    public void A() {
        this.f17097l.c();
    }

    public void B() {
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            z9.k.f(this.f17110y, jVar);
        }
        if (N()) {
            this.f17110y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    public void C() {
    }

    public void D() {
        ViewTreeObserver viewTreeObserver = this.f17110y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    public void E(int[] iArr) {
        this.f17097l.d(iArr);
    }

    public void F(float f10, float f11, float f12) {
        i0();
        j0(f10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(@d.m0 android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f17090e
            java.lang.String r1 = "Didn't initialize content background"
            e1.n.h(r0, r1)
            boolean r0 = r7.c0()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f17090e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            y9.c r8 = r7.f17111z
            goto L_0x0024
        L_0x0020:
            y9.c r8 = r7.f17111z
            android.graphics.drawable.Drawable r0 = r7.f17090e
        L_0x0024:
            r8.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.a.G(android.graphics.Rect):void");
    }

    public void H() {
        float rotation = this.f17110y.getRotation();
        if (this.f17103r != rotation) {
            this.f17103r = rotation;
            g0();
        }
    }

    public void I() {
        ArrayList<i> arrayList = this.f17109x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void J() {
        ArrayList<i> arrayList = this.f17109x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@m0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f17108w;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void L(@m0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f17107v;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    public void M(@m0 i iVar) {
        ArrayList<i> arrayList = this.f17109x;
        if (arrayList != null) {
            arrayList.remove(iVar);
        }
    }

    public boolean N() {
        return true;
    }

    public void O(@o0 ColorStateList colorStateList) {
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        t9.c cVar = this.f17089d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    public void P(@o0 PorterDuff.Mode mode) {
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    public final void Q(float f10) {
        if (this.f17093h != f10) {
            this.f17093h = f10;
            F(f10, this.f17094i, this.f17095j);
        }
    }

    public void R(boolean z10) {
        this.f17091f = z10;
    }

    public final void S(@o0 j9.h hVar) {
        this.f17102q = hVar;
    }

    public final void T(float f10) {
        if (this.f17094i != f10) {
            this.f17094i = f10;
            F(this.f17093h, f10, this.f17095j);
        }
    }

    public final void U(float f10) {
        this.f17104s = f10;
        Matrix matrix = this.D;
        g(f10, matrix);
        this.f17110y.setImageMatrix(matrix);
    }

    public final void V(int i10) {
        if (this.f17105t != i10) {
            this.f17105t = i10;
            h0();
        }
    }

    public void W(int i10) {
        this.f17096k = i10;
    }

    public final void X(float f10) {
        if (this.f17095j != f10) {
            this.f17095j = f10;
            F(this.f17093h, this.f17094i, f10);
        }
    }

    public void Y(@o0 ColorStateList colorStateList) {
        Drawable drawable = this.f17088c;
        if (drawable != null) {
            o0.d.o(drawable, x9.b.d(colorStateList));
        }
    }

    public void Z(boolean z10) {
        this.f17092g = z10;
        i0();
    }

    public final void a0(@m0 o oVar) {
        this.f17086a = oVar;
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        Drawable drawable = this.f17088c;
        if (drawable instanceof s) {
            ((s) drawable).setShapeAppearanceModel(oVar);
        }
        t9.c cVar = this.f17089d;
        if (cVar != null) {
            cVar.g(oVar);
        }
    }

    public final void b0(@o0 j9.h hVar) {
        this.f17101p = hVar;
    }

    public boolean c0() {
        return true;
    }

    public void d(@m0 Animator.AnimatorListener animatorListener) {
        if (this.f17108w == null) {
            this.f17108w = new ArrayList<>();
        }
        this.f17108w.add(animatorListener);
    }

    public final boolean d0() {
        return w1.T0(this.f17110y) && !this.f17110y.isInEditMode();
    }

    public void e(@m0 Animator.AnimatorListener animatorListener) {
        if (this.f17107v == null) {
            this.f17107v = new ArrayList<>();
        }
        this.f17107v.add(animatorListener);
    }

    public final boolean e0() {
        return !this.f17091f || this.f17110y.getSizeDimension() >= this.f17096k;
    }

    public void f(@m0 i iVar) {
        if (this.f17109x == null) {
            this.f17109x = new ArrayList<>();
        }
        this.f17109x.add(iVar);
    }

    public void f0(@o0 j jVar, boolean z10) {
        if (!z()) {
            Animator animator = this.f17100o;
            if (animator != null) {
                animator.cancel();
            }
            if (d0()) {
                if (this.f17110y.getVisibility() != 0) {
                    this.f17110y.setAlpha(0.0f);
                    this.f17110y.setScaleY(0.0f);
                    this.f17110y.setScaleX(0.0f);
                    U(0.0f);
                }
                j9.h hVar = this.f17101p;
                if (hVar == null) {
                    hVar = m();
                }
                AnimatorSet h10 = h(hVar, 1.0f, 1.0f, 1.0f);
                h10.addListener(new b(z10, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f17107v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h10.addListener(it.next());
                    }
                }
                h10.start();
                return;
            }
            this.f17110y.c(0, z10);
            this.f17110y.setAlpha(1.0f);
            this.f17110y.setScaleY(1.0f);
            this.f17110y.setScaleX(1.0f);
            U(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public final void g(float f10, @m0 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f17110y.getDrawable();
        if (drawable != null && this.f17105t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f17105t;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f17105t;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    public void g0() {
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            jVar.v0((int) this.f17103r);
        }
    }

    @m0
    public final AnimatorSet h(@m0 j9.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17110y, View.ALPHA, new float[]{f10});
        hVar.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f17110y, View.SCALE_X, new float[]{f11});
        hVar.h("scale").a(ofFloat2);
        k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f17110y, View.SCALE_Y, new float[]{f11});
        hVar.h("scale").a(ofFloat3);
        k0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f12, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f17110y, new j9.f(), new c(), new Matrix[]{new Matrix(this.D)});
        hVar.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        j9.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final void h0() {
        U(this.f17104s);
    }

    @m0
    public final ValueAnimator i(@m0 l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final void i0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.f17111z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public z9.j j() {
        return new z9.j((o) n.g(this.f17086a));
    }

    public void j0(float f10) {
        z9.j jVar = this.f17087b;
        if (jVar != null) {
            jVar.m0(f10);
        }
    }

    @o0
    public final Drawable k() {
        return this.f17090e;
    }

    public final void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new d());
        }
    }

    public final j9.h l() {
        if (this.f17099n == null) {
            this.f17099n = j9.h.d(this.f17110y.getContext(), a.b.design_fab_hide_motion_spec);
        }
        return (j9.h) n.g(this.f17099n);
    }

    public final j9.h m() {
        if (this.f17098m == null) {
            this.f17098m = j9.h.d(this.f17110y.getContext(), a.b.design_fab_show_motion_spec);
        }
        return (j9.h) n.g(this.f17098m);
    }

    public float n() {
        return this.f17093h;
    }

    public boolean o() {
        return this.f17091f;
    }

    @o0
    public final j9.h p() {
        return this.f17102q;
    }

    public float q() {
        return this.f17094i;
    }

    @m0
    public final ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    public void s(@m0 Rect rect) {
        int sizeDimension = this.f17091f ? (this.f17096k - this.f17110y.getSizeDimension()) / 2 : 0;
        float n10 = this.f17092g ? n() + this.f17095j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public float t() {
        return this.f17095j;
    }

    @o0
    public final o u() {
        return this.f17086a;
    }

    @o0
    public final j9.h v() {
        return this.f17101p;
    }

    public void w(@o0 j jVar, boolean z10) {
        if (!y()) {
            Animator animator = this.f17100o;
            if (animator != null) {
                animator.cancel();
            }
            if (d0()) {
                j9.h hVar = this.f17102q;
                if (hVar == null) {
                    hVar = l();
                }
                AnimatorSet h10 = h(hVar, 0.0f, 0.0f, 0.0f);
                h10.addListener(new C0279a(z10, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f17108w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h10.addListener(it.next());
                    }
                }
                h10.start();
                return;
            }
            this.f17110y.c(z10 ? 8 : 4, z10);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    public void x(ColorStateList colorStateList, @o0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        z9.j j10 = j();
        this.f17087b = j10;
        j10.setTintList(colorStateList);
        if (mode != null) {
            this.f17087b.setTintMode(mode);
        }
        this.f17087b.u0(-12303292);
        this.f17087b.Y(this.f17110y.getContext());
        x9.a aVar = new x9.a(this.f17087b.getShapeAppearanceModel());
        aVar.setTintList(x9.b.d(colorStateList2));
        this.f17088c = aVar;
        this.f17090e = new LayerDrawable(new Drawable[]{(Drawable) n.g(this.f17087b), aVar});
    }

    public boolean y() {
        return this.f17110y.getVisibility() == 0 ? this.f17106u == 1 : this.f17106u != 2;
    }

    public boolean z() {
        return this.f17110y.getVisibility() != 0 ? this.f17106u == 2 : this.f17106u != 1;
    }
}

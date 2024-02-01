package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import d.o0;
import f1.w1;

@g1
public class k extends RecyclerView.n implements RecyclerView.s {
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 500;
    public static final int O = 1500;
    public static final int P = 1200;
    public static final int Q = 500;
    public static final int R = 255;
    public static final int[] S = {16842919};
    public static final int[] T = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.t C;

    /* renamed from: a  reason: collision with root package name */
    public final int f3567a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3568b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f3569c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f3570d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3571e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3572f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f3573g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f3574h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3575i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3576j;
    @g1

    /* renamed from: k  reason: collision with root package name */
    public int f3577k;
    @g1

    /* renamed from: l  reason: collision with root package name */
    public int f3578l;
    @g1

    /* renamed from: m  reason: collision with root package name */
    public float f3579m;
    @g1

    /* renamed from: n  reason: collision with root package name */
    public int f3580n;
    @g1

    /* renamed from: o  reason: collision with root package name */
    public int f3581o;
    @g1

    /* renamed from: p  reason: collision with root package name */
    public float f3582p;

    /* renamed from: q  reason: collision with root package name */
    public int f3583q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f3584r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f3585s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3586t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3587u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f3588v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f3589w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f3590x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f3591y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f3592z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            k.this.w(500);
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            k.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3594a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3594a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3594a) {
                this.f3594a = false;
            } else if (((Float) k.this.f3592z.getAnimatedValue()).floatValue() == 0.0f) {
                k kVar = k.this;
                kVar.A = 0;
                kVar.G(0);
            } else {
                k kVar2 = k.this;
                kVar2.A = 2;
                kVar2.D();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            k.this.f3569c.setAlpha(floatValue);
            k.this.f3570d.setAlpha(floatValue);
            k.this.D();
        }
    }

    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3592z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f3569c = stateListDrawable;
        this.f3570d = drawable;
        this.f3573g = stateListDrawable2;
        this.f3574h = drawable2;
        this.f3571e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3572f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3575i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3576j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3567a = i11;
        this.f3568b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    @g1
    public boolean A(float f10, float f11) {
        if (f11 >= ((float) (this.f3584r - this.f3575i))) {
            int i10 = this.f3581o;
            int i11 = this.f3580n;
            return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
        }
    }

    @g1
    public boolean B(float f10, float f11) {
        if (!z() ? f10 >= ((float) (this.f3583q - this.f3571e)) : f10 <= ((float) (this.f3571e / 2))) {
            int i10 = this.f3578l;
            int i11 = this.f3577k;
            return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
        }
    }

    @g1
    public boolean C() {
        return this.f3588v == 1;
    }

    public void D() {
        this.f3585s.invalidate();
    }

    public final void E(int i10) {
        m();
        this.f3585s.postDelayed(this.B, (long) i10);
    }

    public final int F(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / ((float) i13)) * ((float) i14));
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    public void G(int i10) {
        int i11;
        if (i10 == 2 && this.f3588v != 2) {
            this.f3569c.setState(S);
            m();
        }
        if (i10 == 0) {
            D();
        } else {
            I();
        }
        if (this.f3588v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f3588v = i10;
        }
        this.f3569c.setState(T);
        i11 = 1200;
        E(i11);
        this.f3588v = i10;
    }

    public final void H() {
        this.f3585s.n(this);
        this.f3585s.q(this);
        this.f3585s.r(this.C);
    }

    public void I() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f3592z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f3592z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3592z.setDuration(500);
        this.f3592z.setStartDelay(0);
        this.f3592z.start();
    }

    public void J(int i10, int i11) {
        int computeVerticalScrollRange = this.f3585s.computeVerticalScrollRange();
        int i12 = this.f3584r;
        this.f3586t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f3567a;
        int computeHorizontalScrollRange = this.f3585s.computeHorizontalScrollRange();
        int i13 = this.f3583q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f3567a;
        this.f3587u = z10;
        boolean z11 = this.f3586t;
        if (z11 || z10) {
            if (z11) {
                float f10 = (float) i12;
                this.f3578l = (int) ((f10 * (((float) i11) + (f10 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3577k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
            }
            if (this.f3587u) {
                float f11 = (float) i13;
                this.f3581o = (int) ((f11 * (((float) i10) + (f11 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3580n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = this.f3588v;
            if (i14 == 0 || i14 == 1) {
                G(1);
            }
        } else if (this.f3588v != 0) {
            G(0);
        }
    }

    public final void K(float f10) {
        int[] t10 = t();
        float max = Math.max((float) t10[0], Math.min((float) t10[1], f10));
        if (Math.abs(((float) this.f3578l) - max) >= 2.0f) {
            int F2 = F(this.f3579m, max, t10, this.f3585s.computeVerticalScrollRange(), this.f3585s.computeVerticalScrollOffset(), this.f3584r);
            if (F2 != 0) {
                this.f3585s.scrollBy(0, F2);
            }
            this.f3579m = max;
        }
    }

    public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        if (this.f3588v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean B2 = B(motionEvent.getX(), motionEvent.getY());
                boolean A2 = A(motionEvent.getX(), motionEvent.getY());
                if (B2 || A2) {
                    if (A2) {
                        this.f3589w = 1;
                        this.f3582p = (float) ((int) motionEvent.getX());
                    } else if (B2) {
                        this.f3589w = 2;
                        this.f3579m = (float) ((int) motionEvent.getY());
                    }
                    G(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3588v == 2) {
                this.f3579m = 0.0f;
                this.f3582p = 0.0f;
                G(1);
                this.f3589w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3588v == 2) {
                I();
                if (this.f3589w == 1) {
                    x(motionEvent.getX());
                }
                if (this.f3589w == 2) {
                    K(motionEvent.getY());
                }
            }
        }
    }

    public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        int i10 = this.f3588v;
        if (i10 == 1) {
            boolean B2 = B(motionEvent.getX(), motionEvent.getY());
            boolean A2 = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!B2 && !A2) {
                return false;
            }
            if (A2) {
                this.f3589w = 1;
                this.f3582p = (float) ((int) motionEvent.getX());
            } else if (B2) {
                this.f3589w = 2;
                this.f3579m = (float) ((int) motionEvent.getY());
            }
            G(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public void e(boolean z10) {
    }

    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3583q != this.f3585s.getWidth() || this.f3584r != this.f3585s.getHeight()) {
            this.f3583q = this.f3585s.getWidth();
            this.f3584r = this.f3585s.getHeight();
            G(0);
        } else if (this.A != 0) {
            if (this.f3586t) {
                p(canvas);
            }
            if (this.f3587u) {
                o(canvas);
            }
        }
    }

    public void l(@o0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3585s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                n();
            }
            this.f3585s = recyclerView;
            if (recyclerView != null) {
                H();
            }
        }
    }

    public final void m() {
        this.f3585s.removeCallbacks(this.B);
    }

    public final void n() {
        this.f3585s.p1(this);
        this.f3585s.s1(this);
        this.f3585s.t1(this.C);
        m();
    }

    public final void o(Canvas canvas) {
        int i10 = this.f3584r;
        int i11 = this.f3575i;
        int i12 = i10 - i11;
        int i13 = this.f3581o;
        int i14 = this.f3580n;
        int i15 = i13 - (i14 / 2);
        this.f3573g.setBounds(0, 0, i14, i11);
        this.f3574h.setBounds(0, 0, this.f3583q, this.f3576j);
        canvas.translate(0.0f, (float) i12);
        this.f3574h.draw(canvas);
        canvas.translate((float) i15, 0.0f);
        this.f3573g.draw(canvas);
        canvas.translate((float) (-i15), (float) (-i12));
    }

    public final void p(Canvas canvas) {
        int i10 = this.f3583q;
        int i11 = this.f3571e;
        int i12 = i10 - i11;
        int i13 = this.f3578l;
        int i14 = this.f3577k;
        int i15 = i13 - (i14 / 2);
        this.f3569c.setBounds(0, 0, i11, i14);
        this.f3570d.setBounds(0, 0, this.f3572f, this.f3584r);
        if (z()) {
            this.f3570d.draw(canvas);
            canvas.translate((float) this.f3571e, (float) i15);
            canvas.scale(-1.0f, 1.0f);
            this.f3569c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i12 = this.f3571e;
        } else {
            canvas.translate((float) i12, 0.0f);
            this.f3570d.draw(canvas);
            canvas.translate(0.0f, (float) i15);
            this.f3569c.draw(canvas);
        }
        canvas.translate((float) (-i12), (float) (-i15));
    }

    public final int[] q() {
        int[] iArr = this.f3591y;
        int i10 = this.f3568b;
        iArr[0] = i10;
        iArr[1] = this.f3583q - i10;
        return iArr;
    }

    @g1
    public Drawable r() {
        return this.f3573g;
    }

    @g1
    public Drawable s() {
        return this.f3574h;
    }

    public final int[] t() {
        int[] iArr = this.f3590x;
        int i10 = this.f3568b;
        iArr[0] = i10;
        iArr[1] = this.f3584r - i10;
        return iArr;
    }

    @g1
    public Drawable u() {
        return this.f3569c;
    }

    @g1
    public Drawable v() {
        return this.f3570d;
    }

    @g1
    public void w(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f3592z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f3592z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3592z.setDuration((long) i10);
        this.f3592z.start();
    }

    public final void x(float f10) {
        int[] q10 = q();
        float max = Math.max((float) q10[0], Math.min((float) q10[1], f10));
        if (Math.abs(((float) this.f3581o) - max) >= 2.0f) {
            int F2 = F(this.f3582p, max, q10, this.f3585s.computeHorizontalScrollRange(), this.f3585s.computeHorizontalScrollOffset(), this.f3583q);
            if (F2 != 0) {
                this.f3585s.scrollBy(F2, 0);
            }
            this.f3582p = max;
        }
    }

    public boolean y() {
        return this.f3588v == 2;
    }

    public final boolean z() {
        return w1.X(this.f3585s) == 1;
    }
}

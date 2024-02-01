package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import f1.w1;
import java.util.ArrayList;
import java.util.List;
import s2.a;

public class m extends RecyclerView.n implements RecyclerView.q {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    public static final String Q = "ItemTouchHelper";
    public static final boolean R = false;
    public static final int S = -1;
    public static final int T = 8;
    public static final int U = 255;
    public static final int V = 65280;
    public static final int W = 16711680;
    public static final int X = 1000;
    public g A;
    public final RecyclerView.s B = new b();
    public Rect C;
    public long D;

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f3606a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f3607b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.e0 f3608c = null;

    /* renamed from: d  reason: collision with root package name */
    public float f3609d;

    /* renamed from: e  reason: collision with root package name */
    public float f3610e;

    /* renamed from: f  reason: collision with root package name */
    public float f3611f;

    /* renamed from: g  reason: collision with root package name */
    public float f3612g;

    /* renamed from: h  reason: collision with root package name */
    public float f3613h;

    /* renamed from: i  reason: collision with root package name */
    public float f3614i;

    /* renamed from: j  reason: collision with root package name */
    public float f3615j;

    /* renamed from: k  reason: collision with root package name */
    public float f3616k;

    /* renamed from: l  reason: collision with root package name */
    public int f3617l = -1;
    @m0

    /* renamed from: m  reason: collision with root package name */
    public f f3618m;

    /* renamed from: n  reason: collision with root package name */
    public int f3619n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f3620o;

    /* renamed from: p  reason: collision with root package name */
    public List<h> f3621p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public int f3622q;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f3623r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f3624s = new a();

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f3625t;

    /* renamed from: u  reason: collision with root package name */
    public List<RecyclerView.e0> f3626u;

    /* renamed from: v  reason: collision with root package name */
    public List<Integer> f3627v;

    /* renamed from: w  reason: collision with root package name */
    public RecyclerView.j f3628w = null;

    /* renamed from: x  reason: collision with root package name */
    public View f3629x = null;

    /* renamed from: y  reason: collision with root package name */
    public int f3630y = -1;

    /* renamed from: z  reason: collision with root package name */
    public f1.i f3631z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            m mVar = m.this;
            if (mVar.f3608c != null && mVar.E()) {
                m mVar2 = m.this;
                RecyclerView.e0 e0Var = mVar2.f3608c;
                if (e0Var != null) {
                    mVar2.z(e0Var);
                }
                m mVar3 = m.this;
                mVar3.f3623r.removeCallbacks(mVar3.f3624s);
                w1.n1(m.this.f3623r, this);
            }
        }
    }

    public class b implements RecyclerView.s {
        public b() {
        }

        public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
            m.this.f3631z.b(motionEvent);
            VelocityTracker velocityTracker = m.this.f3625t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.f3617l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(m.this.f3617l);
                if (findPointerIndex >= 0) {
                    m.this.o(actionMasked, motionEvent, findPointerIndex);
                }
                m mVar = m.this;
                RecyclerView.e0 e0Var = mVar.f3608c;
                if (e0Var != null) {
                    int i10 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = mVar.f3625t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                m mVar2 = m.this;
                                if (pointerId == mVar2.f3617l) {
                                    if (actionIndex == 0) {
                                        i10 = 1;
                                    }
                                    mVar2.f3617l = motionEvent.getPointerId(i10);
                                    m mVar3 = m.this;
                                    mVar3.M(motionEvent, mVar3.f3620o, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            mVar.M(motionEvent, mVar.f3620o, findPointerIndex);
                            m.this.z(e0Var);
                            m mVar4 = m.this;
                            mVar4.f3623r.removeCallbacks(mVar4.f3624s);
                            m.this.f3624s.run();
                            m.this.f3623r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    m.this.F((RecyclerView.e0) null, 0);
                    m.this.f3617l = -1;
                }
            }
        }

        public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
            int findPointerIndex;
            h s10;
            m.this.f3631z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.f3617l = motionEvent.getPointerId(0);
                m.this.f3609d = motionEvent.getX();
                m.this.f3610e = motionEvent.getY();
                m.this.A();
                m mVar = m.this;
                if (mVar.f3608c == null && (s10 = mVar.s(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.f3609d -= s10.f3654j;
                    mVar2.f3610e -= s10.f3655k;
                    mVar2.r(s10.f3649e, true);
                    if (m.this.f3606a.remove(s10.f3649e.f3220a)) {
                        m mVar3 = m.this;
                        mVar3.f3618m.c(mVar3.f3623r, s10.f3649e);
                    }
                    m.this.F(s10.f3649e, s10.f3650f);
                    m mVar4 = m.this;
                    mVar4.M(motionEvent, mVar4.f3620o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                m mVar5 = m.this;
                mVar5.f3617l = -1;
                mVar5.F((RecyclerView.e0) null, 0);
            } else {
                int i10 = m.this.f3617l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    m.this.o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = m.this.f3625t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return m.this.f3608c != null;
        }

        public void e(boolean z10) {
            if (z10) {
                m.this.F((RecyclerView.e0) null, 0);
            }
        }
    }

    public class c extends h {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ int f3633o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3634p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ m f3635q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(m mVar, RecyclerView.e0 e0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.e0 e0Var2) {
            super(e0Var, i10, i11, f10, f11, f12, f13);
            this.f3635q = mVar;
            this.f3633o = i12;
            this.f3634p = e0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f3656l) {
                if (this.f3633o <= 0) {
                    m mVar = this.f3635q;
                    mVar.f3618m.c(mVar.f3623r, this.f3634p);
                } else {
                    this.f3635q.f3606a.add(this.f3634p.f3220a);
                    this.f3653i = true;
                    int i10 = this.f3633o;
                    if (i10 > 0) {
                        this.f3635q.B(this, i10);
                    }
                }
                m mVar2 = this.f3635q;
                View view = mVar2.f3629x;
                View view2 = this.f3634p.f3220a;
                if (view == view2) {
                    mVar2.D(view2);
                }
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ h O;
        public final /* synthetic */ int P;

        public d(h hVar, int i10) {
            this.O = hVar;
            this.P = i10;
        }

        public void run() {
            RecyclerView recyclerView = m.this.f3623r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                h hVar = this.O;
                if (!hVar.f3656l && hVar.f3649e.j() != -1) {
                    RecyclerView.l itemAnimator = m.this.f3623r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.r((RecyclerView.l.b) null)) && !m.this.x()) {
                        m.this.f3618m.D(this.O.f3649e, this.P);
                    } else {
                        m.this.f3623r.post(this);
                    }
                }
            }
        }
    }

    public class e implements RecyclerView.j {
        public e() {
        }

        public int a(int i10, int i11) {
            m mVar = m.this;
            View view = mVar.f3629x;
            if (view == null) {
                return i11;
            }
            int i12 = mVar.f3630y;
            if (i12 == -1) {
                i12 = mVar.f3623r.indexOfChild(view);
                m.this.f3630y = i12;
            }
            return i11 == i10 + -1 ? i12 : i11 < i12 ? i11 : i11 + 1;
        }
    }

    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f3637b = 200;

        /* renamed from: c  reason: collision with root package name */
        public static final int f3638c = 250;

        /* renamed from: d  reason: collision with root package name */
        public static final int f3639d = 3158064;

        /* renamed from: e  reason: collision with root package name */
        public static final int f3640e = 789516;

        /* renamed from: f  reason: collision with root package name */
        public static final Interpolator f3641f = new a();

        /* renamed from: g  reason: collision with root package name */
        public static final Interpolator f3642g = new b();

        /* renamed from: h  reason: collision with root package name */
        public static final long f3643h = 2000;

        /* renamed from: a  reason: collision with root package name */
        public int f3644a = -1;

        public static class a implements Interpolator {
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        public static class b implements Interpolator {
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & f3640e;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= -789517 & i15;
                i12 = (i15 & f3640e) << 2;
            }
            return i14 | i12;
        }

        @m0
        public static n i() {
            return o.f3662a;
        }

        public static int u(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int v(int i10, int i11) {
            int u10 = u(0, i11 | i10);
            return u(2, i10) | u(1, i11) | u10;
        }

        public abstract boolean A(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var, @m0 RecyclerView.e0 e0Var2);

        public void B(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var, int i10, @m0 RecyclerView.e0 e0Var2, int i11, int i12, int i13) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).b(e0Var.f3220a, e0Var2.f3220a, i12, i13);
                return;
            }
            if (layoutManager.n()) {
                if (layoutManager.Y(e0Var2.f3220a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.C1(i11);
                }
                if (layoutManager.b0(e0Var2.f3220a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.C1(i11);
                }
            }
            if (layoutManager.o()) {
                if (layoutManager.c0(e0Var2.f3220a) <= recyclerView.getPaddingTop()) {
                    recyclerView.C1(i11);
                }
                if (layoutManager.W(e0Var2.f3220a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.C1(i11);
                }
            }
        }

        public void C(@o0 RecyclerView.e0 e0Var, int i10) {
            if (e0Var != null) {
                o.f3662a.b(e0Var.f3220a);
            }
        }

        public abstract void D(@m0 RecyclerView.e0 e0Var, int i10);

        public boolean a(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var, @m0 RecyclerView.e0 e0Var2) {
            return true;
        }

        public RecyclerView.e0 b(@m0 RecyclerView.e0 e0Var, @m0 List<RecyclerView.e0> list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.e0 e0Var2 = e0Var;
            int width = i10 + e0Var2.f3220a.getWidth();
            int height = i11 + e0Var2.f3220a.getHeight();
            int left2 = i10 - e0Var2.f3220a.getLeft();
            int top2 = i11 - e0Var2.f3220a.getTop();
            int size = list.size();
            RecyclerView.e0 e0Var3 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.e0 e0Var4 = list.get(i13);
                if (left2 > 0 && (right = e0Var4.f3220a.getRight() - width) < 0 && e0Var4.f3220a.getRight() > e0Var2.f3220a.getRight() && (abs4 = Math.abs(right)) > i12) {
                    e0Var3 = e0Var4;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = e0Var4.f3220a.getLeft() - i10) > 0 && e0Var4.f3220a.getLeft() < e0Var2.f3220a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    e0Var3 = e0Var4;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = e0Var4.f3220a.getTop() - i11) > 0 && e0Var4.f3220a.getTop() < e0Var2.f3220a.getTop() && (abs2 = Math.abs(top)) > i12) {
                    e0Var3 = e0Var4;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = e0Var4.f3220a.getBottom() - height) < 0 && e0Var4.f3220a.getBottom() > e0Var2.f3220a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    e0Var3 = e0Var4;
                    i12 = abs;
                }
            }
            return e0Var3;
        }

        public void c(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var) {
            o.f3662a.a(e0Var.f3220a);
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & f3639d;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= -3158065 & i15;
                i12 = (i15 & f3639d) >> 2;
            }
            return i14 | i12;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return d(l(recyclerView, e0Var), w1.X(recyclerView));
        }

        public long g(@m0 RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200 : 250 : i10 == 8 ? itemAnimator.o() : itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public final int j(RecyclerView recyclerView) {
            if (this.f3644a == -1) {
                this.f3644a = recyclerView.getResources().getDimensionPixelSize(a.c.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f3644a;
        }

        public float k(@m0 RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public abstract int l(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var);

        public float m(float f10) {
            return f10;
        }

        public float n(@m0 RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public float o(float f10) {
            return f10;
        }

        public boolean p(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (f(recyclerView, e0Var) & 16711680) != 0;
        }

        public boolean q(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (f(recyclerView, e0Var) & 65280) != 0;
        }

        public int r(@m0 RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            float f10 = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i11)) * j(recyclerView))) * f3642g.getInterpolation(Math.min(1.0f, (((float) Math.abs(i11)) * 1.0f) / ((float) i10))));
            if (j10 <= 2000) {
                f10 = ((float) j10) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f3641f.getInterpolation(f10));
            return interpolation == 0 ? i11 > 0 ? 1 : -1 : interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@m0 Canvas canvas, @m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var, float f10, float f11, int i10, boolean z10) {
            o.f3662a.d(canvas, recyclerView, e0Var.f3220a, f10, f11, i10, z10);
        }

        public void x(@m0 Canvas canvas, @m0 RecyclerView recyclerView, RecyclerView.e0 e0Var, float f10, float f11, int i10, boolean z10) {
            o.f3662a.c(canvas, recyclerView, e0Var.f3220a, f10, f11, i10, z10);
        }

        public void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i10, float f10, float f11) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                hVar.e();
                int save = canvas.save();
                w(canvas, recyclerView, hVar.f3649e, hVar.f3654j, hVar.f3655k, hVar.f3650f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                w(canvas, recyclerView, e0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        public void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i10, float f10, float f11) {
            Canvas canvas2 = canvas;
            List<h> list2 = list;
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list2.get(i11);
                int save = canvas.save();
                x(canvas, recyclerView, hVar.f3649e, hVar.f3654j, hVar.f3655k, hVar.f3650f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                x(canvas, recyclerView, e0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                h hVar2 = list2.get(i12);
                boolean z11 = hVar2.f3657m;
                if (z11 && !hVar2.f3653i) {
                    list2.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }
    }

    public class g extends GestureDetector.SimpleOnGestureListener {
        public boolean O = true;

        public g() {
        }

        public void a() {
            this.O = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View t10;
            RecyclerView.e0 s02;
            int i10;
            if (this.O && (t10 = m.this.t(motionEvent)) != null && (s02 = m.this.f3623r.s0(t10)) != null) {
                m mVar = m.this;
                if (mVar.f3618m.p(mVar.f3623r, s02) && motionEvent.getPointerId(0) == (i10 = m.this.f3617l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    m mVar2 = m.this;
                    mVar2.f3609d = x10;
                    mVar2.f3610e = y10;
                    mVar2.f3614i = 0.0f;
                    mVar2.f3613h = 0.0f;
                    if (mVar2.f3618m.t()) {
                        m.this.F(s02, 2);
                    }
                }
            }
        }
    }

    public static class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f3645a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3646b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3647c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3648d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.e0 f3649e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3650f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f3651g;

        /* renamed from: h  reason: collision with root package name */
        public final int f3652h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3653i;

        /* renamed from: j  reason: collision with root package name */
        public float f3654j;

        /* renamed from: k  reason: collision with root package name */
        public float f3655k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3656l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3657m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f3658n;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.e0 e0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f3650f = i11;
            this.f3652h = i10;
            this.f3649e = e0Var;
            this.f3645a = f10;
            this.f3646b = f11;
            this.f3647c = f12;
            this.f3648d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f3651g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(e0Var.f3220a);
            ofFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f3651g.cancel();
        }

        public void b(long j10) {
            this.f3651g.setDuration(j10);
        }

        public void c(float f10) {
            this.f3658n = f10;
        }

        public void d() {
            this.f3649e.H(false);
            this.f3651g.start();
        }

        public void e() {
            float f10 = this.f3645a;
            float f11 = this.f3647c;
            this.f3654j = f10 == f11 ? this.f3649e.f3220a.getTranslationX() : f10 + (this.f3658n * (f11 - f10));
            float f12 = this.f3646b;
            float f13 = this.f3648d;
            this.f3655k = f12 == f13 ? this.f3649e.f3220a.getTranslationY() : f12 + (this.f3658n * (f13 - f12));
        }

        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f3657m) {
                this.f3649e.H(true);
            }
            this.f3657m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class i extends f {

        /* renamed from: i  reason: collision with root package name */
        public int f3660i;

        /* renamed from: j  reason: collision with root package name */
        public int f3661j;

        public i(int i10, int i11) {
            this.f3660i = i11;
            this.f3661j = i10;
        }

        public int E(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var) {
            return this.f3661j;
        }

        public int F(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var) {
            return this.f3660i;
        }

        public void G(int i10) {
            this.f3661j = i10;
        }

        public void H(int i10) {
            this.f3660i = i10;
        }

        public int l(@m0 RecyclerView recyclerView, @m0 RecyclerView.e0 e0Var) {
            return f.v(E(recyclerView, e0Var), F(recyclerView, e0Var));
        }
    }

    public interface j {
        void b(@m0 View view, @m0 View view2, int i10, int i11);
    }

    public m(@m0 f fVar) {
        this.f3618m = fVar;
    }

    public static boolean y(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public void A() {
        VelocityTracker velocityTracker = this.f3625t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f3625t = VelocityTracker.obtain();
    }

    public void B(h hVar, int i10) {
        this.f3623r.post(new d(hVar, i10));
    }

    public final void C() {
        VelocityTracker velocityTracker = this.f3625t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3625t = null;
        }
    }

    public void D(View view) {
        if (view == this.f3629x) {
            this.f3629x = null;
            if (this.f3628w != null) {
                this.f3623r.setChildDrawingOrderCallback((RecyclerView.j) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean E() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$e0 r1 = r0.f3608c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3623r
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r0.f3608c
            android.view.View r9 = r9.f3220a
            android.graphics.Rect r10 = r0.C
            r1.m(r9, r10)
            boolean r9 = r1.n()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f3615j
            float r11 = r0.f3613h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3623r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f3613h
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f3608c
            android.view.View r11 = r11.f3220a
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f3623r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3623r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = r2
        L_0x007e:
            boolean r1 = r1.o()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f3616k
            float r9 = r0.f3614i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f3623r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f3614i
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r0.f3608c
            android.view.View r9 = r9.f3220a
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f3623r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3623r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.m$f r9 = r0.f3618m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3623r
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f3608c
            android.view.View r11 = r11.f3220a
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f3623r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.r(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.m$f r9 = r0.f3618m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3623r
            androidx.recyclerview.widget.RecyclerView$e0 r11 = r0.f3608c
            android.view.View r11 = r11.f3220a
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f3623r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.r(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.D = r3
            return r2
        L_0x0106:
            long r7 = r0.D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.D = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3623r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.E():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(@d.o0 androidx.recyclerview.widget.RecyclerView.e0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$e0 r0 = r11.f3608c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f3619n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.D = r0
            int r4 = r11.f3619n
            r14 = 1
            r11.r(r12, r14)
            r11.f3619n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.f3220a
            r11.f3629x = r0
            r23.l()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$e0 r9 = r11.f3608c
            r8 = 0
            if (r9 == 0) goto L_0x00ed
            android.view.View r0 = r9.f3220a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d9
            if (r4 != r15) goto L_0x004a
            r7 = r8
            goto L_0x004f
        L_0x004a:
            int r0 = r11.L(r9)
            r7 = r0
        L_0x004f:
            r23.C()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007c
            if (r7 == r15) goto L_0x007c
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = r1
            r18 = r17
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f3613h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3623r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x008e
        L_0x007c:
            float r2 = r11.f3614i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f3623r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x008e:
            if (r4 != r15) goto L_0x0092
            r6 = r10
            goto L_0x0097
        L_0x0092:
            if (r7 <= 0) goto L_0x0096
            r6 = r15
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            float[] r0 = r11.f3607b
            r11.w(r0)
            float[] r0 = r11.f3607b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.m$c r5 = new androidx.recyclerview.widget.m$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.m$f r0 = r11.f3618m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3623r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.g(r1, r15, r2, r3)
            r14.b(r0)
            java.util.List<androidx.recyclerview.widget.m$h> r0 = r11.f3621p
            r0.add(r14)
            r14.d()
            r8 = 1
            goto L_0x00e9
        L_0x00d9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.f3220a
            r11.D(r1)
            androidx.recyclerview.widget.m$f r1 = r11.f3618m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f3623r
            r1.c(r2, r0)
            r8 = 0
        L_0x00e9:
            r0 = 0
            r11.f3608c = r0
            goto L_0x00f0
        L_0x00ed:
            r21 = r10
            r8 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x0121
            androidx.recyclerview.widget.m$f r0 = r11.f3618m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3623r
            int r0 = r0.f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f3619n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f3620o = r0
            android.view.View r0 = r12.f3220a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f3615j = r0
            android.view.View r0 = r12.f3220a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f3616k = r0
            r11.f3608c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0121
            android.view.View r0 = r12.f3220a
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3623r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView$e0 r2 = r11.f3608c
            if (r2 == 0) goto L_0x0130
            r14 = 1
            goto L_0x0131
        L_0x0130:
            r14 = r1
        L_0x0131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0134:
            if (r8 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3623r
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r0.O1()
        L_0x013f:
            androidx.recyclerview.widget.m$f r0 = r11.f3618m
            androidx.recyclerview.widget.RecyclerView$e0 r1 = r11.f3608c
            int r2 = r11.f3619n
            r0.C(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f3623r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.F(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }

    public final void G() {
        this.f3622q = ViewConfiguration.get(this.f3623r.getContext()).getScaledTouchSlop();
        this.f3623r.n(this);
        this.f3623r.q(this.B);
        this.f3623r.p(this);
        I();
    }

    public void H(@m0 RecyclerView.e0 e0Var) {
        if (this.f3618m.p(this.f3623r, e0Var) && e0Var.f3220a.getParent() == this.f3623r) {
            A();
            this.f3614i = 0.0f;
            this.f3613h = 0.0f;
            F(e0Var, 2);
        }
    }

    public final void I() {
        this.A = new g();
        this.f3631z = new f1.i(this.f3623r.getContext(), this.A);
    }

    public void J(@m0 RecyclerView.e0 e0Var) {
        if (this.f3618m.q(this.f3623r, e0Var) && e0Var.f3220a.getParent() == this.f3623r) {
            A();
            this.f3614i = 0.0f;
            this.f3613h = 0.0f;
            F(e0Var, 1);
        }
    }

    public final void K() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f3631z != null) {
            this.f3631z = null;
        }
    }

    public final int L(RecyclerView.e0 e0Var) {
        if (this.f3619n == 2) {
            return 0;
        }
        int l10 = this.f3618m.l(this.f3623r, e0Var);
        int d10 = (this.f3618m.d(l10, w1.X(this.f3623r)) & 65280) >> 8;
        if (d10 == 0) {
            return 0;
        }
        int i10 = (l10 & 65280) >> 8;
        if (Math.abs(this.f3613h) > Math.abs(this.f3614i)) {
            int n10 = n(e0Var, d10);
            if (n10 > 0) {
                return (i10 & n10) == 0 ? f.e(n10, w1.X(this.f3623r)) : n10;
            }
            int p10 = p(e0Var, d10);
            if (p10 > 0) {
                return p10;
            }
        } else {
            int p11 = p(e0Var, d10);
            if (p11 > 0) {
                return p11;
            }
            int n11 = n(e0Var, d10);
            if (n11 > 0) {
                return (i10 & n11) == 0 ? f.e(n11, w1.X(this.f3623r)) : n11;
            }
        }
        return 0;
    }

    public void M(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f3609d;
        this.f3613h = f10;
        this.f3614i = y10 - this.f3610e;
        if ((i10 & 4) == 0) {
            this.f3613h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f3613h = Math.min(0.0f, this.f3613h);
        }
        if ((i10 & 1) == 0) {
            this.f3614i = Math.max(0.0f, this.f3614i);
        }
        if ((i10 & 2) == 0) {
            this.f3614i = Math.min(0.0f, this.f3614i);
        }
    }

    public void b(@m0 View view) {
        D(view);
        RecyclerView.e0 s02 = this.f3623r.s0(view);
        if (s02 != null) {
            RecyclerView.e0 e0Var = this.f3608c;
            if (e0Var == null || s02 != e0Var) {
                r(s02, false);
                if (this.f3606a.remove(s02.f3220a)) {
                    this.f3618m.c(this.f3623r, s02);
                    return;
                }
                return;
            }
            F((RecyclerView.e0) null, 0);
        }
    }

    public void d(@m0 View view) {
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        this.f3630y = -1;
        if (this.f3608c != null) {
            w(this.f3607b);
            float[] fArr = this.f3607b;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f3618m.y(canvas, recyclerView, this.f3608c, this.f3621p, this.f3619n, f11, f10);
    }

    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f10;
        float f11;
        if (this.f3608c != null) {
            w(this.f3607b);
            float[] fArr = this.f3607b;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f3618m.z(canvas, recyclerView, this.f3608c, this.f3621p, this.f3619n, f11, f10);
    }

    public final void l() {
    }

    public void m(@o0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3623r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                q();
            }
            this.f3623r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f3611f = resources.getDimension(a.c.item_touch_helper_swipe_escape_velocity);
                this.f3612g = resources.getDimension(a.c.item_touch_helper_swipe_escape_max_velocity);
                G();
            }
        }
    }

    public final int n(RecyclerView.e0 e0Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = 8;
        int i12 = this.f3613h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f3625t;
        if (velocityTracker != null && this.f3617l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3618m.o(this.f3612g));
            float xVelocity = this.f3625t.getXVelocity(this.f3617l);
            float yVelocity = this.f3625t.getYVelocity(this.f3617l);
            if (xVelocity <= 0.0f) {
                i11 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i11 & i10) != 0 && i12 == i11 && abs >= this.f3618m.m(this.f3611f) && abs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float width = ((float) this.f3623r.getWidth()) * this.f3618m.n(e0Var);
        if ((i10 & i12) == 0 || Math.abs(this.f3613h) <= width) {
            return 0;
        }
        return i12;
    }

    public void o(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.e0 v10;
        int f10;
        if (this.f3608c == null && i10 == 2 && this.f3619n != 2 && this.f3618m.s() && this.f3623r.getScrollState() != 1 && (v10 = v(motionEvent)) != null && (f10 = (this.f3618m.f(this.f3623r, v10) & 65280) >> 8) != 0) {
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f11 = x10 - this.f3609d;
            float f12 = y10 - this.f3610e;
            float abs = Math.abs(f11);
            float abs2 = Math.abs(f12);
            int i12 = this.f3622q;
            if (abs >= ((float) i12) || abs2 >= ((float) i12)) {
                if (abs > abs2) {
                    if (f11 < 0.0f && (f10 & 4) == 0) {
                        return;
                    }
                    if (f11 > 0.0f && (f10 & 8) == 0) {
                        return;
                    }
                } else if (f12 < 0.0f && (f10 & 1) == 0) {
                    return;
                } else {
                    if (f12 > 0.0f && (f10 & 2) == 0) {
                        return;
                    }
                }
                this.f3614i = 0.0f;
                this.f3613h = 0.0f;
                this.f3617l = motionEvent.getPointerId(0);
                F(v10, 1);
            }
        }
    }

    public final int p(RecyclerView.e0 e0Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = 2;
        int i12 = this.f3614i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f3625t;
        if (velocityTracker != null && this.f3617l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f3618m.o(this.f3612g));
            float xVelocity = this.f3625t.getXVelocity(this.f3617l);
            float yVelocity = this.f3625t.getYVelocity(this.f3617l);
            if (yVelocity <= 0.0f) {
                i11 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i11 & i10) != 0 && i11 == i12 && abs >= this.f3618m.m(this.f3611f) && abs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float height = ((float) this.f3623r.getHeight()) * this.f3618m.n(e0Var);
        if ((i10 & i12) == 0 || Math.abs(this.f3614i) <= height) {
            return 0;
        }
        return i12;
    }

    public final void q() {
        this.f3623r.p1(this);
        this.f3623r.s1(this.B);
        this.f3623r.r1(this);
        for (int size = this.f3621p.size() - 1; size >= 0; size--) {
            this.f3618m.c(this.f3623r, this.f3621p.get(0).f3649e);
        }
        this.f3621p.clear();
        this.f3629x = null;
        this.f3630y = -1;
        C();
        K();
    }

    public void r(RecyclerView.e0 e0Var, boolean z10) {
        for (int size = this.f3621p.size() - 1; size >= 0; size--) {
            h hVar = this.f3621p.get(size);
            if (hVar.f3649e == e0Var) {
                hVar.f3656l |= z10;
                if (!hVar.f3657m) {
                    hVar.a();
                }
                this.f3621p.remove(size);
                return;
            }
        }
    }

    public h s(MotionEvent motionEvent) {
        if (this.f3621p.isEmpty()) {
            return null;
        }
        View t10 = t(motionEvent);
        for (int size = this.f3621p.size() - 1; size >= 0; size--) {
            h hVar = this.f3621p.get(size);
            if (hVar.f3649e.f3220a == t10) {
                return hVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.e0 e0Var = this.f3608c;
        if (e0Var != null) {
            View view = e0Var.f3220a;
            if (y(view, x10, y10, this.f3615j + this.f3613h, this.f3616k + this.f3614i)) {
                return view;
            }
        }
        for (int size = this.f3621p.size() - 1; size >= 0; size--) {
            h hVar = this.f3621p.get(size);
            View view2 = hVar.f3649e.f3220a;
            if (y(view2, x10, y10, hVar.f3654j, hVar.f3655k)) {
                return view2;
            }
        }
        return this.f3623r.Z(x10, y10);
    }

    public final List<RecyclerView.e0> u(RecyclerView.e0 e0Var) {
        RecyclerView.e0 e0Var2 = e0Var;
        List<RecyclerView.e0> list = this.f3626u;
        if (list == null) {
            this.f3626u = new ArrayList();
            this.f3627v = new ArrayList();
        } else {
            list.clear();
            this.f3627v.clear();
        }
        int h10 = this.f3618m.h();
        int round = Math.round(this.f3615j + this.f3613h) - h10;
        int round2 = Math.round(this.f3616k + this.f3614i) - h10;
        int i10 = h10 * 2;
        int width = e0Var2.f3220a.getWidth() + round + i10;
        int height = e0Var2.f3220a.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.o layoutManager = this.f3623r.getLayoutManager();
        int Q2 = layoutManager.Q();
        int i13 = 0;
        while (i13 < Q2) {
            View P2 = layoutManager.P(i13);
            if (P2 != e0Var2.f3220a && P2.getBottom() >= round2 && P2.getTop() <= height && P2.getRight() >= round && P2.getLeft() <= width) {
                RecyclerView.e0 s02 = this.f3623r.s0(P2);
                if (this.f3618m.a(this.f3623r, this.f3608c, s02)) {
                    int abs = Math.abs(i11 - ((P2.getLeft() + P2.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((P2.getTop() + P2.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f3626u.size();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < size && i14 > this.f3627v.get(i15).intValue()) {
                        i16++;
                        i15++;
                        RecyclerView.e0 e0Var3 = e0Var;
                    }
                    this.f3626u.add(i16, s02);
                    this.f3627v.add(i16, Integer.valueOf(i14));
                }
            }
            i13++;
            e0Var2 = e0Var;
        }
        return this.f3626u;
    }

    public final RecyclerView.e0 v(MotionEvent motionEvent) {
        View t10;
        RecyclerView.o layoutManager = this.f3623r.getLayoutManager();
        int i10 = this.f3617l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f3609d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f3610e);
        int i11 = this.f3622q;
        if (abs < ((float) i11) && abs2 < ((float) i11)) {
            return null;
        }
        if (abs > abs2 && layoutManager.n()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.o()) && (t10 = t(motionEvent)) != null) {
            return this.f3623r.s0(t10);
        }
        return null;
    }

    public final void w(float[] fArr) {
        if ((this.f3620o & 12) != 0) {
            fArr[0] = (this.f3615j + this.f3613h) - ((float) this.f3608c.f3220a.getLeft());
        } else {
            fArr[0] = this.f3608c.f3220a.getTranslationX();
        }
        if ((this.f3620o & 3) != 0) {
            fArr[1] = (this.f3616k + this.f3614i) - ((float) this.f3608c.f3220a.getTop());
        } else {
            fArr[1] = this.f3608c.f3220a.getTranslationY();
        }
    }

    public boolean x() {
        int size = this.f3621p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f3621p.get(i10).f3657m) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.e0 e0Var) {
        if (!this.f3623r.isLayoutRequested() && this.f3619n == 2) {
            float k10 = this.f3618m.k(e0Var);
            int i10 = (int) (this.f3615j + this.f3613h);
            int i11 = (int) (this.f3616k + this.f3614i);
            if (((float) Math.abs(i11 - e0Var.f3220a.getTop())) >= ((float) e0Var.f3220a.getHeight()) * k10 || ((float) Math.abs(i10 - e0Var.f3220a.getLeft())) >= ((float) e0Var.f3220a.getWidth()) * k10) {
                List<RecyclerView.e0> u10 = u(e0Var);
                if (u10.size() != 0) {
                    RecyclerView.e0 b10 = this.f3618m.b(e0Var, u10, i10, i11);
                    if (b10 == null) {
                        this.f3626u.clear();
                        this.f3627v.clear();
                        return;
                    }
                    int j10 = b10.j();
                    int j11 = e0Var.j();
                    if (this.f3618m.A(this.f3623r, e0Var, b10)) {
                        this.f3618m.B(this.f3623r, e0Var, j11, b10, j10, i10, i11);
                    }
                }
            }
        }
    }
}

package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.g1;
import d.m0;
import d.o0;
import f1.w1;
import g1.c0;
import g1.z;
import m1.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: k  reason: collision with root package name */
    public static final int f16671k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f16672l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f16673m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f16674n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f16675o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f16676p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final float f16677q = 0.5f;

    /* renamed from: r  reason: collision with root package name */
    public static final float f16678r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final float f16679s = 0.5f;

    /* renamed from: a  reason: collision with root package name */
    public m1.c f16680a;

    /* renamed from: b  reason: collision with root package name */
    public c f16681b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16682c;

    /* renamed from: d  reason: collision with root package name */
    public float f16683d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16684e;

    /* renamed from: f  reason: collision with root package name */
    public int f16685f = 2;

    /* renamed from: g  reason: collision with root package name */
    public float f16686g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public float f16687h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f16688i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    public final c.C0178c f16689j = new a();

    public class a extends c.C0178c {

        /* renamed from: d  reason: collision with root package name */
        public static final int f16690d = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f16691a;

        /* renamed from: b  reason: collision with root package name */
        public int f16692b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f16691a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(@d.m0 android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = f1.w1.X(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = r0
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f16685f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f16691a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f16691a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f16691a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f16691a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f16691a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.I(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        public int b(@m0 View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(@m0 View view) {
            return view.getWidth();
        }

        public void i(@m0 View view, int i10) {
            this.f16692b = i10;
            this.f16691a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f16681b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        public void k(@m0 View view, int i10, int i11, int i12, int i13) {
            float width = ((float) this.f16691a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f16687h);
            float width2 = ((float) this.f16691a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f16688i);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(width, width2, f10), 1.0f));
            }
        }

        public void l(@m0 View view, float f10, float f11) {
            boolean z10;
            int i10;
            c cVar;
            this.f16692b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f16691a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f16691a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f16680a.T(i10, view.getTop())) {
                w1.n1(view, new d(view, z10));
            } else if (z10 && (cVar = SwipeDismissBehavior.this.f16681b) != null) {
                cVar.a(view);
            }
        }

        public boolean m(View view, int i10) {
            int i11 = this.f16692b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.G(view);
        }

        public final boolean n(@m0 View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                boolean z10 = w1.X(view) == 1;
                int i11 = SwipeDismissBehavior.this.f16685f;
                if (i11 == 2) {
                    return true;
                }
                if (i11 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (i10 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i11 != 1) {
                    return false;
                } else {
                    if (z10) {
                        if (i10 <= 0) {
                            return false;
                        }
                    } else if (f10 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.f16691a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16686g);
            }
        }
    }

    public class b implements c0 {
        public b() {
        }

        public boolean a(@m0 View view, @o0 c0.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.G(view)) {
                return false;
            }
            boolean z11 = w1.X(view) == 1;
            int i10 = SwipeDismissBehavior.this.f16685f;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            w1.c1(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f16681b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    public class d implements Runnable {
        public final View O;
        public final boolean P;

        public d(View view, boolean z10) {
            this.O = view;
            this.P = z10;
        }

        public void run() {
            c cVar;
            m1.c cVar2 = SwipeDismissBehavior.this.f16680a;
            if (cVar2 != null && cVar2.o(true)) {
                w1.n1(this.O, this);
            } else if (this.P && (cVar = SwipeDismissBehavior.this.f16681b) != null) {
                cVar.a(this.O);
            }
        }
    }

    public static float H(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int I(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float K(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    public boolean E(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        m1.c cVar = this.f16680a;
        if (cVar == null) {
            return false;
        }
        cVar.L(motionEvent);
        return true;
    }

    public boolean G(@m0 View view) {
        return true;
    }

    public final void J(ViewGroup viewGroup) {
        if (this.f16680a == null) {
            this.f16680a = this.f16684e ? m1.c.p(viewGroup, this.f16683d, this.f16689j) : m1.c.q(viewGroup, this.f16689j);
        }
    }

    public int L() {
        m1.c cVar = this.f16680a;
        if (cVar != null) {
            return cVar.E();
        }
        return 0;
    }

    @o0
    @g1
    public c M() {
        return this.f16681b;
    }

    public void N(float f10) {
        this.f16686g = H(0.0f, f10, 1.0f);
    }

    public void O(float f10) {
        this.f16688i = H(0.0f, f10, 1.0f);
    }

    public void P(@o0 c cVar) {
        this.f16681b = cVar;
    }

    public void Q(float f10) {
        this.f16683d = f10;
        this.f16684e = true;
    }

    public void R(float f10) {
        this.f16687h = H(0.0f, f10, 1.0f);
    }

    public void S(int i10) {
        this.f16685f = i10;
    }

    public final void T(View view) {
        w1.p1(view, 1048576);
        if (G(view)) {
            w1.s1(view, z.a.f7619z, (CharSequence) null, new b());
        }
    }

    public boolean l(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 MotionEvent motionEvent) {
        boolean z10 = this.f16682c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.G(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16682c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16682c = false;
        }
        if (!z10) {
            return false;
        }
        J(coordinatorLayout);
        return this.f16680a.U(motionEvent);
    }

    public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, int i10) {
        boolean m10 = super.m(coordinatorLayout, v10, i10);
        if (w1.T(v10) == 0) {
            w1.P1(v10, 1);
            T(v10);
        }
        return m10;
    }
}

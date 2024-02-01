package m1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import d.m0;
import d.o0;
import d.r0;
import f1.w1;
import java.util.Arrays;

public class c {
    public static final int A = 2;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 15;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 20;
    public static final int K = 256;
    public static final int L = 600;
    public static final Interpolator M = new a();

    /* renamed from: w  reason: collision with root package name */
    public static final String f10280w = "ViewDragHelper";

    /* renamed from: x  reason: collision with root package name */
    public static final int f10281x = -1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f10282y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10283z = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f10284a;

    /* renamed from: b  reason: collision with root package name */
    public int f10285b;

    /* renamed from: c  reason: collision with root package name */
    public int f10286c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f10287d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f10288e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f10289f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f10290g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f10291h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f10292i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f10293j;

    /* renamed from: k  reason: collision with root package name */
    public int f10294k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f10295l;

    /* renamed from: m  reason: collision with root package name */
    public float f10296m;

    /* renamed from: n  reason: collision with root package name */
    public float f10297n;

    /* renamed from: o  reason: collision with root package name */
    public int f10298o;

    /* renamed from: p  reason: collision with root package name */
    public int f10299p;

    /* renamed from: q  reason: collision with root package name */
    public OverScroller f10300q;

    /* renamed from: r  reason: collision with root package name */
    public final C0178c f10301r;

    /* renamed from: s  reason: collision with root package name */
    public View f10302s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10303t;

    /* renamed from: u  reason: collision with root package name */
    public final ViewGroup f10304u;

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f10305v = new b();

    public static class a implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c.this.Q(0);
        }
    }

    /* renamed from: m1.c$c  reason: collision with other inner class name */
    public static abstract class C0178c {
        public int a(@m0 View view, int i10, int i11) {
            return 0;
        }

        public int b(@m0 View view, int i10, int i11) {
            return 0;
        }

        public int c(int i10) {
            return i10;
        }

        public int d(@m0 View view) {
            return 0;
        }

        public int e(@m0 View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(@m0 View view, int i10) {
        }

        public void j(int i10) {
        }

        public void k(@m0 View view, int i10, int i11, @r0 int i12, @r0 int i13) {
        }

        public void l(@m0 View view, float f10, float f11) {
        }

        public abstract boolean m(@m0 View view, int i10);
    }

    public c(@m0 Context context, @m0 ViewGroup viewGroup, @m0 C0178c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f10304u = viewGroup;
            this.f10301r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f10298o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f10285b = viewConfiguration.getScaledTouchSlop();
            this.f10296m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f10297n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f10300q = new OverScroller(context, M);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static c p(@m0 ViewGroup viewGroup, float f10, @m0 C0178c cVar) {
        c q10 = q(viewGroup, cVar);
        q10.f10285b = (int) (((float) q10.f10285b) * (1.0f / f10));
        return q10;
    }

    public static c q(@m0 ViewGroup viewGroup, @m0 C0178c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    @r0
    public int A() {
        return this.f10298o;
    }

    public final int B(int i10, int i11) {
        int i12 = i10 < this.f10304u.getLeft() + this.f10298o ? 1 : 0;
        if (i11 < this.f10304u.getTop() + this.f10298o) {
            i12 |= 4;
        }
        if (i10 > this.f10304u.getRight() - this.f10298o) {
            i12 |= 2;
        }
        return i11 > this.f10304u.getBottom() - this.f10298o ? i12 | 8 : i12;
    }

    public float C() {
        return this.f10297n;
    }

    @r0
    public int D() {
        return this.f10285b;
    }

    public int E() {
        return this.f10284a;
    }

    public boolean F(int i10, int i11) {
        return K(this.f10302s, i10, i11);
    }

    public boolean G(int i10) {
        int length = this.f10291h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (H(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean H(int i10, int i11) {
        return I(i11) && (i10 & this.f10291h[i11]) != 0;
    }

    public boolean I(int i10) {
        return ((1 << i10) & this.f10294k) != 0;
    }

    public final boolean J(int i10) {
        if (I(i10)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ignoring pointerId=");
        sb2.append(i10);
        sb2.append(" because ACTION_DOWN was not received ");
        sb2.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb2.append(" ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean K(@o0 View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void L(@m0 MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f10295l == null) {
            this.f10295l = VelocityTracker.obtain();
        }
        this.f10295l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f10284a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i11 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i11);
                            if (J(pointerId)) {
                                float x10 = motionEvent.getX(i11);
                                float y10 = motionEvent.getY(i11);
                                float f10 = x10 - this.f10287d[pointerId];
                                float f11 = y10 - this.f10288e[pointerId];
                                N(f10, f11, pointerId);
                                if (this.f10284a != 1) {
                                    View v10 = v((int) x10, (int) y10);
                                    if (h(v10, f10, f11) && W(v10, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                    } else if (J(this.f10286c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f10286c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f10289f;
                        int i12 = this.f10286c;
                        int i13 = (int) (x11 - fArr[i12]);
                        int i14 = (int) (y11 - this.f10290g[i12]);
                        t(this.f10302s.getLeft() + i13, this.f10302s.getTop() + i14, i13, i14);
                    } else {
                        return;
                    }
                    P(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x12 = motionEvent.getX(actionIndex);
                        float y12 = motionEvent.getY(actionIndex);
                        O(x12, y12, pointerId2);
                        if (this.f10284a == 0) {
                            W(v((int) x12, (int) y12), pointerId2);
                            int i15 = this.f10291h[pointerId2];
                            int i16 = this.f10299p;
                            if ((i15 & i16) != 0) {
                                this.f10301r.h(i15 & i16, pointerId2);
                                return;
                            }
                            return;
                        } else if (F((int) x12, (int) y12)) {
                            W(this.f10302s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f10284a == 1 && pointerId3 == this.f10286c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i11 >= pointerCount2) {
                                    i10 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i11);
                                if (pointerId4 != this.f10286c) {
                                    View v11 = v((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                                    View view = this.f10302s;
                                    if (v11 == view && W(view, pointerId4)) {
                                        i10 = this.f10286c;
                                        break;
                                    }
                                }
                                i11++;
                            }
                            if (i10 == -1) {
                                M();
                            }
                        }
                        l(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f10284a == 1) {
                    r(0.0f, 0.0f);
                }
            } else if (this.f10284a == 1) {
                M();
            }
            c();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View v12 = v((int) x13, (int) y13);
        O(x13, y13, pointerId5);
        W(v12, pointerId5);
        int i17 = this.f10291h[pointerId5];
        int i18 = this.f10299p;
        if ((i17 & i18) != 0) {
            this.f10301r.h(i17 & i18, pointerId5);
        }
    }

    public final void M() {
        this.f10295l.computeCurrentVelocity(1000, this.f10296m);
        r(i(this.f10295l.getXVelocity(this.f10286c), this.f10297n, this.f10296m), i(this.f10295l.getYVelocity(this.f10286c), this.f10297n, this.f10296m));
    }

    public final void N(float f10, float f11, int i10) {
        boolean e10 = e(f10, f11, i10, 1);
        if (e(f11, f10, i10, 4)) {
            e10 |= true;
        }
        if (e(f10, f11, i10, 2)) {
            e10 |= true;
        }
        if (e(f11, f10, i10, 8)) {
            e10 |= true;
        }
        if (e10) {
            int[] iArr = this.f10292i;
            iArr[i10] = iArr[i10] | e10;
            this.f10301r.f(e10 ? 1 : 0, i10);
        }
    }

    public final void O(float f10, float f11, int i10) {
        u(i10);
        float[] fArr = this.f10287d;
        this.f10289f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f10288e;
        this.f10290g[i10] = f11;
        fArr2[i10] = f11;
        this.f10291h[i10] = B((int) f10, (int) f11);
        this.f10294k |= 1 << i10;
    }

    public final void P(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (J(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f10289f[pointerId] = x10;
                this.f10290g[pointerId] = y10;
            }
        }
    }

    public void Q(int i10) {
        this.f10304u.removeCallbacks(this.f10305v);
        if (this.f10284a != i10) {
            this.f10284a = i10;
            this.f10301r.j(i10);
            if (this.f10284a == 0) {
                this.f10302s = null;
            }
        }
    }

    public void R(int i10) {
        this.f10299p = i10;
    }

    public void S(float f10) {
        this.f10297n = f10;
    }

    public boolean T(int i10, int i11) {
        if (this.f10303t) {
            return x(i10, i11, (int) this.f10295l.getXVelocity(this.f10286c), (int) this.f10295l.getYVelocity(this.f10286c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean U(@d.m0 android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.c()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f10295l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f10295l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f10295l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.l(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.O(r7, r1, r2)
            int r3 = r0.f10284a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f10291h
            r1 = r1[r2]
            int r3 = r0.f10299p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            m1.c$c r4 = r0.f10301r
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.v(r3, r1)
            android.view.View r3 = r0.f10302s
            if (r1 != r3) goto L_0x0031
            r0.W(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f10287d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f10288e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.J(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f10287d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f10288e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.v(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.h(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            m1.c$c r14 = r0.f10301r
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            m1.c$c r5 = r0.f10301r
            int r5 = r5.b(r7, r15, r14)
            m1.c$c r14 = r0.f10301r
            int r14 = r14.d(r7)
            m1.c$c r15 = r0.f10301r
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.N(r9, r10, r4)
            int r5 = r0.f10284a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.W(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.P(r17)
            goto L_0x0031
        L_0x00ff:
            r16.c()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.O(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.v(r2, r3)
            android.view.View r3 = r0.f10302s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f10284a
            if (r3 != r4) goto L_0x0125
            r0.W(r2, r1)
        L_0x0125:
            int[] r2 = r0.f10291h
            r2 = r2[r1]
            int r3 = r0.f10299p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            m1.c$c r4 = r0.f10301r
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f10284a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.c.U(android.view.MotionEvent):boolean");
    }

    public boolean V(@m0 View view, int i10, int i11) {
        this.f10302s = view;
        this.f10286c = -1;
        boolean x10 = x(i10, i11, 0, 0);
        if (!x10 && this.f10284a == 0 && this.f10302s != null) {
            this.f10302s = null;
        }
        return x10;
    }

    public boolean W(View view, int i10) {
        if (view == this.f10302s && this.f10286c == i10) {
            return true;
        }
        if (view == null || !this.f10301r.m(view, i10)) {
            return false;
        }
        this.f10286c = i10;
        d(view, i10);
        return true;
    }

    public void a() {
        c();
        if (this.f10284a == 2) {
            int currX = this.f10300q.getCurrX();
            int currY = this.f10300q.getCurrY();
            this.f10300q.abortAnimation();
            int currX2 = this.f10300q.getCurrX();
            int currY2 = this.f10300q.getCurrY();
            this.f10301r.k(this.f10302s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        Q(0);
    }

    public boolean b(@m0 View view, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom()) {
                    if (b(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z10 && (view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11));
    }

    public void c() {
        this.f10286c = -1;
        k();
        VelocityTracker velocityTracker = this.f10295l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10295l = null;
        }
    }

    public void d(@m0 View view, int i10) {
        if (view.getParent() == this.f10304u) {
            this.f10302s = view;
            this.f10286c = i10;
            this.f10301r.i(view, i10);
            Q(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f10304u + ")");
    }

    public final boolean e(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f10291h[i10] & i11) != i11 || (this.f10299p & i11) == 0 || (this.f10293j[i10] & i11) == i11 || (this.f10292i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f10285b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f10301r.g(i11)) {
            return (this.f10292i[i10] & i11) == 0 && abs > ((float) this.f10285b);
        }
        int[] iArr = this.f10293j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    public boolean f(int i10) {
        int length = this.f10287d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (g(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i10, int i11) {
        if (!I(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f10289f[i11] - this.f10287d[i11];
        float f11 = this.f10290g[i11] - this.f10288e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f10285b) : z11 && Math.abs(f11) > ((float) this.f10285b);
        }
        int i12 = this.f10285b;
        return (f10 * f10) + (f11 * f11) > ((float) (i12 * i12));
    }

    public final boolean h(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f10301r.d(view) > 0;
        boolean z11 = this.f10301r.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f10285b) : z11 && Math.abs(f11) > ((float) this.f10285b);
        }
        int i10 = this.f10285b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    public final float i(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int j(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void k() {
        float[] fArr = this.f10287d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10288e, 0.0f);
            Arrays.fill(this.f10289f, 0.0f);
            Arrays.fill(this.f10290g, 0.0f);
            Arrays.fill(this.f10291h, 0);
            Arrays.fill(this.f10292i, 0);
            Arrays.fill(this.f10293j, 0);
            this.f10294k = 0;
        }
    }

    public final void l(int i10) {
        if (this.f10287d != null && I(i10)) {
            this.f10287d[i10] = 0.0f;
            this.f10288e[i10] = 0.0f;
            this.f10289f[i10] = 0.0f;
            this.f10290g[i10] = 0.0f;
            this.f10291h[i10] = 0;
            this.f10292i[i10] = 0;
            this.f10293j[i10] = 0;
            this.f10294k = (~(1 << i10)) & this.f10294k;
        }
    }

    public final int m(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f10304u.getWidth();
        float f10 = (float) (width / 2);
        float s10 = f10 + (s(Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width))) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(s10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f), 600);
    }

    public final int n(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int j10 = j(i12, (int) this.f10297n, (int) this.f10296m);
        int j11 = j(i13, (int) this.f10297n, (int) this.f10296m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(j10);
        int abs4 = Math.abs(j11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (j10 != 0) {
            f11 = (float) abs3;
            f10 = (float) i14;
        } else {
            f11 = (float) abs;
            f10 = (float) i15;
        }
        float f14 = f11 / f10;
        if (j11 != 0) {
            f13 = (float) abs4;
            f12 = (float) i14;
        } else {
            f13 = (float) abs2;
            f12 = (float) i15;
        }
        float f15 = f13 / f12;
        return (int) ((((float) m(i10, j10, this.f10301r.d(view))) * f14) + (((float) m(i11, j11, this.f10301r.e(view))) * f15));
    }

    public boolean o(boolean z10) {
        if (this.f10284a == 2) {
            boolean computeScrollOffset = this.f10300q.computeScrollOffset();
            int currX = this.f10300q.getCurrX();
            int currY = this.f10300q.getCurrY();
            int left = currX - this.f10302s.getLeft();
            int top = currY - this.f10302s.getTop();
            if (left != 0) {
                w1.c1(this.f10302s, left);
            }
            if (top != 0) {
                w1.d1(this.f10302s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f10301r.k(this.f10302s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f10300q.getFinalX() && currY == this.f10300q.getFinalY()) {
                this.f10300q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f10304u.post(this.f10305v);
                } else {
                    Q(0);
                }
            }
        }
        return this.f10284a == 2;
    }

    public final void r(float f10, float f11) {
        this.f10303t = true;
        this.f10301r.l(this.f10302s, f10, f11);
        this.f10303t = false;
        if (this.f10284a == 1) {
            Q(0);
        }
    }

    public final float s(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    public final void t(int i10, int i11, int i12, int i13) {
        int left = this.f10302s.getLeft();
        int top = this.f10302s.getTop();
        if (i12 != 0) {
            i10 = this.f10301r.a(this.f10302s, i10, i12);
            w1.c1(this.f10302s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f10301r.b(this.f10302s, i11, i13);
            w1.d1(this.f10302s, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f10301r.k(this.f10302s, i14, i15, i14 - left, i15 - top);
        }
    }

    public final void u(int i10) {
        float[] fArr = this.f10287d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10288e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10289f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10290g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10291h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10292i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10293j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10287d = fArr2;
            this.f10288e = fArr3;
            this.f10289f = fArr4;
            this.f10290g = fArr5;
            this.f10291h = iArr;
            this.f10292i = iArr2;
            this.f10293j = iArr3;
        }
    }

    @o0
    public View v(int i10, int i11) {
        for (int childCount = this.f10304u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f10304u.getChildAt(this.f10301r.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i10, int i11, int i12, int i13) {
        if (this.f10303t) {
            this.f10300q.fling(this.f10302s.getLeft(), this.f10302s.getTop(), (int) this.f10295l.getXVelocity(this.f10286c), (int) this.f10295l.getYVelocity(this.f10286c), i10, i12, i11, i13);
            Q(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    public final boolean x(int i10, int i11, int i12, int i13) {
        int left = this.f10302s.getLeft();
        int top = this.f10302s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f10300q.abortAnimation();
            Q(0);
            return false;
        }
        this.f10300q.startScroll(left, top, i14, i15, n(this.f10302s, i14, i15, i12, i13));
        Q(2);
        return true;
    }

    public int y() {
        return this.f10286c;
    }

    @o0
    public View z() {
        return this.f10302s;
    }
}

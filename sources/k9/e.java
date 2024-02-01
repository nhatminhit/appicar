package k9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.m0;
import d.o0;
import f1.w1;

public abstract class e<V extends View> extends g<V> {

    /* renamed from: k  reason: collision with root package name */
    public static final int f19980k = -1;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public Runnable f19981d;

    /* renamed from: e  reason: collision with root package name */
    public OverScroller f19982e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19983f;

    /* renamed from: g  reason: collision with root package name */
    public int f19984g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f19985h;

    /* renamed from: i  reason: collision with root package name */
    public int f19986i = -1;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public VelocityTracker f19987j;

    public class a implements Runnable {
        public final CoordinatorLayout O;
        public final V P;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.O = coordinatorLayout;
            this.P = v10;
        }

        public void run() {
            OverScroller overScroller;
            if (this.P != null && (overScroller = e.this.f19982e) != null) {
                if (overScroller.computeScrollOffset()) {
                    e eVar = e.this;
                    eVar.X(this.O, this.P, eVar.f19982e.getCurrY());
                    w1.n1(this.P, this);
                    return;
                }
                e.this.V(this.O, this.P);
            }
        }
    }

    public e() {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean E(@d.m0 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @d.m0 V r13, @d.m0 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f19984g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f19985h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f19984g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f19985h
            int r7 = r1 - r0
            r11.f19985h = r0
            int r8 = r11.S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.W(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f19987j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f19987j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f19987j
            int r4 = r11.f19984g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.R(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f19983f = r3
            r11.f19984g = r1
            android.view.VelocityTracker r13 = r11.f19987j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f19987j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f19987j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f19983f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.e.E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean P(V v10) {
        return false;
    }

    public final void Q() {
        if (this.f19987j == null) {
            this.f19987j = VelocityTracker.obtain();
        }
    }

    public final boolean R(CoordinatorLayout coordinatorLayout, @m0 V v10, int i10, int i11, float f10) {
        V v11 = v10;
        Runnable runnable = this.f19981d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f19981d = null;
        }
        if (this.f19982e == null) {
            this.f19982e = new OverScroller(v10.getContext());
        }
        this.f19982e.fling(0, H(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f19982e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            a aVar = new a(coordinatorLayout, v10);
            this.f19981d = aVar;
            w1.n1(v10, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        V(coordinatorLayout, v10);
        return false;
    }

    public int S(@m0 V v10) {
        return -v10.getHeight();
    }

    public int T(@m0 V v10) {
        return v10.getHeight();
    }

    public int U() {
        return H();
    }

    public void V(CoordinatorLayout coordinatorLayout, V v10) {
    }

    public final int W(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Y(coordinatorLayout, v10, U() - i10, i11, i12);
    }

    public int X(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Y(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int Y(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int c10;
        int H = H();
        if (i11 == 0 || H < i11 || H > i12 || H == (c10 = v0.a.c(i10, i11, i12))) {
            return 0;
        }
        N(c10);
        return H - c10;
    }

    public boolean l(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f19986i < 0) {
            this.f19986i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f19983f) {
            int i10 = this.f19984g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f19985h) > this.f19986i) {
                this.f19985h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f19984g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = P(v10) && coordinatorLayout.G(v10, x10, y11);
            this.f19983f = z10;
            if (z10) {
                this.f19985h = y11;
                this.f19984g = motionEvent.getPointerId(0);
                Q();
                OverScroller overScroller = this.f19982e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f19982e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f19987j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
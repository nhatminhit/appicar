package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import d.x0;
import l.f;

@x0({x0.a.Q})
public abstract class e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float O;
    public final int P;
    public final int Q;
    public final View R;
    public Runnable S;
    public Runnable T;
    public boolean U;
    public int V;
    public final int[] W = new int[2];

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = e0.this.R.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e0.this.e();
        }
    }

    public e0(View view) {
        this.R = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.O = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.P = tapTimeout;
        this.Q = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.T;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.S;
        if (runnable2 != null) {
            this.R.removeCallbacks(runnable2);
        }
    }

    public abstract f b();

    public boolean c() {
        f b10 = b();
        if (b10 == null || b10.c()) {
            return true;
        }
        b10.a();
        return true;
    }

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.c()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.R;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.U = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        c0 c0Var;
        View view = this.R;
        f b10 = b();
        if (b10 == null || !b10.c() || (c0Var = (c0) b10.k()) == null || !c0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(c0Var, obtainNoHistory);
        boolean f10 = c0Var.f(obtainNoHistory, this.V);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return f10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.R
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.V
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.O
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.V = r6
            java.lang.Runnable r6 = r5.S
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.e0$a r6 = new androidx.appcompat.widget.e0$a
            r6.<init>()
            r5.S = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.S
            int r1 = r5.P
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.T
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.T = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.T
            int r1 = r5.Q
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.W;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.W;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.U;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.R.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.U = z10;
        return z10 || z11;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.U = false;
        this.V = -1;
        Runnable runnable = this.S;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
        }
    }
}

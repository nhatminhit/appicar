package m1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.j;
import d.m0;
import d.o0;
import f1.r2;
import f1.w1;
import g1.a0;
import g1.b0;
import g1.z;
import java.util.ArrayList;
import java.util.List;
import m1.b;

public abstract class a extends f1.a {

    /* renamed from: n  reason: collision with root package name */
    public static final int f10263n = Integer.MIN_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10264o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final String f10265p = "android.view.View";

    /* renamed from: q  reason: collision with root package name */
    public static final Rect f10266q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: r  reason: collision with root package name */
    public static final b.a<z> f10267r = new C0176a();

    /* renamed from: s  reason: collision with root package name */
    public static final b.C0177b<j<z>, z> f10268s = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f10269d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f10270e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f10271f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f10272g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f10273h;

    /* renamed from: i  reason: collision with root package name */
    public final View f10274i;

    /* renamed from: j  reason: collision with root package name */
    public c f10275j;

    /* renamed from: k  reason: collision with root package name */
    public int f10276k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f10277l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f10278m = Integer.MIN_VALUE;

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    public static class C0176a implements b.a<z> {
        /* renamed from: b */
        public void a(z zVar, Rect rect) {
            zVar.r(rect);
        }
    }

    public static class b implements b.C0177b<j<z>, z> {
        /* renamed from: c */
        public z a(j<z> jVar, int i10) {
            return jVar.F(i10);
        }

        /* renamed from: d */
        public int b(j<z> jVar) {
            return jVar.E();
        }
    }

    public class c extends a0 {
        public c() {
        }

        public z b(int i10) {
            return z.E0(a.this.L(i10));
        }

        public z d(int i10) {
            int i11 = i10 == 2 ? a.this.f10276k : a.this.f10277l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.T(i10, i11, bundle);
        }
    }

    public a(@m0 View view) {
        if (view != null) {
            this.f10274i = view;
            this.f10273h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (w1.T(view) == 0) {
                w1.P1(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public static Rect E(@m0 View view, int i10, @m0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    public static int J(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.f10277l;
    }

    public abstract int C(float f10, float f11);

    public abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int i10) {
        H(i10, 0);
    }

    public final void H(int i10, int i11) {
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f10273h.isEnabled() && (parent = this.f10274i.getParent()) != null) {
            AccessibilityEvent q10 = q(i10, 2048);
            g1.b.i(q10, i11);
            r2.p(parent, this.f10274i, q10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean I(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f10274i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f10274i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.I(android.graphics.Rect):boolean");
    }

    public final boolean K(int i10, @o0 Rect rect) {
        Object obj;
        j<z> y10 = y();
        int i11 = this.f10277l;
        int i12 = Integer.MIN_VALUE;
        z n10 = i11 == Integer.MIN_VALUE ? null : y10.n(i11);
        if (i10 == 1 || i10 == 2) {
            obj = b.d(y10, f10268s, f10267r, n10, i10, w1.X(this.f10274i) == 1, false);
        } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            Rect rect2 = new Rect();
            int i13 = this.f10277l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.f10274i, i10, rect2);
            }
            obj = b.c(y10, f10268s, f10267r, n10, rect2, i10);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        z zVar = (z) obj;
        if (zVar != null) {
            i12 = y10.t(y10.r(zVar));
        }
        return X(i12);
    }

    @m0
    public z L(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void M(boolean z10, int i10, @o0 Rect rect) {
        int i11 = this.f10277l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            K(i10, rect);
        }
    }

    public abstract boolean N(int i10, int i11, @o0 Bundle bundle);

    public void O(@m0 AccessibilityEvent accessibilityEvent) {
    }

    public void P(int i10, @m0 AccessibilityEvent accessibilityEvent) {
    }

    public void Q(@m0 z zVar) {
    }

    public abstract void R(int i10, @m0 z zVar);

    public void S(int i10, boolean z10) {
    }

    public boolean T(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? U(i10, i11, bundle) : V(i11, bundle);
    }

    public final boolean U(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? N(i10, i11, bundle) : n(i10) : W(i10) : o(i10) : X(i10);
    }

    public final boolean V(int i10, Bundle bundle) {
        return w1.j1(this.f10274i, i10, bundle);
    }

    public final boolean W(int i10) {
        int i11;
        if (!this.f10273h.isEnabled() || !this.f10273h.isTouchExplorationEnabled() || (i11 = this.f10276k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f10276k = i10;
        this.f10274i.invalidate();
        Y(i10, 32768);
        return true;
    }

    public final boolean X(int i10) {
        int i11;
        if ((!this.f10274i.isFocused() && !this.f10274i.requestFocus()) || (i11 = this.f10277l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        this.f10277l = i10;
        S(i10, true);
        Y(i10, 8);
        return true;
    }

    public final boolean Y(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f10273h.isEnabled() || (parent = this.f10274i.getParent()) == null) {
            return false;
        }
        return r2.p(parent, this.f10274i, q(i10, i11));
    }

    public final void Z(int i10) {
        int i11 = this.f10278m;
        if (i11 != i10) {
            this.f10278m = i10;
            Y(i10, 128);
            Y(i11, 256);
        }
    }

    public a0 b(View view) {
        if (this.f10275j == null) {
            this.f10275j = new c();
        }
        return this.f10275j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    public void g(View view, z zVar) {
        super.g(view, zVar);
        Q(zVar);
    }

    public final boolean n(int i10) {
        if (this.f10276k != i10) {
            return false;
        }
        this.f10276k = Integer.MIN_VALUE;
        this.f10274i.invalidate();
        Y(i10, 65536);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f10277l != i10) {
            return false;
        }
        this.f10277l = Integer.MIN_VALUE;
        S(i10, false);
        Y(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f10277l;
        return i10 != Integer.MIN_VALUE && N(i10, 16, (Bundle) null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        z L = L(i10);
        obtain.getText().add(L.T());
        obtain.setContentDescription(L.z());
        obtain.setScrollable(L.w0());
        obtain.setPassword(L.u0());
        obtain.setEnabled(L.n0());
        obtain.setChecked(L.h0());
        P(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(L.v());
            b0.Y(obtain, this.f10274i, i10);
            obtain.setPackageName(this.f10274i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f10274i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @m0
    public final z t(int i10) {
        z B0 = z.B0();
        B0.e1(true);
        B0.g1(true);
        B0.U0("android.view.View");
        Rect rect = f10266q;
        B0.P0(rect);
        B0.Q0(rect);
        B0.x1(this.f10274i);
        R(i10, B0);
        if (B0.T() == null && B0.z() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        B0.r(this.f10270e);
        if (!this.f10270e.equals(rect)) {
            int p10 = B0.p();
            if ((p10 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((p10 & 128) == 0) {
                B0.v1(this.f10274i.getContext().getPackageName());
                B0.H1(this.f10274i, i10);
                if (this.f10276k == i10) {
                    B0.N0(true);
                    B0.a(128);
                } else {
                    B0.N0(false);
                    B0.a(64);
                }
                boolean z10 = this.f10277l == i10;
                if (z10) {
                    B0.a(2);
                } else if (B0.o0()) {
                    B0.a(1);
                }
                B0.h1(z10);
                this.f10274i.getLocationOnScreen(this.f10272g);
                B0.s(this.f10269d);
                if (this.f10269d.equals(rect)) {
                    B0.r(this.f10269d);
                    if (B0.f7596b != -1) {
                        z B02 = z.B0();
                        for (int i11 = B0.f7596b; i11 != -1; i11 = B02.f7596b) {
                            B02.y1(this.f10274i, -1);
                            B02.P0(f10266q);
                            R(i11, B02);
                            B02.r(this.f10270e);
                            Rect rect2 = this.f10269d;
                            Rect rect3 = this.f10270e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        B02.H0();
                    }
                    this.f10269d.offset(this.f10272g[0] - this.f10274i.getScrollX(), this.f10272g[1] - this.f10274i.getScrollY());
                }
                if (this.f10274i.getLocalVisibleRect(this.f10271f)) {
                    this.f10271f.offset(this.f10272g[0] - this.f10274i.getScrollX(), this.f10272g[1] - this.f10274i.getScrollY());
                    if (this.f10269d.intersect(this.f10271f)) {
                        B0.Q0(this.f10269d);
                        if (I(this.f10269d)) {
                            B0.T1(true);
                        }
                    }
                }
                return B0;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    @m0
    public final z u() {
        z C0 = z.C0(this.f10274i);
        w1.g1(this.f10274i, C0);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (C0.u() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0.d(this.f10274i, ((Integer) arrayList.get(i10)).intValue());
            }
            return C0;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final boolean v(@m0 MotionEvent motionEvent) {
        if (!this.f10273h.isEnabled() || !this.f10273h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int C = C(motionEvent.getX(), motionEvent.getY());
            Z(C);
            return C != Integer.MIN_VALUE;
        } else if (action != 10 || this.f10278m == Integer.MIN_VALUE) {
            return false;
        } else {
            Z(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(@m0 KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int J = J(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && K(J, (Rect) null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return K(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return K(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f10276k;
    }

    public final j<z> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        j<z> jVar = new j<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jVar.u(i10, t(i10));
        }
        return jVar;
    }

    public final void z(int i10, Rect rect) {
        L(i10).r(rect);
    }
}

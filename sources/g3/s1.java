package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.x0;
import g3.a;
import g3.d0;
import g3.j0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k0.l;

public abstract class s1 extends j0 {
    public static final String L0 = "android:visibility:visibility";
    public static final String M0 = "android:visibility:parent";
    public static final String N0 = "android:visibility:screenLocation";
    public static final int O0 = 1;
    public static final int P0 = 2;
    public static final String[] Q0 = {L0, M0};
    public int K0 = 3;

    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7861a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7862b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7863c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f7861a = viewGroup;
            this.f7862b = view;
            this.f7863c = view2;
        }

        public void a(@m0 j0 j0Var) {
            z0.b(this.f7861a).d(this.f7862b);
        }

        public void c(@m0 j0 j0Var) {
            if (this.f7862b.getParent() == null) {
                z0.b(this.f7861a).c(this.f7862b);
            } else {
                s1.this.cancel();
            }
        }

        public void e(@m0 j0 j0Var) {
            this.f7863c.setTag(d0.e.save_overlay_view, (Object) null);
            z0.b(this.f7861a).d(this.f7862b);
            j0Var.o0(this);
        }
    }

    public static class b extends AnimatorListenerAdapter implements j0.h, a.C0133a {

        /* renamed from: a  reason: collision with root package name */
        public final View f7865a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7866b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f7867c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f7868d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7869e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7870f = false;

        public b(View view, int i10, boolean z10) {
            this.f7865a = view;
            this.f7866b = i10;
            this.f7867c = (ViewGroup) view.getParent();
            this.f7868d = z10;
            g(true);
        }

        public void a(@m0 j0 j0Var) {
            g(false);
        }

        public void b(@m0 j0 j0Var) {
        }

        public void c(@m0 j0 j0Var) {
            g(true);
        }

        public void d(@m0 j0 j0Var) {
        }

        public void e(@m0 j0 j0Var) {
            f();
            j0Var.o0(this);
        }

        public final void f() {
            if (!this.f7870f) {
                e1.i(this.f7865a, this.f7866b);
                ViewGroup viewGroup = this.f7867c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f7868d && this.f7869e != z10 && (viewGroup = this.f7867c) != null) {
                this.f7869e = z10;
                z0.d(viewGroup, z10);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f7870f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f7870f) {
                e1.i(this.f7865a, this.f7866b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f7870f) {
                e1.i(this.f7865a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7871a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7872b;

        /* renamed from: c  reason: collision with root package name */
        public int f7873c;

        /* renamed from: d  reason: collision with root package name */
        public int f7874d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f7875e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f7876f;
    }

    public s1() {
    }

    @SuppressLint({"RestrictedApi"})
    public s1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7713e);
        int k10 = l.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k10 != 0) {
            P0(k10);
        }
    }

    public final void H0(r0 r0Var) {
        r0Var.f7847a.put(L0, Integer.valueOf(r0Var.f7848b.getVisibility()));
        r0Var.f7847a.put(M0, r0Var.f7848b.getParent());
        int[] iArr = new int[2];
        r0Var.f7848b.getLocationOnScreen(iArr);
        r0Var.f7847a.put(N0, iArr);
    }

    public int I0() {
        return this.K0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f7875e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f7873c == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g3.s1.d J0(g3.r0 r8, g3.r0 r9) {
        /*
            r7 = this;
            g3.s1$d r0 = new g3.s1$d
            r0.<init>()
            r1 = 0
            r0.f7871a = r1
            r0.f7872b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7847a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7847a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f7873c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f7847a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f7875e = r6
            goto L_0x0037
        L_0x0033:
            r0.f7873c = r4
            r0.f7875e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f7847a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7847a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f7874d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f7847a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f7876f = r2
            goto L_0x005e
        L_0x005a:
            r0.f7874d = r4
            r0.f7876f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f7873c
            int r9 = r0.f7874d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f7875e
            android.view.ViewGroup r4 = r0.f7876f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f7876f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f7875e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f7874d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f7872b = r2
        L_0x008a:
            r0.f7871a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f7873c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f7872b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s1.J0(g3.r0, g3.r0):g3.s1$d");
    }

    public boolean K0(r0 r0Var) {
        if (r0Var == null) {
            return false;
        }
        return ((Integer) r0Var.f7847a.get(L0)).intValue() == 0 && ((View) r0Var.f7847a.get(M0)) != null;
    }

    public Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return null;
    }

    public Animator M0(ViewGroup viewGroup, r0 r0Var, int i10, r0 r0Var2, int i11) {
        if ((this.K0 & 1) != 1 || r0Var2 == null) {
            return null;
        }
        if (r0Var == null) {
            View view = (View) r0Var2.f7848b.getParent();
            if (J0(Q(view, false), b0(view, false)).f7871a) {
                return null;
            }
        }
        return L0(viewGroup, r0Var2.f7848b, r0Var, r0Var2);
    }

    public Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f7759k0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator O0(android.view.ViewGroup r18, g3.r0 r19, int r20, g3.r0 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.K0
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f7848b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f7848b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = g3.d0.e.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = r11
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = r12
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            g3.r0 r14 = r0.b0(r13, r12)
            g3.r0 r15 = r0.Q(r13, r12)
            g3.s1$d r14 = r0.J0(r14, r15)
            boolean r14 = r14.f7871a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = g3.q0.a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f7759k0
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = r11
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f7847a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            g3.w0 r4 = g3.z0.b(r18)
            r4.c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.N0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            g3.w0 r1 = g3.z0.b(r18)
            r1.d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            g3.s1$a r3 = new g3.s1$a
            r3.<init>(r1, r10, r5)
            r0.a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            g3.e1.i(r8, r11)
            android.animation.Animator r1 = r0.N0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            g3.s1$b r2 = new g3.s1$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            g3.a.a(r1, r2)
            r0.a(r2)
            goto L_0x0106
        L_0x0103:
            g3.e1.i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.s1.O0(android.view.ViewGroup, g3.r0, int, g3.r0, int):android.animation.Animator");
    }

    public void P0(int i10) {
        if ((i10 & -4) == 0) {
            this.K0 = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @o0
    public String[] a0() {
        return Q0;
    }

    public boolean c0(r0 r0Var, r0 r0Var2) {
        if (r0Var == null && r0Var2 == null) {
            return false;
        }
        if (r0Var != null && r0Var2 != null && r0Var2.f7847a.containsKey(L0) != r0Var.f7847a.containsKey(L0)) {
            return false;
        }
        d J0 = J0(r0Var, r0Var2);
        if (J0.f7871a) {
            return J0.f7873c == 0 || J0.f7874d == 0;
        }
        return false;
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
    }

    @o0
    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        d J0 = J0(r0Var, r0Var2);
        if (!J0.f7871a) {
            return null;
        }
        if (J0.f7875e == null && J0.f7876f == null) {
            return null;
        }
        if (J0.f7872b) {
            return M0(viewGroup, r0Var, J0.f7873c, r0Var2, J0.f7874d);
        }
        return O0(viewGroup, r0Var, J0.f7873c, r0Var2, J0.f7874d);
    }
}

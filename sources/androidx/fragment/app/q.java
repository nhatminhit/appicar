package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.lifecycle.b1;
import androidx.lifecycle.p;
import d.m0;
import d.o0;
import f1.w1;
import x0.e;
import x1.a;

public class q {

    /* renamed from: f  reason: collision with root package name */
    public static final String f2654f = "FragmentManager";

    /* renamed from: g  reason: collision with root package name */
    public static final String f2655g = "android:target_req_state";

    /* renamed from: h  reason: collision with root package name */
    public static final String f2656h = "android:target_state";

    /* renamed from: i  reason: collision with root package name */
    public static final String f2657i = "android:view_state";

    /* renamed from: j  reason: collision with root package name */
    public static final String f2658j = "android:view_registry_state";

    /* renamed from: k  reason: collision with root package name */
    public static final String f2659k = "android:user_visible_hint";

    /* renamed from: a  reason: collision with root package name */
    public final i f2660a;

    /* renamed from: b  reason: collision with root package name */
    public final t f2661b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f2662c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2663d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2664e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.O.removeOnAttachStateChangeListener(this);
            w1.t1(this.O);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.p$b[] r0 = androidx.lifecycle.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2665a = r0
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2665a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2665a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.b.<clinit>():void");
        }
    }

    public q(@m0 i iVar, @m0 t tVar, @m0 Fragment fragment) {
        this.f2660a = iVar;
        this.f2661b = tVar;
        this.f2662c = fragment;
    }

    public q(@m0 i iVar, @m0 t tVar, @m0 Fragment fragment, @m0 FragmentState fragmentState) {
        this.f2660a = iVar;
        this.f2661b = tVar;
        this.f2662c = fragment;
        fragment.Q = null;
        fragment.R = null;
        fragment.f2445f0 = 0;
        fragment.f2442c0 = false;
        fragment.Z = false;
        Fragment fragment2 = fragment.V;
        fragment.W = fragment2 != null ? fragment2.T : null;
        fragment.V = null;
        Bundle bundle = fragmentState.f2556a0;
        fragment.P = bundle == null ? new Bundle() : bundle;
    }

    public q(@m0 i iVar, @m0 t tVar, @m0 ClassLoader classLoader, @m0 f fVar, @m0 FragmentState fragmentState) {
        this.f2660a = iVar;
        this.f2661b = tVar;
        Fragment a10 = fVar.a(classLoader, fragmentState.O);
        this.f2662c = a10;
        Bundle bundle = fragmentState.X;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(fragmentState.X);
        a10.T = fragmentState.P;
        a10.f2441b0 = fragmentState.Q;
        a10.f2443d0 = true;
        a10.f2450k0 = fragmentState.R;
        a10.f2451l0 = fragmentState.S;
        a10.f2452m0 = fragmentState.T;
        a10.f2455p0 = fragmentState.U;
        a10.f2440a0 = fragmentState.V;
        a10.f2454o0 = fragmentState.W;
        a10.f2453n0 = fragmentState.Y;
        a10.F0 = p.b.values()[fragmentState.Z];
        Bundle bundle2 = fragmentState.f2556a0;
        a10.P = bundle2 == null ? new Bundle() : bundle2;
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Instantiated fragment ");
            sb2.append(a10);
        }
    }

    public void a() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto ACTIVITY_CREATED: ");
            sb2.append(this.f2662c);
        }
        Fragment fragment = this.f2662c;
        fragment.W(fragment.P);
        i iVar = this.f2660a;
        Fragment fragment2 = this.f2662c;
        iVar.a(fragment2, fragment2.P, false);
    }

    public void b() {
        int j10 = this.f2661b.j(this.f2662c);
        Fragment fragment = this.f2662c;
        fragment.f2460u0.addView(fragment.f2461v0, j10);
    }

    public void c() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto ATTACHED: ");
            sb2.append(this.f2662c);
        }
        Fragment fragment = this.f2662c;
        Fragment fragment2 = fragment.V;
        q qVar = null;
        if (fragment2 != null) {
            q n10 = this.f2661b.n(fragment2.T);
            if (n10 != null) {
                Fragment fragment3 = this.f2662c;
                fragment3.W = fragment3.V.T;
                fragment3.V = null;
                qVar = n10;
            } else {
                throw new IllegalStateException("Fragment " + this.f2662c + " declared target fragment " + this.f2662c.V + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.W;
            if (str != null && (qVar = this.f2661b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2662c + " declared target fragment " + this.f2662c.W + " that does not belong to this FragmentManager!");
            }
        }
        if (qVar != null && (FragmentManager.Q || qVar.k().O < 1)) {
            qVar.m();
        }
        Fragment fragment4 = this.f2662c;
        fragment4.f2447h0 = fragment4.f2446g0.H0();
        Fragment fragment5 = this.f2662c;
        fragment5.f2449j0 = fragment5.f2446g0.K0();
        this.f2660a.g(this.f2662c, false);
        this.f2662c.X();
        this.f2660a.b(this.f2662c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2662c;
        if (fragment2.f2446g0 == null) {
            return fragment2.O;
        }
        int i10 = this.f2664e;
        int i11 = b.f2665a[fragment2.F0.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment3 = this.f2662c;
        if (fragment3.f2441b0) {
            if (fragment3.f2442c0) {
                i10 = Math.max(this.f2664e, 2);
                View view = this.f2662c.f2461v0;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2664e < 4 ? Math.min(i10, fragment3.O) : Math.min(i10, 1);
            }
        }
        if (!this.f2662c.Z) {
            i10 = Math.min(i10, 1);
        }
        a0.e.b bVar = null;
        if (FragmentManager.Q && (viewGroup = fragment.f2460u0) != null) {
            bVar = a0.n(viewGroup, (fragment = this.f2662c).getParentFragmentManager()).l(this);
        }
        if (bVar == a0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == a0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f2662c;
            if (fragment4.f2440a0) {
                i10 = fragment4.S() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f2662c;
        if (fragment5.f2462w0 && fragment5.O < 5) {
            i10 = Math.min(i10, 4);
        }
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("computeExpectedState() of ");
            sb2.append(i10);
            sb2.append(" for ");
            sb2.append(this.f2662c);
        }
        return i10;
    }

    public void e() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto CREATED: ");
            sb2.append(this.f2662c);
        }
        Fragment fragment = this.f2662c;
        if (!fragment.E0) {
            this.f2660a.h(fragment, fragment.P, false);
            Fragment fragment2 = this.f2662c;
            fragment2.a0(fragment2.P);
            i iVar = this.f2660a;
            Fragment fragment3 = this.f2662c;
            iVar.c(fragment3, fragment3.P, false);
            return;
        }
        fragment.w0(fragment.P);
        this.f2662c.O = 1;
    }

    public void f() {
        String str;
        if (!this.f2662c.f2441b0) {
            if (FragmentManager.T0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto CREATE_VIEW: ");
                sb2.append(this.f2662c);
            }
            Fragment fragment = this.f2662c;
            LayoutInflater g02 = fragment.g0(fragment.P);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f2662c;
            ViewGroup viewGroup2 = fragment2.f2460u0;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = fragment2.f2451l0;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) fragment2.f2446g0.B0().c(this.f2662c.f2451l0);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f2662c;
                            if (!fragment3.f2443d0) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f2662c.f2451l0);
                                } catch (Resources.NotFoundException unused) {
                                    str = e.f15004b;
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2662c.f2451l0) + " (" + str + ") for fragment " + this.f2662c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f2662c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f2662c;
            fragment4.f2460u0 = viewGroup;
            fragment4.c0(g02, viewGroup, fragment4.P);
            View view = this.f2662c.f2461v0;
            if (view != null) {
                boolean z10 = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f2662c;
                fragment5.f2461v0.setTag(a.g.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f2662c;
                if (fragment6.f2453n0) {
                    fragment6.f2461v0.setVisibility(8);
                }
                if (w1.N0(this.f2662c.f2461v0)) {
                    w1.t1(this.f2662c.f2461v0);
                } else {
                    View view2 = this.f2662c.f2461v0;
                    view2.addOnAttachStateChangeListener(new a(view2));
                }
                this.f2662c.t0();
                i iVar = this.f2660a;
                Fragment fragment7 = this.f2662c;
                iVar.m(fragment7, fragment7.f2461v0, fragment7.P, false);
                int visibility = this.f2662c.f2461v0.getVisibility();
                float alpha = this.f2662c.f2461v0.getAlpha();
                if (FragmentManager.Q) {
                    this.f2662c.H0(alpha);
                    Fragment fragment8 = this.f2662c;
                    if (fragment8.f2460u0 != null && visibility == 0) {
                        View findFocus = fragment8.f2461v0.findFocus();
                        if (findFocus != null) {
                            this.f2662c.C0(findFocus);
                            if (FragmentManager.T0(2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("requestFocus: Saved focused view ");
                                sb3.append(findFocus);
                                sb3.append(" for Fragment ");
                                sb3.append(this.f2662c);
                            }
                        }
                        this.f2662c.f2461v0.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f2662c;
                    if (visibility == 0 && fragment9.f2460u0 != null) {
                        z10 = true;
                    }
                    fragment9.A0 = z10;
                }
            }
            this.f2662c.O = 2;
        }
    }

    public void g() {
        Fragment f10;
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("movefrom CREATED: ");
            sb2.append(this.f2662c);
        }
        Fragment fragment = this.f2662c;
        boolean z10 = true;
        boolean z11 = fragment.f2440a0 && !fragment.S();
        if (z11 || this.f2661b.p().s(this.f2662c)) {
            g<?> gVar = this.f2662c.f2447h0;
            if (gVar instanceof b1) {
                z10 = this.f2661b.p().o();
            } else if (gVar.f() instanceof Activity) {
                z10 = true ^ ((Activity) gVar.f()).isChangingConfigurations();
            }
            if (z11 || z10) {
                this.f2661b.p().h(this.f2662c);
            }
            this.f2662c.d0();
            this.f2660a.d(this.f2662c, false);
            for (q next : this.f2661b.l()) {
                if (next != null) {
                    Fragment k10 = next.k();
                    if (this.f2662c.T.equals(k10.W)) {
                        k10.V = this.f2662c;
                        k10.W = null;
                    }
                }
            }
            Fragment fragment2 = this.f2662c;
            String str = fragment2.W;
            if (str != null) {
                fragment2.V = this.f2661b.f(str);
            }
            this.f2661b.r(this);
            return;
        }
        String str2 = this.f2662c.W;
        if (!(str2 == null || (f10 = this.f2661b.f(str2)) == null || !f10.f2455p0)) {
            this.f2662c.V = f10;
        }
        this.f2662c.O = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("movefrom CREATE_VIEW: ");
            sb2.append(this.f2662c);
        }
        Fragment fragment = this.f2662c;
        ViewGroup viewGroup = fragment.f2460u0;
        if (!(viewGroup == null || (view = fragment.f2461v0) == null)) {
            viewGroup.removeView(view);
        }
        this.f2662c.e0();
        this.f2660a.n(this.f2662c, false);
        Fragment fragment2 = this.f2662c;
        fragment2.f2460u0 = null;
        fragment2.f2461v0 = null;
        fragment2.H0 = null;
        fragment2.I0.r(null);
        this.f2662c.f2442c0 = false;
    }

    public void i() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("movefrom ATTACHED: ");
            sb2.append(this.f2662c);
        }
        this.f2662c.f0();
        boolean z10 = false;
        this.f2660a.e(this.f2662c, false);
        Fragment fragment = this.f2662c;
        fragment.O = -1;
        fragment.f2447h0 = null;
        fragment.f2449j0 = null;
        fragment.f2446g0 = null;
        if (fragment.f2440a0 && !fragment.S()) {
            z10 = true;
        }
        if (z10 || this.f2661b.p().s(this.f2662c)) {
            if (FragmentManager.T0(3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("initState called for fragment: ");
                sb3.append(this.f2662c);
            }
            this.f2662c.Q();
        }
    }

    public void j() {
        Fragment fragment = this.f2662c;
        if (fragment.f2441b0 && fragment.f2442c0 && !fragment.f2444e0) {
            if (FragmentManager.T0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto CREATE_VIEW: ");
                sb2.append(this.f2662c);
            }
            Fragment fragment2 = this.f2662c;
            fragment2.c0(fragment2.g0(fragment2.P), (ViewGroup) null, this.f2662c.P);
            View view = this.f2662c.f2461v0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2662c;
                fragment3.f2461v0.setTag(a.g.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2662c;
                if (fragment4.f2453n0) {
                    fragment4.f2461v0.setVisibility(8);
                }
                this.f2662c.t0();
                i iVar = this.f2660a;
                Fragment fragment5 = this.f2662c;
                iVar.m(fragment5, fragment5.f2461v0, fragment5.P, false);
                this.f2662c.O = 2;
            }
        }
    }

    @m0
    public Fragment k() {
        return this.f2662c;
    }

    public final boolean l(@m0 View view) {
        if (view == this.f2662c.f2461v0) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2662c.f2461v0) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f2663d) {
            boolean z10 = false;
            z10 = true;
            try {
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f2662c;
                    int i10 = fragment.O;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f2662c.O = z10 ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.f2442c0 = z10;
                                    fragment.O = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.T0(3)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("movefrom ACTIVITY_CREATED: ");
                                        sb2.append(this.f2662c);
                                    }
                                    Fragment fragment2 = this.f2662c;
                                    if (fragment2.f2461v0 != null && fragment2.Q == null) {
                                        t();
                                    }
                                    Fragment fragment3 = this.f2662c;
                                    if (!(fragment3.f2461v0 == null || (viewGroup2 = fragment3.f2460u0) == null)) {
                                        a0.n(viewGroup2, fragment3.getParentFragmentManager()).d(this);
                                    }
                                    this.f2662c.O = 3;
                                    break;
                                case 4:
                                    w();
                                    break;
                                case 5:
                                    fragment.O = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.f2461v0 == null || (viewGroup3 = fragment.f2460u0) == null)) {
                                        a0.n(viewGroup3, fragment.getParentFragmentManager()).b(a0.e.c.b(this.f2662c.f2461v0.getVisibility()), this);
                                    }
                                    this.f2662c.O = 4;
                                    break;
                                case 5:
                                    v();
                                    break;
                                case 6:
                                    fragment.O = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (FragmentManager.Q && fragment.B0) {
                            if (!(fragment.f2461v0 == null || (viewGroup = fragment.f2460u0) == null)) {
                                a0 n10 = a0.n(viewGroup, fragment.getParentFragmentManager());
                                if (this.f2662c.f2453n0) {
                                    n10.c(this);
                                } else {
                                    n10.e(this);
                                }
                            }
                            Fragment fragment4 = this.f2662c;
                            FragmentManager fragmentManager = fragment4.f2446g0;
                            if (fragmentManager != null) {
                                fragmentManager.R0(fragment4);
                            }
                            Fragment fragment5 = this.f2662c;
                            fragment5.B0 = z10;
                            fragment5.onHiddenChanged(fragment5.f2453n0);
                        }
                        this.f2663d = z10;
                        return;
                    }
                }
            } finally {
                this.f2663d = z10;
            }
        } else if (FragmentManager.T0(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Ignoring re-entrant call to moveToExpectedState() for ");
            sb3.append(k());
        }
    }

    public void n() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("movefrom RESUMED: ");
            sb2.append(this.f2662c);
        }
        this.f2662c.l0();
        this.f2660a.f(this.f2662c, false);
    }

    public void o(@m0 ClassLoader classLoader) {
        Bundle bundle = this.f2662c.P;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2662c;
            fragment.Q = fragment.P.getSparseParcelableArray(f2657i);
            Fragment fragment2 = this.f2662c;
            fragment2.R = fragment2.P.getBundle(f2658j);
            Fragment fragment3 = this.f2662c;
            fragment3.W = fragment3.P.getString(f2656h);
            Fragment fragment4 = this.f2662c;
            if (fragment4.W != null) {
                fragment4.X = fragment4.P.getInt(f2655g, 0);
            }
            Fragment fragment5 = this.f2662c;
            Boolean bool = fragment5.S;
            if (bool != null) {
                fragment5.f2463x0 = bool.booleanValue();
                this.f2662c.S = null;
            } else {
                fragment5.f2463x0 = fragment5.P.getBoolean(f2659k, true);
            }
            Fragment fragment6 = this.f2662c;
            if (!fragment6.f2463x0) {
                fragment6.f2462w0 = true;
            }
        }
    }

    public void p() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto RESUMED: ");
            sb2.append(this.f2662c);
        }
        View G = this.f2662c.G();
        if (G != null && l(G)) {
            boolean requestFocus = G.requestFocus();
            if (FragmentManager.T0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("requestFocus: Restoring focused view ");
                sb3.append(G);
                sb3.append(" ");
                sb3.append(requestFocus ? "succeeded" : "failed");
                sb3.append(" on Fragment ");
                sb3.append(this.f2662c);
                sb3.append(" resulting in focused view ");
                sb3.append(this.f2662c.f2461v0.findFocus());
            }
        }
        this.f2662c.C0((View) null);
        this.f2662c.p0();
        this.f2660a.i(this.f2662c, false);
        Fragment fragment = this.f2662c;
        fragment.P = null;
        fragment.Q = null;
        fragment.R = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f2662c.q0(bundle);
        this.f2660a.j(this.f2662c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2662c.f2461v0 != null) {
            t();
        }
        if (this.f2662c.Q != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f2657i, this.f2662c.Q);
        }
        if (this.f2662c.R != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f2658j, this.f2662c.R);
        }
        if (!this.f2662c.f2463x0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f2659k, this.f2662c.f2463x0);
        }
        return bundle;
    }

    @o0
    public Fragment.SavedState r() {
        Bundle q10;
        if (this.f2662c.O <= -1 || (q10 = q()) == null) {
            return null;
        }
        return new Fragment.SavedState(q10);
    }

    @m0
    public FragmentState s() {
        FragmentState fragmentState = new FragmentState(this.f2662c);
        Fragment fragment = this.f2662c;
        if (fragment.O <= -1 || fragmentState.f2556a0 != null) {
            fragmentState.f2556a0 = fragment.P;
        } else {
            Bundle q10 = q();
            fragmentState.f2556a0 = q10;
            if (this.f2662c.W != null) {
                if (q10 == null) {
                    fragmentState.f2556a0 = new Bundle();
                }
                fragmentState.f2556a0.putString(f2656h, this.f2662c.W);
                int i10 = this.f2662c.X;
                if (i10 != 0) {
                    fragmentState.f2556a0.putInt(f2655g, i10);
                }
            }
        }
        return fragmentState;
    }

    public void t() {
        if (this.f2662c.f2461v0 != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2662c.f2461v0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2662c.Q = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2662c.H0.e(bundle);
            if (!bundle.isEmpty()) {
                this.f2662c.R = bundle;
            }
        }
    }

    public void u(int i10) {
        this.f2664e = i10;
    }

    public void v() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto STARTED: ");
            sb2.append(this.f2662c);
        }
        this.f2662c.r0();
        this.f2660a.k(this.f2662c, false);
    }

    public void w() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("movefrom STARTED: ");
            sb2.append(this.f2662c);
        }
        this.f2662c.s0();
        this.f2660a.l(this.f2662c, false);
    }
}

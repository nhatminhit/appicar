package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import d.i;
import d.m0;
import d.o0;
import e1.n;
import f1.w1;

public abstract class FragmentStateAdapter extends RecyclerView.g<a> implements b {

    /* renamed from: k  reason: collision with root package name */
    public static final String f3942k = "f#";

    /* renamed from: l  reason: collision with root package name */
    public static final String f3943l = "s#";

    /* renamed from: m  reason: collision with root package name */
    public static final long f3944m = 10000;

    /* renamed from: c  reason: collision with root package name */
    public final p f3945c;

    /* renamed from: d  reason: collision with root package name */
    public final FragmentManager f3946d;

    /* renamed from: e  reason: collision with root package name */
    public final f<Fragment> f3947e;

    /* renamed from: f  reason: collision with root package name */
    public final f<Fragment.SavedState> f3948f;

    /* renamed from: g  reason: collision with root package name */
    public final f<Integer> f3949g;

    /* renamed from: h  reason: collision with root package name */
    public FragmentMaxLifecycleEnforcer f3950h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3951i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3952j;

    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a  reason: collision with root package name */
        public ViewPager2.j f3953a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i f3954b;

        /* renamed from: c  reason: collision with root package name */
        public u f3955c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f3956d;

        /* renamed from: e  reason: collision with root package name */
        public long f3957e = -1;

        public class a extends ViewPager2.j {
            public a() {
            }

            public void a(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            public void c(int i10) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        public class b extends d {
            public b() {
                super((a) null);
            }

            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @m0
        public final ViewPager2 a(@m0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(@m0 RecyclerView recyclerView) {
            this.f3956d = a(recyclerView);
            a aVar = new a();
            this.f3953a = aVar;
            this.f3956d.n(aVar);
            b bVar = new b();
            this.f3954b = bVar;
            FragmentStateAdapter.this.C(bVar);
            AnonymousClass3 r22 = new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f3955c = r22;
            FragmentStateAdapter.this.f3945c.a(r22);
        }

        public void c(@m0 RecyclerView recyclerView) {
            a(recyclerView).x(this.f3953a);
            FragmentStateAdapter.this.E(this.f3954b);
            FragmentStateAdapter.this.f3945c.d(this.f3955c);
            this.f3956d = null;
        }

        public void d(boolean z10) {
            int currentItem;
            Fragment n10;
            if (!FragmentStateAdapter.this.Y() && this.f3956d.getScrollState() == 0 && !FragmentStateAdapter.this.f3947e.s() && FragmentStateAdapter.this.e() != 0 && (currentItem = this.f3956d.getCurrentItem()) < FragmentStateAdapter.this.e()) {
                long f10 = FragmentStateAdapter.this.f(currentItem);
                if ((f10 != this.f3957e || z10) && (n10 = FragmentStateAdapter.this.f3947e.n(f10)) != null && n10.isAdded()) {
                    this.f3957e = f10;
                    androidx.fragment.app.u r10 = FragmentStateAdapter.this.f3946d.r();
                    Fragment fragment = null;
                    for (int i10 = 0; i10 < FragmentStateAdapter.this.f3947e.D(); i10++) {
                        long t10 = FragmentStateAdapter.this.f3947e.t(i10);
                        Fragment E = FragmentStateAdapter.this.f3947e.E(i10);
                        if (E.isAdded()) {
                            if (t10 != this.f3957e) {
                                r10.K(E, p.b.STARTED);
                            } else {
                                fragment = E;
                            }
                            E.setMenuVisibility(t10 == this.f3957e);
                        }
                    }
                    if (fragment != null) {
                        r10.K(fragment, p.b.RESUMED);
                    }
                    if (!r10.w()) {
                        r10.o();
                    }
                }
            }
        }
    }

    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ FrameLayout O;
        public final /* synthetic */ a P;

        public a(FrameLayout frameLayout, a aVar) {
            this.O = frameLayout;
            this.P = aVar;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (this.O.getParent() != null) {
                this.O.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.U(this.P);
            }
        }
    }

    public class b extends FragmentManager.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f3961a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f3962b;

        public b(Fragment fragment, FrameLayout frameLayout) {
            this.f3961a = fragment;
            this.f3962b = frameLayout;
        }

        public void m(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @m0 View view, @o0 Bundle bundle) {
            if (fragment == this.f3961a) {
                fragmentManager.T1(this);
                FragmentStateAdapter.this.F(view, this.f3962b);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f3951i = false;
            fragmentStateAdapter.K();
        }
    }

    public static abstract class d extends RecyclerView.i {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        public abstract void a();

        public final void b(int i10, int i11) {
            a();
        }

        public final void c(int i10, int i11, @o0 Object obj) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }

        public final void e(int i10, int i11, int i12) {
            a();
        }

        public final void f(int i10, int i11) {
            a();
        }
    }

    public FragmentStateAdapter(@m0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@m0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.X(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(@m0 FragmentManager fragmentManager, @m0 p pVar) {
        this.f3947e = new f<>();
        this.f3948f = new f<>();
        this.f3949g = new f<>();
        this.f3951i = false;
        this.f3952j = false;
        this.f3946d = fragmentManager;
        this.f3945c = pVar;
        super.D(true);
    }

    @m0
    public static String I(@m0 String str, long j10) {
        return str + j10;
    }

    public static boolean M(@m0 String str, @m0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    public static long T(@m0 String str, @m0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    public final void D(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void F(@m0 View view, @m0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public boolean G(long j10) {
        return j10 >= 0 && j10 < ((long) e());
    }

    @m0
    public abstract Fragment H(int i10);

    public final void J(int i10) {
        long f10 = f(i10);
        if (!this.f3947e.i(f10)) {
            Fragment H = H(i10);
            H.setInitialSavedState(this.f3948f.n(f10));
            this.f3947e.u(f10, H);
        }
    }

    public void K() {
        if (this.f3952j && !Y()) {
            androidx.collection.b<Long> bVar = new androidx.collection.b<>();
            for (int i10 = 0; i10 < this.f3947e.D(); i10++) {
                long t10 = this.f3947e.t(i10);
                if (!G(t10)) {
                    bVar.add(Long.valueOf(t10));
                    this.f3949g.x(t10);
                }
            }
            if (!this.f3951i) {
                this.f3952j = false;
                for (int i11 = 0; i11 < this.f3947e.D(); i11++) {
                    long t11 = this.f3947e.t(i11);
                    if (!L(t11)) {
                        bVar.add(Long.valueOf(t11));
                    }
                }
            }
            for (Long longValue : bVar) {
                V(longValue.longValue());
            }
        }
    }

    public final boolean L(long j10) {
        View view;
        if (this.f3949g.i(j10)) {
            return true;
        }
        Fragment n10 = this.f3947e.n(j10);
        if (n10 == null || (view = n10.getView()) == null) {
            return false;
        }
        return view.getParent() != null;
    }

    public final Long N(int i10) {
        Long l10 = null;
        for (int i11 = 0; i11 < this.f3949g.D(); i11++) {
            if (this.f3949g.E(i11).intValue() == i10) {
                if (l10 == null) {
                    l10 = Long.valueOf(this.f3949g.t(i11));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l10;
    }

    /* renamed from: O */
    public final void u(@m0 a aVar, int i10) {
        long k10 = aVar.k();
        int id2 = aVar.P().getId();
        Long N = N(id2);
        if (!(N == null || N.longValue() == k10)) {
            V(N.longValue());
            this.f3949g.x(N.longValue());
        }
        this.f3949g.u(k10, Integer.valueOf(id2));
        J(i10);
        FrameLayout P = aVar.P();
        if (w1.N0(P)) {
            if (P.getParent() == null) {
                P.addOnLayoutChangeListener(new a(P, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        K();
    }

    @m0
    /* renamed from: P */
    public final a w(@m0 ViewGroup viewGroup, int i10) {
        return a.O(viewGroup);
    }

    /* renamed from: Q */
    public final boolean y(@m0 a aVar) {
        return true;
    }

    /* renamed from: R */
    public final void z(@m0 a aVar) {
        U(aVar);
        K();
    }

    /* renamed from: S */
    public final void B(@m0 a aVar) {
        Long N = N(aVar.P().getId());
        if (N != null) {
            V(N.longValue());
            this.f3949g.x(N.longValue());
        }
    }

    public void U(@m0 final a aVar) {
        Fragment n10 = this.f3947e.n(aVar.k());
        if (n10 != null) {
            FrameLayout P = aVar.P();
            View view = n10.getView();
            if (!n10.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (n10.isAdded() && view == null) {
                X(n10, P);
            } else if (!n10.isAdded() || view.getParent() == null) {
                if (n10.isAdded()) {
                    F(view, P);
                } else if (!Y()) {
                    X(n10, P);
                    androidx.fragment.app.u r10 = this.f3946d.r();
                    r10.g(n10, u3.f.A + aVar.k()).K(n10, p.b.STARTED).o();
                    this.f3950h.d(false);
                } else if (!this.f3946d.S0()) {
                    this.f3945c.a(new u() {
                        public void d(@m0 y yVar, @m0 p.a aVar) {
                            if (!FragmentStateAdapter.this.Y()) {
                                yVar.getLifecycle().d(this);
                                if (w1.N0(aVar.P())) {
                                    FragmentStateAdapter.this.U(aVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != P) {
                F(view, P);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void V(long j10) {
        ViewParent parent;
        Fragment n10 = this.f3947e.n(j10);
        if (n10 != null) {
            if (!(n10.getView() == null || (parent = n10.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!G(j10)) {
                this.f3948f.x(j10);
            }
            if (!n10.isAdded()) {
                this.f3947e.x(j10);
            } else if (Y()) {
                this.f3952j = true;
            } else {
                if (n10.isAdded() && G(j10)) {
                    this.f3948f.u(j10, this.f3946d.I1(n10));
                }
                this.f3946d.r().x(n10).o();
                this.f3947e.x(j10);
            }
        }
    }

    public final void W() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f3945c.a(new u() {
            public void d(@m0 y yVar, @m0 p.a aVar) {
                if (aVar == p.a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    yVar.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    public final void X(Fragment fragment, @m0 FrameLayout frameLayout) {
        this.f3946d.v1(new b(fragment, frameLayout), false);
    }

    public boolean Y() {
        return this.f3946d.Y0();
    }

    @m0
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f3947e.D() + this.f3948f.D());
        for (int i10 = 0; i10 < this.f3947e.D(); i10++) {
            long t10 = this.f3947e.t(i10);
            Fragment n10 = this.f3947e.n(t10);
            if (n10 != null && n10.isAdded()) {
                this.f3946d.u1(bundle, I(f3942k, t10), n10);
            }
        }
        for (int i11 = 0; i11 < this.f3948f.D(); i11++) {
            long t11 = this.f3948f.t(i11);
            if (G(t11)) {
                bundle.putParcelable(I(f3943l, t11), this.f3948f.n(t11));
            }
        }
        return bundle;
    }

    public final void b(@m0 Parcelable parcelable) {
        long T;
        Object obj;
        f fVar;
        if (!this.f3948f.s() || !this.f3947e.s()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String next : bundle.keySet()) {
            if (M(next, f3942k)) {
                T = T(next, f3942k);
                obj = this.f3946d.C0(bundle, next);
                fVar = this.f3947e;
            } else if (M(next, f3943l)) {
                T = T(next, f3943l);
                obj = (Fragment.SavedState) bundle.getParcelable(next);
                if (G(T)) {
                    fVar = this.f3948f;
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + next);
            }
            fVar.u(T, obj);
        }
        if (!this.f3947e.s()) {
            this.f3952j = true;
            this.f3951i = true;
            K();
            W();
        }
    }

    public long f(int i10) {
        return (long) i10;
    }

    @i
    public void t(@m0 RecyclerView recyclerView) {
        n.a(this.f3950h == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f3950h = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @i
    public void x(@m0 RecyclerView recyclerView) {
        this.f3950h.c(recyclerView);
        this.f3950h = null;
    }
}

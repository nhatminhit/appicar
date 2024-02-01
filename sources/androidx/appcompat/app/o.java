package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.z;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.u;
import d.m0;
import d.x0;
import f.a;
import f1.s2;
import f1.t2;
import f1.u2;
import f1.v2;
import f1.w1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k.b;
import k.g;
import k.h;

@x0({x0.a.Q})
public class o extends a implements ActionBarOverlayLayout.d {
    public static final String N = "WindowDecorActionBar";
    public static final Interpolator O = new AccelerateInterpolator();
    public static final Interpolator P = new DecelerateInterpolator();
    public static final int Q = -1;
    public static final long R = 100;
    public static final long S = 200;
    public boolean A;
    public int B = 0;
    public boolean C = true;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G = true;
    public h H;
    public boolean I;
    public boolean J;
    public final t2 K = new a();
    public final t2 L = new b();
    public final v2 M = new c();

    /* renamed from: i  reason: collision with root package name */
    public Context f880i;

    /* renamed from: j  reason: collision with root package name */
    public Context f881j;

    /* renamed from: k  reason: collision with root package name */
    public Activity f882k;

    /* renamed from: l  reason: collision with root package name */
    public ActionBarOverlayLayout f883l;

    /* renamed from: m  reason: collision with root package name */
    public ActionBarContainer f884m;

    /* renamed from: n  reason: collision with root package name */
    public z f885n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContextView f886o;

    /* renamed from: p  reason: collision with root package name */
    public View f887p;

    /* renamed from: q  reason: collision with root package name */
    public ScrollingTabContainerView f888q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<e> f889r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public e f890s;

    /* renamed from: t  reason: collision with root package name */
    public int f891t = -1;

    /* renamed from: u  reason: collision with root package name */
    public boolean f892u;

    /* renamed from: v  reason: collision with root package name */
    public d f893v;

    /* renamed from: w  reason: collision with root package name */
    public k.b f894w;

    /* renamed from: x  reason: collision with root package name */
    public b.a f895x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f896y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<a.d> f897z = new ArrayList<>();

    public class a extends u2 {
        public a() {
        }

        public void b(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.C && (view2 = oVar.f887p) != null) {
                view2.setTranslationY(0.0f);
                o.this.f884m.setTranslationY(0.0f);
            }
            o.this.f884m.setVisibility(8);
            o.this.f884m.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.H = null;
            oVar2.H0();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f883l;
            if (actionBarOverlayLayout != null) {
                w1.t1(actionBarOverlayLayout);
            }
        }
    }

    public class b extends u2 {
        public b() {
        }

        public void b(View view) {
            o oVar = o.this;
            oVar.H = null;
            oVar.f884m.requestLayout();
        }
    }

    public class c implements v2 {
        public c() {
        }

        public void a(View view) {
            ((View) o.this.f884m.getParent()).invalidate();
        }
    }

    @x0({x0.a.Q})
    public class d extends k.b implements e.a {
        public final Context Q;
        public final androidx.appcompat.view.menu.e R;
        public b.a S;
        public WeakReference<View> T;

        public d(Context context, b.a aVar) {
            this.Q = context;
            this.S = aVar;
            androidx.appcompat.view.menu.e Z = new androidx.appcompat.view.menu.e(context).Z(1);
            this.R = Z;
            Z.X(this);
        }

        public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
            b.a aVar = this.S;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar) {
            if (this.S != null) {
                k();
                o.this.f886o.o();
            }
        }

        public void c() {
            o oVar = o.this;
            if (oVar.f893v == this) {
                if (!o.F0(oVar.D, oVar.E, false)) {
                    o oVar2 = o.this;
                    oVar2.f894w = this;
                    oVar2.f895x = this.S;
                } else {
                    this.S.d(this);
                }
                this.S = null;
                o.this.E0(false);
                o.this.f886o.p();
                o.this.f885n.I().sendAccessibilityEvent(32);
                o oVar3 = o.this;
                oVar3.f883l.setHideOnContentScrollEnabled(oVar3.J);
                o.this.f893v = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.T;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.R;
        }

        public MenuInflater f() {
            return new g(this.Q);
        }

        public CharSequence g() {
            return o.this.f886o.getSubtitle();
        }

        public CharSequence i() {
            return o.this.f886o.getTitle();
        }

        public void k() {
            if (o.this.f893v == this) {
                this.R.m0();
                try {
                    this.S.c(this, this.R);
                } finally {
                    this.R.l0();
                }
            }
        }

        public boolean l() {
            return o.this.f886o.s();
        }

        public void n(View view) {
            o.this.f886o.setCustomView(view);
            this.T = new WeakReference<>(view);
        }

        public void o(int i10) {
            p(o.this.f880i.getResources().getString(i10));
        }

        public void p(CharSequence charSequence) {
            o.this.f886o.setSubtitle(charSequence);
        }

        public void r(int i10) {
            s(o.this.f880i.getResources().getString(i10));
        }

        public void s(CharSequence charSequence) {
            o.this.f886o.setTitle(charSequence);
        }

        public void t(boolean z10) {
            super.t(z10);
            o.this.f886o.setTitleOptional(z10);
        }

        public boolean u() {
            this.R.m0();
            try {
                return this.S.b(this, this.R);
            } finally {
                this.R.l0();
            }
        }

        public void v(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public void w(m mVar) {
        }

        public boolean x(m mVar) {
            if (this.S == null) {
                return false;
            }
            if (!mVar.hasVisibleItems()) {
                return true;
            }
            new i(o.this.A(), mVar).l();
            return true;
        }
    }

    @x0({x0.a.Q})
    public class e extends a.f {

        /* renamed from: b  reason: collision with root package name */
        public a.g f901b;

        /* renamed from: c  reason: collision with root package name */
        public Object f902c;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f903d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f904e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f905f;

        /* renamed from: g  reason: collision with root package name */
        public int f906g = -1;

        /* renamed from: h  reason: collision with root package name */
        public View f907h;

        public e() {
        }

        public CharSequence a() {
            return this.f905f;
        }

        public View b() {
            return this.f907h;
        }

        public Drawable c() {
            return this.f903d;
        }

        public int d() {
            return this.f906g;
        }

        public Object e() {
            return this.f902c;
        }

        public CharSequence f() {
            return this.f904e;
        }

        public void g() {
            o.this.S(this);
        }

        public a.f h(int i10) {
            return i(o.this.f880i.getResources().getText(i10));
        }

        public a.f i(CharSequence charSequence) {
            this.f905f = charSequence;
            int i10 = this.f906g;
            if (i10 >= 0) {
                o.this.f888q.m(i10);
            }
            return this;
        }

        public a.f j(int i10) {
            return k(LayoutInflater.from(o.this.A()).inflate(i10, (ViewGroup) null));
        }

        public a.f k(View view) {
            this.f907h = view;
            int i10 = this.f906g;
            if (i10 >= 0) {
                o.this.f888q.m(i10);
            }
            return this;
        }

        public a.f l(int i10) {
            return m(g.a.d(o.this.f880i, i10));
        }

        public a.f m(Drawable drawable) {
            this.f903d = drawable;
            int i10 = this.f906g;
            if (i10 >= 0) {
                o.this.f888q.m(i10);
            }
            return this;
        }

        public a.f n(a.g gVar) {
            this.f901b = gVar;
            return this;
        }

        public a.f o(Object obj) {
            this.f902c = obj;
            return this;
        }

        public a.f p(int i10) {
            return q(o.this.f880i.getResources().getText(i10));
        }

        public a.f q(CharSequence charSequence) {
            this.f904e = charSequence;
            int i10 = this.f906g;
            if (i10 >= 0) {
                o.this.f888q.m(i10);
            }
            return this;
        }

        public a.g r() {
            return this.f901b;
        }

        public void s(int i10) {
            this.f906g = i10;
        }
    }

    public o(Activity activity, boolean z10) {
        this.f882k = activity;
        View decorView = activity.getWindow().getDecorView();
        Q0(decorView);
        if (!z10) {
            this.f887p = decorView.findViewById(16908290);
        }
    }

    public o(Dialog dialog) {
        Q0(dialog.getWindow().getDecorView());
    }

    @x0({x0.a.Q})
    public o(View view) {
        Q0(view);
    }

    public static boolean F0(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    public Context A() {
        if (this.f881j == null) {
            TypedValue typedValue = new TypedValue();
            this.f880i.getTheme().resolveAttribute(a.c.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f881j = new ContextThemeWrapper(this.f880i, i10);
            } else {
                this.f881j = this.f880i;
            }
        }
        return this.f881j;
    }

    public void A0(CharSequence charSequence) {
        this.f885n.setTitle(charSequence);
    }

    public CharSequence B() {
        return this.f885n.getTitle();
    }

    public void B0(CharSequence charSequence) {
        this.f885n.setWindowTitle(charSequence);
    }

    public void C() {
        if (!this.D) {
            this.D = true;
            U0(false);
        }
    }

    public void C0() {
        if (this.D) {
            this.D = false;
            U0(false);
        }
    }

    public k.b D0(b.a aVar) {
        d dVar = this.f893v;
        if (dVar != null) {
            dVar.c();
        }
        this.f883l.setHideOnContentScrollEnabled(false);
        this.f886o.t();
        d dVar2 = new d(this.f886o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.f893v = dVar2;
        dVar2.k();
        this.f886o.q(dVar2);
        E0(true);
        this.f886o.sendAccessibilityEvent(32);
        return dVar2;
    }

    public boolean E() {
        return this.f883l.A();
    }

    public void E0(boolean z10) {
        s2 s2Var;
        s2 s2Var2;
        if (z10) {
            T0();
        } else {
            P0();
        }
        if (S0()) {
            if (z10) {
                s2Var = this.f885n.E(4, 100);
                s2Var2 = this.f886o.n(0, 200);
            } else {
                s2Var2 = this.f885n.E(0, 200);
                s2Var = this.f886o.n(8, 100);
            }
            h hVar = new h();
            hVar.d(s2Var, s2Var2);
            hVar.h();
        } else if (z10) {
            this.f885n.setVisibility(4);
            this.f886o.setVisibility(0);
        } else {
            this.f885n.setVisibility(0);
            this.f886o.setVisibility(8);
        }
    }

    public boolean F() {
        int r10 = r();
        return this.G && (r10 == 0 || s() < r10);
    }

    public boolean G() {
        z zVar = this.f885n;
        return zVar != null && zVar.t();
    }

    public final void G0() {
        if (this.f890s != null) {
            S((a.f) null);
        }
        this.f889r.clear();
        ScrollingTabContainerView scrollingTabContainerView = this.f888q;
        if (scrollingTabContainerView != null) {
            scrollingTabContainerView.k();
        }
        this.f891t = -1;
    }

    public a.f H() {
        return new e();
    }

    public void H0() {
        b.a aVar = this.f895x;
        if (aVar != null) {
            aVar.d(this.f894w);
            this.f894w = null;
            this.f895x = null;
        }
    }

    public void I(Configuration configuration) {
        R0(k.a.b(this.f880i).g());
    }

    public final void I0(a.f fVar, int i10) {
        e eVar = (e) fVar;
        if (eVar.r() != null) {
            eVar.s(i10);
            this.f889r.add(i10, eVar);
            int size = this.f889r.size();
            while (true) {
                i10++;
                if (i10 < size) {
                    this.f889r.get(i10).s(i10);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    public void J0(boolean z10) {
        View view;
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.B != 0 || (!this.I && !z10)) {
            this.K.b((View) null);
            return;
        }
        this.f884m.setAlpha(1.0f);
        this.f884m.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f884m.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f884m.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        s2 z11 = w1.f(this.f884m).z(f10);
        z11.v(this.M);
        hVar2.c(z11);
        if (this.C && (view = this.f887p) != null) {
            hVar2.c(w1.f(view).z(f10));
        }
        hVar2.f(O);
        hVar2.e(250);
        hVar2.g(this.K);
        this.H = hVar2;
        hVar2.h();
    }

    public boolean K(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f893v;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void K0(boolean z10) {
        View view;
        View view2;
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        this.f884m.setVisibility(0);
        if (this.B != 0 || (!this.I && !z10)) {
            this.f884m.setAlpha(1.0f);
            this.f884m.setTranslationY(0.0f);
            if (this.C && (view = this.f887p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b((View) null);
        } else {
            this.f884m.setTranslationY(0.0f);
            float f10 = (float) (-this.f884m.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f884m.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f884m.setTranslationY(f10);
            h hVar2 = new h();
            s2 z11 = w1.f(this.f884m).z(0.0f);
            z11.v(this.M);
            hVar2.c(z11);
            if (this.C && (view2 = this.f887p) != null) {
                view2.setTranslationY(f10);
                hVar2.c(w1.f(this.f887p).z(0.0f));
            }
            hVar2.f(P);
            hVar2.e(250);
            hVar2.g(this.L);
            this.H = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f883l;
        if (actionBarOverlayLayout != null) {
            w1.t1(actionBarOverlayLayout);
        }
    }

    public final void L0() {
        if (this.f888q == null) {
            ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this.f880i);
            if (this.A) {
                scrollingTabContainerView.setVisibility(0);
                this.f885n.q(scrollingTabContainerView);
            } else {
                if (u() == 2) {
                    scrollingTabContainerView.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f883l;
                    if (actionBarOverlayLayout != null) {
                        w1.t1(actionBarOverlayLayout);
                    }
                } else {
                    scrollingTabContainerView.setVisibility(8);
                }
                this.f884m.setTabContainer(scrollingTabContainerView);
            }
            this.f888q = scrollingTabContainerView;
        }
    }

    public final z M0(View view) {
        if (view instanceof z) {
            return (z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public void N() {
        G0();
    }

    public boolean N0() {
        return this.f885n.h();
    }

    public void O(a.d dVar) {
        this.f897z.remove(dVar);
    }

    public boolean O0() {
        return this.f885n.j();
    }

    public void P(a.f fVar) {
        Q(fVar.d());
    }

    public final void P0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f883l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            U0(false);
        }
    }

    public void Q(int i10) {
        if (this.f888q != null) {
            e eVar = this.f890s;
            int d10 = eVar != null ? eVar.d() : this.f891t;
            this.f888q.l(i10);
            e remove = this.f889r.remove(i10);
            if (remove != null) {
                remove.s(-1);
            }
            int size = this.f889r.size();
            for (int i11 = i10; i11 < size; i11++) {
                this.f889r.get(i11).s(i11);
            }
            if (d10 == i10) {
                S(this.f889r.isEmpty() ? null : this.f889r.get(Math.max(0, i10 - 1)));
            }
        }
    }

    public final void Q0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.h.decor_content_parent);
        this.f883l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f885n = M0(view.findViewById(a.h.action_bar));
        this.f886o = (ActionBarContextView) view.findViewById(a.h.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.h.action_bar_container);
        this.f884m = actionBarContainer;
        z zVar = this.f885n;
        if (zVar == null || this.f886o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f880i = zVar.e();
        boolean z10 = (this.f885n.N() & 4) != 0;
        if (z10) {
            this.f892u = true;
        }
        k.a b10 = k.a.b(this.f880i);
        m0(b10.a() || z10);
        R0(b10.g());
        TypedArray obtainStyledAttributes = this.f880i.obtainStyledAttributes((AttributeSet) null, a.n.ActionBar, a.c.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(a.n.ActionBar_hideOnContentScroll, false)) {
            h0(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.n.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            f0((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public boolean R() {
        ViewGroup I2 = this.f885n.I();
        if (I2 == null || I2.hasFocus()) {
            return false;
        }
        I2.requestFocus();
        return true;
    }

    public final void R0(boolean z10) {
        this.A = z10;
        if (!z10) {
            this.f885n.q((ScrollingTabContainerView) null);
            this.f884m.setTabContainer(this.f888q);
        } else {
            this.f884m.setTabContainer((ScrollingTabContainerView) null);
            this.f885n.q(this.f888q);
        }
        boolean z11 = true;
        boolean z12 = u() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f888q;
        if (scrollingTabContainerView != null) {
            if (z12) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f883l;
                if (actionBarOverlayLayout != null) {
                    w1.t1(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f885n.V(!this.A && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f883l;
        if (this.A || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    public void S(a.f fVar) {
        int i10 = -1;
        if (u() != 2) {
            if (fVar != null) {
                i10 = fVar.d();
            }
            this.f891t = i10;
            return;
        }
        u s10 = (!(this.f882k instanceof FragmentActivity) || this.f885n.I().isInEditMode()) ? null : ((FragmentActivity) this.f882k).X().r().s();
        e eVar = this.f890s;
        if (eVar != fVar) {
            ScrollingTabContainerView scrollingTabContainerView = this.f888q;
            if (fVar != null) {
                i10 = fVar.d();
            }
            scrollingTabContainerView.setTabSelected(i10);
            e eVar2 = this.f890s;
            if (eVar2 != null) {
                eVar2.r().b(this.f890s, s10);
            }
            e eVar3 = (e) fVar;
            this.f890s = eVar3;
            if (eVar3 != null) {
                eVar3.r().a(this.f890s, s10);
            }
        } else if (eVar != null) {
            eVar.r().c(this.f890s, s10);
            this.f888q.c(fVar.d());
        }
        if (s10 != null && !s10.w()) {
            s10.m();
        }
    }

    public final boolean S0() {
        return w1.T0(this.f884m);
    }

    public void T(Drawable drawable) {
        this.f884m.setPrimaryBackground(drawable);
    }

    public final void T0() {
        if (!this.F) {
            this.F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f883l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            U0(false);
        }
    }

    public void U(int i10) {
        V(LayoutInflater.from(A()).inflate(i10, this.f885n.I(), false));
    }

    public final void U0(boolean z10) {
        if (F0(this.D, this.E, this.F)) {
            if (!this.G) {
                this.G = true;
                K0(z10);
            }
        } else if (this.G) {
            this.G = false;
            J0(z10);
        }
    }

    public void V(View view) {
        this.f885n.Q(view);
    }

    public void W(View view, a.b bVar) {
        view.setLayoutParams(bVar);
        this.f885n.Q(view);
    }

    public void X(boolean z10) {
        if (!this.f892u) {
            Y(z10);
        }
    }

    public void Y(boolean z10) {
        a0(z10 ? 4 : 0, 4);
    }

    public void Z(int i10) {
        if ((i10 & 4) != 0) {
            this.f892u = true;
        }
        this.f885n.u(i10);
    }

    public void a() {
        if (this.E) {
            this.E = false;
            U0(true);
        }
    }

    public void a0(int i10, int i11) {
        int N2 = this.f885n.N();
        if ((i11 & 4) != 0) {
            this.f892u = true;
        }
        this.f885n.u((i10 & i11) | ((~i11) & N2));
    }

    public void b() {
    }

    public void b0(boolean z10) {
        a0(z10 ? 16 : 0, 16);
    }

    public void c(boolean z10) {
        this.C = z10;
    }

    public void c0(boolean z10) {
        a0(z10 ? 2 : 0, 2);
    }

    public void d() {
        if (!this.E) {
            this.E = true;
            U0(true);
        }
    }

    public void d0(boolean z10) {
        a0(z10 ? 8 : 0, 8);
    }

    public void e() {
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
    }

    public void e0(boolean z10) {
        a0(z10 ? 1 : 0, 1);
    }

    public void f(int i10) {
        this.B = i10;
    }

    public void f0(float f10) {
        w1.L1(this.f884m, f10);
    }

    public void g(a.d dVar) {
        this.f897z.add(dVar);
    }

    public void g0(int i10) {
        if (i10 == 0 || this.f883l.B()) {
            this.f883l.setActionBarHideOffset(i10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    public void h(a.f fVar) {
        k(fVar, this.f889r.isEmpty());
    }

    public void h0(boolean z10) {
        if (!z10 || this.f883l.B()) {
            this.J = z10;
            this.f883l.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void i(a.f fVar, int i10) {
        j(fVar, i10, this.f889r.isEmpty());
    }

    public void i0(int i10) {
        this.f885n.P(i10);
    }

    public void j(a.f fVar, int i10, boolean z10) {
        L0();
        this.f888q.a(fVar, i10, z10);
        I0(fVar, i10);
        if (z10) {
            S(fVar);
        }
    }

    public void j0(CharSequence charSequence) {
        this.f885n.v(charSequence);
    }

    public void k(a.f fVar, boolean z10) {
        L0();
        this.f888q.b(fVar, z10);
        I0(fVar, this.f889r.size());
        if (z10) {
            S(fVar);
        }
    }

    public void k0(int i10) {
        this.f885n.G(i10);
    }

    public void l0(Drawable drawable) {
        this.f885n.U(drawable);
    }

    public boolean m() {
        z zVar = this.f885n;
        if (zVar == null || !zVar.s()) {
            return false;
        }
        this.f885n.collapseActionView();
        return true;
    }

    public void m0(boolean z10) {
        this.f885n.J(z10);
    }

    public void n(boolean z10) {
        if (z10 != this.f896y) {
            this.f896y = z10;
            int size = this.f897z.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f897z.get(i10).onMenuVisibilityChanged(z10);
            }
        }
    }

    public void n0(int i10) {
        this.f885n.setIcon(i10);
    }

    public View o() {
        return this.f885n.p();
    }

    public void o0(Drawable drawable) {
        this.f885n.setIcon(drawable);
    }

    public int p() {
        return this.f885n.N();
    }

    public void p0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.f885n.K(spinnerAdapter, new j(eVar));
    }

    public float q() {
        return w1.P(this.f884m);
    }

    public void q0(int i10) {
        this.f885n.setLogo(i10);
    }

    public int r() {
        return this.f884m.getHeight();
    }

    public void r0(Drawable drawable) {
        this.f885n.r(drawable);
    }

    public int s() {
        return this.f883l.getActionBarHideOffset();
    }

    public void s0(int i10) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int C2 = this.f885n.C();
        if (C2 == 2) {
            this.f891t = v();
            S((a.f) null);
            this.f888q.setVisibility(8);
        }
        if (!(C2 == i10 || this.A || (actionBarOverlayLayout = this.f883l) == null)) {
            w1.t1(actionBarOverlayLayout);
        }
        this.f885n.F(i10);
        boolean z10 = false;
        if (i10 == 2) {
            L0();
            this.f888q.setVisibility(0);
            int i11 = this.f891t;
            if (i11 != -1) {
                t0(i11);
                this.f891t = -1;
            }
        }
        this.f885n.V(i10 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f883l;
        if (i10 == 2 && !this.A) {
            z10 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    public int t() {
        int C2 = this.f885n.C();
        if (C2 == 1) {
            return this.f885n.S();
        }
        if (C2 != 2) {
            return 0;
        }
        return this.f889r.size();
    }

    public void t0(int i10) {
        int C2 = this.f885n.C();
        if (C2 == 1) {
            this.f885n.z(i10);
        } else if (C2 == 2) {
            S(this.f889r.get(i10));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    public int u() {
        return this.f885n.C();
    }

    public void u0(boolean z10) {
        h hVar;
        this.I = z10;
        if (!z10 && (hVar = this.H) != null) {
            hVar.a();
        }
    }

    public int v() {
        e eVar;
        int C2 = this.f885n.C();
        if (C2 == 1) {
            return this.f885n.O();
        }
        if (C2 == 2 && (eVar = this.f890s) != null) {
            return eVar.d();
        }
        return -1;
    }

    public void v0(Drawable drawable) {
    }

    public a.f w() {
        return this.f890s;
    }

    public void w0(Drawable drawable) {
        this.f884m.setStackedBackground(drawable);
    }

    public CharSequence x() {
        return this.f885n.M();
    }

    public void x0(int i10) {
        y0(this.f880i.getString(i10));
    }

    public a.f y(int i10) {
        return this.f889r.get(i10);
    }

    public void y0(CharSequence charSequence) {
        this.f885n.w(charSequence);
    }

    public int z() {
        return this.f889r.size();
    }

    public void z0(int i10) {
        A0(this.f880i.getString(i10));
    }
}

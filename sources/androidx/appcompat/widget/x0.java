package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.badge.BadgeDrawable;
import d.x0;
import f.a;
import f1.s2;
import f1.u2;
import f1.w1;

@d.x0({x0.a.Q})
public class x0 implements z {

    /* renamed from: s  reason: collision with root package name */
    public static final String f1489s = "ToolbarWidgetWrapper";

    /* renamed from: t  reason: collision with root package name */
    public static final int f1490t = 3;

    /* renamed from: u  reason: collision with root package name */
    public static final long f1491u = 200;

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1492a;

    /* renamed from: b  reason: collision with root package name */
    public int f1493b;

    /* renamed from: c  reason: collision with root package name */
    public View f1494c;

    /* renamed from: d  reason: collision with root package name */
    public Spinner f1495d;

    /* renamed from: e  reason: collision with root package name */
    public View f1496e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1497f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1498g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1499h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1500i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1501j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1502k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1503l;

    /* renamed from: m  reason: collision with root package name */
    public Window.Callback f1504m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1505n;

    /* renamed from: o  reason: collision with root package name */
    public ActionMenuPresenter f1506o;

    /* renamed from: p  reason: collision with root package name */
    public int f1507p;

    /* renamed from: q  reason: collision with root package name */
    public int f1508q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f1509r;

    public class a implements View.OnClickListener {
        public final l.a O;

        public a() {
            this.O = new l.a(x0.this.f1492a.getContext(), 0, a2.a.f102p, 0, 0, x0.this.f1501j);
        }

        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.f1504m;
            if (callback != null && x0Var.f1505n) {
                callback.onMenuItemSelected(0, this.O);
            }
        }
    }

    public class b extends u2 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1510a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1511b;

        public b(int i10) {
            this.f1511b = i10;
        }

        public void a(View view) {
            this.f1510a = true;
        }

        public void b(View view) {
            if (!this.f1510a) {
                x0.this.f1492a.setVisibility(this.f1511b);
            }
        }

        public void c(View view) {
            x0.this.f1492a.setVisibility(0);
        }
    }

    public x0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, a.l.abc_action_bar_up_description, a.g.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1507p = 0;
        this.f1508q = 0;
        this.f1492a = toolbar;
        this.f1501j = toolbar.getTitle();
        this.f1502k = toolbar.getSubtitle();
        this.f1500i = this.f1501j != null;
        this.f1499h = toolbar.getNavigationIcon();
        w0 G = w0.G(toolbar.getContext(), (AttributeSet) null, a.n.ActionBar, a.c.actionBarStyle, 0);
        this.f1509r = G.h(a.n.ActionBar_homeAsUpIndicator);
        if (z10) {
            CharSequence x10 = G.x(a.n.ActionBar_title);
            if (!TextUtils.isEmpty(x10)) {
                setTitle(x10);
            }
            CharSequence x11 = G.x(a.n.ActionBar_subtitle);
            if (!TextUtils.isEmpty(x11)) {
                w(x11);
            }
            Drawable h10 = G.h(a.n.ActionBar_logo);
            if (h10 != null) {
                r(h10);
            }
            Drawable h11 = G.h(a.n.ActionBar_icon);
            if (h11 != null) {
                setIcon(h11);
            }
            if (this.f1499h == null && (drawable = this.f1509r) != null) {
                U(drawable);
            }
            u(G.o(a.n.ActionBar_displayOptions, 0));
            int u10 = G.u(a.n.ActionBar_customNavigationLayout, 0);
            if (u10 != 0) {
                Q(LayoutInflater.from(this.f1492a.getContext()).inflate(u10, this.f1492a, false));
                u(this.f1493b | 16);
            }
            int q10 = G.q(a.n.ActionBar_height, 0);
            if (q10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1492a.getLayoutParams();
                layoutParams.height = q10;
                this.f1492a.setLayoutParams(layoutParams);
            }
            int f10 = G.f(a.n.ActionBar_contentInsetStart, -1);
            int f11 = G.f(a.n.ActionBar_contentInsetEnd, -1);
            if (f10 >= 0 || f11 >= 0) {
                this.f1492a.J(Math.max(f10, 0), Math.max(f11, 0));
            }
            int u11 = G.u(a.n.ActionBar_titleTextStyle, 0);
            if (u11 != 0) {
                Toolbar toolbar2 = this.f1492a;
                toolbar2.O(toolbar2.getContext(), u11);
            }
            int u12 = G.u(a.n.ActionBar_subtitleTextStyle, 0);
            if (u12 != 0) {
                Toolbar toolbar3 = this.f1492a;
                toolbar3.M(toolbar3.getContext(), u12);
            }
            int u13 = G.u(a.n.ActionBar_popupTheme, 0);
            if (u13 != 0) {
                this.f1492a.setPopupTheme(u13);
            }
        } else {
            this.f1493b = W();
        }
        G.I();
        n(i10);
        this.f1503l = this.f1492a.getNavigationContentDescription();
        this.f1492a.setNavigationOnClickListener(new a());
    }

    public Menu A() {
        return this.f1492a.getMenu();
    }

    public boolean B() {
        return this.f1494c != null;
    }

    public int C() {
        return this.f1507p;
    }

    public void D(int i10) {
        s2 E = E(i10, 200);
        if (E != null) {
            E.w();
        }
    }

    public s2 E(int i10, long j10) {
        return w1.f(this.f1492a).a(i10 == 0 ? 1.0f : 0.0f).q(j10).s(new b(i10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(int r5) {
        /*
            r4 = this;
            int r0 = r4.f1507p
            if (r5 == r0) goto L_0x0071
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x001a
            if (r0 == r1) goto L_0x000b
            goto L_0x002b
        L_0x000b:
            android.view.View r0 = r4.f1494c
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1492a
            if (r0 != r3) goto L_0x002b
            android.view.View r0 = r4.f1494c
            goto L_0x0028
        L_0x001a:
            android.widget.Spinner r0 = r4.f1495d
            if (r0 == 0) goto L_0x002b
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r3 = r4.f1492a
            if (r0 != r3) goto L_0x002b
            android.widget.Spinner r0 = r4.f1495d
        L_0x0028:
            r3.removeView(r0)
        L_0x002b:
            r4.f1507p = r5
            if (r5 == 0) goto L_0x0071
            r0 = 0
            if (r5 == r2) goto L_0x0067
            if (r5 != r1) goto L_0x0050
            android.view.View r5 = r4.f1494c
            if (r5 == 0) goto L_0x0071
            androidx.appcompat.widget.Toolbar r1 = r4.f1492a
            r1.addView(r5, r0)
            android.view.View r5 = r4.f1494c
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r5 = (androidx.appcompat.widget.Toolbar.e) r5
            r0 = -2
            r5.width = r0
            r5.height = r0
            r0 = 8388691(0x800053, float:1.175506E-38)
            r5.f802a = r0
            goto L_0x0071
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid navigation mode "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0067:
            r4.X()
            androidx.appcompat.widget.Toolbar r5 = r4.f1492a
            android.widget.Spinner r1 = r4.f1495d
            r5.addView(r1, r0)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x0.F(int):void");
    }

    public void G(int i10) {
        U(i10 != 0 ? g.a.d(e(), i10) : null);
    }

    public void H(j.a aVar, e.a aVar2) {
        this.f1492a.L(aVar, aVar2);
    }

    public ViewGroup I() {
        return this.f1492a;
    }

    public void J(boolean z10) {
    }

    public void K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        X();
        this.f1495d.setAdapter(spinnerAdapter);
        this.f1495d.setOnItemSelectedListener(onItemSelectedListener);
    }

    public void L(SparseArray<Parcelable> sparseArray) {
        this.f1492a.restoreHierarchyState(sparseArray);
    }

    public CharSequence M() {
        return this.f1492a.getSubtitle();
    }

    public int N() {
        return this.f1493b;
    }

    public int O() {
        Spinner spinner = this.f1495d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    public void P(int i10) {
        v(i10 == 0 ? null : e().getString(i10));
    }

    public void Q(View view) {
        View view2 = this.f1496e;
        if (!(view2 == null || (this.f1493b & 16) == 0)) {
            this.f1492a.removeView(view2);
        }
        this.f1496e = view;
        if (view != null && (this.f1493b & 16) != 0) {
            this.f1492a.addView(view);
        }
    }

    public void R() {
    }

    public int S() {
        Spinner spinner = this.f1495d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    public void T() {
    }

    public void U(Drawable drawable) {
        this.f1499h = drawable;
        a0();
    }

    public void V(boolean z10) {
        this.f1492a.setCollapsible(z10);
    }

    public final int W() {
        if (this.f1492a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1509r = this.f1492a.getNavigationIcon();
        return 15;
    }

    public final void X() {
        if (this.f1495d == null) {
            this.f1495d = new AppCompatSpinner(e(), (AttributeSet) null, a.c.actionDropDownStyle);
            this.f1495d.setLayoutParams(new Toolbar.e(-2, -2, 8388627));
        }
    }

    public final void Y(CharSequence charSequence) {
        this.f1501j = charSequence;
        if ((this.f1493b & 8) != 0) {
            this.f1492a.setTitle(charSequence);
        }
    }

    public final void Z() {
        if ((this.f1493b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1503l)) {
            this.f1492a.setNavigationContentDescription(this.f1508q);
        } else {
            this.f1492a.setNavigationContentDescription(this.f1503l);
        }
    }

    public int a() {
        return this.f1492a.getHeight();
    }

    public final void a0() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1493b & 4) != 0) {
            toolbar = this.f1492a;
            drawable = this.f1499h;
            if (drawable == null) {
                drawable = this.f1509r;
            }
        } else {
            toolbar = this.f1492a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public void b(Drawable drawable) {
        w1.G1(this.f1492a, drawable);
    }

    public final void b0() {
        Drawable drawable;
        int i10 = this.f1493b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1498g) == null) {
            drawable = this.f1497f;
        }
        this.f1492a.setLogo(drawable);
    }

    public void c(Menu menu, j.a aVar) {
        if (this.f1506o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1492a.getContext());
            this.f1506o = actionMenuPresenter;
            actionMenuPresenter.s(a.h.action_menu_presenter);
        }
        this.f1506o.h(aVar);
        this.f1492a.K((e) menu, this.f1506o);
    }

    public void collapseActionView() {
        this.f1492a.e();
    }

    public int d() {
        return this.f1492a.getVisibility();
    }

    public Context e() {
        return this.f1492a.getContext();
    }

    public boolean f() {
        return this.f1492a.A();
    }

    public void g() {
        this.f1505n = true;
    }

    public CharSequence getTitle() {
        return this.f1492a.getTitle();
    }

    public boolean h() {
        return this.f1497f != null;
    }

    public boolean i() {
        return this.f1492a.d();
    }

    public boolean j() {
        return this.f1498g != null;
    }

    public boolean k() {
        return this.f1492a.z();
    }

    public boolean l() {
        return this.f1492a.w();
    }

    public boolean m() {
        return this.f1492a.R();
    }

    public void n(int i10) {
        if (i10 != this.f1508q) {
            this.f1508q = i10;
            if (TextUtils.isEmpty(this.f1492a.getNavigationContentDescription())) {
                P(this.f1508q);
            }
        }
    }

    public void o() {
        this.f1492a.f();
    }

    public View p() {
        return this.f1496e;
    }

    public void q(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f1494c;
        if (view != null && view.getParent() == (toolbar = this.f1492a)) {
            toolbar.removeView(this.f1494c);
        }
        this.f1494c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f1507p == 2) {
            this.f1492a.addView(scrollingTabContainerView, 0);
            Toolbar.e eVar = (Toolbar.e) this.f1494c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f802a = BadgeDrawable.f16649h0;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public void r(Drawable drawable) {
        this.f1498g = drawable;
        b0();
    }

    public boolean s() {
        return this.f1492a.v();
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.d(e(), i10) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1497f = drawable;
        b0();
    }

    public void setLogo(int i10) {
        r(i10 != 0 ? g.a.d(e(), i10) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1500i = true;
        Y(charSequence);
    }

    public void setVisibility(int i10) {
        this.f1492a.setVisibility(i10);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1504m = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1500i) {
            Y(charSequence);
        }
    }

    public boolean t() {
        return this.f1492a.B();
    }

    public void u(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1493b ^ i10;
        this.f1493b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    Z();
                }
                a0();
            }
            if ((i11 & 3) != 0) {
                b0();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1492a.setTitle(this.f1501j);
                    toolbar = this.f1492a;
                    charSequence = this.f1502k;
                } else {
                    charSequence = null;
                    this.f1492a.setTitle((CharSequence) null);
                    toolbar = this.f1492a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f1496e) != null) {
                if ((i10 & 16) != 0) {
                    this.f1492a.addView(view);
                } else {
                    this.f1492a.removeView(view);
                }
            }
        }
    }

    public void v(CharSequence charSequence) {
        this.f1503l = charSequence;
        Z();
    }

    public void w(CharSequence charSequence) {
        this.f1502k = charSequence;
        if ((this.f1493b & 8) != 0) {
            this.f1492a.setSubtitle(charSequence);
        }
    }

    public void x(Drawable drawable) {
        if (this.f1509r != drawable) {
            this.f1509r = drawable;
            a0();
        }
    }

    public void y(SparseArray<Parcelable> sparseArray) {
        this.f1492a.saveHierarchyState(sparseArray);
    }

    public void z(int i10) {
        Spinner spinner = this.f1495d;
        if (spinner != null) {
            spinner.setSelection(i10);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }
}

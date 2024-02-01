package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import d.a1;
import d.b1;
import d.k0;
import d.l;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.o;
import f1.w1;
import java.util.ArrayList;
import java.util.List;
import k.g;

public class Toolbar extends ViewGroup {
    public static final String G0 = "Toolbar";
    public ActionMenuPresenter A0;
    public d B0;
    public j.a C0;
    public e.a D0;
    public boolean E0;
    public final Runnable F0;
    public ActionMenuView O;
    public TextView P;
    public TextView Q;
    public ImageButton R;
    public ImageView S;
    public Drawable T;
    public CharSequence U;
    public ImageButton V;
    public View W;

    /* renamed from: a0  reason: collision with root package name */
    public Context f1188a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1189b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1190c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1191d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1192e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1193f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1194g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1195h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1196i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1197j0;

    /* renamed from: k0  reason: collision with root package name */
    public o0 f1198k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1199l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f1200m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f1201n0;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f1202o0;

    /* renamed from: p0  reason: collision with root package name */
    public CharSequence f1203p0;

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f1204q0;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f1205r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1206s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1207t0;

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList<View> f1208u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList<View> f1209v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int[] f1210w0;

    /* renamed from: x0  reason: collision with root package name */
    public f f1211x0;

    /* renamed from: y0  reason: collision with root package name */
    public final ActionMenuView.e f1212y0;

    /* renamed from: z0  reason: collision with root package name */
    public x0 f1213z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int Q;
        public boolean R;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readInt();
            this.R = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R ? 1 : 0);
        }
    }

    public class a implements ActionMenuView.e {
        public a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.f1211x0;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.R();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public class d implements j {
        public androidx.appcompat.view.menu.e O;
        public h P;

        public d() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public void d(boolean z10) {
            if (this.P != null) {
                androidx.appcompat.view.menu.e eVar = this.O;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.O.getItem(i10) == this.P) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    f(this.O, this.P);
                }
            }
        }

        public boolean e() {
            return false;
        }

        public boolean f(androidx.appcompat.view.menu.e eVar, h hVar) {
            View view = Toolbar.this.W;
            if (view instanceof k.c) {
                ((k.c) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.W);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.V);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.W = null;
            toolbar3.a();
            this.P = null;
            Toolbar.this.requestLayout();
            hVar.t(false);
            return true;
        }

        public boolean g(androidx.appcompat.view.menu.e eVar, h hVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.V.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.V);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.V);
            }
            Toolbar.this.W = hVar.getActionView();
            this.P = hVar;
            ViewParent parent2 = Toolbar.this.W.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.W);
                }
                e m10 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m10.f802a = 8388611 | (toolbar4.f1192e0 & 112);
                m10.f1218b = 2;
                toolbar4.W.setLayoutParams(m10);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.W);
            }
            Toolbar.this.H();
            Toolbar.this.requestLayout();
            hVar.t(true);
            View view = Toolbar.this.W;
            if (view instanceof k.c) {
                ((k.c) view).onActionViewExpanded();
            }
            return true;
        }

        public int getId() {
            return 0;
        }

        public void h(j.a aVar) {
        }

        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            h hVar;
            androidx.appcompat.view.menu.e eVar2 = this.O;
            if (!(eVar2 == null || (hVar = this.P) == null)) {
                eVar2.g(hVar);
            }
            this.O = eVar;
        }

        public void j(Parcelable parcelable) {
        }

        public boolean l(m mVar) {
            return false;
        }

        public k m(ViewGroup viewGroup) {
            return null;
        }

        public Parcelable n() {
            return null;
        }
    }

    public static class e extends a.b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f1215c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f1216d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f1217e = 2;

        /* renamed from: b  reason: collision with root package name */
        public int f1218b;

        public e(int i10) {
            this(-2, -1, i10);
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1218b = 0;
            this.f802a = 8388627;
        }

        public e(int i10, int i11, int i12) {
            super(i10, i11);
            this.f1218b = 0;
            this.f802a = i12;
        }

        public e(@m0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1218b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1218b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.f1218b = 0;
            a(marginLayoutParams);
        }

        public e(a.b bVar) {
            super(bVar);
            this.f1218b = 0;
        }

        public e(e eVar) {
            super((a.b) eVar);
            this.f1218b = 0;
            this.f1218b = eVar.f1218b;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.toolbarStyle);
    }

    public Toolbar(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1201n0 = 8388627;
        this.f1208u0 = new ArrayList<>();
        this.f1209v0 = new ArrayList<>();
        this.f1210w0 = new int[2];
        this.f1212y0 = new a();
        this.F0 = new b();
        Context context2 = getContext();
        int[] iArr = a.n.Toolbar;
        w0 G = w0.G(context2, attributeSet, iArr, i10, 0);
        w1.x1(this, context, iArr, attributeSet, G.B(), i10, 0);
        this.f1190c0 = G.u(a.n.Toolbar_titleTextAppearance, 0);
        this.f1191d0 = G.u(a.n.Toolbar_subtitleTextAppearance, 0);
        this.f1201n0 = G.p(a.n.Toolbar_android_gravity, this.f1201n0);
        this.f1192e0 = G.p(a.n.Toolbar_buttonGravity, 48);
        int f10 = G.f(a.n.Toolbar_titleMargin, 0);
        int i11 = a.n.Toolbar_titleMargins;
        f10 = G.C(i11) ? G.f(i11, f10) : f10;
        this.f1197j0 = f10;
        this.f1196i0 = f10;
        this.f1195h0 = f10;
        this.f1194g0 = f10;
        int f11 = G.f(a.n.Toolbar_titleMarginStart, -1);
        if (f11 >= 0) {
            this.f1194g0 = f11;
        }
        int f12 = G.f(a.n.Toolbar_titleMarginEnd, -1);
        if (f12 >= 0) {
            this.f1195h0 = f12;
        }
        int f13 = G.f(a.n.Toolbar_titleMarginTop, -1);
        if (f13 >= 0) {
            this.f1196i0 = f13;
        }
        int f14 = G.f(a.n.Toolbar_titleMarginBottom, -1);
        if (f14 >= 0) {
            this.f1197j0 = f14;
        }
        this.f1193f0 = G.g(a.n.Toolbar_maxButtonHeight, -1);
        int f15 = G.f(a.n.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int f16 = G.f(a.n.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int g10 = G.g(a.n.Toolbar_contentInsetLeft, 0);
        int g11 = G.g(a.n.Toolbar_contentInsetRight, 0);
        h();
        this.f1198k0.e(g10, g11);
        if (!(f15 == Integer.MIN_VALUE && f16 == Integer.MIN_VALUE)) {
            this.f1198k0.g(f15, f16);
        }
        this.f1199l0 = G.f(a.n.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1200m0 = G.f(a.n.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.T = G.h(a.n.Toolbar_collapseIcon);
        this.U = G.x(a.n.Toolbar_collapseContentDescription);
        CharSequence x10 = G.x(a.n.Toolbar_title);
        if (!TextUtils.isEmpty(x10)) {
            setTitle(x10);
        }
        CharSequence x11 = G.x(a.n.Toolbar_subtitle);
        if (!TextUtils.isEmpty(x11)) {
            setSubtitle(x11);
        }
        this.f1188a0 = getContext();
        setPopupTheme(G.u(a.n.Toolbar_popupTheme, 0));
        Drawable h10 = G.h(a.n.Toolbar_navigationIcon);
        if (h10 != null) {
            setNavigationIcon(h10);
        }
        CharSequence x12 = G.x(a.n.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(x12)) {
            setNavigationContentDescription(x12);
        }
        Drawable h11 = G.h(a.n.Toolbar_logo);
        if (h11 != null) {
            setLogo(h11);
        }
        CharSequence x13 = G.x(a.n.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(x13)) {
            setLogoDescription(x13);
        }
        int i12 = a.n.Toolbar_titleTextColor;
        if (G.C(i12)) {
            setTitleTextColor(G.d(i12));
        }
        int i13 = a.n.Toolbar_subtitleTextColor;
        if (G.C(i13)) {
            setSubtitleTextColor(G.d(i13));
        }
        int i14 = a.n.Toolbar_menu;
        if (G.C(i14)) {
            x(G.u(i14, 0));
        }
        G.I();
    }

    private void G() {
        removeCallbacks(this.F0);
        post(this.F0);
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.O;
        return actionMenuView != null && actionMenuView.L();
    }

    @x0({x0.a.Q})
    public boolean B() {
        Layout layout;
        TextView textView = this.P;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + eVar.rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void H() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f1218b == 2 || childAt == this.O)) {
                removeViewAt(childCount);
                this.f1209v0.add(childAt);
            }
        }
    }

    public void I(int i10, int i11) {
        h();
        this.f1198k0.e(i10, i11);
    }

    public void J(int i10, int i11) {
        h();
        this.f1198k0.g(i10, i11);
    }

    @x0({x0.a.O})
    public void K(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar != null || this.O != null) {
            k();
            androidx.appcompat.view.menu.e P2 = this.O.P();
            if (P2 != eVar) {
                if (P2 != null) {
                    P2.S(this.A0);
                    P2.S(this.B0);
                }
                if (this.B0 == null) {
                    this.B0 = new d();
                }
                actionMenuPresenter.K(true);
                if (eVar != null) {
                    eVar.c(actionMenuPresenter, this.f1188a0);
                    eVar.c(this.B0, this.f1188a0);
                } else {
                    actionMenuPresenter.i(this.f1188a0, (androidx.appcompat.view.menu.e) null);
                    this.B0.i(this.f1188a0, (androidx.appcompat.view.menu.e) null);
                    actionMenuPresenter.d(true);
                    this.B0.d(true);
                }
                this.O.setPopupTheme(this.f1189b0);
                this.O.setPresenter(actionMenuPresenter);
                this.A0 = actionMenuPresenter;
            }
        }
    }

    @x0({x0.a.Q})
    public void L(j.a aVar, e.a aVar2) {
        this.C0 = aVar;
        this.D0 = aVar2;
        ActionMenuView actionMenuView = this.O;
        if (actionMenuView != null) {
            actionMenuView.Q(aVar, aVar2);
        }
    }

    public void M(Context context, @b1 int i10) {
        this.f1191d0 = i10;
        TextView textView = this.Q;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        this.f1194g0 = i10;
        this.f1196i0 = i11;
        this.f1195h0 = i12;
        this.f1197j0 = i13;
        requestLayout();
    }

    public void O(Context context, @b1 int i10) {
        this.f1190c0 = i10;
        TextView textView = this.P;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean P() {
        if (!this.E0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.O;
        return actionMenuView != null && actionMenuView.R();
    }

    public void a() {
        for (int size = this.f1209v0.size() - 1; size >= 0; size--) {
            addView(this.f1209v0.get(size));
        }
        this.f1209v0.clear();
    }

    public final void b(List<View> list, int i10) {
        boolean z10 = w1.X(this) == 1;
        int childCount = getChildCount();
        int d10 = f1.j.d(i10, w1.X(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1218b == 0 && Q(childAt) && p(eVar.f802a) == d10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1218b == 0 && Q(childAt2) && p(eVar2.f802a) == d10) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e m10 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        m10.f1218b = 1;
        if (!z10 || this.W == null) {
            addView(view, m10);
            return;
        }
        view.setLayoutParams(m10);
        this.f1209v0.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.O;
     */
    @d.x0({d.x0.a.Q})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.O
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.M()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.B0;
        h hVar = dVar == null ? null : dVar.P;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.O;
        if (actionMenuView != null) {
            actionMenuView.D();
        }
    }

    public void g() {
        if (this.V == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, a.c.toolbarNavigationButtonStyle);
            this.V = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.T);
            this.V.setContentDescription(this.U);
            e m10 = generateDefaultLayoutParams();
            m10.f802a = 8388611 | (this.f1192e0 & 112);
            m10.f1218b = 2;
            this.V.setLayoutParams(m10);
            this.V.setOnClickListener(new c());
        }
    }

    @o0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @o0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.f1198k0;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1200m0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.f1198k0;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.f1198k0;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.f1198k0;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1199l0;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.P();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.O
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.e r0 = r0.P()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1200m0
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return w1.X(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return w1.X(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1199l0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.S;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.O.getMenu();
    }

    @o0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.R;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @o0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.R;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.A0;
    }

    @o0
    public Drawable getOverflowIcon() {
        j();
        return this.O.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1188a0;
    }

    public int getPopupTheme() {
        return this.f1189b0;
    }

    public CharSequence getSubtitle() {
        return this.f1203p0;
    }

    @x0({x0.a.S})
    @o0
    public final TextView getSubtitleTextView() {
        return this.Q;
    }

    public CharSequence getTitle() {
        return this.f1202o0;
    }

    public int getTitleMarginBottom() {
        return this.f1197j0;
    }

    public int getTitleMarginEnd() {
        return this.f1195h0;
    }

    public int getTitleMarginStart() {
        return this.f1194g0;
    }

    public int getTitleMarginTop() {
        return this.f1196i0;
    }

    @x0({x0.a.S})
    @o0
    public final TextView getTitleTextView() {
        return this.P;
    }

    @x0({x0.a.Q})
    public z getWrapper() {
        if (this.f1213z0 == null) {
            this.f1213z0 = new x0(this, true);
        }
        return this.f1213z0;
    }

    public final void h() {
        if (this.f1198k0 == null) {
            this.f1198k0 = new o0();
        }
    }

    public final void i() {
        if (this.S == null) {
            this.S = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.O.P() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.O.getMenu();
            if (this.B0 == null) {
                this.B0 = new d();
            }
            this.O.setExpandedActionViewsExclusive(true);
            eVar.c(this.B0, this.f1188a0);
        }
    }

    public final void k() {
        if (this.O == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.O = actionMenuView;
            actionMenuView.setPopupTheme(this.f1189b0);
            this.O.setOnMenuItemClickListener(this.f1212y0);
            this.O.Q(this.C0, this.D0);
            e m10 = generateDefaultLayoutParams();
            m10.f802a = 8388613 | (this.f1192e0 & 112);
            this.O.setLayoutParams(m10);
            c(this.O, false);
        }
    }

    public final void l() {
        if (this.R == null) {
            this.R = new AppCompatImageButton(getContext(), (AttributeSet) null, a.c.toolbarNavigationButtonStyle);
            e m10 = generateDefaultLayoutParams();
            m10.f802a = 8388611 | (this.f1192e0 & 112);
            this.R.setLayoutParams(m10);
        }
    }

    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.b ? new e((a.b) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.F0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1207t0 = false;
        }
        if (!this.f1207t0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1207t0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1207t0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f0 A[LOOP:2: B:117:0x02ee->B:118:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = f1.w1.X(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1210w0
            r11[r2] = r3
            r11[r3] = r3
            int r12 = f1.w1.c0(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.R
            boolean r13 = r0.Q(r13)
            if (r13 == 0) goto L_0x0053
            android.widget.ImageButton r13 = r0.R
            if (r1 == 0) goto L_0x004e
            int r13 = r0.D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0055
        L_0x004e:
            int r13 = r0.C(r13, r6, r11, r12)
            goto L_0x0054
        L_0x0053:
            r13 = r6
        L_0x0054:
            r14 = r10
        L_0x0055:
            android.widget.ImageButton r15 = r0.V
            boolean r15 = r0.Q(r15)
            if (r15 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.V
            if (r1 == 0) goto L_0x0066
            int r14 = r0.D(r15, r14, r11, r12)
            goto L_0x006a
        L_0x0066:
            int r13 = r0.C(r15, r13, r11, r12)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.O
            boolean r15 = r0.Q(r15)
            if (r15 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.O
            if (r1 == 0) goto L_0x007b
            int r13 = r0.C(r15, r13, r11, r12)
            goto L_0x007f
        L_0x007b:
            int r14 = r0.D(r15, r14, r11, r12)
        L_0x007f:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.W
            boolean r13 = r0.Q(r13)
            if (r13 == 0) goto L_0x00ba
            android.view.View r13 = r0.W
            if (r1 == 0) goto L_0x00b6
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00ba
        L_0x00b6:
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00ba:
            android.widget.ImageView r13 = r0.S
            boolean r13 = r0.Q(r13)
            if (r13 == 0) goto L_0x00cf
            android.widget.ImageView r13 = r0.S
            if (r1 == 0) goto L_0x00cb
            int r10 = r0.D(r13, r10, r11, r12)
            goto L_0x00cf
        L_0x00cb:
            int r2 = r0.C(r13, r2, r11, r12)
        L_0x00cf:
            android.widget.TextView r13 = r0.P
            boolean r13 = r0.Q(r13)
            android.widget.TextView r14 = r0.Q
            boolean r14 = r0.Q(r14)
            if (r13 == 0) goto L_0x00f6
            android.widget.TextView r15 = r0.P
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.P
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00f9
        L_0x00f6:
            r23 = r7
            r3 = 0
        L_0x00f9:
            if (r14 == 0) goto L_0x0113
            android.widget.TextView r7 = r0.Q
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.Q
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0115
        L_0x0113:
            r16 = r4
        L_0x0115:
            if (r13 != 0) goto L_0x0121
            if (r14 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r18 = r6
            r22 = r12
        L_0x011e:
            r1 = 0
            goto L_0x0286
        L_0x0121:
            if (r13 == 0) goto L_0x0126
            android.widget.TextView r4 = r0.P
            goto L_0x0128
        L_0x0126:
            android.widget.TextView r4 = r0.Q
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            android.widget.TextView r7 = r0.Q
            goto L_0x012f
        L_0x012d:
            android.widget.TextView r7 = r0.P
        L_0x012f:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x0145
            android.widget.TextView r15 = r0.P
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x014f
        L_0x0145:
            if (r14 == 0) goto L_0x0152
            android.widget.TextView r15 = r0.Q
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0152
        L_0x014f:
            r17 = 1
            goto L_0x0154
        L_0x0152:
            r17 = 0
        L_0x0154:
            int r15 = r0.f1201n0
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019c
            r6 = 80
            if (r15 == r6) goto L_0x018e
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1196i0
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0177
            int r6 = r15 + r12
            goto L_0x018c
        L_0x0177:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1197j0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018c
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018c:
            int r8 = r8 + r6
            goto L_0x01ab
        L_0x018e:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1197j0
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01ab
        L_0x019c:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1196i0
            int r8 = r2 + r3
        L_0x01ab:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b2
            int r1 = r0.f1194g0
            goto L_0x01b3
        L_0x01b2:
            r1 = 0
        L_0x01b3:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ea
            android.widget.TextView r1 = r0.P
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.P
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.P
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.P
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1195h0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01eb
        L_0x01ea:
            r2 = r10
        L_0x01eb:
            if (r14 == 0) goto L_0x0211
            android.widget.TextView r1 = r0.Q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.Q
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.Q
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.Q
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1195h0
            int r1 = r10 - r1
            goto L_0x0212
        L_0x0211:
            r1 = r10
        L_0x0212:
            if (r17 == 0) goto L_0x0219
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0219:
            r2 = r24
            goto L_0x011e
        L_0x021d:
            if (r17 == 0) goto L_0x0223
            int r7 = r0.f1194g0
            r1 = 0
            goto L_0x0225
        L_0x0223:
            r1 = 0
            r7 = 0
        L_0x0225:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x025a
            android.widget.TextView r3 = r0.P
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.widget.TextView r4 = r0.P
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.P
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.P
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1195h0
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x025b
        L_0x025a:
            r4 = r2
        L_0x025b:
            if (r14 == 0) goto L_0x027f
            android.widget.TextView r3 = r0.Q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.Q
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.Q
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.Q
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1195h0
            int r3 = r3 + r5
            goto L_0x0280
        L_0x027f:
            r3 = r2
        L_0x0280:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0286:
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            r4 = 3
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            int r3 = r3.size()
            r7 = r1
        L_0x0293:
            if (r7 >= r3) goto L_0x02a6
            java.util.ArrayList<android.view.View> r4 = r0.f1208u0
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x0293
        L_0x02a6:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            r4 = 5
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            int r3 = r3.size()
            r7 = r1
        L_0x02b5:
            if (r7 >= r3) goto L_0x02c6
            java.util.ArrayList<android.view.View> r4 = r0.f1208u0
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c6:
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            r4 = 1
            r0.b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            int r3 = r0.u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            if (r3 <= r10) goto L_0x02e7
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02e8
        L_0x02e7:
            r2 = r6
        L_0x02e8:
            java.util.ArrayList<android.view.View> r3 = r0.f1208u0
            int r3 = r3.size()
        L_0x02ee:
            if (r1 >= r3) goto L_0x02ff
            java.util.ArrayList<android.view.View> r4 = r0.f1208u0
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02ee
        L_0x02ff:
            java.util.ArrayList<android.view.View> r1 = r0.f1208u0
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f1210w0;
        char b10 = d1.b(this);
        int i19 = 0;
        char c10 = b10 ^ 1;
        if (Q(this.R)) {
            F(this.R, i10, 0, i11, 0, this.f1193f0);
            i14 = this.R.getMeasuredWidth() + s(this.R);
            i13 = Math.max(0, this.R.getMeasuredHeight() + t(this.R));
            i12 = View.combineMeasuredStates(0, this.R.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (Q(this.V)) {
            F(this.V, i10, 0, i11, 0, this.f1193f0);
            i14 = this.V.getMeasuredWidth() + s(this.V);
            i13 = Math.max(i13, this.V.getMeasuredHeight() + t(this.V));
            i12 = View.combineMeasuredStates(i12, this.V.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i14);
        iArr[b10] = Math.max(0, currentContentInsetStart - i14);
        if (Q(this.O)) {
            F(this.O, i10, max, i11, 0, this.f1193f0);
            i15 = this.O.getMeasuredWidth() + s(this.O);
            i13 = Math.max(i13, this.O.getMeasuredHeight() + t(this.O));
            i12 = View.combineMeasuredStates(i12, this.O.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (Q(this.W)) {
            max2 += E(this.W, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.W.getMeasuredHeight() + t(this.W));
            i12 = View.combineMeasuredStates(i12, this.W.getMeasuredState());
        }
        if (Q(this.S)) {
            max2 += E(this.S, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.S.getMeasuredHeight() + t(this.S));
            i12 = View.combineMeasuredStates(i12, this.S.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f1218b == 0 && Q(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1196i0 + this.f1197j0;
        int i22 = this.f1194g0 + this.f1195h0;
        if (Q(this.P)) {
            E(this.P, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.P.getMeasuredWidth() + s(this.P);
            i16 = this.P.getMeasuredHeight() + t(this.P);
            i18 = View.combineMeasuredStates(i12, this.P.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (Q(this.Q)) {
            i17 = Math.max(i17, E(this.Q, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.Q.getMeasuredHeight() + t(this.Q);
            i18 = View.combineMeasuredStates(i18, this.Q.getMeasuredState());
        } else {
            int i23 = i18;
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!P()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.O;
        androidx.appcompat.view.menu.e P2 = actionMenuView != null ? actionMenuView.P() : null;
        int i10 = savedState.Q;
        if (!(i10 == 0 || this.B0 == null || P2 == null || (findItem = P2.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.R) {
            G();
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        o0 o0Var = this.f1198k0;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        o0Var.f(z10);
    }

    public Parcelable onSaveInstanceState() {
        h hVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.B0;
        if (!(dVar == null || (hVar = dVar.P) == null)) {
            savedState.Q = hVar.getItemId();
        }
        savedState.R = A();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1206s0 = false;
        }
        if (!this.f1206s0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1206s0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1206s0 = false;
        }
        return true;
    }

    public final int p(int i10) {
        int X = w1.X(this);
        int d10 = f1.j.d(i10, X) & 7;
        return (d10 == 1 || d10 == 3 || d10 == 5) ? d10 : X == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f802a);
        if (r10 == 48) {
            return getPaddingTop() - i11;
        }
        if (r10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = eVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = eVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1201n0 & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o.c(marginLayoutParams) + o.b(marginLayoutParams);
    }

    public void setCollapseContentDescription(@a1 int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(@o0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@u int i10) {
        setCollapseIcon(g.a.d(getContext(), i10));
    }

    public void setCollapseIcon(@o0 Drawable drawable) {
        if (drawable != null) {
            g();
            this.V.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.V;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.T);
        }
    }

    @x0({x0.a.Q})
    public void setCollapsible(boolean z10) {
        this.E0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1200m0) {
            this.f1200m0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1199l0) {
            this.f1199l0 = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@u int i10) {
        setLogo(g.a.d(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.S)) {
                c(this.S, true);
            }
        } else {
            ImageView imageView = this.S;
            if (imageView != null && y(imageView)) {
                removeView(this.S);
                this.f1209v0.remove(this.S);
            }
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(@a1 int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@a1 int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(@o0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.R;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@u int i10) {
        setNavigationIcon(g.a.d(getContext(), i10));
    }

    public void setNavigationIcon(@o0 Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.R)) {
                c(this.R, true);
            }
        } else {
            ImageButton imageButton = this.R;
            if (imageButton != null && y(imageButton)) {
                removeView(this.R);
                this.f1209v0.remove(this.R);
            }
        }
        ImageButton imageButton2 = this.R;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.R.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.f1211x0 = fVar;
    }

    public void setOverflowIcon(@o0 Drawable drawable) {
        j();
        this.O.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@b1 int i10) {
        if (this.f1189b0 != i10) {
            this.f1189b0 = i10;
            if (i10 == 0) {
                this.f1188a0 = getContext();
            } else {
                this.f1188a0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(@a1 int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.Q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.Q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.Q.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1191d0;
                if (i10 != 0) {
                    this.Q.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1205r0;
                if (colorStateList != null) {
                    this.Q.setTextColor(colorStateList);
                }
            }
            if (!y(this.Q)) {
                c(this.Q, true);
            }
        } else {
            TextView textView = this.Q;
            if (textView != null && y(textView)) {
                removeView(this.Q);
                this.f1209v0.remove(this.Q);
            }
        }
        TextView textView2 = this.Q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1203p0 = charSequence;
    }

    public void setSubtitleTextColor(@l int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(@m0 ColorStateList colorStateList) {
        this.f1205r0 = colorStateList;
        TextView textView = this.Q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(@a1 int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.P == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.P = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.P.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1190c0;
                if (i10 != 0) {
                    this.P.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1204q0;
                if (colorStateList != null) {
                    this.P.setTextColor(colorStateList);
                }
            }
            if (!y(this.P)) {
                c(this.P, true);
            }
        } else {
            TextView textView = this.P;
            if (textView != null && y(textView)) {
                removeView(this.P);
                this.f1209v0.remove(this.P);
            }
        }
        TextView textView2 = this.P;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1202o0 = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1197j0 = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1195h0 = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1194g0 = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1196i0 = i10;
        requestLayout();
    }

    public void setTitleTextColor(@l int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(@m0 ColorStateList colorStateList) {
        this.f1204q0 = colorStateList;
        TextView textView = this.P;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = eVar.leftMargin - i10;
            int i15 = eVar.rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    public boolean v() {
        d dVar = this.B0;
        return (dVar == null || dVar.P == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.O;
        return actionMenuView != null && actionMenuView.J();
    }

    public void x(@k0 int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final boolean y(View view) {
        return view.getParent() == this || this.f1209v0.contains(view);
    }

    @x0({x0.a.Q})
    public boolean z() {
        ActionMenuView actionMenuView = this.O;
        return actionMenuView != null && actionMenuView.K();
    }
}

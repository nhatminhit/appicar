package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import d.b1;
import d.m0;
import d.o0;
import d.x0;

public class ActionMenuView extends LinearLayoutCompat implements e.b, k {
    public static final String E0 = "ActionMenuView";
    public static final int F0 = 56;
    public static final int G0 = 4;
    public int A0;
    public int B0;
    public int C0;
    public e D0;

    /* renamed from: s0  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f1064s0;

    /* renamed from: t0  reason: collision with root package name */
    public Context f1065t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1066u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1067v0;

    /* renamed from: w0  reason: collision with root package name */
    public ActionMenuPresenter f1068w0;

    /* renamed from: x0  reason: collision with root package name */
    public j.a f1069x0;

    /* renamed from: y0  reason: collision with root package name */
    public e.a f1070y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f1071z0;

    @x0({x0.a.Q})
    public interface a {
        boolean a();

        boolean c();
    }

    public static class b implements j.a {
        public void b(@m0 androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public boolean c(@m0 androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.b {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1072a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1073b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1074c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1075d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1076e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1077f;

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1072a = false;
        }

        public c(int i10, int i11, boolean z10) {
            super(i10, i11);
            this.f1072a = z10;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f1072a = cVar.f1072a;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.D0;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1070y0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B0 = (int) (56.0f * f10);
        this.C0 = (int) (f10 * 4.0f);
        this.f1065t0 = context;
        this.f1066u0 = 0;
    }

    public static int N(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.h();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f1072a || !z11) {
            z10 = false;
        }
        cVar.f1075d = z10;
        cVar.f1073b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    public void D() {
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    /* renamed from: E */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: F */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: G */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    @x0({x0.a.Q})
    public c H() {
        c E = m();
        E.f1072a = true;
        return E;
    }

    @x0({x0.a.Q})
    public boolean I(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).c();
    }

    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    @x0({x0.a.Q})
    public boolean K() {
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean L() {
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    @x0({x0.a.Q})
    public boolean M() {
        return this.f1067v0;
    }

    public final void O(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.B0;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z15) {
                    int i29 = this.C0;
                    i16 = i28;
                    z13 = false;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    z13 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1077f = z13;
                cVar.f1074c = z13 ? 1 : 0;
                cVar.f1073b = z13;
                cVar.f1075d = z13;
                cVar.leftMargin = z13;
                cVar.rightMargin = z13;
                cVar.f1076e = z15 && ((ActionMenuItemView) childAt).h();
                int N = N(childAt, i21, cVar.f1072a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, N);
                if (cVar.f1075d) {
                    i26++;
                }
                if (cVar.f1072a) {
                    z14 = true;
                }
                i19 -= N;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (N == 1) {
                    j10 |= (long) (1 << i23);
                    i22 = i22;
                } else {
                    int i30 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i31 = size2;
        boolean z16 = z14 && i24 == 2;
        boolean z17 = false;
        while (true) {
            if (i26 <= 0 || i19 <= 0) {
                i14 = mode;
                i12 = i17;
                z10 = z17;
                i13 = i22;
            } else {
                int i32 = Integer.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j11 = 0;
                while (i34 < childCount) {
                    boolean z18 = z17;
                    c cVar2 = (c) getChildAt(i34).getLayoutParams();
                    int i35 = i22;
                    if (cVar2.f1075d) {
                        int i36 = cVar2.f1073b;
                        if (i36 < i32) {
                            j11 = 1 << i34;
                            i32 = i36;
                            i33 = 1;
                        } else if (i36 == i32) {
                            i33++;
                            j11 |= 1 << i34;
                        }
                    }
                    i34++;
                    i22 = i35;
                    z17 = z18;
                }
                z10 = z17;
                i13 = i22;
                j10 |= j11;
                if (i33 > i19) {
                    i14 = mode;
                    i12 = i17;
                    break;
                }
                int i37 = i32 + 1;
                int i38 = 0;
                while (i38 < childCount) {
                    View childAt2 = getChildAt(i38);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i39 = i17;
                    int i40 = mode;
                    long j12 = (long) (1 << i38);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f1073b == i37) {
                            j10 |= j12;
                        }
                        z12 = z16;
                    } else {
                        if (!z16 || !cVar3.f1076e || i19 != 1) {
                            z12 = z16;
                        } else {
                            int i41 = this.C0;
                            z12 = z16;
                            childAt2.setPadding(i41 + i21, 0, i41, 0);
                        }
                        cVar3.f1073b++;
                        cVar3.f1077f = true;
                        i19--;
                    }
                    i38++;
                    mode = i40;
                    i17 = i39;
                    z16 = z12;
                }
                i22 = i13;
                z17 = true;
            }
        }
        boolean z19 = !z14 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z19 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z19) {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1076e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount - 1;
                if ((j10 & ((long) (1 << i42))) != 0 && !((c) getChildAt(i42).getLayoutParams()).f1076e) {
                    bitCount -= 0.5f;
                }
            } else {
                i15 = 0;
            }
            int i43 = bitCount > 0.0f ? (int) (((float) (i19 * i21)) / bitCount) : i15;
            z11 = z10;
            for (int i44 = i15; i44 < childCount; i44++) {
                if ((j10 & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1074c = i43;
                        cVar4.f1077f = true;
                        if (i44 == 0 && !cVar4.f1076e) {
                            cVar4.leftMargin = (-i43) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f1072a) {
                        cVar4.f1074c = i43;
                        cVar4.f1077f = true;
                        cVar4.rightMargin = (-i43) / 2;
                        z11 = true;
                    } else {
                        if (i44 != 0) {
                            cVar4.leftMargin = i43 / 2;
                        }
                        if (i44 != childCount - 1) {
                            cVar4.rightMargin = i43 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i45 = i15; i45 < childCount; i45++) {
                View childAt4 = getChildAt(i45);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1077f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1073b * i21) + cVar5.f1074c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i31);
    }

    @x0({x0.a.Q})
    public androidx.appcompat.view.menu.e P() {
        return this.f1064s0;
    }

    @x0({x0.a.Q})
    public void Q(j.a aVar, e.a aVar2) {
        this.f1069x0 = aVar;
        this.f1070y0 = aVar2;
    }

    public boolean R() {
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        return actionMenuPresenter != null && actionMenuPresenter.Q();
    }

    @x0({x0.a.Q})
    public boolean a(h hVar) {
        return this.f1064s0.O(hVar, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @x0({x0.a.Q})
    public void e(androidx.appcompat.view.menu.e eVar) {
        this.f1064s0 = eVar;
    }

    public Menu getMenu() {
        if (this.f1064s0 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1064s0 = eVar;
            eVar.X(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1068w0 = actionMenuPresenter;
            actionMenuPresenter.O(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1068w0;
            j.a aVar = this.f1069x0;
            if (aVar == null) {
                aVar = new b();
            }
            actionMenuPresenter2.h(aVar);
            this.f1064s0.c(this.f1068w0, this.f1065t0);
            this.f1068w0.M(this);
        }
        return this.f1064s0;
    }

    @o0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1068w0.D();
    }

    public int getPopupTheme() {
        return this.f1066u0;
    }

    @x0({x0.a.Q})
    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1068w0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.d(false);
            if (this.f1068w0.H()) {
                this.f1068w0.E();
                this.f1068w0.Q();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.f1071z0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = d1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1072a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (I(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    I(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1072a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1072a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1071z0;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1071z0 = z11;
        if (z10 != z11) {
            this.A0 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.f1071z0 || (eVar = this.f1064s0) == null || size == this.A0)) {
            this.A0 = size;
            eVar.N(true);
        }
        int childCount = getChildCount();
        if (!this.f1071z0 || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        O(i10, i11);
    }

    @x0({x0.a.Q})
    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1068w0.K(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.D0 = eVar;
    }

    public void setOverflowIcon(@o0 Drawable drawable) {
        getMenu();
        this.f1068w0.N(drawable);
    }

    @x0({x0.a.Q})
    public void setOverflowReserved(boolean z10) {
        this.f1067v0 = z10;
    }

    public void setPopupTheme(@b1 int i10) {
        if (this.f1066u0 != i10) {
            this.f1066u0 = i10;
            if (i10 == 0) {
                this.f1065t0 = getContext();
            } else {
                this.f1065t0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    @x0({x0.a.O})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1068w0 = actionMenuPresenter;
        actionMenuPresenter.M(this);
    }
}

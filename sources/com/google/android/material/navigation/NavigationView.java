package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.w0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import d.b0;
import d.b1;
import d.h0;
import d.m0;
import d.o0;
import d.p;
import d.q;
import d.u;
import d.x0;
import f.a;
import f1.e3;
import i0.d;
import i9.a;
import z9.j;
import z9.k;
import z9.o;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f17273d0 = {16842912};

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f17274e0 = {-16842910};

    /* renamed from: f0  reason: collision with root package name */
    public static final int f17275f0 = a.n.Widget_Design_NavigationView;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f17276g0 = 1;
    @m0
    public final f T;
    public final g U;
    public c V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public final int[] f17277a0;

    /* renamed from: b0  reason: collision with root package name */
    public MenuInflater f17278b0;

    /* renamed from: c0  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f17279c0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        @o0
        public Bundle Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @o0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @m0
            /* renamed from: b */
            public SavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @m0
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Parcel parcel, @o0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.Q);
        }
    }

    public class a implements e.a {
        public a() {
        }

        public boolean a(e eVar, MenuItem menuItem) {
            c cVar = NavigationView.this.V;
            return cVar != null && cVar.a(menuItem);
        }

        public void b(e eVar) {
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f17277a0);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f17277a0[1] == 0;
            NavigationView.this.U.A(z11);
            NavigationView.this.setDrawTopInsetForeground(z11);
            Activity a10 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
            if (a10 != null) {
                boolean z12 = a10.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z13 = Color.alpha(a10.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z12 || !z13) {
                    z10 = false;
                }
                navigationView2.setDrawBottomInsetForeground(z10);
            }
        }
    }

    public interface c {
        boolean a(@m0 MenuItem menuItem);
    }

    public NavigationView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@d.m0 android.content.Context r11, @d.o0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f17275f0
            android.content.Context r11 = ca.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.internal.g r11 = new com.google.android.material.internal.g
            r11.<init>()
            r10.U = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.f17277a0 = r0
            android.content.Context r7 = r10.getContext()
            com.google.android.material.internal.f r8 = new com.google.android.material.internal.f
            r8.<init>(r7)
            r10.T = r8
            int[] r2 = i9.a.o.NavigationView
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            androidx.appcompat.widget.w0 r0 = com.google.android.material.internal.n.k(r0, r1, r2, r3, r4, r5)
            int r1 = i9.a.o.NavigationView_android_background
            boolean r2 = r0.C(r1)
            if (r2 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r0.h(r1)
            f1.w1.G1(r10, r1)
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0072
        L_0x004a:
            z9.o$b r12 = z9.o.e(r7, r12, r13, r6)
            z9.o r12 = r12.m()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            z9.j r1 = new z9.j
            r1.<init>((z9.o) r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006c
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.n0(r12)
        L_0x006c:
            r1.Y(r7)
            f1.w1.G1(r10, r1)
        L_0x0072:
            int r12 = i9.a.o.NavigationView_elevation
            boolean r13 = r0.C(r12)
            if (r13 == 0) goto L_0x0082
            int r12 = r0.g(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L_0x0082:
            int r12 = i9.a.o.NavigationView_android_fitsSystemWindows
            boolean r12 = r0.a(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = i9.a.o.NavigationView_android_maxWidth
            int r12 = r0.g(r12, r9)
            r10.W = r12
            int r12 = i9.a.o.NavigationView_itemIconTint
            boolean r13 = r0.C(r12)
            if (r13 == 0) goto L_0x00a0
            android.content.res.ColorStateList r12 = r0.d(r12)
            goto L_0x00a7
        L_0x00a0:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.e(r12)
        L_0x00a7:
            int r13 = i9.a.o.NavigationView_itemTextAppearance
            boolean r1 = r0.C(r13)
            r2 = 1
            if (r1 == 0) goto L_0x00b6
            int r13 = r0.u(r13, r9)
            r1 = r2
            goto L_0x00b8
        L_0x00b6:
            r13 = r9
            r1 = r13
        L_0x00b8:
            int r3 = i9.a.o.NavigationView_itemIconSize
            boolean r4 = r0.C(r3)
            if (r4 == 0) goto L_0x00c7
            int r3 = r0.g(r3, r9)
            r10.setItemIconSize(r3)
        L_0x00c7:
            r3 = 0
            int r4 = i9.a.o.NavigationView_itemTextColor
            boolean r5 = r0.C(r4)
            if (r5 == 0) goto L_0x00d4
            android.content.res.ColorStateList r3 = r0.d(r4)
        L_0x00d4:
            if (r1 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.e(r3)
        L_0x00df:
            int r4 = i9.a.o.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.h(r4)
            if (r4 != 0) goto L_0x00f1
            boolean r5 = r10.h(r0)
            if (r5 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r4 = r10.f(r0)
        L_0x00f1:
            int r5 = i9.a.o.NavigationView_itemHorizontalPadding
            boolean r6 = r0.C(r5)
            if (r6 == 0) goto L_0x0100
            int r5 = r0.g(r5, r9)
            r11.E(r5)
        L_0x0100:
            int r5 = i9.a.o.NavigationView_itemIconPadding
            int r5 = r0.g(r5, r9)
            int r6 = i9.a.o.NavigationView_itemMaxLines
            int r6 = r0.o(r6, r2)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$a r6 = new com.google.android.material.navigation.NavigationView$a
            r6.<init>()
            r8.X(r6)
            r11.C(r2)
            r11.i(r7, r8)
            r11.H(r12)
            int r12 = r10.getOverScrollMode()
            r11.L(r12)
            if (r1 == 0) goto L_0x012c
            r11.J(r13)
        L_0x012c:
            r11.K(r3)
            r11.D(r4)
            r11.F(r5)
            r8.b(r11)
            androidx.appcompat.view.menu.k r11 = r11.m(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = i9.a.o.NavigationView_menu
            boolean r12 = r0.C(r11)
            if (r12 == 0) goto L_0x0150
            int r11 = r0.u(r11, r9)
            r10.j(r11)
        L_0x0150:
            int r11 = i9.a.o.NavigationView_headerLayout
            boolean r12 = r0.C(r11)
            if (r12 == 0) goto L_0x015f
            int r11 = r0.u(r11, r9)
            r10.i(r11)
        L_0x015f:
            r0.I()
            r10.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f17278b0 == null) {
            this.f17278b0 = new k.g(getContext());
        }
        return this.f17278b0;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void a(@m0 e3 e3Var) {
        this.U.k(e3Var);
    }

    public void d(@m0 View view) {
        this.U.c(view);
    }

    @o0
    public final ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList c10 = g.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.c.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = c10.getDefaultColor();
        int[] iArr = f17274e0;
        return new ColorStateList(new int[][]{iArr, f17273d0, FrameLayout.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @m0
    public final Drawable f(@m0 w0 w0Var) {
        j jVar = new j(o.b(getContext(), w0Var.u(a.o.NavigationView_itemShapeAppearance, 0), w0Var.u(a.o.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        jVar.n0(w9.c.b(getContext(), w0Var, a.o.NavigationView_itemShapeFillColor));
        return new InsetDrawable(jVar, w0Var.g(a.o.NavigationView_itemShapeInsetStart, 0), w0Var.g(a.o.NavigationView_itemShapeInsetTop, 0), w0Var.g(a.o.NavigationView_itemShapeInsetEnd, 0), w0Var.g(a.o.NavigationView_itemShapeInsetBottom, 0));
    }

    public View g(int i10) {
        return this.U.q(i10);
    }

    @o0
    public MenuItem getCheckedItem() {
        return this.U.o();
    }

    public int getHeaderCount() {
        return this.U.p();
    }

    @o0
    public Drawable getItemBackground() {
        return this.U.r();
    }

    @q
    public int getItemHorizontalPadding() {
        return this.U.s();
    }

    @q
    public int getItemIconPadding() {
        return this.U.t();
    }

    @o0
    public ColorStateList getItemIconTintList() {
        return this.U.w();
    }

    public int getItemMaxLines() {
        return this.U.u();
    }

    @o0
    public ColorStateList getItemTextColor() {
        return this.U.v();
    }

    @m0
    public Menu getMenu() {
        return this.T;
    }

    public final boolean h(@m0 w0 w0Var) {
        return w0Var.C(a.o.NavigationView_itemShapeAppearance) || w0Var.C(a.o.NavigationView_itemShapeAppearanceOverlay);
    }

    public View i(@h0 int i10) {
        return this.U.x(i10);
    }

    public void j(int i10) {
        this.U.M(true);
        getMenuInflater().inflate(i10, this.T);
        this.U.M(false);
        this.U.d(false);
    }

    public void k(@m0 View view) {
        this.U.z(view);
    }

    public final void l() {
        this.f17279c0 = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f17279c0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f17279c0);
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = this.W;
            }
            super.onMeasure(i10, i11);
        }
        i12 = Math.min(View.MeasureSpec.getSize(i10), this.W);
        i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        super.onMeasure(i10, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.T.U(savedState.Q);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.Q = bundle;
        this.T.W(bundle);
        return savedState;
    }

    public void setCheckedItem(@b0 int i10) {
        MenuItem findItem = this.T.findItem(i10);
        if (findItem != null) {
            this.U.B((h) findItem);
        }
    }

    public void setCheckedItem(@m0 MenuItem menuItem) {
        MenuItem findItem = this.T.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.U.B((h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        k.d(this, f10);
    }

    public void setItemBackground(@o0 Drawable drawable) {
        this.U.D(drawable);
    }

    public void setItemBackgroundResource(@u int i10) {
        setItemBackground(d.i(getContext(), i10));
    }

    public void setItemHorizontalPadding(@q int i10) {
        this.U.E(i10);
    }

    public void setItemHorizontalPaddingResource(@p int i10) {
        this.U.E(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@q int i10) {
        this.U.F(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.U.F(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@q int i10) {
        this.U.G(i10);
    }

    public void setItemIconTintList(@o0 ColorStateList colorStateList) {
        this.U.H(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.U.I(i10);
    }

    public void setItemTextAppearance(@b1 int i10) {
        this.U.J(i10);
    }

    public void setItemTextColor(@o0 ColorStateList colorStateList) {
        this.U.K(colorStateList);
    }

    public void setNavigationItemSelectedListener(@o0 c cVar) {
        this.V = cVar;
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        g gVar = this.U;
        if (gVar != null) {
            gVar.L(i10);
        }
    }
}

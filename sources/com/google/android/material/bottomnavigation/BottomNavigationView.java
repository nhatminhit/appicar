package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.v;
import d.b0;
import d.b1;
import d.g1;
import d.m0;
import d.o0;
import d.p;
import d.q;
import d.u;
import f1.e3;
import f1.w1;
import i9.a;
import k.g;
import z9.j;
import z9.k;

public class BottomNavigationView extends FrameLayout {
    public static final int V = a.n.Widget_Design_BottomNavigationView;
    public static final int W = 1;
    @m0
    public final e O;
    @g1
    @m0
    public final BottomNavigationMenuView P;
    public final BottomNavigationPresenter Q;
    @o0
    public ColorStateList R;
    public MenuInflater S;
    public d T;
    public c U;

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

        public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(@m0 Parcel parcel, ClassLoader classLoader) {
            this.Q = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.Q);
        }
    }

    public class a implements e.a {
        public a() {
        }

        public boolean a(e eVar, @m0 MenuItem menuItem) {
            if (BottomNavigationView.this.U == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return BottomNavigationView.this.T != null && !BottomNavigationView.this.T.a(menuItem);
            }
            BottomNavigationView.this.U.a(menuItem);
            return true;
        }

        public void b(e eVar) {
        }
    }

    public class b implements v.e {
        public b() {
        }

        @m0
        public e3 a(View view, @m0 e3 e3Var, @m0 v.f fVar) {
            fVar.f17272d += e3Var.o();
            boolean z10 = true;
            if (w1.X(view) != 1) {
                z10 = false;
            }
            int p10 = e3Var.p();
            int q10 = e3Var.q();
            fVar.f17269a += z10 ? q10 : p10;
            int i10 = fVar.f17271c;
            if (!z10) {
                p10 = q10;
            }
            fVar.f17271c = i10 + p10;
            fVar.a(view);
            return e3Var;
        }
    }

    public interface c {
        void a(@m0 MenuItem menuItem);
    }

    public interface d {
        boolean a(@m0 MenuItem menuItem);
    }

    public BottomNavigationView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.bottomNavigationStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomNavigationView(@d.m0 android.content.Context r16, @d.o0 android.util.AttributeSet r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r2 = r17
            r4 = r18
            int r1 = V
            r3 = r16
            android.content.Context r1 = ca.a.c(r3, r2, r4, r1)
            r15.<init>(r1, r2, r4)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r1 = new com.google.android.material.bottomnavigation.BottomNavigationPresenter
            r1.<init>()
            r0.Q = r1
            android.content.Context r7 = r15.getContext()
            com.google.android.material.bottomnavigation.a r8 = new com.google.android.material.bottomnavigation.a
            r8.<init>(r7)
            r0.O = r8
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r9 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView
            r9.<init>(r7)
            r0.P = r9
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r10.<init>(r3, r3)
            r3 = 17
            r10.gravity = r3
            r9.setLayoutParams(r10)
            r1.a(r9)
            r11 = 1
            r1.c(r11)
            r9.setPresenter(r1)
            r8.b(r1)
            android.content.Context r3 = r15.getContext()
            r1.i(r3, r8)
            int[] r3 = i9.a.o.BottomNavigationView
            int r5 = i9.a.n.Widget_Design_BottomNavigationView
            r1 = 2
            int[] r6 = new int[r1]
            int r12 = i9.a.o.BottomNavigationView_itemTextAppearanceInactive
            r13 = 0
            r6[r13] = r12
            int r14 = i9.a.o.BottomNavigationView_itemTextAppearanceActive
            r6[r11] = r14
            r1 = r7
            androidx.appcompat.widget.w0 r1 = com.google.android.material.internal.n.k(r1, r2, r3, r4, r5, r6)
            int r2 = i9.a.o.BottomNavigationView_itemIconTint
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x006c
            android.content.res.ColorStateList r2 = r1.d(r2)
            goto L_0x0073
        L_0x006c:
            r2 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r2 = r9.d(r2)
        L_0x0073:
            r9.setIconTintList(r2)
            int r2 = i9.a.o.BottomNavigationView_itemIconSize
            android.content.res.Resources r3 = r15.getResources()
            int r4 = i9.a.f.design_bottom_navigation_icon_size
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.g(r2, r3)
            r15.setItemIconSize(r2)
            boolean r2 = r1.C(r12)
            if (r2 == 0) goto L_0x0096
            int r2 = r1.u(r12, r13)
            r15.setItemTextAppearanceInactive(r2)
        L_0x0096:
            boolean r2 = r1.C(r14)
            if (r2 == 0) goto L_0x00a3
            int r2 = r1.u(r14, r13)
            r15.setItemTextAppearanceActive(r2)
        L_0x00a3:
            int r2 = i9.a.o.BottomNavigationView_itemTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x00b2
            android.content.res.ColorStateList r2 = r1.d(r2)
            r15.setItemTextColor(r2)
        L_0x00b2:
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            if (r2 == 0) goto L_0x00c0
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00c7
        L_0x00c0:
            z9.j r2 = r15.e(r7)
            f1.w1.G1(r15, r2)
        L_0x00c7:
            int r2 = i9.a.o.BottomNavigationView_elevation
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x00d7
            int r2 = r1.g(r2, r13)
            float r2 = (float) r2
            r15.setElevation(r2)
        L_0x00d7:
            int r2 = i9.a.o.BottomNavigationView_backgroundTint
            android.content.res.ColorStateList r2 = w9.c.b(r7, r1, r2)
            android.graphics.drawable.Drawable r3 = r15.getBackground()
            android.graphics.drawable.Drawable r3 = r3.mutate()
            o0.d.o(r3, r2)
            int r2 = i9.a.o.BottomNavigationView_labelVisibilityMode
            r3 = -1
            int r2 = r1.p(r2, r3)
            r15.setLabelVisibilityMode(r2)
            int r2 = i9.a.o.BottomNavigationView_itemHorizontalTranslationEnabled
            boolean r2 = r1.a(r2, r11)
            r15.setItemHorizontalTranslationEnabled(r2)
            int r2 = i9.a.o.BottomNavigationView_itemBackground
            int r2 = r1.u(r2, r13)
            if (r2 == 0) goto L_0x0107
            r9.setItemBackgroundRes(r2)
            goto L_0x0110
        L_0x0107:
            int r2 = i9.a.o.BottomNavigationView_itemRippleColor
            android.content.res.ColorStateList r2 = w9.c.b(r7, r1, r2)
            r15.setItemRippleColor(r2)
        L_0x0110:
            int r2 = i9.a.o.BottomNavigationView_menu
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x011f
            int r2 = r1.u(r2, r13)
            r15.h(r2)
        L_0x011f:
            r1.I()
            r15.addView(r9, r10)
            boolean r1 = r15.l()
            if (r1 == 0) goto L_0x012e
            r15.c(r7)
        L_0x012e:
            com.google.android.material.bottomnavigation.BottomNavigationView$a r1 = new com.google.android.material.bottomnavigation.BottomNavigationView$a
            r1.<init>()
            r8.X(r1)
            r15.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.S == null) {
            this.S = new g(getContext());
        }
        return this.S;
    }

    public final void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(i0.d.f(context, a.e.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(a.f.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    public final void d() {
        v.d(this, new b());
    }

    @m0
    public final j e(Context context) {
        j jVar = new j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.n0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.Y(context);
        return jVar;
    }

    @o0
    public BadgeDrawable f(int i10) {
        return this.P.g(i10);
    }

    public BadgeDrawable g(int i10) {
        return this.P.h(i10);
    }

    @o0
    public Drawable getItemBackground() {
        return this.P.getItemBackground();
    }

    @u
    @Deprecated
    public int getItemBackgroundResource() {
        return this.P.getItemBackgroundRes();
    }

    @q
    public int getItemIconSize() {
        return this.P.getItemIconSize();
    }

    @o0
    public ColorStateList getItemIconTintList() {
        return this.P.getIconTintList();
    }

    @o0
    public ColorStateList getItemRippleColor() {
        return this.R;
    }

    @b1
    public int getItemTextAppearanceActive() {
        return this.P.getItemTextAppearanceActive();
    }

    @b1
    public int getItemTextAppearanceInactive() {
        return this.P.getItemTextAppearanceInactive();
    }

    @o0
    public ColorStateList getItemTextColor() {
        return this.P.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.P.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @m0
    public Menu getMenu() {
        return this.O;
    }

    @b0
    public int getSelectedItemId() {
        return this.P.getSelectedItemId();
    }

    public void h(int i10) {
        this.Q.k(true);
        getMenuInflater().inflate(i10, this.O);
        this.Q.k(false);
        this.Q.d(true);
    }

    public boolean i() {
        return this.P.i();
    }

    public void j(int i10) {
        this.P.l(i10);
    }

    public void k(int i10, @o0 View.OnTouchListener onTouchListener) {
        this.P.n(i10, onTouchListener);
    }

    public final boolean l() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.O.U(savedState.Q);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.Q = bundle;
        this.O.W(bundle);
        return savedState;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        k.d(this, f10);
    }

    public void setItemBackground(@o0 Drawable drawable) {
        this.P.setItemBackground(drawable);
        this.R = null;
    }

    public void setItemBackgroundResource(@u int i10) {
        this.P.setItemBackgroundRes(i10);
        this.R = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        if (this.P.i() != z10) {
            this.P.setItemHorizontalTranslationEnabled(z10);
            this.Q.d(false);
        }
    }

    public void setItemIconSize(@q int i10) {
        this.P.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(@p int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(@o0 ColorStateList colorStateList) {
        this.P.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(@o0 ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (colorStateList == null) {
                this.P.setItemBackground((Drawable) null);
                return;
            }
            this.P.setItemBackground(new RippleDrawable(x9.b.a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.P.getItemBackground() != null) {
            this.P.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(@b1 int i10) {
        this.P.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(@b1 int i10) {
        this.P.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(@o0 ColorStateList colorStateList) {
        this.P.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.P.getLabelVisibilityMode() != i10) {
            this.P.setLabelVisibilityMode(i10);
            this.Q.d(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@o0 c cVar) {
        this.U = cVar;
    }

    public void setOnNavigationItemSelectedListener(@o0 d dVar) {
        this.T = dVar;
    }

    public void setSelectedItemId(@b0 int i10) {
        MenuItem findItem = this.O.findItem(i10);
        if (findItem != null && !this.O.P(findItem, this.Q, 0)) {
            findItem.setChecked(true);
        }
    }
}

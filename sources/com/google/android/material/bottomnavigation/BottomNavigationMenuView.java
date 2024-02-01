package com.google.android.material.bottomnavigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.l;
import d.b1;
import d.g1;
import d.m0;
import d.q;
import d.x0;
import e1.m;
import f.a;
import f1.w1;
import g1.z;
import g3.c;
import g3.o0;
import i9.a;
import java.util.HashSet;
import z1.b;

@x0({x0.a.LIBRARY_GROUP})
public class BottomNavigationMenuView extends ViewGroup implements k {

    /* renamed from: r0  reason: collision with root package name */
    public static final long f16731r0 = 115;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f16732s0 = 5;

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f16733t0 = {16842912};

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f16734u0 = {-16842910};
    @m0
    public final o0 O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    @m0
    public final View.OnClickListener U;
    public final m.a<BottomNavigationItemView> V;
    @m0
    public final SparseArray<View.OnTouchListener> W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f16735a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f16736b0;
    @d.o0

    /* renamed from: c0  reason: collision with root package name */
    public BottomNavigationItemView[] f16737c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f16738d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f16739e0;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f16740f0;
    @q

    /* renamed from: g0  reason: collision with root package name */
    public int f16741g0;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f16742h0;
    @d.o0

    /* renamed from: i0  reason: collision with root package name */
    public final ColorStateList f16743i0;
    @b1

    /* renamed from: j0  reason: collision with root package name */
    public int f16744j0;
    @b1

    /* renamed from: k0  reason: collision with root package name */
    public int f16745k0;

    /* renamed from: l0  reason: collision with root package name */
    public Drawable f16746l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f16747m0;

    /* renamed from: n0  reason: collision with root package name */
    public int[] f16748n0;
    @m0

    /* renamed from: o0  reason: collision with root package name */
    public SparseArray<BadgeDrawable> f16749o0;

    /* renamed from: p0  reason: collision with root package name */
    public BottomNavigationPresenter f16750p0;

    /* renamed from: q0  reason: collision with root package name */
    public e f16751q0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            h itemData = ((BottomNavigationItemView) view).getItemData();
            if (!BottomNavigationMenuView.this.f16751q0.P(itemData, BottomNavigationMenuView.this.f16750p0, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = new m.c(5);
        this.W = new SparseArray<>(5);
        this.f16738d0 = 0;
        this.f16739e0 = 0;
        this.f16749o0 = new SparseArray<>(5);
        Resources resources = getResources();
        this.P = resources.getDimensionPixelSize(a.f.design_bottom_navigation_item_max_width);
        this.Q = resources.getDimensionPixelSize(a.f.design_bottom_navigation_item_min_width);
        this.R = resources.getDimensionPixelSize(a.f.design_bottom_navigation_active_item_max_width);
        this.S = resources.getDimensionPixelSize(a.f.design_bottom_navigation_active_item_min_width);
        this.T = resources.getDimensionPixelSize(a.f.design_bottom_navigation_height);
        this.f16743i0 = d(16842808);
        c cVar = new c();
        this.O = cVar;
        cVar.Z0(0);
        cVar.x0(115);
        cVar.z0(new b());
        cVar.M0(new l());
        this.U = new a();
        this.f16748n0 = new int[5];
        w1.P1(this, 1);
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView b10 = this.V.b();
        return b10 == null ? new BottomNavigationItemView(getContext()) : b10;
    }

    private void setBadgeIfNeeded(@m0 BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = bottomNavigationItemView.getId();
        if (k(id2) && (badgeDrawable = this.f16749o0.get(id2)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.V.a(bottomNavigationItemView);
                    bottomNavigationItemView.j();
                }
            }
        }
        if (this.f16751q0.size() == 0) {
            this.f16738d0 = 0;
            this.f16739e0 = 0;
            this.f16737c0 = null;
            return;
        }
        m();
        this.f16737c0 = new BottomNavigationItemView[this.f16751q0.size()];
        boolean j10 = j(this.f16736b0, this.f16751q0.H().size());
        for (int i10 = 0; i10 < this.f16751q0.size(); i10++) {
            this.f16750p0.k(true);
            this.f16751q0.getItem(i10).setCheckable(true);
            this.f16750p0.k(false);
            BottomNavigationItemView newItem = getNewItem();
            this.f16737c0[i10] = newItem;
            newItem.setIconTintList(this.f16740f0);
            newItem.setIconSize(this.f16741g0);
            newItem.setTextColor(this.f16743i0);
            newItem.setTextAppearanceInactive(this.f16744j0);
            newItem.setTextAppearanceActive(this.f16745k0);
            newItem.setTextColor(this.f16742h0);
            Drawable drawable = this.f16746l0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f16747m0);
            }
            newItem.setShifting(j10);
            newItem.setLabelVisibilityMode(this.f16736b0);
            h hVar = (h) this.f16751q0.getItem(i10);
            newItem.g(hVar, 0);
            newItem.setItemPosition(i10);
            int itemId = hVar.getItemId();
            newItem.setOnTouchListener(this.W.get(itemId));
            newItem.setOnClickListener(this.U);
            int i11 = this.f16738d0;
            if (i11 != 0 && itemId == i11) {
                this.f16739e0 = i10;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f16751q0.size() - 1, this.f16739e0);
        this.f16739e0 = min;
        this.f16751q0.getItem(min).setChecked(true);
    }

    @d.o0
    public ColorStateList d(int i10) {
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
        int[] iArr = f16734u0;
        return new ColorStateList(new int[][]{iArr, f16733t0, ViewGroup.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public void e(e eVar) {
        this.f16751q0 = eVar;
    }

    @d.o0
    @g1
    public BottomNavigationItemView f(int i10) {
        q(i10);
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr == null) {
            return null;
        }
        for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
            if (bottomNavigationItemView.getId() == i10) {
                return bottomNavigationItemView;
            }
        }
        return null;
    }

    @d.o0
    public BadgeDrawable g(int i10) {
        return this.f16749o0.get(i10);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f16749o0;
    }

    @d.o0
    public ColorStateList getIconTintList() {
        return this.f16740f0;
    }

    @d.o0
    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.f16746l0 : bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f16747m0;
    }

    @q
    public int getItemIconSize() {
        return this.f16741g0;
    }

    @b1
    public int getItemTextAppearanceActive() {
        return this.f16745k0;
    }

    @b1
    public int getItemTextAppearanceInactive() {
        return this.f16744j0;
    }

    public ColorStateList getItemTextColor() {
        return this.f16742h0;
    }

    public int getLabelVisibilityMode() {
        return this.f16736b0;
    }

    public int getSelectedItemId() {
        return this.f16738d0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public BadgeDrawable h(int i10) {
        q(i10);
        BadgeDrawable badgeDrawable = this.f16749o0.get(i10);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.d(getContext());
            this.f16749o0.put(i10, badgeDrawable);
        }
        BottomNavigationItemView f10 = f(i10);
        if (f10 != null) {
            f10.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    public boolean i() {
        return this.f16735a0;
    }

    public final boolean j(int i10, int i11) {
        if (i10 == -1) {
            if (i11 > 3) {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final boolean k(int i10) {
        return i10 != -1;
    }

    public void l(int i10) {
        q(i10);
        BadgeDrawable badgeDrawable = this.f16749o0.get(i10);
        BottomNavigationItemView f10 = f(i10);
        if (f10 != null) {
            f10.j();
        }
        if (badgeDrawable != null) {
            this.f16749o0.remove(i10);
        }
    }

    public final void m() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f16751q0.size(); i10++) {
            hashSet.add(Integer.valueOf(this.f16751q0.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f16749o0.size(); i11++) {
            int keyAt = this.f16749o0.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f16749o0.delete(keyAt);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void n(int i10, @d.o0 View.OnTouchListener onTouchListener) {
        SparseArray<View.OnTouchListener> sparseArray = this.W;
        if (onTouchListener == null) {
            sparseArray.remove(i10);
        } else {
            sparseArray.put(i10, onTouchListener);
        }
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView.getItemData().getItemId() == i10) {
                    bottomNavigationItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void o(int i10) {
        int size = this.f16751q0.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = this.f16751q0.getItem(i11);
            if (i10 == item.getItemId()) {
                this.f16738d0 = i10;
                this.f16739e0 = i11;
                item.setChecked(true);
                return;
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.V1(accessibilityNodeInfo).W0(z.b.f(1, this.f16751q0.H().size(), false, 1));
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (w1.X(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f16751q0.H().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.T, 1073741824);
        int i12 = 1;
        if (!j(this.f16736b0, size2) || !this.f16735a0) {
            if (size2 != 0) {
                i12 = size2;
            }
            int min = Math.min(size / i12, this.R);
            int i13 = size - (size2 * min);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr = this.f16748n0;
                    iArr[i14] = min;
                    if (i13 > 0) {
                        iArr[i14] = min + 1;
                        i13--;
                    }
                } else {
                    this.f16748n0[i14] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f16739e0);
            int i15 = this.S;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.R, Integer.MIN_VALUE), makeMeasureSpec);
                i15 = Math.max(i15, childAt.getMeasuredWidth());
            }
            int i16 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.Q * i16), Math.min(i15, this.R));
            int i17 = size - min2;
            if (i16 != 0) {
                i12 = i16;
            }
            int min3 = Math.min(i17 / i12, this.P);
            int i18 = i17 - (i16 * min3);
            int i19 = 0;
            while (i19 < childCount) {
                if (getChildAt(i19).getVisibility() != 8) {
                    int[] iArr2 = this.f16748n0;
                    int i20 = i19 == this.f16739e0 ? min2 : min3;
                    iArr2[i19] = i20;
                    if (i18 > 0) {
                        iArr2[i19] = i20 + 1;
                        i18--;
                    }
                } else {
                    this.f16748n0[i19] = 0;
                }
                i19++;
            }
        }
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f16748n0[i22], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i21 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i21, View.MeasureSpec.makeMeasureSpec(i21, 1073741824), 0), View.resolveSizeAndState(this.T, makeMeasureSpec, 0));
    }

    public void p() {
        e eVar = this.f16751q0;
        if (eVar != null && this.f16737c0 != null) {
            int size = eVar.size();
            if (size != this.f16737c0.length) {
                c();
                return;
            }
            int i10 = this.f16738d0;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = this.f16751q0.getItem(i11);
                if (item.isChecked()) {
                    this.f16738d0 = item.getItemId();
                    this.f16739e0 = i11;
                }
            }
            if (i10 != this.f16738d0) {
                g3.m0.b(this, this.O);
            }
            boolean j10 = j(this.f16736b0, this.f16751q0.H().size());
            for (int i12 = 0; i12 < size; i12++) {
                this.f16750p0.k(true);
                this.f16737c0[i12].setLabelVisibilityMode(this.f16736b0);
                this.f16737c0[i12].setShifting(j10);
                this.f16737c0[i12].g((h) this.f16751q0.getItem(i12), 0);
                this.f16750p0.k(false);
            }
        }
    }

    public final void q(int i10) {
        if (!k(i10)) {
            throw new IllegalArgumentException(i10 + " is not a valid view id");
        }
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f16749o0 = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f16740f0 = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconTintList : bottomNavigationItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(@d.o0 Drawable drawable) {
        this.f16746l0 = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f16747m0 = i10;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(i10);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f16735a0 = z10;
    }

    public void setItemIconSize(@q int i10) {
        this.f16741g0 = i10;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconSize : bottomNavigationItemViewArr) {
                iconSize.setIconSize(i10);
            }
        }
    }

    public void setItemTextAppearanceActive(@b1 int i10) {
        this.f16745k0 = i10;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f16742h0;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@b1 int i10) {
        this.f16744j0 = i10;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f16742h0;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16742h0 = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f16737c0;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView textColor : bottomNavigationItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f16736b0 = i10;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f16750p0 = bottomNavigationPresenter;
    }
}

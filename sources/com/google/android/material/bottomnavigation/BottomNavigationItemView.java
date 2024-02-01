package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.z0;
import androidx.core.widget.y;
import com.google.android.material.badge.BadgeDrawable;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import f1.t0;
import f1.w1;
import g1.z;
import i9.a;
import o0.d;

@x0({x0.a.LIBRARY_GROUP})
public class BottomNavigationItemView extends FrameLayout implements k.a {

    /* renamed from: h0  reason: collision with root package name */
    public static final int f16722h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f16723i0 = {16842912};
    public final int O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public boolean T;
    public ImageView U;
    public final ViewGroup V;
    public final TextView W;

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f16724a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f16725b0;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public h f16726c0;
    @o0

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f16727d0;
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f16728e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f16729f0;
    @o0

    /* renamed from: g0  reason: collision with root package name */
    public BadgeDrawable f16730g0;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (BottomNavigationItemView.this.U.getVisibility() == 0) {
                BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                bottomNavigationItemView.o(bottomNavigationItemView.U);
            }
        }
    }

    public BottomNavigationItemView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationItemView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16725b0 = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(a.k.design_bottom_navigation_item, this, true);
        setBackgroundResource(a.g.design_bottom_navigation_item_background);
        this.O = resources.getDimensionPixelSize(a.f.design_bottom_navigation_margin);
        this.U = (ImageView) findViewById(a.h.icon);
        ViewGroup viewGroup = (ViewGroup) findViewById(a.h.labelGroup);
        this.V = viewGroup;
        TextView textView = (TextView) findViewById(a.h.smallLabel);
        this.W = textView;
        TextView textView2 = (TextView) findViewById(a.h.largeLabel);
        this.f16724a0 = textView2;
        viewGroup.setTag(a.h.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        w1.P1(textView, 2);
        w1.P1(textView2, 2);
        setFocusable(true);
        e(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof BottomNavigationItemView) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public static void k(@m0 View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    public static void l(@m0 View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    public static void p(@m0 View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public void b(boolean z10, char c10) {
    }

    public boolean d() {
        return false;
    }

    public final void e(float f10, float f11) {
        this.P = f10 - f11;
        this.Q = (f11 * 1.0f) / f10;
        this.R = (f10 * 1.0f) / f11;
    }

    public boolean f() {
        return true;
    }

    public void g(@m0 h hVar, int i10) {
        this.f16726c0 = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitle());
        setId(hVar.getItemId());
        if (!TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(hVar.getContentDescription());
        }
        z0.a(this, !TextUtils.isEmpty(hVar.getTooltipText()) ? hVar.getTooltipText() : hVar.getTitle());
        setVisibility(hVar.isVisible() ? 0 : 8);
    }

    @o0
    public BadgeDrawable getBadge() {
        return this.f16730g0;
    }

    public h getItemData() {
        return this.f16726c0;
    }

    public int getItemPosition() {
        return this.f16725b0;
    }

    @o0
    public final FrameLayout h(View view) {
        ImageView imageView = this.U;
        if (view != imageView || !com.google.android.material.badge.a.f16660a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    public final boolean i() {
        return this.f16730g0 != null;
    }

    public void j() {
        n(this.U);
    }

    public final void m(@o0 View view) {
        if (i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.a.b(this.f16730g0, view, h(view));
        }
    }

    public final void n(@o0 View view) {
        if (i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a.g(this.f16730g0, view);
            }
            this.f16730g0 = null;
        }
    }

    public final void o(View view) {
        if (i()) {
            com.google.android.material.badge.a.i(this.f16730g0, view, h(view));
        }
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.f16726c0;
        if (hVar != null && hVar.isCheckable() && this.f16726c0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16723i0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f16730g0;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f16726c0.getTitle();
            if (!TextUtils.isEmpty(this.f16726c0.getContentDescription())) {
                title = this.f16726c0.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f16730g0.m());
        }
        z V1 = z.V1(accessibilityNodeInfo);
        V1.X0(z.c.h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            V1.V0(false);
            V1.J0(z.a.f7603j);
        }
        V1.B1(getResources().getString(a.m.item_view_role_description));
    }

    public void setBadge(@m0 BadgeDrawable badgeDrawable) {
        this.f16730g0 = badgeDrawable;
        ImageView imageView = this.U;
        if (imageView != null) {
            m(imageView);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0082, code lost:
        k(r8.U, r8.O, 49);
        r0 = r8.f16724a0;
        r1 = r8.R;
        l(r0, r1, r1, 4);
        l(r8.W, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009a, code lost:
        if (r9 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009c, code lost:
        k(r0, r1, 49);
        r0 = r8.V;
        p(r0, ((java.lang.Integer) r0.getTag(i9.a.h.mtrl_view_tag_bottom_padding)).intValue());
        r8.f16724a0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b6, code lost:
        k(r0, r1, 17);
        p(r8.V, 0);
        r8.f16724a0.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c3, code lost:
        r8.W.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
        if (r9 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e5, code lost:
        if (r9 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (r9 != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r9) {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.f16724a0
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.f16724a0
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r8.W
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.W
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r8.S
            r1 = -1
            r3 = 17
            r4 = 49
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 4
            r7 = 0
            if (r0 == r1) goto L_0x00c9
            if (r0 == 0) goto L_0x0096
            r1 = 1
            if (r0 == r1) goto L_0x0056
            if (r0 == r2) goto L_0x0041
            goto L_0x00e8
        L_0x0041:
            android.widget.ImageView r0 = r8.U
            int r1 = r8.O
            k(r0, r1, r3)
            android.widget.TextView r0 = r8.f16724a0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.W
            r0.setVisibility(r1)
            goto L_0x00e8
        L_0x0056:
            android.view.ViewGroup r0 = r8.V
            int r1 = i9.a.h.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            p(r0, r1)
            if (r9 == 0) goto L_0x0082
        L_0x0069:
            android.widget.ImageView r0 = r8.U
            int r1 = r8.O
            float r1 = (float) r1
            float r2 = r8.P
            float r1 = r1 + r2
            int r1 = (int) r1
            k(r0, r1, r4)
            android.widget.TextView r0 = r8.f16724a0
            l(r0, r5, r5, r7)
            android.widget.TextView r0 = r8.W
            float r1 = r8.Q
            l(r0, r1, r1, r6)
            goto L_0x00e8
        L_0x0082:
            android.widget.ImageView r0 = r8.U
            int r1 = r8.O
            k(r0, r1, r4)
            android.widget.TextView r0 = r8.f16724a0
            float r1 = r8.R
            l(r0, r1, r1, r6)
            android.widget.TextView r0 = r8.W
            l(r0, r5, r5, r7)
            goto L_0x00e8
        L_0x0096:
            android.widget.ImageView r0 = r8.U
            int r1 = r8.O
            if (r9 == 0) goto L_0x00b6
        L_0x009c:
            k(r0, r1, r4)
            android.view.ViewGroup r0 = r8.V
            int r1 = i9.a.h.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            p(r0, r1)
            android.widget.TextView r0 = r8.f16724a0
            r0.setVisibility(r7)
            goto L_0x00c3
        L_0x00b6:
            k(r0, r1, r3)
            android.view.ViewGroup r0 = r8.V
            p(r0, r7)
            android.widget.TextView r0 = r8.f16724a0
            r0.setVisibility(r6)
        L_0x00c3:
            android.widget.TextView r0 = r8.W
            r0.setVisibility(r6)
            goto L_0x00e8
        L_0x00c9:
            boolean r0 = r8.T
            if (r0 == 0) goto L_0x00d4
            android.widget.ImageView r0 = r8.U
            int r1 = r8.O
            if (r9 == 0) goto L_0x00b6
            goto L_0x009c
        L_0x00d4:
            android.view.ViewGroup r0 = r8.V
            int r1 = i9.a.h.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            p(r0, r1)
            if (r9 == 0) goto L_0x0082
            goto L_0x0069
        L_0x00e8:
            r8.refreshDrawableState()
            r8.setSelected(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationItemView.setChecked(boolean):void");
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.W.setEnabled(z10);
        this.f16724a0.setEnabled(z10);
        this.U.setEnabled(z10);
        w1.e2(this, z10 ? t0.c(getContext(), 1002) : null);
    }

    public void setIcon(@o0 Drawable drawable) {
        if (drawable != this.f16728e0) {
            this.f16728e0 = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = d.r(drawable).mutate();
                this.f16729f0 = drawable;
                ColorStateList colorStateList = this.f16727d0;
                if (colorStateList != null) {
                    d.o(drawable, colorStateList);
                }
            }
            this.U.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.U.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f16727d0 = colorStateList;
        if (this.f16726c0 != null && (drawable = this.f16729f0) != null) {
            d.o(drawable, colorStateList);
            this.f16729f0.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : i0.d.i(getContext(), i10));
    }

    public void setItemBackground(@o0 Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        w1.G1(this, drawable);
    }

    public void setItemPosition(int i10) {
        this.f16725b0 = i10;
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.S != i10) {
            this.S = i10;
            h hVar = this.f16726c0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            h hVar = this.f16726c0;
            if (hVar != null) {
                setChecked(hVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@b1 int i10) {
        y.E(this.f16724a0, i10);
        e(this.W.getTextSize(), this.f16724a0.getTextSize());
    }

    public void setTextAppearanceInactive(@b1 int i10) {
        y.E(this.W, i10);
        e(this.W.getTextSize(), this.f16724a0.getTextSize());
    }

    public void setTextColor(@o0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.W.setTextColor(colorStateList);
            this.f16724a0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.W.setText(charSequence);
        this.f16724a0.setText(charSequence);
        h hVar = this.f16726c0;
        if (hVar == null || TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.f16726c0;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.getTooltipText())) {
            charSequence = this.f16726c0.getTooltipText();
        }
        z0.a(this, charSequence);
    }
}

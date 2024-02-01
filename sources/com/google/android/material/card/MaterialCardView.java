package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.p;
import d.q;
import d.u;
import d.v;
import i9.a;
import z9.k;
import z9.o;
import z9.s;

public class MaterialCardView extends CardView implements Checkable, s {

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f16849f0 = {16842911};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f16850g0 = {16842912};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f16851h0 = {a.c.state_dragged};

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16852i0 = a.n.Widget_MaterialComponents_CardView;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f16853j0 = "MaterialCardView";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f16854k0 = "androidx.cardview.widget.CardView";
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final n9.a f16855a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f16856b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16857c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16858d0;

    /* renamed from: e0  reason: collision with root package name */
    public a f16859e0;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialCardViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f16852i0
            android.content.Context r8 = ca.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f16857c0 = r8
            r7.f16858d0 = r8
            r0 = 1
            r7.f16856b0 = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = i9.a.o.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            n9.a r0 = new n9.a
            r0.<init>(r7, r9, r10, r6)
            r7.f16855a0 = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.H(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.U(r9, r10, r1, r2)
            r0.E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @m0
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f16855a0.k().getBounds());
        return rectF;
    }

    @m0
    public ColorStateList getCardBackgroundColor() {
        return this.f16855a0.l();
    }

    @m0
    public ColorStateList getCardForegroundColor() {
        return this.f16855a0.m();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @o0
    public Drawable getCheckedIcon() {
        return this.f16855a0.n();
    }

    @q
    public int getCheckedIconMargin() {
        return this.f16855a0.o();
    }

    @q
    public int getCheckedIconSize() {
        return this.f16855a0.p();
    }

    @o0
    public ColorStateList getCheckedIconTint() {
        return this.f16855a0.q();
    }

    public int getContentPaddingBottom() {
        return this.f16855a0.A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f16855a0.A().left;
    }

    public int getContentPaddingRight() {
        return this.f16855a0.A().right;
    }

    public int getContentPaddingTop() {
        return this.f16855a0.A().top;
    }

    @v(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f16855a0.u();
    }

    public float getRadius() {
        return this.f16855a0.s();
    }

    public ColorStateList getRippleColor() {
        return this.f16855a0.v();
    }

    @m0
    public o getShapeAppearanceModel() {
        return this.f16855a0.w();
    }

    @Deprecated
    @l
    public int getStrokeColor() {
        return this.f16855a0.x();
    }

    @o0
    public ColorStateList getStrokeColorStateList() {
        return this.f16855a0.y();
    }

    @q
    public int getStrokeWidth() {
        return this.f16855a0.z();
    }

    public void h(int i10, int i11, int i12, int i13) {
        this.f16855a0.U(i10, i11, i12, i13);
    }

    public boolean isChecked() {
        return this.f16857c0;
    }

    public final void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f16855a0.j();
        }
    }

    public boolean k() {
        n9.a aVar = this.f16855a0;
        return aVar != null && aVar.D();
    }

    public boolean l() {
        return this.f16858d0;
    }

    public void m(int i10, int i11, int i12, int i13) {
        super.h(i10, i11, i12, i13);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f16855a0.k());
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (k()) {
            View.mergeDrawableStates(onCreateDrawableState, f16849f0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16850g0);
        }
        if (l()) {
            View.mergeDrawableStates(onCreateDrawableState, f16851h0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@m0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f16854k0);
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f16854k0);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f16855a0.F(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f16856b0) {
            if (!this.f16855a0.C()) {
                this.f16855a0.G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(@l int i10) {
        this.f16855a0.H(ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(@o0 ColorStateList colorStateList) {
        this.f16855a0.H(colorStateList);
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        this.f16855a0.Z();
    }

    public void setCardForegroundColor(@o0 ColorStateList colorStateList) {
        this.f16855a0.I(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f16855a0.J(z10);
    }

    public void setChecked(boolean z10) {
        if (this.f16857c0 != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@o0 Drawable drawable) {
        this.f16855a0.K(drawable);
    }

    public void setCheckedIconMargin(@q int i10) {
        this.f16855a0.L(i10);
    }

    public void setCheckedIconMarginResource(@p int i10) {
        if (i10 != -1) {
            this.f16855a0.L(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconResource(@u int i10) {
        this.f16855a0.K(g.a.d(getContext(), i10));
    }

    public void setCheckedIconSize(@q int i10) {
        this.f16855a0.M(i10);
    }

    public void setCheckedIconSizeResource(@p int i10) {
        if (i10 != 0) {
            this.f16855a0.M(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCheckedIconTint(@o0 ColorStateList colorStateList) {
        this.f16855a0.N(colorStateList);
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        n9.a aVar = this.f16855a0;
        if (aVar != null) {
            aVar.X();
        }
    }

    public void setDragged(boolean z10) {
        if (this.f16858d0 != z10) {
            this.f16858d0 = z10;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f16855a0.b0();
    }

    public void setOnCheckedChangeListener(@o0 a aVar) {
        this.f16859e0 = aVar;
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f16855a0.b0();
        this.f16855a0.Y();
    }

    public void setProgress(@v(from = 0.0d, to = 1.0d) float f10) {
        this.f16855a0.P(f10);
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        this.f16855a0.O(f10);
    }

    public void setRippleColor(@o0 ColorStateList colorStateList) {
        this.f16855a0.Q(colorStateList);
    }

    public void setRippleColorResource(@n int i10) {
        this.f16855a0.Q(g.a.c(getContext(), i10));
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        setClipToOutline(oVar.u(getBoundsAsRectF()));
        this.f16855a0.R(oVar);
    }

    public void setStrokeColor(@l int i10) {
        this.f16855a0.S(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f16855a0.S(colorStateList);
    }

    public void setStrokeWidth(@q int i10) {
        this.f16855a0.T(i10);
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f16855a0.b0();
        this.f16855a0.Y();
    }

    public void toggle() {
        if (k() && isEnabled()) {
            this.f16857c0 = !this.f16857c0;
            refreshDrawableState();
            j();
            a aVar = this.f16859e0;
            if (aVar != null) {
                aVar.a(this, this.f16857c0);
            }
        }
    }
}

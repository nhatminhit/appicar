package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.y;
import androidx.customview.view.AbsSavedState;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.p;
import d.q;
import d.r0;
import d.t0;
import d.u;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.d;
import z9.k;
import z9.o;
import z9.s;

public class MaterialButton extends AppCompatButton implements Checkable, s {

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f16802g0 = {16842911};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f16803h0 = {16842912};

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16804i0 = 1;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f16805j0 = 2;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f16806k0 = 3;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16807l0 = 4;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f16808m0 = 16;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f16809n0 = 32;

    /* renamed from: o0  reason: collision with root package name */
    public static final String f16810o0 = "MaterialButton";

    /* renamed from: p0  reason: collision with root package name */
    public static final int f16811p0 = a.n.Widget_MaterialComponents_Button;
    @m0
    public final a Q;
    @m0
    public final LinkedHashSet<b> R;
    @o0
    public c S;
    @o0
    public PorterDuff.Mode T;
    @o0
    public ColorStateList U;
    @o0
    public Drawable V;
    @r0
    public int W;
    @r0

    /* renamed from: a0  reason: collision with root package name */
    public int f16812a0;
    @r0

    /* renamed from: b0  reason: collision with root package name */
    public int f16813b0;
    @r0

    /* renamed from: c0  reason: collision with root package name */
    public int f16814c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16815d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f16816e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f16817f0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @m0
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
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(@m0 Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.Q = z10;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q ? 1 : 0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface c {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(@d.m0 android.content.Context r9, @d.o0 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f16811p0
            android.content.Context r9 = ca.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.R = r9
            r9 = 0
            r8.f16815d0 = r9
            r8.f16816e0 = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = i9.a.o.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = i9.a.o.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f16814c0 = r1
            int r1 = i9.a.o.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.k(r1, r2)
            r8.T = r1
            android.content.Context r1 = r8.getContext()
            int r2 = i9.a.o.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = w9.c.a(r1, r0, r2)
            r8.U = r1
            android.content.Context r1 = r8.getContext()
            int r2 = i9.a.o.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = w9.c.d(r1, r0, r2)
            r8.V = r1
            int r1 = i9.a.o.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f16817f0 = r1
            int r1 = i9.a.o.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.W = r1
            z9.o$b r10 = z9.o.e(r7, r10, r11, r6)
            z9.o r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.Q = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f16814c0
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.V
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.k(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @m0
    private String getA11yClassName() {
        return (c() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public void a(@m0 b bVar) {
        this.R.add(bVar);
    }

    public void b() {
        this.R.clear();
    }

    public boolean c() {
        a aVar = this.Q;
        return aVar != null && aVar.p();
    }

    public final boolean d() {
        int i10 = this.f16817f0;
        return i10 == 3 || i10 == 4;
    }

    public final boolean e() {
        int i10 = this.f16817f0;
        return i10 == 1 || i10 == 2;
    }

    public final boolean f() {
        int i10 = this.f16817f0;
        return i10 == 16 || i10 == 32;
    }

    public final boolean g() {
        return w1.X(this) == 1;
    }

    @o0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @o0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @r0
    public int getCornerRadius() {
        if (h()) {
            return this.Q.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.V;
    }

    public int getIconGravity() {
        return this.f16817f0;
    }

    @r0
    public int getIconPadding() {
        return this.f16814c0;
    }

    @r0
    public int getIconSize() {
        return this.W;
    }

    public ColorStateList getIconTint() {
        return this.U;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.T;
    }

    @q
    public int getInsetBottom() {
        return this.Q.c();
    }

    @q
    public int getInsetTop() {
        return this.Q.d();
    }

    @o0
    public ColorStateList getRippleColor() {
        if (h()) {
            return this.Q.h();
        }
        return null;
    }

    @m0
    public o getShapeAppearanceModel() {
        if (h()) {
            return this.Q.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (h()) {
            return this.Q.j();
        }
        return null;
    }

    @r0
    public int getStrokeWidth() {
        if (h()) {
            return this.Q.k();
        }
        return 0;
    }

    @x0({x0.a.LIBRARY_GROUP})
    @o0
    public ColorStateList getSupportBackgroundTintList() {
        return h() ? this.Q.l() : super.getSupportBackgroundTintList();
    }

    @x0({x0.a.LIBRARY_GROUP})
    @o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return h() ? this.Q.m() : super.getSupportBackgroundTintMode();
    }

    public final boolean h() {
        a aVar = this.Q;
        return aVar != null && !aVar.o();
    }

    public void i(@m0 b bVar) {
        this.R.remove(bVar);
    }

    public boolean isChecked() {
        return this.f16815d0;
    }

    public final void j() {
        if (e()) {
            y.w(this, this.V, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (d()) {
            y.w(this, (Drawable) null, (Drawable) null, this.V, (Drawable) null);
        } else if (f()) {
            y.w(this, (Drawable) null, this.V, (Drawable) null, (Drawable) null);
        }
    }

    public final void k(boolean z10) {
        Drawable drawable = this.V;
        if (drawable != null) {
            Drawable mutate = d.r(drawable).mutate();
            this.V = mutate;
            d.o(mutate, this.U);
            PorterDuff.Mode mode = this.T;
            if (mode != null) {
                d.p(this.V, mode);
            }
            int i10 = this.W;
            if (i10 == 0) {
                i10 = this.V.getIntrinsicWidth();
            }
            int i11 = this.W;
            if (i11 == 0) {
                i11 = this.V.getIntrinsicHeight();
            }
            Drawable drawable2 = this.V;
            int i12 = this.f16812a0;
            int i13 = this.f16813b0;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
        }
        if (z10) {
            j();
            return;
        }
        Drawable[] h10 = y.h(this);
        boolean z11 = false;
        Drawable drawable3 = h10[0];
        Drawable drawable4 = h10[1];
        Drawable drawable5 = h10[2];
        if ((e() && drawable3 != this.V) || ((d() && drawable5 != this.V) || (f() && drawable4 != this.V))) {
            z11 = true;
        }
        if (z11) {
            j();
        }
    }

    public final void l(int i10, int i11) {
        if (this.V != null && getLayout() != null) {
            if (e() || d()) {
                this.f16813b0 = 0;
                int i12 = this.f16817f0;
                boolean z10 = true;
                if (i12 == 1 || i12 == 3) {
                    this.f16812a0 = 0;
                } else {
                    int i13 = this.W;
                    if (i13 == 0) {
                        i13 = this.V.getIntrinsicWidth();
                    }
                    int textWidth = (((((i10 - getTextWidth()) - w1.i0(this)) - i13) - this.f16814c0) - w1.j0(this)) / 2;
                    boolean g10 = g();
                    if (this.f16817f0 != 4) {
                        z10 = false;
                    }
                    if (g10 != z10) {
                        textWidth = -textWidth;
                    }
                    if (this.f16812a0 != textWidth) {
                        this.f16812a0 = textWidth;
                        k(false);
                        return;
                    }
                    return;
                }
            } else if (f()) {
                this.f16812a0 = 0;
                if (this.f16817f0 == 16) {
                    this.f16813b0 = 0;
                } else {
                    int i14 = this.W;
                    if (i14 == 0) {
                        i14 = this.V.getIntrinsicHeight();
                    }
                    int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.f16814c0) - getPaddingBottom()) / 2;
                    if (this.f16813b0 != textHeight) {
                        this.f16813b0 = textHeight;
                        k(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            k(false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (h()) {
            k.f(this, this.Q.f());
        }
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (c()) {
            View.mergeDrawableStates(onCreateDrawableState, f16802g0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16803h0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@m0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void onRestoreInstanceState(@o0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.Q);
    }

    @m0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = this.f16815d0;
        return savedState;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        l(i10, i11);
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        l(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(@m0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(@l int i10) {
        if (h()) {
            this.Q.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(@m0 Drawable drawable) {
        if (h()) {
            if (drawable != getBackground()) {
                this.Q.s();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(@u int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    public void setBackgroundTintList(@o0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (h()) {
            this.Q.t(z10);
        }
    }

    public void setChecked(boolean z10) {
        if (c() && isEnabled() && this.f16815d0 != z10) {
            this.f16815d0 = z10;
            refreshDrawableState();
            if (!this.f16816e0) {
                this.f16816e0 = true;
                Iterator<b> it = this.R.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f16815d0);
                }
                this.f16816e0 = false;
            }
        }
    }

    public void setCornerRadius(@r0 int i10) {
        if (h()) {
            this.Q.u(i10);
        }
    }

    public void setCornerRadiusResource(@p int i10) {
        if (h()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (h()) {
            this.Q.f().m0(f10);
        }
    }

    public void setIcon(@o0 Drawable drawable) {
        if (this.V != drawable) {
            this.V = drawable;
            k(true);
            l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f16817f0 != i10) {
            this.f16817f0 = i10;
            l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@r0 int i10) {
        if (this.f16814c0 != i10) {
            this.f16814c0 = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@u int i10) {
        setIcon(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    public void setIconSize(@r0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.W != i10) {
            this.W = i10;
            k(true);
        }
    }

    public void setIconTint(@o0 ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            k(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.T != mode) {
            this.T = mode;
            k(false);
        }
    }

    public void setIconTintResource(@n int i10) {
        setIconTint(g.a.c(getContext(), i10));
    }

    public void setInsetBottom(@q int i10) {
        this.Q.v(i10);
    }

    public void setInsetTop(@q int i10) {
        this.Q.w(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@o0 c cVar) {
        this.S = cVar;
    }

    public void setPressed(boolean z10) {
        c cVar = this.S;
        if (cVar != null) {
            cVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(@o0 ColorStateList colorStateList) {
        if (h()) {
            this.Q.x(colorStateList);
        }
    }

    public void setRippleColorResource(@n int i10) {
        if (h()) {
            setRippleColor(g.a.c(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        if (h()) {
            this.Q.y(oVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (h()) {
            this.Q.z(z10);
        }
    }

    public void setStrokeColor(@o0 ColorStateList colorStateList) {
        if (h()) {
            this.Q.A(colorStateList);
        }
    }

    public void setStrokeColorResource(@n int i10) {
        if (h()) {
            setStrokeColor(g.a.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(@r0 int i10) {
        if (h()) {
            this.Q.B(i10);
        }
    }

    public void setStrokeWidthResource(@p int i10) {
        if (h()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@o0 ColorStateList colorStateList) {
        if (h()) {
            this.Q.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        if (h()) {
            this.Q.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f16815d0);
    }
}

package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.a;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import d.a1;
import d.b1;
import d.i;
import d.m0;
import d.o0;
import d.p;
import d.q;
import d.r0;
import d.t0;
import d.u;
import f1.w1;
import g1.z;
import h0.u0;
import i9.a;
import j9.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import w9.d;
import w9.f;
import z9.k;
import z9.o;
import z9.s;

public class Chip extends AppCompatCheckBox implements a.C0275a, s {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f16860k0 = "Chip";

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16861l0 = a.n.Widget_MaterialComponents_Chip_Action;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f16862m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f16863n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public static final Rect f16864o0 = new Rect();

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f16865p0 = {16842913};

    /* renamed from: q0  reason: collision with root package name */
    public static final int[] f16866q0 = {16842911};

    /* renamed from: r0  reason: collision with root package name */
    public static final String f16867r0 = "http://schemas.android.com/apk/res/android";

    /* renamed from: s0  reason: collision with root package name */
    public static final int f16868s0 = 48;

    /* renamed from: t0  reason: collision with root package name */
    public static final String f16869t0 = "android.widget.Button";

    /* renamed from: u0  reason: collision with root package name */
    public static final String f16870u0 = "android.widget.CompoundButton";

    /* renamed from: v0  reason: collision with root package name */
    public static final String f16871v0 = "android.view.View";
    @o0
    public a R;
    @o0
    public InsetDrawable S;
    @o0
    public RippleDrawable T;
    @o0
    public View.OnClickListener U;
    @o0
    public CompoundButton.OnCheckedChangeListener V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f16872a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f16873b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16874c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16875d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f16876e0;
    @q(unit = 1)

    /* renamed from: f0  reason: collision with root package name */
    public int f16877f0;
    @m0

    /* renamed from: g0  reason: collision with root package name */
    public final c f16878g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f16879h0;

    /* renamed from: i0  reason: collision with root package name */
    public final RectF f16880i0;

    /* renamed from: j0  reason: collision with root package name */
    public final f f16881j0;

    public class a extends f {
        public a() {
        }

        public void a(int i10) {
        }

        public void b(@m0 Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.R.H3() ? Chip.this.R.O1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @TargetApi(21)
        public void getOutline(View view, @m0 Outline outline) {
            if (Chip.this.R != null) {
                Chip.this.R.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends m1.a {
        public c(Chip chip) {
            super(chip);
        }

        public int C(float f10, float f11) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        public void D(@m0 List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.x() && Chip.this.U != null) {
                list.add(1);
            }
        }

        public boolean N(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.y();
            }
            return false;
        }

        public void Q(@m0 z zVar) {
            zVar.S0(Chip.this.r());
            zVar.V0(Chip.this.isClickable());
            zVar.U0((Chip.this.r() || Chip.this.isClickable()) ? Chip.this.r() ? Chip.f16870u0 : Chip.f16869t0 : "android.view.View");
            zVar.J1(Chip.this.getText());
        }

        public void R(int i10, @m0 z zVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = a.m.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i11, objArr).trim();
                }
                zVar.Y0(closeIconContentDescription);
                zVar.P0(Chip.this.getCloseIconTouchBoundsInt());
                zVar.b(z.a.f7603j);
                zVar.e1(Chip.this.isEnabled());
                return;
            }
            zVar.Y0(charSequence);
            zVar.P0(Chip.f16864o0);
        }

        public void S(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f16874c0 = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.chipStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f16861l0
            android.content.Context r7 = ca.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f16879h0 = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f16880i0 = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f16881j0 = r7
            android.content.Context r0 = r6.getContext()
            r6.H(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.Z0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = f1.w1.P(r6)
            r7.m0(r1)
            int[] r2 = i9.a.o.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = i9.a.o.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f16878g0 = r8
            r6.C()
            if (r9 != 0) goto L_0x0059
            r6.p()
        L_0x0059:
            boolean r8 = r6.W
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.O1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.H1()
            r6.setEllipsize(r7)
            r6.G()
            com.google.android.material.chip.a r7 = r6.R
            boolean r7 = r7.H3()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.F()
            boolean r7 = r6.A()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f16877f0
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = f1.w1.X(r6)
            r6.f16876e0 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: private */
    @m0
    public RectF getCloseIconTouchBounds() {
        this.f16880i0.setEmpty();
        if (n() && this.U != null) {
            this.R.E1(this.f16880i0);
        }
        return this.f16880i0;
    }

    /* access modifiers changed from: private */
    @m0
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16879h0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16879h0;
    }

    @o0
    private d getTextAppearance() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.P1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f16873b0 != z10) {
            this.f16873b0 = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f16872a0 != z10) {
            this.f16872a0 = z10;
            refreshDrawableState();
        }
    }

    public boolean A() {
        return this.f16875d0;
    }

    public final void B(@o0 a aVar) {
        if (aVar != null) {
            aVar.j3((a.C0275a) null);
        }
    }

    public final void C() {
        w1.z1(this, (!n() || !x() || this.U == null) ? null : this.f16878g0);
    }

    public final void D() {
        if (x9.b.f24357a) {
            E();
            return;
        }
        this.R.G3(true);
        w1.G1(this, getBackgroundDrawable());
        F();
        l();
    }

    public final void E() {
        this.T = new RippleDrawable(x9.b.d(this.R.M1()), getBackgroundDrawable(), (Drawable) null);
        this.R.G3(false);
        w1.G1(this, this.T);
        F();
    }

    public final void F() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.R) != null) {
            int o12 = (int) (aVar.o1() + this.R.Q1() + this.R.U0());
            int t12 = (int) (this.R.t1() + this.R.R1() + this.R.Q0());
            if (this.S != null) {
                Rect rect = new Rect();
                this.S.getPadding(rect);
                t12 += rect.left;
                o12 += rect.right;
            }
            w1.b2(this, t12, getPaddingTop(), o12, getPaddingBottom());
        }
    }

    public final void G() {
        TextPaint paint = getPaint();
        a aVar = this.R;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.j(getContext(), paint, this.f16881j0);
        }
    }

    public final void H(@o0 AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", u0.q.C);
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", u0.q.I, 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
    }

    public void a() {
        k(this.f16877f0);
        requestLayout();
        invalidateOutline();
    }

    public boolean dispatchHoverEvent(@m0 MotionEvent motionEvent) {
        return m(motionEvent) || this.f16878g0.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16878g0.w(keyEvent) || this.f16878g0.B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.R;
        if ((aVar == null || !aVar.b2()) ? false : this.R.e3(j())) {
            invalidate();
        }
    }

    @o0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.S;
        return insetDrawable == null ? this.R : insetDrawable;
    }

    @o0
    public Drawable getCheckedIcon() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    @o0
    public ColorStateList getCheckedIconTint() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    @o0
    public ColorStateList getChipBackgroundColor() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.R;
        if (aVar != null) {
            return Math.max(0.0f, aVar.n1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.R;
    }

    public float getChipEndPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.o1();
        }
        return 0.0f;
    }

    @o0
    public Drawable getChipIcon() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.q1();
        }
        return 0.0f;
    }

    @o0
    public ColorStateList getChipIconTint() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.r1();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.s1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    @o0
    public ColorStateList getChipStrokeColor() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.u1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @o0
    public Drawable getCloseIcon() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.x1();
        }
        return null;
    }

    @o0
    public CharSequence getCloseIconContentDescription() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.y1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.z1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.A1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    @o0
    public ColorStateList getCloseIconTint() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.D1();
        }
        return null;
    }

    @o0
    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.H1();
        }
        return null;
    }

    public void getFocusedRect(@m0 Rect rect) {
        if (this.f16878g0.B() == 1 || this.f16878g0.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @o0
    public h getHideMotionSpec() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.I1();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.J1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.K1();
        }
        return 0.0f;
    }

    @o0
    public ColorStateList getRippleColor() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.M1();
        }
        return null;
    }

    @m0
    public o getShapeAppearanceModel() {
        return this.R.getShapeAppearanceModel();
    }

    @o0
    public h getShowMotionSpec() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.N1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.Q1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.R;
        if (aVar != null) {
            return aVar.R1();
        }
        return 0.0f;
    }

    public final void i(@m0 a aVar) {
        aVar.j3(this);
    }

    @m0
    public final int[] j() {
        int isEnabled = isEnabled();
        if (this.f16874c0) {
            isEnabled++;
        }
        if (this.f16873b0) {
            isEnabled++;
        }
        if (this.f16872a0) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f16874c0) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f16873b0) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f16872a0) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    public boolean k(@q int i10) {
        this.f16877f0 = i10;
        int i11 = 0;
        if (!A()) {
            if (this.S != null) {
                z();
            } else {
                D();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.R.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.R.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i12 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i11 = max / 2;
            }
            if (this.S != null) {
                Rect rect = new Rect();
                this.S.getPadding(rect);
                if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                    D();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            q(i12, i11, i12, i11);
            D();
            return true;
        }
        if (this.S != null) {
            z();
        } else {
            D();
        }
        return false;
    }

    public final void l() {
        if (getBackgroundDrawable() == this.S && this.R.getCallback() == null) {
            this.R.setCallback(this.S);
        }
    }

    @SuppressLint({"PrivateApi"})
    public final boolean m(@m0 MotionEvent motionEvent) {
        Class<m1.a> cls = m1.a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f16878g0)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("Z", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f16878g0, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public final boolean n() {
        a aVar = this.R;
        return (aVar == null || aVar.x1() == null) ? false : true;
    }

    public final void o(Context context, @o0 AttributeSet attributeSet, int i10) {
        TypedArray j10 = n.j(context, attributeSet, a.o.Chip, i10, f16861l0, new int[0]);
        this.f16875d0 = j10.getBoolean(a.o.Chip_ensureMinTouchTargetSize, false);
        this.f16877f0 = (int) Math.ceil((double) j10.getDimension(a.o.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) v.e(getContext(), 48))));
        j10.recycle();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.R);
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16865p0);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f16866q0);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f16878g0.M(z10, i10, rect);
    }

    public boolean onHoverEvent(@m0 MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z10 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z10 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z10);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((r() || isClickable()) ? r() ? f16870u0 : f16869t0 : "android.view.View");
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            z.V1(accessibilityNodeInfo).X0(z.c.h(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @o0
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@m0 MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f16876e0 != i10) {
            this.f16876e0 = i10;
            F();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@d.m0 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f16872a0
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f16872a0
            if (r0 == 0) goto L_0x0034
            r5.y()
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.S = new InsetDrawable(this.R, i10, i11, i12, i13);
    }

    public boolean r() {
        a aVar = this.R;
        return aVar != null && aVar.V1();
    }

    @Deprecated
    public boolean s() {
        return t();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.T) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i10) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.T) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
    }

    public void setBackgroundTintList(@o0 ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(@o0 PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.k2(z10);
        }
    }

    public void setCheckableResource(@d.h int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.l2(i10);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.R;
        if (aVar == null) {
            this.W = z10;
        } else if (aVar.V1()) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (onCheckedChangeListener = this.V) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z10);
            }
        }
    }

    public void setCheckedIcon(@o0 Drawable drawable) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.m2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@d.h int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@u int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setCheckedIconTint(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setCheckedIconVisible(@d.h int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.t2(z10);
        }
    }

    public void setChipBackgroundColor(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.u2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.v2(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.w2(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    public void setChipDrawable(@m0 a aVar) {
        a aVar2 = this.R;
        if (aVar2 != aVar) {
            B(aVar2);
            this.R = aVar;
            aVar.u3(false);
            i(this.R);
            k(this.f16877f0);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.y2(f10);
        }
    }

    public void setChipEndPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.z2(i10);
        }
    }

    public void setChipIcon(@o0 Drawable drawable) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.A2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@d.h int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@u int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.D2(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.E2(f10);
        }
    }

    public void setChipIconSizeResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.F2(i10);
        }
    }

    public void setChipIconTint(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.G2(colorStateList);
        }
    }

    public void setChipIconTintResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.H2(i10);
        }
    }

    public void setChipIconVisible(@d.h int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.I2(i10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.J2(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.K2(f10);
        }
    }

    public void setChipMinHeightResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.M2(f10);
        }
    }

    public void setChipStartPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.N2(i10);
        }
    }

    public void setChipStrokeColor(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.O2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.P2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.Q2(f10);
        }
    }

    public void setChipStrokeWidthResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.R2(i10);
        }
    }

    @Deprecated
    public void setChipText(@o0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@a1 int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@o0 Drawable drawable) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.T2(drawable);
        }
        C();
    }

    public void setCloseIconContentDescription(@o0 CharSequence charSequence) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.U2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@d.h int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.X2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.Y2(i10);
        }
    }

    public void setCloseIconResource(@u int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.Z2(i10);
        }
        C();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a3(f10);
        }
    }

    public void setCloseIconSizeResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.b3(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.c3(f10);
        }
    }

    public void setCloseIconStartPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.d3(i10);
        }
    }

    public void setCloseIconTint(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.f3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.g3(i10);
        }
    }

    public void setCloseIconVisible(@d.h int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.i3(z10);
        }
        C();
    }

    public void setCompoundDrawables(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.R;
        if (aVar != null) {
            aVar.m0(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.R != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.R;
                if (aVar != null) {
                    aVar.k3(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f16875d0 = z10;
        k(this.f16877f0);
    }

    public void setGravity(int i10) {
        if (i10 == 8388627) {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@o0 h hVar) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.l3(hVar);
        }
    }

    public void setHideMotionSpecResource(@d.b int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.m3(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.n3(f10);
        }
    }

    public void setIconEndPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.o3(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.p3(f10);
        }
    }

    public void setIconStartPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.q3(i10);
        }
    }

    public void setLayoutDirection(int i10) {
        if (this.R != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@r0 int i10) {
        super.setMaxWidth(i10);
        a aVar = this.R;
        if (aVar != null) {
            aVar.r3(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.V = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.U = onClickListener;
        C();
    }

    public void setRippleColor(@o0 ColorStateList colorStateList) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.s3(colorStateList);
        }
        if (!this.R.T1()) {
            E();
        }
    }

    public void setRippleColorResource(@d.n int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.t3(i10);
            if (!this.R.T1()) {
                E();
            }
        }
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        this.R.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@o0 h hVar) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.v3(hVar);
        }
    }

    public void setShowMotionSpecResource(@d.b int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.w3(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.R;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.H3() ? null : charSequence, bufferType);
            a aVar2 = this.R;
            if (aVar2 != null) {
                aVar2.x3(charSequence);
            }
        }
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.R;
        if (aVar != null) {
            aVar.z3(i10);
        }
        G();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.R;
        if (aVar != null) {
            aVar.z3(i10);
        }
        G();
    }

    public void setTextAppearance(@o0 d dVar) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.y3(dVar);
        }
        G();
    }

    public void setTextAppearanceResource(@b1 int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.A3(f10);
        }
    }

    public void setTextEndPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.B3(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.E3(f10);
        }
    }

    public void setTextStartPaddingResource(@p int i10) {
        a aVar = this.R;
        if (aVar != null) {
            aVar.F3(i10);
        }
    }

    public boolean t() {
        a aVar = this.R;
        return aVar != null && aVar.X1();
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        a aVar = this.R;
        return aVar != null && aVar.Z1();
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        a aVar = this.R;
        return aVar != null && aVar.c2();
    }

    @i
    public boolean y() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.U;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        this.f16878g0.Y(1, 1);
        return z10;
    }

    public final void z() {
        if (this.S != null) {
            this.S = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            D();
        }
    }
}

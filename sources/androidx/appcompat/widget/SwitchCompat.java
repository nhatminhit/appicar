package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import f.a;
import f1.w1;
import o0.d;
import p7.f;

public class SwitchCompat extends CompoundButton {
    public static final int E0 = 250;
    public static final int F0 = 0;
    public static final int G0 = 1;
    public static final int H0 = 2;
    public static final String I0 = "android.widget.Switch";
    public static final int J0 = 1;
    public static final int K0 = 2;
    public static final int L0 = 3;
    public static final Property<SwitchCompat, Float> M0 = new a(Float.class, "thumbPos");
    public static final int[] N0 = {16842912};
    public TransformationMethod A0;
    public ObjectAnimator B0;
    public final u C0;
    public final Rect D0;
    public Drawable O;
    public ColorStateList P;
    public PorterDuff.Mode Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public PorterDuff.Mode V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1162a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1163b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1164c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1165d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1166e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f1167f0;

    /* renamed from: g0  reason: collision with root package name */
    public CharSequence f1168g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1169h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1170i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1171j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f1172k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f1173l0;

    /* renamed from: m0  reason: collision with root package name */
    public VelocityTracker f1174m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f1175n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f1176o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f1177p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1178q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f1179r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1180s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1181t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1182u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f1183v0;

    /* renamed from: w0  reason: collision with root package name */
    public final TextPaint f1184w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f1185x0;

    /* renamed from: y0  reason: collision with root package name */
    public Layout f1186y0;

    /* renamed from: z0  reason: collision with root package name */
    public Layout f1187z0;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1176o0);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public SwitchCompat(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwitchCompat(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.switchStyle);
    }

    public SwitchCompat(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P = null;
        this.Q = null;
        this.R = false;
        this.S = false;
        this.U = null;
        this.V = null;
        this.W = false;
        this.f1162a0 = false;
        this.f1174m0 = VelocityTracker.obtain();
        this.D0 = new Rect();
        r0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1184w0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = a.n.SwitchCompat;
        w0 G = w0.G(context, attributeSet, iArr, i10, 0);
        w1.x1(this, context, iArr, attributeSet, G.B(), i10, 0);
        Drawable h10 = G.h(a.n.SwitchCompat_android_thumb);
        this.O = h10;
        if (h10 != null) {
            h10.setCallback(this);
        }
        Drawable h11 = G.h(a.n.SwitchCompat_track);
        this.T = h11;
        if (h11 != null) {
            h11.setCallback(this);
        }
        this.f1167f0 = G.x(a.n.SwitchCompat_android_textOn);
        this.f1168g0 = G.x(a.n.SwitchCompat_android_textOff);
        this.f1169h0 = G.a(a.n.SwitchCompat_showText, true);
        this.f1163b0 = G.g(a.n.SwitchCompat_thumbTextPadding, 0);
        this.f1164c0 = G.g(a.n.SwitchCompat_switchMinWidth, 0);
        this.f1165d0 = G.g(a.n.SwitchCompat_switchPadding, 0);
        this.f1166e0 = G.a(a.n.SwitchCompat_splitTrack, false);
        ColorStateList d10 = G.d(a.n.SwitchCompat_thumbTint);
        if (d10 != null) {
            this.P = d10;
            this.R = true;
        }
        PorterDuff.Mode e10 = b0.e(G.o(a.n.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.Q != e10) {
            this.Q = e10;
            this.S = true;
        }
        if (this.R || this.S) {
            b();
        }
        ColorStateList d11 = G.d(a.n.SwitchCompat_trackTint);
        if (d11 != null) {
            this.U = d11;
            this.W = true;
        }
        PorterDuff.Mode e11 = b0.e(G.o(a.n.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.V != e11) {
            this.V = e11;
            this.f1162a0 = true;
        }
        if (this.W || this.f1162a0) {
            c();
        }
        int u10 = G.u(a.n.SwitchCompat_switchTextAppearance, 0);
        if (u10 != 0) {
            k(context, u10);
        }
        u uVar = new u(this);
        this.C0 = uVar;
        uVar.m(attributeSet, i10);
        G.I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1171j0 = viewConfiguration.getScaledTouchSlop();
        this.f1175n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private boolean getTargetCheckedState() {
        return this.f1176o0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((d1.b(this) ? 1.0f - this.f1176o0 : this.f1176o0) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.T;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.D0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.O;
        Rect d10 = drawable2 != null ? b0.d(drawable2) : b0.f1229d;
        return ((((this.f1177p0 - this.f1179r0) - rect.left) - rect.right) - d10.left) - d10.right;
    }

    public final void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, M0, new float[]{z10 ? 1.0f : 0.0f});
        this.B0 = ofFloat;
        ofFloat.setDuration(250);
        this.B0.setAutoCancel(true);
        this.B0.start();
    }

    public final void b() {
        Drawable drawable = this.O;
        if (drawable == null) {
            return;
        }
        if (this.R || this.S) {
            Drawable mutate = d.r(drawable).mutate();
            this.O = mutate;
            if (this.R) {
                d.o(mutate, this.P);
            }
            if (this.S) {
                d.p(this.O, this.Q);
            }
            if (this.O.isStateful()) {
                this.O.setState(getDrawableState());
            }
        }
    }

    public final void c() {
        Drawable drawable = this.T;
        if (drawable == null) {
            return;
        }
        if (this.W || this.f1162a0) {
            Drawable mutate = d.r(drawable).mutate();
            this.T = mutate;
            if (this.W) {
                d.o(mutate, this.U);
            }
            if (this.f1162a0) {
                d.p(this.T, this.V);
            }
            if (this.T.isStateful()) {
                this.T.setState(getDrawableState());
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.B0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.D0;
        int i12 = this.f1180s0;
        int i13 = this.f1181t0;
        int i14 = this.f1182u0;
        int i15 = this.f1183v0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.O;
        Rect d10 = drawable != null ? b0.d(drawable) : b0.f1229d;
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.T.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.T.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.O;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f1179r0 + rect.right;
            this.O.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                d.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.O;
        if (drawable != null) {
            d.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            d.k(drawable2, f10, f11);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.O;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final boolean g(float f10, float f11) {
        if (this.O == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.O.getPadding(this.D0);
        int i10 = this.f1181t0;
        int i11 = this.f1171j0;
        int i12 = i10 - i11;
        int i13 = (this.f1180s0 + thumbOffset) - i11;
        Rect rect = this.D0;
        return f10 > ((float) i13) && f10 < ((float) ((((this.f1179r0 + i13) + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f1183v0 + i11));
    }

    public int getCompoundPaddingLeft() {
        if (!d1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1177p0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1165d0 : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (d1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1177p0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1165d0 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1169h0;
    }

    public boolean getSplitTrack() {
        return this.f1166e0;
    }

    public int getSwitchMinWidth() {
        return this.f1164c0;
    }

    public int getSwitchPadding() {
        return this.f1165d0;
    }

    public CharSequence getTextOff() {
        return this.f1168g0;
    }

    public CharSequence getTextOn() {
        return this.f1167f0;
    }

    public Drawable getThumbDrawable() {
        return this.O;
    }

    public int getThumbTextPadding() {
        return this.f1163b0;
    }

    @o0
    public ColorStateList getThumbTintList() {
        return this.P;
    }

    @o0
    public PorterDuff.Mode getThumbTintMode() {
        return this.Q;
    }

    public Drawable getTrackDrawable() {
        return this.T;
    }

    @o0
    public ColorStateList getTrackTintList() {
        return this.U;
    }

    @o0
    public PorterDuff.Mode getTrackTintMode() {
        return this.V;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.A0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1184w0;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1168g0;
            if (charSequence == null) {
                charSequence = getResources().getString(a.l.abc_capital_off);
            }
            w1.o2(this, charSequence);
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f1167f0;
            if (charSequence == null) {
                charSequence = getResources().getString(a.l.abc_capital_on);
            }
            w1.o2(this, charSequence);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.B0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.B0.end();
            this.B0 = null;
        }
    }

    public void k(Context context, int i10) {
        w0 E = w0.E(context, i10, a.n.TextAppearance);
        ColorStateList d10 = E.d(a.n.TextAppearance_android_textColor);
        if (d10 == null) {
            d10 = getTextColors();
        }
        this.f1185x0 = d10;
        int g10 = E.g(a.n.TextAppearance_android_textSize, 0);
        if (g10 != 0) {
            float f10 = (float) g10;
            if (f10 != this.f1184w0.getTextSize()) {
                this.f1184w0.setTextSize(f10);
                requestLayout();
            }
        }
        m(E.o(a.n.TextAppearance_android_typeface, -1), E.o(a.n.TextAppearance_android_textStyle, -1));
        this.A0 = E.a(a.n.TextAppearance_textAllCaps, false) ? new j.a(getContext()) : null;
        E.I();
    }

    public void l(Typeface typeface, int i10) {
        float f10 = 0.0f;
        boolean z10 = false;
        if (i10 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(defaultFromStyle);
            int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
            TextPaint textPaint = this.f1184w0;
            if ((i11 & 1) != 0) {
                z10 = true;
            }
            textPaint.setFakeBoldText(z10);
            TextPaint textPaint2 = this.f1184w0;
            if ((i11 & 2) != 0) {
                f10 = -0.25f;
            }
            textPaint2.setTextSkewX(f10);
            return;
        }
        this.f1184w0.setFakeBoldText(false);
        this.f1184w0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public final void m(int i10, int i11) {
        l(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    public final void n(MotionEvent motionEvent) {
        this.f1170i0 = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.f1174m0.computeCurrentVelocity(1000);
            float xVelocity = this.f1174m0.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1175n0)) {
                z10 = getTargetCheckedState();
            } else if (!d1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, N0);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        Rect rect = this.D0;
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f1181t0;
        int i12 = this.f1183v0;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.O;
        if (drawable != null) {
            if (!this.f1166e0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = b0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1186y0 : this.f1187z0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1185x0;
            if (colorStateList != null) {
                this.f1184w0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1184w0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i10 = bounds.left + bounds.right;
            } else {
                i10 = getWidth();
            }
            canvas.translate((float) ((i10 / 2) - (layout.getWidth() / 2)), (float) (((i13 + i14) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(I0);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(I0);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1167f0 : this.f1168g0;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(f.f11698i);
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        super.onLayout(z10, i10, i11, i12, i13);
        int i20 = 0;
        if (this.O != null) {
            Rect rect = this.D0;
            Drawable drawable = this.T;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = b0.d(this.O);
            i14 = Math.max(0, d10.left - rect.left);
            i20 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (d1.b(this)) {
            i16 = getPaddingLeft() + i14;
            i15 = ((this.f1177p0 + i16) - i14) - i20;
        } else {
            i15 = (getWidth() - getPaddingRight()) - i20;
            i16 = (i15 - this.f1177p0) + i14 + i20;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i19 = this.f1178q0;
            i18 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i19 / 2);
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i19 = this.f1178q0;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.f1178q0;
            this.f1180s0 = i16;
            this.f1181t0 = i18;
            this.f1183v0 = i17;
            this.f1182u0 = i15;
        }
        i17 = i19 + i18;
        this.f1180s0 = i16;
        this.f1181t0 = i18;
        this.f1183v0 = i17;
        this.f1182u0 = i15;
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1169h0) {
            if (this.f1186y0 == null) {
                this.f1186y0 = h(this.f1167f0);
            }
            if (this.f1187z0 == null) {
                this.f1187z0 = h(this.f1168g0);
            }
        }
        Rect rect = this.D0;
        Drawable drawable = this.O;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.O.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.O.getIntrinsicHeight();
        } else {
            i13 = 0;
            i12 = 0;
        }
        this.f1179r0 = Math.max(this.f1169h0 ? Math.max(this.f1186y0.getWidth(), this.f1187z0.getWidth()) + (this.f1163b0 * 2) : 0, i13);
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.T.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.O;
        if (drawable3 != null) {
            Rect d10 = b0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = Math.max(this.f1164c0, (this.f1179r0 * 2) + i15 + i16);
        int max2 = Math.max(i14, i12);
        this.f1177p0 = max;
        this.f1178q0 = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1167f0 : this.f1168g0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1174m0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f1170i0
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1172k0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.d1.b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f1176o0
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f1176o0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f1172k0 = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1172k0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1171j0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f1173l0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1171j0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f1170i0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1172k0 = r0
            r6.f1173l0 = r3
            return r1
        L_0x0089:
            int r0 = r6.f1170i0
            if (r0 != r2) goto L_0x0094
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f1170i0 = r0
            android.view.VelocityTracker r0 = r6.f1174m0
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f1170i0 = r1
            r6.f1172k0 = r0
            r6.f1173l0 = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() == null || !w1.T0(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y.H(this, callback));
    }

    public void setShowText(boolean z10) {
        if (this.f1169h0 != z10) {
            this.f1169h0 = z10;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1166e0 = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1164c0 = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1165d0 = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1184w0.getTypeface() != null && !this.f1184w0.getTypeface().equals(typeface)) || (this.f1184w0.getTypeface() == null && typeface != null)) {
            this.f1184w0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1168g0 = charSequence;
        requestLayout();
        if (!isChecked()) {
            i();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1167f0 = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1176o0 = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(g.a.d(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1163b0 = i10;
        requestLayout();
    }

    public void setThumbTintList(@o0 ColorStateList colorStateList) {
        this.P = colorStateList;
        this.R = true;
        b();
    }

    public void setThumbTintMode(@o0 PorterDuff.Mode mode) {
        this.Q = mode;
        this.S = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.T = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(g.a.d(getContext(), i10));
    }

    public void setTrackTintList(@o0 ColorStateList colorStateList) {
        this.U = colorStateList;
        this.W = true;
        c();
    }

    public void setTrackTintMode(@o0 PorterDuff.Mode mode) {
        this.V = mode;
        this.f1162a0 = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.O || drawable == this.T;
    }
}

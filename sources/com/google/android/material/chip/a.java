package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.k;
import com.google.android.material.internal.v;
import d.a1;
import d.b1;
import d.f;
import d.i1;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.q;
import d.r0;
import d.u;
import i9.a;
import j9.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n0.f0;
import o0.d;
import o0.p;
import x9.b;
import z9.j;

public class a extends j implements p, Drawable.Callback, k.b {
    public static final boolean B1 = false;
    public static final int[] C1 = {16842910};
    public static final String D1 = "http://schemas.android.com/apk/res-auto";
    public static final int E1 = 24;
    public static final ShapeDrawable F1 = new ShapeDrawable(new OvalShape());
    @o0
    public Drawable A0;
    public boolean A1;
    @o0
    public ColorStateList B0;
    public float C0;
    public boolean D0;
    public boolean E0;
    @o0
    public Drawable F0;
    @o0
    public Drawable G0;
    @o0
    public ColorStateList H0;
    public float I0;
    @o0
    public CharSequence J0;
    public boolean K0;
    public boolean L0;
    @o0
    public Drawable M0;
    @o0
    public ColorStateList N0;
    @o0
    public h O0;
    @o0
    public h P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;
    @m0
    public final Context Y0;
    public final Paint Z0 = new Paint(1);
    @o0

    /* renamed from: a1  reason: collision with root package name */
    public final Paint f16891a1;

    /* renamed from: b1  reason: collision with root package name */
    public final Paint.FontMetrics f16892b1 = new Paint.FontMetrics();

    /* renamed from: c1  reason: collision with root package name */
    public final RectF f16893c1 = new RectF();

    /* renamed from: d1  reason: collision with root package name */
    public final PointF f16894d1 = new PointF();

    /* renamed from: e1  reason: collision with root package name */
    public final Path f16895e1 = new Path();
    @m0

    /* renamed from: f1  reason: collision with root package name */
    public final k f16896f1;
    @l

    /* renamed from: g1  reason: collision with root package name */
    public int f16897g1;
    @l

    /* renamed from: h1  reason: collision with root package name */
    public int f16898h1;
    @l

    /* renamed from: i1  reason: collision with root package name */
    public int f16899i1;
    @l

    /* renamed from: j1  reason: collision with root package name */
    public int f16900j1;
    @l

    /* renamed from: k1  reason: collision with root package name */
    public int f16901k1;
    @l

    /* renamed from: l1  reason: collision with root package name */
    public int f16902l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f16903m1;
    @l

    /* renamed from: n1  reason: collision with root package name */
    public int f16904n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f16905o1 = 255;
    @o0

    /* renamed from: p1  reason: collision with root package name */
    public ColorFilter f16906p1;
    @o0

    /* renamed from: q1  reason: collision with root package name */
    public PorterDuffColorFilter f16907q1;
    @o0

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f16908r0;
    @o0

    /* renamed from: r1  reason: collision with root package name */
    public ColorStateList f16909r1;
    @o0

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f16910s0;
    @o0

    /* renamed from: s1  reason: collision with root package name */
    public PorterDuff.Mode f16911s1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: t0  reason: collision with root package name */
    public float f16912t0;

    /* renamed from: t1  reason: collision with root package name */
    public int[] f16913t1;

    /* renamed from: u0  reason: collision with root package name */
    public float f16914u0 = -1.0f;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f16915u1;
    @o0

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f16916v0;
    @o0

    /* renamed from: v1  reason: collision with root package name */
    public ColorStateList f16917v1;

    /* renamed from: w0  reason: collision with root package name */
    public float f16918w0;
    @m0

    /* renamed from: w1  reason: collision with root package name */
    public WeakReference<C0275a> f16919w1 = new WeakReference<>((Object) null);
    @o0

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f16920x0;

    /* renamed from: x1  reason: collision with root package name */
    public TextUtils.TruncateAt f16921x1;
    @o0

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f16922y0;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f16923y1;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f16924z0;

    /* renamed from: z1  reason: collision with root package name */
    public int f16925z1;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0275a {
        void a();
    }

    public a(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        super(context, attributeSet, i10, i11);
        Y(context);
        this.Y0 = context;
        k kVar = new k(this);
        this.f16896f1 = kVar;
        this.f16922y0 = "";
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f16891a1 = null;
        int[] iArr = C1;
        setState(iArr);
        e3(iArr);
        this.f16923y1 = true;
        if (b.f24357a) {
            F1.setTint(-1);
        }
    }

    public static boolean U1(@o0 int[] iArr, @f int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @m0
    public static a Z0(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.h2(attributeSet, i10, i11);
        return aVar;
    }

    @m0
    public static a a1(@m0 Context context, @i1 int i10) {
        AttributeSet a10 = q9.a.a(context, i10, "chip");
        int styleAttribute = a10.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = a.n.Widget_MaterialComponents_Chip_Entry;
        }
        return Z0(context, a10, a.c.chipStandaloneStyle, styleAttribute);
    }

    public static boolean e2(@o0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean f2(@o0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f23975a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g2(@d.o0 w9.d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f23975a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.g2(w9.d):boolean");
    }

    public float A1() {
        return this.I0;
    }

    public void A2(@o0 Drawable drawable) {
        Drawable p12 = p1();
        if (p12 != drawable) {
            float Q02 = Q0();
            this.A0 = drawable != null ? d.r(drawable).mutate() : null;
            float Q03 = Q0();
            L3(p12);
            if (J3()) {
                O0(this.A0);
            }
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public void A3(float f10) {
        if (this.U0 != f10) {
            this.U0 = f10;
            invalidateSelf();
            i2();
        }
    }

    public float B1() {
        return this.V0;
    }

    @Deprecated
    public void B2(boolean z10) {
        J2(z10);
    }

    public void B3(@d.p int i10) {
        A3(this.Y0.getResources().getDimension(i10));
    }

    @m0
    public int[] C1() {
        return this.f16913t1;
    }

    @Deprecated
    public void C2(@d.h int i10) {
        I2(i10);
    }

    public void C3(@a1 int i10) {
        x3(this.Y0.getResources().getString(i10));
    }

    @o0
    public ColorStateList D1() {
        return this.H0;
    }

    public void D2(@u int i10) {
        A2(g.a.d(this.Y0, i10));
    }

    public void D3(@q float f10) {
        w9.d P1 = P1();
        if (P1 != null) {
            P1.f23988n = f10;
            this.f16896f1.e().setTextSize(f10);
            a();
        }
    }

    public void E1(@m0 RectF rectF) {
        T0(getBounds(), rectF);
    }

    public void E2(float f10) {
        if (this.C0 != f10) {
            float Q02 = Q0();
            this.C0 = f10;
            float Q03 = Q0();
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public void E3(float f10) {
        if (this.T0 != f10) {
            this.T0 = f10;
            invalidateSelf();
            i2();
        }
    }

    public final float F1() {
        Drawable drawable = this.f16903m1 ? this.M0 : this.A0;
        float f10 = this.C0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil((double) v.e(this.Y0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f10) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    public void F2(@d.p int i10) {
        E2(this.Y0.getResources().getDimension(i10));
    }

    public void F3(@d.p int i10) {
        E3(this.Y0.getResources().getDimension(i10));
    }

    public final float G1() {
        Drawable drawable = this.f16903m1 ? this.M0 : this.A0;
        float f10 = this.C0;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    public void G2(@o0 ColorStateList colorStateList) {
        this.D0 = true;
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            if (J3()) {
                d.o(this.A0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void G3(boolean z10) {
        if (this.f16915u1 != z10) {
            this.f16915u1 = z10;
            M3();
            onStateChange(getState());
        }
    }

    public TextUtils.TruncateAt H1() {
        return this.f16921x1;
    }

    public void H2(@n int i10) {
        G2(g.a.c(this.Y0, i10));
    }

    public boolean H3() {
        return this.f16923y1;
    }

    @o0
    public h I1() {
        return this.P0;
    }

    public void I2(@d.h int i10) {
        J2(this.Y0.getResources().getBoolean(i10));
    }

    public final boolean I3() {
        return this.L0 && this.M0 != null && this.f16903m1;
    }

    public float J1() {
        return this.S0;
    }

    public void J2(boolean z10) {
        if (this.f16924z0 != z10) {
            boolean J3 = J3();
            this.f16924z0 = z10;
            boolean J32 = J3();
            if (J3 != J32) {
                if (J32) {
                    O0(this.A0);
                } else {
                    L3(this.A0);
                }
                invalidateSelf();
                i2();
            }
        }
    }

    public final boolean J3() {
        return this.f16924z0 && this.A0 != null;
    }

    public float K1() {
        return this.R0;
    }

    public void K2(float f10) {
        if (this.f16912t0 != f10) {
            this.f16912t0 = f10;
            invalidateSelf();
            i2();
        }
    }

    public final boolean K3() {
        return this.E0 && this.F0 != null;
    }

    @r0
    public int L1() {
        return this.f16925z1;
    }

    public void L2(@d.p int i10) {
        K2(this.Y0.getResources().getDimension(i10));
    }

    public final void L3(@o0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    @o0
    public ColorStateList M1() {
        return this.f16920x0;
    }

    public void M2(float f10) {
        if (this.Q0 != f10) {
            this.Q0 = f10;
            invalidateSelf();
            i2();
        }
    }

    public final void M3() {
        this.f16917v1 = this.f16915u1 ? b.d(this.f16920x0) : null;
    }

    @o0
    public h N1() {
        return this.O0;
    }

    public void N2(@d.p int i10) {
        M2(this.Y0.getResources().getDimension(i10));
    }

    @TargetApi(21)
    public final void N3() {
        this.G0 = new RippleDrawable(b.d(M1()), this.F0, F1);
    }

    public final void O0(@o0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            d.m(drawable, d.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.F0) {
                if (drawable.isStateful()) {
                    drawable.setState(C1());
                }
                d.o(drawable, this.H0);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.A0;
            if (drawable == drawable2 && this.D0) {
                d.o(drawable2, this.B0);
            }
        }
    }

    @o0
    public CharSequence O1() {
        return this.f16922y0;
    }

    public void O2(@o0 ColorStateList colorStateList) {
        if (this.f16916v0 != colorStateList) {
            this.f16916v0 = colorStateList;
            if (this.A1) {
                E0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P0(@m0 Rect rect, @m0 RectF rectF) {
        rectF.setEmpty();
        if (J3() || I3()) {
            float f10 = this.Q0 + this.R0;
            float G1 = G1();
            if (d.f(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + G1;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - G1;
            }
            float F12 = F1();
            float exactCenterY = rect.exactCenterY() - (F12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + F12;
        }
    }

    @o0
    public w9.d P1() {
        return this.f16896f1.d();
    }

    public void P2(@n int i10) {
        O2(g.a.c(this.Y0, i10));
    }

    public float Q0() {
        if (J3() || I3()) {
            return this.R0 + G1() + this.S0;
        }
        return 0.0f;
    }

    public float Q1() {
        return this.U0;
    }

    public void Q2(float f10) {
        if (this.f16918w0 != f10) {
            this.f16918w0 = f10;
            this.Z0.setStrokeWidth(f10);
            if (this.A1) {
                super.H0(f10);
            }
            invalidateSelf();
        }
    }

    public final void R0(@m0 Rect rect, @m0 RectF rectF) {
        rectF.set(rect);
        if (K3()) {
            float f10 = this.X0 + this.W0 + this.I0 + this.V0 + this.U0;
            if (d.f(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    public float R1() {
        return this.T0;
    }

    public void R2(@d.p int i10) {
        Q2(this.Y0.getResources().getDimension(i10));
    }

    public final void S0(@m0 Rect rect, @m0 RectF rectF) {
        rectF.setEmpty();
        if (K3()) {
            float f10 = this.X0 + this.W0;
            if (d.f(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.I0;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.I0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.I0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    @o0
    public final ColorFilter S1() {
        ColorFilter colorFilter = this.f16906p1;
        return colorFilter != null ? colorFilter : this.f16907q1;
    }

    public final void S2(@o0 ColorStateList colorStateList) {
        if (this.f16908r0 != colorStateList) {
            this.f16908r0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void T0(@m0 Rect rect, @m0 RectF rectF) {
        rectF.setEmpty();
        if (K3()) {
            float f10 = this.X0 + this.W0 + this.I0 + this.V0 + this.U0;
            if (d.f(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public boolean T1() {
        return this.f16915u1;
    }

    public void T2(@o0 Drawable drawable) {
        Drawable x12 = x1();
        if (x12 != drawable) {
            float U02 = U0();
            this.F0 = drawable != null ? d.r(drawable).mutate() : null;
            if (b.f24357a) {
                N3();
            }
            float U03 = U0();
            L3(x12);
            if (K3()) {
                O0(this.F0);
            }
            invalidateSelf();
            if (U02 != U03) {
                i2();
            }
        }
    }

    public float U0() {
        if (K3()) {
            return this.V0 + this.I0 + this.W0;
        }
        return 0.0f;
    }

    public void U2(@o0 CharSequence charSequence) {
        if (this.J0 != charSequence) {
            this.J0 = b1.a.c().m(charSequence);
            invalidateSelf();
        }
    }

    public final void V0(@m0 Rect rect, @m0 RectF rectF) {
        rectF.setEmpty();
        if (this.f16922y0 != null) {
            float Q02 = this.Q0 + Q0() + this.T0;
            float U02 = this.X0 + U0() + this.U0;
            if (d.f(this) == 0) {
                rectF.left = ((float) rect.left) + Q02;
                rectF.right = ((float) rect.right) - U02;
            } else {
                rectF.left = ((float) rect.left) + U02;
                rectF.right = ((float) rect.right) - Q02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public boolean V1() {
        return this.K0;
    }

    @Deprecated
    public void V2(boolean z10) {
        i3(z10);
    }

    public final float W0() {
        this.f16896f1.e().getFontMetrics(this.f16892b1);
        Paint.FontMetrics fontMetrics = this.f16892b1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    public boolean W1() {
        return X1();
    }

    @Deprecated
    public void W2(@d.h int i10) {
        h3(i10);
    }

    @m0
    public Paint.Align X0(@m0 Rect rect, @m0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f16922y0 != null) {
            float Q02 = this.Q0 + Q0() + this.T0;
            if (d.f(this) == 0) {
                pointF.x = ((float) rect.left) + Q02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - Q02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - W0();
        }
        return align;
    }

    public boolean X1() {
        return this.L0;
    }

    public void X2(float f10) {
        if (this.W0 != f10) {
            this.W0 = f10;
            invalidateSelf();
            if (K3()) {
                i2();
            }
        }
    }

    public final boolean Y0() {
        return this.L0 && this.M0 != null && this.K0;
    }

    @Deprecated
    public boolean Y1() {
        return Z1();
    }

    public void Y2(@d.p int i10) {
        X2(this.Y0.getResources().getDimension(i10));
    }

    public boolean Z1() {
        return this.f16924z0;
    }

    public void Z2(@u int i10) {
        T2(g.a.d(this.Y0, i10));
    }

    public void a() {
        i2();
        invalidateSelf();
    }

    @Deprecated
    public boolean a2() {
        return c2();
    }

    public void a3(float f10) {
        if (this.I0 != f10) {
            this.I0 = f10;
            invalidateSelf();
            if (K3()) {
                i2();
            }
        }
    }

    public final void b1(@m0 Canvas canvas, @m0 Rect rect) {
        if (I3()) {
            P0(rect, this.f16893c1);
            RectF rectF = this.f16893c1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.M0.setBounds(0, 0, (int) this.f16893c1.width(), (int) this.f16893c1.height());
            this.M0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public boolean b2() {
        return f2(this.F0);
    }

    public void b3(@d.p int i10) {
        a3(this.Y0.getResources().getDimension(i10));
    }

    public final void c1(@m0 Canvas canvas, @m0 Rect rect) {
        if (!this.A1) {
            this.Z0.setColor(this.f16898h1);
            this.Z0.setStyle(Paint.Style.FILL);
            this.Z0.setColorFilter(S1());
            this.f16893c1.set(rect);
            canvas.drawRoundRect(this.f16893c1, n1(), n1(), this.Z0);
        }
    }

    public boolean c2() {
        return this.E0;
    }

    public void c3(float f10) {
        if (this.V0 != f10) {
            this.V0 = f10;
            invalidateSelf();
            if (K3()) {
                i2();
            }
        }
    }

    public final void d1(@m0 Canvas canvas, @m0 Rect rect) {
        if (J3()) {
            P0(rect, this.f16893c1);
            RectF rectF = this.f16893c1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.A0.setBounds(0, 0, (int) this.f16893c1.width(), (int) this.f16893c1.height());
            this.A0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public boolean d2() {
        return this.A1;
    }

    public void d3(@d.p int i10) {
        c3(this.Y0.getResources().getDimension(i10));
    }

    public void draw(@m0 Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i10 = 0;
            int i11 = this.f16905o1;
            if (i11 < 255) {
                i10 = m9.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            }
            f1(canvas, bounds);
            c1(canvas, bounds);
            if (this.A1) {
                super.draw(canvas);
            }
            e1(canvas, bounds);
            h1(canvas, bounds);
            d1(canvas, bounds);
            b1(canvas, bounds);
            if (this.f16923y1) {
                j1(canvas, bounds);
            }
            g1(canvas, bounds);
            i1(canvas, bounds);
            if (this.f16905o1 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public final void e1(@m0 Canvas canvas, @m0 Rect rect) {
        if (this.f16918w0 > 0.0f && !this.A1) {
            this.Z0.setColor(this.f16900j1);
            this.Z0.setStyle(Paint.Style.STROKE);
            if (!this.A1) {
                this.Z0.setColorFilter(S1());
            }
            RectF rectF = this.f16893c1;
            float f10 = this.f16918w0;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.f16914u0 - (this.f16918w0 / 2.0f);
            canvas.drawRoundRect(this.f16893c1, f11, f11, this.Z0);
        }
    }

    public boolean e3(@m0 int[] iArr) {
        if (Arrays.equals(this.f16913t1, iArr)) {
            return false;
        }
        this.f16913t1 = iArr;
        if (K3()) {
            return j2(getState(), iArr);
        }
        return false;
    }

    public final void f1(@m0 Canvas canvas, @m0 Rect rect) {
        if (!this.A1) {
            this.Z0.setColor(this.f16897g1);
            this.Z0.setStyle(Paint.Style.FILL);
            this.f16893c1.set(rect);
            canvas.drawRoundRect(this.f16893c1, n1(), n1(), this.Z0);
        }
    }

    public void f3(@o0 ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            if (K3()) {
                d.o(this.F0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void g1(@m0 Canvas canvas, @m0 Rect rect) {
        Drawable drawable;
        if (K3()) {
            S0(rect, this.f16893c1);
            RectF rectF = this.f16893c1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.F0.setBounds(0, 0, (int) this.f16893c1.width(), (int) this.f16893c1.height());
            if (b.f24357a) {
                this.G0.setBounds(this.F0.getBounds());
                this.G0.jumpToCurrentState();
                drawable = this.G0;
            } else {
                drawable = this.F0;
            }
            drawable.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void g3(@n int i10) {
        f3(g.a.c(this.Y0, i10));
    }

    public int getAlpha() {
        return this.f16905o1;
    }

    @o0
    public ColorFilter getColorFilter() {
        return this.f16906p1;
    }

    public int getIntrinsicHeight() {
        return (int) this.f16912t0;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.Q0 + Q0() + this.T0 + this.f16896f1.f(O1().toString()) + this.U0 + U0() + this.X0), this.f16925z1);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@m0 Outline outline) {
        if (this.A1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f16914u0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f16914u0);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public final void h1(@m0 Canvas canvas, @m0 Rect rect) {
        this.Z0.setColor(this.f16901k1);
        this.Z0.setStyle(Paint.Style.FILL);
        this.f16893c1.set(rect);
        if (!this.A1) {
            canvas.drawRoundRect(this.f16893c1, n1(), n1(), this.Z0);
            return;
        }
        h(new RectF(rect), this.f16895e1);
        super.q(canvas, this.Z0, this.f16895e1, v());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h2(@d.o0 android.util.AttributeSet r8, @d.f int r9, @d.b1 int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.Y0
            int[] r2 = i9.a.o.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = i9.a.o.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.A1 = r10
            android.content.Context r10 = r7.Y0
            int r0 = i9.a.o.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = w9.c.a(r10, r9, r0)
            r7.S2(r10)
            android.content.Context r10 = r7.Y0
            int r0 = i9.a.o.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = w9.c.a(r10, r9, r0)
            r7.u2(r10)
            int r10 = i9.a.o.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.K2(r10)
            int r10 = i9.a.o.Chip_chipCornerRadius
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L_0x0045
            float r10 = r9.getDimension(r10, r0)
            r7.w2(r10)
        L_0x0045:
            android.content.Context r10 = r7.Y0
            int r1 = i9.a.o.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = w9.c.a(r10, r9, r1)
            r7.O2(r10)
            int r10 = i9.a.o.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.Q2(r10)
            android.content.Context r10 = r7.Y0
            int r1 = i9.a.o.Chip_rippleColor
            android.content.res.ColorStateList r10 = w9.c.a(r10, r9, r1)
            r7.s3(r10)
            int r10 = i9.a.o.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.x3(r10)
            android.content.Context r10 = r7.Y0
            int r1 = i9.a.o.Chip_android_textAppearance
            w9.d r10 = w9.c.f(r10, r9, r1)
            int r1 = i9.a.o.Chip_android_textSize
            float r2 = r10.f23988n
            float r1 = r9.getDimension(r1, r2)
            r10.f23988n = r1
            r7.y3(r10)
            int r10 = i9.a.o.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x0098
            r1 = 2
            if (r10 == r1) goto L_0x0095
            r1 = 3
            if (r10 == r1) goto L_0x0092
            goto L_0x009d
        L_0x0092:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x009a
        L_0x0095:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x009a
        L_0x0098:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x009a:
            r7.k3(r10)
        L_0x009d:
            int r10 = i9.a.o.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.J2(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00c3
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00c3
            int r1 = i9.a.o.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.J2(r1)
        L_0x00c3:
            android.content.Context r1 = r7.Y0
            int r2 = i9.a.o.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = w9.c.d(r1, r9, r2)
            r7.A2(r1)
            int r1 = i9.a.o.Chip_chipIconTint
            boolean r2 = r9.hasValue(r1)
            if (r2 == 0) goto L_0x00df
            android.content.Context r2 = r7.Y0
            android.content.res.ColorStateList r1 = w9.c.a(r2, r9, r1)
            r7.G2(r1)
        L_0x00df:
            int r1 = i9.a.o.Chip_chipIconSize
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.E2(r1)
            int r1 = i9.a.o.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.i3(r1)
            if (r8 == 0) goto L_0x010e
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x010e
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x010e
            int r1 = i9.a.o.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.i3(r1)
        L_0x010e:
            android.content.Context r1 = r7.Y0
            int r2 = i9.a.o.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = w9.c.d(r1, r9, r2)
            r7.T2(r1)
            android.content.Context r1 = r7.Y0
            int r2 = i9.a.o.Chip_closeIconTint
            android.content.res.ColorStateList r1 = w9.c.a(r1, r9, r2)
            r7.f3(r1)
            int r1 = i9.a.o.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.a3(r1)
            int r1 = i9.a.o.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.k2(r1)
            int r1 = i9.a.o.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.t2(r1)
            if (r8 == 0) goto L_0x015a
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x015a
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x015a
            int r8 = i9.a.o.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.t2(r8)
        L_0x015a:
            android.content.Context r8 = r7.Y0
            int r10 = i9.a.o.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = w9.c.d(r8, r9, r10)
            r7.m2(r8)
            int r8 = i9.a.o.Chip_checkedIconTint
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto L_0x0176
            android.content.Context r10 = r7.Y0
            android.content.res.ColorStateList r8 = w9.c.a(r10, r9, r8)
            r7.q2(r8)
        L_0x0176:
            android.content.Context r8 = r7.Y0
            int r10 = i9.a.o.Chip_showMotionSpec
            j9.h r8 = j9.h.c(r8, r9, r10)
            r7.v3(r8)
            android.content.Context r8 = r7.Y0
            int r10 = i9.a.o.Chip_hideMotionSpec
            j9.h r8 = j9.h.c(r8, r9, r10)
            r7.l3(r8)
            int r8 = i9.a.o.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.M2(r8)
            int r8 = i9.a.o.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.p3(r8)
            int r8 = i9.a.o.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.n3(r8)
            int r8 = i9.a.o.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.E3(r8)
            int r8 = i9.a.o.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.A3(r8)
            int r8 = i9.a.o.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.c3(r8)
            int r8 = i9.a.o.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.X2(r8)
            int r8 = i9.a.o.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.y2(r8)
            int r8 = i9.a.o.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.r3(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.h2(android.util.AttributeSet, int, int):void");
    }

    public void h3(@d.h int i10) {
        i3(this.Y0.getResources().getBoolean(i10));
    }

    public final void i1(@m0 Canvas canvas, @m0 Rect rect) {
        Paint paint = this.f16891a1;
        if (paint != null) {
            paint.setColor(f0.B(-16777216, 127));
            canvas.drawRect(rect, this.f16891a1);
            if (J3() || I3()) {
                P0(rect, this.f16893c1);
                canvas.drawRect(this.f16893c1, this.f16891a1);
            }
            if (this.f16922y0 != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f16891a1);
            }
            if (K3()) {
                S0(rect, this.f16893c1);
                canvas.drawRect(this.f16893c1, this.f16891a1);
            }
            this.f16891a1.setColor(f0.B(s0.a.f12612c, 127));
            R0(rect, this.f16893c1);
            canvas.drawRect(this.f16893c1, this.f16891a1);
            this.f16891a1.setColor(f0.B(-16711936, 127));
            T0(rect, this.f16893c1);
            canvas.drawRect(this.f16893c1, this.f16891a1);
        }
    }

    public void i2() {
        C0275a aVar = this.f16919w1.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void i3(boolean z10) {
        if (this.E0 != z10) {
            boolean K3 = K3();
            this.E0 = z10;
            boolean K32 = K3();
            if (K3 != K32) {
                if (K32) {
                    O0(this.F0);
                } else {
                    L3(this.F0);
                }
                invalidateSelf();
                i2();
            }
        }
    }

    public void invalidateDrawable(@m0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return e2(this.f16908r0) || e2(this.f16910s0) || e2(this.f16916v0) || (this.f16915u1 && e2(this.f16917v1)) || g2(this.f16896f1.d()) || Y0() || f2(this.A0) || f2(this.M0) || e2(this.f16909r1);
    }

    public final void j1(@m0 Canvas canvas, @m0 Rect rect) {
        if (this.f16922y0 != null) {
            Paint.Align X02 = X0(rect, this.f16894d1);
            V0(rect, this.f16893c1);
            if (this.f16896f1.d() != null) {
                this.f16896f1.e().drawableState = getState();
                this.f16896f1.k(this.Y0);
            }
            this.f16896f1.e().setTextAlign(X02);
            int i10 = 0;
            boolean z10 = Math.round(this.f16896f1.f(O1().toString())) > Math.round(this.f16893c1.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f16893c1);
            }
            CharSequence charSequence = this.f16922y0;
            if (z10 && this.f16921x1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f16896f1.e(), this.f16893c1.width(), this.f16921x1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f16894d1;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f16896f1.e());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public final boolean j2(@m0 int[] iArr, @m0 int[] iArr2) {
        boolean z10;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f16908r0;
        int l10 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f16897g1) : 0);
        boolean z11 = true;
        if (this.f16897g1 != l10) {
            this.f16897g1 = l10;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f16910s0;
        int l11 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16898h1) : 0);
        if (this.f16898h1 != l11) {
            this.f16898h1 = l11;
            onStateChange = true;
        }
        int f10 = o9.a.f(l10, l11);
        if ((this.f16899i1 != f10) || (y() == null)) {
            this.f16899i1 = f10;
            n0(ColorStateList.valueOf(f10));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16916v0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16900j1) : 0;
        if (this.f16900j1 != colorForState) {
            this.f16900j1 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f16917v1 == null || !b.e(iArr)) ? 0 : this.f16917v1.getColorForState(iArr, this.f16901k1);
        if (this.f16901k1 != colorForState2) {
            this.f16901k1 = colorForState2;
            if (this.f16915u1) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f16896f1.d() == null || this.f16896f1.d().f23975a == null) ? 0 : this.f16896f1.d().f23975a.getColorForState(iArr, this.f16902l1);
        if (this.f16902l1 != colorForState3) {
            this.f16902l1 = colorForState3;
            onStateChange = true;
        }
        boolean z12 = U1(getState(), 16842912) && this.K0;
        if (this.f16903m1 == z12 || this.M0 == null) {
            z10 = false;
        } else {
            float Q02 = Q0();
            this.f16903m1 = z12;
            if (Q02 != Q0()) {
                onStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f16909r1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16904n1) : 0;
        if (this.f16904n1 != colorForState4) {
            this.f16904n1 = colorForState4;
            this.f16907q1 = q9.a.c(this, this.f16909r1, this.f16911s1);
        } else {
            z11 = onStateChange;
        }
        if (f2(this.A0)) {
            z11 |= this.A0.setState(iArr);
        }
        if (f2(this.M0)) {
            z11 |= this.M0.setState(iArr);
        }
        if (f2(this.F0)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z11 |= this.F0.setState(iArr3);
        }
        if (b.f24357a && f2(this.G0)) {
            z11 |= this.G0.setState(iArr2);
        }
        if (z11) {
            invalidateSelf();
        }
        if (z10) {
            i2();
        }
        return z11;
    }

    public void j3(@o0 C0275a aVar) {
        this.f16919w1 = new WeakReference<>(aVar);
    }

    @o0
    public Drawable k1() {
        return this.M0;
    }

    public void k2(boolean z10) {
        if (this.K0 != z10) {
            this.K0 = z10;
            float Q02 = Q0();
            if (!z10 && this.f16903m1) {
                this.f16903m1 = false;
            }
            float Q03 = Q0();
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public void k3(@o0 TextUtils.TruncateAt truncateAt) {
        this.f16921x1 = truncateAt;
    }

    @o0
    public ColorStateList l1() {
        return this.N0;
    }

    public void l2(@d.h int i10) {
        k2(this.Y0.getResources().getBoolean(i10));
    }

    public void l3(@o0 h hVar) {
        this.P0 = hVar;
    }

    @o0
    public ColorStateList m1() {
        return this.f16910s0;
    }

    public void m2(@o0 Drawable drawable) {
        if (this.M0 != drawable) {
            float Q02 = Q0();
            this.M0 = drawable;
            float Q03 = Q0();
            L3(this.M0);
            O0(this.M0);
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public void m3(@d.b int i10) {
        l3(h.d(this.Y0, i10));
    }

    public float n1() {
        return this.A1 ? R() : this.f16914u0;
    }

    @Deprecated
    public void n2(boolean z10) {
        t2(z10);
    }

    public void n3(float f10) {
        if (this.S0 != f10) {
            float Q02 = Q0();
            this.S0 = f10;
            float Q03 = Q0();
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public float o1() {
        return this.X0;
    }

    @Deprecated
    public void o2(@d.h int i10) {
        t2(this.Y0.getResources().getBoolean(i10));
    }

    public void o3(@d.p int i10) {
        n3(this.Y0.getResources().getDimension(i10));
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (J3()) {
            onLayoutDirectionChanged |= d.m(this.A0, i10);
        }
        if (I3()) {
            onLayoutDirectionChanged |= d.m(this.M0, i10);
        }
        if (K3()) {
            onLayoutDirectionChanged |= d.m(this.F0, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (J3()) {
            onLevelChange |= this.A0.setLevel(i10);
        }
        if (I3()) {
            onLevelChange |= this.M0.setLevel(i10);
        }
        if (K3()) {
            onLevelChange |= this.F0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(@m0 int[] iArr) {
        if (this.A1) {
            super.onStateChange(iArr);
        }
        return j2(iArr, C1());
    }

    @o0
    public Drawable p1() {
        Drawable drawable = this.A0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    public void p2(@u int i10) {
        m2(g.a.d(this.Y0, i10));
    }

    public void p3(float f10) {
        if (this.R0 != f10) {
            float Q02 = Q0();
            this.R0 = f10;
            float Q03 = Q0();
            invalidateSelf();
            if (Q02 != Q03) {
                i2();
            }
        }
    }

    public float q1() {
        return this.C0;
    }

    public void q2(@o0 ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            if (Y0()) {
                d.o(this.M0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void q3(@d.p int i10) {
        p3(this.Y0.getResources().getDimension(i10));
    }

    @o0
    public ColorStateList r1() {
        return this.B0;
    }

    public void r2(@n int i10) {
        q2(g.a.c(this.Y0, i10));
    }

    public void r3(@r0 int i10) {
        this.f16925z1 = i10;
    }

    public float s1() {
        return this.f16912t0;
    }

    public void s2(@d.h int i10) {
        t2(this.Y0.getResources().getBoolean(i10));
    }

    public void s3(@o0 ColorStateList colorStateList) {
        if (this.f16920x0 != colorStateList) {
            this.f16920x0 = colorStateList;
            M3();
            onStateChange(getState());
        }
    }

    public void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.f16905o1 != i10) {
            this.f16905o1 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        if (this.f16906p1 != colorFilter) {
            this.f16906p1 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(@o0 ColorStateList colorStateList) {
        if (this.f16909r1 != colorStateList) {
            this.f16909r1 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(@m0 PorterDuff.Mode mode) {
        if (this.f16911s1 != mode) {
            this.f16911s1 = mode;
            this.f16907q1 = q9.a.c(this, this.f16909r1, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (J3()) {
            visible |= this.A0.setVisible(z10, z11);
        }
        if (I3()) {
            visible |= this.M0.setVisible(z10, z11);
        }
        if (K3()) {
            visible |= this.F0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public float t1() {
        return this.Q0;
    }

    public void t2(boolean z10) {
        if (this.L0 != z10) {
            boolean I3 = I3();
            this.L0 = z10;
            boolean I32 = I3();
            if (I3 != I32) {
                if (I32) {
                    O0(this.M0);
                } else {
                    L3(this.M0);
                }
                invalidateSelf();
                i2();
            }
        }
    }

    public void t3(@n int i10) {
        s3(g.a.c(this.Y0, i10));
    }

    @o0
    public ColorStateList u1() {
        return this.f16916v0;
    }

    public void u2(@o0 ColorStateList colorStateList) {
        if (this.f16910s0 != colorStateList) {
            this.f16910s0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void u3(boolean z10) {
        this.f16923y1 = z10;
    }

    public void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.f16918w0;
    }

    public void v2(@n int i10) {
        u2(g.a.c(this.Y0, i10));
    }

    public void v3(@o0 h hVar) {
        this.O0 = hVar;
    }

    public void w1(@m0 RectF rectF) {
        R0(getBounds(), rectF);
    }

    @Deprecated
    public void w2(float f10) {
        if (this.f16914u0 != f10) {
            this.f16914u0 = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f10));
        }
    }

    public void w3(@d.b int i10) {
        v3(h.d(this.Y0, i10));
    }

    @o0
    public Drawable x1() {
        Drawable drawable = this.F0;
        if (drawable != null) {
            return d.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void x2(@d.p int i10) {
        w2(this.Y0.getResources().getDimension(i10));
    }

    public void x3(@o0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f16922y0, charSequence)) {
            this.f16922y0 = charSequence;
            this.f16896f1.j(true);
            invalidateSelf();
            i2();
        }
    }

    @o0
    public CharSequence y1() {
        return this.J0;
    }

    public void y2(float f10) {
        if (this.X0 != f10) {
            this.X0 = f10;
            invalidateSelf();
            i2();
        }
    }

    public void y3(@o0 w9.d dVar) {
        this.f16896f1.i(dVar, this.Y0);
    }

    public float z1() {
        return this.W0;
    }

    public void z2(@d.p int i10) {
        y2(this.Y0.getResources().getDimension(i10));
    }

    public void z3(@b1 int i10) {
        y3(new w9.d(this.Y0, i10));
    }
}

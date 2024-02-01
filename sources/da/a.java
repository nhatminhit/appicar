package da;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import d.a1;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import d.r0;
import d.v;
import d.x0;
import i9.a;
import n0.f0;
import w9.c;
import w9.d;
import z9.g;
import z9.i;
import z9.j;
import z9.l;

@x0({x0.a.LIBRARY_GROUP})
public class a extends j implements k.b {
    @b1
    public static final int I0 = a.n.Widget_MaterialComponents_Tooltip;
    @f
    public static final int J0 = a.c.tooltipStyle;
    public int A0;
    public int B0;
    public int C0;
    public float D0;
    public float E0;
    public final float F0;
    public float G0;
    public float H0;
    @o0

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f17795r0;
    @m0

    /* renamed from: s0  reason: collision with root package name */
    public final Context f17796s0;
    @o0

    /* renamed from: t0  reason: collision with root package name */
    public final Paint.FontMetrics f17797t0 = new Paint.FontMetrics();
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final k f17798u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final View.OnLayoutChangeListener f17799v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final Rect f17800w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f17801x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f17802y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f17803z0;

    /* renamed from: da.a$a  reason: collision with other inner class name */
    public class C0291a implements View.OnLayoutChangeListener {
        public C0291a() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a.this.q1(view);
        }
    }

    public a(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        super(context, attributeSet, i10, i11);
        k kVar = new k(this);
        this.f17798u0 = kVar;
        this.f17799v0 = new C0291a();
        this.f17800w0 = new Rect();
        this.D0 = 1.0f;
        this.E0 = 1.0f;
        this.F0 = 0.5f;
        this.G0 = 0.5f;
        this.H0 = 1.0f;
        this.f17796s0 = context;
        kVar.e().density = context.getResources().getDisplayMetrics().density;
        kVar.e().setTextAlign(Paint.Align.CENTER);
    }

    @m0
    public static a S0(@m0 Context context) {
        return U0(context, (AttributeSet) null, J0, I0);
    }

    @m0
    public static a T0(@m0 Context context, @o0 AttributeSet attributeSet) {
        return U0(context, attributeSet, J0, I0);
    }

    @m0
    public static a U0(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.f1(attributeSet, i10, i11);
        return aVar;
    }

    public final float P0() {
        int i10;
        if (((this.f17800w0.right - getBounds().right) - this.C0) - this.A0 < 0) {
            i10 = ((this.f17800w0.right - getBounds().right) - this.C0) - this.A0;
        } else if (((this.f17800w0.left - getBounds().left) - this.C0) + this.A0 <= 0) {
            return 0.0f;
        } else {
            i10 = ((this.f17800w0.left - getBounds().left) - this.C0) + this.A0;
        }
        return (float) i10;
    }

    public final float Q0() {
        this.f17798u0.e().getFontMetrics(this.f17797t0);
        Paint.FontMetrics fontMetrics = this.f17797t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final float R0(@m0 Rect rect) {
        return ((float) rect.centerY()) - Q0();
    }

    public final g V0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.B0) * Math.sqrt(2.0d)))) / 2.0f;
        return new l(new i((float) this.B0), Math.min(Math.max(-P0(), -width), width));
    }

    public void W0(@o0 View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f17799v0);
        }
    }

    public final void X0(@m0 Canvas canvas) {
        if (this.f17795r0 != null) {
            Rect bounds = getBounds();
            int R0 = (int) R0(bounds);
            if (this.f17798u0.d() != null) {
                this.f17798u0.e().drawableState = getState();
                this.f17798u0.k(this.f17796s0);
                this.f17798u0.e().setAlpha((int) (this.H0 * 255.0f));
            }
            CharSequence charSequence = this.f17795r0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) R0, this.f17798u0.e());
        }
    }

    public int Y0() {
        return this.A0;
    }

    public int Z0() {
        return this.f17803z0;
    }

    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.f17802y0;
    }

    @o0
    public CharSequence b1() {
        return this.f17795r0;
    }

    @o0
    public d c1() {
        return this.f17798u0.d();
    }

    public int d1() {
        return this.f17801x0;
    }

    public void draw(@m0 Canvas canvas) {
        canvas.save();
        canvas.scale(this.D0, this.E0, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.G0));
        canvas.translate(P0(), (float) (-((((double) this.B0) * Math.sqrt(2.0d)) - ((double) this.B0))));
        super.draw(canvas);
        X0(canvas);
        canvas.restore();
    }

    public final float e1() {
        CharSequence charSequence = this.f17795r0;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f17798u0.f(charSequence.toString());
    }

    public final void f1(@o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        TypedArray j10 = n.j(this.f17796s0, attributeSet, a.o.Tooltip, i10, i11, new int[0]);
        this.B0 = this.f17796s0.getResources().getDimensionPixelSize(a.f.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(V0()).m());
        l1(j10.getText(a.o.Tooltip_android_text));
        m1(c.f(this.f17796s0, j10, a.o.Tooltip_android_textAppearance));
        n0(ColorStateList.valueOf(j10.getColor(a.o.Tooltip_backgroundTint, o9.a.f(f0.B(o9.a.c(this.f17796s0, 16842801, a.class.getCanonicalName()), dg.a.Wf), f0.B(o9.a.c(this.f17796s0, a.c.colorOnBackground, a.class.getCanonicalName()), 153)))));
        E0(ColorStateList.valueOf(o9.a.c(this.f17796s0, a.c.colorSurface, a.class.getCanonicalName())));
        this.f17801x0 = j10.getDimensionPixelSize(a.o.Tooltip_android_padding, 0);
        this.f17802y0 = j10.getDimensionPixelSize(a.o.Tooltip_android_minWidth, 0);
        this.f17803z0 = j10.getDimensionPixelSize(a.o.Tooltip_android_minHeight, 0);
        this.A0 = j10.getDimensionPixelSize(a.o.Tooltip_android_layout_margin, 0);
        j10.recycle();
    }

    public void g1(@r0 int i10) {
        this.A0 = i10;
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f17798u0.e().getTextSize(), (float) this.f17803z0);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f17801x0 * 2)) + e1(), (float) this.f17802y0);
    }

    public void h1(@r0 int i10) {
        this.f17803z0 = i10;
        invalidateSelf();
    }

    public void i1(@r0 int i10) {
        this.f17802y0 = i10;
        invalidateSelf();
    }

    public void j1(@o0 View view) {
        if (view != null) {
            q1(view);
            view.addOnLayoutChangeListener(this.f17799v0);
        }
    }

    public void k1(@v(from = 0.0d, to = 1.0d) float f10) {
        this.G0 = 1.2f;
        this.D0 = f10;
        this.E0 = f10;
        this.H0 = j9.a.b(0.0f, 1.0f, 0.19f, 1.0f, f10);
        invalidateSelf();
    }

    public void l1(@o0 CharSequence charSequence) {
        if (!TextUtils.equals(this.f17795r0, charSequence)) {
            this.f17795r0 = charSequence;
            this.f17798u0.j(true);
            invalidateSelf();
        }
    }

    public void m1(@o0 d dVar) {
        this.f17798u0.i(dVar, this.f17796s0);
    }

    public void n1(@b1 int i10) {
        m1(new d(this.f17796s0, i10));
    }

    public void o1(@r0 int i10) {
        this.f17801x0 = i10;
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().v().t(V0()).m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@a1 int i10) {
        l1(this.f17796s0.getResources().getString(i10));
    }

    public final void q1(@m0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.C0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f17800w0);
    }
}

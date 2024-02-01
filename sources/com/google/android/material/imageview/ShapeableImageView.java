package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import d.m0;
import d.n;
import d.o0;
import d.q;
import d.t0;
import i9.a;
import z9.j;
import z9.o;
import z9.p;
import z9.s;

public class ShapeableImageView extends AppCompatImageView implements s {

    /* renamed from: l0  reason: collision with root package name */
    public static final int f17130l0 = a.n.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f17131m0 = Integer.MIN_VALUE;
    public final p Q;
    public final RectF R;
    public final RectF S;
    public final Paint T;
    public final Paint U;
    public final Path V;
    @o0
    public ColorStateList W;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public j f17132a0;

    /* renamed from: b0  reason: collision with root package name */
    public o f17133b0;
    @q

    /* renamed from: c0  reason: collision with root package name */
    public float f17134c0;

    /* renamed from: d0  reason: collision with root package name */
    public Path f17135d0;
    @q

    /* renamed from: e0  reason: collision with root package name */
    public int f17136e0;
    @q

    /* renamed from: f0  reason: collision with root package name */
    public int f17137f0;
    @q

    /* renamed from: g0  reason: collision with root package name */
    public int f17138g0;
    @q

    /* renamed from: h0  reason: collision with root package name */
    public int f17139h0;
    @q

    /* renamed from: i0  reason: collision with root package name */
    public int f17140i0;
    @q

    /* renamed from: j0  reason: collision with root package name */
    public int f17141j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f17142k0;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f17143a = new Rect();

        public a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f17133b0 != null) {
                if (ShapeableImageView.this.f17132a0 == null) {
                    j unused = ShapeableImageView.this.f17132a0 = new j(ShapeableImageView.this.f17133b0);
                }
                ShapeableImageView.this.R.round(this.f17143a);
                ShapeableImageView.this.f17132a0.setBounds(this.f17143a);
                ShapeableImageView.this.f17132a0.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public ShapeableImageView(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, @d.o0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f17130l0
            android.content.Context r7 = ca.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            z9.p r7 = z9.p.k()
            r6.Q = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.V = r7
            r7 = 0
            r6.f17142k0 = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.U = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.R = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.S = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f17135d0 = r2
            int[] r2 = i9.a.o.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = i9.a.o.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = w9.c.a(r1, r2, r4)
            r6.W = r4
            int r4 = i9.a.o.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f17134c0 = r4
            int r4 = i9.a.o.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f17136e0 = r7
            r6.f17137f0 = r7
            r6.f17138g0 = r7
            r6.f17139h0 = r7
            int r4 = i9.a.o.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f17136e0 = r4
            int r4 = i9.a.o.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f17137f0 = r4
            int r4 = i9.a.o.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f17138g0 = r4
            int r4 = i9.a.o.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f17139h0 = r7
            int r7 = i9.a.o.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f17140i0 = r7
            int r7 = i9.a.o.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f17141j0 = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.T = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            z9.o$b r7 = z9.o.e(r1, r8, r9, r0)
            z9.o r7 = r7.m()
            r6.f17133b0 = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void g(Canvas canvas) {
        if (this.W != null) {
            this.T.setStrokeWidth(this.f17134c0);
            int colorForState = this.W.getColorForState(getDrawableState(), this.W.getDefaultColor());
            if (this.f17134c0 > 0.0f && colorForState != 0) {
                this.T.setColor(colorForState);
                canvas.drawPath(this.V, this.T);
            }
        }
    }

    @q
    public int getContentPaddingBottom() {
        return this.f17139h0;
    }

    @q
    public final int getContentPaddingEnd() {
        int i10 = this.f17141j0;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f17136e0 : this.f17138g0;
    }

    @q
    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f17141j0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f17140i0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f17136e0;
    }

    @q
    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (h()) {
            if (i() && (i11 = this.f17140i0) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!i() && (i10 = this.f17141j0) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f17138g0;
    }

    @q
    public final int getContentPaddingStart() {
        int i10 = this.f17140i0;
        return i10 != Integer.MIN_VALUE ? i10 : i() ? this.f17138g0 : this.f17136e0;
    }

    @q
    public int getContentPaddingTop() {
        return this.f17137f0;
    }

    @q
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @q
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @q
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @q
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @q
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @q
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @m0
    public o getShapeAppearanceModel() {
        return this.f17133b0;
    }

    @o0
    public ColorStateList getStrokeColor() {
        return this.W;
    }

    @q
    public float getStrokeWidth() {
        return this.f17134c0;
    }

    public final boolean h() {
        return (this.f17140i0 == Integer.MIN_VALUE && this.f17141j0 == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean i() {
        return getLayoutDirection() == 1;
    }

    public void j(@q int i10, @q int i11, @q int i12, @q int i13) {
        this.f17140i0 = Integer.MIN_VALUE;
        this.f17141j0 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f17136e0) + i10, (super.getPaddingTop() - this.f17137f0) + i11, (super.getPaddingRight() - this.f17138g0) + i12, (super.getPaddingBottom() - this.f17139h0) + i13);
        this.f17136e0 = i10;
        this.f17137f0 = i11;
        this.f17138g0 = i12;
        this.f17139h0 = i13;
    }

    @t0(17)
    public void k(@q int i10, @q int i11, @q int i12, @q int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f17137f0) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f17139h0) + i13);
        this.f17136e0 = i() ? i12 : i10;
        this.f17137f0 = i11;
        if (!i()) {
            i10 = i12;
        }
        this.f17138g0 = i10;
        this.f17139h0 = i13;
    }

    public final void l(int i10, int i11) {
        this.R.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i10 - getPaddingRight()), (float) (i11 - getPaddingBottom()));
        this.Q.d(this.f17133b0, 1.0f, this.R, this.V);
        this.f17135d0.rewind();
        this.f17135d0.addPath(this.V);
        this.S.set(0.0f, 0.0f, (float) i10, (float) i11);
        this.f17135d0.addRect(this.S, Path.Direction.CCW);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f17135d0, this.U);
        g(canvas);
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f17142k0 && isLayoutDirectionResolved()) {
            this.f17142k0 = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        l(i10, i11);
    }

    public void setPadding(@q int i10, @q int i11, @q int i12, @q int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    public void setPaddingRelative(@q int i10, @q int i11, @q int i12, @q int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(@m0 o oVar) {
        this.f17133b0 = oVar;
        j jVar = this.f17132a0;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        l(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@o0 ColorStateList colorStateList) {
        this.W = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@n int i10) {
        setStrokeColor(g.a.c(getContext(), i10));
    }

    public void setStrokeWidth(@q float f10) {
        if (this.f17134c0 != f10) {
            this.f17134c0 = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@d.p int i10) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i10));
    }
}

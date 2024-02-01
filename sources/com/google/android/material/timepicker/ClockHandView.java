package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d.o0;
import d.q;
import d.r0;
import d.v;
import f1.w1;
import i9.a;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: i0  reason: collision with root package name */
    public static final int f17630i0 = 200;
    public ValueAnimator O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public final List<d> U;
    public final int V;
    public final float W;

    /* renamed from: a0  reason: collision with root package name */
    public final Paint f17631a0;

    /* renamed from: b0  reason: collision with root package name */
    public final RectF f17632b0;
    @r0

    /* renamed from: c0  reason: collision with root package name */
    public final int f17633c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f17634d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f17635e0;

    /* renamed from: f0  reason: collision with root package name */
    public c f17636f0;

    /* renamed from: g0  reason: collision with root package name */
    public double f17637g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f17638h0;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void c(@v(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public interface d {
        void d(@v(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockHandView(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialClockStyle);
    }

    public ClockHandView(Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.U = new ArrayList();
        Paint paint = new Paint();
        this.f17631a0 = paint;
        this.f17632b0 = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ClockHandView, i10, a.n.Widget_MaterialComponents_TimePicker_Clock);
        this.f17638h0 = obtainStyledAttributes.getDimensionPixelSize(a.o.ClockHandView_materialCircleRadius, 0);
        this.V = obtainStyledAttributes.getDimensionPixelSize(a.o.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f17633c0 = resources.getDimensionPixelSize(a.f.material_clock_hand_stroke_width);
        this.W = (float) resources.getDimensionPixelSize(a.f.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(a.o.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        l(0.0f);
        this.T = ViewConfiguration.get(context).getScaledTouchSlop();
        w1.P1(this, 2);
        obtainStyledAttributes.recycle();
    }

    public void b(d dVar) {
        this.U.add(dVar);
    }

    public final void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = (float) width;
        float f11 = (float) height;
        this.f17631a0.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f17638h0) * ((float) Math.cos(this.f17637g0))) + f10, (((float) this.f17638h0) * ((float) Math.sin(this.f17637g0))) + f11, (float) this.V, this.f17631a0);
        double sin = Math.sin(this.f17637g0);
        double cos = Math.cos(this.f17637g0);
        double d10 = (double) ((float) (this.f17638h0 - this.V));
        float f12 = (float) (width + ((int) (cos * d10)));
        float f13 = (float) (height + ((int) (d10 * sin)));
        this.f17631a0.setStrokeWidth((float) this.f17633c0);
        canvas.drawLine(f10, f11, f12, f13, this.f17631a0);
        canvas.drawCircle(f10, f11, this.W, this.f17631a0);
    }

    public RectF d() {
        return this.f17632b0;
    }

    public final int e(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + dg.a.rr : degrees;
    }

    @v(from = 0.0d, to = 360.0d)
    public float f() {
        return this.f17634d0;
    }

    public int g() {
        return this.V;
    }

    public final Pair<Float, Float> h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f11), Float.valueOf(f10));
    }

    public final boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float e10 = (float) e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != e10;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.P) {
            z13 = true;
        }
        m(e10, z13);
        return true;
    }

    public void j(boolean z10) {
        this.P = z10;
    }

    public void k(@q int i10) {
        this.f17638h0 = i10;
        invalidate();
    }

    public void l(@v(from = 0.0d, to = 360.0d) float f10) {
        m(f10, false);
    }

    public void m(@v(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            n(f10, false);
            return;
        }
        Pair<Float, Float> h10 = h(f10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h10.first).floatValue(), ((Float) h10.second).floatValue()});
        this.O = ofFloat;
        ofFloat.setDuration(200);
        this.O.addUpdateListener(new a());
        this.O.addListener(new b());
        this.O.start();
    }

    public final void n(@v(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f17634d0 = f11;
        this.f17637g0 = Math.toRadians((double) (f11 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f17638h0) * ((float) Math.cos(this.f17637g0)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f17638h0) * ((float) Math.sin(this.f17637g0)));
        RectF rectF = this.f17632b0;
        int i10 = this.V;
        rectF.set(width - ((float) i10), height - ((float) i10), width + ((float) i10), height + ((float) i10));
        for (d d10 : this.U) {
            d10.d(f11, z10);
        }
        invalidate();
    }

    public void o(c cVar) {
        this.f17636f0 = cVar;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        l(f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.Q = x10;
            this.R = y10;
            this.S = true;
            this.f17635e0 = false;
            z12 = false;
            z11 = false;
            z10 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.Q);
            int i11 = (int) (y10 - this.R);
            this.S = (i10 * i10) + (i11 * i11) > this.T;
            boolean z13 = this.f17635e0;
            z12 = actionMasked == 1;
            z10 = false;
            z11 = z13;
        } else {
            z12 = false;
            z11 = false;
            z10 = false;
        }
        boolean i12 = i(x10, y10, z11, z10, z12) | this.f17635e0;
        this.f17635e0 = i12;
        if (i12 && z12 && (cVar = this.f17636f0) != null) {
            cVar.c((float) e(x10, y10), this.S);
        }
        return true;
    }
}

package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.internal.n;
import com.google.android.material.internal.u;
import com.google.android.material.internal.v;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import d.e0;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.p;
import d.q;
import f1.w1;
import g1.z;
import i9.a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z9.j;
import z9.o;

public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends a<S>, T extends b<S>> extends View {
    public static final String Q0 = BaseSlider.class.getSimpleName();
    public static final String R0 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    public static final String S0 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    public static final String T0 = "valueFrom(%s) must be smaller than valueTo(%s)";
    public static final String U0 = "valueTo(%s) must be greater than valueFrom(%s)";
    public static final String V0 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    public static final String W0 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.";
    public static final int X0 = 200;
    public static final int Y0 = 63;
    public static final double Z0 = 1.0E-4d;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f17307a1 = a.n.Widget_MaterialComponents_Slider;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f17308b1 = 1;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f17309c1 = 0;

    /* renamed from: d1  reason: collision with root package name */
    public static final long f17310d1 = 83;

    /* renamed from: e1  reason: collision with root package name */
    public static final long f17311e1 = 117;
    public int A0;
    public float B0;
    public float[] C0;
    public boolean D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    @m0
    public ColorStateList I0;
    @m0
    public ColorStateList J0;
    @m0
    public ColorStateList K0;
    @m0
    public ColorStateList L0;
    @m0
    public ColorStateList M0;
    @m0
    public final j N0;
    @m0
    public final Paint O;
    public float O0;
    @m0
    public final Paint P;
    public int P0;
    @m0
    public final Paint Q;
    @m0
    public final Paint R;
    @m0
    public final Paint S;
    @m0
    public final Paint T;
    @m0
    public final e U;
    public final AccessibilityManager V;
    public BaseSlider<S, L, T>.d W;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final f f17312a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public final List<da.a> f17313b0;
    @m0

    /* renamed from: c0  reason: collision with root package name */
    public final List<L> f17314c0;
    @m0

    /* renamed from: d0  reason: collision with root package name */
    public final List<T> f17315d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f17316e0;

    /* renamed from: f0  reason: collision with root package name */
    public ValueAnimator f17317f0;

    /* renamed from: g0  reason: collision with root package name */
    public ValueAnimator f17318g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f17319h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17320i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f17321j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f17322k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f17323l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f17324m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f17325n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f17326o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f17327p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f17328q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f17329r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f17330s0;

    /* renamed from: t0  reason: collision with root package name */
    public MotionEvent f17331t0;

    /* renamed from: u0  reason: collision with root package name */
    public d f17332u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f17333v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f17334w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f17335x0;

    /* renamed from: y0  reason: collision with root package name */
    public ArrayList<Float> f17336y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f17337z0;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();
        public float O;
        public float P;
        public ArrayList<Float> Q;
        public float R;
        public boolean S;

        public static class a implements Parcelable.Creator<SliderState> {
            @m0
            /* renamed from: a */
            public SliderState createFromParcel(@m0 Parcel parcel) {
                return new SliderState(parcel, (a) null);
            }

            @m0
            /* renamed from: b */
            public SliderState[] newArray(int i10) {
                return new SliderState[i10];
            }
        }

        public SliderState(@m0 Parcel parcel) {
            super(parcel);
            this.O = parcel.readFloat();
            this.P = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.Q = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.R = parcel.readFloat();
            this.S = parcel.createBooleanArray()[0];
        }

        public /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.O);
            parcel.writeFloat(this.P);
            parcel.writeList(this.Q);
            parcel.writeFloat(this.R);
            parcel.writeBooleanArray(new boolean[]{this.S});
        }
    }

    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AttributeSet f17338a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f17339b;

        public a(AttributeSet attributeSet, int i10) {
            this.f17338a = attributeSet;
            this.f17339b = i10;
        }

        public da.a a() {
            TypedArray j10 = n.j(BaseSlider.this.getContext(), this.f17338a, a.o.Slider, this.f17339b, BaseSlider.f17307a1, new int[0]);
            da.a a10 = BaseSlider.X(BaseSlider.this.getContext(), j10);
            j10.recycle();
            return a10;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (da.a k12 : BaseSlider.this.f17313b0) {
                k12.k1(floatValue);
            }
            w1.l1(BaseSlider.this);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (da.a b10 : BaseSlider.this.f17313b0) {
                v.g(BaseSlider.this).b(b10);
            }
        }
    }

    public class d implements Runnable {
        public int O;

        public d() {
            this.O = -1;
        }

        public /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }

        public void a(int i10) {
            this.O = i10;
        }

        public void run() {
            BaseSlider.this.U.Y(this.O, 4);
        }
    }

    public static class e extends m1.a {

        /* renamed from: t  reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f17343t;

        /* renamed from: u  reason: collision with root package name */
        public Rect f17344u = new Rect();

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f17343t = baseSlider;
        }

        public int C(float f10, float f11) {
            for (int i10 = 0; i10 < this.f17343t.getValues().size(); i10++) {
                this.f17343t.k0(i10, this.f17344u);
                if (this.f17344u.contains((int) f10, (int) f11)) {
                    return i10;
                }
            }
            return -1;
        }

        public void D(List<Integer> list) {
            for (int i10 = 0; i10 < this.f17343t.getValues().size(); i10++) {
                list.add(Integer.valueOf(i10));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            if (com.google.android.material.slider.BaseSlider.e(r4.f17343t, r5, r7.getFloat(g1.z.W)) != false) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean N(int r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.f17343t
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r6 == r0) goto L_0x003f
                if (r6 == r3) goto L_0x003f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L_0x0019
                return r1
            L_0x0019:
                if (r7 == 0) goto L_0x003e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L_0x0024
                goto L_0x003e
            L_0x0024:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f17343t
                boolean r6 = r7.i0(r5, r6)
                if (r6 == 0) goto L_0x003e
            L_0x0030:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f17343t
                r6.l0()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f17343t
                r6.postInvalidate()
                r4.G(r5)
                return r2
            L_0x003e:
                return r1
            L_0x003f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f17343t
                r0 = 20
                float r7 = r7.m(r0)
                if (r6 != r3) goto L_0x004a
                float r7 = -r7
            L_0x004a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f17343t
                boolean r6 = r6.K()
                if (r6 == 0) goto L_0x0053
                float r7 = -r7
            L_0x0053:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f17343t
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f17343t
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.f17343t
                float r0 = r0.getValueTo()
                float r6 = v0.a.b(r6, r7, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f17343t
                boolean r6 = r7.i0(r5, r6)
                if (r6 == 0) goto L_0x007d
                goto L_0x0030
            L_0x007d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.e.N(int, int, android.os.Bundle):boolean");
        }

        public void R(int i10, z zVar) {
            zVar.b(z.a.M);
            List<Float> values = this.f17343t.getValues();
            float floatValue = values.get(i10).floatValue();
            float valueFrom = this.f17343t.getValueFrom();
            float valueTo = this.f17343t.getValueTo();
            if (this.f17343t.isEnabled()) {
                if (floatValue > valueFrom) {
                    zVar.a(8192);
                }
                if (floatValue < valueTo) {
                    zVar.a(4096);
                }
            }
            zVar.A1(z.d.e(1, valueFrom, valueTo, floatValue));
            zVar.U0(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f17343t.getContentDescription() != null) {
                sb2.append(this.f17343t.getContentDescription());
                sb2.append(",");
            }
            if (values.size() > 1) {
                sb2.append(a0(i10));
                sb2.append(this.f17343t.D(floatValue));
            }
            zVar.Y0(sb2.toString());
            this.f17343t.k0(i10, this.f17344u);
            zVar.P0(this.f17344u);
        }

        @m0
        public final String a0(int i10) {
            Context context;
            int i11;
            if (i10 == this.f17343t.getValues().size() - 1) {
                context = this.f17343t.getContext();
                i11 = a.m.material_slider_range_end;
            } else if (i10 != 0) {
                return "";
            } else {
                context = this.f17343t.getContext();
                i11 = a.m.material_slider_range_start;
            }
            return context.getString(i11);
        }
    }

    public interface f {
        da.a a();
    }

    public BaseSlider(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public BaseSlider(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.sliderStyle);
    }

    public BaseSlider(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(ca.a.c(context, attributeSet, i10, f17307a1), attributeSet, i10);
        this.f17313b0 = new ArrayList();
        this.f17314c0 = new ArrayList();
        this.f17315d0 = new ArrayList();
        this.f17316e0 = false;
        this.f17333v0 = false;
        this.f17336y0 = new ArrayList<>();
        this.f17337z0 = -1;
        this.A0 = -1;
        this.B0 = 0.0f;
        this.D0 = true;
        this.G0 = false;
        j jVar = new j();
        this.N0 = jVar;
        this.P0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.O = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.P = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.Q = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.R = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.S = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.T = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        M(context2.getResources());
        this.f17312a0 = new a(attributeSet, i10);
        a0(context2, attributeSet, i10);
        setFocusable(true);
        setClickable(true);
        jVar.w0(2);
        this.f17319h0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.U = eVar;
        w1.z1(this, eVar);
        this.V = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public static float E(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    @m0
    public static da.a X(@m0 Context context, @m0 TypedArray typedArray) {
        return da.a.U0(context, (AttributeSet) null, 0, typedArray.getResourceId(a.o.Slider_labelStyle, a.n.Widget_MaterialComponents_Tooltip));
    }

    public static int Z(float[] fArr, float f10) {
        return Math.round(f10 * ((float) ((fArr.length / 2) - 1)));
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f17336y0.size() == 1) {
            floatValue2 = this.f17334w0;
        }
        float T2 = T(floatValue2);
        float T3 = T(floatValue);
        if (K()) {
            return new float[]{T3, T2};
        }
        return new float[]{T2, T3};
    }

    private float getValueOfTouchPosition() {
        double h02 = h0(this.O0);
        if (K()) {
            h02 = 1.0d - h02;
        }
        float f10 = this.f17335x0;
        float f11 = this.f17334w0;
        return (float) ((h02 * ((double) (f10 - f11))) + ((double) f11));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.O0;
        if (K()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.f17335x0;
        float f12 = this.f17334w0;
        return (f10 * (f11 - f12)) + f12;
    }

    private void setValuesInternal(@m0 ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f17336y0.size() != arrayList.size() || !this.f17336y0.equals(arrayList)) {
                this.f17336y0 = arrayList;
                this.H0 = true;
                this.A0 = 0;
                l0();
                r();
                v();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    public final void A() {
        if (this.f17316e0) {
            this.f17316e0 = false;
            ValueAnimator q10 = q(false);
            this.f17318g0 = q10;
            this.f17317f0 = null;
            q10.addListener(new c());
            this.f17318g0.start();
        }
    }

    public final void B(int i10) {
        if (i10 == 1) {
            R(Integer.MAX_VALUE);
        } else if (i10 == 2) {
            R(Integer.MIN_VALUE);
        } else if (i10 == 17) {
            S(Integer.MAX_VALUE);
        } else if (i10 == 66) {
            S(Integer.MIN_VALUE);
        }
    }

    @g1
    public void C(boolean z10) {
        this.F0 = z10;
    }

    public final String D(float f10) {
        if (H()) {
            return this.f17332u0.a(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f10)});
    }

    public final float F(int i10, float f10) {
        float f11 = 0.0f;
        if (this.B0 == 0.0f) {
            f11 = getMinSeparation();
        }
        if (this.P0 == 0) {
            f11 = t(f11);
        }
        if (K()) {
            f11 = -f11;
        }
        int i11 = i10 + 1;
        int i12 = i10 - 1;
        return v0.a.b(f10, i12 < 0 ? this.f17334w0 : this.f17336y0.get(i12).floatValue() + f11, i11 >= this.f17336y0.size() ? this.f17335x0 : this.f17336y0.get(i11).floatValue() - f11);
    }

    @l
    public final int G(@m0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean H() {
        return this.f17332u0 != null;
    }

    public final void I() {
        this.O.setStrokeWidth((float) this.f17324m0);
        this.P.setStrokeWidth((float) this.f17324m0);
        this.S.setStrokeWidth(((float) this.f17324m0) / 2.0f);
        this.T.setStrokeWidth(((float) this.f17324m0) / 2.0f);
    }

    public final boolean J() {
        ViewParent parent = getParent();
        while (true) {
            boolean z10 = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z10 = true;
            }
            if (z10 && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    public final boolean K() {
        return w1.X(this) == 1;
    }

    public boolean L() {
        return this.D0;
    }

    public final void M(@m0 Resources resources) {
        this.f17322k0 = resources.getDimensionPixelSize(a.f.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.mtrl_slider_track_side_padding);
        this.f17320i0 = dimensionPixelOffset;
        this.f17325n0 = dimensionPixelOffset;
        this.f17321j0 = resources.getDimensionPixelSize(a.f.mtrl_slider_thumb_radius);
        this.f17326o0 = resources.getDimensionPixelOffset(a.f.mtrl_slider_track_top);
        this.f17329r0 = resources.getDimensionPixelSize(a.f.mtrl_slider_label_padding);
    }

    public final void N() {
        if (this.B0 > 0.0f) {
            n0();
            int min = Math.min((int) (((this.f17335x0 - this.f17334w0) / this.B0) + 1.0f), (this.E0 / (this.f17324m0 * 2)) + 1);
            float[] fArr = this.C0;
            if (fArr == null || fArr.length != min * 2) {
                this.C0 = new float[(min * 2)];
            }
            float f10 = ((float) this.E0) / ((float) (min - 1));
            for (int i10 = 0; i10 < min * 2; i10 += 2) {
                float[] fArr2 = this.C0;
                fArr2[i10] = ((float) this.f17325n0) + (((float) (i10 / 2)) * f10);
                fArr2[i10 + 1] = (float) n();
            }
        }
    }

    public final void O(@m0 Canvas canvas, int i10, int i11) {
        if (f0()) {
            int T2 = (int) (((float) this.f17325n0) + (T(this.f17336y0.get(this.A0).floatValue()) * ((float) i10)));
            if (Build.VERSION.SDK_INT < 28) {
                int i12 = this.f17328q0;
                canvas.clipRect((float) (T2 - i12), (float) (i11 - i12), (float) (T2 + i12), (float) (i12 + i11), Region.Op.UNION);
            }
            canvas.drawCircle((float) T2, (float) i11, (float) this.f17328q0, this.R);
        }
    }

    public final void P(@m0 Canvas canvas) {
        if (this.D0 && this.B0 > 0.0f) {
            float[] activeRange = getActiveRange();
            int Z = Z(this.C0, activeRange[0]);
            int Z2 = Z(this.C0, activeRange[1]);
            int i10 = Z * 2;
            canvas.drawPoints(this.C0, 0, i10, this.S);
            int i11 = Z2 * 2;
            canvas.drawPoints(this.C0, i10, i11 - i10, this.T);
            float[] fArr = this.C0;
            canvas.drawPoints(fArr, i11, fArr.length - i11, this.S);
        }
    }

    public final void Q() {
        this.f17325n0 = this.f17320i0 + Math.max(this.f17327p0 - this.f17321j0, 0);
        if (w1.T0(this)) {
            m0(getWidth());
        }
    }

    public final boolean R(int i10) {
        int i11 = this.A0;
        int d10 = (int) v0.a.d(((long) i11) + ((long) i10), 0, (long) (this.f17336y0.size() - 1));
        this.A0 = d10;
        if (d10 == i11) {
            return false;
        }
        if (this.f17337z0 != -1) {
            this.f17337z0 = d10;
        }
        l0();
        postInvalidate();
        return true;
    }

    public final boolean S(int i10) {
        if (K()) {
            i10 = i10 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i10;
        }
        return R(i10);
    }

    public final float T(float f10) {
        float f11 = this.f17334w0;
        float f12 = (f10 - f11) / (this.f17335x0 - f11);
        return K() ? 1.0f - f12 : f12;
    }

    public final Boolean U(int i10, @m0 KeyEvent keyEvent) {
        if (i10 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(R(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(R(-1)) : Boolean.FALSE;
        }
        if (i10 != 66) {
            if (i10 != 81) {
                if (i10 == 69) {
                    R(-1);
                    return Boolean.TRUE;
                } else if (i10 != 70) {
                    switch (i10) {
                        case 21:
                            S(-1);
                            return Boolean.TRUE;
                        case 22:
                            S(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            R(1);
            return Boolean.TRUE;
        }
        this.f17337z0 = this.A0;
        postInvalidate();
        return Boolean.TRUE;
    }

    public final void V() {
        for (T a10 : this.f17315d0) {
            a10.a(this);
        }
    }

    public final void W() {
        for (T b10 : this.f17315d0) {
            b10.b(this);
        }
    }

    public boolean Y() {
        if (this.f17337z0 != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float t02 = t0(valueOfTouchPositionAbsolute);
        this.f17337z0 = 0;
        float abs = Math.abs(this.f17336y0.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i10 = 1; i10 < this.f17336y0.size(); i10++) {
            float abs2 = Math.abs(this.f17336y0.get(i10).floatValue() - valueOfTouchPositionAbsolute);
            float t03 = t0(this.f17336y0.get(i10).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z10 = !K() ? t03 - t02 < 0.0f : t03 - t02 > 0.0f;
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(t03 - t02) < ((float) this.f17319h0)) {
                    this.f17337z0 = -1;
                    return false;
                } else if (!z10) {
                }
            }
            this.f17337z0 = i10;
            abs = abs2;
        }
        return this.f17337z0 != -1;
    }

    public final void a0(Context context, AttributeSet attributeSet, int i10) {
        TypedArray j10 = n.j(context, attributeSet, a.o.Slider, i10, f17307a1, new int[0]);
        this.f17334w0 = j10.getFloat(a.o.Slider_android_valueFrom, 0.0f);
        this.f17335x0 = j10.getFloat(a.o.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f17334w0));
        this.B0 = j10.getFloat(a.o.Slider_android_stepSize, 0.0f);
        int i11 = a.o.Slider_trackColor;
        boolean hasValue = j10.hasValue(i11);
        int i12 = hasValue ? i11 : a.o.Slider_trackColorInactive;
        if (!hasValue) {
            i11 = a.o.Slider_trackColorActive;
        }
        ColorStateList a10 = w9.c.a(context, j10, i12);
        if (a10 == null) {
            a10 = g.a.c(context, a.e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a10);
        ColorStateList a11 = w9.c.a(context, j10, i11);
        if (a11 == null) {
            a11 = g.a.c(context, a.e.material_slider_active_track_color);
        }
        setTrackActiveTintList(a11);
        this.N0.n0(w9.c.a(context, j10, a.o.Slider_thumbColor));
        int i13 = a.o.Slider_thumbStrokeColor;
        if (j10.hasValue(i13)) {
            setThumbStrokeColor(w9.c.a(context, j10, i13));
        }
        setThumbStrokeWidth(j10.getDimension(a.o.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a12 = w9.c.a(context, j10, a.o.Slider_haloColor);
        if (a12 == null) {
            a12 = g.a.c(context, a.e.material_slider_halo_color);
        }
        setHaloTintList(a12);
        this.D0 = j10.getBoolean(a.o.Slider_tickVisible, true);
        int i14 = a.o.Slider_tickColor;
        boolean hasValue2 = j10.hasValue(i14);
        int i15 = hasValue2 ? i14 : a.o.Slider_tickColorInactive;
        if (!hasValue2) {
            i14 = a.o.Slider_tickColorActive;
        }
        ColorStateList a13 = w9.c.a(context, j10, i15);
        if (a13 == null) {
            a13 = g.a.c(context, a.e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a13);
        ColorStateList a14 = w9.c.a(context, j10, i14);
        if (a14 == null) {
            a14 = g.a.c(context, a.e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a14);
        setThumbRadius(j10.getDimensionPixelSize(a.o.Slider_thumbRadius, 0));
        setHaloRadius(j10.getDimensionPixelSize(a.o.Slider_haloRadius, 0));
        setThumbElevation(j10.getDimension(a.o.Slider_thumbElevation, 0.0f));
        setTrackHeight(j10.getDimensionPixelSize(a.o.Slider_trackHeight, 0));
        this.f17323l0 = j10.getInt(a.o.Slider_labelBehavior, 0);
        if (!j10.getBoolean(a.o.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        j10.recycle();
    }

    public void b0(@m0 L l10) {
        this.f17314c0.remove(l10);
    }

    public void c0(@m0 T t10) {
        this.f17315d0.remove(t10);
    }

    public final void d0(int i10) {
        BaseSlider<S, L, T>.d dVar = this.W;
        if (dVar == null) {
            this.W = new d(this, (a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.W.a(i10);
        postDelayed(this.W, 200);
    }

    public boolean dispatchHoverEvent(@m0 MotionEvent motionEvent) {
        return this.U.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(@m0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.O.setColor(G(this.M0));
        this.P.setColor(G(this.L0));
        this.S.setColor(G(this.K0));
        this.T.setColor(G(this.J0));
        for (da.a next : this.f17313b0) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.N0.isStateful()) {
            this.N0.setState(getDrawableState());
        }
        this.R.setColor(G(this.I0));
        this.R.setAlpha(63);
    }

    public final void e0(da.a aVar, float f10) {
        aVar.l1(D(f10));
        int T2 = (this.f17325n0 + ((int) (T(f10) * ((float) this.E0)))) - (aVar.getIntrinsicWidth() / 2);
        int n10 = n() - (this.f17329r0 + this.f17327p0);
        aVar.setBounds(T2, n10 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + T2, n10);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.c.c(v.f(this), this, rect);
        aVar.setBounds(rect);
        v.g(this).a(aVar);
    }

    public final boolean f0() {
        return this.F0 || !(getBackground() instanceof RippleDrawable);
    }

    public final boolean g0(float f10) {
        return i0(this.f17337z0, f10);
    }

    @m0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @g1
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.U.x();
    }

    public int getActiveThumbIndex() {
        return this.f17337z0;
    }

    public int getFocusedThumbIndex() {
        return this.A0;
    }

    @q
    public int getHaloRadius() {
        return this.f17328q0;
    }

    @m0
    public ColorStateList getHaloTintList() {
        return this.I0;
    }

    public int getLabelBehavior() {
        return this.f17323l0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.B0;
    }

    public float getThumbElevation() {
        return this.N0.x();
    }

    @q
    public int getThumbRadius() {
        return this.f17327p0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.N0.M();
    }

    public float getThumbStrokeWidth() {
        return this.N0.P();
    }

    @m0
    public ColorStateList getThumbTintList() {
        return this.N0.y();
    }

    @m0
    public ColorStateList getTickActiveTintList() {
        return this.J0;
    }

    @m0
    public ColorStateList getTickInactiveTintList() {
        return this.K0;
    }

    @m0
    public ColorStateList getTickTintList() {
        if (this.K0.equals(this.J0)) {
            return this.J0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @m0
    public ColorStateList getTrackActiveTintList() {
        return this.L0;
    }

    @q
    public int getTrackHeight() {
        return this.f17324m0;
    }

    @m0
    public ColorStateList getTrackInactiveTintList() {
        return this.M0;
    }

    @q
    public int getTrackSidePadding() {
        return this.f17325n0;
    }

    @m0
    public ColorStateList getTrackTintList() {
        if (this.M0.equals(this.L0)) {
            return this.L0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @q
    public int getTrackWidth() {
        return this.E0;
    }

    public float getValueFrom() {
        return this.f17334w0;
    }

    public float getValueTo() {
        return this.f17335x0;
    }

    @m0
    public List<Float> getValues() {
        return new ArrayList(this.f17336y0);
    }

    public void h(@o0 L l10) {
        this.f17314c0.add(l10);
    }

    public final double h0(float f10) {
        float f11 = this.B0;
        if (f11 <= 0.0f) {
            return (double) f10;
        }
        int i10 = (int) ((this.f17335x0 - this.f17334w0) / f11);
        return ((double) Math.round(f10 * ((float) i10))) / ((double) i10);
    }

    public void i(@m0 T t10) {
        this.f17315d0.add(t10);
    }

    public final boolean i0(int i10, float f10) {
        if (((double) Math.abs(f10 - this.f17336y0.get(i10).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f17336y0.set(i10, Float.valueOf(F(i10, f10)));
        this.A0 = i10;
        u(i10);
        return true;
    }

    public final void j(da.a aVar) {
        aVar.j1(v.f(this));
    }

    public final boolean j0() {
        return g0(getValueOfTouchPosition());
    }

    public final Float k(int i10) {
        float m10 = this.G0 ? m(20) : l();
        if (i10 == 21) {
            if (!K()) {
                m10 = -m10;
            }
            return Float.valueOf(m10);
        } else if (i10 == 22) {
            if (K()) {
                m10 = -m10;
            }
            return Float.valueOf(m10);
        } else if (i10 == 69) {
            return Float.valueOf(-m10);
        } else {
            if (i10 == 70 || i10 == 81) {
                return Float.valueOf(m10);
            }
            return null;
        }
    }

    public void k0(int i10, Rect rect) {
        int T2 = this.f17325n0 + ((int) (T(getValues().get(i10).floatValue()) * ((float) this.E0)));
        int n10 = n();
        int i11 = this.f17327p0;
        rect.set(T2 - i11, n10 - i11, T2 + i11, n10 + i11);
    }

    public final float l() {
        float f10 = this.B0;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void l0() {
        if (!f0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int T2 = (int) ((T(this.f17336y0.get(this.A0).floatValue()) * ((float) this.E0)) + ((float) this.f17325n0));
                int n10 = n();
                int i10 = this.f17328q0;
                o0.d.l(background, T2 - i10, n10 - i10, T2 + i10, n10 + i10);
            }
        }
    }

    public final float m(int i10) {
        float l10 = l();
        float f10 = (this.f17335x0 - this.f17334w0) / l10;
        float f11 = (float) i10;
        return f10 <= f11 ? l10 : ((float) Math.round(f10 / f11)) * l10;
    }

    public final void m0(int i10) {
        this.E0 = Math.max(i10 - (this.f17325n0 * 2), 0);
        N();
    }

    public final int n() {
        int i10 = this.f17326o0;
        int i11 = 0;
        if (this.f17323l0 == 1) {
            i11 = this.f17313b0.get(0).getIntrinsicHeight();
        }
        return i10 + i11;
    }

    public final void n0() {
        if (this.H0) {
            p0();
            q0();
            o0();
            r0();
            u0();
            this.H0 = false;
        }
    }

    public void o() {
        this.f17314c0.clear();
    }

    public final void o0() {
        if (this.B0 > 0.0f && !s0(this.f17335x0)) {
            throw new IllegalStateException(String.format(V0, new Object[]{Float.toString(this.B0), Float.toString(this.f17334w0), Float.toString(this.f17335x0)}));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (da.a j10 : this.f17313b0) {
            j(j10);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.W;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f17316e0 = false;
        for (da.a s10 : this.f17313b0) {
            s(s10);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@m0 Canvas canvas) {
        if (this.H0) {
            n0();
            N();
        }
        super.onDraw(canvas);
        int n10 = n();
        x(canvas, this.E0, n10);
        if (((Float) Collections.max(getValues())).floatValue() > this.f17334w0) {
            w(canvas, this.E0, n10);
        }
        P(canvas);
        if ((this.f17333v0 || isFocused()) && isEnabled()) {
            O(canvas, this.E0, n10);
            if (this.f17337z0 != -1) {
                z();
            }
        }
        y(canvas, this.E0, n10);
    }

    public void onFocusChanged(boolean z10, int i10, @o0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10) {
            this.f17337z0 = -1;
            A();
            this.U.o(this.A0);
            return;
        }
        B(i10);
        this.U.X(this.A0);
    }

    public boolean onKeyDown(int i10, @m0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.f17336y0.size() == 1) {
            this.f17337z0 = 0;
        }
        if (this.f17337z0 == -1) {
            Boolean U2 = U(i10, keyEvent);
            return U2 != null ? U2.booleanValue() : super.onKeyDown(i10, keyEvent);
        }
        this.G0 |= keyEvent.isLongPress();
        Float k10 = k(i10);
        if (k10 != null) {
            if (g0(this.f17336y0.get(this.f17337z0).floatValue() + k10.floatValue())) {
                l0();
                postInvalidate();
            }
            return true;
        }
        if (i10 != 23) {
            if (i10 != 61) {
                if (i10 != 66) {
                    return super.onKeyDown(i10, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return R(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return R(-1);
                }
                return false;
            }
        }
        this.f17337z0 = -1;
        A();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i10, @m0 KeyEvent keyEvent) {
        this.G0 = false;
        return super.onKeyUp(i10, keyEvent);
    }

    public void onMeasure(int i10, int i11) {
        int i12 = this.f17322k0;
        int i13 = 0;
        if (this.f17323l0 == 1) {
            i13 = this.f17313b0.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12 + i13, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f17334w0 = sliderState.O;
        this.f17335x0 = sliderState.P;
        setValuesInternal(sliderState.Q);
        this.B0 = sliderState.R;
        if (sliderState.S) {
            requestFocus();
        }
        v();
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.O = this.f17334w0;
        sliderState.P = this.f17335x0;
        sliderState.Q = new ArrayList<>(this.f17336y0);
        sliderState.R = this.B0;
        sliderState.S = hasFocus();
        return sliderState;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        m0(i10);
        l0();
    }

    public boolean onTouchEvent(@m0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float f10 = (x10 - ((float) this.f17325n0)) / ((float) this.E0);
        this.O0 = f10;
        float max = Math.max(0.0f, f10);
        this.O0 = max;
        this.O0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f17333v0 = false;
                MotionEvent motionEvent2 = this.f17331t0;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f17331t0.getX() - motionEvent.getX()) <= ((float) this.f17319h0) && Math.abs(this.f17331t0.getY() - motionEvent.getY()) <= ((float) this.f17319h0) && Y()) {
                    V();
                }
                if (this.f17337z0 != -1) {
                    j0();
                    this.f17337z0 = -1;
                    W();
                }
                A();
            } else if (actionMasked == 2) {
                if (!this.f17333v0) {
                    if (J() && Math.abs(x10 - this.f17330s0) < ((float) this.f17319h0)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    V();
                }
                if (Y()) {
                    this.f17333v0 = true;
                    j0();
                    l0();
                }
            }
            invalidate();
        } else {
            this.f17330s0 = x10;
            if (!J()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (Y()) {
                    requestFocus();
                    this.f17333v0 = true;
                    j0();
                    l0();
                    invalidate();
                    V();
                }
            }
        }
        setPressed(this.f17333v0);
        this.f17331t0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void p() {
        this.f17315d0.clear();
    }

    public final void p0() {
        if (this.f17334w0 >= this.f17335x0) {
            throw new IllegalStateException(String.format(T0, new Object[]{Float.toString(this.f17334w0), Float.toString(this.f17335x0)}));
        }
    }

    public final ValueAnimator q(boolean z10) {
        float f10 = 0.0f;
        float E = E(z10 ? this.f17318g0 : this.f17317f0, z10 ? 0.0f : 1.0f);
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{E, f10});
        ofFloat.setDuration(z10 ? 83 : 117);
        ofFloat.setInterpolator(z10 ? j9.a.f19832e : j9.a.f19830c);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public final void q0() {
        if (this.f17335x0 <= this.f17334w0) {
            throw new IllegalStateException(String.format(U0, new Object[]{Float.toString(this.f17335x0), Float.toString(this.f17334w0)}));
        }
    }

    public final void r() {
        if (this.f17313b0.size() > this.f17336y0.size()) {
            List<da.a> subList = this.f17313b0.subList(this.f17336y0.size(), this.f17313b0.size());
            for (da.a next : subList) {
                if (w1.N0(this)) {
                    s(next);
                }
            }
            subList.clear();
        }
        while (this.f17313b0.size() < this.f17336y0.size()) {
            da.a a10 = this.f17312a0.a();
            this.f17313b0.add(a10);
            if (w1.N0(this)) {
                j(a10);
            }
        }
        int i10 = 1;
        if (this.f17313b0.size() == 1) {
            i10 = 0;
        }
        for (da.a H02 : this.f17313b0) {
            H02.H0((float) i10);
        }
    }

    public final void r0() {
        Iterator<Float> it = this.f17336y0.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f17334w0 || next.floatValue() > this.f17335x0) {
                throw new IllegalStateException(String.format(R0, new Object[]{Float.toString(next.floatValue()), Float.toString(this.f17334w0), Float.toString(this.f17335x0)}));
            } else if (this.B0 > 0.0f && !s0(next.floatValue())) {
                throw new IllegalStateException(String.format(S0, new Object[]{Float.toString(next.floatValue()), Float.toString(this.f17334w0), Float.toString(this.B0), Float.toString(this.B0)}));
            }
        }
    }

    public final void s(da.a aVar) {
        u g10 = v.g(this);
        if (g10 != null) {
            g10.b(aVar);
            aVar.W0(v.f(this));
        }
    }

    public final boolean s0(float f10) {
        double doubleValue = new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.f17334w0))).divide(new BigDecimal(Float.toString(this.B0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public void setActiveThumbIndex(int i10) {
        this.f17337z0 = i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setLayerType(z10 ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 < 0 || i10 >= this.f17336y0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.A0 = i10;
        this.U.X(i10);
        postInvalidate();
    }

    public void setHaloRadius(@q @e0(from = 0) int i10) {
        if (i10 != this.f17328q0) {
            this.f17328q0 = i10;
            Drawable background = getBackground();
            if (f0() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                q9.a.b((RippleDrawable) background, this.f17328q0);
            }
        }
    }

    public void setHaloRadiusResource(@p int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setHaloTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.I0)) {
            this.I0 = colorStateList;
            Drawable background = getBackground();
            if (f0() || !(background instanceof RippleDrawable)) {
                this.R.setColor(G(colorStateList));
                this.R.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i10) {
        if (this.f17323l0 != i10) {
            this.f17323l0 = i10;
            requestLayout();
        }
    }

    public void setLabelFormatter(@o0 d dVar) {
        this.f17332u0 = dVar;
    }

    public void setSeparationUnit(int i10) {
        this.P0 = i10;
    }

    public void setStepSize(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException(String.format(V0, new Object[]{Float.toString(f10), Float.toString(this.f17334w0), Float.toString(this.f17335x0)}));
        } else if (this.B0 != f10) {
            this.B0 = f10;
            this.H0 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f10) {
        this.N0.m0(f10);
    }

    public void setThumbElevationResource(@p int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    public void setThumbRadius(@q @e0(from = 0) int i10) {
        if (i10 != this.f17327p0) {
            this.f17327p0 = i10;
            Q();
            this.N0.setShapeAppearanceModel(o.a().q(0, (float) this.f17327p0).m());
            j jVar = this.N0;
            int i11 = this.f17327p0;
            jVar.setBounds(0, 0, i11 * 2, i11 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(@p int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    public void setThumbStrokeColor(@o0 ColorStateList colorStateList) {
        this.N0.E0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@d.n int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(g.a.c(getContext(), i10));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.N0.H0(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@p int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.N0.y())) {
            this.N0.n0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.J0)) {
            this.J0 = colorStateList;
            this.T.setColor(G(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.K0)) {
            this.K0 = colorStateList;
            this.S.setColor(G(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@m0 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.D0 != z10) {
            this.D0 = z10;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.L0)) {
            this.L0 = colorStateList;
            this.P.setColor(G(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(@q @e0(from = 0) int i10) {
        if (this.f17324m0 != i10) {
            this.f17324m0 = i10;
            I();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@m0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.M0)) {
            this.M0 = colorStateList;
            this.O.setColor(G(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@m0 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.f17334w0 = f10;
        this.H0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.f17335x0 = f10;
        this.H0 = true;
        postInvalidate();
    }

    public void setValues(@m0 List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }

    public void setValues(@m0 Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public final float t(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - ((float) this.f17325n0)) / ((float) this.E0);
        float f12 = this.f17334w0;
        return (f11 * (f12 - this.f17335x0)) + f12;
    }

    public final float t0(float f10) {
        return (T(f10) * ((float) this.E0)) + ((float) this.f17325n0);
    }

    public final void u(int i10) {
        for (L a10 : this.f17314c0) {
            a10.a(this, this.f17336y0.get(i10).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.V;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            d0(i10);
        }
    }

    public final void u0() {
        float f10 = this.B0;
        if (f10 != 0.0f) {
            if (((float) ((int) f10)) != f10) {
                String.format(W0, new Object[]{"stepSize", Float.valueOf(f10)});
            }
            float f11 = this.f17334w0;
            if (((float) ((int) f11)) != f11) {
                String.format(W0, new Object[]{"valueFrom", Float.valueOf(f11)});
            }
            float f12 = this.f17335x0;
            if (((float) ((int) f12)) != f12) {
                String.format(W0, new Object[]{"valueTo", Float.valueOf(f12)});
            }
        }
    }

    public final void v() {
        for (L l10 : this.f17314c0) {
            Iterator<Float> it = this.f17336y0.iterator();
            while (it.hasNext()) {
                l10.a(this, it.next().floatValue(), false);
            }
        }
    }

    public final void w(@m0 Canvas canvas, int i10, int i11) {
        float[] activeRange = getActiveRange();
        int i12 = this.f17325n0;
        float f10 = (float) i10;
        float f11 = (float) i11;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i12) + (activeRange[0] * f10), f11, ((float) i12) + (activeRange[1] * f10), f11, this.P);
    }

    public final void x(@m0 Canvas canvas, int i10, int i11) {
        float[] activeRange = getActiveRange();
        int i12 = this.f17325n0;
        float f10 = (float) i10;
        float f11 = ((float) i12) + (activeRange[1] * f10);
        if (f11 < ((float) (i12 + i10))) {
            float f12 = (float) i11;
            canvas.drawLine(f11, f12, (float) (i12 + i10), f12, this.O);
        }
        int i13 = this.f17325n0;
        float f13 = ((float) i13) + (activeRange[0] * f10);
        if (f13 > ((float) i13)) {
            float f14 = (float) i11;
            canvas.drawLine((float) i13, f14, f13, f14, this.O);
        }
    }

    public final void y(@m0 Canvas canvas, int i10, int i11) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f17336y0.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f17325n0) + (T(it.next().floatValue()) * ((float) i10)), (float) i11, (float) this.f17327p0, this.Q);
            }
        }
        Iterator<Float> it2 = this.f17336y0.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int T2 = this.f17325n0 + ((int) (T(it2.next().floatValue()) * ((float) i10)));
            int i12 = this.f17327p0;
            canvas.translate((float) (T2 - i12), (float) (i11 - i12));
            this.N0.draw(canvas);
            canvas.restore();
        }
    }

    public final void z() {
        if (this.f17323l0 != 2) {
            if (!this.f17316e0) {
                this.f17316e0 = true;
                ValueAnimator q10 = q(true);
                this.f17317f0 = q10;
                this.f17318g0 = null;
                q10.start();
            }
            Iterator<da.a> it = this.f17313b0.iterator();
            for (int i10 = 0; i10 < this.f17336y0.size() && it.hasNext(); i10++) {
                if (i10 != this.A0) {
                    e0(it.next(), this.f17336y0.get(i10).floatValue());
                }
            }
            if (it.hasNext()) {
                e0(it.next(), this.f17336y0.get(this.A0).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f17313b0.size()), Integer.valueOf(this.f17336y0.size())}));
            }
        }
    }
}

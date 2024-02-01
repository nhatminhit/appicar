package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import d.a1;
import d.m0;
import d.o0;
import d.v;
import f1.w1;
import g1.z;
import i9.a;
import java.util.Arrays;
import w9.c;

class ClockFaceView extends d implements ClockHandView.d {
    public static final float M0 = 0.001f;
    public static final int N0 = 12;
    public static final String O0 = "";
    public final ClockHandView B0;
    public final Rect C0;
    public final RectF D0;
    public final SparseArray<TextView> E0;
    public final f1.a F0;
    public final int[] G0;
    public final float[] H0;
    public final int I0;
    public String[] J0;
    public float K0;
    public final ColorStateList L0;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.J(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.B0.g()) - ClockFaceView.this.I0);
            return true;
        }
    }

    public class b extends f1.a {
        public b() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            int intValue = ((Integer) view.getTag(a.h.material_value_index)).intValue();
            if (intValue > 0) {
                zVar.O1((View) ClockFaceView.this.E0.get(intValue - 1));
            }
            zVar.X0(z.c.h(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockFaceView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C0 = new Rect();
        this.D0 = new RectF();
        this.E0 = new SparseArray<>();
        this.H0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ClockFaceView, i10, a.n.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, a.o.ClockFaceView_clockNumberTextColor);
        this.L0 = a10;
        LayoutInflater.from(context).inflate(a.k.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(a.h.material_clock_hand);
        this.B0 = clockHandView;
        this.I0 = resources.getDimensionPixelSize(a.f.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.G0 = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = g.a.c(context, a.e.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, a.o.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.F0 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
    }

    public void J(int i10) {
        if (i10 != I()) {
            super.J(i10);
            this.B0.k(I());
        }
    }

    public final void Q() {
        RectF d10 = this.B0.d();
        for (int i10 = 0; i10 < this.E0.size(); i10++) {
            TextView textView = this.E0.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.C0);
                this.C0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.C0);
                this.D0.set(this.C0);
                textView.getPaint().setShader(R(d10, this.D0));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient R(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.D0.left, rectF.centerY() - this.D0.top, rectF.width() * 0.5f, this.G0, this.H0, Shader.TileMode.CLAMP);
    }

    public final void S(@a1 int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.E0.size();
        for (int i11 = 0; i11 < Math.max(this.J0.length, size); i11++) {
            TextView textView = this.E0.get(i11);
            if (i11 >= this.J0.length) {
                removeView(textView);
                this.E0.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(a.k.material_clockface_textview, this, false);
                    this.E0.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.J0[i11]);
                textView.setTag(a.h.material_value_index, Integer.valueOf(i11));
                w1.z1(textView, this.F0);
                textView.setTextColor(this.L0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, new Object[]{this.J0[i11]}));
                }
            }
        }
    }

    public void c(String[] strArr, @a1 int i10) {
        this.J0 = strArr;
        S(i10);
    }

    public void d(float f10, boolean z10) {
        if (Math.abs(this.K0 - f10) > 0.001f) {
            this.K0 = f10;
            Q();
        }
    }

    public void f(@v(from = 0.0d, to = 360.0d) float f10) {
        this.B0.l(f10);
        Q();
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.V1(accessibilityNodeInfo).W0(z.b.f(1, this.J0.length, false, 1));
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Q();
    }
}

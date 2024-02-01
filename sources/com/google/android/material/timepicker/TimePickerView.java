package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import d.a1;
import d.m0;
import d.o0;
import f1.w1;
import i9.a;
import java.util.Locale;

class TimePickerView extends ConstraintLayout implements g {
    public final ClockFaceView A0;
    public final MaterialButtonToggleGroup B0;
    public final View.OnClickListener C0;
    public f D0;
    public g E0;
    public e F0;

    /* renamed from: x0  reason: collision with root package name */
    public final Chip f17651x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Chip f17652y0;

    /* renamed from: z0  reason: collision with root package name */
    public final ClockHandView f17653z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.E0 != null) {
                TimePickerView.this.E0.f(((Integer) view.getTag(a.h.selection_type)).intValue());
            }
        }
    }

    public class b implements MaterialButtonToggleGroup.e {
        public b() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == a.h.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.D0 != null && z10) {
                TimePickerView.this.D0.e(i11);
            }
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.F0 != null) {
                TimePickerView.this.F0.a();
            }
            return onDoubleTap;
        }
    }

    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector O;

        public d(GestureDetector gestureDetector) {
            this.O = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.O.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface e {
        void a();
    }

    public interface f {
        void e(int i10);
    }

    public interface g {
        void f(int i10);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TimePickerView(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C0 = new a();
        LayoutInflater.from(context).inflate(a.k.material_timepicker, this);
        this.A0 = (ClockFaceView) findViewById(a.h.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(a.h.material_clock_period_toggle);
        this.B0 = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.f17651x0 = (Chip) findViewById(a.h.material_minute_tv);
        this.f17652y0 = (Chip) findViewById(a.h.material_hour_tv);
        this.f17653z0 = (ClockHandView) findViewById(a.h.material_clock_hand);
        U();
        T();
    }

    public void K(ClockHandView.d dVar) {
        this.f17653z0.b(dVar);
    }

    public void L(boolean z10) {
        this.f17653z0.j(z10);
    }

    public void M(float f10, boolean z10) {
        this.f17653z0.m(f10, z10);
    }

    public void N(f1.a aVar) {
        w1.z1(this.f17651x0, aVar);
    }

    public void O(f1.a aVar) {
        w1.z1(this.f17652y0, aVar);
    }

    public void P(ClockHandView.c cVar) {
        this.f17653z0.o(cVar);
    }

    public void Q(@o0 e eVar) {
        this.F0 = eVar;
    }

    public void R(f fVar) {
        this.D0 = fVar;
    }

    public void S(g gVar) {
        this.E0 = gVar;
    }

    public final void T() {
        Chip chip = this.f17651x0;
        int i10 = a.h.selection_type;
        chip.setTag(i10, 12);
        this.f17652y0.setTag(i10, 10);
        this.f17651x0.setOnClickListener(this.C0);
        this.f17652y0.setOnClickListener(this.C0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void U() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f17651x0.setOnTouchListener(dVar);
        this.f17652y0.setOnTouchListener(dVar);
    }

    public void V() {
        this.B0.setVisibility(0);
    }

    public final void W() {
        if (this.B0.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.A(this);
            int i10 = 1;
            if (w1.X(this) == 0) {
                i10 = 2;
            }
            dVar.y(a.h.material_clock_display, i10);
            dVar.l(this);
        }
    }

    public void a(int i10) {
        boolean z10 = true;
        this.f17651x0.setChecked(i10 == 12);
        Chip chip = this.f17652y0;
        if (i10 != 10) {
            z10 = false;
        }
        chip.setChecked(z10);
    }

    @SuppressLint({"DefaultLocale"})
    public void b(int i10, int i11, int i12) {
        this.B0.j(i10 == 1 ? a.h.material_clock_period_pm_button : a.h.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.V, new Object[]{Integer.valueOf(i12)});
        String format2 = String.format(locale, TimeModel.V, new Object[]{Integer.valueOf(i11)});
        this.f17651x0.setText(format);
        this.f17652y0.setText(format2);
    }

    public void c(String[] strArr, @a1 int i10) {
        this.A0.c(strArr, i10);
    }

    public void f(float f10) {
        this.f17653z0.l(f10);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        W();
    }

    public void onVisibilityChanged(@m0 View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            W();
        }
    }
}

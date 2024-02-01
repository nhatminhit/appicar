package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import d.a1;
import d.e0;
import d.m0;
import d.o0;
import d.u;
import i9.a;
import java.util.LinkedHashSet;
import java.util.Set;
import z9.j;

public final class MaterialTimePicker extends DialogFragment {
    public static final int M1 = 0;
    public static final int N1 = 1;
    public static final String O1 = "TIME_PICKER_TIME_MODEL";
    public static final String P1 = "TIME_PICKER_INPUT_MODE";
    public static final String Q1 = "TIME_PICKER_TITLE_RES";
    public static final String R1 = "TIME_PICKER_TITLE_TEXT";
    public LinearLayout A1;
    public ViewStub B1;
    @o0
    public f C1;
    @o0
    public j D1;
    @o0
    public h E1;
    @u
    public int F1;
    @u
    public int G1;
    public int H1 = 0;
    public String I1;
    public MaterialButton J1;
    public int K1 = 0;
    public TimeModel L1;

    /* renamed from: v1  reason: collision with root package name */
    public final Set<View.OnClickListener> f17641v1 = new LinkedHashSet();

    /* renamed from: w1  reason: collision with root package name */
    public final Set<View.OnClickListener> f17642w1 = new LinkedHashSet();

    /* renamed from: x1  reason: collision with root package name */
    public final Set<DialogInterface.OnCancelListener> f17643x1 = new LinkedHashSet();

    /* renamed from: y1  reason: collision with root package name */
    public final Set<DialogInterface.OnDismissListener> f17644y1 = new LinkedHashSet();

    /* renamed from: z1  reason: collision with root package name */
    public TimePickerView f17645z1;

    public class a implements TimePickerView.e {
        public a() {
        }

        public void a() {
            int unused = MaterialTimePicker.this.K1 = 1;
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.s1(materialTimePicker.J1);
            MaterialTimePicker.this.D1.i();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.f17641v1) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.f17642w1) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            int unused = materialTimePicker.K1 = materialTimePicker.K1 == 0 ? 1 : 0;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.s1(materialTimePicker2.J1);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public TimeModel f17647a = new TimeModel();

        /* renamed from: b  reason: collision with root package name */
        public int f17648b;

        /* renamed from: c  reason: collision with root package name */
        public int f17649c = 0;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f17650d;

        @m0
        public MaterialTimePicker e() {
            return MaterialTimePicker.m1(this);
        }

        @m0
        public e f(@e0(from = 0, to = 23) int i10) {
            this.f17647a.h(i10);
            return this;
        }

        @m0
        public e g(int i10) {
            this.f17648b = i10;
            return this;
        }

        @m0
        public e h(@e0(from = 0, to = 60) int i10) {
            this.f17647a.j(i10);
            return this;
        }

        @m0
        public e i(int i10) {
            TimeModel timeModel = this.f17647a;
            int i11 = timeModel.R;
            int i12 = timeModel.S;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f17647a = timeModel2;
            timeModel2.j(i12);
            this.f17647a.h(i11);
            return this;
        }

        @m0
        public e j(@a1 int i10) {
            this.f17649c = i10;
            return this;
        }

        @m0
        public e k(@o0 CharSequence charSequence) {
            this.f17650d = charSequence;
            return this;
        }
    }

    @m0
    public static MaterialTimePicker m1(@m0 e eVar) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(O1, eVar.f17647a);
        bundle.putInt(P1, eVar.f17648b);
        bundle.putInt(Q1, eVar.f17649c);
        if (eVar.f17650d != null) {
            bundle.putString(R1, eVar.f17650d.toString());
        }
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    public boolean Y0(@m0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f17643x1.add(onCancelListener);
    }

    public boolean Z0(@m0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f17644y1.add(onDismissListener);
    }

    public boolean a1(@m0 View.OnClickListener onClickListener) {
        return this.f17642w1.add(onClickListener);
    }

    public boolean b1(@m0 View.OnClickListener onClickListener) {
        return this.f17641v1.add(onClickListener);
    }

    public void c1() {
        this.f17643x1.clear();
    }

    public void d1() {
        this.f17644y1.clear();
    }

    public void e1() {
        this.f17642w1.clear();
    }

    public void f1() {
        this.f17641v1.clear();
    }

    public final Pair<Integer, Integer> g1(int i10) {
        if (i10 == 0) {
            return new Pair<>(Integer.valueOf(this.F1), Integer.valueOf(a.m.material_timepicker_text_input_mode_description));
        }
        if (i10 == 1) {
            return new Pair<>(Integer.valueOf(this.G1), Integer.valueOf(a.m.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i10);
    }

    @e0(from = 0, to = 23)
    public int h1() {
        return this.L1.R % 24;
    }

    public int i1() {
        return this.K1;
    }

    @e0(from = 0, to = 60)
    public int j1() {
        return this.L1.S;
    }

    @o0
    public f k1() {
        return this.C1;
    }

    public final h l1(int i10) {
        if (i10 == 0) {
            f fVar = this.C1;
            if (fVar == null) {
                fVar = new f(this.f17645z1, this.L1);
            }
            this.C1 = fVar;
            return fVar;
        }
        if (this.D1 == null) {
            LinearLayout linearLayout = (LinearLayout) this.B1.inflate();
            this.A1 = linearLayout;
            this.D1 = new j(linearLayout, this.L1);
        }
        this.D1.e();
        return this.D1;
    }

    public boolean n1(@m0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f17643x1.remove(onCancelListener);
    }

    public boolean o1(@m0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f17644y1.remove(onDismissListener);
    }

    public final void onCancel(@m0 DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f17643x1) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        r1(bundle);
    }

    @m0
    public final Dialog onCreateDialog(@o0 Bundle bundle) {
        TypedValue a10 = w9.b.a(requireContext(), a.c.materialTimePickerTheme);
        Dialog dialog = new Dialog(requireContext(), a10 == null ? 0 : a10.data);
        Context context = dialog.getContext();
        int f10 = w9.b.f(context, a.c.colorSurface, MaterialTimePicker.class.getCanonicalName());
        int i10 = a.c.materialTimePickerStyle;
        int i11 = a.n.Widget_MaterialComponents_TimePicker;
        j jVar = new j(context, (AttributeSet) null, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.o.MaterialTimePicker, i10, i11);
        this.G1 = obtainStyledAttributes.getResourceId(a.o.MaterialTimePicker_clockIcon, 0);
        this.F1 = obtainStyledAttributes.getResourceId(a.o.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        jVar.Y(context);
        jVar.n0(ColorStateList.valueOf(f10));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    @m0
    public final View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(a.k.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(a.h.material_timepicker_view);
        this.f17645z1 = timePickerView;
        timePickerView.Q(new a());
        this.B1 = (ViewStub) viewGroup2.findViewById(a.h.material_textinput_timepicker);
        this.J1 = (MaterialButton) viewGroup2.findViewById(a.h.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(a.h.header_title);
        if (!TextUtils.isEmpty(this.I1)) {
            textView.setText(this.I1);
        }
        int i10 = this.H1;
        if (i10 != 0) {
            textView.setText(i10);
        }
        s1(this.J1);
        ((Button) viewGroup2.findViewById(a.h.material_timepicker_ok_button)).setOnClickListener(new b());
        ((Button) viewGroup2.findViewById(a.h.material_timepicker_cancel_button)).setOnClickListener(new c());
        this.J1.setOnClickListener(new d());
        return viewGroup2;
    }

    public final void onDismiss(@m0 DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f17644y1) {
            onDismiss.onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(@m0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(O1, this.L1);
        bundle.putInt(P1, this.K1);
        bundle.putInt(Q1, this.H1);
        bundle.putString(R1, this.I1);
    }

    public boolean p1(@m0 View.OnClickListener onClickListener) {
        return this.f17642w1.remove(onClickListener);
    }

    public boolean q1(@m0 View.OnClickListener onClickListener) {
        return this.f17641v1.remove(onClickListener);
    }

    public final void r1(@o0 Bundle bundle) {
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable(O1);
            this.L1 = timeModel;
            if (timeModel == null) {
                this.L1 = new TimeModel();
            }
            this.K1 = bundle.getInt(P1, 0);
            this.H1 = bundle.getInt(Q1, 0);
            this.I1 = bundle.getString(R1);
        }
    }

    public final void s1(MaterialButton materialButton) {
        h hVar = this.E1;
        if (hVar != null) {
            hVar.g();
        }
        h l12 = l1(this.K1);
        this.E1 = l12;
        l12.a();
        this.E1.invalidate();
        Pair<Integer, Integer> g12 = g1(this.K1);
        materialButton.setIconResource(((Integer) g12.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) g12.second).intValue()));
    }
}

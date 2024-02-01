package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.u;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import d.a1;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z9.j;

public final class MaterialDatePicker<S> extends DialogFragment {
    public static final String M1 = "OVERRIDE_THEME_RES_ID";
    public static final String N1 = "DATE_SELECTOR_KEY";
    public static final String O1 = "CALENDAR_CONSTRAINTS_KEY";
    public static final String P1 = "TITLE_TEXT_RES_ID_KEY";
    public static final String Q1 = "TITLE_TEXT_KEY";
    public static final String R1 = "INPUT_MODE_KEY";
    public static final Object S1 = "CONFIRM_BUTTON_TAG";
    public static final Object T1 = "CANCEL_BUTTON_TAG";
    public static final Object U1 = "TOGGLE_BUTTON_TAG";
    public static final int V1 = 0;
    public static final int W1 = 1;
    @o0
    public DateSelector<S> A1;
    public j<S> B1;
    @o0
    public CalendarConstraints C1;
    public MaterialCalendar<S> D1;
    @a1
    public int E1;
    public CharSequence F1;
    public boolean G1;
    public int H1;
    public TextView I1;
    public CheckableImageButton J1;
    @o0
    public j K1;
    public Button L1;

    /* renamed from: v1  reason: collision with root package name */
    public final LinkedHashSet<f<? super S>> f16987v1 = new LinkedHashSet<>();

    /* renamed from: w1  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f16988w1 = new LinkedHashSet<>();

    /* renamed from: x1  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f16989x1 = new LinkedHashSet<>();

    /* renamed from: y1  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f16990y1 = new LinkedHashSet<>();
    @b1

    /* renamed from: z1  reason: collision with root package name */
    public int f16991z1;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f16987v1.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(MaterialDatePicker.this.k1());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f16988w1.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    public class c extends i<S> {
        public c() {
        }

        public void a() {
            MaterialDatePicker.this.L1.setEnabled(false);
        }

        public void b(S s10) {
            MaterialDatePicker.this.y1();
            MaterialDatePicker.this.L1.setEnabled(MaterialDatePicker.this.A1.m0());
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            MaterialDatePicker.this.L1.setEnabled(MaterialDatePicker.this.A1.m0());
            MaterialDatePicker.this.J1.toggle();
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.z1(materialDatePicker.J1);
            MaterialDatePicker.this.v1();
        }
    }

    public static final class e<S> {

        /* renamed from: a  reason: collision with root package name */
        public final DateSelector<S> f16993a;

        /* renamed from: b  reason: collision with root package name */
        public int f16994b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CalendarConstraints f16995c;

        /* renamed from: d  reason: collision with root package name */
        public int f16996d = 0;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f16997e = null;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public S f16998f = null;

        /* renamed from: g  reason: collision with root package name */
        public int f16999g = 0;

        public e(DateSelector<S> dateSelector) {
            this.f16993a = dateSelector;
        }

        @x0({x0.a.LIBRARY_GROUP})
        @m0
        public static <S> e<S> c(@m0 DateSelector<S> dateSelector) {
            return new e<>(dateSelector);
        }

        @m0
        public static e<Long> d() {
            return new e<>(new SingleDateSelector());
        }

        @m0
        public static e<e1.j<Long, Long>> e() {
            return new e<>(new RangeDateSelector());
        }

        @m0
        public MaterialDatePicker<S> a() {
            if (this.f16995c == null) {
                this.f16995c = new CalendarConstraints.b().a();
            }
            if (this.f16996d == 0) {
                this.f16996d = this.f16993a.P();
            }
            S s10 = this.f16998f;
            if (s10 != null) {
                this.f16993a.m(s10);
            }
            if (this.f16995c.j() == null) {
                this.f16995c.p(b());
            }
            return MaterialDatePicker.p1(this);
        }

        public final Month b() {
            long j10 = this.f16995c.l().T;
            long j11 = this.f16995c.g().T;
            if (!this.f16993a.H0().isEmpty()) {
                long longValue = this.f16993a.H0().iterator().next().longValue();
                if (longValue >= j10 && longValue <= j11) {
                    return Month.d(longValue);
                }
            }
            long w12 = MaterialDatePicker.w1();
            if (j10 <= w12 && w12 <= j11) {
                j10 = w12;
            }
            return Month.d(j10);
        }

        @m0
        public e<S> f(CalendarConstraints calendarConstraints) {
            this.f16995c = calendarConstraints;
            return this;
        }

        @m0
        public e<S> g(int i10) {
            this.f16999g = i10;
            return this;
        }

        @m0
        public e<S> h(S s10) {
            this.f16998f = s10;
            return this;
        }

        @m0
        public e<S> i(@b1 int i10) {
            this.f16994b = i10;
            return this;
        }

        @m0
        public e<S> j(@a1 int i10) {
            this.f16996d = i10;
            this.f16997e = null;
            return this;
        }

        @m0
        public e<S> k(@o0 CharSequence charSequence) {
            this.f16997e = charSequence;
            this.f16996d = 0;
            return this;
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @m0
    public static Drawable g1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.d(context, a.g.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.d(context, a.g.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    public static int h1(@m0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(a.f.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(a.f.mtrl_calendar_days_of_week_height);
        int i10 = g.T;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(a.f.mtrl_calendar_day_height) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(a.f.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(a.f.mtrl_calendar_bottom_padding);
    }

    public static int j1(@m0 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(a.f.mtrl_calendar_content_padding);
        int i10 = Month.e().R;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(a.f.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(a.f.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean n1(@m0 Context context) {
        return q1(context, 16843277);
    }

    public static boolean o1(@m0 Context context) {
        return q1(context, a.c.nestedScrollable);
    }

    @m0
    public static <S> MaterialDatePicker<S> p1(@m0 e<S> eVar) {
        MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt(M1, eVar.f16994b);
        bundle.putParcelable("DATE_SELECTOR_KEY", eVar.f16993a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", eVar.f16995c);
        bundle.putInt(P1, eVar.f16996d);
        bundle.putCharSequence(Q1, eVar.f16997e);
        bundle.putInt(R1, eVar.f16999g);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    public static boolean q1(@m0 Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w9.b.f(context, a.c.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public static long w1() {
        return Month.e().T;
    }

    public static long x1() {
        return m.t().getTimeInMillis();
    }

    public boolean Y0(DialogInterface.OnCancelListener onCancelListener) {
        return this.f16989x1.add(onCancelListener);
    }

    public boolean Z0(DialogInterface.OnDismissListener onDismissListener) {
        return this.f16990y1.add(onDismissListener);
    }

    public boolean a1(View.OnClickListener onClickListener) {
        return this.f16988w1.add(onClickListener);
    }

    public boolean b1(f<? super S> fVar) {
        return this.f16987v1.add(fVar);
    }

    public void c1() {
        this.f16989x1.clear();
    }

    public void d1() {
        this.f16990y1.clear();
    }

    public void e1() {
        this.f16988w1.clear();
    }

    public void f1() {
        this.f16987v1.clear();
    }

    public String i1() {
        return this.A1.i(getContext());
    }

    @o0
    public final S k1() {
        return this.A1.T0();
    }

    public final int l1(Context context) {
        int i10 = this.f16991z1;
        return i10 != 0 ? i10 : this.A1.c0(context);
    }

    public final void m1(Context context) {
        this.J1.setTag(U1);
        this.J1.setImageDrawable(g1(context));
        this.J1.setChecked(this.H1 != 0);
        w1.z1(this.J1, (f1.a) null);
        z1(this.J1);
        this.J1.setOnClickListener(new d());
    }

    public final void onCancel(@m0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f16989x1.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16991z1 = bundle.getInt(M1);
        this.A1 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.C1 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.E1 = bundle.getInt(P1);
        this.F1 = bundle.getCharSequence(Q1);
        this.H1 = bundle.getInt(R1);
    }

    @m0
    public final Dialog onCreateDialog(@o0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), l1(requireContext()));
        Context context = dialog.getContext();
        this.G1 = n1(context);
        int f10 = w9.b.f(context, a.c.colorSurface, MaterialDatePicker.class.getCanonicalName());
        j jVar = new j(context, (AttributeSet) null, a.c.materialCalendarStyle, a.n.Widget_MaterialComponents_MaterialCalendar);
        this.K1 = jVar;
        jVar.Y(context);
        this.K1.n0(ColorStateList.valueOf(f10));
        this.K1.m0(w1.P(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @m0
    public final View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        View inflate = layoutInflater.inflate(this.G1 ? a.k.mtrl_picker_fullscreen : a.k.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.G1) {
            inflate.findViewById(a.h.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(j1(context), -2));
        } else {
            View findViewById = inflate.findViewById(a.h.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(a.h.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(j1(context), -1));
            findViewById2.setMinimumHeight(h1(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(a.h.mtrl_picker_header_selection_text);
        this.I1 = textView;
        w1.B1(textView, 1);
        this.J1 = (CheckableImageButton) inflate.findViewById(a.h.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(a.h.mtrl_picker_title_text);
        CharSequence charSequence = this.F1;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.E1);
        }
        m1(context);
        this.L1 = (Button) inflate.findViewById(a.h.confirm_button);
        if (this.A1.m0()) {
            this.L1.setEnabled(true);
        } else {
            this.L1.setEnabled(false);
        }
        this.L1.setTag(S1);
        this.L1.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(a.h.cancel_button);
        button.setTag(T1);
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(@m0 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f16990y1.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(@m0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(M1, this.f16991z1);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A1);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.C1);
        if (this.D1.Y0() != null) {
            bVar.c(this.D1.Y0().T);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt(P1, this.E1);
        bundle.putCharSequence(Q1, this.F1);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.G1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.K1);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(a.f.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.K1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new p9.a(requireDialog(), rect));
        }
        v1();
    }

    public void onStop() {
        this.B1.K0();
        super.onStop();
    }

    public boolean r1(DialogInterface.OnCancelListener onCancelListener) {
        return this.f16989x1.remove(onCancelListener);
    }

    public boolean s1(DialogInterface.OnDismissListener onDismissListener) {
        return this.f16990y1.remove(onDismissListener);
    }

    public boolean t1(View.OnClickListener onClickListener) {
        return this.f16988w1.remove(onClickListener);
    }

    public boolean u1(f<? super S> fVar) {
        return this.f16987v1.remove(fVar);
    }

    public final void v1() {
        int l12 = l1(requireContext());
        this.D1 = MaterialCalendar.b1(this.A1, l12, this.C1);
        this.B1 = this.J1.isChecked() ? MaterialTextInputPicker.N0(this.A1, l12, this.C1) : this.D1;
        y1();
        u r10 = getChildFragmentManager().r();
        r10.y(a.h.mtrl_calendar_frame, this.B1);
        r10.o();
        this.B1.J0(new c());
    }

    public final void y1() {
        String i12 = i1();
        this.I1.setContentDescription(String.format(getString(a.m.mtrl_picker_announce_current_selection), new Object[]{i12}));
        this.I1.setText(i12);
    }

    public final void z1(@m0 CheckableImageButton checkableImageButton) {
        this.J1.setContentDescription(checkableImageButton.getContext().getString(this.J1.isChecked() ? a.m.mtrl_picker_toggle_to_calendar_input_mode : a.m.mtrl_picker_toggle_to_text_input_mode));
    }
}

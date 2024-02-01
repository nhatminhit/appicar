package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.m;
import com.google.android.material.timepicker.TimePickerView;
import d.l;
import i9.a;
import java.lang.reflect.Field;
import java.util.Locale;

public class j implements TimePickerView.g, h {
    public final LinearLayout O;
    public final TimeModel P;
    public final TextWatcher Q = new a();
    public final TextWatcher R = new b();
    public final ChipTextInputComboView S;
    public final ChipTextInputComboView T;
    public final i U;
    public final EditText V;
    public final EditText W;
    public MaterialButtonToggleGroup X;

    public class a extends m {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    j.this.P.j(0);
                    return;
                }
                j.this.P.j(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class b extends m {
        public b() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    j.this.P.g(0);
                    return;
                }
                j.this.P.g(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            j.this.f(((Integer) view.getTag(a.h.selection_type)).intValue());
        }
    }

    public class d implements MaterialButtonToggleGroup.e {
        public d() {
        }

        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            j.this.P.l(i10 == a.h.material_clock_period_pm_button ? 1 : 0);
        }
    }

    public j(LinearLayout linearLayout, TimeModel timeModel) {
        this.O = linearLayout;
        this.P = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(a.h.material_minute_text_input);
        this.S = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(a.h.material_hour_text_input);
        this.T = chipTextInputComboView2;
        int i10 = a.h.material_label;
        ((TextView) chipTextInputComboView.findViewById(i10)).setText(resources.getString(a.m.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(i10)).setText(resources.getString(a.m.material_timepicker_hour));
        int i11 = a.h.selection_type;
        chipTextInputComboView.setTag(i11, 12);
        chipTextInputComboView2.setTag(i11, 10);
        if (timeModel.Q == 0) {
            l();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.c(timeModel.d());
        chipTextInputComboView.c(timeModel.e());
        this.V = chipTextInputComboView2.e().getEditText();
        this.W = chipTextInputComboView.e().getEditText();
        this.U = new i(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.f(new b(linearLayout.getContext(), a.m.material_hour_selection));
        chipTextInputComboView.f(new b(linearLayout.getContext(), a.m.material_minute_selection));
        b();
    }

    public static void j(EditText editText, @l int i10) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable d10 = g.a.d(context, i11);
            d10.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{d10, d10});
        } catch (Throwable unused) {
        }
    }

    public void a() {
        this.O.setVisibility(0);
    }

    public void b() {
        d();
        k(this.P);
        this.U.a();
    }

    public final void d() {
        this.V.addTextChangedListener(this.R);
        this.W.addTextChangedListener(this.Q);
    }

    public void e() {
        this.S.setChecked(false);
        this.T.setChecked(false);
    }

    public void f(int i10) {
        this.P.T = i10;
        boolean z10 = true;
        this.S.setChecked(i10 == 12);
        ChipTextInputComboView chipTextInputComboView = this.T;
        if (i10 != 10) {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        m();
    }

    public void g() {
        InputMethodManager inputMethodManager;
        View focusedChild = this.O.getFocusedChild();
        if (!(focusedChild == null || (inputMethodManager = (InputMethodManager) i0.d.o(this.O.getContext(), InputMethodManager.class)) == null)) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.O.setVisibility(8);
    }

    public final void h() {
        this.V.removeTextChangedListener(this.R);
        this.W.removeTextChangedListener(this.Q);
    }

    public void i() {
        boolean z10 = true;
        this.S.setChecked(this.P.T == 12);
        ChipTextInputComboView chipTextInputComboView = this.T;
        if (this.P.T != 10) {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
    }

    public void invalidate() {
        k(this.P);
    }

    public final void k(TimeModel timeModel) {
        h();
        Locale locale = this.O.getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.V, new Object[]{Integer.valueOf(timeModel.S)});
        String format2 = String.format(locale, TimeModel.V, new Object[]{Integer.valueOf(timeModel.c())});
        this.S.i(format);
        this.T.i(format2);
        d();
        m();
    }

    public final void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.O.findViewById(a.h.material_clock_period_toggle);
        this.X = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new d());
        this.X.setVisibility(0);
        m();
    }

    public final void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.X;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.j(this.P.U == 0 ? a.h.material_clock_period_am_button : a.h.material_clock_period_pm_button);
        }
    }
}

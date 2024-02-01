package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import d.o0;
import f1.w1;
import i9.a;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip O;
    public final TextInputLayout P;
    public final EditText Q;
    public TextWatcher R;
    public TextView S;

    public class b extends m {
        public static final String P = "00";

        public b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.O.setText(ChipTextInputComboView.this.d(P));
            } else {
                ChipTextInputComboView.this.O.setText(ChipTextInputComboView.this.d(editable));
            }
        }
    }

    public ChipTextInputComboView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipTextInputComboView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(a.k.material_time_chip, this, false);
        this.O = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(a.k.material_time_input, this, false);
        this.P = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.Q = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.R = bVar;
        editText.addTextChangedListener(bVar);
        j();
        addView(chip);
        addView(textInputLayout);
        this.S = (TextView) findViewById(a.h.material_label);
        editText.setSaveEnabled(false);
    }

    public void c(InputFilter inputFilter) {
        InputFilter[] filters = this.Q.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.Q.setFilters(inputFilterArr);
    }

    public final String d(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public TextInputLayout e() {
        return this.P;
    }

    public void f(f1.a aVar) {
        w1.z1(this.O, aVar);
    }

    public void g(boolean z10) {
        this.Q.setCursorVisible(z10);
    }

    public void h(CharSequence charSequence) {
        this.S.setText(charSequence);
    }

    public void i(CharSequence charSequence) {
        this.O.setText(d(charSequence));
        if (!TextUtils.isEmpty(this.Q.getText())) {
            this.Q.removeTextChangedListener(this.R);
            this.Q.setText((CharSequence) null);
            this.Q.addTextChangedListener(this.R);
        }
    }

    public boolean isChecked() {
        return this.O.isChecked();
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.Q.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j();
    }

    public void setChecked(boolean z10) {
        this.O.setChecked(z10);
        int i10 = 0;
        this.Q.setVisibility(z10 ? 0 : 4);
        Chip chip = this.O;
        if (z10) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            this.Q.requestFocus();
            if (!TextUtils.isEmpty(this.Q.getText())) {
                EditText editText = this.Q;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(@o0 View.OnClickListener onClickListener) {
        this.O.setOnClickListener(onClickListener);
    }

    public void setTag(int i10, Object obj) {
        this.O.setTag(i10, obj);
    }

    public void toggle() {
        this.O.toggle();
    }
}

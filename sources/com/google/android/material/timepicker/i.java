package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

public class i implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final ChipTextInputComboView O;
    public final ChipTextInputComboView P;
    public final TimeModel Q;
    public boolean R = false;

    public i(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.O = chipTextInputComboView;
        this.P = chipTextInputComboView2;
        this.Q = timeModel;
    }

    public void a() {
        TextInputLayout e10 = this.O.e();
        TextInputLayout e11 = this.P.e();
        EditText editText = e10.getEditText();
        EditText editText2 = e11.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public final void b(int i10) {
        boolean z10 = true;
        this.P.setChecked(i10 == 12);
        ChipTextInputComboView chipTextInputComboView = this.O;
        if (i10 != 10) {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        this.Q.T = i10;
    }

    public final boolean c(int i10, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i10 >= 7 && i10 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        b(12);
        return true;
    }

    public final boolean d(int i10, KeyEvent keyEvent, EditText editText) {
        if (!(i10 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        b(10);
        return true;
    }

    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10 = i10 == 5;
        if (z10) {
            b(12);
        }
        return z10;
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (this.R) {
            return false;
        }
        this.R = true;
        EditText editText = (EditText) view;
        boolean d10 = this.Q.T == 12 ? d(i10, keyEvent, editText) : c(i10, keyEvent, editText);
        this.R = false;
        return d10;
    }
}

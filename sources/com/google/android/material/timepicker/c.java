package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

public class c implements InputFilter {
    public int O;

    public c(int i10) {
        this.O = i10;
    }

    public int a() {
        return this.O;
    }

    public void b(int i10) {
        this.O = i10;
    }

    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i12, i13, charSequence.subSequence(i10, i11).toString());
            if (Integer.parseInt(sb2.toString()) <= this.O) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
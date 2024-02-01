package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import d.x0;
import i9.a;
import p9.c;
import w9.b;
import z9.j;

@x0({x0.a.LIBRARY_GROUP, x0.a.TESTS})
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @f
    public static final int Q = 16843612;
    @b1
    public static final int R = a.n.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @m0
    public final Drawable O;
    @m0
    public final Rect P;

    public MaterialStyledDatePickerDialog(@m0 Context context) {
        this(context, 0);
    }

    public MaterialStyledDatePickerDialog(@m0 Context context, int i10) {
        this(context, i10, (DatePickerDialog.OnDateSetListener) null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(@m0 Context context, int i10, @o0 DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        Context context2 = getContext();
        int f10 = b.f(getContext(), a.c.colorSurface, getClass().getCanonicalName());
        int i14 = R;
        j jVar = new j(context2, (AttributeSet) null, Q, i14);
        jVar.n0(ColorStateList.valueOf(f10));
        Rect a10 = c.a(context2, Q, i14);
        this.P = a10;
        this.O = c.b(jVar, a10);
    }

    public MaterialStyledDatePickerDialog(@m0 Context context, @o0 DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12) {
        this(context, 0, onDateSetListener, i10, i11, i12);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.O);
        getWindow().getDecorView().setOnTouchListener(new p9.a(this, this.P));
    }
}

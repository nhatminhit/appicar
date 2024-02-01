package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.e;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import d.o0;
import d.x0;
import e1.j;
import i9.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@x0({x0.a.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();
    @o0
    public Long O;

    public class a extends c {
        public final /* synthetic */ i V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, i iVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.V = iVar;
        }

        public void e() {
            this.V.a();
        }

        public void f(@o0 Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.c();
            } else {
                SingleDateSelector.this.W0(l10.longValue());
            }
            this.V.b(SingleDateSelector.this.T0());
        }
    }

    public static class b implements Parcelable.Creator<SingleDateSelector> {
        @m0
        /* renamed from: a */
        public SingleDateSelector createFromParcel(@m0 Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.O = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @m0
        /* renamed from: b */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    @m0
    public Collection<Long> H0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.O;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    public View N(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle, CalendarConstraints calendarConstraints, @m0 i<Long> iVar) {
        View inflate = layoutInflater.inflate(a.k.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (e.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat p10 = m.p();
        String q10 = m.q(inflate.getResources(), p10);
        textInputLayout.setPlaceholderText(q10);
        Long l10 = this.O;
        if (l10 != null) {
            editText.setText(p10.format(l10));
        }
        editText.addTextChangedListener(new a(q10, p10, textInputLayout, calendarConstraints, iVar));
        v.o(editText);
        return inflate;
    }

    public int P() {
        return a.m.mtrl_picker_date_header_title;
    }

    public void W0(long j10) {
        this.O = Long.valueOf(j10);
    }

    public final void c() {
        this.O = null;
    }

    public int c0(Context context) {
        return w9.b.f(context, a.c.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @o0
    /* renamed from: d */
    public Long T0() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m(@o0 Long l10) {
        this.O = l10 == null ? null : Long.valueOf(m.a(l10.longValue()));
    }

    @m0
    public String i(@m0 Context context) {
        Resources resources = context.getResources();
        Long l10 = this.O;
        if (l10 == null) {
            return resources.getString(a.m.mtrl_picker_date_header_unselected);
        }
        String j10 = d.j(l10.longValue());
        return resources.getString(a.m.mtrl_picker_date_header_selected, new Object[]{j10});
    }

    @m0
    public Collection<j<Long, Long>> k() {
        return new ArrayList();
    }

    public boolean m0() {
        return this.O != null;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeValue(this.O);
    }
}

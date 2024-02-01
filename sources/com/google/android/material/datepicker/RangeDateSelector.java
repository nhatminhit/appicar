package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
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
import e1.n;
import i9.a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@x0({x0.a.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<j<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();
    public String O;
    public final String P = " ";
    @o0
    public Long Q = null;
    @o0
    public Long R = null;
    @o0
    public Long S = null;
    @o0
    public Long T = null;

    public class a extends c {
        public final /* synthetic */ TextInputLayout V;
        public final /* synthetic */ TextInputLayout W;
        public final /* synthetic */ i X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, i iVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.V = textInputLayout2;
            this.W = textInputLayout3;
            this.X = iVar;
        }

        public void e() {
            Long unused = RangeDateSelector.this.S = null;
            RangeDateSelector.this.n(this.V, this.W, this.X);
        }

        public void f(@o0 Long l10) {
            Long unused = RangeDateSelector.this.S = l10;
            RangeDateSelector.this.n(this.V, this.W, this.X);
        }
    }

    public class b extends c {
        public final /* synthetic */ TextInputLayout V;
        public final /* synthetic */ TextInputLayout W;
        public final /* synthetic */ i X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, i iVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.V = textInputLayout2;
            this.W = textInputLayout3;
            this.X = iVar;
        }

        public void e() {
            Long unused = RangeDateSelector.this.T = null;
            RangeDateSelector.this.n(this.V, this.W, this.X);
        }

        public void f(@o0 Long l10) {
            Long unused = RangeDateSelector.this.T = l10;
            RangeDateSelector.this.n(this.V, this.W, this.X);
        }
    }

    public static class c implements Parcelable.Creator<RangeDateSelector> {
        @m0
        /* renamed from: a */
        public RangeDateSelector createFromParcel(@m0 Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.Q = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.R = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        @m0
        /* renamed from: b */
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    @m0
    public Collection<Long> H0() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.Q;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.R;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    public View N(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle, CalendarConstraints calendarConstraints, @m0 i<j<Long, Long>> iVar) {
        View inflate = layoutInflater.inflate(a.k.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(a.h.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(a.h.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (e.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.O = inflate.getResources().getString(a.m.mtrl_picker_invalid_range);
        SimpleDateFormat p10 = m.p();
        Long l10 = this.Q;
        if (l10 != null) {
            editText.setText(p10.format(l10));
            this.S = this.Q;
        }
        Long l11 = this.R;
        if (l11 != null) {
            editText2.setText(p10.format(l11));
            this.T = this.R;
        }
        String q10 = m.q(inflate.getResources(), p10);
        textInputLayout.setPlaceholderText(q10);
        textInputLayout2.setPlaceholderText(q10);
        SimpleDateFormat simpleDateFormat = p10;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        a aVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = q10;
        i<j<Long, Long>> iVar2 = iVar;
        a aVar2 = new a(q10, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, iVar2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, iVar2));
        v.o(editText);
        return inflate;
    }

    public int P() {
        return a.m.mtrl_picker_range_header_title;
    }

    public void W0(long j10) {
        Long l10 = this.Q;
        if (l10 != null) {
            if (this.R != null || !h(l10.longValue(), j10)) {
                this.R = null;
            } else {
                this.R = Long.valueOf(j10);
                return;
            }
        }
        this.Q = Long.valueOf(j10);
    }

    public int c0(@m0 Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return w9.b.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? a.c.materialCalendarTheme : a.c.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    public int describeContents() {
        return 0;
    }

    public final void f(@m0 TextInputLayout textInputLayout, @m0 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.O.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    @m0
    /* renamed from: g */
    public j<Long, Long> T0() {
        return new j<>(this.Q, this.R);
    }

    public final boolean h(long j10, long j11) {
        return j10 <= j11;
    }

    @m0
    public String i(@m0 Context context) {
        Resources resources = context.getResources();
        Long l10 = this.Q;
        if (l10 == null && this.R == null) {
            return resources.getString(a.m.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.R;
        if (l11 == null) {
            return resources.getString(a.m.mtrl_picker_range_header_only_start_selected, new Object[]{d.c(l10.longValue())});
        } else if (l10 == null) {
            return resources.getString(a.m.mtrl_picker_range_header_only_end_selected, new Object[]{d.c(l11.longValue())});
        } else {
            j<String, String> a10 = d.a(l10, l11);
            return resources.getString(a.m.mtrl_picker_range_header_selected, new Object[]{a10.f6732a, a10.f6733b});
        }
    }

    public final void j(@m0 TextInputLayout textInputLayout, @m0 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.O);
        textInputLayout2.setError(" ");
    }

    @m0
    public Collection<j<Long, Long>> k() {
        if (this.Q == null || this.R == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j(this.Q, this.R));
        return arrayList;
    }

    /* renamed from: l */
    public void m(@m0 j<Long, Long> jVar) {
        F f10 = jVar.f6732a;
        if (!(f10 == null || jVar.f6733b == null)) {
            n.a(h(((Long) f10).longValue(), ((Long) jVar.f6733b).longValue()));
        }
        F f11 = jVar.f6732a;
        Long l10 = null;
        this.Q = f11 == null ? null : Long.valueOf(m.a(((Long) f11).longValue()));
        S s10 = jVar.f6733b;
        if (s10 != null) {
            l10 = Long.valueOf(m.a(((Long) s10).longValue()));
        }
        this.R = l10;
    }

    public boolean m0() {
        Long l10 = this.Q;
        return (l10 == null || this.R == null || !h(l10.longValue(), this.R.longValue())) ? false : true;
    }

    public final void n(@m0 TextInputLayout textInputLayout, @m0 TextInputLayout textInputLayout2, @m0 i<j<Long, Long>> iVar) {
        Long l10 = this.S;
        if (l10 == null || this.T == null) {
            f(textInputLayout, textInputLayout2);
            iVar.a();
        } else if (h(l10.longValue(), this.T.longValue())) {
            this.Q = this.S;
            this.R = this.T;
            iVar.b(T0());
        } else {
            j(textInputLayout, textInputLayout2);
            iVar.a();
        }
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeValue(this.Q);
        parcel.writeValue(this.R);
    }
}

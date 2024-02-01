package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import d.m0;
import i9.a;
import java.util.Calendar;
import java.util.Locale;

public class n extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public final MaterialCalendar<?> f17031c;

    public class a implements View.OnClickListener {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void onClick(View view) {
            n.this.f17031c.d1(n.this.f17031c.W0().e(Month.b(this.O, n.this.f17031c.Y0().P)));
            n.this.f17031c.e1(MaterialCalendar.k.DAY);
        }
    }

    public static class b extends RecyclerView.e0 {
        public final TextView H;

        public b(TextView textView) {
            super(textView);
            this.H = textView;
        }
    }

    public n(MaterialCalendar<?> materialCalendar) {
        this.f17031c = materialCalendar;
    }

    @m0
    public final View.OnClickListener G(int i10) {
        return new a(i10);
    }

    public int H(int i10) {
        return i10 - this.f17031c.W0().l().Q;
    }

    public int I(int i10) {
        return this.f17031c.W0().l().Q + i10;
    }

    /* renamed from: J */
    public void u(@m0 b bVar, int i10) {
        int I = I(i10);
        String string = bVar.H.getContext().getString(a.m.mtrl_picker_navigate_to_year_description);
        bVar.H.setText(String.format(Locale.getDefault(), TimeModel.W, new Object[]{Integer.valueOf(I)}));
        bVar.H.setContentDescription(String.format(string, new Object[]{Integer.valueOf(I)}));
        b X0 = this.f17031c.X0();
        Calendar t10 = m.t();
        a aVar = t10.get(1) == I ? X0.f17017f : X0.f17015d;
        for (Long longValue : this.f17031c.L0().H0()) {
            t10.setTimeInMillis(longValue.longValue());
            if (t10.get(1) == I) {
                aVar = X0.f17016e;
            }
        }
        aVar.f(bVar.H);
        bVar.H.setOnClickListener(G(I));
    }

    @m0
    /* renamed from: K */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.mtrl_calendar_year, viewGroup, false));
    }

    public int e() {
        return this.f17031c.W0().n();
    }
}

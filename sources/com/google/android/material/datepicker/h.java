package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import d.m0;
import f1.w1;
import i9.a;

public class h extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f17020c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final CalendarConstraints f17021d;

    /* renamed from: e  reason: collision with root package name */
    public final DateSelector<?> f17022e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialCalendar.l f17023f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17024g;

    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView O;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.O = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.O.getAdapter().n(i10)) {
                h.this.f17023f.a(this.O.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.e0 {
        public final TextView H;
        public final MaterialCalendarGridView I;

        public b(@m0 LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(a.h.month_title);
            this.H = textView;
            w1.A1(textView, true);
            this.I = (MaterialCalendarGridView) linearLayout.findViewById(a.h.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public h(@m0 Context context, DateSelector<?> dateSelector, @m0 CalendarConstraints calendarConstraints, MaterialCalendar.l lVar) {
        Month l10 = calendarConstraints.l();
        Month g10 = calendarConstraints.g();
        Month j10 = calendarConstraints.j();
        if (l10.compareTo(j10) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j10.compareTo(g10) <= 0) {
            int Z0 = g.T * MaterialCalendar.Z0(context);
            int Z02 = MaterialDatePicker.n1(context) ? MaterialCalendar.Z0(context) : 0;
            this.f17020c = context;
            this.f17024g = Z0 + Z02;
            this.f17021d = calendarConstraints;
            this.f17022e = dateSelector;
            this.f17023f = lVar;
            D(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @m0
    public Month G(int i10) {
        return this.f17021d.l().q(i10);
    }

    @m0
    public CharSequence H(int i10) {
        return G(i10).o(this.f17020c);
    }

    public int I(@m0 Month month) {
        return this.f17021d.l().r(month);
    }

    /* renamed from: J */
    public void u(@m0 b bVar, int i10) {
        Month q10 = this.f17021d.l().q(i10);
        bVar.H.setText(q10.o(bVar.f3220a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.I.findViewById(a.h.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !q10.equals(materialCalendarGridView.getAdapter().O)) {
            g gVar = new g(q10, this.f17022e, this.f17021d);
            materialCalendarGridView.setNumColumns(q10.R);
            materialCalendarGridView.setAdapter((ListAdapter) gVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @m0
    /* renamed from: K */
    public b w(@m0 ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.n1(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f17024g));
        return new b(linearLayout, true);
    }

    public int e() {
        return this.f17021d.h();
    }

    public long f(int i10) {
        return this.f17021d.l().q(i10).p();
    }
}

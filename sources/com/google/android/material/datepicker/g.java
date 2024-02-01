package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import d.o0;
import java.util.Collection;

public class g extends BaseAdapter {
    public static final int T = m.v().getMaximum(4);
    public final Month O;
    public final DateSelector<?> P;
    public Collection<Long> Q;
    public b R;
    public final CalendarConstraints S;

    public g(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.O = month;
        this.P = dateSelector;
        this.S = calendarConstraints;
        this.Q = dateSelector.H0();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.O.j();
    }

    @o0
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.O.j() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.O.l(j(i10)));
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    @d.m0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, @d.o0 android.view.View r7, @d.m0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = i9.a.k.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0072
            com.google.android.material.datepicker.Month r8 = r5.O
            int r2 = r8.S
            if (r7 < r2) goto L_0x002d
            goto L_0x0072
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.O
            long r7 = r8.l(r7)
            com.google.android.material.datepicker.Month r3 = r5.O
            int r3 = r3.Q
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.e()
            int r4 = r4.Q
            if (r3 != r4) goto L_0x0064
            java.lang.String r7 = com.google.android.material.datepicker.d.g(r7)
            goto L_0x0068
        L_0x0064:
            java.lang.String r7 = com.google.android.material.datepicker.d.l(r7)
        L_0x0068:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007a
        L_0x0072:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0081
            return r0
        L_0x0081:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.R == null) {
            this.R = new b(context);
        }
    }

    public boolean f(int i10) {
        return i10 % this.O.R == 0;
    }

    public boolean g(int i10) {
        return (i10 + 1) % this.O.R == 0;
    }

    public int getCount() {
        return this.O.S + b();
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.O.R);
    }

    public final boolean h(long j10) {
        for (Long longValue : this.P.H0()) {
            if (m.a(j10) == m.a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.O.j() + this.O.S) - 1;
    }

    public int j(int i10) {
        return (i10 - this.O.j()) + 1;
    }

    public final void k(@o0 TextView textView, long j10) {
        a aVar;
        if (textView != null) {
            if (this.S.f().k0(j10)) {
                textView.setEnabled(true);
                aVar = h(j10) ? this.R.f17013b : m.t().getTimeInMillis() == j10 ? this.R.f17014c : this.R.f17012a;
            } else {
                textView.setEnabled(false);
                aVar = this.R.f17018g;
            }
            aVar.f(textView);
        }
    }

    public final void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.d(j10).equals(this.O)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.O.n(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.Q) {
            l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.P;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.H0()) {
                l(materialCalendarGridView, longValue2.longValue());
            }
            this.Q = this.P.H0();
        }
    }

    public boolean n(int i10) {
        return i10 >= b() && i10 <= i();
    }
}

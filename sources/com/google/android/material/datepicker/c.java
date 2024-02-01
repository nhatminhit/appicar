package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import d.o0;
import i9.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public abstract class c extends m {
    public static final int U = 1000;
    @m0
    public final TextInputLayout O;
    public final DateFormat P;
    public final CalendarConstraints Q;
    public final String R;
    public final Runnable S;
    public Runnable T;

    public class a implements Runnable {
        public final /* synthetic */ String O;

        public a(String str) {
            this.O = str;
        }

        public void run() {
            TextInputLayout a10 = c.this.O;
            DateFormat b10 = c.this.P;
            Context context = a10.getContext();
            String string = context.getString(a.m.mtrl_picker_invalid_format);
            String format = String.format(context.getString(a.m.mtrl_picker_invalid_format_use), new Object[]{this.O});
            String format2 = String.format(context.getString(a.m.mtrl_picker_invalid_format_example), new Object[]{b10.format(new Date(m.t().getTimeInMillis()))});
            a10.setError(string + "\n" + format + "\n" + format2);
            c.this.e();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ long O;

        public b(long j10) {
            this.O = j10;
        }

        public void run() {
            c.this.O.setError(String.format(c.this.R, new Object[]{d.c(this.O)}));
            c.this.e();
        }
    }

    public c(String str, DateFormat dateFormat, @m0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.P = dateFormat;
        this.O = textInputLayout;
        this.Q = calendarConstraints;
        this.R = textInputLayout.getContext().getString(a.m.mtrl_picker_out_of_range);
        this.S = new a(str);
    }

    public final Runnable d(long j10) {
        return new b(j10);
    }

    public void e() {
    }

    public abstract void f(@o0 Long l10);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(@m0 CharSequence charSequence, int i10, int i11, int i12) {
        this.O.removeCallbacks(this.S);
        this.O.removeCallbacks(this.T);
        this.O.setError((CharSequence) null);
        f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.P.parse(charSequence.toString());
                this.O.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.Q.f().k0(time) || !this.Q.o(time)) {
                    Runnable d10 = d(time);
                    this.T = d10;
                    g(this.O, d10);
                    return;
                }
                f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                g(this.O, this.S);
            }
        }
    }
}

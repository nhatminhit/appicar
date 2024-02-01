package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import d.o0;
import e1.j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class d {
    public static j<String, String> a(@o0 Long l10, @o0 Long l11) {
        return b(l10, l11, (SimpleDateFormat) null);
    }

    public static j<String, String> b(@o0 Long l10, @o0 Long l11, @o0 SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return j.a(null, null);
        }
        if (l10 == null) {
            return j.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return j.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar t10 = m.t();
        Calendar v10 = m.v();
        v10.setTimeInMillis(l10.longValue());
        Calendar v11 = m.v();
        v11.setTimeInMillis(l11.longValue());
        if (simpleDateFormat == null) {
            return v10.get(1) == v11.get(1) ? v10.get(1) == t10.get(1) ? j.a(f(l10.longValue(), Locale.getDefault()), f(l11.longValue(), Locale.getDefault())) : j.a(f(l10.longValue(), Locale.getDefault()), k(l11.longValue(), Locale.getDefault())) : j.a(k(l10.longValue(), Locale.getDefault()), k(l11.longValue(), Locale.getDefault()));
        }
        return j.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
    }

    public static String c(long j10) {
        return d(j10, (SimpleDateFormat) null);
    }

    public static String d(long j10, @o0 SimpleDateFormat simpleDateFormat) {
        Calendar t10 = m.t();
        Calendar v10 = m.v();
        v10.setTimeInMillis(j10);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : t10.get(1) == v10.get(1) ? e(j10) : j(j10);
    }

    public static String e(long j10) {
        return f(j10, Locale.getDefault());
    }

    public static String f(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? m.c(locale).format(new Date(j10)) : m.m(locale).format(new Date(j10));
    }

    public static String g(long j10) {
        return h(j10, Locale.getDefault());
    }

    public static String h(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? m.d(locale).format(new Date(j10)) : m.i(locale).format(new Date(j10));
    }

    public static String i(Context context, long j10) {
        return DateUtils.formatDateTime(context, j10 - ((long) TimeZone.getDefault().getOffset(j10)), 36);
    }

    public static String j(long j10) {
        return k(j10, Locale.getDefault());
    }

    public static String k(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? m.x(locale).format(new Date(j10)) : m.k(locale).format(new Date(j10));
    }

    public static String l(long j10) {
        return m(j10, Locale.getDefault());
    }

    public static String m(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? m.y(locale).format(new Date(j10)) : m.i(locale).format(new Date(j10));
    }
}

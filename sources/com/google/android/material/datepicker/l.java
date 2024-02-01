package com.google.android.material.datepicker;

import d.o0;
import java.util.Calendar;
import java.util.TimeZone;

public class l {

    /* renamed from: c  reason: collision with root package name */
    public static final l f17026c = new l((Long) null, (TimeZone) null);
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Long f17027a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final TimeZone f17028b;

    public l(@o0 Long l10, @o0 TimeZone timeZone) {
        this.f17027a = l10;
        this.f17028b = timeZone;
    }

    public static l a(long j10) {
        return new l(Long.valueOf(j10), (TimeZone) null);
    }

    public static l b(long j10, @o0 TimeZone timeZone) {
        return new l(Long.valueOf(j10), timeZone);
    }

    public static l e() {
        return f17026c;
    }

    public Calendar c() {
        return d(this.f17028b);
    }

    public Calendar d(@o0 TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f17027a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        return instance;
    }
}

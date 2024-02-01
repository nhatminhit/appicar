package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import d.m0;
import d.o0;
import d8.f;
import i9.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17029a = "UTC";

    /* renamed from: b  reason: collision with root package name */
    public static AtomicReference<l> f17030b = new AtomicReference<>();

    public static void A(@o0 l lVar) {
        f17030b.set(lVar);
    }

    public static long a(long j10) {
        Calendar v10 = v();
        v10.setTimeInMillis(j10);
        return f(v10).getTimeInMillis();
    }

    public static int b(@m0 String str, @m0 String str2, int i10, int i11) {
        while (i11 >= 0 && i11 < str.length() && str2.indexOf(str.charAt(i11)) == -1) {
            if (str.charAt(i11) == '\'') {
                do {
                    i11 += i10;
                    if (i11 < 0) {
                        break;
                    } else if (i11 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i11) == '\'');
            }
            i11 += i10;
        }
        return i11;
    }

    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return e("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat d(Locale locale) {
        return e("MMMEd", locale);
    }

    @TargetApi(24)
    public static DateFormat e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(u());
        return instanceForSkeleton;
    }

    public static Calendar f(Calendar calendar) {
        Calendar w10 = w(calendar);
        Calendar v10 = v();
        v10.set(w10.get(1), w10.get(2), w10.get(5));
        return v10;
    }

    public static java.text.DateFormat g(int i10, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i10, locale);
        dateInstance.setTimeZone(s());
        return dateInstance;
    }

    public static java.text.DateFormat h() {
        return i(Locale.getDefault());
    }

    public static java.text.DateFormat i(Locale locale) {
        return g(0, locale);
    }

    public static java.text.DateFormat j() {
        return k(Locale.getDefault());
    }

    public static java.text.DateFormat k(Locale locale) {
        return g(2, locale);
    }

    public static java.text.DateFormat l() {
        return m(Locale.getDefault());
    }

    public static java.text.DateFormat m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) k(locale);
        simpleDateFormat.applyPattern(z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    public static SimpleDateFormat n(String str) {
        return o(str, Locale.getDefault());
    }

    public static SimpleDateFormat o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(s());
        return simpleDateFormat;
    }

    public static SimpleDateFormat p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(f.f6598d, resources.getString(a.m.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(a.m.mtrl_picker_text_input_month_abbr)).replaceAll("y", resources.getString(a.m.mtrl_picker_text_input_year_abbr));
    }

    public static l r() {
        l lVar = f17030b.get();
        return lVar == null ? l.e() : lVar;
    }

    public static TimeZone s() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar t() {
        Calendar c10 = r().c();
        c10.set(11, 0);
        c10.set(12, 0);
        c10.set(13, 0);
        c10.set(14, 0);
        c10.setTimeZone(s());
        return c10;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone u() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar v() {
        return w((Calendar) null);
    }

    public static Calendar w(@o0 Calendar calendar) {
        Calendar instance = Calendar.getInstance(s());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    public static DateFormat x(Locale locale) {
        return e("yMMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat y(Locale locale) {
        return e("yMMMEd", locale);
    }

    @m0
    public static String z(@m0 String str) {
        int b10 = b(str, "yY", 1, 0);
        if (b10 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b11 = b(str, str2, 1, b10);
        if (b11 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(b(str, str2, -1, b10) + 1, b11), " ").trim();
    }
}

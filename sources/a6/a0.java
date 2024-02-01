package a6;

import c5.i;
import e1.w;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a0 extends DateFormat {
    public static final String U = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
    public static final Pattern V = Pattern.compile(U);
    public static final Pattern W = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
    public static final String X = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    public static final String Y = "yyyy-MM-dd";
    public static final String Z = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: a0  reason: collision with root package name */
    public static final String[] f205a0 = {X, "yyyy-MM-dd'T'HH:mm:ss.SSS", Z, Y};

    /* renamed from: b0  reason: collision with root package name */
    public static final TimeZone f206b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final Locale f207c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final DateFormat f208d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final a0 f209e0 = new a0();

    /* renamed from: f0  reason: collision with root package name */
    public static final Calendar f210f0;
    public transient TimeZone O;
    public final Locale P;
    public Boolean Q;
    public transient Calendar R;
    public transient DateFormat S;
    public boolean T;

    static {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            f206b0 = timeZone;
            Locale locale = Locale.US;
            f207c0 = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Z, locale);
            f208d0 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f210f0 = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    public a0() {
        this.T = true;
        this.P = f207c0;
    }

    @Deprecated
    public a0(TimeZone timeZone, Locale locale) {
        this.T = true;
        this.O = timeZone;
        this.P = locale;
    }

    public a0(TimeZone timeZone, Locale locale, Boolean bool) {
        this(timeZone, locale, bool, false);
    }

    public a0(TimeZone timeZone, Locale locale, Boolean bool, boolean z10) {
        this.O = timeZone;
        this.P = locale;
        this.Q = bool;
        this.T = z10;
    }

    public static void A(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i11 > 99) {
                stringBuffer.append(i11);
            } else {
                y(stringBuffer, i11);
            }
            i10 -= i11 * 100;
        }
        y(stringBuffer, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r3 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.text.DateFormat d(java.text.DateFormat r1, java.lang.String r2, java.util.TimeZone r3, java.util.Locale r4, java.lang.Boolean r5) {
        /*
            java.util.Locale r0 = f207c0
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0015
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r4)
            if (r3 != 0) goto L_0x0011
            java.util.TimeZone r3 = f206b0
        L_0x0011:
            r1.setTimeZone(r3)
            goto L_0x001e
        L_0x0015:
            java.lang.Object r1 = r1.clone()
            java.text.DateFormat r1 = (java.text.DateFormat) r1
            if (r3 == 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            if (r5 == 0) goto L_0x0027
            boolean r2 = r5.booleanValue()
            r1.setLenient(r2)
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.a0.d(java.text.DateFormat, java.lang.String, java.util.TimeZone, java.util.Locale, java.lang.Boolean):java.text.DateFormat");
    }

    public static <T> boolean g(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        return t10 != null && t10.equals(t11);
    }

    public static int m(String str, int i10) {
        return ((str.charAt(i10) - '0') * 10) + (str.charAt(i10 + 1) - '0');
    }

    public static int n(String str, int i10) {
        return ((str.charAt(i10) - '0') * 1000) + ((str.charAt(i10 + 1) - '0') * 100) + ((str.charAt(i10 + 2) - '0') * 10) + (str.charAt(i10 + 3) - '0');
    }

    public static TimeZone t() {
        return f206b0;
    }

    @Deprecated
    public static DateFormat u(TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(X, locale);
        simpleDateFormat.setTimeZone(f206b0);
        return simpleDateFormat;
    }

    @Deprecated
    public static DateFormat v(TimeZone timeZone, Locale locale) {
        return d(f208d0, Z, timeZone, locale, (Boolean) null);
    }

    public static void y(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 10;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 10;
        }
        stringBuffer.append((char) (i10 + 48));
    }

    public static void z(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 100;
        }
        y(stringBuffer, i10);
    }

    public Date B(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return p(str, parsePosition);
        } catch (IllegalArgumentException e10) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", new Object[]{str, e10.getMessage()}), parsePosition.getErrorIndex());
        }
    }

    public Date C(String str, ParsePosition parsePosition) {
        if (this.S == null) {
            this.S = d(f208d0, Z, this.O, this.P, this.Q);
        }
        return this.S.parse(str, parsePosition);
    }

    public String D() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("[one of: '");
        sb2.append(X);
        sb2.append("', '");
        sb2.append(Z);
        sb2.append("' (");
        sb2.append(Boolean.FALSE.equals(this.Q) ? "strict" : "lenient");
        sb2.append(")]");
        return sb2.toString();
    }

    public a0 E(boolean z10) {
        return this.T == z10 ? this : new a0(this.O, this.P, this.Q, z10);
    }

    public a0 F(Boolean bool) {
        return g(bool, this.Q) ? this : new a0(this.O, this.P, bool, this.T);
    }

    public a0 G(Locale locale) {
        return locale.equals(this.P) ? this : new a0(this.O, locale, this.Q, this.T);
    }

    public a0 H(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f206b0;
        }
        TimeZone timeZone2 = this.O;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new a0(timeZone, this.P, this.Q, this.T);
    }

    public void a() {
        this.S = null;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.O;
        if (timeZone == null) {
            timeZone = f206b0;
        }
        i(timeZone, this.P, date, stringBuffer);
        return stringBuffer;
    }

    public TimeZone getTimeZone() {
        return this.O;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public void i(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar k10 = k(timeZone);
        k10.setTime(date);
        int i10 = k10.get(1);
        char c10 = '+';
        if (k10.get(0) == 0) {
            j(stringBuffer, i10);
        } else {
            if (i10 > 9999) {
                stringBuffer.append('+');
            }
            A(stringBuffer, i10);
        }
        stringBuffer.append('-');
        y(stringBuffer, k10.get(2) + 1);
        stringBuffer.append('-');
        y(stringBuffer, k10.get(5));
        stringBuffer.append('T');
        y(stringBuffer, k10.get(11));
        stringBuffer.append(':');
        y(stringBuffer, k10.get(12));
        stringBuffer.append(':');
        y(stringBuffer, k10.get(13));
        stringBuffer.append('.');
        z(stringBuffer, k10.get(14));
        int offset = timeZone.getOffset(k10.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            if (offset < 0) {
                c10 = '-';
            }
            stringBuffer.append(c10);
            y(stringBuffer, abs);
            if (this.T) {
                stringBuffer.append(':');
            }
            y(stringBuffer, abs2);
            return;
        }
        stringBuffer.append(this.T ? "+00:00" : "+0000");
    }

    public boolean isLenient() {
        Boolean bool = this.Q;
        return bool == null || bool.booleanValue();
    }

    public void j(StringBuffer stringBuffer, int i10) {
        if (i10 == 1) {
            stringBuffer.append("+0000");
            return;
        }
        stringBuffer.append('-');
        A(stringBuffer, i10 - 1);
    }

    public Calendar k(TimeZone timeZone) {
        Calendar calendar = this.R;
        if (calendar == null) {
            calendar = (Calendar) f210f0.clone();
            this.R = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Date p(String str, ParsePosition parsePosition) throws IllegalArgumentException, ParseException {
        char c10;
        String str2;
        int i10;
        String str3 = str;
        int length = str.length();
        TimeZone timeZone = f206b0;
        if (!(this.O == null || 'Z' == str3.charAt(length - 1))) {
            timeZone = this.O;
        }
        Calendar k10 = k(timeZone);
        k10.clear();
        int i11 = 0;
        if (length > 10) {
            Matcher matcher = W.matcher(str3);
            if (matcher.matches()) {
                int start = matcher.start(2);
                int end = matcher.end(2);
                int i12 = end - start;
                if (i12 > 1) {
                    int m10 = m(str3, start + 1) * w.f6765c;
                    if (i12 >= 5) {
                        m10 += m(str3, end - 2) * 60;
                    }
                    k10.set(15, str3.charAt(start) == '-' ? m10 * -1000 : m10 * 1000);
                    k10.set(16, 0);
                }
                int n10 = n(str3, 0);
                int m11 = m(str3, 5) - 1;
                Matcher matcher2 = matcher;
                k10.set(n10, m11, m(str3, 8), m(str3, 11), m(str3, 14), (length <= 16 || str3.charAt(16) != ':') ? 0 : m(str3, 17));
                int start2 = matcher2.start(1) + 1;
                int end2 = matcher2.end(1);
                if (start2 < end2 && (i10 = end2 - start2) != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 || i10 <= 9) {
                                i11 = 0 + (str3.charAt(start2 + 2) - '0');
                            } else {
                                throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", new Object[]{str3, matcher2.group(1).substring(1)}), start2);
                            }
                        }
                        i11 += (str3.charAt(start2 + 1) - '0') * 10;
                    }
                    i11 += (str3.charAt(start2) - '0') * 100;
                }
                k10.set(14, i11);
                return k10.getTime();
            }
            c10 = 1;
            str2 = X;
        } else if (V.matcher(str3).matches()) {
            k10.set(n(str3, 0), m(str3, 5) - 1, m(str3, 8), 0, 0, 0);
            k10.set(14, 0);
            return k10.getTime();
        } else {
            str2 = Y;
            c10 = 1;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str3;
        objArr[c10] = str2;
        objArr[2] = this.Q;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr), 0);
    }

    public Date parse(String str) throws ParseException {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date q10 = q(trim, parsePosition);
        if (q10 != null) {
            return q10;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f205a0) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{trim, sb2.toString()}), parsePosition.getErrorIndex());
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return q(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date q(java.lang.String r5, java.text.ParsePosition r6) throws java.text.ParseException {
        /*
            r4 = this;
            boolean r0 = r4.x(r5)
            if (r0 == 0) goto L_0x000b
            java.util.Date r5 = r4.B(r5, r6)
            return r5
        L_0x000b:
            int r0 = r5.length()
        L_0x000f:
            int r0 = r0 + -1
            r1 = 45
            if (r0 < 0) goto L_0x0025
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L_0x0021
            r3 = 57
            if (r2 <= r3) goto L_0x000f
        L_0x0021:
            if (r0 > 0) goto L_0x0025
            if (r2 == r1) goto L_0x000f
        L_0x0025:
            if (r0 >= 0) goto L_0x0039
            r0 = 0
            char r2 = r5.charAt(r0)
            if (r2 == r1) goto L_0x0034
            boolean r0 = c5.i.b(r5, r0)
            if (r0 == 0) goto L_0x0039
        L_0x0034:
            java.util.Date r5 = r4.r(r5, r6)
            return r5
        L_0x0039:
            java.util.Date r5 = r4.C(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.a0.q(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public final Date r(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(i.m(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", new Object[]{str}), parsePosition.getErrorIndex());
        }
    }

    /* renamed from: s */
    public a0 clone() {
        return new a0(this.O, this.P, this.Q, this.T);
    }

    public void setLenient(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        if (!g(valueOf, this.Q)) {
            this.Q = valueOf;
            a();
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.O)) {
            a();
            this.O = timeZone;
        }
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", new Object[]{getClass().getName(), this.O, this.P, this.Q});
    }

    public boolean w() {
        return this.T;
    }

    public boolean x(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }
}

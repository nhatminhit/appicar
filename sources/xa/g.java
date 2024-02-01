package xa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g extends q {

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f24404m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n  reason: collision with root package name */
    public static final long[] f24405n = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f24406o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b  reason: collision with root package name */
    public final String f24407b;

    /* renamed from: c  reason: collision with root package name */
    public final long f24408c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f24409d;

    /* renamed from: e  reason: collision with root package name */
    public final long f24410e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24411f;

    /* renamed from: g  reason: collision with root package name */
    public final String f24412g;

    /* renamed from: h  reason: collision with root package name */
    public final String f24413h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f24414i;

    /* renamed from: j  reason: collision with root package name */
    public final String f24415j;

    /* renamed from: k  reason: collision with root package name */
    public final double f24416k;

    /* renamed from: l  reason: collision with root package name */
    public final double f24417l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d10, double d11) {
        super(r.CALENDAR);
        this.f24407b = str;
        try {
            long s10 = s(str2);
            this.f24408c = s10;
            if (str3 == null) {
                long u10 = u(str4);
                this.f24410e = u10 < 0 ? -1 : s10 + u10;
            } else {
                try {
                    this.f24410e = s(str3);
                } catch (ParseException e10) {
                    throw new IllegalArgumentException(e10.toString());
                }
            }
            boolean z10 = true;
            this.f24409d = str2.length() == 8;
            this.f24411f = (str3 == null || str3.length() != 8) ? false : z10;
            this.f24412g = str5;
            this.f24413h = str6;
            this.f24414i = strArr;
            this.f24415j = str7;
            this.f24416k = d10;
            this.f24417l = d11;
        } catch (ParseException e11) {
            throw new IllegalArgumentException(e11.toString());
        }
    }

    public static String e(boolean z10, long j10) {
        if (j10 < 0) {
            return null;
        }
        return (z10 ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j10));
    }

    public static long s(String str) throws ParseException {
        if (!f24406o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        } else if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } else if (str.length() != 16 || str.charAt(15) != 'Z') {
            return t(str);
        } else {
            long t10 = t(str.substring(0, 15));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long j10 = t10 + ((long) gregorianCalendar.get(15));
            gregorianCalendar.setTime(new Date(j10));
            return j10 + ((long) gregorianCalendar.get(16));
        }
    }

    public static long t(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    public static long u(CharSequence charSequence) {
        if (charSequence == null) {
            return -1;
        }
        Matcher matcher = f24404m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1;
        }
        long j10 = 0;
        int i10 = 0;
        while (true) {
            long[] jArr = f24405n;
            if (i10 >= jArr.length) {
                return j10;
            }
            int i11 = i10 + 1;
            String group = matcher.group(i11);
            if (group != null) {
                j10 += jArr[i10] * ((long) Integer.parseInt(group));
            }
            i10 = i11;
        }
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.c(this.f24407b, sb2);
        q.c(e(this.f24409d, this.f24408c), sb2);
        q.c(e(this.f24411f, this.f24410e), sb2);
        q.c(this.f24412g, sb2);
        q.c(this.f24413h, sb2);
        q.d(this.f24414i, sb2);
        q.c(this.f24415j, sb2);
        return sb2.toString();
    }

    public String[] f() {
        return this.f24414i;
    }

    public String g() {
        return this.f24415j;
    }

    @Deprecated
    public Date h() {
        if (this.f24410e < 0) {
            return null;
        }
        return new Date(this.f24410e);
    }

    public long i() {
        return this.f24410e;
    }

    public double j() {
        return this.f24416k;
    }

    public String k() {
        return this.f24412g;
    }

    public double l() {
        return this.f24417l;
    }

    public String m() {
        return this.f24413h;
    }

    @Deprecated
    public Date n() {
        return new Date(this.f24408c);
    }

    public long o() {
        return this.f24408c;
    }

    public String p() {
        return this.f24407b;
    }

    public boolean q() {
        return this.f24411f;
    }

    public boolean r() {
        return this.f24409d;
    }
}

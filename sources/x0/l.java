package x0;

import android.os.Build;
import android.os.LocaleList;
import d.e0;
import d.m0;
import d.o0;
import d.t0;
import d.y0;
import java.util.Locale;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final l f15008b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public n f15009a;

    public l(n nVar) {
        this.f15009a = nVar;
    }

    @m0
    public static l a(@m0 Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? n(new LocaleList(localeArr)) : new l(new m(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @m0
    public static l c(@o0 String str) {
        if (str == null || str.isEmpty()) {
            return g();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = Locale.forLanguageTag(split[i10]);
        }
        return a(localeArr);
    }

    @m0
    @y0(min = 1)
    public static l e() {
        if (Build.VERSION.SDK_INT >= 24) {
            return n(LocaleList.getAdjustedDefault());
        }
        return a(Locale.getDefault());
    }

    @m0
    @y0(min = 1)
    public static l f() {
        if (Build.VERSION.SDK_INT >= 24) {
            return n(LocaleList.getDefault());
        }
        return a(Locale.getDefault());
    }

    @m0
    public static l g() {
        return f15008b;
    }

    @t0(24)
    @m0
    public static l n(@m0 LocaleList localeList) {
        return new l(new o(localeList));
    }

    @t0(24)
    @Deprecated
    public static l o(Object obj) {
        return n((LocaleList) obj);
    }

    public Locale d(int i10) {
        return this.f15009a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && this.f15009a.equals(((l) obj).f15009a);
    }

    @o0
    public Locale h(@m0 String[] strArr) {
        return this.f15009a.d(strArr);
    }

    public int hashCode() {
        return this.f15009a.hashCode();
    }

    @e0(from = -1)
    public int i(Locale locale) {
        return this.f15009a.a(locale);
    }

    public boolean j() {
        return this.f15009a.isEmpty();
    }

    @e0(from = 0)
    public int k() {
        return this.f15009a.size();
    }

    @m0
    public String l() {
        return this.f15009a.b();
    }

    @o0
    public Object m() {
        return this.f15009a.c();
    }

    public String toString() {
        return this.f15009a.toString();
    }
}

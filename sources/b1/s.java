package b1;

import android.text.TextUtils;
import d.m0;
import d.o0;
import java.util.Locale;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale f4104a = new Locale("", "");

    /* renamed from: b  reason: collision with root package name */
    public static final String f4105b = "Arab";

    /* renamed from: c  reason: collision with root package name */
    public static final String f4106c = "Hebr";

    public static int a(@m0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@o0 Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @m0
    public static String c(@m0 String str) {
        return TextUtils.htmlEncode(str);
    }
}

package b1;

import android.icu.util.ULocale;
import android.os.Build;
import d.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4075a = "ICUCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Method f4076b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f4077c;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f4077c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f4077c;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    public static String b(String str) {
        try {
            Method method = f4076b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @o0
    public static String c(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        try {
            return ((Locale) f4077c.invoke((Object) null, new Object[]{locale})).getScript();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return locale.getScript();
        }
    }
}

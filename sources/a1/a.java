package a1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import d.m0;
import d.o0;
import java.util.Locale;

public final class a {
    @o0
    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    public static CharSequence a(@m0 Context context, @m0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        LocaleList a10 = context.getResources().getConfiguration().getLocales();
        int size = serviceInfo.getNamedContentLocales().size();
        if (size == 0) {
            return null;
        }
        String[] strArr = new String[size];
        int i10 = 0;
        for (Locale languageTag : serviceInfo.getNamedContentLocales()) {
            strArr[i10] = languageTag.toLanguageTag();
            i10++;
        }
        Locale firstMatch = a10.getFirstMatch(strArr);
        if (firstMatch == null) {
            return null;
        }
        return serviceInfo.getNameForLocale(firstMatch);
    }
}

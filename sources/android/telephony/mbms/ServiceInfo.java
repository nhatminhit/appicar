package android.telephony.mbms;

import android.annotation.NonNull;
import java.util.Locale;
import java.util.Set;

public /* synthetic */ class ServiceInfo {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ CharSequence getNameForLocale(@NonNull Locale locale);

    @NonNull
    public native /* synthetic */ Set<Locale> getNamedContentLocales();
}

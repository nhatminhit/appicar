package x0;

import android.content.res.Configuration;
import android.os.Build;
import d.m0;

public final class d {
    @m0
    public static l a(@m0 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return l.n(configuration.getLocales());
        }
        return l.a(configuration.locale);
    }
}

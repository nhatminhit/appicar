package w0;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import d.m0;
import d.o0;
import d.w0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14354a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f14355b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f14356c = 3;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @o0
    @w0("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    public static NetworkInfo a(@m0 ConnectivityManager connectivityManager, @m0 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@m0 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }

    @w0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@m0 ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}

package sj;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23046a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23047b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23048c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23049d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23050e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23051f = 2;

    public static int a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        return activeNetworkInfo.getType() == 0 ? 2 : 0;
    }

    public static int b(Context context) {
        int a10 = a(context);
        if (a10 == 1) {
            return 1;
        }
        return a10 == 2 ? 2 : 0;
    }
}

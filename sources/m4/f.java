package m4;

import android.content.Context;
import android.util.Log;
import d.m0;
import i0.d;
import m4.c;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10349a = "ConnectivityMonitor";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10350b = "android.permission.ACCESS_NETWORK_STATE";

    @m0
    public c a(@m0 Context context, @m0 c.a aVar) {
        boolean z10 = d.a(context, f10350b) == 0;
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        return z10 ? new e(context, aVar) : new j();
    }
}

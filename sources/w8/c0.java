package w8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import d.m0;
import d8.k;
import e8.a;
import y8.e;

@a
public final class c0 {
    @a
    public static boolean a(@m0 Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return k.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    @a
    @TargetApi(19)
    public static boolean b(@m0 Context context, int i10, @m0 String str) {
        return e.a(context).h(i10, str);
    }
}

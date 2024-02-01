package w8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d.m0;
import d.o0;
import e8.a;

@a
public class e {
    @a
    public static int a(@m0 Context context, @m0 String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b10 = b(context, str);
        if (b10 == null || (applicationInfo = b10.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @a
    @o0
    public static PackageInfo b(@m0 Context context, @m0 String str) {
        try {
            return y8.e.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @a
    public static boolean c() {
        return false;
    }
}

package i0;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import d.m0;
import d.o0;
import d.x0;
import h0.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8979a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8980b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8981c = -2;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static int a(@m0 Context context, @m0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@m0 Context context, @m0 String str, @o0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@m0 Context context, @m0 String str, int i10, int i11, @o0 String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String e10 = l.e(str);
        if (e10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return l.d(context, e10, str2) != 0 ? -2 : 0;
    }

    public static int d(@m0 Context context, @m0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

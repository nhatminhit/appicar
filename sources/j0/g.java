package j0;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import d.m0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class g {

    @x0({x0.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @SuppressLint({"UniqueConstants"})
    @x0({x0.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@m0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtection() : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@m0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? permissionInfo.getProtectionFlags() : permissionInfo.protectionLevel & -16;
    }
}

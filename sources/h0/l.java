package h0;

import android.app.AppOpsManager;
import android.content.Context;
import d.m0;
import d.o0;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8440a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8441b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8442c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f8443d = 3;

    public static int a(@m0 Context context, @m0 String str, int i10, @m0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i10, str2);
    }

    public static int b(@m0 Context context, @m0 String str, int i10, @m0 String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i10, str2);
    }

    public static int c(@m0 Context context, @m0 String str, @m0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int d(@m0 Context context, @m0 String str, @m0 String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    @o0
    public static String e(@m0 String str) {
        return AppOpsManager.permissionToOp(str);
    }
}

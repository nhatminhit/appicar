package z0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import d.m0;
import d.o0;
import d.t;
import d.t0;
import d.w0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static Method f15785a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f15786b;

    @t0(23)
    public static class a {
        @SuppressLint({"MissingPermission"})
        @t
        @o0
        @w0("android.permission.READ_PHONE_STATE")
        public static String a(TelephonyManager telephonyManager, int i10) {
            return telephonyManager.getDeviceId(i10);
        }
    }

    @t0(26)
    public static class b {
        @SuppressLint({"MissingPermission"})
        @t
        @o0
        @w0("android.permission.READ_PHONE_STATE")
        public static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @t0(30)
    /* renamed from: z0.c$c  reason: collision with other inner class name */
    public static class C0250c {
        @t
        public static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    @o0
    @w0("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    public static String a(@m0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(telephonyManager);
        }
        int b10 = b(telephonyManager);
        return (b10 == Integer.MAX_VALUE || b10 == -1) ? telephonyManager.getDeviceId() : a.a(telephonyManager, b.a(b10));
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@m0 TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0250c.a(telephonyManager);
        }
        try {
            if (f15786b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f15786b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f15786b.invoke(telephonyManager, new Object[0]);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}

package z0;

import android.os.Build;
import android.telephony.SubscriptionManager;
import d.t;
import d.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@t0(22)
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Method f15784a;

    @t0(29)
    public static class a {
        @t
        public static int a(int i10) {
            return SubscriptionManager.getSlotIndex(i10);
        }
    }

    public static int a(int i10) {
        Method declaredMethod;
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            return a.a(i10);
        }
        try {
            if (f15784a == null) {
                if (i11 >= 26) {
                    declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", new Class[]{Integer.TYPE});
                } else {
                    declaredMethod = SubscriptionManager.class.getDeclaredMethod("getSlotId", new Class[]{Integer.TYPE});
                }
                f15784a = declaredMethod;
                f15784a.setAccessible(true);
            }
            Integer num = (Integer) f15784a.invoke((Object) null, new Object[]{Integer.valueOf(i10)});
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}

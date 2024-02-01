package x0;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import d.m0;

public class g0 {
    public static boolean a(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}

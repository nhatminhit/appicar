package v8;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import d.m0;
import e8.a;

@a
@Deprecated
public class d {
    @a
    @m0
    public static String a(@m0 PowerManager.WakeLock wakeLock, @m0 String str) {
        String valueOf = String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock)));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}

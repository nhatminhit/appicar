package y0;

import android.os.Handler;
import android.os.Looper;
import d.m0;

public class b {
    @m0
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}

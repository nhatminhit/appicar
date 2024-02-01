package t4;

import android.annotation.TargetApi;
import android.os.SystemClock;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final double f12946a = (1.0d / Math.pow(10.0d, 6.0d));

    public static double a(long j10) {
        return ((double) (b() - j10)) * f12946a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}

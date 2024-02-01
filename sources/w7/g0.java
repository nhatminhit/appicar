package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d.o0;

public final class g0 implements c {
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long b() {
        return SystemClock.uptimeMillis();
    }

    public n c(Looper looper, @o0 Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    public void d(long j10) {
        SystemClock.sleep(j10);
    }
}

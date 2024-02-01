package w8;

import android.os.SystemClock;
import d.m0;
import e8.a;

@a
public class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final k f14903a = new k();

    @a
    @m0
    public static g e() {
        return f14903a;
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        return System.currentTimeMillis();
    }

    public final long c() {
        return SystemClock.currentThreadTimeMillis();
    }

    public final long d() {
        return System.nanoTime();
    }
}

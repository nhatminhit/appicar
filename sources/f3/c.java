package f3;

import android.os.Trace;
import d.m0;
import d.t0;

@t0(18)
public final class c {
    public static void a(@m0 String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}

package f3;

import android.os.Trace;
import d.m0;
import d.t0;

@t0(29)
public final class d {
    public static void a(@m0 String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(@m0 String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static void c(@m0 String str, int i10) {
        Trace.setCounter(str, (long) i10);
    }
}

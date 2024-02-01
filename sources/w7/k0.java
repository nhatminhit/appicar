package w7;

import android.annotation.TargetApi;
import android.os.Trace;

public final class k0 {
    public static void a(String str) {
        if (q0.f14786a >= 18) {
            b(str);
        }
    }

    @TargetApi(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (q0.f14786a >= 18) {
            d();
        }
    }

    @TargetApi(18)
    public static void d() {
        Trace.endSection();
    }
}

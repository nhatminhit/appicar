package h6;

import android.util.Pair;
import b6.c;
import d.o0;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8868a = "LicenseDurationRemaining";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8869b = "PlaybackDurationRemaining";

    public static long a(Map<String, String> map, String str) {
        if (map == null) {
            return c.f4201b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : c.f4201b;
        } catch (NumberFormatException unused) {
            return c.f4201b;
        }
    }

    @o0
    public static Pair<Long, Long> b(com.google.android.exoplayer2.drm.c<?> cVar) {
        Map<String, String> a10 = cVar.a();
        if (a10 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(a10, f8868a)), Long.valueOf(a(a10, f8869b)));
    }
}

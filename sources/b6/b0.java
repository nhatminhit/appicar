package b6;

import java.util.HashSet;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4188a = "ExoPlayer";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4189b = "2.10.4";

    /* renamed from: c  reason: collision with root package name */
    public static final String f4190c = "ExoPlayerLib/2.10.4";

    /* renamed from: d  reason: collision with root package name */
    public static final int f4191d = 2010004;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f4192e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f4193f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4194g = true;

    /* renamed from: h  reason: collision with root package name */
    public static final HashSet<String> f4195h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    public static String f4196i = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (b0.class) {
            if (f4195h.add(str)) {
                f4196i += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (b0.class) {
            str = f4196i;
        }
        return str;
    }
}

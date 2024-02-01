package ch;

import javax.annotation.Nullable;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final long f16536a = 65536;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static w f16537b;

    /* renamed from: c  reason: collision with root package name */
    public static long f16538c;

    public static void a(w wVar) {
        if (wVar.f16534f != null || wVar.f16535g != null) {
            throw new IllegalArgumentException();
        } else if (!wVar.f16532d) {
            synchronized (x.class) {
                long j10 = f16538c;
                if (j10 + 8192 <= 65536) {
                    f16538c = j10 + 8192;
                    wVar.f16534f = f16537b;
                    wVar.f16531c = 0;
                    wVar.f16530b = 0;
                    f16537b = wVar;
                }
            }
        }
    }

    public static w b() {
        synchronized (x.class) {
            w wVar = f16537b;
            if (wVar == null) {
                return new w();
            }
            f16537b = wVar.f16534f;
            wVar.f16534f = null;
            f16538c -= 8192;
            return wVar;
        }
    }
}

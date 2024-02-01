package j8;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import d.m0;
import d.o0;
import e8.a;
import w8.d0;

@a
public final class u {
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static u f9799b;

    /* renamed from: c  reason: collision with root package name */
    public static final RootTelemetryConfiguration f9800c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @o0

    /* renamed from: a  reason: collision with root package name */
    public RootTelemetryConfiguration f9801a;

    @a
    @m0
    public static synchronized u b() {
        u uVar;
        synchronized (u.class) {
            if (f9799b == null) {
                f9799b = new u();
            }
            uVar = f9799b;
        }
        return uVar;
    }

    @a
    @o0
    public RootTelemetryConfiguration a() {
        return this.f9801a;
    }

    @d0
    public final synchronized void c(@o0 RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f9801a = f9800c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f9801a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.C1() < rootTelemetryConfiguration.C1()) {
            this.f9801a = rootTelemetryConfiguration;
        }
    }
}

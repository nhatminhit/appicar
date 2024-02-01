package of;

import java.time.Duration;
import nf.e;
import nf.g;
import nf.l;
import oe.f;
import ve.h;
import xe.l0;
import zd.h1;
import zd.y2;

@h(name = "DurationConversionsJDK8Kt")
public final class a {
    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    @f
    public static final Duration a(long j10) {
        Duration ofSeconds = Duration.ofSeconds(e.P(j10), (long) e.T(j10));
        l0.o(ofSeconds, "toJavaDuration-LRDsOJo");
        return ofSeconds;
    }

    @h1(version = "1.6")
    @y2(markerClass = {l.class})
    @f
    public static final long b(Duration duration) {
        l0.p(duration, "<this>");
        return e.h0(g.n0(duration.getSeconds(), nf.h.SECONDS), g.m0(duration.getNano(), nf.h.NANOSECONDS));
    }
}

package nf;

import fh.g;
import nf.s;
import zd.h1;

@h1(version = "1.3")
@l
public final class p implements s.c {
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final p f21252b = new p();

    /* renamed from: c  reason: collision with root package name */
    public static final long f21253c = System.nanoTime();

    public final long b(long j10, long j11) {
        return s.b.a.k(m.c(j10, j11));
    }

    public final long c(long j10, long j11) {
        return m.g(j10, j11);
    }

    public final long d(long j10) {
        return m.e(f(), j10);
    }

    public long e() {
        return s.b.a.k(f());
    }

    public final long f() {
        return System.nanoTime() - f21253c;
    }

    @g
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}

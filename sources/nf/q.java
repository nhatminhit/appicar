package nf;

import zd.h1;

@h1(version = "1.3")
@l
public final class q extends b {

    /* renamed from: c  reason: collision with root package name */
    public long f21254c;

    public q() {
        super(h.NANOSECONDS);
    }

    public long c() {
        return this.f21254c;
    }

    public final void d(long j10) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f21254c + k.h(b()) + " is advanced by " + e.u0(j10) + '.');
    }

    public final void e(long j10) {
        long j11;
        long r02 = e.r0(j10, b());
        if (r02 == Long.MIN_VALUE || r02 == Long.MAX_VALUE) {
            double o02 = ((double) this.f21254c) + e.o0(j10, b());
            if (o02 > 9.223372036854776E18d || o02 < -9.223372036854776E18d) {
                d(j10);
            }
            j11 = (long) o02;
        } else {
            long j12 = this.f21254c;
            j11 = j12 + r02;
            if ((r02 ^ j12) >= 0 && (j12 ^ j11) < 0) {
                d(j10);
            }
        }
        this.f21254c = j11;
    }
}

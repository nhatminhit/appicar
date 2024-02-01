package w7;

import b6.c;
import h.a;

public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final long f14741d = Long.MAX_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public static final long f14742e = 8589934592L;

    /* renamed from: a  reason: collision with root package name */
    public long f14743a;

    /* renamed from: b  reason: collision with root package name */
    public long f14744b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f14745c = c.f4201b;

    public j0(long j10) {
        h(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long a(long j10) {
        if (j10 == c.f4201b) {
            return c.f4201b;
        }
        if (this.f14745c != c.f4201b) {
            this.f14745c = j10;
        } else {
            long j11 = this.f14743a;
            if (j11 != Long.MAX_VALUE) {
                this.f14744b = j11 - j10;
            }
            synchronized (this) {
                this.f14745c = j10;
                notifyAll();
            }
        }
        return j10 + this.f14744b;
    }

    public long b(long j10) {
        if (j10 == c.f4201b) {
            return c.f4201b;
        }
        if (this.f14745c != c.f4201b) {
            long i10 = i(this.f14745c);
            long j11 = (a.c.M + i10) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            j10 += j11 * 8589934592L;
            if (Math.abs(j12 - i10) < Math.abs(j10 - i10)) {
                j10 = j12;
            }
        }
        return a(f(j10));
    }

    public long c() {
        return this.f14743a;
    }

    public long d() {
        if (this.f14745c != c.f4201b) {
            return this.f14744b + this.f14745c;
        }
        long j10 = this.f14743a;
        return j10 != Long.MAX_VALUE ? j10 : c.f4201b;
    }

    public long e() {
        if (this.f14743a == Long.MAX_VALUE) {
            return 0;
        }
        return this.f14745c == c.f4201b ? c.f4201b : this.f14744b;
    }

    public void g() {
        this.f14745c = c.f4201b;
    }

    public synchronized void h(long j10) {
        a.i(this.f14745c == c.f4201b);
        this.f14743a = j10;
    }

    public synchronized void j() throws InterruptedException {
        while (this.f14745c == c.f4201b) {
            wait();
        }
    }
}

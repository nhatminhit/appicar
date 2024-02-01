package ch;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f16507d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f16508a;

    /* renamed from: b  reason: collision with root package name */
    public long f16509b;

    /* renamed from: c  reason: collision with root package name */
    public long f16510c;

    public class a extends b0 {
        public b0 e(long j10) {
            return this;
        }

        public void h() throws IOException {
        }

        public b0 i(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public static long g(long j10, long j11) {
        return j10 == 0 ? j11 : (j11 != 0 && j10 >= j11) ? j11 : j10;
    }

    public b0 a() {
        this.f16508a = false;
        return this;
    }

    public b0 b() {
        this.f16510c = 0;
        return this;
    }

    public final b0 c(long j10, TimeUnit timeUnit) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("duration <= 0: " + j10);
        } else if (timeUnit != null) {
            return e(System.nanoTime() + timeUnit.toNanos(j10));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long d() {
        if (this.f16508a) {
            return this.f16509b;
        }
        throw new IllegalStateException("No deadline");
    }

    public b0 e(long j10) {
        this.f16508a = true;
        this.f16509b = j10;
        return this;
    }

    public boolean f() {
        return this.f16508a;
    }

    public void h() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f16508a && this.f16509b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 i(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j10);
        } else if (timeUnit != null) {
            this.f16510c = timeUnit.toNanos(j10);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long j() {
        return this.f16510c;
    }

    public final void k(Object obj) throws InterruptedIOException {
        try {
            boolean f10 = f();
            long j10 = j();
            long j11 = 0;
            if (f10 || j10 != 0) {
                long nanoTime = System.nanoTime();
                if (f10 && j10 != 0) {
                    j10 = Math.min(j10, d() - nanoTime);
                } else if (f10) {
                    j10 = d() - nanoTime;
                }
                if (j10 > 0) {
                    long j12 = j10 / 1000000;
                    Long.signum(j12);
                    obj.wait(j12, (int) (j10 - (1000000 * j12)));
                    j11 = System.nanoTime() - nanoTime;
                }
                if (j11 >= j10) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}

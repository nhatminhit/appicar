package h9;

import d.m0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class u<T> implements v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f8951a = new CountDownLatch(1);

    public u() {
    }

    public /* synthetic */ u(t tVar) {
    }

    public final void a(T t10) {
        this.f8951a.countDown();
    }

    public final void b() {
        this.f8951a.countDown();
    }

    public final void c(@m0 Exception exc) {
        this.f8951a.countDown();
    }

    public final void d() throws InterruptedException {
        this.f8951a.await();
    }

    public final boolean e(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f8951a.await(j10, timeUnit);
    }
}

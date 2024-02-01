package w7;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14887a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PriorityQueue<Integer> f14888b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    public int f14889c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public void a(int i10) {
        synchronized (this.f14887a) {
            this.f14888b.add(Integer.valueOf(i10));
            this.f14889c = Math.max(this.f14889c, i10);
        }
    }

    public void b(int i10) throws InterruptedException {
        synchronized (this.f14887a) {
            while (this.f14889c != i10) {
                this.f14887a.wait();
            }
        }
    }

    public boolean c(int i10) {
        boolean z10;
        synchronized (this.f14887a) {
            z10 = this.f14889c == i10;
        }
        return z10;
    }

    public void d(int i10) throws a {
        synchronized (this.f14887a) {
            if (this.f14889c != i10) {
                throw new a(i10, this.f14889c);
            }
        }
    }

    public void e(int i10) {
        synchronized (this.f14887a) {
            this.f14888b.remove(Integer.valueOf(i10));
            this.f14889c = this.f14888b.isEmpty() ? Integer.MIN_VALUE : ((Integer) q0.l(this.f14888b.peek())).intValue();
            this.f14887a.notifyAll();
        }
    }
}

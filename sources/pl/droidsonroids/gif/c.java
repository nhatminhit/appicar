package pl.droidsonroids.gif;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f22105a;

    public synchronized void a() throws InterruptedException {
        while (!this.f22105a) {
            wait();
        }
    }

    public synchronized void b() {
        this.f22105a = false;
    }

    public synchronized void c() {
        boolean z10 = this.f22105a;
        this.f22105a = true;
        if (!z10) {
            notify();
        }
    }

    public synchronized void d(boolean z10) {
        if (z10) {
            c();
        } else {
            b();
        }
    }
}

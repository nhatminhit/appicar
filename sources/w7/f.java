package w7;

import android.os.SystemClock;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14728a;

    public synchronized void a() throws InterruptedException {
        while (!this.f14728a) {
            wait();
        }
    }

    public synchronized boolean b(long j10) throws InterruptedException {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 + elapsedRealtime;
        while (true) {
            z10 = this.f14728a;
            if (!z10 && elapsedRealtime < j11) {
                wait(j11 - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return z10;
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f14728a;
        this.f14728a = false;
        return z10;
    }

    public synchronized boolean d() {
        if (this.f14728a) {
            return false;
        }
        this.f14728a = true;
        notifyAll();
        return true;
    }
}

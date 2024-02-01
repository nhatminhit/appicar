package zb;

import android.os.Handler;
import android.os.HandlerThread;

public class m {

    /* renamed from: e  reason: collision with root package name */
    public static final String f25082e = "m";

    /* renamed from: f  reason: collision with root package name */
    public static m f25083f;

    /* renamed from: a  reason: collision with root package name */
    public Handler f25084a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f25085b;

    /* renamed from: c  reason: collision with root package name */
    public int f25086c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f25087d = new Object();

    public static m e() {
        if (f25083f == null) {
            f25083f = new m();
        }
        return f25083f;
    }

    public final void a() {
        synchronized (this.f25087d) {
            if (this.f25084a == null) {
                if (this.f25086c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f25085b = handlerThread;
                    handlerThread.start();
                    this.f25084a = new Handler(this.f25085b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public void b() {
        synchronized (this.f25087d) {
            int i10 = this.f25086c - 1;
            this.f25086c = i10;
            if (i10 == 0) {
                g();
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.f25087d) {
            a();
            this.f25084a.post(runnable);
        }
    }

    public void d(Runnable runnable, long j10) {
        synchronized (this.f25087d) {
            a();
            this.f25084a.postDelayed(runnable, j10);
        }
    }

    public void f(Runnable runnable) {
        synchronized (this.f25087d) {
            this.f25086c++;
            c(runnable);
        }
    }

    public final void g() {
        synchronized (this.f25087d) {
            this.f25085b.quit();
            this.f25085b = null;
            this.f25084a = null;
        }
    }
}

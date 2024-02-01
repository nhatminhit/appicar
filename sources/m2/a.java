package m2;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import d.m0;
import d.o0;
import d.x0;
import e1.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import x0.q;

public abstract class a<D> extends c<D> {

    /* renamed from: p  reason: collision with root package name */
    public static final String f10306p = "AsyncTaskLoader";

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f10307q = false;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f10308j;

    /* renamed from: k  reason: collision with root package name */
    public volatile a<D>.a f10309k;

    /* renamed from: l  reason: collision with root package name */
    public volatile a<D>.a f10310l;

    /* renamed from: m  reason: collision with root package name */
    public long f10311m;

    /* renamed from: n  reason: collision with root package name */
    public long f10312n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f10313o;

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    public final class C0179a extends d<Void, Void, D> implements Runnable {

        /* renamed from: e0  reason: collision with root package name */
        public final CountDownLatch f10314e0 = new CountDownLatch(1);

        /* renamed from: f0  reason: collision with root package name */
        public boolean f10315f0;

        public C0179a() {
        }

        public void m(D d10) {
            try {
                a.this.E(this, d10);
            } finally {
                this.f10314e0.countDown();
            }
        }

        public void n(D d10) {
            try {
                a.this.F(this, d10);
            } finally {
                this.f10314e0.countDown();
            }
        }

        public void run() {
            this.f10315f0 = false;
            a.this.G();
        }

        /* renamed from: u */
        public D b(Void... voidArr) {
            try {
                return a.this.K();
            } catch (q e10) {
                if (k()) {
                    return null;
                }
                throw e10;
            }
        }

        public void v() {
            try {
                this.f10314e0.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public a(@m0 Context context) {
        this(context, d.Z);
    }

    public a(@m0 Context context, @m0 Executor executor) {
        super(context);
        this.f10312n = -10000;
        this.f10308j = executor;
    }

    public void D() {
    }

    public void E(a<D>.a aVar, D d10) {
        J(d10);
        if (this.f10310l == aVar) {
            x();
            this.f10312n = SystemClock.uptimeMillis();
            this.f10310l = null;
            e();
            G();
        }
    }

    public void F(a<D>.a aVar, D d10) {
        if (this.f10309k != aVar) {
            E(aVar, d10);
        } else if (k()) {
            J(d10);
        } else {
            c();
            this.f10312n = SystemClock.uptimeMillis();
            this.f10309k = null;
            f(d10);
        }
    }

    public void G() {
        if (this.f10310l == null && this.f10309k != null) {
            if (this.f10309k.f10315f0) {
                this.f10309k.f10315f0 = false;
                this.f10313o.removeCallbacks(this.f10309k);
            }
            if (this.f10311m <= 0 || SystemClock.uptimeMillis() >= this.f10312n + this.f10311m) {
                this.f10309k.e(this.f10308j, (Params[]) null);
                return;
            }
            this.f10309k.f10315f0 = true;
            this.f10313o.postAtTime(this.f10309k, this.f10312n + this.f10311m);
        }
    }

    public boolean H() {
        return this.f10310l != null;
    }

    @o0
    public abstract D I();

    public void J(@o0 D d10) {
    }

    @o0
    public D K() {
        return I();
    }

    public void L(long j10) {
        this.f10311m = j10;
        if (j10 != 0) {
            this.f10313o = new Handler();
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void M() {
        a<D>.a aVar = this.f10309k;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f10309k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f10309k);
            printWriter.print(" waiting=");
            printWriter.println(this.f10309k.f10315f0);
        }
        if (this.f10310l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f10310l);
            printWriter.print(" waiting=");
            printWriter.println(this.f10310l.f10315f0);
        }
        if (this.f10311m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            w.c(this.f10311m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            w.b(this.f10312n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public boolean o() {
        if (this.f10309k == null) {
            return false;
        }
        if (!this.f10329e) {
            this.f10332h = true;
        }
        if (this.f10310l != null) {
            if (this.f10309k.f10315f0) {
                this.f10309k.f10315f0 = false;
                this.f10313o.removeCallbacks(this.f10309k);
            }
            this.f10309k = null;
            return false;
        } else if (this.f10309k.f10315f0) {
            this.f10309k.f10315f0 = false;
            this.f10313o.removeCallbacks(this.f10309k);
            this.f10309k = null;
            return false;
        } else {
            boolean a10 = this.f10309k.a(false);
            if (a10) {
                this.f10310l = this.f10309k;
                D();
            }
            this.f10309k = null;
            return a10;
        }
    }

    public void q() {
        super.q();
        b();
        this.f10309k = new C0179a();
        G();
    }
}

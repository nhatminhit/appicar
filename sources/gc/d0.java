package gc;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

public class d0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int f18991o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18992p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f18993q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f18994r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f18995s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final String f18996t = "Picasso-Stats";

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f18997a;

    /* renamed from: b  reason: collision with root package name */
    public final d f18998b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f18999c;

    /* renamed from: d  reason: collision with root package name */
    public long f19000d;

    /* renamed from: e  reason: collision with root package name */
    public long f19001e;

    /* renamed from: f  reason: collision with root package name */
    public long f19002f;

    /* renamed from: g  reason: collision with root package name */
    public long f19003g;

    /* renamed from: h  reason: collision with root package name */
    public long f19004h;

    /* renamed from: i  reason: collision with root package name */
    public long f19005i;

    /* renamed from: j  reason: collision with root package name */
    public long f19006j;

    /* renamed from: k  reason: collision with root package name */
    public long f19007k;

    /* renamed from: l  reason: collision with root package name */
    public int f19008l;

    /* renamed from: m  reason: collision with root package name */
    public int f19009m;

    /* renamed from: n  reason: collision with root package name */
    public int f19010n;

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f19011a;

        /* renamed from: gc.d0$a$a  reason: collision with other inner class name */
        public class C0312a implements Runnable {
            public final /* synthetic */ Message O;

            public C0312a(Message message) {
                this.O = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.O.what);
            }
        }

        public a(Looper looper, d0 d0Var) {
            super(looper);
            this.f19011a = d0Var;
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f19011a.j();
            } else if (i10 == 1) {
                this.f19011a.k();
            } else if (i10 == 2) {
                this.f19011a.h((long) message.arg1);
            } else if (i10 == 3) {
                this.f19011a.i((long) message.arg1);
            } else if (i10 != 4) {
                v.f19116q.post(new C0312a(message));
            } else {
                this.f19011a.l((Long) message.obj);
            }
        }
    }

    public d0(d dVar) {
        this.f18998b = dVar;
        HandlerThread handlerThread = new HandlerThread(f18996t, 10);
        this.f18997a = handlerThread;
        handlerThread.start();
        j0.k(handlerThread.getLooper());
        this.f18999c = new a(handlerThread.getLooper(), this);
    }

    public static long g(int i10, long j10) {
        return j10 / ((long) i10);
    }

    public e0 a() {
        return new e0(this.f18998b.h(), this.f18998b.size(), this.f19000d, this.f19001e, this.f19002f, this.f19003g, this.f19004h, this.f19005i, this.f19006j, this.f19007k, this.f19008l, this.f19009m, this.f19010n, System.currentTimeMillis());
    }

    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    public void d() {
        this.f18999c.sendEmptyMessage(0);
    }

    public void e() {
        this.f18999c.sendEmptyMessage(1);
    }

    public void f(long j10) {
        Handler handler = this.f18999c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    public void h(long j10) {
        int i10 = this.f19009m + 1;
        this.f19009m = i10;
        long j11 = this.f19003g + j10;
        this.f19003g = j11;
        this.f19006j = g(i10, j11);
    }

    public void i(long j10) {
        this.f19010n++;
        long j11 = this.f19004h + j10;
        this.f19004h = j11;
        this.f19007k = g(this.f19009m, j11);
    }

    public void j() {
        this.f19000d++;
    }

    public void k() {
        this.f19001e++;
    }

    public void l(Long l10) {
        this.f19008l++;
        long longValue = this.f19002f + l10.longValue();
        this.f19002f = longValue;
        this.f19005i = g(this.f19008l, longValue);
    }

    public final void m(Bitmap bitmap, int i10) {
        int l10 = j0.l(bitmap);
        Handler handler = this.f18999c;
        handler.sendMessage(handler.obtainMessage(i10, l10, 0));
    }

    public void n() {
        this.f18997a.quit();
    }
}

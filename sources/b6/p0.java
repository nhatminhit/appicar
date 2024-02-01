package b6;

import android.os.Handler;
import d.o0;

public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f4426a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4427b;

    /* renamed from: c  reason: collision with root package name */
    public final x0 f4428c;

    /* renamed from: d  reason: collision with root package name */
    public int f4429d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public Object f4430e;

    /* renamed from: f  reason: collision with root package name */
    public Handler f4431f;

    /* renamed from: g  reason: collision with root package name */
    public int f4432g;

    /* renamed from: h  reason: collision with root package name */
    public long f4433h = c.f4201b;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4434i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4435j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4436k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4437l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4438m;

    public interface a {
        void d(p0 p0Var);
    }

    public interface b {
        void n(int i10, @o0 Object obj) throws i;
    }

    public p0(a aVar, b bVar, x0 x0Var, int i10, Handler handler) {
        this.f4427b = aVar;
        this.f4426a = bVar;
        this.f4428c = x0Var;
        this.f4431f = handler;
        this.f4432g = i10;
    }

    public synchronized boolean a() throws InterruptedException {
        w7.a.i(this.f4435j);
        w7.a.i(this.f4431f.getLooper().getThread() != Thread.currentThread());
        while (!this.f4437l) {
            wait();
        }
        return this.f4436k;
    }

    public synchronized p0 b() {
        w7.a.i(this.f4435j);
        this.f4438m = true;
        l(false);
        return this;
    }

    public boolean c() {
        return this.f4434i;
    }

    public Handler d() {
        return this.f4431f;
    }

    @o0
    public Object e() {
        return this.f4430e;
    }

    public long f() {
        return this.f4433h;
    }

    public b g() {
        return this.f4426a;
    }

    public x0 h() {
        return this.f4428c;
    }

    public int i() {
        return this.f4429d;
    }

    public int j() {
        return this.f4432g;
    }

    public synchronized boolean k() {
        return this.f4438m;
    }

    public synchronized void l(boolean z10) {
        this.f4436k = z10 | this.f4436k;
        this.f4437l = true;
        notifyAll();
    }

    public p0 m() {
        w7.a.i(!this.f4435j);
        if (this.f4433h == c.f4201b) {
            w7.a.a(this.f4434i);
        }
        this.f4435j = true;
        this.f4427b.d(this);
        return this;
    }

    public p0 n(boolean z10) {
        w7.a.i(!this.f4435j);
        this.f4434i = z10;
        return this;
    }

    public p0 o(Handler handler) {
        w7.a.i(!this.f4435j);
        this.f4431f = handler;
        return this;
    }

    public p0 p(@o0 Object obj) {
        w7.a.i(!this.f4435j);
        this.f4430e = obj;
        return this;
    }

    public p0 q(int i10, long j10) {
        boolean z10 = true;
        w7.a.i(!this.f4435j);
        if (j10 == c.f4201b) {
            z10 = false;
        }
        w7.a.a(z10);
        if (i10 < 0 || (!this.f4428c.r() && i10 >= this.f4428c.q())) {
            throw new d0(this.f4428c, i10, j10);
        }
        this.f4432g = i10;
        this.f4433h = j10;
        return this;
    }

    public p0 r(long j10) {
        w7.a.i(!this.f4435j);
        this.f4433h = j10;
        return this;
    }

    public p0 s(int i10) {
        w7.a.i(!this.f4435j);
        this.f4429d = i10;
        return this;
    }
}

package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.m0;
import d.o0;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f17411e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f17412f = 1500;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17413g = 2750;

    /* renamed from: h  reason: collision with root package name */
    public static a f17414h;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final Object f17415a = new Object();
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17416b = new Handler(Looper.getMainLooper(), new C0282a());
    @o0

    /* renamed from: c  reason: collision with root package name */
    public c f17417c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public c f17418d;

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    public class C0282a implements Handler.Callback {
        public C0282a() {
        }

        public boolean handleMessage(@m0 Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a();

        void b(int i10);
    }

    public static class c {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f17419a;

        /* renamed from: b  reason: collision with root package name */
        public int f17420b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17421c;

        public c(int i10, b bVar) {
            this.f17419a = new WeakReference<>(bVar);
            this.f17420b = i10;
        }

        public boolean a(@o0 b bVar) {
            return bVar != null && this.f17419a.get() == bVar;
        }
    }

    public static a c() {
        if (f17414h == null) {
            f17414h = new a();
        }
        return f17414h;
    }

    public final boolean a(@m0 c cVar, int i10) {
        b bVar = cVar.f17419a.get();
        if (bVar == null) {
            return false;
        }
        this.f17416b.removeCallbacksAndMessages(cVar);
        bVar.b(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        c cVar;
        synchronized (this.f17415a) {
            if (g(bVar)) {
                cVar = this.f17417c;
            } else if (h(bVar)) {
                cVar = this.f17418d;
            }
            a(cVar, i10);
        }
    }

    public void d(@m0 c cVar) {
        synchronized (this.f17415a) {
            if (this.f17417c == cVar || this.f17418d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean g10;
        synchronized (this.f17415a) {
            g10 = g(bVar);
        }
        return g10;
    }

    public boolean f(b bVar) {
        boolean z10;
        synchronized (this.f17415a) {
            if (!g(bVar)) {
                if (!h(bVar)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean g(b bVar) {
        c cVar = this.f17417c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean h(b bVar) {
        c cVar = this.f17418d;
        return cVar != null && cVar.a(bVar);
    }

    public void i(b bVar) {
        synchronized (this.f17415a) {
            if (g(bVar)) {
                this.f17417c = null;
                if (this.f17418d != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f17415a) {
            if (g(bVar)) {
                m(this.f17417c);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f17415a) {
            if (g(bVar)) {
                c cVar = this.f17417c;
                if (!cVar.f17421c) {
                    cVar.f17421c = true;
                    this.f17416b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f17415a) {
            if (g(bVar)) {
                c cVar = this.f17417c;
                if (cVar.f17421c) {
                    cVar.f17421c = false;
                    m(cVar);
                }
            }
        }
    }

    public final void m(@m0 c cVar) {
        int i10 = cVar.f17420b;
        if (i10 != -2) {
            if (i10 <= 0) {
                i10 = i10 == -1 ? 1500 : 2750;
            }
            this.f17416b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f17416b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i10);
        }
    }

    public void n(int i10, b bVar) {
        synchronized (this.f17415a) {
            if (g(bVar)) {
                c cVar = this.f17417c;
                cVar.f17420b = i10;
                this.f17416b.removeCallbacksAndMessages(cVar);
                m(this.f17417c);
                return;
            }
            if (h(bVar)) {
                this.f17418d.f17420b = i10;
            } else {
                this.f17418d = new c(i10, bVar);
            }
            c cVar2 = this.f17417c;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.f17417c = null;
                o();
            }
        }
    }

    public final void o() {
        c cVar = this.f17418d;
        if (cVar != null) {
            this.f17417c = cVar;
            this.f17418d = null;
            b bVar = cVar.f17419a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f17417c = null;
            }
        }
    }
}

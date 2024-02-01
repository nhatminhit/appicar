package androidx.lifecycle;

import androidx.lifecycle.p;
import d.j0;
import d.m0;
import d.o0;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final int f2746k = -1;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f2747l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2748a;

    /* renamed from: b  reason: collision with root package name */
    public o.b<h0<? super T>, LiveData<T>.c> f2749b;

    /* renamed from: c  reason: collision with root package name */
    public int f2750c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2751d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2752e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2753f;

    /* renamed from: g  reason: collision with root package name */
    public int f2754g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2755h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2756i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f2757j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements u {
        @m0
        public final y S;

        public LifecycleBoundObserver(@m0 y yVar, h0<? super T> h0Var) {
            super(h0Var);
            this.S = yVar;
        }

        public void d(@m0 y yVar, @m0 p.a aVar) {
            p.b b10 = this.S.getLifecycle().b();
            if (b10 == p.b.DESTROYED) {
                LiveData.this.p(this.O);
                return;
            }
            p.b bVar = null;
            while (bVar != b10) {
                a(k());
                bVar = b10;
                b10 = this.S.getLifecycle().b();
            }
        }

        public void i() {
            this.S.getLifecycle().d(this);
        }

        public boolean j(y yVar) {
            return this.S == yVar;
        }

        public boolean k() {
            return this.S.getLifecycle().b().b(p.b.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2748a) {
                obj = LiveData.this.f2753f;
                LiveData.this.f2753f = LiveData.f2747l;
            }
            LiveData.this.r(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(h0<? super T> h0Var) {
            super(h0Var);
        }

        public boolean k() {
            return true;
        }
    }

    public abstract class c {
        public final h0<? super T> O;
        public boolean P;
        public int Q = -1;

        public c(h0<? super T> h0Var) {
            this.O = h0Var;
        }

        public void a(boolean z10) {
            if (z10 != this.P) {
                this.P = z10;
                LiveData.this.c(z10 ? 1 : -1);
                if (this.P) {
                    LiveData.this.e(this);
                }
            }
        }

        public void i() {
        }

        public boolean j(y yVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        this.f2748a = new Object();
        this.f2749b = new o.b<>();
        this.f2750c = 0;
        Object obj = f2747l;
        this.f2753f = obj;
        this.f2757j = new a();
        this.f2752e = obj;
        this.f2754g = -1;
    }

    public LiveData(T t10) {
        this.f2748a = new Object();
        this.f2749b = new o.b<>();
        this.f2750c = 0;
        this.f2753f = f2747l;
        this.f2757j = new a();
        this.f2752e = t10;
        this.f2754g = 0;
    }

    public static void b(String str) {
        if (!n.c.h().c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    @j0
    public void c(int i10) {
        int i11 = this.f2750c;
        this.f2750c = i10 + i11;
        if (!this.f2751d) {
            this.f2751d = true;
            while (true) {
                try {
                    int i12 = this.f2750c;
                    if (i11 != i12) {
                        boolean z10 = i11 == 0 && i12 > 0;
                        boolean z11 = i11 > 0 && i12 == 0;
                        if (z10) {
                            m();
                        } else if (z11) {
                            n();
                        }
                        i11 = i12;
                    } else {
                        return;
                    }
                } finally {
                    this.f2751d = false;
                }
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.P) {
            if (!cVar.k()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.Q;
            int i11 = this.f2754g;
            if (i10 < i11) {
                cVar.Q = i11;
                cVar.O.f(this.f2752e);
            }
        }
    }

    public void e(@o0 LiveData<T>.c cVar) {
        if (this.f2755h) {
            this.f2756i = true;
            return;
        }
        this.f2755h = true;
        do {
            this.f2756i = false;
            if (cVar == null) {
                o.b<K, V>.d e10 = this.f2749b.e();
                while (e10.hasNext()) {
                    d((c) ((Map.Entry) e10.next()).getValue());
                    if (this.f2756i) {
                        break;
                    }
                }
            } else {
                d(cVar);
                cVar = null;
            }
        } while (this.f2756i);
        this.f2755h = false;
    }

    @o0
    public T f() {
        T t10 = this.f2752e;
        if (t10 != f2747l) {
            return t10;
        }
        return null;
    }

    public int g() {
        return this.f2754g;
    }

    public boolean h() {
        return this.f2750c > 0;
    }

    public boolean i() {
        return this.f2749b.size() > 0;
    }

    public boolean j() {
        return this.f2752e != f2747l;
    }

    @j0
    public void k(@m0 y yVar, @m0 h0<? super T> h0Var) {
        b("observe");
        if (yVar.getLifecycle().b() != p.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(yVar, h0Var);
            c i10 = this.f2749b.i(h0Var, lifecycleBoundObserver);
            if (i10 != null && !i10.j(yVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (i10 == null) {
                yVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    @j0
    public void l(@m0 h0<? super T> h0Var) {
        b("observeForever");
        b bVar = new b(h0Var);
        c i10 = this.f2749b.i(h0Var, bVar);
        if (i10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (i10 == null) {
            bVar.a(true);
        }
    }

    public void m() {
    }

    public void n() {
    }

    public void o(T t10) {
        boolean z10;
        synchronized (this.f2748a) {
            z10 = this.f2753f == f2747l;
            this.f2753f = t10;
        }
        if (z10) {
            n.c.h().d(this.f2757j);
        }
    }

    @j0
    public void p(@m0 h0<? super T> h0Var) {
        b("removeObserver");
        c j10 = this.f2749b.j(h0Var);
        if (j10 != null) {
            j10.i();
            j10.a(false);
        }
    }

    @j0
    public void q(@m0 y yVar) {
        b("removeObservers");
        Iterator<Map.Entry<h0<? super T>, LiveData<T>.c>> it = this.f2749b.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((c) next.getValue()).j(yVar)) {
                p((h0) next.getKey());
            }
        }
    }

    @j0
    public void r(T t10) {
        b("setValue");
        this.f2754g++;
        this.f2752e = t10;
        e((LiveData<T>.c) null);
    }
}

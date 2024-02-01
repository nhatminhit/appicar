package h9;

import android.app.Activity;
import d.m0;
import d.o0;
import j8.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class s0<TResult> extends m<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8945a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final n0 f8946b = new n0();
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public boolean f8947c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f8948d;
    @GuardedBy("mLock")
    @o0

    /* renamed from: e  reason: collision with root package name */
    public Object f8949e;
    @GuardedBy("mLock")

    /* renamed from: f  reason: collision with root package name */
    public Exception f8950f;

    public final boolean A() {
        synchronized (this.f8945a) {
            if (this.f8947c) {
                return false;
            }
            this.f8947c = true;
            this.f8948d = true;
            this.f8946b.b(this);
            return true;
        }
    }

    public final boolean B(@m0 Exception exc) {
        s.m(exc, "Exception must not be null");
        synchronized (this.f8945a) {
            if (this.f8947c) {
                return false;
            }
            this.f8947c = true;
            this.f8950f = exc;
            this.f8946b.b(this);
            return true;
        }
    }

    public final boolean C(@o0 Object obj) {
        synchronized (this.f8945a) {
            if (this.f8947c) {
                return false;
            }
            this.f8947c = true;
            this.f8949e = obj;
            this.f8946b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void D() {
        s.s(this.f8947c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    public final void E() {
        if (this.f8948d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @GuardedBy("mLock")
    public final void F() {
        if (this.f8947c) {
            throw d.a(this);
        }
    }

    public final void G() {
        synchronized (this.f8945a) {
            if (this.f8947c) {
                this.f8946b.b(this);
            }
        }
    }

    @m0
    public final m<TResult> a(@m0 Activity activity, @m0 e eVar) {
        d0 d0Var = new d0(o.f8939a, eVar);
        this.f8946b.a(d0Var);
        r0.m(activity).n(d0Var);
        G();
        return this;
    }

    @m0
    public final m<TResult> b(@m0 e eVar) {
        c(o.f8939a, eVar);
        return this;
    }

    @m0
    public final m<TResult> c(@m0 Executor executor, @m0 e eVar) {
        this.f8946b.a(new d0(executor, eVar));
        G();
        return this;
    }

    @m0
    public final m<TResult> d(@m0 Activity activity, @m0 f<TResult> fVar) {
        f0 f0Var = new f0(o.f8939a, fVar);
        this.f8946b.a(f0Var);
        r0.m(activity).n(f0Var);
        G();
        return this;
    }

    @m0
    public final m<TResult> e(@m0 f<TResult> fVar) {
        this.f8946b.a(new f0(o.f8939a, fVar));
        G();
        return this;
    }

    @m0
    public final m<TResult> f(@m0 Executor executor, @m0 f<TResult> fVar) {
        this.f8946b.a(new f0(executor, fVar));
        G();
        return this;
    }

    @m0
    public final m<TResult> g(@m0 Activity activity, @m0 g gVar) {
        h0 h0Var = new h0(o.f8939a, gVar);
        this.f8946b.a(h0Var);
        r0.m(activity).n(h0Var);
        G();
        return this;
    }

    @m0
    public final m<TResult> h(@m0 g gVar) {
        i(o.f8939a, gVar);
        return this;
    }

    @m0
    public final m<TResult> i(@m0 Executor executor, @m0 g gVar) {
        this.f8946b.a(new h0(executor, gVar));
        G();
        return this;
    }

    @m0
    public final m<TResult> j(@m0 Activity activity, @m0 h<? super TResult> hVar) {
        j0 j0Var = new j0(o.f8939a, hVar);
        this.f8946b.a(j0Var);
        r0.m(activity).n(j0Var);
        G();
        return this;
    }

    @m0
    public final m<TResult> k(@m0 h<? super TResult> hVar) {
        l(o.f8939a, hVar);
        return this;
    }

    @m0
    public final m<TResult> l(@m0 Executor executor, @m0 h<? super TResult> hVar) {
        this.f8946b.a(new j0(executor, hVar));
        G();
        return this;
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> m(@m0 c<TResult, TContinuationResult> cVar) {
        return n(o.f8939a, cVar);
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> n(@m0 Executor executor, @m0 c<TResult, TContinuationResult> cVar) {
        s0 s0Var = new s0();
        this.f8946b.a(new z(executor, cVar, s0Var));
        G();
        return s0Var;
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> o(@m0 c<TResult, m<TContinuationResult>> cVar) {
        return p(o.f8939a, cVar);
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> p(@m0 Executor executor, @m0 c<TResult, m<TContinuationResult>> cVar) {
        s0 s0Var = new s0();
        this.f8946b.a(new b0(executor, cVar, s0Var));
        G();
        return s0Var;
    }

    @o0
    public final Exception q() {
        Exception exc;
        synchronized (this.f8945a) {
            exc = this.f8950f;
        }
        return exc;
    }

    public final TResult r() {
        TResult tresult;
        synchronized (this.f8945a) {
            D();
            E();
            Exception exc = this.f8950f;
            if (exc == null) {
                tresult = this.f8949e;
            } else {
                throw new k(exc);
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult s(@m0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f8945a) {
            D();
            E();
            if (!cls.isInstance(this.f8950f)) {
                Exception exc = this.f8950f;
                if (exc == null) {
                    tresult = this.f8949e;
                } else {
                    throw new k(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f8950f));
            }
        }
        return tresult;
    }

    public final boolean t() {
        return this.f8948d;
    }

    public final boolean u() {
        boolean z10;
        synchronized (this.f8945a) {
            z10 = this.f8947c;
        }
        return z10;
    }

    public final boolean v() {
        boolean z10;
        synchronized (this.f8945a) {
            z10 = false;
            if (this.f8947c && !this.f8948d && this.f8950f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> w(@m0 l<TResult, TContinuationResult> lVar) {
        Executor executor = o.f8939a;
        s0 s0Var = new s0();
        this.f8946b.a(new l0(executor, lVar, s0Var));
        G();
        return s0Var;
    }

    @m0
    public final <TContinuationResult> m<TContinuationResult> x(Executor executor, l<TResult, TContinuationResult> lVar) {
        s0 s0Var = new s0();
        this.f8946b.a(new l0(executor, lVar, s0Var));
        G();
        return s0Var;
    }

    public final void y(@m0 Exception exc) {
        s.m(exc, "Exception must not be null");
        synchronized (this.f8945a) {
            F();
            this.f8947c = true;
            this.f8950f = exc;
        }
        this.f8946b.b(this);
    }

    public final void z(@o0 Object obj) {
        synchronized (this.f8945a) {
            F();
            this.f8947c = true;
            this.f8949e = obj;
        }
        this.f8946b.b(this);
    }
}

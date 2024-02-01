package wf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import le.e;
import pf.c4;
import pf.f0;
import pf.j1;
import pf.k0;
import pf.n0;
import pf.n2;
import pf.o0;
import pf.q;
import pf.r;
import pf.t1;
import pf.u3;
import pf.z0;
import xe.i0;
import xe.l0;
import zd.d1;
import zd.e1;
import zd.f1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010:\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bL\u0010MJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010?\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0001\u0010=\u0012\u0004\b>\u0010\u000fR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u0014\u00101\u001a\u0002008\u0016X\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001c\u0010F\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lwf/l;", "T", "Lpf/j1;", "Lle/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lie/d;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "R", "()Ljava/lang/StackTraceElement;", "", "s", "()Z", "Lzd/u2;", "k", "()V", "v", "Lpf/r;", "l", "()Lpf/r;", "Lpf/q;", "continuation", "", "A", "(Lpf/q;)Ljava/lang/Throwable;", "cause", "t", "(Ljava/lang/Throwable;)Z", "", "j", "()Ljava/lang/Object;", "Lzd/d1;", "result", "x", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lzd/v0;", "name", "onCancellation", "w", "(Ljava/lang/Object;Lwe/l;)V", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "y", "(Ljava/lang/Object;)Z", "z", "Lie/g;", "context", "value", "n", "(Lie/g;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lpf/o0;", "Lpf/o0;", "dispatcher", "S", "Lie/d;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "U", "countOrElement", "e", "()Lie/g;", "u", "()Lle/e;", "callerFrame", "d", "()Lie/d;", "delegate", "o", "reusableCancellableContinuation", "<init>", "(Lpf/o0;Lie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l<T> extends j1<T> implements e, d<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater V = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    @g
    @ve.e
    public final o0 R;
    @g
    @ve.e
    public final d<T> S;
    @ve.e
    @h
    public Object T = m.f24106a;
    @g
    @ve.e
    public final Object U = w0.b(e());
    @g
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    public l(@g o0 o0Var, @g d<? super T> dVar) {
        super(-1);
        this.R = o0Var;
        this.S = dVar;
    }

    public static /* synthetic */ void q() {
    }

    @h
    public final Throwable A(@g q<?> qVar) {
        r0 r0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            r0Var = m.f24107b;
            if (obj != r0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f1.a(V, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f1.a(V, this, r0Var, qVar));
        return null;
    }

    @h
    public StackTraceElement R() {
        return null;
    }

    public void b(@h Object obj, @g Throwable th2) {
        if (obj instanceof f0) {
            ((f0) obj).f22000b.A(th2);
        }
    }

    @g
    public d<T> d() {
        return this;
    }

    @g
    public ie.g e() {
        return this.S.e();
    }

    @h
    public Object j() {
        Object obj = this.T;
        this.T = m.f24106a;
        return obj;
    }

    public final void k() {
        do {
        } while (this._reusableCancellableContinuation == m.f24107b);
    }

    @h
    public final r<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f24107b;
                return null;
            } else if (obj instanceof r) {
                if (f1.a(V, this, obj, m.f24107b)) {
                    return (r) obj;
                }
            } else if (obj != m.f24107b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(@g ie.g gVar, T t10) {
        this.T = t10;
        this.Q = 1;
        this.R.O1(gVar, this);
    }

    public final r<?> o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof r) {
            return (r) obj;
        }
        return null;
    }

    public final boolean s() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean t(@g Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r0 r0Var = m.f24107b;
            if (l0.g(obj, r0Var)) {
                if (f1.a(V, this, r0Var, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f1.a(V, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    @g
    public String toString() {
        return "DispatchedContinuation[" + this.R + ", " + z0.c(this.S) + ']';
    }

    @h
    public e u() {
        d<T> dVar = this.S;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final void v() {
        k();
        r<?> o10 = o();
        if (o10 != null) {
            o10.t();
        }
    }

    public final void w(@g Object obj, @h we.l<? super Throwable, u2> lVar) {
        boolean z10;
        ie.g e10;
        Object c10;
        c4<?> g10;
        Object c11 = k0.c(obj, lVar);
        if (this.R.P1(e())) {
            this.T = c11;
            this.Q = 1;
            this.R.N1(e(), this);
            return;
        }
        t1 b10 = u3.f22027a.b();
        if (b10.a2()) {
            this.T = c11;
            this.Q = 1;
            b10.V1(this);
            return;
        }
        b10.X1(true);
        try {
            n2 n2Var = (n2) e().g(n2.D);
            if (n2Var == null || n2Var.c()) {
                z10 = false;
            } else {
                CancellationException k02 = n2Var.k0();
                b(c11, k02);
                d1.a aVar = d1.P;
                x(d1.b(e1.a(k02)));
                z10 = true;
            }
            if (!z10) {
                d<T> dVar = this.S;
                Object obj2 = this.U;
                e10 = dVar.e();
                c10 = w0.c(e10, obj2);
                g10 = c10 != w0.f24123a ? n0.g(dVar, e10, c10) : null;
                this.S.x(obj);
                u2 u2Var = u2.f25116a;
                i0.d(1);
                if (g10 == null || g10.K1()) {
                    w0.a(e10, c10);
                }
                i0.c(1);
            }
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            try {
                i(th2, (Throwable) null);
            } catch (Throwable th3) {
                i0.d(1);
                b10.S1(true);
                i0.c(1);
                throw th3;
            }
        }
        i0.d(1);
        b10.S1(true);
        i0.c(1);
    }

    public void x(@g Object obj) {
        ie.g e10;
        Object c10;
        ie.g e11 = this.S.e();
        Object d10 = k0.d(obj, (we.l) null, 1, (Object) null);
        if (this.R.P1(e11)) {
            this.T = d10;
            this.Q = 0;
            this.R.N1(e11, this);
            return;
        }
        t1 b10 = u3.f22027a.b();
        if (b10.a2()) {
            this.T = d10;
            this.Q = 0;
            b10.V1(this);
            return;
        }
        b10.X1(true);
        try {
            e10 = e();
            c10 = w0.c(e10, this.U);
            this.S.x(obj);
            u2 u2Var = u2.f25116a;
            w0.a(e10, c10);
            do {
            } while (b10.d2());
        } catch (Throwable th2) {
            try {
                i(th2, (Throwable) null);
            } catch (Throwable th3) {
                b10.S1(true);
                throw th3;
            }
        }
        b10.S1(true);
    }

    public final boolean y(@h Object obj) {
        n2 n2Var = (n2) e().g(n2.D);
        if (n2Var == null || n2Var.c()) {
            return false;
        }
        CancellationException k02 = n2Var.k0();
        b(obj, k02);
        d1.a aVar = d1.P;
        x(d1.b(e1.a(k02)));
        return true;
    }

    public final void z(@g Object obj) {
        d<T> dVar = this.S;
        Object obj2 = this.U;
        ie.g e10 = dVar.e();
        Object c10 = w0.c(e10, obj2);
        c4<?> g10 = c10 != w0.f24123a ? n0.g(dVar, e10, c10) : null;
        try {
            this.S.x(obj);
            u2 u2Var = u2.f25116a;
        } finally {
            i0.d(1);
            if (g10 == null || g10.K1()) {
                w0.a(e10, c10);
            }
            i0.c(1);
        }
    }
}

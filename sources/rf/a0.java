package rf;

import fh.g;
import fh.h;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import rf.c;
import we.l;
import wf.d1;
import wf.i0;
import wf.r0;
import wf.y;
import xe.l0;
import zd.u2;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010.\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010,j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`-¢\u0006\u0004\b/\u00100J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001fR\u0014\u0010+\u001a\u00020(8TX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, d2 = {"Lrf/a0;", "E", "Lrf/a;", "element", "", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lzf/f;", "select", "O", "(Ljava/lang/Object;Lzf/f;)Ljava/lang/Object;", "m0", "n0", "", "wasClosed", "Lzd/u2;", "i0", "Lrf/h0;", "receive", "c0", "Lwf/d1;", "s0", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "R", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "S", "Ljava/lang/Object;", "value", "f0", "()Z", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "F", "isBufferAlwaysFull", "H", "isBufferFull", "isEmpty", "", "p", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class a0<E> extends a<E> {
    @g
    public final ReentrantLock R = new ReentrantLock();
    @h
    public Object S = b.f22522c;

    public a0(@h l<? super E, u2> lVar) {
        super(lVar);
    }

    public final boolean F() {
        return false;
    }

    public final boolean H() {
        return false;
    }

    @g
    public Object N(E e10) {
        j0 T;
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            w<?> r10 = r();
            if (r10 != null) {
                return r10;
            }
            if (this.S == b.f22522c) {
                do {
                    T = T();
                    if (T != null) {
                        if (T instanceof w) {
                            reentrantLock.unlock();
                            return T;
                        }
                        l0.m(T);
                    }
                } while (T.k(e10, (y.d) null) == null);
                u2 u2Var = u2.f25116a;
                reentrantLock.unlock();
                T.f0(e10);
                return T.w();
            }
            d1 s02 = s0(e10);
            if (s02 == null) {
                r0 r0Var = b.f22523d;
                reentrantLock.unlock();
                return r0Var;
            }
            throw s02;
        } finally {
            reentrantLock.unlock();
        }
    }

    @g
    public Object O(E e10, @g f<?> fVar) {
        Object q02;
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            w<?> r10 = r();
            if (r10 != null) {
                return r10;
            }
            if (this.S == b.f22522c) {
                do {
                    c.d m10 = m(e10);
                    q02 = fVar.q0(m10);
                    if (q02 == null) {
                        Object o10 = m10.o();
                        u2 u2Var = u2.f25116a;
                        reentrantLock.unlock();
                        l0.m(o10);
                        j0 j0Var = (j0) o10;
                        j0Var.f0(e10);
                        return j0Var.w();
                    } else if (q02 != b.f22524e) {
                    }
                } while (q02 == wf.c.f24083b);
                if (q02 != zf.g.d()) {
                    if (!(q02 instanceof w)) {
                        throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + q02).toString());
                    }
                }
                reentrantLock.unlock();
                return q02;
            }
            if (!fVar.F()) {
                Object d10 = zf.g.d();
                reentrantLock.unlock();
                return d10;
            }
            d1 s02 = s0(e10);
            if (s02 == null) {
                r0 r0Var = b.f22523d;
                reentrantLock.unlock();
                return r0Var;
            }
            throw s02;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean c0(@g h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            return super.c0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f0() {
        return false;
    }

    public final boolean g0() {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            return this.S == b.f22522c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void i0(boolean z10) {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            d1 s02 = s0(b.f22522c);
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            super.i0(z10);
            if (s02 != null) {
                throw s02;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            return h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @h
    public Object m0() {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            Object obj = this.S;
            r0 r0Var = b.f22522c;
            if (obj == r0Var) {
                Object r10 = r();
                if (r10 == null) {
                    r10 = b.f22525f;
                }
                return r10;
            }
            this.S = r0Var;
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @h
    public Object n0(@g f<?> fVar) {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            Object obj = this.S;
            r0 r0Var = b.f22522c;
            if (obj == r0Var) {
                Object r10 = r();
                if (r10 == null) {
                    r10 = b.f22525f;
                }
                return r10;
            } else if (!fVar.F()) {
                Object d10 = zf.g.d();
                reentrantLock.unlock();
                return d10;
            } else {
                Object obj2 = this.S;
                this.S = r0Var;
                u2 u2Var = u2.f25116a;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @g
    public String p() {
        ReentrantLock reentrantLock = this.R;
        reentrantLock.lock();
        try {
            return "(value=" + this.S + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d1 s0(Object obj) {
        l<E, u2> lVar;
        Object obj2 = this.S;
        d1 d1Var = null;
        if (!(obj2 == b.f22522c || (lVar = this.O) == null)) {
            d1Var = i0.d(lVar, obj2, (d1) null, 2, (Object) null);
        }
        this.S = obj;
        return d1Var;
    }
}

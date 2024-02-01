package rf;

import fh.h;
import gf.v;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import we.l;
import wf.r0;
import wf.y;
import xe.l0;
import zd.u2;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001RB\u000f\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\bQ\u0010OJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010\u0005\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R6\u0010;\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d06j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d`78\u0002X\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u001cR\u0014\u0010>\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8TX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u000e¢\u0006\f\u001a\u0004\bF\u0010$\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010HR$\u0010P\u001a\u00020(2\u0006\u0010E\u001a\u00020(8B@BX\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lrf/g;", "E", "Lrf/c;", "Lrf/i;", "Lrf/i0;", "I", "()Lrf/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lzd/u2;", "h", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lzf/f;", "select", "O", "(Ljava/lang/Object;Lzf/f;)Ljava/lang/Object;", "X", "Y", "()V", "Lrf/g$a;", "addSub", "removeSub", "j0", "(Lrf/g$a;Lrf/g$a;)V", "", "Z", "()J", "index", "a0", "(J)Ljava/lang/Object;", "", "R", "b0", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "S", "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "T", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "U", "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "F", "()Z", "isBufferAlwaysFull", "H", "isBufferFull", "", "p", "()Ljava/lang/String;", "bufferDebugString", "value", "c0", "g0", "(J)V", "head", "f0", "i0", "tail", "d0", "h0", "(I)V", "size", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g<E> extends c<E> implements i<E> {
    public final int R;
    @fh.g
    public final ReentrantLock S;
    @fh.g
    public final Object[] T;
    @fh.g
    public final List<a<E>> U;
    @fh.g
    private volatile /* synthetic */ long _head;
    @fh.g
    private volatile /* synthetic */ int _size;
    @fh.g
    private volatile /* synthetic */ long _tail;

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0014\u0010'\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0014\u0010)\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0014\u0010+\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\n¨\u0006."}, d2 = {"Lrf/g$a;", "E", "Lrf/a;", "Lrf/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "s0", "()Z", "", "m0", "()Ljava/lang/Object;", "Lzf/f;", "select", "n0", "(Lzf/f;)Ljava/lang/Object;", "u0", "v0", "Lrf/g;", "R", "Lrf/g;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "S", "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "t0", "()J", "w0", "(J)V", "subHead", "f0", "isBufferAlwaysEmpty", "g0", "isBufferEmpty", "F", "isBufferAlwaysFull", "H", "isBufferFull", "<init>", "(Lrf/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<E> extends a<E> implements i0<E> {
        @fh.g
        public final g<E> R;
        @fh.g
        public final ReentrantLock S = new ReentrantLock();
        @fh.g
        private volatile /* synthetic */ long _subHead = 0;

        public a(@fh.g g<E> gVar) {
            super((l) null);
            this.R = gVar;
        }

        public boolean F() {
            throw new IllegalStateException("Should not be used".toString());
        }

        public boolean G(@h Throwable th2) {
            boolean G = super.G(th2);
            if (G) {
                g.k0(this.R, (a) null, this, 1, (Object) null);
                ReentrantLock reentrantLock = this.S;
                reentrantLock.lock();
                try {
                    w0(this.R.f0());
                    u2 u2Var = u2.f25116a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return G;
        }

        public boolean H() {
            throw new IllegalStateException("Should not be used".toString());
        }

        public boolean f0() {
            return false;
        }

        public boolean g0() {
            return t0() >= this.R.f0();
        }

        /* JADX INFO: finally extract failed */
        @h
        public Object m0() {
            boolean z10;
            ReentrantLock reentrantLock = this.S;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                boolean z11 = true;
                if ((v02 instanceof w) || v02 == b.f22525f) {
                    z10 = false;
                } else {
                    w0(t0() + 1);
                    z10 = true;
                }
                reentrantLock.unlock();
                w wVar = v02 instanceof w ? (w) v02 : null;
                if (wVar != null) {
                    G(wVar.R);
                }
                if (!s0()) {
                    z11 = z10;
                }
                if (z11) {
                    g.k0(this.R, (a) null, (a) null, 3, (Object) null);
                }
                return v02;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        @h
        public Object n0(@fh.g f<?> fVar) {
            ReentrantLock reentrantLock = this.S;
            reentrantLock.lock();
            try {
                Object v02 = v0();
                boolean z10 = true;
                boolean z11 = false;
                if (!(v02 instanceof w) && v02 != b.f22525f) {
                    if (!fVar.F()) {
                        v02 = zf.g.d();
                    } else {
                        w0(t0() + 1);
                        z11 = true;
                    }
                }
                reentrantLock.unlock();
                w wVar = v02 instanceof w ? (w) v02 : null;
                if (wVar != null) {
                    G(wVar.R);
                }
                if (!s0()) {
                    z10 = z11;
                }
                if (z10) {
                    g.k0(this.R, (a) null, (a) null, 3, (Object) null);
                }
                return v02;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final boolean s0() {
            w wVar;
            boolean z10 = false;
            while (true) {
                wVar = null;
                if (!u0() || !this.S.tryLock()) {
                    break;
                }
                try {
                    Object v02 = v0();
                    if (v02 != b.f22525f) {
                        if (v02 instanceof w) {
                            wVar = (w) v02;
                            break;
                        }
                        j0 T = T();
                        if (T == null) {
                            break;
                        } else if (T instanceof w) {
                            break;
                        } else if (T.k(v02, (y.d) null) != null) {
                            w0(t0() + 1);
                            z10 = true;
                            this.S.unlock();
                            T.f0(v02);
                        }
                    }
                } finally {
                    this.S.unlock();
                }
            }
            this.S.unlock();
            if (wVar != null) {
                G(wVar.R);
            }
            return z10;
        }

        public final long t0() {
            return this._subHead;
        }

        public final boolean u0() {
            if (q() != null) {
                return false;
            }
            return !g0() || this.R.q() != null;
        }

        public final Object v0() {
            long t02 = t0();
            w<?> q10 = this.R.q();
            if (t02 < this.R.f0()) {
                Object V = this.R.a0(t02);
                w<?> q11 = q();
                return q11 != null ? q11 : V;
            } else if (q10 != null) {
                return q10;
            } else {
                w<?> q12 = q();
                return q12 == null ? b.f22525f : q12;
            }
        }

        public final void w0(long j10) {
            this._subHead = j10;
        }
    }

    public g(int i10) {
        super((l) null);
        this.R = i10;
        if (i10 < 1 ? false : true) {
            this.S = new ReentrantLock();
            this.T = new Object[i10];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            this.U = wf.f.d();
            return;
        }
        throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    public static /* synthetic */ void e0() {
    }

    public static /* synthetic */ void k0(g gVar, a aVar, a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            aVar2 = null;
        }
        gVar.j0(aVar, aVar2);
    }

    public boolean F() {
        return false;
    }

    public boolean G(@h Throwable th2) {
        if (!super.G(th2)) {
            return false;
        }
        Y();
        return true;
    }

    public boolean H() {
        return d0() >= this.R;
    }

    @fh.g
    public i0<E> I() {
        a aVar = new a(this);
        k0(this, aVar, (a) null, 2, (Object) null);
        return aVar;
    }

    @fh.g
    public Object N(E e10) {
        ReentrantLock reentrantLock = this.S;
        reentrantLock.lock();
        try {
            w<?> r10 = r();
            if (r10 != null) {
                return r10;
            }
            int d02 = d0();
            if (d02 >= this.R) {
                r0 r0Var = b.f22524e;
                reentrantLock.unlock();
                return r0Var;
            }
            long f02 = f0();
            this.T[(int) (f02 % ((long) this.R))] = e10;
            h0(d02 + 1);
            i0(f02 + 1);
            u2 u2Var = u2.f25116a;
            reentrantLock.unlock();
            Y();
            return b.f22523d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @fh.g
    public Object O(E e10, @fh.g f<?> fVar) {
        ReentrantLock reentrantLock = this.S;
        reentrantLock.lock();
        try {
            w<?> r10 = r();
            if (r10 != null) {
                return r10;
            }
            int d02 = d0();
            if (d02 >= this.R) {
                r0 r0Var = b.f22524e;
                reentrantLock.unlock();
                return r0Var;
            } else if (!fVar.F()) {
                Object d10 = zf.g.d();
                reentrantLock.unlock();
                return d10;
            } else {
                long f02 = f0();
                this.T[(int) (f02 % ((long) this.R))] = e10;
                h0(d02 + 1);
                i0(f02 + 1);
                u2 u2Var = u2.f25116a;
                reentrantLock.unlock();
                Y();
                return b.f22523d;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: X */
    public final boolean f(Throwable th2) {
        boolean G = G(th2);
        for (a<E> Z : this.U) {
            Z.f(th2);
        }
        return G;
    }

    public final void Y() {
        boolean z10;
        boolean z11 = false;
        loop0:
        while (true) {
            z10 = z11;
            for (a<E> s02 : this.U) {
                if (s02.s0()) {
                    z11 = true;
                } else {
                    z10 = true;
                }
            }
            break loop0;
        }
        if (z11 || !z10) {
            k0(this, (a) null, (a) null, 3, (Object) null);
        }
    }

    public final long Z() {
        long j10 = Long.MAX_VALUE;
        for (a<E> t02 : this.U) {
            j10 = v.C(j10, t02.t0());
        }
        return j10;
    }

    public final E a0(long j10) {
        return this.T[(int) (j10 % ((long) this.R))];
    }

    public final int b0() {
        return this.R;
    }

    public final long c0() {
        return this._head;
    }

    public final int d0() {
        return this._size;
    }

    public final long f0() {
        return this._tail;
    }

    public final void g0(long j10) {
        this._head = j10;
    }

    public void h(@h CancellationException cancellationException) {
        f(cancellationException);
    }

    public final void h0(int i10) {
        this._size = i10;
    }

    public final void i0(long j10) {
        this._tail = j10;
    }

    public final void j0(a<E> aVar, a<E> aVar2) {
        l0 U2;
        while (true) {
            ReentrantLock reentrantLock = this.S;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.w0(f0());
                    boolean isEmpty = this.U.isEmpty();
                    this.U.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.U.remove(aVar2);
                if (c0() != aVar2.t0()) {
                    reentrantLock.unlock();
                    return;
                }
            }
            long Z = Z();
            long f02 = f0();
            long c02 = c0();
            long C = v.C(Z, f02);
            if (C <= c02) {
                reentrantLock.unlock();
                return;
            }
            int d02 = d0();
            while (c02 < C) {
                Object[] objArr = this.T;
                int i10 = this.R;
                objArr[(int) (c02 % ((long) i10))] = null;
                boolean z10 = d02 >= i10;
                c02++;
                g0(c02);
                d02--;
                h0(d02);
                if (z10) {
                    do {
                        U2 = U();
                        if (U2 != null) {
                            if (!(U2 instanceof w)) {
                                l0.m(U2);
                            } else {
                                continue;
                            }
                        }
                    } while (U2.a1((y.d) null) == null);
                    this.T[(int) (f02 % ((long) this.R))] = U2.Y0();
                    h0(d02 + 1);
                    i0(f02 + 1);
                    u2 u2Var = u2.f25116a;
                    reentrantLock.unlock();
                    U2.X0();
                    Y();
                    aVar = null;
                    aVar2 = null;
                }
            }
            reentrantLock.unlock();
            return;
        }
    }

    @fh.g
    public String p() {
        return "(buffer:capacity=" + this.T.length + ",size=" + d0() + ')';
    }
}

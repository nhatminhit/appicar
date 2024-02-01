package ag;

import fh.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.p1;
import pf.q;
import pf.r;
import pf.s;
import pf.t;
import we.l;
import we.p;
import wf.j0;
import wf.w;
import wf.y;
import xe.n0;
import zd.f1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0006\u001a\t\u0014\u0013\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJT\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lag/d;", "Lag/c;", "Lzf/e;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "Lzd/u2;", "c", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "Lie/d;", "block", "F", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "e", "d", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "i", "b", "()Z", "isLocked", "h", "isLockedEmptyQueueState", "f", "()Lzf/e;", "onLock", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d implements c, zf.e<Object, c> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater O = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    @fh.g
    public volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lag/d$a;", "Lag/d$c;", "Lag/d;", "", "Z0", "Lzd/u2;", "X0", "", "toString", "Lpf/q;", "U", "Lpf/q;", "cont", "", "owner", "<init>", "(Lag/d;Ljava/lang/Object;Lpf/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a extends c {
        @fh.g
        public final q<u2> U;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: ag.d$a$a  reason: collision with other inner class name */
        public static final class C0255a extends n0 implements l<Throwable, u2> {
            public final /* synthetic */ d P;
            public final /* synthetic */ a Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0255a(d dVar, a aVar) {
                super(1);
                this.P = dVar;
                this.Q = aVar;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c((Throwable) obj);
                return u2.f25116a;
            }

            public final void c(@fh.g Throwable th2) {
                this.P.d(this.Q.R);
            }
        }

        public a(@h Object obj, @fh.g q<? super u2> qVar) {
            super(obj);
            this.U = qVar;
        }

        public void X0() {
            this.U.t0(s.f22024d);
        }

        public boolean Z0() {
            return Y0() && this.U.p(u2.f25116a, (Object) null, new C0255a(d.this, this)) != null;
        }

        @fh.g
        public String toString() {
            return "LockCont[" + this.R + ", " + this.U + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lag/d$b;", "R", "Lag/d$c;", "Lag/d;", "", "Z0", "Lzd/u2;", "X0", "", "toString", "Lzf/f;", "U", "Lzf/f;", "select", "Lkotlin/Function2;", "Lag/c;", "Lie/d;", "", "V", "Lwe/p;", "block", "owner", "<init>", "(Lag/d;Ljava/lang/Object;Lzf/f;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class b<R> extends c {
        @fh.g
        @ve.e
        public final zf.f<R> U;
        @fh.g
        @ve.e
        public final p<c, ie.d<? super R>, Object> V;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        public static final class a extends n0 implements l<Throwable, u2> {
            public final /* synthetic */ d P;
            public final /* synthetic */ b<R> Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, b<R> bVar) {
                super(1);
                this.P = dVar;
                this.Q = bVar;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c((Throwable) obj);
                return u2.f25116a;
            }

            public final void c(@fh.g Throwable th2) {
                this.P.d(this.Q.R);
            }
        }

        public b(@h Object obj, @fh.g zf.f<? super R> fVar, @fh.g p<? super c, ? super ie.d<? super R>, ? extends Object> pVar) {
            super(obj);
            this.U = fVar;
            this.V = pVar;
        }

        public void X0() {
            xf.a.e(this.V, d.this, this.U.Q(), new a(d.this, this));
        }

        public boolean Z0() {
            return Y0() && this.U.F();
        }

        @fh.g
        public String toString() {
            return "LockSelect[" + this.R + ", " + this.U + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lag/d$c;", "Lwf/y;", "Lpf/p1;", "", "Y0", "()Z", "Lzd/u2;", "P", "()V", "Z0", "X0", "", "R", "Ljava/lang/Object;", "owner", "<init>", "(Lag/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public abstract class c extends y implements p1 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater T = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");
        @ve.e
        @h
        public final Object R;
        @fh.g
        private volatile /* synthetic */ int isTaken = 0;

        public c(@h Object obj) {
            this.R = obj;
        }

        public final void P() {
            Q0();
        }

        public abstract void X0();

        public final boolean Y0() {
            return T.compareAndSet(this, 0, 1);
        }

        public abstract boolean Z0();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lag/d$d;", "Lwf/w;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: ag.d$d  reason: collision with other inner class name */
    public static final class C0256d extends w {
        @fh.g
        @ve.e
        public volatile Object owner;

        public C0256d(@fh.g Object obj) {
            this.owner = obj;
        }

        @fh.g
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lag/d$e;", "Lwf/b;", "Lwf/d;", "op", "", "c", "failure", "Lzd/u2;", "a", "Lag/d;", "b", "Lag/d;", "mutex", "Ljava/lang/Object;", "owner", "<init>", "(Lag/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e extends wf.b {
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final d f16085b;
        @ve.e
        @h

        /* renamed from: c  reason: collision with root package name */
        public final Object f16086c;

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lag/d$e$a;", "Lwf/j0;", "", "affected", "c", "Lwf/d;", "a", "Lwf/d;", "()Lwf/d;", "atomicOp", "<init>", "(Lag/d$e;Lwf/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        public final class a extends j0 {
            @fh.g

            /* renamed from: a  reason: collision with root package name */
            public final wf.d<?> f16087a;

            public a(@fh.g wf.d<?> dVar) {
                this.f16087a = dVar;
            }

            @fh.g
            public wf.d<?> a() {
                return this.f16087a;
            }

            @h
            public Object c(@h Object obj) {
                Object d10 = a().h() ? e.f16095f : a();
                if (obj != null) {
                    f1.a(d.O, (d) obj, this, d10);
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
            }
        }

        public e(@fh.g d dVar, @h Object obj) {
            this.f16085b = dVar;
            this.f16086c = obj;
        }

        public void a(@fh.g wf.d<?> dVar, @h Object obj) {
            b bVar;
            if (obj != null) {
                bVar = e.f16095f;
            } else {
                Object obj2 = this.f16086c;
                bVar = obj2 == null ? e.f16094e : new b(obj2);
            }
            f1.a(d.O, this.f16085b, dVar, bVar);
        }

        @h
        public Object c(@fh.g wf.d<?> dVar) {
            a aVar = new a(dVar);
            return !f1.a(d.O, this.f16085b, e.f16095f, aVar) ? e.f16090a : aVar.c(this.f16085b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lag/d$f;", "Lwf/d;", "Lag/d;", "affected", "", "k", "failure", "Lzd/u2;", "j", "Lag/d$d;", "b", "Lag/d$d;", "queue", "<init>", "(Lag/d$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f extends wf.d<d> {
        @fh.g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final C0256d f16089b;

        public f(@fh.g C0256d dVar) {
            this.f16089b = dVar;
        }

        /* renamed from: j */
        public void d(@fh.g d dVar, @h Object obj) {
            f1.a(d.O, dVar, this, obj == null ? e.f16095f : this.f16089b);
        }

        @h
        /* renamed from: k */
        public Object i(@fh.g d dVar) {
            if (this.f16089b.Y0()) {
                return null;
            }
            return e.f16091b;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class g extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ d P;
        public final /* synthetic */ Object Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(d dVar, Object obj) {
            super(1);
            this.P = dVar;
            this.Q = obj;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Throwable th2) {
            this.P.d(this.Q);
        }
    }

    public d(boolean z10) {
        this._state = z10 ? e.f16094e : e.f16095f;
    }

    public <R> void F(@fh.g zf.f<? super R> fVar, @h Object obj, @fh.g p<? super c, ? super ie.d<? super R>, ? extends Object> pVar) {
        while (!fVar.N()) {
            Object obj2 = this._state;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.f16084a != e.f16093d) {
                    f1.a(O, this, obj2, new C0256d(bVar.f16084a));
                } else {
                    Object q02 = fVar.q0(new e(this, obj));
                    if (q02 == null) {
                        xf.b.d(pVar, this, fVar.Q());
                        return;
                    } else if (q02 != zf.g.d()) {
                        if (!(q02 == e.f16090a || q02 == wf.c.f24083b)) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + q02).toString());
                        }
                    } else {
                        return;
                    }
                }
            } else if (obj2 instanceof C0256d) {
                C0256d dVar = (C0256d) obj2;
                if (dVar.owner != obj) {
                    b bVar2 = new b(obj, fVar, pVar);
                    dVar.x0(bVar2);
                    if (this._state == obj2 || !bVar2.Y0()) {
                        fVar.H(bVar2);
                        return;
                    }
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public boolean a(@h Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            if (obj2 instanceof b) {
                if (((b) obj2).f16084a != e.f16093d) {
                    return false;
                }
                if (f1.a(O, this, obj2, obj == null ? e.f16094e : new b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0256d) {
                if (((C0256d) obj2).owner == obj) {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public boolean b() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                return ((b) obj).f16084a != e.f16093d;
            }
            if (obj instanceof C0256d) {
                return true;
            }
            if (obj instanceof j0) {
                ((j0) obj).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }

    @h
    public Object c(@h Object obj, @fh.g ie.d<? super u2> dVar) {
        if (a(obj)) {
            return u2.f25116a;
        }
        Object i10 = i(obj, dVar);
        return i10 == ke.d.h() ? i10 : u2.f25116a;
    }

    public void d(@h Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z10 = true;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (obj == null) {
                    if (bVar.f16084a == e.f16093d) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (bVar.f16084a != obj) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.f16084a + " but expected " + obj).toString());
                    }
                }
                if (f1.a(O, this, obj2, e.f16095f)) {
                    return;
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (obj2 instanceof C0256d) {
                if (obj != null) {
                    C0256d dVar = (C0256d) obj2;
                    if (dVar.owner != obj) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new IllegalStateException(("Mutex is locked by " + dVar.owner + " but expected " + obj).toString());
                    }
                }
                C0256d dVar2 = (C0256d) obj2;
                y S0 = dVar2.S0();
                if (S0 == null) {
                    f fVar = new f(dVar2);
                    if (f1.a(O, this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) S0;
                    if (cVar.Z0()) {
                        Object obj3 = cVar.R;
                        if (obj3 == null) {
                            obj3 = e.f16092c;
                        }
                        dVar2.owner = obj3;
                        cVar.X0();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public boolean e(@fh.g Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof b) {
            if (((b) obj2).f16084a == obj) {
                return true;
            }
        } else if ((obj2 instanceof C0256d) && ((C0256d) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    @fh.g
    public zf.e<Object, c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof C0256d) && ((C0256d) obj).Y0();
    }

    public final Object i(Object obj, ie.d<? super u2> dVar) {
        r<? super u2> b10 = t.b(ke.c.d(dVar));
        a aVar = new a(obj, b10);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.f16084a != e.f16093d) {
                    f1.a(O, this, obj2, new C0256d(bVar.f16084a));
                } else {
                    if (f1.a(O, this, obj2, obj == null ? e.f16094e : new b(obj))) {
                        b10.B(u2.f25116a, new g(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C0256d) {
                C0256d dVar2 = (C0256d) obj2;
                if (dVar2.owner != obj) {
                    dVar2.x0(aVar);
                    if (this._state == obj2 || !aVar.Y0()) {
                        t.c(b10, aVar);
                    } else {
                        aVar = new a(obj, b10);
                    }
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        Object z10 = b10.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    @fh.g
    public String toString() {
        StringBuilder sb2;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof b) {
                sb2 = new StringBuilder();
                sb2.append("Mutex[");
                obj = ((b) obj2).f16084a;
                break;
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (obj2 instanceof C0256d) {
                sb2 = new StringBuilder();
                sb2.append("Mutex[");
                obj = ((C0256d) obj2).owner;
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}

package rf;

import be.o;
import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.e3;
import rf.i;
import we.l;
import we.p;
import wf.r0;
import xe.l0;
import xe.u1;
import xe.w;
import zd.b1;
import zd.f1;
import zd.k;
import zd.m;
import zd.u2;
import zf.f;

@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 C*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004DEF\"B\u0007¢\u0006\u0004\bA\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bA\u0010BJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)JX\u00102\u001a\u00020\f\"\u0004\b\u0001\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\u0016\u001a\u00028\u00002(\u00101\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u0012\u0004\u0018\u0001000-H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010@\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0>8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010?\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Lrf/z;", "E", "Lrf/i;", "Lrf/i0;", "I", "()Lrf/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lzd/u2;", "Lkotlinx/coroutines/channels/Handler;", "handler", "n", "(Lwe/l;)V", "f", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "(Ljava/util/concurrent/CancellationException;)V", "element", "C", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lrf/r;", "K", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lrf/z$d;", "subscriber", "e", "(Lrf/z$d;)V", "", "list", "d", "([Lrf/z$d;Lrf/z$d;)[Lrf/z$d;", "o", "k", "(Ljava/lang/Throwable;)V", "Lrf/z$a;", "l", "(Ljava/lang/Object;)Lrf/z$a;", "R", "Lzf/f;", "select", "Lkotlin/Function2;", "Lrf/m0;", "Lie/d;", "", "block", "m", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "g", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "j", "valueOrNull", "L", "()Z", "isClosedForSend", "Lzf/e;", "()Lzf/e;", "onSend", "<init>", "(Ljava/lang/Object;)V", "O", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@e3
public final class z<E> implements i<E> {
    @g
    public static final b O = new b((w) null);
    public static final /* synthetic */ AtomicReferenceFieldUpdater P;
    public static final /* synthetic */ AtomicIntegerFieldUpdater Q;
    public static final /* synthetic */ AtomicReferenceFieldUpdater R;
    @g
    @Deprecated
    public static final a S = new a((Throwable) null);
    @g
    @Deprecated
    public static final r0 T;
    @g
    @Deprecated
    public static final c<Object> U;
    @g
    private volatile /* synthetic */ Object _state;
    @g
    private volatile /* synthetic */ int _updating;
    @g
    private volatile /* synthetic */ Object onCloseHandler;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lrf/z$a;", "", "", "a", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        @ve.e
        @h

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f22547a;

        public a(@h Throwable th2) {
            this.f22547a = th2;
        }

        @g
        public final Throwable a() {
            Throwable th2 = this.f22547a;
            return th2 == null ? new y(s.f22544a) : th2;
        }

        @g
        public final Throwable b() {
            Throwable th2 = this.f22547a;
            return th2 == null ? new IllegalStateException(s.f22544a) : th2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lrf/z$b;", "", "Lrf/z$a;", "CLOSED", "Lrf/z$a;", "Lrf/z$c;", "INITIAL_STATE", "Lrf/z$c;", "Lwf/r0;", "UNDEFINED", "Lwf/r0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lrf/z$c;", "E", "", "a", "Ljava/lang/Object;", "value", "", "Lrf/z$d;", "b", "[Lrf/z$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Lrf/z$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c<E> {
        @ve.e
        @h

        /* renamed from: a  reason: collision with root package name */
        public final Object f22548a;
        @ve.e
        @h

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f22549b;

        public c(@h Object obj, @h d<E>[] dVarArr) {
            this.f22548a = obj;
            this.f22549b = dVarArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lrf/z$d;", "E", "Lrf/a0;", "Lrf/i0;", "", "wasClosed", "Lzd/u2;", "i0", "element", "", "N", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lrf/z;", "T", "Lrf/z;", "broadcastChannel", "<init>", "(Lrf/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d<E> extends a0<E> implements i0<E> {
        @g
        public final z<E> T;

        public d(@g z<E> zVar) {
            super((l) null);
            this.T = zVar;
        }

        @g
        public Object N(E e10) {
            return super.N(e10);
        }

        public void i0(boolean z10) {
            if (z10) {
                this.T.e(this);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"rf/z$e", "Lzf/e;", "Lrf/m0;", "R", "Lzf/f;", "select", "param", "Lkotlin/Function2;", "Lie/d;", "", "block", "Lzd/u2;", "F", "(Lzf/f;Ljava/lang/Object;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements zf.e<E, m0<? super E>> {
        public final /* synthetic */ z<E> O;

        public e(z<E> zVar) {
            this.O = zVar;
        }

        public <R> void F(@g f<? super R> fVar, E e10, @g p<? super m0<? super E>, ? super ie.d<? super R>, ? extends Object> pVar) {
            this.O.m(fVar, e10, pVar);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<z> cls2 = z.class;
        r0 r0Var = new r0("UNDEFINED");
        T = r0Var;
        U = new c<>(r0Var, (d<E>[]) null);
        P = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        Q = AtomicIntegerFieldUpdater.newUpdater(cls2, "_updating");
        R = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "onCloseHandler");
    }

    public z() {
        this._state = U;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public z(E e10) {
        this();
        P.lazySet(this, new c(e10, (d<E>[]) null));
    }

    public static /* synthetic */ void i() {
    }

    @h
    public Object C(E e10, @g ie.d<? super u2> dVar) {
        a l10 = l(e10);
        if (l10 != null) {
            throw l10.a();
        } else if (ke.d.h() == null) {
            return null;
        } else {
            return u2.f25116a;
        }
    }

    @g
    public zf.e<E, m0<E>> E() {
        return new e(this);
    }

    /* renamed from: G */
    public boolean f(@h Throwable th2) {
        Object obj;
        int i10;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!f1.a(P, this, obj, th2 == null ? S : new a(th2)));
        d<E>[] dVarArr = ((c) obj).f22549b;
        if (dVarArr != null) {
            for (d<E> G : dVarArr) {
                G.G(th2);
            }
        }
        k(th2);
        return true;
    }

    @g
    public i0<E> I() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.G(((a) obj).f22547a);
                return dVar;
            } else if (obj instanceof c) {
                cVar = (c) obj;
                Object obj2 = cVar.f22548a;
                if (obj2 != T) {
                    dVar.N(obj2);
                }
            } else {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!f1.a(P, this, obj, new c(cVar.f22548a, d(cVar.f22549b, dVar))));
        return dVar;
    }

    @g
    public Object K(E e10) {
        a l10 = l(e10);
        return l10 != null ? r.f22540b.a(l10.a()) : r.f22540b.c(u2.f25116a);
    }

    public boolean L() {
        return this._state instanceof a;
    }

    public final d<E>[] d(d<E>[] dVarArr, d<E> dVar) {
        if (dVarArr != null) {
            return (d[]) o.X3(dVarArr, dVar);
        }
        d<E>[] dVarArr2 = new d[1];
        for (int i10 = 0; i10 < 1; i10++) {
            dVarArr2[i10] = dVar;
        }
        return dVarArr2;
    }

    public final void e(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (!(obj instanceof a)) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    obj2 = cVar.f22548a;
                    dVarArr = cVar.f22549b;
                    l0.m(dVarArr);
                } else {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } else {
                return;
            }
        } while (!f1.a(P, this, obj, new c(obj2, o(dVarArr, dVar))));
    }

    public final E g() {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        } else if (obj instanceof c) {
            E e10 = ((c) obj).f22548a;
            if (e10 != T) {
                return e10;
            }
            throw new IllegalStateException("No value");
        } else {
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
    }

    public void h(@h CancellationException cancellationException) {
        f(cancellationException);
    }

    @h
    public final E j() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (obj instanceof c) {
            E e10 = T;
            E e11 = ((c) obj).f22548a;
            if (e11 == e10) {
                return null;
            }
            return e11;
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    public final void k(Throwable th2) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (r0Var = b.f22527h) && f1.a(R, this, obj, r0Var)) {
            ((l) u1.q(obj, 1)).A(th2);
        }
    }

    public final a l(E e10) {
        Object obj;
        if (!Q.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    this._updating = 0;
                    return aVar;
                } else if (obj instanceof c) {
                } else {
                    throw new IllegalStateException(("Invalid state " + obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!f1.a(P, this, obj, new c(e10, ((c) obj).f22549b)));
        d<E>[] dVarArr = ((c) obj).f22549b;
        if (dVarArr != null) {
            for (d<E> N : dVarArr) {
                N.N(e10);
            }
        }
        return null;
    }

    public final <R> void m(f<? super R> fVar, E e10, p<? super m0<? super E>, ? super ie.d<? super R>, ? extends Object> pVar) {
        if (fVar.F()) {
            a l10 = l(e10);
            if (l10 != null) {
                fVar.j0(l10.a());
            } else {
                xf.b.d(pVar, this, fVar.Q());
            }
        }
    }

    public void n(@g l<? super Throwable, u2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R;
        if (!f1.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            Object obj = this.onCloseHandler;
            if (obj == b.f22527h) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        Object obj2 = this._state;
        if ((obj2 instanceof a) && f1.a(atomicReferenceFieldUpdater, this, lVar, b.f22527h)) {
            lVar.A(((a) obj2).f22547a);
        }
    }

    public final d<E>[] o(d<E>[] dVarArr, d<E> dVar) {
        int length = dVarArr.length;
        int jg2 = be.p.jg(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[(length - 1)];
        d<E>[] dVarArr3 = dVarArr;
        d<E>[] dVarArr4 = dVarArr2;
        o.l1(dVarArr3, dVarArr4, 0, 0, jg2, 6, (Object) null);
        o.l1(dVarArr3, dVarArr4, jg2, jg2 + 1, 0, 8, (Object) null);
        return dVarArr2;
    }

    @k(level = m.P, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        return i.a.c(this, e10);
    }
}

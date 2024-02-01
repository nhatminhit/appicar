package zf;

import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import pf.e0;
import pf.k0;
import pf.n2;
import pf.p1;
import pf.p2;
import pf.r0;
import pf.s;
import we.l;
import we.p;
import wf.j0;
import wf.w;
import wf.y;
import xe.l0;
import zd.a1;
import zd.d1;
import zd.e1;
import zd.f1;
import zd.u2;
import zf.a;

@a1
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004WXY\"B\u0015\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bU\u0010VJ\u0017\u0010\u0001\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\u0001\u0010\nJ \u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J5\u0010.\u001a\u00020\r*\u00020+2\u001c\u0010-\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140,H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/JG\u00103\u001a\u00020\r\"\u0004\b\u0001\u00100*\b\u0012\u0004\u0012\u00028\u0001012\"\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001402H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J[\u00108\u001a\u00020\r\"\u0004\b\u0001\u00105\"\u0004\b\u0002\u00100*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002062\u0006\u00107\u001a\u00028\u00012\"\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001402H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109J8\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020:2\u001c\u0010-\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140,H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=J.\u0010@\u001a\u00020\r2\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140>2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0>H\b¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\rH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0002¢\u0006\u0004\bD\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010ER\u001c\u0010I\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010KR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010MR\u0014\u0010P\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001fR(\u0010T\u001a\u0004\u0018\u00010\u00192\b\u0010?\u001a\u0004\u0018\u00010\u00198B@BX\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lzf/b;", "R", "Lwf/w;", "Lzf/a;", "Lzf/f;", "Lie/d;", "Lle/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "Lzd/d1;", "result", "Lzd/u2;", "x", "(Ljava/lang/Object;)V", "", "exception", "j0", "(Ljava/lang/Throwable;)V", "", "f1", "()Ljava/lang/Object;", "e", "g1", "Lpf/p1;", "handle", "H", "(Lpf/p1;)V", "", "F", "()Z", "Lwf/y$d;", "otherOp", "d", "(Lwf/y$d;)Ljava/lang/Object;", "Lwf/b;", "desc", "q0", "(Lwf/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lzf/c;", "Lkotlin/Function1;", "block", "J", "(Lzf/c;Lwe/l;)V", "Q", "Lzf/d;", "Lkotlin/Function2;", "c0", "(Lzf/d;Lwe/p;)V", "P", "Lzf/e;", "param", "r0", "(Lzf/e;Ljava/lang/Object;Lwe/p;)V", "", "timeMillis", "L", "(JLwe/l;)V", "Lkotlin/Function0;", "value", "d1", "(Lwe/a;Lwe/a;)V", "Z", "()V", "c1", "Lie/d;", "uCont", "u", "()Lle/e;", "callerFrame", "Lie/g;", "()Lie/g;", "context", "()Lie/d;", "completion", "N", "isSelected", "e1", "()Lpf/p1;", "h1", "parentHandle", "<init>", "(Lie/d;)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b<R> extends w implements a<R>, f<R>, ie.d<R>, le.e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater S;
    public static final /* synthetic */ AtomicReferenceFieldUpdater T;
    @g
    public final ie.d<R> R;
    @g
    private volatile /* synthetic */ Object _parentHandle = null;
    @g
    private volatile /* synthetic */ Object _result = g.f25125c;
    @g
    public volatile /* synthetic */ Object _state = g.f();

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lzf/b$a;", "Lwf/d;", "", "affected", "i", "failure", "Lzd/u2;", "d", "", "toString", "k", "l", "j", "Lzf/b;", "b", "Lzf/b;", "impl", "Lwf/b;", "c", "Lwf/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lzf/b;Lwf/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a extends wf.d<Object> {
        @g
        @ve.e

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f25119b;
        @g
        @ve.e

        /* renamed from: c  reason: collision with root package name */
        public final wf.b f25120c;

        /* renamed from: d  reason: collision with root package name */
        public final long f25121d = g.f25127e.a();

        public a(@g b<?> bVar, @g wf.b bVar2) {
            this.f25119b = bVar;
            this.f25120c = bVar2;
            bVar2.d(this);
        }

        public void d(@h Object obj, @h Object obj2) {
            j(obj2);
            this.f25120c.a(this, obj2);
        }

        public long g() {
            return this.f25121d;
        }

        @h
        public Object i(@h Object obj) {
            Object k10;
            if (obj == null && (k10 = k()) != null) {
                return k10;
            }
            try {
                return this.f25120c.c(this);
            } catch (Throwable th2) {
                if (obj == null) {
                    l();
                }
                throw th2;
            }
        }

        public final void j(Object obj) {
            boolean z10 = obj == null;
            if (f1.a(b.S, this.f25119b, this, z10 ? null : g.f()) && z10) {
                this.f25119b.c1();
            }
        }

        public final Object k() {
            b<?> bVar = this.f25119b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof j0) {
                    ((j0) obj).c(this.f25119b);
                } else if (obj != g.f()) {
                    return g.d();
                } else {
                    if (f1.a(b.S, this.f25119b, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        public final void l() {
            f1.a(b.S, this.f25119b, this, g.f());
        }

        @g
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lzf/b$b;", "Lwf/y;", "Lpf/p1;", "R", "Lpf/p1;", "handle", "<init>", "(Lpf/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: zf.b$b  reason: collision with other inner class name */
    public static final class C0498b extends y {
        @g
        @ve.e
        public final p1 R;

        public C0498b(@g p1 p1Var) {
            this.R = p1Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lzf/b$c;", "Lwf/j0;", "", "affected", "c", "Lwf/y$d;", "a", "Lwf/y$d;", "otherOp", "Lwf/d;", "()Lwf/d;", "atomicOp", "<init>", "(Lwf/y$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c extends j0 {
        @g
        @ve.e

        /* renamed from: a  reason: collision with root package name */
        public final y.d f25122a;

        public c(@g y.d dVar) {
            this.f25122a = dVar;
        }

        @g
        public wf.d<?> a() {
            return this.f25122a.a();
        }

        @h
        public Object c(@h Object obj) {
            if (obj != null) {
                b bVar = (b) obj;
                this.f25122a.d();
                Object e10 = this.f25122a.a().e((Object) null);
                f1.a(b.S, bVar, this, e10 == null ? this.f25122a.f24139c : g.f());
                return e10;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\b"}, d2 = {"Lzf/b$d;", "Lpf/p2;", "", "cause", "Lzd/u2;", "X0", "<init>", "(Lzf/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class d extends p2 {
        public d() {
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            X0((Throwable) obj);
            return u2.f25116a;
        }

        public void X0(@h Throwable th2) {
            if (b.this.F()) {
                b.this.j0(Y0().k0());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lzd/u2;", "run", "()V", "pf/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e implements Runnable {
        public final /* synthetic */ b O;
        public final /* synthetic */ l P;

        public e(b bVar, l lVar) {
            this.O = bVar;
            this.P = lVar;
        }

        public final void run() {
            if (this.O.F()) {
                xf.a.d(this.P, this.O.Q());
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<b> cls2 = b.class;
        S = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        T = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_result");
    }

    public b(@g ie.d<? super R> dVar) {
        this.R = dVar;
    }

    public boolean F() {
        Object d10 = d((y.d) null);
        if (d10 == s.f22024d) {
            return true;
        }
        if (d10 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + d10).toString());
    }

    public void H(@g p1 p1Var) {
        C0498b bVar = new C0498b(p1Var);
        if (!N()) {
            x0(bVar);
            if (!N()) {
                return;
            }
        }
        p1Var.P();
    }

    public void J(@g c cVar, @g l<? super ie.d<? super R>, ? extends Object> lVar) {
        cVar.M(this, lVar);
    }

    public void L(long j10, @g l<? super ie.d<? super R>, ? extends Object> lVar) {
        if (j10 > 0) {
            H(pf.f1.d(e()).W0(j10, new e(this, lVar), e()));
        } else if (F()) {
            xf.b.c(lVar, Q());
        }
    }

    public boolean N() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof j0)) {
                return true;
            }
            ((j0) obj).c(this);
        }
    }

    @g
    public ie.d<R> Q() {
        return this;
    }

    @h
    public StackTraceElement R() {
        return null;
    }

    public final void Z() {
        n2 n2Var = (n2) e().g(n2.D);
        if (n2Var != null) {
            p1 f10 = n2.a.f(n2Var, true, false, new d(), 2, (Object) null);
            h1(f10);
            if (N()) {
                f10.P();
            }
        }
    }

    public <Q> void c0(@g d<? extends Q> dVar, @g p<? super Q, ? super ie.d<? super R>, ? extends Object> pVar) {
        dVar.y(this, pVar);
    }

    public final void c1() {
        p1 e12 = e1();
        if (e12 != null) {
            e12.P();
        }
        for (y yVar = (y) I0(); !l0.g(yVar, this); yVar = yVar.J0()) {
            if (yVar instanceof C0498b) {
                ((C0498b) yVar).R.P();
            }
        }
    }

    @h
    public Object d(@h y.d dVar) {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                if (dVar == null) {
                    if (f1.a(S, this, g.f(), (Object) null)) {
                        break;
                    }
                } else {
                    c cVar = new c(dVar);
                    if (f1.a(S, this, g.f(), cVar)) {
                        Object c10 = cVar.c(this);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
            } else if (obj instanceof j0) {
                if (dVar != null) {
                    wf.d<?> a10 = dVar.a();
                    if ((a10 instanceof a) && ((a) a10).f25119b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    } else if (a10.b((j0) obj)) {
                        return wf.c.f24083b;
                    }
                }
                ((j0) obj).c(this);
            } else if (dVar != null && obj == dVar.f24139c) {
                return s.f22024d;
            } else {
                return null;
            }
        }
        c1();
        return s.f22024d;
    }

    public final void d1(we.a<? extends Object> aVar, we.a<u2> aVar2) {
        while (true) {
            Object obj = this._result;
            if (obj == g.f25125c) {
                if (f1.a(T, this, g.f25125c, aVar.n())) {
                    return;
                }
            } else if (obj != ke.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else if (f1.a(T, this, ke.d.h(), g.f25126d)) {
                aVar2.n();
                return;
            }
        }
    }

    @g
    public ie.g e() {
        return this.R.e();
    }

    public final p1 e1() {
        return (p1) this._parentHandle;
    }

    @a1
    @h
    public final Object f1() {
        if (!N()) {
            Z();
        }
        Object obj = this._result;
        if (obj == g.f25125c) {
            if (f1.a(T, this, g.f25125c, ke.d.h())) {
                return ke.d.h();
            }
            obj = this._result;
        }
        if (obj == g.f25126d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof e0)) {
            return obj;
        } else {
            throw ((e0) obj).f21998a;
        }
    }

    @a1
    public final void g1(@g Throwable th2) {
        if (F()) {
            d1.a aVar = d1.P;
            x(d1.b(e1.a(th2)));
        } else if (!(th2 instanceof CancellationException)) {
            Object f12 = f1();
            if (!(f12 instanceof e0) || ((e0) f12).f21998a != th2) {
                r0.b(e(), th2);
            }
        }
    }

    public <P, Q> void h(@g e<? super P, ? extends Q> eVar, @g p<? super Q, ? super ie.d<? super R>, ? extends Object> pVar) {
        a.C0497a.a(this, eVar, pVar);
    }

    public final void h1(p1 p1Var) {
        this._parentHandle = p1Var;
    }

    public void j0(@g Throwable th2) {
        while (true) {
            Object obj = this._result;
            if (obj == g.f25125c) {
                if (f1.a(T, this, g.f25125c, new e0(th2, false, 2, (xe.w) null))) {
                    return;
                }
            } else if (obj != ke.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else if (f1.a(T, this, ke.d.h(), g.f25126d)) {
                ie.d<R> d10 = ke.c.d(this.R);
                d1.a aVar = d1.P;
                d10.x(d1.b(e1.a(th2)));
                return;
            }
        }
    }

    @h
    public Object q0(@g wf.b bVar) {
        return new a(this, bVar).c((Object) null);
    }

    public <P, Q> void r0(@g e<? super P, ? extends Q> eVar, P p10, @g p<? super Q, ? super ie.d<? super R>, ? extends Object> pVar) {
        eVar.F(this, p10, pVar);
    }

    @g
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    @h
    public le.e u() {
        ie.d<R> dVar = this.R;
        if (dVar instanceof le.e) {
            return (le.e) dVar;
        }
        return null;
    }

    public void x(@g Object obj) {
        ie.d<R> dVar;
        while (true) {
            Object obj2 = this._result;
            if (obj2 == g.f25125c) {
                if (f1.a(T, this, g.f25125c, k0.d(obj, (l) null, 1, (Object) null))) {
                    return;
                }
            } else if (obj2 != ke.d.h()) {
                throw new IllegalStateException("Already resumed");
            } else if (f1.a(T, this, ke.d.h(), g.f25126d)) {
                if (d1.i(obj)) {
                    dVar = this.R;
                    Throwable e10 = d1.e(obj);
                    l0.m(e10);
                    d1.a aVar = d1.P;
                    obj = d1.b(e1.a(e10));
                } else {
                    dVar = this.R;
                }
                dVar.x(obj);
                return;
            }
        }
    }
}

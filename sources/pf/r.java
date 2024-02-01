package pf;

import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import le.e;
import pf.n2;
import we.a;
import we.l;
import wf.r0;
import xe.w;
import zd.a1;
import zd.f1;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001f\u0012\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000p\u0012\u0006\u0010-\u001a\u00020'¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\b¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010\"\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u00152\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J8\u0010%\u001a\u00020$2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*JZ\u00100\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122\b\u0010/\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b0\u00101JH\u00102\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020'2%\b\u0002\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b2\u00103JJ\u00105\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u00010 2\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010,\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u001fJ\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u001fJ\u000f\u0010<\u001a\u00020\u0006H\u0001¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0016¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bF\u0010\fJ\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020$2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bI\u0010JJ8\u0010K\u001a\u00020\u000e2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\bP\u0010BJ \u0010S\u001a\u00020\u000e2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ<\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00028\u00002#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\bV\u0010WJ8\u0010\u0001\u001a\u00020\u000e2'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e0\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0001\u0010XJ\u000f\u0010Y\u001a\u00020\u000eH\u0000¢\u0006\u0004\bY\u0010\u001fJ#\u0010Z\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bZ\u0010[JH\u0010\\\u001a\u0004\u0018\u00010 2\u0006\u0010U\u001a\u00028\u00002\b\u0010/\u001a\u0004\u0018\u00010 2#\u0010.\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u0004\u0018\u00010 2\u0006\u0010^\u001a\u00020\tH\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020 H\u0016¢\u0006\u0004\bb\u0010TJ\u001b\u0010d\u001a\u00020\u000e*\u00020c2\u0006\u0010U\u001a\u00028\u0000H\u0016¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u000e*\u00020c2\u0006\u0010^\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010h\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\bj\u0010kJ\u000f\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020lH\u0014¢\u0006\u0004\bo\u0010nR \u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000p8\u0000X\u0004¢\u0006\f\n\u0004\b?\u0010q\u001a\u0004\br\u0010sR\u001a\u0010y\u001a\u00020u8\u0016X\u0004¢\u0006\f\n\u0004\b_\u0010v\u001a\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010zR\u0014\u0010}\u001a\u00020l8BX\u0004¢\u0006\u0006\u001a\u0004\b|\u0010nR\u0016\u0010!\u001a\u0004\u0018\u00010 8@X\u0004¢\u0006\u0006\u001a\u0004\b~\u0010BR\u0015\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\bR\u0016\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\bR\u0016\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lpf/r;", "T", "Lpf/j1;", "Lpf/q;", "Lle/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "E", "()Z", "", "cause", "s", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "Lzd/u2;", "block", "o", "(Lwe/a;)V", "Lkotlin/Function1;", "Lzd/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "n", "(Lwe/l;Ljava/lang/Throwable;)V", "Q", "O", "Lpf/p1;", "D", "()Lpf/p1;", "J", "()V", "", "state", "G", "(Lwe/l;Ljava/lang/Object;)V", "Lpf/o;", "F", "(Lwe/l;)Lpf/o;", "", "mode", "w", "(I)V", "Lpf/d3;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "N", "(Lpf/d3;Ljava/lang/Object;ILwe/l;Ljava/lang/Object;)Ljava/lang/Object;", "L", "(Ljava/lang/Object;ILwe/l;)V", "Lwf/r0;", "P", "(Ljava/lang/Object;Ljava/lang/Object;Lwe/l;)Lwf/r0;", "", "k", "(Ljava/lang/Object;)Ljava/lang/Void;", "v", "Z", "K", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "R", "()Ljava/lang/StackTraceElement;", "j", "()Ljava/lang/Object;", "takenState", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "f", "I", "(Ljava/lang/Throwable;)V", "l", "(Lpf/o;Ljava/lang/Throwable;)V", "q", "Lpf/n2;", "parent", "y", "(Lpf/n2;)Ljava/lang/Throwable;", "z", "Lzd/d1;", "result", "x", "(Ljava/lang/Object;)V", "value", "B", "(Ljava/lang/Object;Lwe/l;)V", "(Lwe/l;)V", "t", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "p", "(Ljava/lang/Object;Ljava/lang/Object;Lwe/l;)Ljava/lang/Object;", "exception", "S", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "t0", "Lpf/o0;", "W", "(Lpf/o0;Ljava/lang/Object;)V", "U", "(Lpf/o0;Ljava/lang/Throwable;)V", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "H", "Lie/d;", "Lie/d;", "d", "()Lie/d;", "delegate", "Lie/g;", "Lie/g;", "e", "()Lie/g;", "context", "Lpf/p1;", "parentHandle", "C", "stateDebugRepresentation", "A", "c", "isActive", "m", "isCompleted", "isCancelled", "u", "()Lle/e;", "callerFrame", "<init>", "(Lie/d;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public class r<T> extends j1<T> implements q<T>, e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater U = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater V = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_state");
    @g
    public final d<T> R;
    @g
    public final ie.g S;
    @h
    public p1 T;
    @g
    private volatile /* synthetic */ int _decision = 0;
    @g
    private volatile /* synthetic */ Object _state = d.O;

    public r(@g d<? super T> dVar, int i10) {
        super(i10);
        this.R = dVar;
        this.S = dVar.e();
    }

    public static /* synthetic */ void M(r rVar, Object obj, int i10, l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            rVar.L(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    @h
    public final Object A() {
        return this._state;
    }

    public void B(T t10, @h l<? super Throwable, u2> lVar) {
        L(t10, this.Q, lVar);
    }

    public final String C() {
        Object A = A();
        return A instanceof d3 ? "Active" : A instanceof u ? "Cancelled" : "Completed";
    }

    public final p1 D() {
        n2 n2Var = (n2) e().g(n2.D);
        if (n2Var == null) {
            return null;
        }
        p1 f10 = n2.a.f(n2Var, true, false, new v(this), 2, (Object) null);
        this.T = f10;
        return f10;
    }

    public final boolean E() {
        return k1.d(this.Q) && ((wf.l) this.R).s();
    }

    public final o F(l<? super Throwable, u2> lVar) {
        return lVar instanceof o ? (o) lVar : new k2(lVar);
    }

    public final void G(l<? super Throwable, u2> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    @g
    public String H() {
        return "CancellableContinuation";
    }

    public final void I(@g Throwable th2) {
        if (!s(th2)) {
            f(th2);
            v();
        }
    }

    public final void J() {
        Throwable A;
        d<T> dVar = this.R;
        wf.l lVar = dVar instanceof wf.l ? (wf.l) dVar : null;
        if (lVar != null && (A = lVar.A(this)) != null) {
            t();
            f(A);
        }
    }

    @ve.h(name = "resetStateReusable")
    public final boolean K() {
        Object obj = this._state;
        if (!(obj instanceof d0) || ((d0) obj).f21993d == null) {
            this._decision = 0;
            this._state = d.O;
            return true;
        }
        t();
        return false;
    }

    public final void L(Object obj, int i10, l<? super Throwable, u2> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof d3) {
            } else {
                if (obj2 instanceof u) {
                    u uVar = (u) obj2;
                    if (uVar.c()) {
                        if (lVar != null) {
                            q(lVar, uVar.f21998a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new y();
            }
        } while (!f1.a(V, this, obj2, N((d3) obj2, obj, i10, lVar, (Object) null)));
        v();
        w(i10);
    }

    public final Object N(d3 d3Var, Object obj, int i10, l<? super Throwable, u2> lVar, Object obj2) {
        if (obj instanceof e0) {
            return obj;
        }
        if (!k1.c(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(d3Var instanceof o) || (d3Var instanceof g)) && obj2 == null)) {
            return obj;
        }
        return new d0(obj, d3Var instanceof o ? (o) d3Var : null, lVar, obj2, (Throwable) null, 16, (w) null);
    }

    public final boolean O() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!U.compareAndSet(this, 0, 2));
        return true;
    }

    public final r0 P(Object obj, Object obj2, l<? super Throwable, u2> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof d3) {
            } else if (!(obj3 instanceof d0) || obj2 == null || ((d0) obj3).f21993d != obj2) {
                return null;
            } else {
                return s.f22024d;
            }
        } while (!f1.a(V, this, obj3, N((d3) obj3, obj, this.Q, lVar, obj2)));
        v();
        return s.f22024d;
    }

    public final boolean Q() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!U.compareAndSet(this, 0, 1));
        return true;
    }

    @h
    public StackTraceElement R() {
        return null;
    }

    @h
    public Object S(@g Throwable th2) {
        return P(new e0(th2, false, 2, (w) null), (Object) null, (l<? super Throwable, u2>) null);
    }

    public void T(@g l<? super Throwable, u2> lVar) {
        o F = F(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (f1.a(V, this, obj, F)) {
                    return;
                }
            } else if (obj instanceof o) {
                G(lVar, obj);
            } else {
                boolean z10 = obj instanceof e0;
                if (z10) {
                    e0 e0Var = (e0) obj;
                    if (!e0Var.b()) {
                        G(lVar, obj);
                    }
                    if (obj instanceof u) {
                        Throwable th2 = null;
                        if (!z10) {
                            e0Var = null;
                        }
                        if (e0Var != null) {
                            th2 = e0Var.f21998a;
                        }
                        n(lVar, th2);
                        return;
                    }
                    return;
                } else if (obj instanceof d0) {
                    d0 d0Var = (d0) obj;
                    if (d0Var.f21991b != null) {
                        G(lVar, obj);
                    }
                    if (!(F instanceof g)) {
                        if (d0Var.h()) {
                            n(lVar, d0Var.f21994e);
                            return;
                        }
                        if (f1.a(V, this, obj, d0.g(d0Var, (Object) null, F, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(F instanceof g)) {
                    if (f1.a(V, this, obj, new d0(obj, F, (l) null, (Object) null, (Throwable) null, 28, (w) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void U(@g o0 o0Var, @g Throwable th2) {
        d<T> dVar = this.R;
        o0 o0Var2 = null;
        wf.l lVar = dVar instanceof wf.l ? (wf.l) dVar : null;
        e0 e0Var = new e0(th2, false, 2, (w) null);
        if (lVar != null) {
            o0Var2 = lVar.R;
        }
        M(this, e0Var, o0Var2 == o0Var ? 4 : this.Q, (l) null, 4, (Object) null);
    }

    public void W(@g o0 o0Var, T t10) {
        d<T> dVar = this.R;
        o0 o0Var2 = null;
        wf.l lVar = dVar instanceof wf.l ? (wf.l) dVar : null;
        if (lVar != null) {
            o0Var2 = lVar.R;
        }
        M(this, t10, o0Var2 == o0Var ? 4 : this.Q, (l) null, 4, (Object) null);
    }

    public void Z() {
        p1 D = D();
        if (D != null && m()) {
            D.P();
            this.T = c3.O;
        }
    }

    public void b(@h Object obj, @g Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof d3) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof e0)) {
                if (obj2 instanceof d0) {
                    d0 d0Var = (d0) obj2;
                    if (!d0Var.h()) {
                        if (f1.a(V, this, obj2, d0.g(d0Var, (Object) null, (o) null, (l) null, (Object) null, th2, 15, (Object) null))) {
                            d0Var.i(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f1.a(V, this, obj2, new d0(obj2, (o) null, (l) null, (Object) null, th2, 14, (w) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public boolean c() {
        return A() instanceof d3;
    }

    @g
    public final d<T> d() {
        return this.R;
    }

    @g
    public ie.g e() {
        return this.S;
    }

    public boolean f(@h Throwable th2) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof d3)) {
                return false;
            }
            z10 = obj instanceof o;
        } while (!f1.a(V, this, obj, new u(this, th2, z10)));
        o oVar = z10 ? (o) obj : null;
        if (oVar != null) {
            l(oVar, th2);
        }
        v();
        w(this.Q);
        return true;
    }

    @h
    public Throwable g(@h Object obj) {
        Throwable g10 = super.g(obj);
        if (g10 != null) {
            return g10;
        }
        return null;
    }

    public <T> T h(@h Object obj) {
        return obj instanceof d0 ? ((d0) obj).f21990a : obj;
    }

    public boolean isCancelled() {
        return A() instanceof u;
    }

    @h
    public Object j() {
        return A();
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void l(@g o oVar, @h Throwable th2) {
        try {
            oVar.c(th2);
        } catch (Throwable th3) {
            ie.g e10 = e();
            r0.b(e10, new h0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public boolean m() {
        return !(A() instanceof d3);
    }

    public final void n(l<? super Throwable, u2> lVar, Throwable th2) {
        try {
            lVar.A(th2);
        } catch (Throwable th3) {
            ie.g e10 = e();
            r0.b(e10, new h0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void o(a<u2> aVar) {
        try {
            aVar.n();
        } catch (Throwable th2) {
            ie.g e10 = e();
            r0.b(e10, new h0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @h
    public Object p(T t10, @h Object obj, @h l<? super Throwable, u2> lVar) {
        return P(t10, obj, lVar);
    }

    public final void q(@g l<? super Throwable, u2> lVar, @g Throwable th2) {
        try {
            lVar.A(th2);
        } catch (Throwable th3) {
            ie.g e10 = e();
            r0.b(e10, new h0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @h
    public Object r(T t10, @h Object obj) {
        return P(t10, obj, (l<? super Throwable, u2>) null);
    }

    public final boolean s(Throwable th2) {
        if (!E()) {
            return false;
        }
        return ((wf.l) this.R).t(th2);
    }

    public final void t() {
        p1 p1Var = this.T;
        if (p1Var != null) {
            p1Var.P();
            this.T = c3.O;
        }
    }

    public void t0(@g Object obj) {
        w(this.Q);
    }

    @g
    public String toString() {
        return H() + '(' + z0.c(this.R) + "){" + C() + "}@" + z0.b(this);
    }

    @h
    public e u() {
        d<T> dVar = this.R;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final void v() {
        if (!E()) {
            t();
        }
    }

    public final void w(int i10) {
        if (!O()) {
            k1.a(this, i10);
        }
    }

    public void x(@g Object obj) {
        M(this, k0.b(obj, this), this.Q, (l) null, 4, (Object) null);
    }

    @g
    public Throwable y(@g n2 n2Var) {
        return n2Var.k0();
    }

    @a1
    @h
    public final Object z() {
        n2 n2Var;
        boolean E = E();
        if (Q()) {
            if (this.T == null) {
                D();
            }
            if (E) {
                J();
            }
            return ke.d.h();
        }
        if (E) {
            J();
        }
        Object A = A();
        if (A instanceof e0) {
            throw ((e0) A).f21998a;
        } else if (!k1.c(this.Q) || (n2Var = (n2) e().g(n2.D)) == null || n2Var.c()) {
            return h(A);
        } else {
            CancellationException k02 = n2Var.k0();
            b(A, k02);
            throw k02;
        }
    }
}

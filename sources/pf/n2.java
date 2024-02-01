package pf;

import fh.h;
import ie.d;
import ie.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import we.l;
import we.p;
import zd.i0;
import zd.k;
import zd.m;
import zd.u2;
import zf.c;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 -2\u00020\u0001:\u0001.J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0002R\u0014\u0010!\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010$\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00000%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lpf/n2;", "Lie/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k0", "", "start", "cause", "Lzd/u2;", "h", "cancel", "", "f", "Lpf/y;", "child", "Lpf/w;", "A1", "L1", "(Lie/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lzd/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lpf/p1;", "A", "onCancelling", "invokeImmediately", "e0", "other", "q", "c", "()Z", "isActive", "m", "isCompleted", "isCancelled", "Lif/m;", "P", "()Lif/m;", "children", "Lzf/c;", "f1", "()Lzf/c;", "onJoin", "D", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface n2 extends g.b {
    @fh.g
    public static final b D = b.O;

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void b(n2 n2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                n2Var.h(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ boolean c(n2 n2Var, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th2 = null;
                }
                return n2Var.f(th2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R d(@fh.g n2 n2Var, R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(n2Var, r10, pVar);
        }

        @h
        public static <E extends g.b> E e(@fh.g n2 n2Var, @fh.g g.c<E> cVar) {
            return g.b.a.b(n2Var, cVar);
        }

        public static /* synthetic */ p1 f(n2 n2Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return n2Var.e0(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        @fh.g
        public static g g(@fh.g n2 n2Var, @fh.g g.c<?> cVar) {
            return g.b.a.c(n2Var, cVar);
        }

        @fh.g
        public static g h(@fh.g n2 n2Var, @fh.g g gVar) {
            return g.b.a.d(n2Var, gVar);
        }

        @fh.g
        @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static n2 i(@fh.g n2 n2Var, @fh.g n2 n2Var2) {
            return n2Var2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpf/n2$b;", "Lie/g$c;", "Lpf/n2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements g.c<n2> {
        public static final /* synthetic */ b O = new b();
    }

    @fh.g
    p1 A(@fh.g l<? super Throwable, u2> lVar);

    @fh.g
    @i2
    w A1(@fh.g y yVar);

    @h
    Object L1(@fh.g d<? super u2> dVar);

    @fh.g
    p000if.m<n2> P();

    boolean c();

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @fh.g
    @i2
    p1 e0(boolean z10, boolean z11, @fh.g l<? super Throwable, u2> lVar);

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean f(Throwable th2);

    @fh.g
    c f1();

    void h(@h CancellationException cancellationException);

    boolean isCancelled();

    @fh.g
    @i2
    CancellationException k0();

    boolean m();

    @fh.g
    @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    n2 q(@fh.g n2 n2Var);

    boolean start();
}

package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import le.f;
import le.o;
import pf.j;
import pf.m1;
import pf.n2;
import pf.u0;
import we.p;
import zd.e1;
import zd.k;
import zd.u2;

public final class k0 {

    @f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    public static final class a extends o implements p<u0, d<? super T>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ p U;
        public final /* synthetic */ p.b V;
        public final /* synthetic */ we.p<u0, d<? super T>, Object> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, p.b bVar, we.p<? super u0, ? super d<? super T>, ? extends Object> pVar2, d<? super a> dVar) {
            super(2, dVar);
            this.U = pVar;
            this.V = bVar;
            this.W = pVar2;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, this.V, this.W, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            r rVar;
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                n2 n2Var = (n2) ((u0) this.T).H().g(n2.D);
                if (n2Var != null) {
                    j0 j0Var = new j0();
                    r rVar2 = new r(this.U, this.V, j0Var.Q, n2Var);
                    try {
                        we.p<u0, d<? super T>, Object> pVar = this.W;
                        this.T = rVar2;
                        this.S = 1;
                        obj = j.h(j0Var, pVar, this);
                        if (obj == h10) {
                            return h10;
                        }
                        rVar = rVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVar2;
                        rVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i10 == 1) {
                rVar = (r) this.T;
                try {
                    e1.n(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar.b();
            return obj;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super T> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @h
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object a(@g p pVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar2, @g d<? super T> dVar) {
        return g(pVar, p.b.CREATED, pVar2, dVar);
    }

    @h
    @k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object b(@g y yVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar, @g d<? super T> dVar) {
        return a(yVar.getLifecycle(), pVar, dVar);
    }

    @h
    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object c(@g p pVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar2, @g d<? super T> dVar) {
        return g(pVar, p.b.RESUMED, pVar2, dVar);
    }

    @h
    @k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object d(@g y yVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar, @g d<? super T> dVar) {
        return c(yVar.getLifecycle(), pVar, dVar);
    }

    @h
    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object e(@g p pVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar2, @g d<? super T> dVar) {
        return g(pVar, p.b.STARTED, pVar2, dVar);
    }

    @h
    @k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object f(@g y yVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar, @g d<? super T> dVar) {
        return e(yVar.getLifecycle(), pVar, dVar);
    }

    @h
    @k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    public static final <T> Object g(@g p pVar, @g p.b bVar, @g we.p<? super u0, ? super d<? super T>, ? extends Object> pVar2, @g d<? super T> dVar) {
        return j.h(m1.e().S1(), new a(pVar, bVar, pVar2, (d<? super a>) null), dVar);
    }
}

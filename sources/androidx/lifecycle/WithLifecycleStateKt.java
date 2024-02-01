package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import ie.i;
import pf.m1;
import pf.o0;
import pf.r;
import pf.z2;
import we.l;
import xe.i0;
import xe.n0;
import xe.r1;
import zd.a1;
import zd.u2;

@r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
public final class WithLifecycleStateKt {

    public static final class a implements Runnable {
        public final /* synthetic */ p O;
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 P;

        public a(p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.O = pVar;
            this.P = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        public final void run() {
            this.O.a(this.P);
        }
    }

    public static final class b extends n0 implements l<Throwable, u2> {
        public final /* synthetic */ o0 P;
        public final /* synthetic */ p Q;
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 R;

        public static final class a implements Runnable {
            public final /* synthetic */ p O;
            public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 P;

            public a(p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.O = pVar;
                this.P = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            public final void run() {
                this.O.d(this.P);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(o0 o0Var, p pVar, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.P = o0Var;
            this.Q = pVar;
            this.R = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@h Throwable th2) {
            o0 o0Var = this.P;
            i iVar = i.O;
            if (o0Var.P1(iVar)) {
                this.P.N1(iVar, new a(this.Q, this.R));
            } else {
                this.Q.d(this.R);
            }
        }
    }

    @r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
    public static final class c extends n0 implements we.a<R> {
        public final /* synthetic */ we.a<R> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(we.a<? extends R> aVar) {
            super(0);
            this.P = aVar;
        }

        public final R n() {
            return this.P.n();
        }
    }

    @a1
    @h
    public static final <R> Object a(@g p pVar, @g p.b bVar, boolean z10, @g o0 o0Var, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        r rVar = new r(ke.c.d(dVar), 1);
        rVar.Z();
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1(bVar, pVar, rVar, aVar);
        if (z10) {
            o0Var.N1(i.O, new a(pVar, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        } else {
            pVar.a(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        rVar.T(new b(o0Var, pVar, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        Object z11 = rVar.z();
        if (z11 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z11;
    }

    @h
    public static final <R> Object b(@g p pVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p.b bVar = p.b.CREATED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            } else if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, P1, S1, new c(aVar), dVar);
    }

    @h
    public static final <R> Object c(@g y yVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p lifecycle = yVar.getLifecycle();
        p.b bVar = p.b.CREATED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            } else if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, P1, S1, new c(aVar), dVar);
    }

    public static final <R> Object d(p pVar, we.a<? extends R> aVar, d<? super R> dVar) {
        p.b bVar = p.b.CREATED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    public static final <R> Object e(y yVar, we.a<? extends R> aVar, d<? super R> dVar) {
        yVar.getLifecycle();
        p.b bVar = p.b.CREATED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    @h
    public static final <R> Object f(@g p pVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p.b bVar = p.b.RESUMED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            } else if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, P1, S1, new c(aVar), dVar);
    }

    @h
    public static final <R> Object g(@g y yVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p lifecycle = yVar.getLifecycle();
        p.b bVar = p.b.RESUMED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            } else if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, P1, S1, new c(aVar), dVar);
    }

    public static final <R> Object h(p pVar, we.a<? extends R> aVar, d<? super R> dVar) {
        p.b bVar = p.b.RESUMED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    public static final <R> Object i(y yVar, we.a<? extends R> aVar, d<? super R> dVar) {
        yVar.getLifecycle();
        p.b bVar = p.b.RESUMED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    @h
    public static final <R> Object j(@g p pVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p.b bVar = p.b.STARTED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            } else if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, P1, S1, new c(aVar), dVar);
    }

    @h
    public static final <R> Object k(@g y yVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p lifecycle = yVar.getLifecycle();
        p.b bVar = p.b.STARTED;
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (lifecycle.b() == p.b.DESTROYED) {
                throw new t();
            } else if (lifecycle.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(lifecycle, bVar, P1, S1, new c(aVar), dVar);
    }

    public static final <R> Object l(p pVar, we.a<? extends R> aVar, d<? super R> dVar) {
        p.b bVar = p.b.STARTED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    public static final <R> Object m(y yVar, we.a<? extends R> aVar, d<? super R> dVar) {
        yVar.getLifecycle();
        p.b bVar = p.b.STARTED;
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    @h
    public static final <R> Object n(@g p pVar, @g p.b bVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        if (bVar.compareTo(p.b.CREATED) >= 0) {
            z2 S1 = m1.e().S1();
            boolean P1 = S1.P1(dVar.e());
            if (!P1) {
                if (pVar.b() == p.b.DESTROYED) {
                    throw new t();
                } else if (pVar.b().compareTo(bVar) >= 0) {
                    return aVar.n();
                }
            }
            return a(pVar, bVar, P1, S1, new c(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    @h
    public static final <R> Object o(@g y yVar, @g p.b bVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        p lifecycle = yVar.getLifecycle();
        if (bVar.compareTo(p.b.CREATED) >= 0) {
            z2 S1 = m1.e().S1();
            boolean P1 = S1.P1(dVar.e());
            if (!P1) {
                if (lifecycle.b() == p.b.DESTROYED) {
                    throw new t();
                } else if (lifecycle.b().compareTo(bVar) >= 0) {
                    return aVar.n();
                }
            }
            return a(lifecycle, bVar, P1, S1, new c(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
    }

    public static final <R> Object p(p pVar, p.b bVar, we.a<? extends R> aVar, d<? super R> dVar) {
        if (!(bVar.compareTo(p.b.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    public static final <R> Object q(y yVar, p.b bVar, we.a<? extends R> aVar, d<? super R> dVar) {
        yVar.getLifecycle();
        if (!(bVar.compareTo(p.b.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + bVar).toString());
        }
        m1.e().S1();
        i0.e(3);
        throw null;
    }

    @a1
    @h
    public static final <R> Object r(@g p pVar, @g p.b bVar, @g we.a<? extends R> aVar, @g d<? super R> dVar) {
        z2 S1 = m1.e().S1();
        boolean P1 = S1.P1(dVar.e());
        if (!P1) {
            if (pVar.b() == p.b.DESTROYED) {
                throw new t();
            } else if (pVar.b().compareTo(bVar) >= 0) {
                return aVar.n();
            }
        }
        return a(pVar, bVar, P1, S1, new c(aVar), dVar);
    }

    @a1
    public static final <R> Object s(p pVar, p.b bVar, we.a<? extends R> aVar, d<? super R> dVar) {
        m1.e().S1();
        i0.e(3);
        throw null;
    }
}

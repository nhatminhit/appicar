package ke;

import fh.g;
import fh.h;
import ie.i;
import le.j;
import we.l;
import we.p;
import we.q;
import xe.l0;
import xe.u1;
import zd.e1;
import zd.h1;
import zd.u2;

public class c {

    public static final class a extends j {
        public int P;
        public final /* synthetic */ l<ie.d<? super T>, Object> Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ie.d<? super T> dVar, l<? super ie.d<? super T>, ? extends Object> lVar) {
            super(dVar);
            this.Q = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.P;
            if (i10 == 0) {
                this.P = 1;
                e1.n(obj);
                return this.Q.A(this);
            } else if (i10 == 1) {
                this.P = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class b extends le.d {
        public int R;
        public final /* synthetic */ l<ie.d<? super T>, Object> S;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ie.d<? super T> dVar, ie.g gVar, l<? super ie.d<? super T>, ? extends Object> lVar) {
            super(dVar, gVar);
            this.S = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.R;
            if (i10 == 0) {
                this.R = 1;
                e1.n(obj);
                return this.S.A(this);
            } else if (i10 == 1) {
                this.R = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: ke.c$c  reason: collision with other inner class name */
    public static final class C0345c extends j {
        public int P;
        public final /* synthetic */ l Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0345c(ie.d dVar, l lVar) {
            super(dVar);
            this.Q = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.P;
            if (i10 == 0) {
                this.P = 1;
                e1.n(obj);
                l0.n(this.Q, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) u1.q(this.Q, 1)).A(this);
            } else if (i10 == 1) {
                this.P = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class d extends le.d {
        public int R;
        public final /* synthetic */ l S;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ie.d dVar, ie.g gVar, l lVar) {
            super(dVar, gVar);
            this.S = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.R;
            if (i10 == 0) {
                this.R = 1;
                e1.n(obj);
                l0.n(this.S, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) u1.q(this.S, 1)).A(this);
            } else if (i10 == 1) {
                this.R = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class e extends j {
        public int P;
        public final /* synthetic */ p Q;
        public final /* synthetic */ Object R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ie.d dVar, p pVar, Object obj) {
            super(dVar);
            this.Q = pVar;
            this.R = obj;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.P;
            if (i10 == 0) {
                this.P = 1;
                e1.n(obj);
                l0.n(this.Q, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) u1.q(this.Q, 2)).g0(this.R, this);
            } else if (i10 == 1) {
                this.P = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class f extends le.d {
        public int R;
        public final /* synthetic */ p S;
        public final /* synthetic */ Object T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ie.d dVar, ie.g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.S = pVar;
            this.T = obj;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @h
        public Object K(@g Object obj) {
            int i10 = this.R;
            if (i10 == 0) {
                this.R = 1;
                e1.n(obj);
                l0.n(this.S, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) u1.q(this.S, 2)).g0(this.T, this);
            } else if (i10 == 1) {
                this.R = 2;
                e1.n(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @h1(version = "1.3")
    public static final <T> ie.d<u2> a(ie.d<? super T> dVar, l<? super ie.d<? super T>, ? extends Object> lVar) {
        ie.g e10 = dVar.e();
        return e10 == i.O ? new a(dVar, lVar) : new b(dVar, e10, lVar);
    }

    @g
    @h1(version = "1.3")
    public static final <T> ie.d<u2> b(@g l<? super ie.d<? super T>, ? extends Object> lVar, @g ie.d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        ie.d<? super T> a10 = le.h.a(dVar);
        if (lVar instanceof le.a) {
            return ((le.a) lVar).G(a10);
        }
        ie.g e10 = a10.e();
        return e10 == i.O ? new C0345c(a10, lVar) : new d(a10, e10, lVar);
    }

    @g
    @h1(version = "1.3")
    public static final <R, T> ie.d<u2> c(@g p<? super R, ? super ie.d<? super T>, ? extends Object> pVar, R r10, @g ie.d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        ie.d<? super T> a10 = le.h.a(dVar);
        if (pVar instanceof le.a) {
            return ((le.a) pVar).H(r10, a10);
        }
        ie.g e10 = a10.e();
        return e10 == i.O ? new e(a10, pVar, r10) : new f(a10, e10, pVar, r10);
    }

    @g
    @h1(version = "1.3")
    public static final <T> ie.d<T> d(@g ie.d<? super T> dVar) {
        ie.d<Object> N;
        l0.p(dVar, "<this>");
        le.d dVar2 = dVar instanceof le.d ? (le.d) dVar : null;
        return (dVar2 == null || (N = dVar2.N()) == null) ? dVar : N;
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> Object e(l<? super ie.d<? super T>, ? extends Object> lVar, ie.d<? super T> dVar) {
        l0.p(lVar, "<this>");
        l0.p(dVar, "completion");
        return ((l) u1.q(lVar, 1)).A(dVar);
    }

    @h1(version = "1.3")
    @oe.f
    public static final <R, T> Object f(p<? super R, ? super ie.d<? super T>, ? extends Object> pVar, R r10, ie.d<? super T> dVar) {
        l0.p(pVar, "<this>");
        l0.p(dVar, "completion");
        return ((p) u1.q(pVar, 2)).g0(r10, dVar);
    }

    @oe.f
    public static final <R, P, T> Object g(q<? super R, ? super P, ? super ie.d<? super T>, ? extends Object> qVar, R r10, P p10, ie.d<? super T> dVar) {
        l0.p(qVar, "<this>");
        l0.p(dVar, "completion");
        return ((q) u1.q(qVar, 3)).y(r10, p10, dVar);
    }
}

package zd;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import we.q;
import xe.l0;
import xe.u1;
import xe.w;
import zd.d1;

public final class j<T, R> extends i<T, R> implements d<R> {
    @g
    public q<? super i<?, ?>, Object, ? super d<Object>, ? extends Object> O;
    @h
    public Object P;
    @h
    public d<Object> Q = this;
    @g
    public Object R = h.f25114a;

    public static final class a implements d<Object> {
        public final /* synthetic */ ie.g O;
        public final /* synthetic */ j P;
        public final /* synthetic */ q Q;
        public final /* synthetic */ d R;

        public a(ie.g gVar, j jVar, q qVar, d dVar) {
            this.O = gVar;
            this.P = jVar;
            this.Q = qVar;
            this.R = dVar;
        }

        @g
        public ie.g e() {
            return this.O;
        }

        public void x(@g Object obj) {
            this.P.O = this.Q;
            this.P.Q = this.R;
            this.P.R = obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(@g q<? super i<T, R>, ? super T, ? super d<? super R>, ? extends Object> qVar, T t10) {
        super((w) null);
        l0.p(qVar, "block");
        this.O = qVar;
        this.P = t10;
        l0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @h
    public Object a(T t10, @g d<? super R> dVar) {
        l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.Q = dVar;
        this.P = t10;
        Object h10 = ke.d.h();
        if (h10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return h10;
    }

    @h
    public <U, S> Object b(@g g<U, S> gVar, U u10, @g d<? super S> dVar) {
        q<i<U, S>, U, d<? super S>, Object> a10 = gVar.a();
        l0.n(a10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        q<? super i<?, ?>, Object, ? super d<Object>, ? extends Object> qVar = this.O;
        if (a10 != qVar) {
            this.O = a10;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.Q = j(qVar, dVar);
        } else {
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.Q = dVar;
        }
        this.P = u10;
        Object h10 = ke.d.h();
        if (h10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return h10;
    }

    @g
    public ie.g e() {
        return i.O;
    }

    public final d<Object> j(q<? super i<?, ?>, Object, ? super d<Object>, ? extends Object> qVar, d<Object> dVar) {
        return new a(i.O, this, qVar, dVar);
    }

    public final R k() {
        Object obj;
        while (true) {
            R r10 = this.R;
            d<Object> dVar = this.Q;
            if (dVar == null) {
                e1.n(r10);
                return r10;
            }
            if (d1.d(h.f25114a, r10)) {
                try {
                    q<? super i<?, ?>, Object, ? super d<Object>, ? extends Object> qVar = this.O;
                    Object obj2 = this.P;
                    l0.n(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    obj = ((q) u1.q(qVar, 3)).y(this, obj2, dVar);
                    if (obj != ke.d.h()) {
                        d1.a aVar = d1.P;
                        r10 = d1.b(obj);
                    }
                } catch (Throwable th2) {
                    d1.a aVar2 = d1.P;
                    obj = e1.a(th2);
                }
            } else {
                this.R = h.f25114a;
            }
            dVar.x(r10);
        }
    }

    public void x(@g Object obj) {
        this.Q = null;
        this.R = obj;
    }
}

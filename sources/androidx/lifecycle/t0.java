package androidx.lifecycle;

import d.j;
import d.j0;
import fh.g;
import ve.h;
import we.l;
import xe.d0;
import xe.k1;
import xe.l0;
import xe.n0;
import zd.k;
import zd.m;
import zd.u2;
import zd.v;

@h(name = "Transformations")
public final class t0 {

    public static final class a extends n0 implements l<X, u2> {
        public final /* synthetic */ e0<X> P;
        public final /* synthetic */ k1.a Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e0<X> e0Var, k1.a aVar) {
            super(1);
            this.P = e0Var;
            this.Q = aVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c(obj);
            return u2.f25116a;
        }

        public final void c(X x10) {
            X f10 = this.P.f();
            if (this.Q.O || ((f10 == null && x10 != null) || (f10 != null && !l0.g(f10, x10)))) {
                this.Q.O = false;
                this.P.r(x10);
            }
        }
    }

    public static final class b extends n0 implements l<X, u2> {
        public final /* synthetic */ e0<Y> P;
        public final /* synthetic */ l<X, Y> Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e0<Y> e0Var, l<X, Y> lVar) {
            super(1);
            this.P = e0Var;
            this.Q = lVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c(obj);
            return u2.f25116a;
        }

        public final void c(X x10) {
            this.P.r(this.Q.A(x10));
        }
    }

    public static final class c extends n0 implements l<Object, u2> {
        public final /* synthetic */ e0<Object> P;
        public final /* synthetic */ p.a<Object, Object> Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e0<Object> e0Var, p.a<Object, Object> aVar) {
            super(1);
            this.P = e0Var;
            this.Q = aVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c(obj);
            return u2.f25116a;
        }

        public final void c(Object obj) {
            this.P.r(this.Q.apply(obj));
        }
    }

    public static final class d implements h0, d0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f2847a;

        public d(l lVar) {
            l0.p(lVar, "function");
            this.f2847a = lVar;
        }

        @g
        public final v<?> a() {
            return this.f2847a;
        }

        public final boolean equals(@fh.h Object obj) {
            if (!(obj instanceof h0) || !(obj instanceof d0)) {
                return false;
            }
            return l0.g(a(), ((d0) obj).a());
        }

        public final /* synthetic */ void f(Object obj) {
            this.f2847a.A(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class e implements h0<X> {
        @fh.h

        /* renamed from: a  reason: collision with root package name */
        public LiveData<Y> f2848a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<X, LiveData<Y>> f2849b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e0<Y> f2850c;

        public static final class a extends n0 implements l<Y, u2> {
            public final /* synthetic */ e0<Y> P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e0<Y> e0Var) {
                super(1);
                this.P = e0Var;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c(obj);
                return u2.f25116a;
            }

            public final void c(Y y10) {
                this.P.r(y10);
            }
        }

        public e(l<X, LiveData<Y>> lVar, e0<Y> e0Var) {
            this.f2849b = lVar;
            this.f2850c = e0Var;
        }

        @fh.h
        public final LiveData<Y> a() {
            return this.f2848a;
        }

        public final void b(@fh.h LiveData<Y> liveData) {
            this.f2848a = liveData;
        }

        public void f(X x10) {
            LiveData<Y> A = this.f2849b.A(x10);
            LiveData<Y> liveData = this.f2848a;
            if (liveData != A) {
                if (liveData != null) {
                    e0<Y> e0Var = this.f2850c;
                    l0.m(liveData);
                    e0Var.t(liveData);
                }
                this.f2848a = A;
                if (A != null) {
                    e0<Y> e0Var2 = this.f2850c;
                    l0.m(A);
                    e0Var2.s(A, new d(new a(this.f2850c)));
                }
            }
        }
    }

    public static final class f implements h0<Object> {
        @fh.h

        /* renamed from: a  reason: collision with root package name */
        public LiveData<Object> f2851a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p.a<Object, LiveData<Object>> f2852b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e0<Object> f2853c;

        public static final class a extends n0 implements l<Object, u2> {
            public final /* synthetic */ e0<Object> P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e0<Object> e0Var) {
                super(1);
                this.P = e0Var;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c(obj);
                return u2.f25116a;
            }

            public final void c(Object obj) {
                this.P.r(obj);
            }
        }

        public f(p.a<Object, LiveData<Object>> aVar, e0<Object> e0Var) {
            this.f2852b = aVar;
            this.f2853c = e0Var;
        }

        @fh.h
        public final LiveData<Object> a() {
            return this.f2851a;
        }

        public final void b(@fh.h LiveData<Object> liveData) {
            this.f2851a = liveData;
        }

        public void f(Object obj) {
            LiveData<Object> apply = this.f2852b.apply(obj);
            LiveData<Object> liveData = this.f2851a;
            if (liveData != apply) {
                if (liveData != null) {
                    e0<Object> e0Var = this.f2853c;
                    l0.m(liveData);
                    e0Var.t(liveData);
                }
                this.f2851a = apply;
                if (apply != null) {
                    e0<Object> e0Var2 = this.f2853c;
                    l0.m(apply);
                    e0Var2.s(apply, new d(new a(this.f2853c)));
                }
            }
        }
    }

    @j
    @g
    @j0
    @h(name = "distinctUntilChanged")
    public static final <X> LiveData<X> a(@g LiveData<X> liveData) {
        l0.p(liveData, "<this>");
        e0 e0Var = new e0();
        k1.a aVar = new k1.a();
        aVar.O = true;
        if (liveData.j()) {
            e0Var.r(liveData.f());
            aVar.O = false;
        }
        e0Var.s(liveData, new d(new a(e0Var, aVar)));
        return e0Var;
    }

    @j
    @j0
    @h(name = "map")
    @k(level = m.Q, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData b(LiveData liveData, p.a aVar) {
        l0.p(liveData, "<this>");
        l0.p(aVar, "mapFunction");
        e0 e0Var = new e0();
        e0Var.s(liveData, new d(new c(e0Var, aVar)));
        return e0Var;
    }

    @j
    @g
    @j0
    @h(name = "map")
    public static final <X, Y> LiveData<Y> c(@g LiveData<X> liveData, @g l<X, Y> lVar) {
        l0.p(liveData, "<this>");
        l0.p(lVar, "transform");
        e0 e0Var = new e0();
        e0Var.s(liveData, new d(new b(e0Var, lVar)));
        return e0Var;
    }

    @j
    @j0
    @h(name = "switchMap")
    @k(level = m.Q, message = "Use kotlin functions, instead of outdated arch core Functions")
    public static final /* synthetic */ LiveData d(LiveData liveData, p.a aVar) {
        l0.p(liveData, "<this>");
        l0.p(aVar, "switchMapFunction");
        e0 e0Var = new e0();
        e0Var.s(liveData, new f(aVar, e0Var));
        return e0Var;
    }

    @j
    @g
    @j0
    @h(name = "switchMap")
    public static final <X, Y> LiveData<Y> e(@g LiveData<X> liveData, @g l<X, LiveData<Y>> lVar) {
        l0.p(liveData, "<this>");
        l0.p(lVar, "transform");
        e0 e0Var = new e0();
        e0Var.s(liveData, new e(lVar, e0Var));
        return e0Var;
    }
}

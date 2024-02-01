package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import le.f;
import le.o;
import pf.u0;
import rf.g0;
import rf.m0;
import uf.i;
import uf.j;
import we.p;
import xe.l0;
import zd.e1;
import zd.u2;

public final class k {

    @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    public static final class a extends o implements p<g0<? super T>, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ p U;
        public final /* synthetic */ p.b V;
        public final /* synthetic */ i<T> W;

        @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.k$a$a  reason: collision with other inner class name */
        public static final class C0038a extends o implements we.p<u0, d<? super u2>, Object> {
            public int S;
            public final /* synthetic */ i<T> T;
            public final /* synthetic */ g0<T> U;

            /* renamed from: androidx.lifecycle.k$a$a$a  reason: collision with other inner class name */
            public static final class C0039a<T> implements j {
                public final /* synthetic */ g0<T> O;

                public C0039a(g0<? super T> g0Var) {
                    this.O = g0Var;
                }

                @h
                public final Object d(T t10, @g d<? super u2> dVar) {
                    Object C = this.O.C(t10, dVar);
                    return C == ke.d.h() ? C : u2.f25116a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0038a(i<? extends T> iVar, g0<? super T> g0Var, d<? super C0038a> dVar) {
                super(2, dVar);
                this.T = iVar;
                this.U = g0Var;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                return new C0038a(this.T, this.U, dVar);
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    i<T> iVar = this.T;
                    C0039a aVar = new C0039a(this.U);
                    this.S = 1;
                    if (iVar.a(aVar, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @h
            /* renamed from: P */
            public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
                return ((C0038a) H(u0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, p.b bVar, i<? extends T> iVar, d<? super a> dVar) {
            super(2, dVar);
            this.U = pVar;
            this.V = bVar;
            this.W = iVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, this.V, this.W, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            g0 g0Var;
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                g0 g0Var2 = (g0) this.T;
                p pVar = this.U;
                p.b bVar = this.V;
                C0038a aVar = new C0038a(this.W, g0Var2, (d<? super C0038a>) null);
                this.T = g0Var2;
                this.S = 1;
                if (RepeatOnLifecycleKt.a(pVar, bVar, aVar, this) == h10) {
                    return h10;
                }
                g0Var = g0Var2;
            } else if (i10 == 1) {
                g0Var = (g0) this.T;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.a.a(g0Var, (Throwable) null, 1, (Object) null);
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g g0<? super T> g0Var, @h d<? super u2> dVar) {
            return ((a) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @g
    public static final <T> i<T> a(@g i<? extends T> iVar, @g p pVar, @g p.b bVar) {
        l0.p(iVar, "<this>");
        l0.p(pVar, "lifecycle");
        l0.p(bVar, "minActiveState");
        return uf.k.s(new a(pVar, bVar, iVar, (d<? super a>) null));
    }

    public static /* synthetic */ i b(i iVar, p pVar, p.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = p.b.STARTED;
        }
        return a(iVar, pVar, bVar);
    }
}

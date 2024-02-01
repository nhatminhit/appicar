package androidx.lifecycle;

import ag.c;
import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import le.f;
import le.o;
import pf.l;
import pf.n2;
import pf.q;
import pf.u0;
import pf.v0;
import pf.w0;
import xe.k1;
import xe.l0;
import xe.r1;
import zd.d1;
import zd.e1;
import zd.u2;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements u {
    public final /* synthetic */ p.a O;
    public final /* synthetic */ k1.h<n2> P;
    public final /* synthetic */ u0 Q;
    public final /* synthetic */ p.a R;
    public final /* synthetic */ q<u2> S;
    public final /* synthetic */ c T;
    public final /* synthetic */ we.p<u0, d<? super u2>, Object> U;

    @r1({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    public static final class a extends o implements we.p<u0, d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public final /* synthetic */ c V;
        public final /* synthetic */ we.p<u0, d<? super u2>, Object> W;

        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        public static final class C0036a extends o implements we.p<u0, d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ we.p<u0, d<? super u2>, Object> U;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0036a(we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar, d<? super C0036a> dVar) {
                super(2, dVar);
                this.U = pVar;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                C0036a aVar = new C0036a(this.U, dVar);
                aVar.T = obj;
                return aVar;
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    we.p<u0, d<? super u2>, Object> pVar = this.U;
                    this.S = 1;
                    if (pVar.g0((u0) this.T, this) == h10) {
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
                return ((C0036a) H(u0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.V = cVar;
            this.W = pVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new a(this.V, this.W, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Throwable th2;
            c cVar;
            c cVar2;
            we.p<u0, d<? super u2>, Object> pVar;
            Object h10 = ke.d.h();
            int i10 = this.U;
            if (i10 == 0) {
                e1.n(obj);
                cVar2 = this.V;
                pVar = this.W;
                this.S = cVar2;
                this.T = pVar;
                this.U = 1;
                if (cVar2.c((Object) null, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                pVar = (we.p) this.T;
                e1.n(obj);
                cVar2 = (c) this.S;
            } else if (i10 == 2) {
                cVar = (c) this.S;
                try {
                    e1.n(obj);
                    u2 u2Var = u2.f25116a;
                    cVar.d((Object) null);
                    return u2Var;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0036a aVar = new C0036a(pVar, (d<? super C0036a>) null);
                this.S = cVar2;
                this.T = null;
                this.U = 2;
                if (v0.g(aVar, this) == h10) {
                    return h10;
                }
                cVar = cVar2;
                u2 u2Var2 = u2.f25116a;
                cVar.d((Object) null);
                return u2Var2;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                cVar = cVar2;
                th2 = th5;
                cVar.d((Object) null);
                throw th2;
            }
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(p.a aVar, k1.h<n2> hVar, u0 u0Var, p.a aVar2, q<? super u2> qVar, c cVar, we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar) {
        this.O = aVar;
        this.P = hVar;
        this.Q = u0Var;
        this.R = aVar2;
        this.S = qVar;
        this.T = cVar;
        this.U = pVar;
    }

    public final void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, "<anonymous parameter 0>");
        l0.p(aVar, h0.u0.f8532r0);
        if (aVar == this.O) {
            this.P.O = l.f(this.Q, (ie.g) null, (w0) null, new a(this.T, this.U, (d<? super a>) null), 3, (Object) null);
            return;
        }
        if (aVar == this.R) {
            n2 n2Var = (n2) this.P.O;
            if (n2Var != null) {
                n2.a.b(n2Var, (CancellationException) null, 1, (Object) null);
            }
            this.P.O = null;
        }
        if (aVar == p.a.ON_DESTROY) {
            q<u2> qVar = this.S;
            d1.a aVar2 = d1.P;
            qVar.x(d1.b(u2.f25116a));
        }
    }
}

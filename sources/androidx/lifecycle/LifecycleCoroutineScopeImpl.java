package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import java.util.concurrent.CancellationException;
import le.f;
import le.o;
import pf.l;
import pf.m1;
import pf.n2;
import pf.t2;
import pf.u0;
import pf.w0;
import we.p;
import xe.l0;
import zd.e1;
import zd.u2;

public final class LifecycleCoroutineScopeImpl extends s implements u {
    @g
    public final p O;
    @g
    public final ie.g P;

    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ LifecycleCoroutineScopeImpl U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super a> dVar) {
            super(2, dVar);
            this.U = lifecycleCoroutineScopeImpl;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.T;
                if (this.U.i().b().compareTo(p.b.INITIALIZED) >= 0) {
                    this.U.i().a(this.U);
                } else {
                    t2.i(u0Var.H(), (CancellationException) null, 1, (Object) null);
                }
                return u2.f25116a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    public LifecycleCoroutineScopeImpl(@g p pVar, @g ie.g gVar) {
        l0.p(pVar, "lifecycle");
        l0.p(gVar, "coroutineContext");
        this.O = pVar;
        this.P = gVar;
        if (i().b() == p.b.DESTROYED) {
            t2.i(H(), (CancellationException) null, 1, (Object) null);
        }
    }

    @g
    public ie.g H() {
        return this.P;
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, b4.a.P);
        l0.p(aVar, h0.u0.f8532r0);
        if (i().b().compareTo(p.b.DESTROYED) <= 0) {
            i().d(this);
            t2.i(H(), (CancellationException) null, 1, (Object) null);
        }
    }

    @g
    public p i() {
        return this.O;
    }

    public final void m() {
        n2 unused = l.f(this, m1.e().S1(), (w0) null, new a(this, (d<? super a>) null), 2, (Object) null);
    }
}

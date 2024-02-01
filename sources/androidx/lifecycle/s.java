package androidx.lifecycle;

import fh.g;
import fh.h;
import ie.d;
import le.f;
import le.o;
import pf.l;
import pf.n2;
import pf.u0;
import pf.w0;
import we.p;
import xe.l0;
import zd.e1;
import zd.k;
import zd.u2;

public abstract class s implements u0 {

    @f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ s T;
        public final /* synthetic */ p<u0, d<? super u2>, Object> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s sVar, p<? super u0, ? super d<? super u2>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.T = sVar;
            this.U = pVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new a(this.T, this.U, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                p i11 = this.T.i();
                p<u0, d<? super u2>, Object> pVar = this.U;
                this.S = 1;
                if (k0.a(i11, pVar, this) == h10) {
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
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ s T;
        public final /* synthetic */ p<u0, d<? super u2>, Object> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(s sVar, p<? super u0, ? super d<? super u2>, ? extends Object> pVar, d<? super b> dVar) {
            super(2, dVar);
            this.T = sVar;
            this.U = pVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new b(this.T, this.U, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                p i11 = this.T.i();
                p<u0, d<? super u2>, Object> pVar = this.U;
                this.S = 1;
                if (k0.c(i11, pVar, this) == h10) {
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
            return ((b) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ s T;
        public final /* synthetic */ p<u0, d<? super u2>, Object> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(s sVar, p<? super u0, ? super d<? super u2>, ? extends Object> pVar, d<? super c> dVar) {
            super(2, dVar);
            this.T = sVar;
            this.U = pVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new c(this.T, this.U, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                p i11 = this.T.i();
                p<u0, d<? super u2>, Object> pVar = this.U;
                this.S = 1;
                if (k0.e(i11, pVar, this) == h10) {
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
            return ((c) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @g
    public abstract p i();

    @g
    @k(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    public final n2 j(@g p<? super u0, ? super d<? super u2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        return l.f(this, (ie.g) null, (w0) null, new a(this, pVar, (d<? super a>) null), 3, (Object) null);
    }

    @g
    @k(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    public final n2 k(@g p<? super u0, ? super d<? super u2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        return l.f(this, (ie.g) null, (w0) null, new b(this, pVar, (d<? super b>) null), 3, (Object) null);
    }

    @g
    @k(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    public final n2 l(@g p<? super u0, ? super d<? super u2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        return l.f(this, (ie.g) null, (w0) null, new c(this, pVar, (d<? super c>) null), 3, (Object) null);
    }
}

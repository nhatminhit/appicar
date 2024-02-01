package rf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.u0;
import rf.r;
import we.p;
import zd.b1;
import zd.d1;
import zd.e1;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"E", "Lrf/m0;", "element", "Lrf/r;", "Lzd/u2;", "b", "(Lrf/m0;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Lrf/m0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class t {

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"E", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ m0<E> T;
        public final /* synthetic */ E U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(m0<? super E> m0Var, E e10, d<? super a> dVar) {
            super(2, dVar);
            this.T = m0Var;
            this.U = e10;
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
                m0<E> m0Var = this.T;
                E e10 = this.U;
                this.S = 1;
                if (m0Var.C(e10, this) == h10) {
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

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"E", "Lpf/u0;", "Lrf/r;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements p<u0, d<? super r<? extends u2>>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ m0<E> U;
        public final /* synthetic */ E V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m0<? super E> m0Var, E e10, d<? super b> dVar) {
            super(2, dVar);
            this.U = m0Var;
            this.V = e10;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.U, this.V, dVar);
            bVar.T = obj;
            return bVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object obj2;
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.T;
                m0<E> m0Var = this.U;
                E e10 = this.V;
                d1.a aVar = d1.P;
                this.S = 1;
                if (m0Var.C(e10, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                try {
                    e1.n(obj);
                } catch (Throwable th2) {
                    d1.a aVar2 = d1.P;
                    obj2 = d1.b(e1.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = d1.b(u2.f25116a);
            return r.b(d1.j(obj2) ? r.f22540b.c(u2.f25116a) : r.f22540b.a(d1.e(obj2)));
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super r<u2>> dVar) {
            return ((b) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @k(level = m.P, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void a(@g m0<? super E> m0Var, E e10) {
        if (!r.m(m0Var.K(e10))) {
            Object unused = pf.k.b((ie.g) null, new a(m0Var, e10, (d<? super a>) null), 1, (Object) null);
        }
    }

    @g
    public static final <E> Object b(@g m0<? super E> m0Var, E e10) {
        Object K = m0Var.K(e10);
        if (K instanceof r.c) {
            return ((r) pf.k.b((ie.g) null, new b(m0Var, e10, (d<? super b>) null), 1, (Object) null)).o();
        }
        u2 u2Var = (u2) K;
        return r.f22540b.c(u2.f25116a);
    }
}

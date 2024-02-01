package vf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.u0;
import uf.i;
import uf.j;
import we.q;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lpf/u0;", "Lie/d;", "", "Lzd/u;", "block", "a", "(Lwe/p;Lie/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Luf/j;", "Lzd/u2;", "Luf/i;", "b", "(Lwe/q;)Luf/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class p {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<R> {
        public final /* synthetic */ q O;

        public a(q qVar) {
            this.O = qVar;
        }

        @h
        public Object a(@g j<? super R> jVar, @g d<? super u2> dVar) {
            Object a10 = p.a(new b(this.O, jVar, (d<? super b>) null), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"R", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements we.p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ q<u0, j<? super R>, d<? super u2>, Object> U;
        public final /* synthetic */ j<R> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(q<? super u0, ? super j<? super R>, ? super d<? super u2>, ? extends Object> qVar, j<? super R> jVar, d<? super b> dVar) {
            super(2, dVar);
            this.U = qVar;
            this.V = jVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.U, this.V, dVar);
            bVar.T = obj;
            return bVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                q<u0, j<? super R>, d<? super u2>, Object> qVar = this.U;
                j<R> jVar = this.V;
                this.S = 1;
                if (qVar.y((u0) this.T, jVar, this) == h10) {
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

    @h
    public static final <R> Object a(@g @zd.b we.p<? super u0, ? super d<? super R>, ? extends Object> pVar, @g d<? super R> dVar) {
        o oVar = new o(dVar.e(), dVar);
        Object f10 = xf.b.f(oVar, oVar, pVar);
        if (f10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return f10;
    }

    @g
    public static final <R> i<R> b(@g @zd.b q<? super u0, ? super j<? super R>, ? super d<? super u2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}

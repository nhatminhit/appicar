package vf;

import fh.h;
import ie.d;
import ie.g;
import kotlin.Metadata;
import pf.n2;
import uf.i;
import uf.j;
import we.p;
import xe.n0;
import zd.a1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lvf/v;", "Lie/g;", "currentContext", "Lzd/u2;", "a", "Lpf/n2;", "collectJob", "b", "T", "Lkotlin/Function2;", "Luf/j;", "Lie/d;", "", "Lzd/u;", "block", "Luf/i;", "c", "(Lwe/p;)Luf/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class x {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lie/g$b;", "element", "c", "(ILie/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements p<Integer, g.b, Integer> {
        public final /* synthetic */ v<?> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v<?> vVar) {
            super(2);
            this.P = vVar;
        }

        @fh.g
        public final Integer c(int i10, @fh.g g.b bVar) {
            g.c key = bVar.getKey();
            g.b g10 = this.P.S.g(key);
            if (key != n2.D) {
                return Integer.valueOf(bVar != g10 ? Integer.MIN_VALUE : i10 + 1);
            }
            n2 n2Var = (n2) g10;
            n2 b10 = x.b((n2) bVar, n2Var);
            if (b10 == n2Var) {
                if (n2Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + n2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return c(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<T> {
        public final /* synthetic */ p<j<? super T>, d<? super u2>, Object> O;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ b S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, d<? super a> dVar) {
                super(dVar);
                this.S = bVar;
            }

            @h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.a((j) null, this);
            }
        }

        public b(p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
            this.O = pVar;
        }

        @h
        public Object a(@fh.g j<? super T> jVar, @fh.g d<? super u2> dVar) {
            Object g02 = this.O.g0(jVar, dVar);
            return g02 == ke.d.h() ? g02 : u2.f25116a;
        }

        @h
        public Object e(@fh.g j<? super T> jVar, @fh.g d<? super u2> dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            this.O.g0(jVar, dVar);
            return u2.f25116a;
        }
    }

    @ve.h(name = "checkContext")
    public static final void a(@fh.g v<?> vVar, @fh.g g gVar) {
        if (((Number) gVar.o(0, new a(vVar))).intValue() != vVar.T) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.S + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    @h
    public static final n2 b(@h n2 n2Var, @h n2 n2Var2) {
        while (n2Var != null) {
            if (n2Var == n2Var2 || !(n2Var instanceof wf.n0)) {
                return n2Var;
            }
            n2Var = ((wf.n0) n2Var).J1();
        }
        return null;
    }

    @fh.g
    @a1
    public static final <T> i<T> c(@fh.g @zd.b p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return new b(pVar);
    }
}

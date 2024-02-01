package uf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.l;
import pf.n2;
import pf.u0;
import pf.w0;
import vf.t;
import we.p;
import we.q;
import zd.e1;
import zd.i0;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001am\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tHHø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014HHø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Luf/i;", "Lzd/u2;", "a", "(Luf/i;Lie/d;)Ljava/lang/Object;", "T", "Lpf/u0;", "scope", "Lpf/n2;", "h", "Lkotlin/Function3;", "", "Lzd/v0;", "name", "index", "value", "Lie/d;", "", "action", "d", "(Luf/i;Lwe/q;Lie/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "f", "(Luf/i;Lwe/p;Lie/d;)Ljava/lang/Object;", "Luf/j;", "flow", "g", "(Luf/j;Luf/i;Lie/d;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class n {

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"uf/n$a", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements j<T> {
        public final /* synthetic */ p<T, d<? super u2>, Object> O;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: uf.n$a$a  reason: collision with other inner class name */
        public static final class C0439a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ a S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0439a(a aVar, d<? super C0439a> dVar) {
                super(dVar);
                this.S = aVar;
            }

            @h
            public final Object K(@g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public a(p<? super T, ? super d<? super u2>, ? extends Object> pVar) {
            this.O = pVar;
        }

        @h
        public Object a(T t10, @g d<? super u2> dVar) {
            xe.i0.e(4);
            new C0439a(this, dVar);
            xe.i0.e(5);
            this.O.g0(t10, dVar);
            return u2.f25116a;
        }

        @h
        public Object d(T t10, @g d<? super u2> dVar) {
            Object g02 = this.O.g0(t10, dVar);
            return g02 == ke.d.h() ? g02 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"uf/n$b", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "", "O", "I", "index", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b implements j<T> {
        public int O;
        public final /* synthetic */ q<Integer, T, d<? super u2>, Object> P;

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
            public final Object K(@g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public b(q<? super Integer, ? super T, ? super d<? super u2>, ? extends Object> qVar) {
            this.P = qVar;
        }

        @h
        public Object a(T t10, @g d<? super u2> dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            q<Integer, T, d<? super u2>, Object> qVar = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            if (i10 >= 0) {
                qVar.y(Integer.valueOf(i10), t10, dVar);
                return u2.f25116a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }

        @h
        public Object d(T t10, @g d<? super u2> dVar) {
            q<Integer, T, d<? super u2>, Object> qVar = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            if (i10 >= 0) {
                Object y10 = qVar.y(le.b.f(i10), t10, dVar);
                return y10 == ke.d.h() ? y10 : u2.f25116a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ i<T> T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i<? extends T> iVar, d<? super c> dVar) {
            super(2, dVar);
            this.T = iVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new c(this.T, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T> iVar = this.T;
                this.S = 1;
                if (k.x(iVar, this) == h10) {
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

    @h
    public static final Object a(@g i<?> iVar, @g d<? super u2> dVar) {
        Object a10 = iVar.a(t.O, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    @k(level = m.Q, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(i<? extends T> iVar, p<? super T, ? super d<? super u2>, ? extends Object> pVar, d<? super u2> dVar) {
        Object a10 = iVar.a(new a(pVar), dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    @k(level = m.Q, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object c(i<? extends T> iVar, p<? super T, ? super d<? super u2>, ? extends Object> pVar, d<? super u2> dVar) {
        a aVar = new a(pVar);
        xe.i0.e(0);
        iVar.a(aVar, dVar);
        xe.i0.e(1);
        return u2.f25116a;
    }

    @h
    public static final <T> Object d(@g i<? extends T> iVar, @g q<? super Integer, ? super T, ? super d<? super u2>, ? extends Object> qVar, @g d<? super u2> dVar) {
        Object a10 = iVar.a(new b(qVar), dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    public static final <T> Object e(i<? extends T> iVar, q<? super Integer, ? super T, ? super d<? super u2>, ? extends Object> qVar, d<? super u2> dVar) {
        b bVar = new b(qVar);
        xe.i0.e(0);
        iVar.a(bVar, dVar);
        xe.i0.e(1);
        return u2.f25116a;
    }

    @h
    public static final <T> Object f(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar, @g d<? super u2> dVar) {
        Object x10 = k.x(p.d(k.W0(iVar, pVar), 0, (rf.m) null, 2, (Object) null), dVar);
        return x10 == ke.d.h() ? x10 : u2.f25116a;
    }

    @h
    public static final <T> Object g(@g j<? super T> jVar, @g i<? extends T> iVar, @g d<? super u2> dVar) {
        k.o0(jVar);
        Object a10 = iVar.a(jVar, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    @g
    public static final <T> n2 h(@g i<? extends T> iVar, @g u0 u0Var) {
        return l.f(u0Var, (ie.g) null, (w0) null, new c(iVar, (d<? super c>) null), 3, (Object) null);
    }
}

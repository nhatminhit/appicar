package vf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import uf.j;
import we.p;
import wf.w0;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lvf/b0;", "T", "Luf/j;", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "Lie/g;", "O", "Lie/g;", "emitContext", "", "P", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lie/d;", "Q", "Lwe/p;", "emitRef", "downstream", "<init>", "(Luf/j;Lie/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b0<T> implements j<T> {
    @g
    public final ie.g O;
    @g
    public final Object P;
    @g
    public final p<T, d<? super u2>, Object> Q;

    @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"T", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<T, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ j<T> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j<? super T> jVar, d<? super a> dVar) {
            super(2, dVar);
            this.U = jVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                Object obj2 = this.T;
                j<T> jVar = this.U;
                this.S = 1;
                if (jVar.d(obj2, this) == h10) {
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
        public final Object g0(T t10, @h d<? super u2> dVar) {
            return ((a) H(t10, dVar)).K(u2.f25116a);
        }
    }

    public b0(@g j<? super T> jVar, @g ie.g gVar) {
        this.O = gVar;
        this.P = w0.b(gVar);
        this.Q = new a(jVar, (d<? super a>) null);
    }

    @h
    public Object d(T t10, @g d<? super u2> dVar) {
        Object c10 = f.c(this.O, t10, this.P, this.Q, dVar);
        return c10 == ke.d.h() ? c10 : u2.f25116a;
    }
}

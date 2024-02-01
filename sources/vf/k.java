package vf;

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
import rf.e0;
import rf.g0;
import rf.i0;
import rf.m;
import uf.i;
import we.p;
import xe.w;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lvf/k;", "T", "Lvf/e;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "i", "Lpf/u0;", "scope", "Lrf/i0;", "n", "Lrf/g0;", "Lzd/u2;", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "", "Luf/i;", "R", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class k<T> extends e<T> {
    @g
    public final Iterable<i<T>> R;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ i<T> T;
        public final /* synthetic */ y<T> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i<? extends T> iVar, y<T> yVar, d<? super a> dVar) {
            super(2, dVar);
            this.T = iVar;
            this.U = yVar;
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
                i<T> iVar = this.T;
                y<T> yVar = this.U;
                this.S = 1;
                if (iVar.a(yVar, this) == h10) {
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

    public k(@g Iterable<? extends i<? extends T>> iterable, @g ie.g gVar, int i10, @g m mVar) {
        super(gVar, i10, mVar);
        this.R = iterable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Iterable iterable, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(iterable, (i11 & 2) != 0 ? ie.i.O : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? m.SUSPEND : mVar);
    }

    @h
    public Object g(@g g0<? super T> g0Var, @g d<? super u2> dVar) {
        y yVar = new y(g0Var);
        for (i<T> aVar : this.R) {
            n2 unused = l.f(g0Var, (ie.g) null, (w0) null, new a(aVar, yVar, (d<? super a>) null), 3, (Object) null);
        }
        return u2.f25116a;
    }

    @g
    public e<T> i(@g ie.g gVar, int i10, @g m mVar) {
        return new k(this.R, gVar, i10, mVar);
    }

    @g
    public i0<T> n(@g u0 u0Var) {
        return e0.e(u0Var, this.O, this.P, l());
    }
}

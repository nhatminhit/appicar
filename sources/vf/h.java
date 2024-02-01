package vf;

import fh.g;
import ie.d;
import ie.e;
import kotlin.Metadata;
import le.f;
import le.o;
import rf.g0;
import rf.m;
import uf.i;
import uf.j;
import ve.e;
import we.p;
import xe.l0;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J)\u0010\u0012\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lvf/h;", "S", "T", "Lvf/e;", "Luf/j;", "collector", "Lzd/u2;", "s", "(Luf/j;Lie/d;)Ljava/lang/Object;", "Lrf/g0;", "scope", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "a", "", "toString", "Lie/g;", "newContext", "r", "(Luf/j;Lie/g;Lie/d;)Ljava/lang/Object;", "Luf/i;", "R", "Luf/i;", "flow", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "<init>", "(Luf/i;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class h<S, T> extends e<T> {
    @g
    @e
    public final i<S> R;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"S", "T", "Luf/j;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<j<? super T>, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ h<S, T> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h<S, T> hVar, d<? super a> dVar) {
            super(2, dVar);
            this.U = hVar;
        }

        @g
        public final d<u2> H(@fh.h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, dVar);
            aVar.T = obj;
            return aVar;
        }

        @fh.h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                h<S, T> hVar = this.U;
                this.S = 1;
                if (hVar.s((j) this.T, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@g j<? super T> jVar, @fh.h d<? super u2> dVar) {
            return ((a) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    public h(@g i<? extends S> iVar, @g ie.g gVar, int i10, @g m mVar) {
        super(gVar, i10, mVar);
        this.R = iVar;
    }

    public static /* synthetic */ Object p(h hVar, j jVar, d dVar) {
        if (hVar.P == -3) {
            ie.g e10 = dVar.e();
            ie.g m12 = e10.m1(hVar.O);
            if (l0.g(m12, e10)) {
                Object s10 = hVar.s(jVar, dVar);
                return s10 == ke.d.h() ? s10 : u2.f25116a;
            }
            e.b bVar = ie.e.B;
            if (l0.g(m12.g(bVar), e10.g(bVar))) {
                Object r10 = hVar.r(jVar, m12, dVar);
                return r10 == ke.d.h() ? r10 : u2.f25116a;
            }
        }
        Object a10 = super.a(jVar, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }

    public static /* synthetic */ Object q(h hVar, g0 g0Var, d dVar) {
        Object s10 = hVar.s(new y(g0Var), dVar);
        return s10 == ke.d.h() ? s10 : u2.f25116a;
    }

    @fh.h
    public Object a(@g j<? super T> jVar, @g d<? super u2> dVar) {
        return p(this, jVar, dVar);
    }

    @fh.h
    public Object g(@g g0<? super T> g0Var, @g d<? super u2> dVar) {
        return q(this, g0Var, dVar);
    }

    public final Object r(j<? super T> jVar, ie.g gVar, d<? super u2> dVar) {
        Object d10 = f.d(gVar, f.e(jVar, dVar.e()), (Object) null, new a(this, (d<? super a>) null), dVar, 4, (Object) null);
        return d10 == ke.d.h() ? d10 : u2.f25116a;
    }

    @fh.h
    public abstract Object s(@g j<? super T> jVar, @g d<? super u2> dVar);

    @g
    public String toString() {
        return this.R + " -> " + super.toString();
    }
}

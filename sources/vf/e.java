package vf;

import fh.g;
import fh.h;
import ie.d;
import java.util.ArrayList;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.i2;
import pf.u0;
import pf.v0;
import pf.w0;
import pf.z0;
import rf.e0;
import rf.g0;
import rf.i0;
import rf.m;
import uf.i;
import uf.j;
import uf.k;
import we.l;
import we.p;
import xe.l0;
import zd.e1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b \u0010!R9\u0010'\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"8@X\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lvf/e;", "T", "Lvf/r;", "Luf/i;", "j", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "c", "i", "Lrf/g0;", "scope", "Lzd/u2;", "g", "(Lrf/g0;Lie/d;)Ljava/lang/Object;", "Lpf/u0;", "Lrf/i0;", "n", "Luf/j;", "collector", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "", "e", "toString", "O", "Lie/g;", "P", "I", "Q", "Lrf/m;", "Lkotlin/Function2;", "Lie/d;", "", "l", "()Lwe/p;", "collectToFun", "m", "()I", "produceCapacity", "<init>", "(Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
public abstract class e<T> implements r<T> {
    @g
    @ve.e
    public final ie.g O;
    @ve.e
    public final int P;
    @g
    @ve.e
    public final m Q;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ j<T> U;
        public final /* synthetic */ e<T> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j<? super T> jVar, e<T> eVar, d<? super a> dVar) {
            super(2, dVar);
            this.U = jVar;
            this.V = eVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.U, this.V, dVar);
            aVar.T = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                j<T> jVar = this.U;
                i0<T> n10 = this.V.n((u0) this.T);
                this.S = 1;
                if (k.l0(jVar, n10, this) == h10) {
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

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"T", "Lrf/g0;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements p<g0<? super T>, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ e<T> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, d<? super b> dVar) {
            super(2, dVar);
            this.U = eVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.U, dVar);
            bVar.T = obj;
            return bVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                e<T> eVar = this.U;
                this.S = 1;
                if (eVar.g((g0) this.T, this) == h10) {
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
        public final Object g0(@g g0<? super T> g0Var, @h d<? super u2> dVar) {
            return ((b) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    public e(@g ie.g gVar, int i10, @g m mVar) {
        this.O = gVar;
        this.P = i10;
        this.Q = mVar;
    }

    public static /* synthetic */ Object f(e eVar, j jVar, d dVar) {
        Object g10 = v0.g(new a(jVar, eVar, (d<? super a>) null), dVar);
        return g10 == ke.d.h() ? g10 : u2.f25116a;
    }

    @h
    public Object a(@g j<? super T> jVar, @g d<? super u2> dVar) {
        return f(this, jVar, dVar);
    }

    @g
    public i<T> c(@g ie.g gVar, int i10, @g m mVar) {
        ie.g m12 = gVar.m1(this.O);
        if (mVar == m.SUSPEND) {
            int i11 = this.P;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2 && (i11 = i11 + i10) < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
                i10 = i11;
            }
            mVar = this.Q;
        }
        return (l0.g(m12, this.O) && i10 == this.P && mVar == this.Q) ? this : i(m12, i10, mVar);
    }

    @h
    public String e() {
        return null;
    }

    @h
    public abstract Object g(@g g0<? super T> g0Var, @g d<? super u2> dVar);

    @g
    public abstract e<T> i(@g ie.g gVar, int i10, @g m mVar);

    @h
    public i<T> j() {
        return null;
    }

    @g
    public final p<g0<? super T>, d<? super u2>, Object> l() {
        return new b(this, (d<? super b>) null);
    }

    public final int m() {
        int i10 = this.P;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    @g
    public i0<T> n(@g u0 u0Var) {
        return e0.g(u0Var, this.O, m(), this.Q, w0.ATOMIC, (l) null, l(), 16, (Object) null);
    }

    @g
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e10 = e();
        if (e10 != null) {
            arrayList.add(e10);
        }
        if (this.O != ie.i.O) {
            arrayList.add("context=" + this.O);
        }
        if (this.P != -3) {
            arrayList.add("capacity=" + this.P);
        }
        if (this.Q != m.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.Q);
        }
        return z0.a(this) + '[' + be.e0.h3(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ']';
    }
}

package uf;

import fh.h;
import kotlin.Metadata;
import le.d;
import le.f;
import ve.e;
import vf.u;
import we.l;
import we.p;
import xe.k1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012:\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRH\u0010\u0018\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Luf/g;", "T", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "O", "Luf/i;", "upstream", "Lkotlin/Function1;", "", "P", "Lwe/l;", "keySelector", "Lkotlin/Function2;", "Lzd/v0;", "name", "old", "new", "", "Q", "Lwe/p;", "areEquivalent", "<init>", "(Luf/i;Lwe/l;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g<T> implements i<T> {
    @fh.g
    public final i<T> O;
    @fh.g
    @e
    public final l<T, Object> P;
    @fh.g
    @e
    public final p<Object, Object, Boolean> Q;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements j {
        public final /* synthetic */ g<T> O;
        public final /* synthetic */ k1.h<Object> P;
        public final /* synthetic */ j<T> Q;

        @f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {81}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: uf.g$a$a  reason: collision with other inner class name */
        public static final class C0436a extends d {
            public /* synthetic */ Object R;
            public final /* synthetic */ a<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0436a(a<? super T> aVar, ie.d<? super C0436a> dVar) {
                super(dVar);
                this.S = aVar;
            }

            @h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public a(g<T> gVar, k1.h<Object> hVar, j<? super T> jVar) {
            this.O = gVar;
            this.P = hVar;
            this.Q = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r6, @fh.g ie.d<? super zd.u2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof uf.g.a.C0436a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                uf.g$a$a r0 = (uf.g.a.C0436a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.g$a$a r0 = new uf.g$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                zd.e1.n(r7)
                uf.g<T> r7 = r5.O
                we.l<T, java.lang.Object> r7 = r7.P
                java.lang.Object r7 = r7.A(r6)
                xe.k1$h<java.lang.Object> r2 = r5.P
                T r2 = r2.O
                wf.r0 r4 = vf.u.f23630a
                if (r2 == r4) goto L_0x0058
                uf.g<T> r4 = r5.O
                we.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.Q
                java.lang.Object r2 = r4.g0(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            L_0x0058:
                xe.k1$h<java.lang.Object> r2 = r5.P
                r2.O = r7
                uf.j<T> r7 = r5.Q
                r0.T = r3
                java.lang.Object r6 = r7.d(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.g.a.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    public g(@fh.g i<? extends T> iVar, @fh.g l<? super T, ? extends Object> lVar, @fh.g p<Object, Object, Boolean> pVar) {
        this.O = iVar;
        this.P = lVar;
        this.Q = pVar;
    }

    @h
    public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
        k1.h hVar = new k1.h();
        hVar.O = u.f23630a;
        Object a10 = this.O.a(new a(this, hVar, jVar), dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }
}

package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.f;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Luf/d;", "T", "Luf/c;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "Luf/i;", "O", "Luf/i;", "flow", "<init>", "(Luf/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class d<T> implements c<T> {
    @g
    public final i<T> O;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a<T> implements j {
        public final /* synthetic */ j<T> O;

        @f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: uf.d$a$a  reason: collision with other inner class name */
        public static final class C0435a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ a<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0435a(a<? super T> aVar, ie.d<? super C0435a> dVar) {
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

        public a(j<? super T> jVar) {
            this.O = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof uf.d.a.C0435a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                uf.d$a$a r0 = (uf.d.a.C0435a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.d$a$a r0 = new uf.d$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r6)
                goto L_0x0046
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                zd.e1.n(r6)
                ie.g r6 = r0.e()
                pf.r2.z(r6)
                uf.j<T> r6 = r4.O
                r0.T = r3
                java.lang.Object r5 = r6.d(r5, r0)
                if (r5 != r1) goto L_0x0046
                return r1
            L_0x0046:
                zd.u2 r5 = zd.u2.f25116a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.d.a.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    public d(@g i<? extends T> iVar) {
        this.O = iVar;
    }

    @h
    public Object a(@g j<? super T> jVar, @g ie.d<? super u2> dVar) {
        Object a10 = this.O.a(new a(jVar), dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }
}

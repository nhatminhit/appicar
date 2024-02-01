package uf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import we.p;
import xe.k1;
import zd.e1;
import zd.i0;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Luf/r0;", "Luf/o0;", "Luf/t0;", "", "subscriptionCount", "Luf/i;", "Luf/m0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class r0 implements o0 {

    @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Luf/j;", "Luf/m0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<j<? super m0>, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ t0<Integer> U;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lzd/u2;", "a", "(ILie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.r0$a$a  reason: collision with other inner class name */
        public static final class C0443a<T> implements j {
            public final /* synthetic */ k1.a O;
            public final /* synthetic */ j<m0> P;

            @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.r0$a$a$a  reason: collision with other inner class name */
            public static final class C0444a extends le.d {
                public /* synthetic */ Object R;
                public final /* synthetic */ C0443a<T> S;
                public int T;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0444a(C0443a<? super T> aVar, d<? super C0444a> dVar) {
                    super(dVar);
                    this.S = aVar;
                }

                @h
                public final Object K(@g Object obj) {
                    this.R = obj;
                    this.T |= Integer.MIN_VALUE;
                    return this.S.a(0, this);
                }
            }

            public C0443a(k1.a aVar, j<? super m0> jVar) {
                this.O = aVar;
                this.P = jVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object a(int r5, @fh.g ie.d<? super zd.u2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uf.r0.a.C0443a.C0444a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uf.r0$a$a$a r0 = (uf.r0.a.C0443a.C0444a) r0
                    int r1 = r0.T
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.T = r1
                    goto L_0x0018
                L_0x0013:
                    uf.r0$a$a$a r0 = new uf.r0$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.T
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    zd.e1.n(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    zd.e1.n(r6)
                    if (r5 <= 0) goto L_0x004e
                    xe.k1$a r5 = r4.O
                    boolean r6 = r5.O
                    if (r6 != 0) goto L_0x004e
                    r5.O = r3
                    uf.j<uf.m0> r5 = r4.P
                    uf.m0 r6 = uf.m0.START
                    r0.T = r3
                    java.lang.Object r5 = r5.d(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    zd.u2 r5 = zd.u2.f25116a
                    return r5
                L_0x004e:
                    zd.u2 r5 = zd.u2.f25116a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.r0.a.C0443a.a(int, ie.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object d(Object obj, d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(t0<Integer> t0Var, d<? super a> dVar) {
            super(2, dVar);
            this.U = t0Var;
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
                k1.a aVar = new k1.a();
                t0<Integer> t0Var = this.U;
                C0443a aVar2 = new C0443a(aVar, (j) this.T);
                this.S = 1;
                if (t0Var.a(aVar2, this) == h10) {
                    return h10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            throw new y();
        }

        @h
        /* renamed from: P */
        public final Object g0(@g j<? super m0> jVar, @h d<? super u2> dVar) {
            return ((a) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @g
    public i<m0> a(@g t0<Integer> t0Var) {
        return k.I0(new a(t0Var, (d<? super a>) null));
    }

    @g
    public String toString() {
        return "SharingStarted.Lazily";
    }
}

package vf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.n2;
import pf.u0;
import pf.v0;
import rf.m;
import uf.i;
import we.p;
import we.q;
import xe.k1;
import xe.w;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lvf/j;", "T", "R", "Lvf/h;", "Lie/g;", "context", "", "capacity", "Lrf/m;", "onBufferOverflow", "Lvf/e;", "i", "Luf/j;", "collector", "Lzd/u2;", "s", "(Luf/j;Lie/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lzd/v0;", "name", "value", "Lie/d;", "", "Lzd/u;", "S", "Lwe/q;", "transform", "Luf/i;", "flow", "<init>", "(Lwe/q;Luf/i;Lie/g;ILrf/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j<T, R> extends h<T, R> {
    @g
    public final q<uf.j<? super R>, T, d<? super u2>, Object> S;

    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"T", "R", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ j<T, R> U;
        public final /* synthetic */ uf.j<R> V;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: vf.j$a$a  reason: collision with other inner class name */
        public static final class C0457a<T> implements uf.j {
            public final /* synthetic */ k1.h<n2> O;
            public final /* synthetic */ u0 P;
            public final /* synthetic */ j<T, R> Q;
            public final /* synthetic */ uf.j<R> R;

            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H@"}, d2 = {"T", "R", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: vf.j$a$a$a  reason: collision with other inner class name */
            public static final class C0458a extends o implements p<u0, d<? super u2>, Object> {
                public int S;
                public final /* synthetic */ j<T, R> T;
                public final /* synthetic */ uf.j<R> U;
                public final /* synthetic */ T V;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0458a(j<T, R> jVar, uf.j<? super R> jVar2, T t10, d<? super C0458a> dVar) {
                    super(2, dVar);
                    this.T = jVar;
                    this.U = jVar2;
                    this.V = t10;
                }

                @g
                public final d<u2> H(@h Object obj, @g d<?> dVar) {
                    return new C0458a(this.T, this.U, this.V, dVar);
                }

                @h
                public final Object K(@g Object obj) {
                    Object h10 = ke.d.h();
                    int i10 = this.S;
                    if (i10 == 0) {
                        e1.n(obj);
                        q t10 = this.T.S;
                        uf.j<R> jVar = this.U;
                        T t11 = this.V;
                        this.S = 1;
                        if (t10.y(jVar, t11, this) == h10) {
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
                    return ((C0458a) H(u0Var, dVar)).K(u2.f25116a);
                }
            }

            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: vf.j$a$a$b */
            public static final class b extends le.d {
                public Object R;
                public Object S;
                public Object T;
                public /* synthetic */ Object U;
                public final /* synthetic */ C0457a<T> V;
                public int W;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(C0457a<? super T> aVar, d<? super b> dVar) {
                    super(dVar);
                    this.V = aVar;
                }

                @h
                public final Object K(@g Object obj) {
                    this.U = obj;
                    this.W |= Integer.MIN_VALUE;
                    return this.V.d(null, this);
                }
            }

            public C0457a(k1.h<n2> hVar, u0 u0Var, j<T, R> jVar, uf.j<? super R> jVar2) {
                this.O = hVar;
                this.P = u0Var;
                this.Q = jVar;
                this.R = jVar2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r8, @fh.g ie.d<? super zd.u2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vf.j.a.C0457a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    vf.j$a$a$b r0 = (vf.j.a.C0457a.b) r0
                    int r1 = r0.W
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.W = r1
                    goto L_0x0018
                L_0x0013:
                    vf.j$a$a$b r0 = new vf.j$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.U
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.W
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.T
                    pf.n2 r8 = (pf.n2) r8
                    java.lang.Object r8 = r0.S
                    java.lang.Object r0 = r0.R
                    vf.j$a$a r0 = (vf.j.a.C0457a) r0
                    zd.e1.n(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    zd.e1.n(r9)
                    xe.k1$h<pf.n2> r9 = r7.O
                    T r9 = r9.O
                    pf.n2 r9 = (pf.n2) r9
                    if (r9 == 0) goto L_0x005d
                    vf.l r2 = new vf.l
                    r2.<init>()
                    r9.h(r2)
                    r0.R = r7
                    r0.S = r8
                    r0.T = r9
                    r0.W = r3
                    java.lang.Object r9 = r9.L1(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    xe.k1$h<pf.n2> r9 = r0.O
                    pf.u0 r1 = r0.P
                    r2 = 0
                    pf.w0 r3 = pf.w0.UNDISPATCHED
                    vf.j$a$a$a r4 = new vf.j$a$a$a
                    vf.j<T, R> r5 = r0.Q
                    uf.j<R> r0 = r0.R
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    pf.n2 r8 = pf.l.f(r1, r2, r3, r4, r5, r6)
                    r9.O = r8
                    zd.u2 r8 = zd.u2.f25116a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vf.j.a.C0457a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j<T, R> jVar, uf.j<? super R> jVar2, d<? super a> dVar) {
            super(2, dVar);
            this.U = jVar;
            this.V = jVar2;
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
                k1.h hVar = new k1.h();
                j<T, R> jVar = this.U;
                i<S> iVar = jVar.R;
                C0457a aVar = new C0457a(hVar, (u0) this.T, jVar, this.V);
                this.S = 1;
                if (iVar.a(aVar, this) == h10) {
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

    public j(@g q<? super uf.j<? super R>, ? super T, ? super d<? super u2>, ? extends Object> qVar, @g i<? extends T> iVar, @g ie.g gVar, int i10, @g m mVar) {
        super(iVar, gVar, i10, mVar);
        this.S = qVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(q qVar, i iVar, ie.g gVar, int i10, m mVar, int i11, w wVar) {
        this(qVar, iVar, (i11 & 4) != 0 ? ie.i.O : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? m.SUSPEND : mVar);
    }

    @g
    public e<R> i(@g ie.g gVar, int i10, @g m mVar) {
        return new j(this.S, this.R, gVar, i10, mVar);
    }

    @h
    public Object s(@g uf.j<? super R> jVar, @g d<? super u2> dVar) {
        Object g10 = v0.g(new a(this, jVar, (d<? super a>) null), dVar);
        return g10 == ke.d.h() ? g10 : u2.f25116a;
    }
}

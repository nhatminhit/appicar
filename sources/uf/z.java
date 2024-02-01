package uf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.b0;
import pf.j;
import pf.l;
import pf.n2;
import pf.r2;
import pf.u0;
import pf.w0;
import uf.o0;
import we.p;
import xe.k1;
import xe.l0;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"T", "Luf/i;", "Lpf/u0;", "scope", "Luf/o0;", "started", "", "replay", "Luf/i0;", "g", "Luf/n0;", "c", "(Luf/i;I)Luf/n0;", "Lie/g;", "context", "upstream", "Luf/d0;", "shared", "initialValue", "Lpf/n2;", "d", "(Lpf/u0;Lie/g;Luf/i;Luf/d0;Luf/o0;Ljava/lang/Object;)Lpf/n2;", "Luf/t0;", "j", "(Luf/i;Lpf/u0;Luf/o0;Ljava/lang/Object;)Luf/t0;", "i", "(Luf/i;Lpf/u0;Lie/d;)Ljava/lang/Object;", "Lpf/z;", "result", "Lzd/u2;", "e", "(Lpf/u0;Lie/g;Luf/i;Lpf/z;)V", "a", "Luf/e0;", "b", "Lkotlin/Function2;", "Luf/j;", "Lie/d;", "", "Lzd/u;", "action", "f", "(Luf/i0;Lwe/p;)Luf/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class z {

    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ o0 T;
        public final /* synthetic */ i<T> U;
        public final /* synthetic */ d0<T> V;
        public final /* synthetic */ T W;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.z$a$a  reason: collision with other inner class name */
        public static final class C0451a extends o implements p<Integer, d<? super Boolean>, Object> {
            public int S;
            public /* synthetic */ int T;

            public C0451a(d<? super C0451a> dVar) {
                super(2, dVar);
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                C0451a aVar = new C0451a(dVar);
                aVar.T = ((Number) obj).intValue();
                return aVar;
            }

            @h
            public final Object K(@g Object obj) {
                ke.d.h();
                if (this.S == 0) {
                    e1.n(obj);
                    return le.b.a(this.T > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @h
            public final Object P(int i10, @h d<? super Boolean> dVar) {
                return ((C0451a) H(Integer.valueOf(i10), dVar)).K(u2.f25116a);
            }

            public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
                return P(((Number) obj).intValue(), (d) obj2);
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "Luf/m0;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends o implements p<m0, d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public final /* synthetic */ i<T> U;
            public final /* synthetic */ d0<T> V;
            public final /* synthetic */ T W;

            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.z$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C0452a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f23370a;

                static {
                    int[] iArr = new int[m0.values().length];
                    iArr[m0.START.ordinal()] = 1;
                    iArr[m0.STOP.ordinal()] = 2;
                    iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f23370a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(i<? extends T> iVar, d0<T> d0Var, T t10, d<? super b> dVar) {
                super(2, dVar);
                this.U = iVar;
                this.V = d0Var;
                this.W = t10;
            }

            @g
            public final d<u2> H(@h Object obj, @g d<?> dVar) {
                b bVar = new b(this.U, this.V, this.W, dVar);
                bVar.T = obj;
                return bVar;
            }

            @h
            public final Object K(@g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    int i11 = C0452a.f23370a[((m0) this.T).ordinal()];
                    if (i11 == 1) {
                        i<T> iVar = this.U;
                        d0<T> d0Var = this.V;
                        this.S = 1;
                        if (iVar.a(d0Var, this) == h10) {
                            return h10;
                        }
                    } else if (i11 == 3) {
                        T t10 = this.W;
                        if (t10 == k0.f23351a) {
                            this.V.k();
                        } else {
                            this.V.w(t10);
                        }
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
            public final Object g0(@g m0 m0Var, @h d<? super u2> dVar) {
                return ((b) H(m0Var, dVar)).K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t10, d<? super a> dVar) {
            super(2, dVar);
            this.T = o0Var;
            this.U = iVar;
            this.V = d0Var;
            this.W = t10;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new a(this.T, this.U, this.V, this.W, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        e1.n(obj);
                    } else if (!(i10 == 3 || i10 == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                e1.n(obj);
                return u2.f25116a;
            }
            e1.n(obj);
            o0 o0Var = this.T;
            o0.a aVar = o0.f23358a;
            if (o0Var == aVar.c()) {
                i<T> iVar = this.U;
                d0<T> d0Var = this.V;
                this.S = 1;
                if (iVar.a(d0Var, this) == h10) {
                    return h10;
                }
            } else if (this.T == aVar.d()) {
                t0<Integer> F = this.V.F();
                C0451a aVar2 = new C0451a((d<? super C0451a>) null);
                this.S = 2;
                if (k.u0(F, aVar2, this) == h10) {
                    return h10;
                }
            } else {
                i<m0> g02 = k.g0(this.T.a(this.V.F()));
                b bVar = new b(this.U, this.V, this.W, (d<? super b>) null);
                this.S = 4;
                if (k.A(g02, bVar, this) == h10) {
                    return h10;
                }
            }
            return u2.f25116a;
            i<T> iVar2 = this.U;
            d0<T> d0Var2 = this.V;
            this.S = 3;
            if (iVar2.a(d0Var2, this) == h10) {
                return h10;
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((a) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, d2 = {"T", "Lpf/u0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements p<u0, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T> U;
        public final /* synthetic */ pf.z<t0<T>> V;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {
            public final /* synthetic */ k1.h<e0<T>> O;
            public final /* synthetic */ u0 P;
            public final /* synthetic */ pf.z<t0<T>> Q;

            public a(k1.h<e0<T>> hVar, u0 u0Var, pf.z<t0<T>> zVar) {
                this.O = hVar;
                this.P = u0Var;
                this.Q = zVar;
            }

            @h
            public final Object d(T t10, @g d<? super u2> dVar) {
                u2 u2Var;
                e0 e0Var = (e0) this.O.O;
                if (e0Var != null) {
                    e0Var.setValue(t10);
                    u2Var = u2.f25116a;
                } else {
                    u2Var = null;
                }
                if (u2Var == null) {
                    u0 u0Var = this.P;
                    k1.h<e0<T>> hVar = this.O;
                    pf.z<t0<T>> zVar = this.Q;
                    T a10 = v0.a(t10);
                    zVar.h1(new g0(a10, r2.B(u0Var.H())));
                    hVar.O = a10;
                }
                return u2.f25116a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i<? extends T> iVar, pf.z<t0<T>> zVar, d<? super b> dVar) {
            super(2, dVar);
            this.U = iVar;
            this.V = zVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.U, this.V, dVar);
            bVar.T = obj;
            return bVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                u0 u0Var = (u0) this.T;
                k1.h hVar = new k1.h();
                i<T> iVar = this.U;
                a aVar = new a(hVar, u0Var, this.V);
                this.S = 1;
                if (iVar.a(aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                try {
                    e1.n(obj);
                } catch (Throwable th2) {
                    this.V.l(th2);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g u0 u0Var, @h d<? super u2> dVar) {
            return ((b) H(u0Var, dVar)).K(u2.f25116a);
        }
    }

    @g
    public static final <T> i0<T> a(@g d0<T> d0Var) {
        return new f0(d0Var, (n2) null);
    }

    @g
    public static final <T> t0<T> b(@g e0<T> e0Var) {
        return new g0(e0Var, (n2) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> uf.n0<T> c(uf.i<? extends T> r7, int r8) {
        /*
            rf.n$b r0 = rf.n.F
            int r0 = r0.a()
            int r0 = gf.v.u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof vf.e
            if (r1 == 0) goto L_0x003d
            r1 = r7
            vf.e r1 = (vf.e) r1
            uf.i r2 = r1.j()
            if (r2 == 0) goto L_0x003d
            uf.n0 r7 = new uf.n0
            int r3 = r1.P
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L_0x0027
            r4 = -2
            if (r3 == r4) goto L_0x0027
            if (r3 == 0) goto L_0x0027
            r0 = r3
            goto L_0x0035
        L_0x0027:
            rf.m r4 = r1.Q
            rf.m r6 = rf.m.SUSPEND
            if (r4 != r6) goto L_0x0030
            if (r3 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            if (r8 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = r5
        L_0x0035:
            rf.m r8 = r1.Q
            ie.g r1 = r1.O
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003d:
            uf.n0 r8 = new uf.n0
            rf.m r1 = rf.m.SUSPEND
            ie.i r2 = ie.i.O
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.z.c(uf.i, int):uf.n0");
    }

    public static final <T> n2 d(u0 u0Var, ie.g gVar, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t10) {
        return j.d(u0Var, gVar, l0.g(o0Var, o0.f23358a.c()) ? w0.DEFAULT : w0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t10, (d<? super a>) null));
    }

    public static final <T> void e(u0 u0Var, ie.g gVar, i<? extends T> iVar, pf.z<t0<T>> zVar) {
        n2 unused = l.f(u0Var, gVar, (w0) null, new b(iVar, zVar, (d<? super b>) null), 2, (Object) null);
    }

    @g
    public static final <T> i0<T> f(@g i0<? extends T> i0Var, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return new y0(i0Var, pVar);
    }

    @g
    public static final <T> i0<T> g(@g i<? extends T> iVar, @g u0 u0Var, @g o0 o0Var, int i10) {
        n0<? extends T> c10 = c(iVar, i10);
        d0 a10 = k0.a(i10, c10.f23355b, c10.f23356c);
        return new f0(a10, d(u0Var, c10.f23357d, c10.f23354a, a10, o0Var, k0.f23351a));
    }

    public static /* synthetic */ i0 h(i iVar, u0 u0Var, o0 o0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return k.F1(iVar, u0Var, o0Var, i10);
    }

    @h
    public static final <T> Object i(@g i<? extends T> iVar, @g u0 u0Var, @g d<? super t0<? extends T>> dVar) {
        n0<? extends T> c10 = c(iVar, 1);
        pf.z c11 = b0.c((n2) null, 1, (Object) null);
        e(u0Var, c10.f23357d, c10.f23354a, c11);
        return c11.a0(dVar);
    }

    @g
    public static final <T> t0<T> j(@g i<? extends T> iVar, @g u0 u0Var, @g o0 o0Var, T t10) {
        n0<? extends T> c10 = c(iVar, 1);
        e0 a10 = v0.a(t10);
        return new g0(a10, d(u0Var, c10.f23357d, c10.f23354a, a10, o0Var, t10));
    }
}

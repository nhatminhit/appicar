package rf;

import fh.g;
import fh.h;
import ie.i;
import kotlin.Metadata;
import le.d;
import le.f;
import le.o;
import pf.e2;
import pf.e3;
import pf.m1;
import we.p;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lie/g;", "context", "Lrf/q0;", "mode", "Lrf/i0;", "Lzd/u2;", "e", "Lrf/m0;", "channel", "d", "(JJLrf/m0;Lie/d;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class p0 {

    @f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends d {
        public long R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return p0.c(0, 0, (m0<? super u2>) null, this);
        }
    }

    @f(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b extends d {
        public long R;
        public long S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public b(ie.d<? super b> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return p0.d(0, 0, (m0<? super u2>) null, this);
        }
    }

    @f(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c extends o implements p<g0<? super u2>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ q0 U;
        public final /* synthetic */ long V;
        public final /* synthetic */ long W;

        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22539a;

            static {
                int[] iArr = new int[q0.values().length];
                iArr[q0.FIXED_PERIOD.ordinal()] = 1;
                iArr[q0.FIXED_DELAY.ordinal()] = 2;
                f22539a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(q0 q0Var, long j10, long j11, ie.d<? super c> dVar) {
            super(2, dVar);
            this.U = q0Var;
            this.V = j10;
            this.W = j11;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            c cVar = new c(this.U, this.V, this.W, dVar);
            cVar.T = obj;
            return cVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                g0 g0Var = (g0) this.T;
                int i11 = a.f22539a[this.U.ordinal()];
                if (i11 == 1) {
                    long j10 = this.V;
                    long j11 = this.W;
                    m0 a10 = g0Var.a();
                    this.S = 1;
                    if (p0.d(j10, j11, a10, this) == h10) {
                        return h10;
                    }
                } else if (i11 == 2) {
                    long j12 = this.V;
                    long j13 = this.W;
                    m0 a11 = g0Var.a();
                    this.S = 2;
                    if (p0.c(j12, j13, a11, this) == h10) {
                        return h10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g g0<? super u2> g0Var, @h ie.d<? super u2> dVar) {
            return ((c) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: rf.m0<? super zd.u2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(long r6, long r8, rf.m0<? super zd.u2> r10, ie.d<? super zd.u2> r11) {
        /*
            boolean r0 = r11 instanceof rf.p0.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            rf.p0$a r0 = (rf.p0.a) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.p0$a r0 = new rf.p0$a
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            long r6 = r0.R
            java.lang.Object r8 = r0.S
            rf.m0 r8 = (rf.m0) r8
            zd.e1.n(r11)
        L_0x0034:
            r10 = r8
            goto L_0x0063
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.R
            java.lang.Object r8 = r0.S
            rf.m0 r8 = (rf.m0) r8
            zd.e1.n(r11)
            goto L_0x0073
        L_0x0048:
            long r6 = r0.R
            java.lang.Object r8 = r0.S
            r10 = r8
            rf.m0 r10 = (rf.m0) r10
            zd.e1.n(r11)
            goto L_0x0063
        L_0x0053:
            zd.e1.n(r11)
            r0.S = r10
            r0.R = r6
            r0.U = r5
            java.lang.Object r8 = pf.f1.b(r8, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            zd.u2 r8 = zd.u2.f25116a
            r0.S = r10
            r0.R = r6
            r0.U = r4
            java.lang.Object r8 = r10.C(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r10
        L_0x0073:
            r0.S = r8
            r0.R = r6
            r0.U = r3
            java.lang.Object r9 = pf.f1.b(r6, r0)
            if (r9 != r1) goto L_0x0034
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.p0.c(long, long, rf.m0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(long r18, long r20, rf.m0<? super zd.u2> r22, ie.d<? super zd.u2> r23) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof rf.p0.b
            if (r1 == 0) goto L_0x0015
            r1 = r0
            rf.p0$b r1 = (rf.p0.b) r1
            int r2 = r1.V
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.V = r2
            goto L_0x001a
        L_0x0015:
            rf.p0$b r1 = new rf.p0$b
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.U
            java.lang.Object r2 = ke.d.h()
            int r3 = r1.V
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0079
            if (r3 == r7) goto L_0x006b
            if (r3 == r6) goto L_0x005f
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            long r7 = r1.S
            long r9 = r1.R
            java.lang.Object r3 = r1.T
            rf.m0 r3 = (rf.m0) r3
            zd.e1.n(r0)
            r11 = r4
            r0 = r5
        L_0x003d:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x0115
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            long r7 = r1.S
            long r9 = r1.R
            java.lang.Object r3 = r1.T
            rf.m0 r3 = (rf.m0) r3
            zd.e1.n(r0)
            r0 = r5
        L_0x0058:
            r16 = r7
            r7 = r9
            r9 = r16
            goto L_0x00fc
        L_0x005f:
            long r7 = r1.S
            long r9 = r1.R
            java.lang.Object r3 = r1.T
            rf.m0 r3 = (rf.m0) r3
            zd.e1.n(r0)
            goto L_0x00c2
        L_0x006b:
            long r7 = r1.S
            long r9 = r1.R
            java.lang.Object r3 = r1.T
            rf.m0 r3 = (rf.m0) r3
            zd.e1.n(r0)
            r0 = r3
            r10 = r9
            goto L_0x00a6
        L_0x0079:
            zd.e1.n(r0)
            pf.b r0 = pf.c.b()
            if (r0 == 0) goto L_0x0087
            long r8 = r0.b()
            goto L_0x008b
        L_0x0087:
            long r8 = java.lang.System.nanoTime()
        L_0x008b:
            long r10 = pf.x1.d(r20)
            long r8 = r8 + r10
            r0 = r22
            r1.T = r0
            r10 = r18
            r1.R = r10
            r1.S = r8
            r1.V = r7
            r12 = r20
            java.lang.Object r3 = pf.f1.b(r12, r1)
            if (r3 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r7 = r8
        L_0x00a6:
            long r9 = pf.x1.d(r10)
        L_0x00aa:
            long r7 = r7 + r9
            zd.u2 r3 = zd.u2.f25116a
            r1.T = r0
            r1.R = r7
            r1.S = r9
            r1.V = r6
            java.lang.Object r3 = r0.C(r3, r1)
            if (r3 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            r3 = r0
            r16 = r7
            r7 = r9
            r9 = r16
        L_0x00c2:
            pf.b r0 = pf.c.b()
            if (r0 == 0) goto L_0x00cd
            long r11 = r0.b()
            goto L_0x00d1
        L_0x00cd:
            long r11 = java.lang.System.nanoTime()
        L_0x00d1:
            long r13 = r9 - r11
            r4 = 0
            long r13 = gf.v.v(r13, r4)
            int r15 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0100
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0100
            long r4 = r11 - r9
            long r4 = r4 % r7
            long r4 = r7 - r4
            long r9 = r11 + r4
            long r4 = pf.x1.c(r4)
            r1.T = r3
            r1.R = r9
            r1.S = r7
            r0 = 3
            r1.V = r0
            java.lang.Object r4 = pf.f1.b(r4, r1)
            if (r4 != r2) goto L_0x0058
            return r2
        L_0x00fc:
            r5 = r0
            r0 = r3
            r4 = 4
            goto L_0x00aa
        L_0x0100:
            r0 = 3
            long r4 = pf.x1.c(r13)
            r1.T = r3
            r1.R = r9
            r1.S = r7
            r11 = 4
            r1.V = r11
            java.lang.Object r4 = pf.f1.b(r4, r1)
            if (r4 != r2) goto L_0x003d
            return r2
        L_0x0115:
            r5 = r0
            r0 = r3
            r4 = r11
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.p0.d(long, long, rf.m0, ie.d):java.lang.Object");
    }

    @g
    @e3
    public static final i0<u2> e(long j10, long j11, @g ie.g gVar, @g q0 q0Var) {
        long j12 = j11;
        boolean z10 = true;
        if (j10 >= 0) {
            if (j12 < 0) {
                z10 = false;
            }
            if (z10) {
                ie.g gVar2 = gVar;
                return e0.e(e2.O, m1.g().m1(gVar), 0, new c(q0Var, j10, j11, (ie.d<? super c>) null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j11 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j10 + " ms").toString());
    }

    public static /* synthetic */ i0 f(long j10, long j11, ie.g gVar, q0 q0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        if ((i10 & 4) != 0) {
            gVar = i.O;
        }
        if ((i10 & 8) != 0) {
            q0Var = q0.FIXED_PERIOD;
        }
        return e(j10, j11, gVar, q0Var);
    }
}

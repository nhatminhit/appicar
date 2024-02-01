package rf;

import fh.g;
import fh.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import le.d;
import le.f;
import pf.e3;
import pf.y1;
import rf.i0;
import we.l;
import zd.a1;
import zd.b1;
import zd.i0;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\b\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003HHø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003HHø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"E", "R", "Lrf/i;", "Lkotlin/Function1;", "Lrf/i0;", "Lzd/u;", "block", "b", "(Lrf/i;Lwe/l;)Ljava/lang/Object;", "", "i", "(Lrf/i0;Lie/d;)Ljava/lang/Object;", "Lzf/d;", "h", "c", "(Lrf/i0;Lwe/l;)Ljava/lang/Object;", "Lzd/u2;", "action", "e", "(Lrf/i0;Lwe/l;Lie/d;)Ljava/lang/Object;", "", "j", "d", "(Lrf/i;Lwe/l;Lie/d;)Ljava/lang/Object;", "", "cause", "a", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class u {

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class a<E> extends d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return u.e((i0) null, (l) null, this);
        }
    }

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class b<E> extends d {
        public Object R;
        public Object S;
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
            return u.d((i) null, (l) null, this);
        }
    }

    @f(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class c<E> extends d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public c(ie.d<? super c> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return s.g0((i0) null, this);
        }
    }

    @a1
    public static final void a(@g i0<?> i0Var, @h Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = y1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        i0Var.h(cancellationException);
    }

    @e3
    public static final <E, R> R b(@g i<E> iVar, @g l<? super i0<? extends E>, ? extends R> lVar) {
        i0<E> I = iVar.I();
        try {
            return lVar.A(I);
        } finally {
            xe.i0.d(1);
            i0.a.b(I, (CancellationException) null, 1, (Object) null);
            xe.i0.c(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        xe.i0.d(1);
        rf.s.b(r2, r3);
        xe.i0.c(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, R> R c(@fh.g rf.i0<? extends E> r2, @fh.g we.l<? super rf.i0<? extends E>, ? extends R> r3) {
        /*
            r0 = 1
            java.lang.Object r3 = r3.A(r2)     // Catch:{ all -> 0x0010 }
            xe.i0.d(r0)
            r1 = 0
            rf.s.b(r2, r1)
            xe.i0.c(r0)
            return r3
        L_0x0010:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r1 = move-exception
            xe.i0.d(r0)
            rf.s.b(r2, r3)
            xe.i0.c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.u.c(rf.i0, we.l):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[Catch:{ all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @fh.h
    @pf.e3
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object d(@fh.g rf.i<E> r6, @fh.g we.l<? super E, zd.u2> r7, @fh.g ie.d<? super zd.u2> r8) {
        /*
            boolean r0 = r8 instanceof rf.u.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.u$b r0 = (rf.u.b) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.u$b r0 = new rf.u$b
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r6 = r0.T
            rf.p r6 = (rf.p) r6
            java.lang.Object r7 = r0.S
            rf.i0 r7 = (rf.i0) r7
            java.lang.Object r2 = r0.R
            we.l r2 = (we.l) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x003b }
            r5 = r0
            r0 = r7
            r7 = r2
        L_0x0038:
            r2 = r1
            r1 = r5
            goto L_0x0066
        L_0x003b:
            r6 = move-exception
            goto L_0x008f
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            zd.e1.n(r8)
            rf.i0 r6 = r6.I()
            rf.p r8 = r6.iterator()     // Catch:{ all -> 0x008b }
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0053:
            r0.R = r7     // Catch:{ all -> 0x0088 }
            r0.S = r8     // Catch:{ all -> 0x0088 }
            r0.T = r6     // Catch:{ all -> 0x0088 }
            r0.V = r4     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r6.b(r0)     // Catch:{ all -> 0x0088 }
            if (r2 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L_0x0038
        L_0x0066:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0085 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x0079
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0085 }
            r7.A(r8)     // Catch:{ all -> 0x0085 }
            r8 = r0
            r0 = r1
            r1 = r2
            goto L_0x0053
        L_0x0079:
            zd.u2 r6 = zd.u2.f25116a     // Catch:{ all -> 0x0085 }
            xe.i0.d(r4)
            rf.i0.a.b(r0, r3, r4, r3)
            xe.i0.c(r4)
            return r6
        L_0x0085:
            r6 = move-exception
            r7 = r0
            goto L_0x008f
        L_0x0088:
            r6 = move-exception
            r7 = r8
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x008f:
            xe.i0.d(r4)
            rf.i0.a.b(r7, r3, r4, r3)
            xe.i0.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.u.d(rf.i, we.l, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object e(@fh.g rf.i0<? extends E> r6, @fh.g we.l<? super E, zd.u2> r7, @fh.g ie.d<? super zd.u2> r8) {
        /*
            boolean r0 = r8 instanceof rf.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.u$a r0 = (rf.u.a) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.u$a r0 = new rf.u$a
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.T
            rf.p r6 = (rf.p) r6
            java.lang.Object r7 = r0.S
            rf.i0 r7 = (rf.i0) r7
            java.lang.Object r2 = r0.R
            we.l r2 = (we.l) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            goto L_0x007e
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            zd.e1.n(r8)
            rf.p r8 = r6.iterator()     // Catch:{ all -> 0x007a }
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x004a:
            r0.R = r8     // Catch:{ all -> 0x0035 }
            r0.S = r7     // Catch:{ all -> 0x0035 }
            r0.T = r6     // Catch:{ all -> 0x0035 }
            r0.V = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r6.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x005c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0035 }
            r2.A(r8)     // Catch:{ all -> 0x0035 }
            r8 = r2
            goto L_0x004a
        L_0x006e:
            zd.u2 r6 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            xe.i0.d(r3)
            rf.s.b(r7, r4)
            xe.i0.c(r3)
            return r6
        L_0x007a:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x007e:
            throw r6     // Catch:{ all -> 0x007f }
        L_0x007f:
            r8 = move-exception
            xe.i0.d(r3)
            rf.s.b(r7, r6)
            xe.i0.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.u.e(rf.i0, we.l, ie.d):java.lang.Object");
    }

    @e3
    public static final <E> Object f(i<E> iVar, l<? super E, u2> lVar, ie.d<? super u2> dVar) {
        i0<E> I = iVar.I();
        try {
            p<E> it = I.iterator();
            while (true) {
                xe.i0.e(3);
                xe.i0.e(0);
                Object b10 = it.b((ie.d<? super Boolean>) null);
                xe.i0.e(1);
                if (!((Boolean) b10).booleanValue()) {
                    return u2.f25116a;
                }
                lVar.A(it.next());
            }
        } finally {
            xe.i0.d(1);
            i0.a.b(I, (CancellationException) null, 1, (Object) null);
            xe.i0.c(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        xe.i0.d(1);
        rf.s.b(r3, r4);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object g(rf.i0<? extends E> r3, we.l<? super E, zd.u2> r4, ie.d<? super zd.u2> r5) {
        /*
            r5 = 1
            rf.p r0 = r3.iterator()     // Catch:{ all -> 0x0031 }
        L_0x0005:
            r1 = 3
            xe.i0.e(r1)     // Catch:{ all -> 0x0031 }
            r1 = 0
            xe.i0.e(r1)     // Catch:{ all -> 0x0031 }
            r1 = 0
            java.lang.Object r2 = r0.b(r1)     // Catch:{ all -> 0x0031 }
            xe.i0.e(r5)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0031 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0025
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0031 }
            r4.A(r1)     // Catch:{ all -> 0x0031 }
            goto L_0x0005
        L_0x0025:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x0031 }
            xe.i0.d(r5)
            rf.s.b(r3, r1)
            xe.i0.c(r5)
            return r4
        L_0x0031:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            xe.i0.d(r5)
            rf.s.b(r3, r4)
            xe.i0.c(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.u.g(rf.i0, we.l, ie.d):java.lang.Object");
    }

    @g
    @k(level = m.P, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> zf.d<E> h(@g i0<? extends E> i0Var) {
        return i0Var.s();
    }

    @h
    @k(level = m.P, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> Object i(@g i0<? extends E> i0Var, @g ie.d<? super E> dVar) {
        return i0Var.J(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E> java.lang.Object j(@fh.g rf.i0<? extends E> r8, @fh.g ie.d<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof rf.u.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rf.u$c r0 = (rf.u.c) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.u$c r0 = new rf.u$c
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.U
            rf.p r8 = (rf.p) r8
            java.lang.Object r2 = r0.T
            rf.i0 r2 = (rf.i0) r2
            java.lang.Object r4 = r0.S
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.R
            java.util.List r5 = (java.util.List) r5
            zd.e1.n(r9)     // Catch:{ all -> 0x0039 }
            goto L_0x0067
        L_0x0039:
            r8 = move-exception
            r9 = r2
            goto L_0x0089
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            zd.e1.n(r9)
            java.util.List r9 = be.v.i()
            rf.p r2 = r8.iterator()     // Catch:{ all -> 0x0085 }
            r4 = r9
            r5 = r4
            r9 = r8
            r8 = r2
        L_0x0053:
            r0.R = r5     // Catch:{ all -> 0x0083 }
            r0.S = r4     // Catch:{ all -> 0x0083 }
            r0.T = r9     // Catch:{ all -> 0x0083 }
            r0.U = r8     // Catch:{ all -> 0x0083 }
            r0.W = r3     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r8.b(r0)     // Catch:{ all -> 0x0083 }
            if (r2 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r7 = r2
            r2 = r9
            r9 = r7
        L_0x0067:
            r6 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0039 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r9 == 0) goto L_0x0079
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0039 }
            r4.add(r9)     // Catch:{ all -> 0x0039 }
            r9 = r2
            goto L_0x0053
        L_0x0079:
            zd.u2 r8 = zd.u2.f25116a     // Catch:{ all -> 0x0039 }
            rf.s.b(r2, r6)
            java.util.List r8 = be.v.a(r5)
            return r8
        L_0x0083:
            r8 = move-exception
            goto L_0x0089
        L_0x0085:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0089:
            throw r8     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            rf.s.b(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.u.j(rf.i0, ie.d):java.lang.Object");
    }
}

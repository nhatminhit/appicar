package uf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.f;
import pf.d2;
import pf.u0;
import rf.i;
import xe.w;
import zd.i0;
import zd.k;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"T", "Luf/j;", "Lrf/i0;", "channel", "Lzd/u2;", "d", "(Luf/j;Lrf/i0;Lie/d;)Ljava/lang/Object;", "", "consume", "e", "(Luf/j;Lrf/i0;ZLie/d;)Ljava/lang/Object;", "Luf/i;", "g", "c", "Lrf/i;", "b", "Lpf/u0;", "scope", "f", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class m {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<T> {
        public final /* synthetic */ i O;

        public a(i iVar) {
            this.O = iVar;
        }

        @h
        public Object a(@g j<? super T> jVar, @g d<? super u2> dVar) {
            Object l02 = k.l0(jVar, this.O.I(), dVar);
            return l02 == ke.d.h() ? l02 : u2.f25116a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b<T> extends le.d {
        public Object R;
        public Object S;
        public boolean T;
        public /* synthetic */ Object U;
        public int V;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return m.e((j) null, (rf.i0) null, false, this);
        }
    }

    @g
    @k(level = zd.m.O, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> b(@g i<T> iVar) {
        return new a(iVar);
    }

    @g
    public static final <T> i<T> c(@g rf.i0<? extends T> i0Var) {
        return new e(i0Var, true, (ie.g) null, 0, (rf.m) null, 28, (w) null);
    }

    @h
    public static final <T> Object d(@g j<? super T> jVar, @g rf.i0<? extends T> i0Var, @g d<? super u2> dVar) {
        Object e10 = e(jVar, i0Var, true, dVar);
        return e10 == ke.d.h() ? e10 : u2.f25116a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[SYNTHETIC, Splitter:B:36:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object e(uf.j<? super T> r7, rf.i0<? extends T> r8, boolean r9, ie.d<? super zd.u2> r10) {
        /*
            boolean r0 = r10 instanceof uf.m.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            uf.m$b r0 = (uf.m.b) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            uf.m$b r0 = new uf.m$b
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r7 = r0.T
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r9 = r0.R
            uf.j r9 = (uf.j) r9
            zd.e1.n(r10)     // Catch:{ all -> 0x0055 }
        L_0x0035:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005d
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            boolean r7 = r0.T
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r9 = r0.R
            uf.j r9 = (uf.j) r9
            zd.e1.n(r10)     // Catch:{ all -> 0x0055 }
            rf.r r10 = (rf.r) r10     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r10.o()     // Catch:{ all -> 0x0055 }
            goto L_0x006f
        L_0x0055:
            r9 = move-exception
            goto L_0x009c
        L_0x0057:
            zd.e1.n(r10)
            uf.k.o0(r7)
        L_0x005d:
            r0.R = r7     // Catch:{ all -> 0x0098 }
            r0.S = r8     // Catch:{ all -> 0x0098 }
            r0.T = r9     // Catch:{ all -> 0x0098 }
            r0.V = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r10 = r8.v(r0)     // Catch:{ all -> 0x0098 }
            if (r10 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006f:
            r2 = 0
            boolean r5 = rf.r.k(r10)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0085
            java.lang.Throwable r9 = rf.r.f(r10)     // Catch:{ all -> 0x0055 }
            if (r9 != 0) goto L_0x0084
            if (r7 == 0) goto L_0x0081
            rf.s.b(r8, r2)
        L_0x0081:
            zd.u2 r7 = zd.u2.f25116a
            return r7
        L_0x0084:
            throw r9     // Catch:{ all -> 0x0055 }
        L_0x0085:
            java.lang.Object r10 = rf.r.i(r10)     // Catch:{ all -> 0x0055 }
            r0.R = r9     // Catch:{ all -> 0x0055 }
            r0.S = r8     // Catch:{ all -> 0x0055 }
            r0.T = r7     // Catch:{ all -> 0x0055 }
            r0.V = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r10 = r9.d(r10, r0)     // Catch:{ all -> 0x0055 }
            if (r10 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x009c:
            throw r9     // Catch:{ all -> 0x009d }
        L_0x009d:
            r10 = move-exception
            if (r7 == 0) goto L_0x00a3
            rf.s.b(r8, r9)
        L_0x00a3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.m.e(uf.j, rf.i0, boolean, ie.d):java.lang.Object");
    }

    @g
    @d2
    public static final <T> rf.i0<T> f(@g i<? extends T> iVar, @g u0 u0Var) {
        return vf.f.b(iVar).n(u0Var);
    }

    @g
    public static final <T> i<T> g(@g rf.i0<? extends T> i0Var) {
        return new e(i0Var, false, (ie.g) null, 0, (rf.m) null, 28, (w) null);
    }
}

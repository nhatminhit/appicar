package uf;

import be.v;
import fh.g;
import fh.h;
import java.util.List;
import kotlin.Metadata;
import le.d;
import le.f;
import rf.m;
import vf.b;
import vf.r;
import vf.u;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u00108\u001a\u00020(¢\u0006\u0004\b9\u00102J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010\u000bR\u0016\u0010.\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R*\u0010\f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b3\u0010\u0013\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Luf/u0;", "T", "Lvf/b;", "Luf/w0;", "Luf/e0;", "Luf/c;", "Lvf/r;", "expect", "update", "", "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "w", "(Ljava/lang/Object;)Z", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "k", "()V", "Luf/j;", "collector", "", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "q", "()Luf/w0;", "", "size", "", "r", "(I)[Luf/w0;", "Lie/g;", "context", "capacity", "Lrf/m;", "onBufferOverflow", "Luf/i;", "c", "(Lie/g;ILrf/m;)Luf/i;", "", "expectedState", "newState", "t", "S", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "", "b", "()Ljava/util/List;", "replayCache", "initialState", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class u0<T> extends b<w0> implements e0<T>, c<T>, r<T> {
    public int S;
    @g
    private volatile /* synthetic */ Object _state;

    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a extends d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public Object V;
        public /* synthetic */ Object W;
        public final /* synthetic */ u0<T> X;
        public int Y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u0<T> u0Var, ie.d<? super a> dVar) {
            super(dVar);
            this.X = u0Var;
        }

        @h
        public final Object K(@g Object obj) {
            this.W = obj;
            this.Y |= Integer.MIN_VALUE;
            return this.X.a((j) null, this);
        }
    }

    public u0(@g Object obj) {
        this._state = obj;
    }

    public static /* synthetic */ void s() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: uf.w0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: uf.u0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(@fh.g uf.j<? super T> r11, @fh.g ie.d<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof uf.u0.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            uf.u0$a r0 = (uf.u0.a) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            uf.u0$a r0 = new uf.u0$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.W
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.Y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.V
            java.lang.Object r2 = r0.U
            pf.n2 r2 = (pf.n2) r2
            java.lang.Object r6 = r0.T
            uf.w0 r6 = (uf.w0) r6
            java.lang.Object r7 = r0.S
            uf.j r7 = (uf.j) r7
            java.lang.Object r8 = r0.R
            uf.u0 r8 = (uf.u0) r8
            zd.e1.n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.V
            java.lang.Object r2 = r0.U
            pf.n2 r2 = (pf.n2) r2
            java.lang.Object r6 = r0.T
            uf.w0 r6 = (uf.w0) r6
            java.lang.Object r7 = r0.S
            uf.j r7 = (uf.j) r7
            java.lang.Object r8 = r0.R
            uf.u0 r8 = (uf.u0) r8
            zd.e1.n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d0
        L_0x0061:
            java.lang.Object r11 = r0.T
            r6 = r11
            uf.w0 r6 = (uf.w0) r6
            java.lang.Object r11 = r0.S
            uf.j r11 = (uf.j) r11
            java.lang.Object r2 = r0.R
            r8 = r2
            uf.u0 r8 = (uf.u0) r8
            zd.e1.n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00ec
        L_0x0076:
            zd.e1.n(r12)
            vf.d r12 = r10.g()
            uf.w0 r12 = (uf.w0) r12
            boolean r2 = r11 instanceof uf.x0     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            uf.x0 r2 = (uf.x0) r2     // Catch:{ all -> 0x00e9 }
            r0.R = r10     // Catch:{ all -> 0x00e9 }
            r0.S = r11     // Catch:{ all -> 0x00e9 }
            r0.T = r12     // Catch:{ all -> 0x00e9 }
            r0.Y = r6     // Catch:{ all -> 0x00e9 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x00e9 }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            ie.g r12 = r0.e()     // Catch:{ all -> 0x0073 }
            pf.n2$b r2 = pf.n2.D     // Catch:{ all -> 0x0073 }
            ie.g$b r12 = r12.g(r2)     // Catch:{ all -> 0x0073 }
            pf.n2 r12 = (pf.n2) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00ad
            pf.r2.A(r2)     // Catch:{ all -> 0x0073 }
        L_0x00ad:
            if (r11 == 0) goto L_0x00b5
            boolean r9 = xe.l0.g(r11, r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d0
        L_0x00b5:
            wf.r0 r11 = vf.u.f23630a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bb
            r11 = r3
            goto L_0x00bc
        L_0x00bb:
            r11 = r12
        L_0x00bc:
            r0.R = r8     // Catch:{ all -> 0x0073 }
            r0.S = r7     // Catch:{ all -> 0x0073 }
            r0.T = r6     // Catch:{ all -> 0x0073 }
            r0.U = r2     // Catch:{ all -> 0x0073 }
            r0.V = r12     // Catch:{ all -> 0x0073 }
            r0.Y = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.d(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r11 = r12
        L_0x00d0:
            boolean r12 = r6.g()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.R = r8     // Catch:{ all -> 0x0073 }
            r0.S = r7     // Catch:{ all -> 0x0073 }
            r0.T = r6     // Catch:{ all -> 0x0073 }
            r0.U = r2     // Catch:{ all -> 0x0073 }
            r0.V = r11     // Catch:{ all -> 0x0073 }
            r0.Y = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.d(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00e9:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00ec:
            r8.m(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.u0.a(uf.j, ie.d):java.lang.Object");
    }

    @g
    public List<T> b() {
        return v.k(getValue());
    }

    @g
    public i<T> c(@g ie.g gVar, int i10, @g m mVar) {
        return v0.d(this, gVar, i10, mVar);
    }

    @h
    public Object d(T t10, @g ie.d<? super u2> dVar) {
        setValue(t10);
        return u2.f25116a;
    }

    public T getValue() {
        T t10 = u.f23630a;
        T t11 = this._state;
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    public boolean h(T t10, T t11) {
        if (t10 == null) {
            t10 = u.f23630a;
        }
        if (t11 == null) {
            t11 = u.f23630a;
        }
        return t(t10, t11);
    }

    public void k() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @g
    /* renamed from: q */
    public w0 i() {
        return new w0();
    }

    @g
    /* renamed from: r */
    public w0[] j(int i10) {
        return new w0[i10];
    }

    public void setValue(T t10) {
        if (t10 == null) {
            t10 = u.f23630a;
        }
        t((Object) null, t10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r8 = (uf.w0[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r8 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        r2 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r3 >= r2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r8 != r7) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        r6.S = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = o();
        r2 = zd.u2.f25116a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r6.o()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r7 == 0) goto L_0x0011
            boolean r7 = xe.l0.g(r0, r7)     // Catch:{ all -> 0x005c }
            if (r7 != 0) goto L_0x0011
            monitor-exit(r6)
            return r1
        L_0x0011:
            boolean r7 = xe.l0.g(r0, r8)     // Catch:{ all -> 0x005c }
            r0 = 1
            if (r7 == 0) goto L_0x001a
            monitor-exit(r6)
            return r0
        L_0x001a:
            r6._state = r8     // Catch:{ all -> 0x005c }
            int r7 = r6.S     // Catch:{ all -> 0x005c }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0056
            int r7 = r7 + r0
            r6.S = r7     // Catch:{ all -> 0x005c }
            vf.d[] r8 = r6.o()     // Catch:{ all -> 0x005c }
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
        L_0x002c:
            uf.w0[] r8 = (uf.w0[]) r8
            if (r8 == 0) goto L_0x003e
            int r2 = r8.length
            r3 = r1
        L_0x0032:
            if (r3 >= r2) goto L_0x003e
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003b
            r4.f()
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003e:
            monitor-enter(r6)
            int r8 = r6.S     // Catch:{ all -> 0x0053 }
            if (r8 != r7) goto L_0x0048
            int r7 = r7 + r0
            r6.S = r7     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            return r0
        L_0x0048:
            vf.d[] r7 = r6.o()     // Catch:{ all -> 0x0053 }
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002c
        L_0x0053:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0056:
            int r7 = r7 + 2
            r6.S = r7     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
            return r0
        L_0x005c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.u0.t(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean w(T t10) {
        setValue(t10);
        return true;
    }
}

package ag;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.d;
import le.f;
import wf.r0;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "locked", "Lag/c;", "a", "T", "", "owner", "Lkotlin/Function0;", "action", "o", "(Lag/c;Ljava/lang/Object;Lwe/a;Lie/d;)Ljava/lang/Object;", "Lwf/r0;", "Lwf/r0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "c", "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lag/b;", "e", "Lag/b;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class e {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f16090a = new r0("LOCK_FAIL");
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f16091b = new r0("UNLOCK_FAIL");
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f16092c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f16093d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final b f16094e;
    @g

    /* renamed from: f  reason: collision with root package name */
    public static final b f16095f;

    @f(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class a<T> extends d {
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
            return e.o((c) null, (Object) null, (we.a) null, this);
        }
    }

    static {
        r0 r0Var = new r0("LOCKED");
        f16092c = r0Var;
        r0 r0Var2 = new r0("UNLOCKED");
        f16093d = r0Var2;
        f16094e = new b(r0Var);
        f16095f = new b(r0Var2);
    }

    @g
    public static final c a(boolean z10) {
        return new d(z10);
    }

    public static /* synthetic */ c b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: we.a<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object o(@fh.g ag.c r4, @fh.h java.lang.Object r5, @fh.g we.a<? extends T> r6, @fh.g ie.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof ag.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ag.e$a r0 = (ag.e.a) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            ag.e$a r0 = new ag.e$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.T
            r6 = r4
            we.a r6 = (we.a) r6
            java.lang.Object r5 = r0.S
            java.lang.Object r4 = r0.R
            ag.c r4 = (ag.c) r4
            zd.e1.n(r7)
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            zd.e1.n(r7)
            r0.R = r4
            r0.S = r5
            r0.T = r6
            r0.V = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.lang.Object r6 = r6.n()     // Catch:{ all -> 0x005c }
            xe.i0.d(r3)
            r4.d(r5)
            xe.i0.c(r3)
            return r6
        L_0x005c:
            r6 = move-exception
            xe.i0.d(r3)
            r4.d(r5)
            xe.i0.c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.e.o(ag.c, java.lang.Object, we.a, ie.d):java.lang.Object");
    }

    public static final <T> Object p(c cVar, Object obj, we.a<? extends T> aVar, ie.d<? super T> dVar) {
        xe.i0.e(0);
        cVar.c(obj, dVar);
        xe.i0.e(1);
        try {
            return aVar.n();
        } finally {
            xe.i0.d(1);
            cVar.d(obj);
            xe.i0.c(1);
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, we.a aVar, ie.d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        xe.i0.e(0);
        cVar.c(obj, dVar);
        xe.i0.e(1);
        try {
            return aVar.n();
        } finally {
            xe.i0.d(1);
            cVar.d(obj);
            xe.i0.c(1);
        }
    }
}

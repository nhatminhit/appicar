package ag;

import fh.g;
import kotlin.Metadata;
import le.d;
import le.f;
import wf.r0;
import wf.v0;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HHø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001a\u0010\u0012\u001a\u00020\u00008\u0002X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u0012\u0004\b\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u0012\u0004\b\"\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "permits", "acquiredPermits", "Lag/f;", "a", "T", "Lkotlin/Function0;", "action", "q", "(Lag/f;Lwe/a;Lie/d;)Ljava/lang/Object;", "", "id", "Lag/i;", "prev", "j", "I", "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "Lwf/r0;", "b", "Lwf/r0;", "getPERMIT$annotations", "PERMIT", "c", "getTAKEN$annotations", "TAKEN", "d", "getBROKEN$annotations", "BROKEN", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f16103a = v0.d("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f16104b = new r0("PERMIT");
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f16105c = new r0("TAKEN");
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f16106d = new r0("BROKEN");
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final r0 f16107e = new r0("CANCELLED");

    /* renamed from: f  reason: collision with root package name */
    public static final int f16108f = v0.d("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    @f(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {85}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @i0(k = 3, mv = {1, 6, 0}, xi = 176)
    public static final class a<T> extends d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return h.q((f) null, (we.a) null, this);
        }
    }

    @g
    public static final f a(int i10, int i11) {
        return new g(i10, i11);
    }

    public static /* synthetic */ f b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final i j(long j10, i iVar) {
        return new i(j10, iVar, 0);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: we.a<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object q(@fh.g ag.f r4, @fh.g we.a<? extends T> r5, @fh.g ie.d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof ag.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ag.h$a r0 = (ag.h.a) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            ag.h$a r0 = new ag.h$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.S
            r5 = r4
            we.a r5 = (we.a) r5
            java.lang.Object r4 = r0.R
            ag.f r4 = (ag.f) r4
            zd.e1.n(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            zd.e1.n(r6)
            r0.R = r4
            r0.S = r5
            r0.U = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = r5.n()     // Catch:{ all -> 0x0058 }
            xe.i0.d(r3)
            r4.a()
            xe.i0.c(r3)
            return r5
        L_0x0058:
            r5 = move-exception
            xe.i0.d(r3)
            r4.a()
            xe.i0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.h.q(ag.f, we.a, ie.d):java.lang.Object");
    }

    public static final <T> Object r(f fVar, we.a<? extends T> aVar, ie.d<? super T> dVar) {
        xe.i0.e(0);
        fVar.c(dVar);
        xe.i0.e(1);
        try {
            return aVar.n();
        } finally {
            xe.i0.d(1);
            fVar.a();
            xe.i0.c(1);
        }
    }
}

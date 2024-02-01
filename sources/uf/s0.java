package uf;

import be.e0;
import be.v;
import fh.g;
import fh.h;
import ie.d;
import java.util.List;
import kotlin.Metadata;
import le.f;
import le.o;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import we.l;
import we.p;
import we.q;
import zd.e1;
import zd.i2;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Luf/s0;", "Luf/o0;", "Luf/t0;", "", "subscriptionCount", "Luf/i;", "Luf/m0;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class s0 implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f23364b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23365c;

    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, d2 = {"Luf/j;", "Luf/m0;", "", "count", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements q<j<? super m0>, Integer, d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ int U;
        public final /* synthetic */ s0 V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, d<? super a> dVar) {
            super(3, dVar);
            this.V = s0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: uf.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r9.S
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r6) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0020:
                java.lang.Object r1 = r9.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r10)
                goto L_0x008e
            L_0x0028:
                java.lang.Object r1 = r9.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r10)
                goto L_0x007d
            L_0x0030:
                java.lang.Object r1 = r9.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r10)
                goto L_0x0064
            L_0x0038:
                zd.e1.n(r10)
                goto L_0x009c
            L_0x003c:
                zd.e1.n(r10)
                java.lang.Object r10 = r9.T
                r1 = r10
                uf.j r1 = (uf.j) r1
                int r10 = r9.U
                if (r10 <= 0) goto L_0x0053
                uf.m0 r10 = uf.m0.START
                r9.S = r6
                java.lang.Object r10 = r1.d(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x0053:
                uf.s0 r10 = r9.V
                long r6 = r10.f23364b
                r9.T = r1
                r9.S = r5
                java.lang.Object r10 = pf.f1.b(r6, r9)
                if (r10 != r0) goto L_0x0064
                return r0
            L_0x0064:
                uf.s0 r10 = r9.V
                long r5 = r10.f23365c
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x008e
                uf.m0 r10 = uf.m0.STOP
                r9.T = r1
                r9.S = r4
                java.lang.Object r10 = r1.d(r10, r9)
                if (r10 != r0) goto L_0x007d
                return r0
            L_0x007d:
                uf.s0 r10 = r9.V
                long r4 = r10.f23365c
                r9.T = r1
                r9.S = r3
                java.lang.Object r10 = pf.f1.b(r4, r9)
                if (r10 != r0) goto L_0x008e
                return r0
            L_0x008e:
                uf.m0 r10 = uf.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.T = r3
                r9.S = r2
                java.lang.Object r10 = r1.d(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                zd.u2 r10 = zd.u2.f25116a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.s0.a.K(java.lang.Object):java.lang.Object");
        }

        @h
        public final Object P(@g j<? super m0> jVar, int i10, @h d<? super u2> dVar) {
            a aVar = new a(this.V, dVar);
            aVar.T = jVar;
            aVar.U = i10;
            return aVar.K(u2.f25116a);
        }

        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
            return P((j) obj, ((Number) obj2).intValue(), (d) obj3);
        }
    }

    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, d2 = {"Luf/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements p<m0, d<? super Boolean>, Object> {
        public int S;
        public /* synthetic */ Object T;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(dVar);
            bVar.T = obj;
            return bVar;
        }

        @h
        public final Object K(@g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return le.b.a(((m0) this.T) != m0.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g m0 m0Var, @h d<? super Boolean> dVar) {
            return ((b) H(m0Var, dVar)).K(u2.f25116a);
        }
    }

    public s0(long j10, long j11) {
        this.f23364b = j10;
        this.f23365c = j11;
        boolean z10 = true;
        if (j10 >= 0) {
            if (!(j11 < 0 ? false : z10)) {
                throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
    }

    @g
    public i<m0> a(@g t0<Integer> t0Var) {
        return k.g0(k.k0(k.b2(t0Var, new a(this, (d<? super a>) null)), new b((d<? super b>) null)));
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return this.f23364b == s0Var.f23364b && this.f23365c == s0Var.f23365c;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (i2.a(this.f23364b) * 31) + i2.a(this.f23365c);
    }

    @g
    public String toString() {
        List j10 = v.j(2);
        if (this.f23364b > 0) {
            j10.add("stopTimeout=" + this.f23364b + "ms");
        }
        if (this.f23365c < Long.MAX_VALUE) {
            j10.add("replayExpiration=" + this.f23365c + "ms");
        }
        List a10 = v.a(j10);
        return "SharingStarted.WhileSubscribed(" + e0.h3(a10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63, (Object) null) + ')';
    }
}

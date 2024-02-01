package tf;

import be.w;
import fh.g;
import fh.h;
import ie.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import le.k;
import p000if.o;
import p000if.q;
import p000if.u;
import ve.e;
import we.p;
import xe.l0;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\u0010\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fHPø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u000f8@@@X\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Ltf/f;", "", "", "Ljava/lang/StackTraceElement;", "h", "", "state", "Lie/d;", "frame", "Lzd/u2;", "j", "(Ljava/lang/String;Lie/d;)V", "toString", "b", "Lif/o;", "Lle/e;", "k", "(Lif/o;Lle/e;Lie/d;)Ljava/lang/Object;", "Ltf/n;", "a", "Ltf/n;", "d", "()Ltf/n;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lie/g;", "c", "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "lastObservedThread", "f", "_lastObservedFrame", "()Lie/g;", "context", "()Ljava/util/List;", "creationStackTrace", "g", "()Ljava/lang/String;", "value", "()Lle/e;", "i", "(Lle/e;)V", "lastObservedFrame", "<init>", "(Lie/g;Ltf/n;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f {
    @h

    /* renamed from: a  reason: collision with root package name */
    public final n f23198a;
    @e

    /* renamed from: b  reason: collision with root package name */
    public final long f23199b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<ie.g> f23200c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public String f23201d = g.f23204a;
    @e
    @h

    /* renamed from: e  reason: collision with root package name */
    public Thread f23202e;
    @h

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<le.e> f23203f;

    @le.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lif/o;", "Ljava/lang/StackTraceElement;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends k implements p<o<? super StackTraceElement>, d<? super u2>, Object> {
        public int Q;
        public /* synthetic */ Object R;
        public final /* synthetic */ f S;
        public final /* synthetic */ n T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, n nVar, d<? super a> dVar) {
            super(2, dVar);
            this.S = fVar;
            this.T = nVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.S, this.T, dVar);
            aVar.R = obj;
            return aVar;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.Q;
            if (i10 == 0) {
                e1.n(obj);
                f fVar = this.S;
                le.e u10 = this.T.u();
                this.Q = 1;
                if (fVar.k((o) this.R, u10, this) == h10) {
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
        /* renamed from: N */
        public final Object g0(@g o<? super StackTraceElement> oVar, @h d<? super u2> dVar) {
            return ((a) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ f V;
        public int W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, d<? super b> dVar) {
            super(dVar);
            this.V = fVar;
        }

        @h
        public final Object K(@g Object obj) {
            this.U = obj;
            this.W |= Integer.MIN_VALUE;
            return this.V.k((o<? super StackTraceElement>) null, (le.e) null, this);
        }
    }

    public f(@h ie.g gVar, @h n nVar, long j10) {
        this.f23198a = nVar;
        this.f23199b = j10;
        this.f23200c = new WeakReference<>(gVar);
    }

    public final List<StackTraceElement> b() {
        n nVar = this.f23198a;
        return nVar == null ? w.E() : u.c3(q.b(new a(this, nVar, (d<? super a>) null)));
    }

    @h
    public final ie.g c() {
        return this.f23200c.get();
    }

    @h
    public final n d() {
        return this.f23198a;
    }

    @g
    public final List<StackTraceElement> e() {
        return b();
    }

    @h
    public final le.e f() {
        WeakReference<le.e> weakReference = this.f23203f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @g
    public final String g() {
        return this.f23201d;
    }

    @g
    public final List<StackTraceElement> h() {
        le.e f10 = f();
        if (f10 == null) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList();
        while (f10 != null) {
            StackTraceElement R = f10.R();
            if (R != null) {
                arrayList.add(R);
            }
            f10 = f10.u();
        }
        return arrayList;
    }

    public final void i(@h le.e eVar) {
        this.f23203f = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public final void j(@g String str, @g d<?> dVar) {
        if (!l0.g(this.f23201d, str) || !l0.g(str, g.f23206c) || f() == null) {
            this.f23201d = str;
            Thread thread = null;
            i(dVar instanceof le.e ? (le.e) dVar : null);
            if (l0.g(str, g.f23205b)) {
                thread = Thread.currentThread();
            }
            this.f23202e = thread;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(p000if.o<? super java.lang.StackTraceElement> r6, le.e r7, ie.d<? super zd.u2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof tf.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            tf.f$b r0 = (tf.f.b) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            tf.f$b r0 = new tf.f$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r6 = r0.T
            le.e r6 = (le.e) r6
            java.lang.Object r7 = r0.S
            if.o r7 = (p000if.o) r7
            java.lang.Object r2 = r0.R
            tf.f r2 = (tf.f) r2
            zd.e1.n(r8)
            goto L_0x005e
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            zd.e1.n(r8)
            r2 = r5
        L_0x0041:
            if (r7 != 0) goto L_0x0046
            zd.u2 r6 = zd.u2.f25116a
            return r6
        L_0x0046:
            java.lang.StackTraceElement r8 = r7.R()
            if (r8 == 0) goto L_0x0061
            r0.R = r2
            r0.S = r6
            r0.T = r7
            r0.W = r3
            java.lang.Object r8 = r6.a(r8, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005e:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0061:
            le.e r7 = r7.u()
            if (r7 == 0) goto L_0x0068
            goto L_0x0041
        L_0x0068:
            zd.u2 r6 = zd.u2.f25116a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.f.k(if.o, le.e, ie.d):java.lang.Object");
    }

    @g
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}

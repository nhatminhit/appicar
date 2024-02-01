package y3;

import android.os.Build;
import android.util.Log;
import d.m0;
import e1.m;
import g4.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u4.a;
import v3.i;
import v3.l;
import y3.f;
import y3.i;

public class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {

    /* renamed from: t0  reason: collision with root package name */
    public static final String f15355t0 = "DecodeJob";
    public final g<R> O = new g<>();
    public final List<Throwable> P = new ArrayList();
    public final u4.c Q = u4.c.a();
    public final e R;
    public final m.a<h<?>> S;
    public final d<?> T = new d<>();
    public final f U = new f();
    public com.bumptech.glide.d V;
    public v3.f W;
    public com.bumptech.glide.h X;
    public n Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f15356a0;

    /* renamed from: b0  reason: collision with root package name */
    public j f15357b0;

    /* renamed from: c0  reason: collision with root package name */
    public i f15358c0;

    /* renamed from: d0  reason: collision with root package name */
    public b<R> f15359d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f15360e0;

    /* renamed from: f0  reason: collision with root package name */
    public C0248h f15361f0;

    /* renamed from: g0  reason: collision with root package name */
    public g f15362g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f15363h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f15364i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f15365j0;

    /* renamed from: k0  reason: collision with root package name */
    public Thread f15366k0;

    /* renamed from: l0  reason: collision with root package name */
    public v3.f f15367l0;

    /* renamed from: m0  reason: collision with root package name */
    public v3.f f15368m0;

    /* renamed from: n0  reason: collision with root package name */
    public Object f15369n0;

    /* renamed from: o0  reason: collision with root package name */
    public v3.a f15370o0;

    /* renamed from: p0  reason: collision with root package name */
    public w3.d<?> f15371p0;

    /* renamed from: q0  reason: collision with root package name */
    public volatile f f15372q0;

    /* renamed from: r0  reason: collision with root package name */
    public volatile boolean f15373r0;

    /* renamed from: s0  reason: collision with root package name */
    public volatile boolean f15374s0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15375a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15376b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f15377c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                v3.c[] r0 = v3.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15377c = r0
                r1 = 1
                v3.c r2 = v3.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15377c     // Catch:{ NoSuchFieldError -> 0x001d }
                v3.c r3 = v3.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                y3.h$h[] r2 = y3.h.C0248h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f15376b = r2
                y3.h$h r3 = y3.h.C0248h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f15376b     // Catch:{ NoSuchFieldError -> 0x0038 }
                y3.h$h r3 = y3.h.C0248h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f15376b     // Catch:{ NoSuchFieldError -> 0x0043 }
                y3.h$h r4 = y3.h.C0248h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f15376b     // Catch:{ NoSuchFieldError -> 0x004e }
                y3.h$h r4 = y3.h.C0248h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f15376b     // Catch:{ NoSuchFieldError -> 0x0059 }
                y3.h$h r4 = y3.h.C0248h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                y3.h$g[] r3 = y3.h.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15375a = r3
                y3.h$g r4 = y3.h.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f15375a     // Catch:{ NoSuchFieldError -> 0x0074 }
                y3.h$g r3 = y3.h.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f15375a     // Catch:{ NoSuchFieldError -> 0x007e }
                y3.h$g r1 = y3.h.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y3.h.a.<clinit>():void");
        }
    }

    public interface b<R> {
        void a(h<?> hVar);

        void b(v<R> vVar, v3.a aVar);

        void c(q qVar);
    }

    public final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final v3.a f15378a;

        public c(v3.a aVar) {
            this.f15378a = aVar;
        }

        @m0
        public v<Z> a(@m0 v<Z> vVar) {
            return h.this.z(this.f15378a, vVar);
        }
    }

    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        public v3.f f15380a;

        /* renamed from: b  reason: collision with root package name */
        public l<Z> f15381b;

        /* renamed from: c  reason: collision with root package name */
        public u<Z> f15382c;

        public void a() {
            this.f15380a = null;
            this.f15381b = null;
            this.f15382c = null;
        }

        public void b(e eVar, v3.i iVar) {
            u4.b.a("DecodeJob.encode");
            try {
                eVar.a().c(this.f15380a, new e(this.f15381b, this.f15382c, iVar));
            } finally {
                this.f15382c.g();
                u4.b.e();
            }
        }

        public boolean c() {
            return this.f15382c != null;
        }

        public <X> void d(v3.f fVar, l<X> lVar, u<X> uVar) {
            this.f15380a = fVar;
            this.f15381b = lVar;
            this.f15382c = uVar;
        }
    }

    public interface e {
        a4.a a();
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15383a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15384b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15385c;

        public final boolean a(boolean z10) {
            return (this.f15385c || z10 || this.f15384b) && this.f15383a;
        }

        public synchronized boolean b() {
            this.f15384b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.f15385c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z10) {
            this.f15383a = true;
            return a(z10);
        }

        public synchronized void e() {
            this.f15384b = false;
            this.f15383a = false;
            this.f15385c = false;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: y3.h$h  reason: collision with other inner class name */
    public enum C0248h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, m.a<h<?>> aVar) {
        this.R = eVar;
        this.S = aVar;
    }

    public void A(boolean z10) {
        if (this.U.d(z10)) {
            B();
        }
    }

    public final void B() {
        this.U.e();
        this.T.a();
        this.O.a();
        this.f15373r0 = false;
        this.V = null;
        this.W = null;
        this.f15358c0 = null;
        this.X = null;
        this.Y = null;
        this.f15359d0 = null;
        this.f15361f0 = null;
        this.f15372q0 = null;
        this.f15366k0 = null;
        this.f15367l0 = null;
        this.f15369n0 = null;
        this.f15370o0 = null;
        this.f15371p0 = null;
        this.f15363h0 = 0;
        this.f15374s0 = false;
        this.f15365j0 = null;
        this.P.clear();
        this.S.a(this);
    }

    public final void C() {
        this.f15366k0 = Thread.currentThread();
        this.f15363h0 = t4.g.b();
        boolean z10 = false;
        while (!this.f15374s0 && this.f15372q0 != null && !(z10 = this.f15372q0.a())) {
            this.f15361f0 = o(this.f15361f0);
            this.f15372q0 = n();
            if (this.f15361f0 == C0248h.SOURCE) {
                d();
                return;
            }
        }
        if ((this.f15361f0 == C0248h.FINISHED || this.f15374s0) && !z10) {
            w();
        }
    }

    public final <Data, ResourceType> v<R> D(Data data, v3.a aVar, t<Data, ResourceType, R> tVar) throws q {
        v3.i p10 = p(aVar);
        w3.e l10 = this.V.h().l(data);
        try {
            return tVar.b(l10, p10, this.Z, this.f15356a0, new c(aVar));
        } finally {
            l10.b();
        }
    }

    public final void E() {
        int i10 = a.f15375a[this.f15362g0.ordinal()];
        if (i10 == 1) {
            this.f15361f0 = o(C0248h.INITIALIZE);
            this.f15372q0 = n();
        } else if (i10 != 2) {
            if (i10 == 3) {
                m();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f15362g0);
        }
        C();
    }

    public final void F() {
        Throwable th2;
        this.Q.c();
        if (this.f15373r0) {
            if (this.P.isEmpty()) {
                th2 = null;
            } else {
                List<Throwable> list = this.P;
                th2 = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.f15373r0 = true;
    }

    public boolean G() {
        C0248h o10 = o(C0248h.INITIALIZE);
        return o10 == C0248h.RESOURCE_CACHE || o10 == C0248h.DATA_CACHE;
    }

    public void a() {
        this.f15374s0 = true;
        f fVar = this.f15372q0;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public void b(v3.f fVar, Object obj, w3.d<?> dVar, v3.a aVar, v3.f fVar2) {
        this.f15367l0 = fVar;
        this.f15369n0 = obj;
        this.f15371p0 = dVar;
        this.f15370o0 = aVar;
        this.f15368m0 = fVar2;
        if (Thread.currentThread() != this.f15366k0) {
            this.f15362g0 = g.DECODE_DATA;
            this.f15359d0.a(this);
            return;
        }
        u4.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            m();
        } finally {
            u4.b.e();
        }
    }

    public void d() {
        this.f15362g0 = g.SWITCH_TO_SOURCE_SERVICE;
        this.f15359d0.a(this);
    }

    public void e(v3.f fVar, Exception exc, w3.d<?> dVar, v3.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", (Throwable) exc);
        qVar.k(fVar, aVar, dVar.a());
        this.P.add(qVar);
        if (Thread.currentThread() != this.f15366k0) {
            this.f15362g0 = g.SWITCH_TO_SOURCE_SERVICE;
            this.f15359d0.a(this);
            return;
        }
        C();
    }

    @m0
    public u4.c i() {
        return this.Q;
    }

    /* renamed from: j */
    public int compareTo(@m0 h<?> hVar) {
        int q10 = q() - hVar.q();
        return q10 == 0 ? this.f15360e0 - hVar.f15360e0 : q10;
    }

    public final <Data> v<R> k(w3.d<?> dVar, Data data, v3.a aVar) throws q {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = t4.g.b();
            v<R> l10 = l(data, aVar);
            if (Log.isLoggable(f15355t0, 2)) {
                s("Decoded result " + l10, b10);
            }
            return l10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> l(Data data, v3.a aVar) throws q {
        return D(data, aVar, this.O.h(data.getClass()));
    }

    public final void m() {
        if (Log.isLoggable(f15355t0, 2)) {
            long j10 = this.f15363h0;
            t("Retrieved data", j10, "data: " + this.f15369n0 + ", cache key: " + this.f15367l0 + ", fetcher: " + this.f15371p0);
        }
        v<R> vVar = null;
        try {
            vVar = k(this.f15371p0, this.f15369n0, this.f15370o0);
        } catch (q e10) {
            e10.j(this.f15368m0, this.f15370o0);
            this.P.add(e10);
        }
        if (vVar != null) {
            v(vVar, this.f15370o0);
        } else {
            C();
        }
    }

    public final f n() {
        int i10 = a.f15376b[this.f15361f0.ordinal()];
        if (i10 == 1) {
            return new w(this.O, this);
        }
        if (i10 == 2) {
            return new c(this.O, this);
        }
        if (i10 == 3) {
            return new z(this.O, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f15361f0);
    }

    public final C0248h o(C0248h hVar) {
        int i10 = a.f15376b[hVar.ordinal()];
        if (i10 == 1) {
            return this.f15357b0.a() ? C0248h.DATA_CACHE : o(C0248h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f15364i0 ? C0248h.FINISHED : C0248h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return C0248h.FINISHED;
        }
        if (i10 == 5) {
            return this.f15357b0.b() ? C0248h.RESOURCE_CACHE : o(C0248h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    @m0
    public final v3.i p(v3.a aVar) {
        v3.i iVar = this.f15358c0;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z10 = aVar == v3.a.RESOURCE_DISK_CACHE || this.O.w();
        v3.h hVar = q.f7996k;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return iVar;
        }
        v3.i iVar2 = new v3.i();
        iVar2.d(this.f15358c0);
        iVar2.e(hVar, Boolean.valueOf(z10));
        return iVar2;
    }

    public final int q() {
        return this.X.ordinal();
    }

    public h<R> r(com.bumptech.glide.d dVar, Object obj, n nVar, v3.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, v3.m<?>> map, boolean z10, boolean z11, boolean z12, v3.i iVar, b<R> bVar, int i12) {
        this.O.u(dVar, obj, fVar, i10, i11, jVar, cls, cls2, hVar, iVar, map, z10, z11, this.R);
        this.V = dVar;
        this.W = fVar;
        this.X = hVar;
        this.Y = nVar;
        this.Z = i10;
        this.f15356a0 = i11;
        this.f15357b0 = jVar;
        this.f15364i0 = z12;
        this.f15358c0 = iVar;
        this.f15359d0 = bVar;
        this.f15360e0 = i12;
        this.f15362g0 = g.INITIALIZE;
        this.f15365j0 = obj;
        return this;
    }

    public void run() {
        u4.b.b("DecodeJob#run(model=%s)", this.f15365j0);
        w3.d<?> dVar = this.f15371p0;
        try {
            if (this.f15374s0) {
                w();
                if (dVar != null) {
                    dVar.b();
                }
                u4.b.e();
                return;
            }
            E();
            if (dVar != null) {
                dVar.b();
            }
            u4.b.e();
        } catch (b e10) {
            throw e10;
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            u4.b.e();
            throw th2;
        }
    }

    public final void s(String str, long j10) {
        t(str, j10, (String) null);
    }

    public final void t(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(t4.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.Y);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
    }

    public final void u(v<R> vVar, v3.a aVar) {
        F();
        this.f15359d0.b(vVar, aVar);
    }

    public final void v(v<R> vVar, v3.a aVar) {
        if (vVar instanceof r) {
            ((r) vVar).b();
        }
        u<R> uVar = null;
        u<R> uVar2 = vVar;
        if (this.T.c()) {
            u<R> e10 = u.e(vVar);
            uVar = e10;
            uVar2 = e10;
        }
        u(uVar2, aVar);
        this.f15361f0 = C0248h.ENCODE;
        try {
            if (this.T.c()) {
                this.T.b(this.R, this.f15358c0);
            }
            x();
        } finally {
            if (uVar != null) {
                uVar.g();
            }
        }
    }

    public final void w() {
        F();
        this.f15359d0.c(new q("Failed to load resource", (List<Throwable>) new ArrayList(this.P)));
        y();
    }

    public final void x() {
        if (this.U.b()) {
            B();
        }
    }

    public final void y() {
        if (this.U.c()) {
            B();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: y3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: y3.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: y3.x} */
    /* JADX WARNING: type inference failed for: r12v5, types: [v3.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> y3.v<Z> z(v3.a r12, @d.m0 y3.v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            v3.a r0 = v3.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            y3.g<R> r0 = r11.O
            v3.m r0 = r0.r(r8)
            com.bumptech.glide.d r2 = r11.V
            int r3 = r11.Z
            int r4 = r11.f15356a0
            y3.v r2 = r0.b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.a()
        L_0x002b:
            y3.g<R> r13 = r11.O
            boolean r13 = r13.v(r0)
            if (r13 == 0) goto L_0x0040
            y3.g<R> r13 = r11.O
            v3.l r1 = r13.n(r0)
            v3.i r13 = r11.f15358c0
            v3.c r13 = r1.a(r13)
            goto L_0x0042
        L_0x0040:
            v3.c r13 = v3.c.NONE
        L_0x0042:
            r10 = r1
            y3.g<R> r1 = r11.O
            v3.f r2 = r11.f15367l0
            boolean r1 = r1.x(r2)
            r2 = 1
            r1 = r1 ^ r2
            y3.j r3 = r11.f15357b0
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = y3.h.a.f15377c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            y3.x r12 = new y3.x
            y3.g<R> r13 = r11.O
            z3.b r2 = r13.b()
            v3.f r3 = r11.f15367l0
            v3.f r4 = r11.W
            int r5 = r11.Z
            int r6 = r11.f15356a0
            v3.i r9 = r11.f15358c0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            y3.d r12 = new y3.d
            v3.f r13 = r11.f15367l0
            v3.f r1 = r11.W
            r12.<init>(r13, r1)
        L_0x009b:
            y3.u r0 = y3.u.e(r0)
            y3.h$d<?> r13 = r11.T
            r13.d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.j$d r12 = new com.bumptech.glide.j$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.z(v3.a, y3.v):y3.v");
    }
}

package p4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import d.m0;
import d.o0;
import d.u;
import d.z;
import java.util.List;
import java.util.concurrent.Executor;
import q4.o;
import q4.p;
import r4.g;
import t4.m;
import u4.c;
import y3.k;
import y3.q;
import y3.v;

public final class j<R> implements d, o, i {
    public static final String D = "Request";
    public static final String E = "Glide";
    public static final boolean F = Log.isLoggable(D, 2);
    @z("requestLock")
    public int A;
    @z("requestLock")
    public boolean B;
    @o0
    public RuntimeException C;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final String f11475a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11476b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11477c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final g<R> f11478d;

    /* renamed from: e  reason: collision with root package name */
    public final e f11479e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f11480f;

    /* renamed from: g  reason: collision with root package name */
    public final d f11481g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public final Object f11482h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f11483i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f11484j;

    /* renamed from: k  reason: collision with root package name */
    public final int f11485k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11486l;

    /* renamed from: m  reason: collision with root package name */
    public final h f11487m;

    /* renamed from: n  reason: collision with root package name */
    public final p<R> f11488n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public final List<g<R>> f11489o;

    /* renamed from: p  reason: collision with root package name */
    public final g<? super R> f11490p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f11491q;
    @z("requestLock")

    /* renamed from: r  reason: collision with root package name */
    public v<R> f11492r;
    @z("requestLock")

    /* renamed from: s  reason: collision with root package name */
    public k.d f11493s;
    @z("requestLock")

    /* renamed from: t  reason: collision with root package name */
    public long f11494t;

    /* renamed from: u  reason: collision with root package name */
    public volatile k f11495u;
    @z("requestLock")

    /* renamed from: v  reason: collision with root package name */
    public a f11496v;
    @o0
    @z("requestLock")

    /* renamed from: w  reason: collision with root package name */
    public Drawable f11497w;
    @o0
    @z("requestLock")

    /* renamed from: x  reason: collision with root package name */
    public Drawable f11498x;
    @o0
    @z("requestLock")

    /* renamed from: y  reason: collision with root package name */
    public Drawable f11499y;
    @z("requestLock")

    /* renamed from: z  reason: collision with root package name */
    public int f11500z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public j(Context context, d dVar, @m0 Object obj, @o0 Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, h hVar, p<R> pVar, @o0 g<R> gVar, @o0 List<g<R>> list, e eVar, k kVar, g<? super R> gVar2, Executor executor) {
        this.f11475a = F ? String.valueOf(super.hashCode()) : null;
        this.f11476b = c.a();
        this.f11477c = obj;
        this.f11480f = context;
        this.f11481g = dVar;
        this.f11482h = obj2;
        this.f11483i = cls;
        this.f11484j = aVar;
        this.f11485k = i10;
        this.f11486l = i11;
        this.f11487m = hVar;
        this.f11488n = pVar;
        this.f11478d = gVar;
        this.f11489o = list;
        this.f11479e = eVar;
        this.f11495u = kVar;
        this.f11490p = gVar2;
        this.f11491q = executor;
        this.f11496v = a.PENDING;
        if (this.C == null && dVar.i()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * ((float) i10));
    }

    public static <R> j<R> x(Context context, d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, h hVar, p<R> pVar, g<R> gVar, @o0 List<g<R>> list, e eVar, k kVar, g<? super R> gVar2, Executor executor) {
        return new j(context, dVar, obj, obj2, cls, aVar, i10, i11, hVar, pVar, gVar, list, eVar, kVar, gVar2, executor);
    }

    @z("requestLock")
    public final void A() {
        if (l()) {
            Drawable drawable = null;
            if (this.f11482h == null) {
                drawable = p();
            }
            if (drawable == null) {
                drawable = o();
            }
            if (drawable == null) {
                drawable = q();
            }
            this.f11488n.f(drawable);
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f11477c) {
            z10 = this.f11496v == a.COMPLETE;
        }
        return z10;
    }

    public void b(v<?> vVar, v3.a aVar) {
        this.f11476b.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f11477c) {
                try {
                    this.f11493s = null;
                    if (vVar == null) {
                        c(new q("Expected to receive a Resource<R> with an object of " + this.f11483i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    if (obj != null) {
                        if (this.f11483i.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                try {
                                    this.f11492r = null;
                                    this.f11496v = a.COMPLETE;
                                    this.f11495u.l(vVar);
                                    return;
                                } catch (Throwable th2) {
                                    vVar2 = vVar;
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                z(vVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.f11492r = null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected to receive an object of ");
                    sb2.append(this.f11483i);
                    sb2.append(" but instead got ");
                    sb2.append(obj != null ? obj.getClass() : "");
                    sb2.append(p7.a.f11638i);
                    sb2.append(obj);
                    sb2.append("} inside Resource{");
                    sb2.append(vVar);
                    sb2.append("}.");
                    sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    c(new q(sb2.toString()));
                    this.f11495u.l(vVar);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f11495u.l(vVar2);
            }
            throw th4;
        }
    }

    public void c(q qVar) {
        y(qVar, 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r5.f11495u.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11477c
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x0039 }
            u4.c r1 = r5.f11476b     // Catch:{ all -> 0x0039 }
            r1.c()     // Catch:{ all -> 0x0039 }
            p4.j$a r1 = r5.f11496v     // Catch:{ all -> 0x0039 }
            p4.j$a r2 = p4.j.a.CLEARED     // Catch:{ all -> 0x0039 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            r5.n()     // Catch:{ all -> 0x0039 }
            y3.v<R> r1 = r5.f11492r     // Catch:{ all -> 0x0039 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f11492r = r3     // Catch:{ all -> 0x0039 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            boolean r3 = r5.k()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x002e
            q4.p<R> r3 = r5.f11488n     // Catch:{ all -> 0x0039 }
            android.graphics.drawable.Drawable r4 = r5.q()     // Catch:{ all -> 0x0039 }
            r3.r(r4)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r5.f11496v = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0038
            y3.k r0 = r5.f11495u
            r0.l(r1)
        L_0x0038:
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.j.clear():void");
    }

    public void d(int i10, int i11) {
        Object obj;
        this.f11476b.c();
        Object obj2 = this.f11477c;
        synchronized (obj2) {
            try {
                boolean z10 = F;
                if (z10) {
                    t("Got onSizeReady in " + t4.g.a(this.f11494t));
                }
                if (this.f11496v == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.f11496v = aVar;
                    float Z = this.f11484j.Z();
                    this.f11500z = u(i10, Z);
                    this.A = u(i11, Z);
                    if (z10) {
                        t("finished setup for calling load in " + t4.g.a(this.f11494t));
                    }
                    a aVar2 = aVar;
                    boolean z11 = z10;
                    a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f11493s = this.f11495u.g(this.f11481g, this.f11482h, this.f11484j.Y(), this.f11500z, this.A, this.f11484j.X(), this.f11483i, this.f11487m, this.f11484j.L(), this.f11484j.b0(), this.f11484j.o0(), this.f11484j.j0(), this.f11484j.R(), this.f11484j.h0(), this.f11484j.d0(), this.f11484j.c0(), this.f11484j.Q(), this, this.f11491q);
                        if (this.f11496v != aVar3) {
                            this.f11493s = null;
                        }
                        if (z11) {
                            t("finished onSizeReady in " + t4.g.a(this.f11494t));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    public Object e() {
        this.f11476b.c();
        return this.f11477c;
    }

    public boolean f(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        h hVar2;
        int size2;
        d dVar2 = dVar;
        if (!(dVar2 instanceof j)) {
            return false;
        }
        synchronized (this.f11477c) {
            i10 = this.f11485k;
            i11 = this.f11486l;
            obj = this.f11482h;
            cls = this.f11483i;
            aVar = this.f11484j;
            hVar = this.f11487m;
            List<g<R>> list = this.f11489o;
            size = list != null ? list.size() : 0;
        }
        j jVar = (j) dVar2;
        synchronized (jVar.f11477c) {
            i12 = jVar.f11485k;
            i13 = jVar.f11486l;
            obj2 = jVar.f11482h;
            cls2 = jVar.f11483i;
            aVar2 = jVar.f11484j;
            hVar2 = jVar.f11487m;
            List<g<R>> list2 = jVar.f11489o;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && m.c(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && hVar == hVar2 && size == size2;
    }

    public boolean g() {
        boolean z10;
        synchronized (this.f11477c) {
            z10 = this.f11496v == a.CLEARED;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f11477c
            monitor-enter(r0)
            r5.j()     // Catch:{ all -> 0x00a7 }
            u4.c r1 = r5.f11476b     // Catch:{ all -> 0x00a7 }
            r1.c()     // Catch:{ all -> 0x00a7 }
            long r1 = t4.g.b()     // Catch:{ all -> 0x00a7 }
            r5.f11494t = r1     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r5.f11482h     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x003c
            int r1 = r5.f11485k     // Catch:{ all -> 0x00a7 }
            int r2 = r5.f11486l     // Catch:{ all -> 0x00a7 }
            boolean r1 = t4.m.v(r1, r2)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x0027
            int r1 = r5.f11485k     // Catch:{ all -> 0x00a7 }
            r5.f11500z = r1     // Catch:{ all -> 0x00a7 }
            int r1 = r5.f11486l     // Catch:{ all -> 0x00a7 }
            r5.A = r1     // Catch:{ all -> 0x00a7 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r5.p()     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            y3.q r2 = new y3.q     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            r5.y(r2, r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x003c:
            p4.j$a r1 = r5.f11496v     // Catch:{ all -> 0x00a7 }
            p4.j$a r2 = p4.j.a.RUNNING     // Catch:{ all -> 0x00a7 }
            if (r1 == r2) goto L_0x009f
            p4.j$a r3 = p4.j.a.COMPLETE     // Catch:{ all -> 0x00a7 }
            if (r1 != r3) goto L_0x004f
            y3.v<R> r1 = r5.f11492r     // Catch:{ all -> 0x00a7 }
            v3.a r2 = v3.a.MEMORY_CACHE     // Catch:{ all -> 0x00a7 }
            r5.b(r1, r2)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x004f:
            p4.j$a r1 = p4.j.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00a7 }
            r5.f11496v = r1     // Catch:{ all -> 0x00a7 }
            int r3 = r5.f11485k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f11486l     // Catch:{ all -> 0x00a7 }
            boolean r3 = t4.m.v(r3, r4)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0065
            int r3 = r5.f11485k     // Catch:{ all -> 0x00a7 }
            int r4 = r5.f11486l     // Catch:{ all -> 0x00a7 }
            r5.d(r3, r4)     // Catch:{ all -> 0x00a7 }
            goto L_0x006a
        L_0x0065:
            q4.p<R> r3 = r5.f11488n     // Catch:{ all -> 0x00a7 }
            r3.o(r5)     // Catch:{ all -> 0x00a7 }
        L_0x006a:
            p4.j$a r3 = r5.f11496v     // Catch:{ all -> 0x00a7 }
            if (r3 == r2) goto L_0x0070
            if (r3 != r1) goto L_0x007f
        L_0x0070:
            boolean r1 = r5.l()     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007f
            q4.p<R> r1 = r5.f11488n     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r2 = r5.q()     // Catch:{ all -> 0x00a7 }
            r1.l(r2)     // Catch:{ all -> 0x00a7 }
        L_0x007f:
            boolean r1 = F     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r1.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            long r2 = r5.f11494t     // Catch:{ all -> 0x00a7 }
            double r2 = t4.g.a(r2)     // Catch:{ all -> 0x00a7 }
            r1.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a7 }
            r5.t(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            return
        L_0x009f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.j.h():void");
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f11477c) {
            z10 = this.f11496v == a.COMPLETE;
        }
        return z10;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f11477c) {
            a aVar = this.f11496v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    @z("requestLock")
    public final void j() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @z("requestLock")
    public final boolean k() {
        e eVar = this.f11479e;
        return eVar == null || eVar.e(this);
    }

    @z("requestLock")
    public final boolean l() {
        e eVar = this.f11479e;
        return eVar == null || eVar.b(this);
    }

    @z("requestLock")
    public final boolean m() {
        e eVar = this.f11479e;
        return eVar == null || eVar.d(this);
    }

    @z("requestLock")
    public final void n() {
        j();
        this.f11476b.c();
        this.f11488n.e(this);
        k.d dVar = this.f11493s;
        if (dVar != null) {
            dVar.a();
            this.f11493s = null;
        }
    }

    @z("requestLock")
    public final Drawable o() {
        if (this.f11497w == null) {
            Drawable N = this.f11484j.N();
            this.f11497w = N;
            if (N == null && this.f11484j.M() > 0) {
                this.f11497w = s(this.f11484j.M());
            }
        }
        return this.f11497w;
    }

    @z("requestLock")
    public final Drawable p() {
        if (this.f11499y == null) {
            Drawable O = this.f11484j.O();
            this.f11499y = O;
            if (O == null && this.f11484j.P() > 0) {
                this.f11499y = s(this.f11484j.P());
            }
        }
        return this.f11499y;
    }

    public void pause() {
        synchronized (this.f11477c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @z("requestLock")
    public final Drawable q() {
        if (this.f11498x == null) {
            Drawable U = this.f11484j.U();
            this.f11498x = U;
            if (U == null && this.f11484j.V() > 0) {
                this.f11498x = s(this.f11484j.V());
            }
        }
        return this.f11498x;
    }

    @z("requestLock")
    public final boolean r() {
        e eVar = this.f11479e;
        return eVar == null || !eVar.getRoot().a();
    }

    @z("requestLock")
    public final Drawable s(@u int i10) {
        return i4.a.a(this.f11481g, i10, this.f11484j.a0() != null ? this.f11484j.a0() : this.f11480f.getTheme());
    }

    public final void t(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" this: ");
        sb2.append(this.f11475a);
    }

    @z("requestLock")
    public final void v() {
        e eVar = this.f11479e;
        if (eVar != null) {
            eVar.j(this);
        }
    }

    @z("requestLock")
    public final void w() {
        e eVar = this.f11479e;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void y(q qVar, int i10) {
        boolean z10;
        this.f11476b.c();
        synchronized (this.f11477c) {
            qVar.l(this.C);
            int g10 = this.f11481g.g();
            if (g10 <= i10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Load failed for ");
                sb2.append(this.f11482h);
                sb2.append(" with size [");
                sb2.append(this.f11500z);
                sb2.append("x");
                sb2.append(this.A);
                sb2.append("]");
                if (g10 <= 4) {
                    qVar.h("Glide");
                }
            }
            this.f11493s = null;
            this.f11496v = a.FAILED;
            boolean z11 = true;
            this.B = true;
            try {
                List<g<R>> list = this.f11489o;
                if (list != null) {
                    z10 = false;
                    for (g<R> c10 : list) {
                        z10 |= c10.c(qVar, this.f11482h, this.f11488n, r());
                    }
                } else {
                    z10 = false;
                }
                g<R> gVar = this.f11478d;
                if (gVar == null || !gVar.c(qVar, this.f11482h, this.f11488n, r())) {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    A();
                }
                this.B = false;
                v();
            } catch (Throwable th2) {
                this.B = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e A[Catch:{ all -> 0x00af }] */
    @d.z("requestLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(y3.v<R> r11, R r12, v3.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.r()
            p4.j$a r0 = p4.j.a.COMPLETE
            r10.f11496v = r0
            r10.f11492r = r11
            com.bumptech.glide.d r11 = r10.f11481g
            int r11 = r11.g()
            r0 = 3
            if (r11 > r0) goto L_0x0061
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f11482h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f11500z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f11494t
            double r0 = t4.g.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
        L_0x0061:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<p4.g<R>> r0 = r10.f11489o     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0087
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00af }
            r9 = r7
        L_0x006e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00af }
            p4.g r0 = (p4.g) r0     // Catch:{ all -> 0x00af }
            java.lang.Object r2 = r10.f11482h     // Catch:{ all -> 0x00af }
            q4.p<R> r3 = r10.f11488n     // Catch:{ all -> 0x00af }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.d(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
            r9 = r9 | r0
            goto L_0x006e
        L_0x0087:
            r9 = r7
        L_0x0088:
            p4.g<R> r0 = r10.f11478d     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r2 = r10.f11482h     // Catch:{ all -> 0x00af }
            q4.p<R> r3 = r10.f11488n     // Catch:{ all -> 0x00af }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.d(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r11 = r7
        L_0x009b:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00a9
            r4.g<? super R> r11 = r10.f11490p     // Catch:{ all -> 0x00af }
            r4.f r11 = r11.a(r13, r6)     // Catch:{ all -> 0x00af }
            q4.p<R> r13 = r10.f11488n     // Catch:{ all -> 0x00af }
            r13.s(r12, r11)     // Catch:{ all -> 0x00af }
        L_0x00a9:
            r10.B = r7
            r10.w()
            return
        L_0x00af:
            r11 = move-exception
            r10.B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.j.z(y3.v, java.lang.Object, v3.a):void");
    }
}

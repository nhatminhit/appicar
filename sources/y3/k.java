package y3;

import a4.a;
import a4.j;
import android.util.Log;
import d.g1;
import d.m0;
import d.o0;
import e1.m;
import java.util.Map;
import java.util.concurrent.Executor;
import t4.e;
import t4.g;
import u4.a;
import v3.f;
import v3.i;
import y3.h;
import y3.p;

public class k implements m, j.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    public static final String f15397i = "Engine";

    /* renamed from: j  reason: collision with root package name */
    public static final int f15398j = 150;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f15399k = Log.isLoggable(f15397i, 2);

    /* renamed from: a  reason: collision with root package name */
    public final s f15400a;

    /* renamed from: b  reason: collision with root package name */
    public final o f15401b;

    /* renamed from: c  reason: collision with root package name */
    public final j f15402c;

    /* renamed from: d  reason: collision with root package name */
    public final b f15403d;

    /* renamed from: e  reason: collision with root package name */
    public final y f15404e;

    /* renamed from: f  reason: collision with root package name */
    public final c f15405f;

    /* renamed from: g  reason: collision with root package name */
    public final a f15406g;

    /* renamed from: h  reason: collision with root package name */
    public final a f15407h;

    @g1
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final h.e f15408a;

        /* renamed from: b  reason: collision with root package name */
        public final m.a<h<?>> f15409b = u4.a.e(150, new C0249a());

        /* renamed from: c  reason: collision with root package name */
        public int f15410c;

        /* renamed from: y3.k$a$a  reason: collision with other inner class name */
        public class C0249a implements a.d<h<?>> {
            public C0249a() {
            }

            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f15408a, aVar.f15409b);
            }
        }

        public a(h.e eVar) {
            this.f15408a = eVar;
        }

        public <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, v3.m<?>> map, boolean z10, boolean z11, boolean z12, i iVar, h.b<R> bVar) {
            h hVar2 = (h) t4.k.d(this.f15409b.b());
            int i12 = this.f15410c;
            int i13 = i12;
            this.f15410c = i12 + 1;
            return hVar2.r(dVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z12, iVar, bVar, i13);
        }
    }

    @g1
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final b4.a f15412a;

        /* renamed from: b  reason: collision with root package name */
        public final b4.a f15413b;

        /* renamed from: c  reason: collision with root package name */
        public final b4.a f15414c;

        /* renamed from: d  reason: collision with root package name */
        public final b4.a f15415d;

        /* renamed from: e  reason: collision with root package name */
        public final m f15416e;

        /* renamed from: f  reason: collision with root package name */
        public final p.a f15417f;

        /* renamed from: g  reason: collision with root package name */
        public final m.a<l<?>> f15418g = u4.a.e(150, new a());

        public class a implements a.d<l<?>> {
            public a() {
            }

            /* renamed from: b */
            public l<?> a() {
                b bVar = b.this;
                return new l(bVar.f15412a, bVar.f15413b, bVar.f15414c, bVar.f15415d, bVar.f15416e, bVar.f15417f, bVar.f15418g);
            }
        }

        public b(b4.a aVar, b4.a aVar2, b4.a aVar3, b4.a aVar4, m mVar, p.a aVar5) {
            this.f15412a = aVar;
            this.f15413b = aVar2;
            this.f15414c = aVar3;
            this.f15415d = aVar4;
            this.f15416e = mVar;
            this.f15417f = aVar5;
        }

        public <R> l<R> a(f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) t4.k.d(this.f15418g.b())).l(fVar, z10, z11, z12, z13);
        }

        @g1
        public void b() {
            e.c(this.f15412a);
            e.c(this.f15413b);
            e.c(this.f15414c);
            e.c(this.f15415d);
        }
    }

    public static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0004a f15420a;

        /* renamed from: b  reason: collision with root package name */
        public volatile a4.a f15421b;

        public c(a.C0004a aVar) {
            this.f15420a = aVar;
        }

        public a4.a a() {
            if (this.f15421b == null) {
                synchronized (this) {
                    if (this.f15421b == null) {
                        this.f15421b = this.f15420a.build();
                    }
                    if (this.f15421b == null) {
                        this.f15421b = new a4.b();
                    }
                }
            }
            return this.f15421b;
        }

        @g1
        public synchronized void b() {
            if (this.f15421b != null) {
                this.f15421b.clear();
            }
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final l<?> f15422a;

        /* renamed from: b  reason: collision with root package name */
        public final p4.i f15423b;

        public d(p4.i iVar, l<?> lVar) {
            this.f15423b = iVar;
            this.f15422a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f15422a.s(this.f15423b);
            }
        }
    }

    @g1
    public k(j jVar, a.C0004a aVar, b4.a aVar2, b4.a aVar3, b4.a aVar4, b4.a aVar5, s sVar, o oVar, a aVar6, b bVar, a aVar7, y yVar, boolean z10) {
        this.f15402c = jVar;
        a.C0004a aVar8 = aVar;
        c cVar = new c(aVar);
        this.f15405f = cVar;
        a aVar9 = aVar6 == null ? new a(z10) : aVar6;
        this.f15407h = aVar9;
        aVar9.g(this);
        this.f15401b = oVar == null ? new o() : oVar;
        this.f15400a = sVar == null ? new s() : sVar;
        this.f15403d = bVar == null ? new b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f15406g = aVar7 == null ? new a(cVar) : aVar7;
        this.f15404e = yVar == null ? new y() : yVar;
        jVar.h(this);
    }

    public k(j jVar, a.C0004a aVar, b4.a aVar2, b4.a aVar3, b4.a aVar4, b4.a aVar5, boolean z10) {
        this(jVar, aVar, aVar2, aVar3, aVar4, aVar5, (s) null, (o) null, (a) null, (b) null, (a) null, (y) null, z10);
    }

    public static void k(String str, long j10, f fVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(g.a(j10));
        sb2.append("ms, key: ");
        sb2.append(fVar);
    }

    public synchronized void a(l<?> lVar, f fVar) {
        this.f15400a.e(fVar, lVar);
    }

    public void b(@m0 v<?> vVar) {
        this.f15404e.a(vVar, true);
    }

    public void c(f fVar, p<?> pVar) {
        this.f15407h.d(fVar);
        if (pVar.f()) {
            this.f15402c.g(fVar, pVar);
        } else {
            this.f15404e.a(pVar, false);
        }
    }

    public synchronized void d(l<?> lVar, f fVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.f()) {
                this.f15407h.a(fVar, pVar);
            }
        }
        this.f15400a.e(fVar, lVar);
    }

    public void e() {
        this.f15405f.a().clear();
    }

    public final p<?> f(f fVar) {
        v<?> f10 = this.f15402c.f(fVar);
        if (f10 == null) {
            return null;
        }
        return f10 instanceof p ? (p) f10 : new p<>(f10, true, true, fVar, this);
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, v3.m<?>> map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, p4.i iVar2, Executor executor) {
        long b10 = f15399k ? g.b() : 0;
        n a10 = this.f15401b.a(obj, fVar, i10, i11, map, cls, cls2, iVar);
        synchronized (this) {
            p<?> j10 = j(a10, z12, b10);
            if (j10 == null) {
                d n10 = n(dVar, obj, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, iVar, z12, z13, z14, z15, iVar2, executor, a10, b10);
                return n10;
            }
            iVar2.b(j10, v3.a.MEMORY_CACHE);
            return null;
        }
    }

    @o0
    public final p<?> h(f fVar) {
        p<?> e10 = this.f15407h.e(fVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    public final p<?> i(f fVar) {
        p<?> f10 = f(fVar);
        if (f10 != null) {
            f10.b();
            this.f15407h.a(fVar, f10);
        }
        return f10;
    }

    @o0
    public final p<?> j(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p<?> h10 = h(nVar);
        if (h10 != null) {
            if (f15399k) {
                k("Loaded resource from active resources", j10, nVar);
            }
            return h10;
        }
        p<?> i10 = i(nVar);
        if (i10 == null) {
            return null;
        }
        if (f15399k) {
            k("Loaded resource from cache", j10, nVar);
        }
        return i10;
    }

    public void l(v<?> vVar) {
        if (vVar instanceof p) {
            ((p) vVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @g1
    public void m() {
        this.f15403d.b();
        this.f15405f.b();
        this.f15407h.h();
    }

    public final <R> d n(com.bumptech.glide.d dVar, Object obj, f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, j jVar, Map<Class<?>, v3.m<?>> map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, p4.i iVar2, Executor executor, n nVar, long j10) {
        p4.i iVar3 = iVar2;
        Executor executor2 = executor;
        n nVar2 = nVar;
        long j11 = j10;
        l<?> a10 = this.f15400a.a(nVar2, z15);
        if (a10 != null) {
            a10.d(iVar3, executor2);
            if (f15399k) {
                k("Added to existing load", j11, nVar2);
            }
            return new d(iVar3, a10);
        }
        l a11 = this.f15403d.a(nVar, z12, z13, z14, z15);
        l lVar = a11;
        n nVar3 = nVar2;
        h<R> a12 = this.f15406g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, hVar, jVar, map, z10, z11, z15, iVar, a11);
        this.f15400a.d(nVar3, lVar);
        l lVar2 = lVar;
        n nVar4 = nVar3;
        p4.i iVar4 = iVar2;
        lVar2.d(iVar4, executor);
        lVar2.t(a12);
        if (f15399k) {
            k("Started new load", j10, nVar4);
        }
        return new d(iVar4, lVar2);
    }
}

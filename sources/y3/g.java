package y3;

import a4.a;
import com.bumptech.glide.d;
import com.bumptech.glide.j;
import d4.n;
import f4.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v3.f;
import v3.i;
import v3.l;
import v3.m;
import y3.h;
import z3.b;

public final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n.a<?>> f15337a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<f> f15338b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f15339c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15340d;

    /* renamed from: e  reason: collision with root package name */
    public int f15341e;

    /* renamed from: f  reason: collision with root package name */
    public int f15342f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f15343g;

    /* renamed from: h  reason: collision with root package name */
    public h.e f15344h;

    /* renamed from: i  reason: collision with root package name */
    public i f15345i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, m<?>> f15346j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f15347k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15348l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15349m;

    /* renamed from: n  reason: collision with root package name */
    public f f15350n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.h f15351o;

    /* renamed from: p  reason: collision with root package name */
    public j f15352p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15353q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15354r;

    public void a() {
        this.f15339c = null;
        this.f15340d = null;
        this.f15350n = null;
        this.f15343g = null;
        this.f15347k = null;
        this.f15345i = null;
        this.f15351o = null;
        this.f15346j = null;
        this.f15352p = null;
        this.f15337a.clear();
        this.f15348l = false;
        this.f15338b.clear();
        this.f15349m = false;
    }

    public b b() {
        return this.f15339c.b();
    }

    public List<f> c() {
        if (!this.f15349m) {
            this.f15349m = true;
            this.f15338b.clear();
            List<n.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = g10.get(i10);
                if (!this.f15338b.contains(aVar.f6052a)) {
                    this.f15338b.add(aVar.f6052a);
                }
                for (int i11 = 0; i11 < aVar.f6053b.size(); i11++) {
                    if (!this.f15338b.contains(aVar.f6053b.get(i11))) {
                        this.f15338b.add(aVar.f6053b.get(i11));
                    }
                }
            }
        }
        return this.f15338b;
    }

    public a d() {
        return this.f15344h.a();
    }

    public j e() {
        return this.f15352p;
    }

    public int f() {
        return this.f15342f;
    }

    public List<n.a<?>> g() {
        if (!this.f15348l) {
            this.f15348l = true;
            this.f15337a.clear();
            List i10 = this.f15339c.h().i(this.f15340d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a b10 = ((n) i10.get(i11)).b(this.f15340d, this.f15341e, this.f15342f, this.f15345i);
                if (b10 != null) {
                    this.f15337a.add(b10);
                }
            }
        }
        return this.f15337a;
    }

    public <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f15339c.h().h(cls, this.f15343g, this.f15347k);
    }

    public Class<?> i() {
        return this.f15340d.getClass();
    }

    public List<n<File, ?>> j(File file) throws j.c {
        return this.f15339c.h().i(file);
    }

    public i k() {
        return this.f15345i;
    }

    public com.bumptech.glide.h l() {
        return this.f15351o;
    }

    public List<Class<?>> m() {
        return this.f15339c.h().j(this.f15340d.getClass(), this.f15343g, this.f15347k);
    }

    public <Z> l<Z> n(v<Z> vVar) {
        return this.f15339c.h().k(vVar);
    }

    public f o() {
        return this.f15350n;
    }

    public <X> v3.d<X> p(X x10) throws j.e {
        return this.f15339c.h().m(x10);
    }

    public Class<?> q() {
        return this.f15347k;
    }

    public <Z> m<Z> r(Class<Z> cls) {
        m<Z> mVar = this.f15346j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, m<?>>> it = this.f15346j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f15346j.isEmpty() || !this.f15353q) {
            return c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int s() {
        return this.f15341e;
    }

    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    public <R> void u(d dVar, Object obj, f fVar, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, i iVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f15339c = dVar;
        this.f15340d = obj;
        this.f15350n = fVar;
        this.f15341e = i10;
        this.f15342f = i11;
        this.f15352p = jVar;
        this.f15343g = cls;
        this.f15344h = eVar;
        this.f15347k = cls2;
        this.f15351o = hVar;
        this.f15345i = iVar;
        this.f15346j = map;
        this.f15353q = z10;
        this.f15354r = z11;
    }

    public boolean v(v<?> vVar) {
        return this.f15339c.h().n(vVar);
    }

    public boolean w() {
        return this.f15354r;
    }

    public boolean x(f fVar) {
        List<n.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f6052a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}

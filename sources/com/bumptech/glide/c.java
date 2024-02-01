package com.bumptech.glide;

import a4.a;
import a4.i;
import a4.j;
import a4.l;
import android.content.Context;
import com.bumptech.glide.b;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m4.d;
import m4.f;
import m4.l;
import p4.g;
import p4.h;
import y3.k;
import z3.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, m<?, ?>> f4926a = new androidx.collection.a();

    /* renamed from: b  reason: collision with root package name */
    public k f4927b;

    /* renamed from: c  reason: collision with root package name */
    public e f4928c;

    /* renamed from: d  reason: collision with root package name */
    public z3.b f4929d;

    /* renamed from: e  reason: collision with root package name */
    public j f4930e;

    /* renamed from: f  reason: collision with root package name */
    public b4.a f4931f;

    /* renamed from: g  reason: collision with root package name */
    public b4.a f4932g;

    /* renamed from: h  reason: collision with root package name */
    public a.C0004a f4933h;

    /* renamed from: i  reason: collision with root package name */
    public l f4934i;

    /* renamed from: j  reason: collision with root package name */
    public d f4935j;

    /* renamed from: k  reason: collision with root package name */
    public int f4936k = 4;

    /* renamed from: l  reason: collision with root package name */
    public b.a f4937l = new a();
    @o0

    /* renamed from: m  reason: collision with root package name */
    public l.b f4938m;

    /* renamed from: n  reason: collision with root package name */
    public b4.a f4939n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4940o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public List<g<Object>> f4941p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4942q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4943r;

    public class a implements b.a {
        public a() {
        }

        @m0
        public h build() {
            return new h();
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f4945a;

        public b(h hVar) {
            this.f4945a = hVar;
        }

        @m0
        public h build() {
            h hVar = this.f4945a;
            return hVar != null ? hVar : new h();
        }
    }

    @m0
    public c a(@m0 g<Object> gVar) {
        if (this.f4941p == null) {
            this.f4941p = new ArrayList();
        }
        this.f4941p.add(gVar);
        return this;
    }

    @m0
    public b b(@m0 Context context) {
        Context context2 = context;
        if (this.f4931f == null) {
            this.f4931f = b4.a.j();
        }
        if (this.f4932g == null) {
            this.f4932g = b4.a.f();
        }
        if (this.f4939n == null) {
            this.f4939n = b4.a.c();
        }
        if (this.f4934i == null) {
            this.f4934i = new l.a(context2).a();
        }
        if (this.f4935j == null) {
            this.f4935j = new f();
        }
        if (this.f4928c == null) {
            int b10 = this.f4934i.b();
            if (b10 > 0) {
                this.f4928c = new z3.k((long) b10);
            } else {
                this.f4928c = new z3.f();
            }
        }
        if (this.f4929d == null) {
            this.f4929d = new z3.j(this.f4934i.a());
        }
        if (this.f4930e == null) {
            this.f4930e = new i((long) this.f4934i.d());
        }
        if (this.f4933h == null) {
            this.f4933h = new a4.h(context2);
        }
        if (this.f4927b == null) {
            this.f4927b = new k(this.f4930e, this.f4933h, this.f4932g, this.f4931f, b4.a.m(), this.f4939n, this.f4940o);
        }
        List<g<Object>> list = this.f4941p;
        this.f4941p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new b(context, this.f4927b, this.f4930e, this.f4928c, this.f4929d, new m4.l(this.f4938m), this.f4935j, this.f4936k, this.f4937l, this.f4926a, this.f4941p, this.f4942q, this.f4943r);
    }

    @m0
    public c c(@o0 b4.a aVar) {
        this.f4939n = aVar;
        return this;
    }

    @m0
    public c d(@o0 z3.b bVar) {
        this.f4929d = bVar;
        return this;
    }

    @m0
    public c e(@o0 e eVar) {
        this.f4928c = eVar;
        return this;
    }

    @m0
    public c f(@o0 d dVar) {
        this.f4935j = dVar;
        return this;
    }

    @m0
    public c g(@m0 b.a aVar) {
        this.f4937l = (b.a) t4.k.d(aVar);
        return this;
    }

    @m0
    public c h(@o0 h hVar) {
        return g(new b(hVar));
    }

    @m0
    public <T> c i(@m0 Class<T> cls, @o0 m<?, T> mVar) {
        this.f4926a.put(cls, mVar);
        return this;
    }

    @m0
    public c j(@o0 a.C0004a aVar) {
        this.f4933h = aVar;
        return this;
    }

    @m0
    public c k(@o0 b4.a aVar) {
        this.f4932g = aVar;
        return this;
    }

    public c l(k kVar) {
        this.f4927b = kVar;
        return this;
    }

    public c m(boolean z10) {
        if (!x0.a.g()) {
            return this;
        }
        this.f4943r = z10;
        return this;
    }

    @m0
    public c n(boolean z10) {
        this.f4940o = z10;
        return this;
    }

    @m0
    public c o(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f4936k = i10;
        return this;
    }

    public c p(boolean z10) {
        this.f4942q = z10;
        return this;
    }

    @m0
    public c q(@o0 j jVar) {
        this.f4930e = jVar;
        return this;
    }

    @m0
    public c r(@m0 l.a aVar) {
        return s(aVar.a());
    }

    @m0
    public c s(@o0 a4.l lVar) {
        this.f4934i = lVar;
        return this;
    }

    public void t(@o0 l.b bVar) {
        this.f4938m = bVar;
    }

    @Deprecated
    public c u(@o0 b4.a aVar) {
        return v(aVar);
    }

    @m0
    public c v(@o0 b4.a aVar) {
        this.f4931f = aVar;
        return this;
    }
}

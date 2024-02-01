package d4;

import com.bumptech.glide.j;
import d.m0;
import d.o0;
import e1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final r f6055a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6056b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, C0103a<?>> f6057a = new HashMap();

        /* renamed from: d4.p$a$a  reason: collision with other inner class name */
        public static class C0103a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<n<Model, ?>> f6058a;

            public C0103a(List<n<Model, ?>> list) {
                this.f6058a = list;
            }
        }

        public void a() {
            this.f6057a.clear();
        }

        @o0
        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0103a aVar = this.f6057a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f6058a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f6057a.put(cls, new C0103a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public p(@m0 r rVar) {
        this.f6056b = new a();
        this.f6055a = rVar;
    }

    public p(@m0 m.a<List<Throwable>> aVar) {
        this(new r(aVar));
    }

    @m0
    public static <A> Class<A> c(@m0 A a10) {
        return a10.getClass();
    }

    public synchronized <Model, Data> void a(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        this.f6055a.b(cls, cls2, oVar);
        this.f6056b.a();
    }

    public synchronized <Model, Data> n<Model, Data> b(@m0 Class<Model> cls, @m0 Class<Data> cls2) {
        return this.f6055a.d(cls, cls2);
    }

    @m0
    public synchronized List<Class<?>> d(@m0 Class<?> cls) {
        return this.f6055a.g(cls);
    }

    @m0
    public <A> List<n<A, ?>> e(@m0 A a10) {
        List f10 = f(c(a10));
        if (!f10.isEmpty()) {
            int size = f10.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) f10.get(i10);
                if (nVar.a(a10)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new j.c(a10, f10);
        }
        throw new j.c(a10);
    }

    @m0
    public final synchronized <A> List<n<A, ?>> f(@m0 Class<A> cls) {
        List<n<A, ?>> b10;
        b10 = this.f6056b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f6055a.e(cls));
            this.f6056b.c(cls, b10);
        }
        return b10;
    }

    public synchronized <Model, Data> void g(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        this.f6055a.i(cls, cls2, oVar);
        this.f6056b.a();
    }

    public synchronized <Model, Data> void h(@m0 Class<Model> cls, @m0 Class<Data> cls2) {
        j(this.f6055a.j(cls, cls2));
        this.f6056b.a();
    }

    public synchronized <Model, Data> void i(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        j(this.f6055a.k(cls, cls2, oVar));
        this.f6056b.a();
    }

    public final <Model, Data> void j(@m0 List<o<? extends Model, ? extends Data>> list) {
        for (o<? extends Model, ? extends Data> b10 : list) {
            b10.b();
        }
    }
}

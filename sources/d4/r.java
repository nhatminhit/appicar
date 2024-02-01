package d4;

import com.bumptech.glide.j;
import d.g1;
import d.m0;
import d.o0;
import d4.n;
import e1.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t4.k;
import v3.i;

public class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f6061e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final n<Object, Object> f6062f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?, ?>> f6063a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6064b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b<?, ?>> f6065c;

    /* renamed from: d  reason: collision with root package name */
    public final m.a<List<Throwable>> f6066d;

    public static class a implements n<Object, Object> {
        public boolean a(@m0 Object obj) {
            return false;
        }

        @o0
        public n.a<Object> b(@m0 Object obj, int i10, int i11, @m0 i iVar) {
            return null;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f6067a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f6068b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f6069c;

        public b(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
            this.f6067a = cls;
            this.f6068b = cls2;
            this.f6069c = oVar;
        }

        public boolean a(@m0 Class<?> cls) {
            return this.f6067a.isAssignableFrom(cls);
        }

        public boolean b(@m0 Class<?> cls, @m0 Class<?> cls2) {
            return a(cls) && this.f6068b.isAssignableFrom(cls2);
        }
    }

    public static class c {
        @m0
        public <Model, Data> q<Model, Data> a(@m0 List<n<Model, Data>> list, @m0 m.a<List<Throwable>> aVar) {
            return new q<>(list, aVar);
        }
    }

    public r(@m0 m.a<List<Throwable>> aVar) {
        this(aVar, f6061e);
    }

    @g1
    public r(@m0 m.a<List<Throwable>> aVar, @m0 c cVar) {
        this.f6063a = new ArrayList();
        this.f6065c = new HashSet();
        this.f6066d = aVar;
        this.f6064b = cVar;
    }

    @m0
    public static <Model, Data> n<Model, Data> f() {
        return f6062f;
    }

    public final <Model, Data> void a(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List<b<?, ?>> list = this.f6063a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    @m0
    public final <Model, Data> n<Model, Data> c(@m0 b<?, ?> bVar) {
        return (n) k.d(bVar.f6069c.a(this));
    }

    @m0
    public synchronized <Model, Data> n<Model, Data> d(@m0 Class<Model> cls, @m0 Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b next : this.f6063a) {
                if (this.f6065c.contains(next)) {
                    z10 = true;
                } else if (next.b(cls, cls2)) {
                    this.f6065c.add(next);
                    arrayList.add(c(next));
                    this.f6065c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f6064b.a(arrayList, this.f6066d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new j.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f6065c.clear();
            throw th2;
        }
    }

    @m0
    public synchronized <Model> List<n<Model, ?>> e(@m0 Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.f6063a) {
                if (!this.f6065c.contains(next)) {
                    if (next.a(cls)) {
                        this.f6065c.add(next);
                        arrayList.add(c(next));
                        this.f6065c.remove(next);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f6065c.clear();
            throw th2;
        }
        return arrayList;
    }

    @m0
    public synchronized List<Class<?>> g(@m0 Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.f6063a) {
            if (!arrayList.contains(next.f6068b) && next.a(cls)) {
                arrayList.add(next.f6068b);
            }
        }
        return arrayList;
    }

    @m0
    public final <Model, Data> o<Model, Data> h(@m0 b<?, ?> bVar) {
        return bVar.f6069c;
    }

    public synchronized <Model, Data> void i(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, false);
    }

    @m0
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(@m0 Class<Model> cls, @m0 Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f6063a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    @m0
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> k(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> j10;
        j10 = j(cls, cls2);
        b(cls, cls2, oVar);
        return j10;
    }
}

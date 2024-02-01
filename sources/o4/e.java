package o4;

import d.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v3.k;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f11061a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f11062b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f11063a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f11064b;

        /* renamed from: c  reason: collision with root package name */
        public final k<T, R> f11065c;

        public a(@m0 Class<T> cls, @m0 Class<R> cls2, k<T, R> kVar) {
            this.f11063a = cls;
            this.f11064b = cls2;
            this.f11065c = kVar;
        }

        public boolean a(@m0 Class<?> cls, @m0 Class<?> cls2) {
            return this.f11063a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11064b);
        }
    }

    public synchronized <T, R> void a(@m0 String str, @m0 k<T, R> kVar, @m0 Class<T> cls, @m0 Class<R> cls2) {
        c(str).add(new a(cls, cls2, kVar));
    }

    @m0
    public synchronized <T, R> List<k<T, R>> b(@m0 Class<T> cls, @m0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11061a) {
            List<a> list = this.f11062b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f11065c);
                    }
                }
            }
        }
        return arrayList;
    }

    @m0
    public final synchronized List<a<?, ?>> c(@m0 String str) {
        List<a<?, ?>> list;
        if (!this.f11061a.contains(str)) {
            this.f11061a.add(str);
        }
        list = this.f11062b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11062b.put(str, list);
        }
        return list;
    }

    @m0
    public synchronized <T, R> List<Class<R>> d(@m0 Class<T> cls, @m0 Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f11061a) {
            List<a> list = this.f11062b.get(str);
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f11064b)) {
                        arrayList.add(aVar.f11064b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@m0 String str, @m0 k<T, R> kVar, @m0 Class<T> cls, @m0 Class<R> cls2) {
        c(str).add(0, new a(cls, cls2, kVar));
    }

    public synchronized void f(@m0 List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f11061a);
        this.f11061a.clear();
        for (String add : list) {
            this.f11061a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f11061a.add(str);
            }
        }
    }
}

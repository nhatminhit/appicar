package z3;

import d.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z3.m;

public class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f15802a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f15803b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f15804a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f15805b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f15806c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f15807d;

        public a() {
            this((Object) null);
        }

        public a(K k10) {
            this.f15807d = this;
            this.f15806c = this;
            this.f15804a = k10;
        }

        public void a(V v10) {
            if (this.f15805b == null) {
                this.f15805b = new ArrayList();
            }
            this.f15805b.add(v10);
        }

        @o0
        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f15805b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f15805b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f15807d;
        aVar2.f15806c = aVar.f15806c;
        aVar.f15806c.f15807d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f15806c.f15807d = aVar;
        aVar.f15807d.f15806c = aVar;
    }

    @o0
    public V a(K k10) {
        a aVar = this.f15803b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            this.f15803b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f15802a;
        aVar.f15807d = aVar2;
        aVar.f15806c = aVar2.f15806c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f15802a;
        aVar.f15807d = aVar2.f15807d;
        aVar.f15806c = aVar2;
        g(aVar);
    }

    public void d(K k10, V v10) {
        a aVar = this.f15803b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            c(aVar);
            this.f15803b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    @o0
    public V f() {
        a<K, V> aVar = this.f15802a;
        while (true) {
            aVar = aVar.f15807d;
            if (aVar.equals(this.f15802a)) {
                return null;
            }
            V b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f15803b.remove(aVar.f15804a);
            ((m) aVar.f15804a).a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a<K, V> aVar = this.f15802a.f15806c; !aVar.equals(this.f15802a); aVar = aVar.f15806c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f15804a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}

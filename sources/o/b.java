package o;

import d.m0;
import d.o0;
import d.x0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import w7.l;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> O;
    public c<K, V> P;
    public final WeakHashMap<f<K, V>, Boolean> Q = new WeakHashMap<>();
    public int R = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.R;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.Q;
        }
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    public static class C0187b<K, V> extends e<K, V> {
        public C0187b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.Q;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.R;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {
        @m0
        public final K O;
        @m0
        public final V P;
        public c<K, V> Q;
        public c<K, V> R;

        public c(@m0 K k10, @m0 V v10) {
            this.O = k10;
            this.P = v10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.O.equals(cVar.O) && this.P.equals(cVar.P);
        }

        @m0
        public K getKey() {
            return this.O;
        }

        @m0
        public V getValue() {
            return this.P;
        }

        public int hashCode() {
            return this.O.hashCode() ^ this.P.hashCode();
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.O + l.f14755k + this.P;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> O;
        public boolean P = true;

        public d() {
        }

        public void a(@m0 c<K, V> cVar) {
            c<K, V> cVar2 = this.O;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.R;
                this.O = cVar3;
                this.P = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.P) {
                this.P = false;
                cVar = b.this.O;
            } else {
                c<K, V> cVar2 = this.O;
                cVar = cVar2 != null ? cVar2.Q : null;
            }
            this.O = cVar;
            return this.O;
        }

        public boolean hasNext() {
            if (this.P) {
                return b.this.O != null;
            }
            c<K, V> cVar = this.O;
            return (cVar == null || cVar.Q == null) ? false : true;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        public c<K, V> O;
        public c<K, V> P;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.O = cVar2;
            this.P = cVar;
        }

        public void a(@m0 c<K, V> cVar) {
            if (this.O == cVar && cVar == this.P) {
                this.P = null;
                this.O = null;
            }
            c<K, V> cVar2 = this.O;
            if (cVar2 == cVar) {
                this.O = b(cVar2);
            }
            if (this.P == cVar) {
                this.P = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.P;
            this.P = e();
            return cVar;
        }

        public final c<K, V> e() {
            c<K, V> cVar = this.P;
            c<K, V> cVar2 = this.O;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public boolean hasNext() {
            return this.P != null;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        public abstract void a(@m0 c<K, V> cVar);
    }

    @o0
    public Map.Entry<K, V> b() {
        return this.O;
    }

    @o0
    public c<K, V> c(K k10) {
        c<K, V> cVar = this.O;
        while (cVar != null && !cVar.O.equals(k10)) {
            cVar = cVar.Q;
        }
        return cVar;
    }

    @m0
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0187b bVar = new C0187b(this.P, this.O);
        this.Q.put(bVar, Boolean.FALSE);
        return bVar;
    }

    @m0
    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.Q.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    @o0
    public Map.Entry<K, V> f() {
        return this.P;
    }

    public c<K, V> h(@m0 K k10, @m0 V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.R++;
        c<K, V> cVar2 = this.P;
        if (cVar2 == null) {
            this.O = cVar;
        } else {
            cVar2.Q = cVar;
            cVar.R = cVar2;
        }
        this.P = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    public V i(@m0 K k10, @m0 V v10) {
        c c10 = c(k10);
        if (c10 != null) {
            return c10.P;
        }
        h(k10, v10);
        return null;
    }

    @m0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.O, this.P);
        this.Q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(@m0 K k10) {
        c c10 = c(k10);
        if (c10 == null) {
            return null;
        }
        this.R--;
        if (!this.Q.isEmpty()) {
            for (f<K, V> a10 : this.Q.keySet()) {
                a10.a(c10);
            }
        }
        c<K, V> cVar = c10.R;
        c<K, V> cVar2 = c10.Q;
        if (cVar != null) {
            cVar.Q = cVar2;
        } else {
            this.O = cVar2;
        }
        c<K, V> cVar3 = c10.Q;
        if (cVar3 != null) {
            cVar3.R = cVar;
        } else {
            this.P = cVar;
        }
        c10.Q = null;
        c10.R = null;
        return c10.P;
    }

    public int size() {
        return this.R;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}

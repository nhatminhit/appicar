package be;

import fh.g;
import fh.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import va.e;
import we.l;
import xe.l0;
import xe.n0;
import xe.w;
import zd.h1;

@h1(version = "1.1")
public abstract class d<K, V> implements Map<K, V>, ye.a {
    @g
    public static final a Q = new a((w) null);
    @h
    public volatile Set<? extends K> O;
    @h
    public volatile Collection<? extends V> P;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final boolean a(@g Map.Entry<?, ?> entry, @h Object obj) {
            l0.p(entry, e.f23523d);
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            return l0.g(entry.getKey(), entry2.getKey()) && l0.g(entry.getValue(), entry2.getValue());
        }

        public final int b(@g Map.Entry<?, ?> entry) {
            l0.p(entry, e.f23523d);
            Object key = entry.getKey();
            int i10 = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            if (value != null) {
                i10 = value.hashCode();
            }
            return hashCode ^ i10;
        }

        @g
        public final String c(@g Map.Entry<?, ?> entry) {
            l0.p(entry, e.f23523d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            return sb2.toString();
        }
    }

    public static final class b extends i<K> {
        public final /* synthetic */ d<K, V> P;

        public static final class a implements Iterator<K>, ye.a {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> O;

            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.O = it;
            }

            public boolean hasNext() {
                return this.O.hasNext();
            }

            public K next() {
                return this.O.next().getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public b(d<K, ? extends V> dVar) {
            this.P = dVar;
        }

        public int b() {
            return this.P.size();
        }

        public boolean contains(Object obj) {
            return this.P.containsKey(obj);
        }

        @g
        public Iterator<K> iterator() {
            return new a(this.P.entrySet().iterator());
        }
    }

    public static final class c extends n0 implements l<Map.Entry<? extends K, ? extends V>, CharSequence> {
        public final /* synthetic */ d<K, V> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d<K, ? extends V> dVar) {
            super(1);
            this.P = dVar;
        }

        @g
        /* renamed from: c */
        public final CharSequence A(@g Map.Entry<? extends K, ? extends V> entry) {
            l0.p(entry, "it");
            return this.P.n(entry);
        }
    }

    /* renamed from: be.d$d  reason: collision with other inner class name */
    public static final class C0261d extends a<V> {
        public final /* synthetic */ d<K, V> O;

        /* renamed from: be.d$d$a */
        public static final class a implements Iterator<V>, ye.a {
            public final /* synthetic */ Iterator<Map.Entry<K, V>> O;

            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.O = it;
            }

            public boolean hasNext() {
                return this.O.hasNext();
            }

            public V next() {
                return this.O.next().getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C0261d(d<K, ? extends V> dVar) {
            this.O = dVar;
        }

        public int b() {
            return this.O.size();
        }

        public boolean contains(Object obj) {
            return this.O.containsValue(obj);
        }

        @g
        public Iterator<V> iterator() {
            return new a(this.O.entrySet().iterator());
        }
    }

    public final boolean c(@h Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!l0.g(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        l0.n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return l(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (l0.g(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set e();

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return e();
    }

    public boolean equals(@h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry c10 : entrySet) {
            if (!c(c10)) {
                return false;
            }
        }
        return true;
    }

    @g
    public Set<K> f() {
        if (this.O == null) {
            this.O = new b(this);
        }
        Set<? extends K> set = this.O;
        l0.m(set);
        return set;
    }

    @h
    public V get(Object obj) {
        Map.Entry l10 = l(obj);
        if (l10 != null) {
            return l10.getValue();
        }
        return null;
    }

    public int h() {
        return entrySet().size();
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @g
    public Collection<V> k() {
        if (this.P == null) {
            this.P = new C0261d(this);
        }
        Collection<? extends V> collection = this.P;
        l0.m(collection);
        return collection;
    }

    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    public final Map.Entry<K, V> l(K k10) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (l0.g(((Map.Entry) obj).getKey(), k10)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public final String m(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String n(Map.Entry<? extends K, ? extends V> entry) {
        return m(entry.getKey()) + '=' + m(entry.getValue());
    }

    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    @g
    public String toString() {
        return e0.h3(entrySet(), ", ", p7.a.f11638i, p7.a.f11639j, 0, (CharSequence) null, new c(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return k();
    }
}

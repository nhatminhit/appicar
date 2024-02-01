package t2;

import d.m0;
import d.o0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class c0<K> implements Iterable<K> {
    public final Set<K> O;
    public final Set<K> P;

    public c0() {
        this.O = new LinkedHashSet();
        this.P = new LinkedHashSet();
    }

    public c0(@m0 Set<K> set) {
        this.O = set;
        this.P = new LinkedHashSet();
    }

    public boolean add(@m0 K k10) {
        return this.O.add(k10);
    }

    public void b() {
        this.P.clear();
    }

    public void c(@m0 c0<K> c0Var) {
        this.O.clear();
        this.O.addAll(c0Var.O);
        this.P.clear();
        this.P.addAll(c0Var.P);
    }

    public void clear() {
        this.O.clear();
    }

    public boolean contains(@o0 K k10) {
        return this.O.contains(k10) || this.P.contains(k10);
    }

    public final boolean e(c0<?> c0Var) {
        return this.O.equals(c0Var.O) && this.P.equals(c0Var.P);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof c0) && e((c0) obj));
    }

    public void f() {
        this.O.addAll(this.P);
        this.P.clear();
    }

    public Map<K, Boolean> h(@m0 Set<K> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K next : this.P) {
            if (!set.contains(next) && !this.O.contains(next)) {
                linkedHashMap.put(next, Boolean.FALSE);
            }
        }
        for (K next2 : this.O) {
            if (!set.contains(next2)) {
                linkedHashMap.put(next2, Boolean.FALSE);
            }
        }
        for (K next3 : set) {
            if (!this.O.contains(next3) && !this.P.contains(next3)) {
                linkedHashMap.put(next3, Boolean.TRUE);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                this.P.add(key);
            } else {
                this.P.remove(key);
            }
        }
        return linkedHashMap;
    }

    public int hashCode() {
        return this.O.hashCode() ^ this.P.hashCode();
    }

    public boolean isEmpty() {
        return this.O.isEmpty() && this.P.isEmpty();
    }

    @m0
    public Iterator<K> iterator() {
        return this.O.iterator();
    }

    public boolean remove(@m0 K k10) {
        return this.O.remove(k10);
    }

    public int size() {
        return this.O.size() + this.P.size();
    }

    public String toString() {
        if (size() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb2 = new StringBuilder(size() * 28);
        sb2.append("Selection{");
        sb2.append("primary{size=" + this.O.size());
        sb2.append(", entries=" + this.O);
        sb2.append("}, provisional{size=" + this.P.size());
        sb2.append(", entries=" + this.P);
        sb2.append("}}");
        return sb2.toString();
    }
}

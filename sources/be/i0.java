package be;

import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import xe.l0;
import ye.a;

public final class i0 implements Map, Serializable, a {
    @g
    public static final i0 O = new i0();
    public static final long P = 8246714829545688274L;

    public boolean b(@g Void voidR) {
        l0.p(voidR, "value");
        return false;
    }

    @h
    /* renamed from: c */
    public Void get(@h Object obj) {
        return null;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@h Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return b((Void) obj);
    }

    @g
    public Set<Map.Entry> e() {
        return j0.O;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return e();
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @g
    public Set<Object> f() {
        return j0.O;
    }

    public int h() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    @g
    public Collection k() {
        return h0.O;
    }

    public final /* bridge */ Set<Object> keySet() {
        return f();
    }

    public Void l(Object obj, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object m() {
        return O;
    }

    /* renamed from: n */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    @g
    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return k();
    }
}

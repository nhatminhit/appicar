package be;

import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import og.c0;
import xe.l0;
import xe.v;
import ye.a;

public final class j0 implements Set, Serializable, a {
    @g
    public static final j0 O = new j0();
    public static final long P = 3406603774387020532L;

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(@g Void voidR) {
        l0.p(voidR, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return c((Void) obj);
    }

    public boolean containsAll(@g Collection collection) {
        l0.p(collection, "elements");
        return collection.isEmpty();
    }

    public int e() {
        return 0;
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final Object f() {
        return O;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    @g
    public Iterator iterator() {
        return g0.O;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public Object[] toArray() {
        return v.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        l0.p(tArr, "array");
        return v.b(this, tArr);
    }

    @g
    public String toString() {
        return c0.f21474n;
    }
}

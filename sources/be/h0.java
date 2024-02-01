package be;

import fh.g;
import fh.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import og.c0;
import xe.l0;
import xe.v;
import ye.a;

public final class h0 implements List, Serializable, RandomAccess, a {
    @g
    public static final h0 O = new h0();
    public static final long P = -7390468764508069838L;

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void b(int i10, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return e((Void) obj);
    }

    public boolean containsAll(@g Collection collection) {
        l0.p(collection, "elements");
        return collection.isEmpty();
    }

    public boolean e(@g Void voidR) {
        l0.p(voidR, "element");
        return false;
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @g
    /* renamed from: f */
    public Void get(int i10) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i10 + '.');
    }

    public int h() {
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return l((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    @g
    public Iterator iterator() {
        return g0.O;
    }

    public int l(@g Void voidR) {
        l0.p(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m((Void) obj);
    }

    @g
    public ListIterator listIterator() {
        return g0.O;
    }

    @g
    public ListIterator listIterator(int i10) {
        if (i10 == 0) {
            return g0.O;
        }
        throw new IndexOutOfBoundsException("Index: " + i10);
    }

    public int m(@g Void voidR) {
        l0.p(voidR, "element");
        return -1;
    }

    public final Object n() {
        return O;
    }

    public Void o(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void p(int i10, Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    @g
    public List subList(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11);
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

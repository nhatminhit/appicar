package be;

import fh.g;
import java.util.Collection;
import java.util.Iterator;
import we.l;
import xe.l0;
import xe.n0;
import xe.v;
import zd.h1;

@h1(version = "1.1")
public abstract class a<E> implements Collection<E>, ye.a {

    /* renamed from: be.a$a  reason: collision with other inner class name */
    public static final class C0259a extends n0 implements l<E, CharSequence> {
        public final /* synthetic */ a<E> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0259a(a<? extends E> aVar) {
            super(1);
            this.P = aVar;
        }

        @g
        /* renamed from: c */
        public final CharSequence A(E e10) {
            return e10 == this.P ? "(this Collection)" : String.valueOf(e10);
        }
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object g10 : this) {
            if (l0.g(g10, e10)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @g
    public abstract Iterator<E> iterator();

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    @g
    public Object[] toArray() {
        return v.a(this);
    }

    @g
    public <T> T[] toArray(@g T[] tArr) {
        l0.p(tArr, "array");
        return v.b(this, tArr);
    }

    @g
    public String toString() {
        return e0.h3(this, ", ", "[", "]", 0, (CharSequence) null, new C0259a(this), 24, (Object) null);
    }
}

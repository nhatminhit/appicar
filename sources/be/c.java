package be;

import dc.a;
import fh.g;
import fh.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p7.f;
import xe.l0;
import xe.w;
import zd.h1;

@h1(version = "1.1")
public abstract class c<E> extends a<E> implements List<E>, ye.a {
    @g
    public static final a O = new a((w) null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean e(@g Collection<?> collection, @g Collection<?> collection2) {
            l0.p(collection, f.f11706q);
            l0.p(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object g10 : collection) {
                if (!l0.g(g10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(@g Collection<?> collection) {
            l0.p(collection, f.f11706q);
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    public class b implements Iterator<E>, ye.a {
        public int O;

        public b() {
        }

        public final int a() {
            return this.O;
        }

        public final void b(int i10) {
            this.O = i10;
        }

        public boolean hasNext() {
            return this.O < c.this.size();
        }

        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.O;
                this.O = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: be.c$c  reason: collision with other inner class name */
    public class C0260c extends c<E>.b implements ListIterator<E>, ye.a {
        public C0260c(int i10) {
            super();
            c.O.c(i10, c.this.size());
            b(i10);
        }

        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return a() > 0;
        }

        public int nextIndex() {
            return a();
        }

        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return a() - 1;
        }

        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d<E> extends c<E> implements RandomAccess {
        @g
        public final c<E> P;
        public final int Q;
        public int R;

        public d(@g c<? extends E> cVar, int i10, int i11) {
            l0.p(cVar, a.C0292a.f17822o);
            this.P = cVar;
            this.Q = i10;
            c.O.d(i10, i11, cVar.size());
            this.R = i11 - i10;
        }

        public int b() {
            return this.R;
        }

        public E get(int i10) {
            c.O.b(i10, this.R);
            return this.P.get(this.Q + i10);
        }
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    public boolean equals(@h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return O.e(this, (Collection) obj);
    }

    public abstract E get(int i10);

    public int hashCode() {
        return O.f(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object g10 : this) {
            if (l0.g(g10, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @g
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l0.g(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @g
    public ListIterator<E> listIterator() {
        return new C0260c(0);
    }

    @g
    public ListIterator<E> listIterator(int i10) {
        return new C0260c(i10);
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @g
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}

package ce;

import be.c;
import be.f;
import be.k;
import be.o;
import dc.a;
import fh.g;
import fh.h;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import xe.l0;
import ye.e;

public final class b<E> extends f<E> implements List<E>, RandomAccess, Serializable, e {
    @g
    public E[] O;
    public int P;
    public int Q;
    public boolean R;
    @h
    public final b<E> S;
    @h
    public final b<E> T;

    public static final class a<E> implements ListIterator<E>, ye.f {
        @g
        public final b<E> O;
        public int P;
        public int Q = -1;

        public a(@g b<E> bVar, int i10) {
            l0.p(bVar, a.C0292a.f17822o);
            this.O = bVar;
            this.P = i10;
        }

        public void add(E e10) {
            b<E> bVar = this.O;
            int i10 = this.P;
            this.P = i10 + 1;
            bVar.add(i10, e10);
            this.Q = -1;
        }

        public boolean hasNext() {
            return this.P < this.O.Q;
        }

        public boolean hasPrevious() {
            return this.P > 0;
        }

        public E next() {
            if (this.P < this.O.Q) {
                int i10 = this.P;
                this.P = i10 + 1;
                this.Q = i10;
                return this.O.O[this.O.P + this.Q];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.P;
        }

        public E previous() {
            int i10 = this.P;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.P = i11;
                this.Q = i11;
                return this.O.O[this.O.P + this.Q];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.P - 1;
        }

        public void remove() {
            int i10 = this.Q;
            if (i10 != -1) {
                this.O.remove(i10);
                this.P = this.Q;
                this.Q = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e10) {
            int i10 = this.Q;
            if (i10 != -1) {
                this.O.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public b() {
        this(10);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, (b) null, (b) null);
    }

    public b(E[] eArr, int i10, int i11, boolean z10, b<E> bVar, b<E> bVar2) {
        this.O = eArr;
        this.P = i10;
        this.Q = i11;
        this.R = z10;
        this.S = bVar;
        this.T = bVar2;
    }

    public void add(int i10, E e10) {
        o();
        c.O.c(i10, this.Q);
        m(this.P + i10, e10);
    }

    public boolean add(E e10) {
        o();
        m(this.P + this.Q, e10);
        return true;
    }

    public boolean addAll(int i10, @g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        o();
        c.O.c(i10, this.Q);
        int size = collection.size();
        l(this.P + i10, collection, size);
        return size > 0;
    }

    public boolean addAll(@g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        o();
        int size = collection.size();
        l(this.P + this.Q, collection, size);
        return size > 0;
    }

    public int b() {
        return this.Q;
    }

    public E c(int i10) {
        o();
        c.O.b(i10, this.Q);
        return u(this.P + i10);
    }

    public void clear() {
        o();
        v(this.P, this.Q);
    }

    public boolean equals(@h Object obj) {
        return obj == this || ((obj instanceof List) && p((List) obj));
    }

    public E get(int i10) {
        c.O.b(i10, this.Q);
        return this.O[this.P + i10];
    }

    public int hashCode() {
        return c.i(this.O, this.P, this.Q);
    }

    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.Q; i10++) {
            if (l0.g(this.O[this.P + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.Q == 0;
    }

    @g
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    public final void l(int i10, Collection<? extends E> collection, int i11) {
        b<E> bVar = this.S;
        if (bVar != null) {
            bVar.l(i10, collection, i11);
            this.O = this.S.O;
            this.Q += i11;
            return;
        }
        s(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.O[i10 + i12] = it.next();
        }
    }

    public int lastIndexOf(Object obj) {
        for (int i10 = this.Q - 1; i10 >= 0; i10--) {
            if (l0.g(this.O[this.P + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @g
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @g
    public ListIterator<E> listIterator(int i10) {
        c.O.c(i10, this.Q);
        return new a(this, i10);
    }

    public final void m(int i10, E e10) {
        b<E> bVar = this.S;
        if (bVar != null) {
            bVar.m(i10, e10);
            this.O = this.S.O;
            this.Q++;
            return;
        }
        s(i10, 1);
        this.O[i10] = e10;
    }

    @g
    public final List<E> n() {
        if (this.S == null) {
            o();
            this.R = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public final void o() {
        if (t()) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(List<?> list) {
        return c.h(this.O, this.P, this.Q, list);
    }

    public final void q(int i10) {
        if (this.S != null) {
            throw new IllegalStateException();
        } else if (i10 >= 0) {
            E[] eArr = this.O;
            if (i10 > eArr.length) {
                this.O = c.e(this.O, k.R.a(eArr.length, i10));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    public final void r(int i10) {
        q(this.Q + i10);
    }

    public boolean remove(Object obj) {
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        o();
        return w(this.P, this.Q, collection, false) > 0;
    }

    public boolean retainAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        o();
        return w(this.P, this.Q, collection, true) > 0;
    }

    public final void s(int i10, int i11) {
        r(i11);
        E[] eArr = this.O;
        o.c1(eArr, eArr, i10 + i11, i10, this.P + this.Q);
        this.Q += i11;
    }

    public E set(int i10, E e10) {
        o();
        c.O.b(i10, this.Q);
        E[] eArr = this.O;
        int i11 = this.P;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @g
    public List<E> subList(int i10, int i11) {
        c.O.d(i10, i11, this.Q);
        E[] eArr = this.O;
        int i12 = this.P + i10;
        int i13 = i11 - i10;
        boolean z10 = this.R;
        b<E> bVar = this.T;
        return new b(eArr, i12, i13, z10, this, bVar == null ? this : bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.T;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r1 = this;
            boolean r0 = r1.R
            if (r0 != 0) goto L_0x000f
            ce.b<E> r0 = r1.T
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.R
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.b.t():boolean");
    }

    @g
    public Object[] toArray() {
        E[] eArr = this.O;
        int i10 = this.P;
        return o.M1(eArr, i10, this.Q + i10);
    }

    @g
    public <T> T[] toArray(@g T[] tArr) {
        l0.p(tArr, "destination");
        int length = tArr.length;
        int i10 = this.Q;
        if (length < i10) {
            E[] eArr = this.O;
            int i11 = this.P;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            l0.o(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.O;
        int i12 = this.P;
        o.c1(eArr2, tArr, 0, i12, i10 + i12);
        int length2 = tArr.length;
        int i13 = this.Q;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @g
    public String toString() {
        return c.j(this.O, this.P, this.Q);
    }

    public final E u(int i10) {
        b<E> bVar = this.S;
        if (bVar != null) {
            this.Q--;
            return bVar.u(i10);
        }
        E[] eArr = this.O;
        E e10 = eArr[i10];
        o.c1(eArr, eArr, i10, i10 + 1, this.P + this.Q);
        c.f(this.O, (this.P + this.Q) - 1);
        this.Q--;
        return e10;
    }

    public final void v(int i10, int i11) {
        b<E> bVar = this.S;
        if (bVar != null) {
            bVar.v(i10, i11);
        } else {
            E[] eArr = this.O;
            o.c1(eArr, eArr, i10, i10 + i11, this.Q);
            E[] eArr2 = this.O;
            int i12 = this.Q;
            c.g(eArr2, i12 - i11, i12);
        }
        this.Q -= i11;
    }

    public final int w(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        b<E> bVar = this.S;
        if (bVar != null) {
            int w10 = bVar.w(i10, i11, collection, z10);
            this.Q -= w10;
            return w10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.O[i14]) == z10) {
                E[] eArr = this.O;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.O;
        o.c1(eArr2, eArr2, i10 + i13, i11 + i10, this.Q);
        E[] eArr3 = this.O;
        int i16 = this.Q;
        c.g(eArr3, i16 - i15, i16);
        this.Q -= i15;
        return i15;
    }

    public final Object x() {
        if (t()) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }
}

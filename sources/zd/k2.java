package zd;

import be.p;
import fh.g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ve.f;
import xe.l0;
import xe.v;

@f
@h1(version = "1.3")
@t
public final class k2 implements Collection<j2>, ye.a {
    @g
    public final long[] O;

    public static final class a implements Iterator<j2>, ye.a {
        @g
        public final long[] O;
        public int P;

        public a(@g long[] jArr) {
            l0.p(jArr, "array");
            this.O = jArr;
        }

        public long a() {
            int i10 = this.P;
            long[] jArr = this.O;
            if (i10 < jArr.length) {
                this.P = i10 + 1;
                return j2.l(jArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.P));
        }

        public boolean hasNext() {
            return this.P < this.O.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return j2.b(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ k2(long[] jArr) {
        this.O = jArr;
    }

    public static final /* synthetic */ k2 c(long[] jArr) {
        return new k2(jArr);
    }

    @g
    public static long[] e(int i10) {
        return f(new long[i10]);
    }

    @g
    @a1
    public static long[] f(@g long[] jArr) {
        l0.p(jArr, "storage");
        return jArr;
    }

    public static boolean l(long[] jArr, long j10) {
        return p.S8(jArr, j10);
    }

    public static boolean m(long[] jArr, @g Collection<j2> collection) {
        boolean z10;
        l0.p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof j2) || !p.S8(jArr, ((j2) next).l0())) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean n(long[] jArr, Object obj) {
        return (obj instanceof k2) && l0.g(jArr, ((k2) obj).y());
    }

    public static final boolean o(long[] jArr, long[] jArr2) {
        return l0.g(jArr, jArr2);
    }

    public static final long p(long[] jArr, int i10) {
        return j2.l(jArr[i10]);
    }

    public static int r(long[] jArr) {
        return jArr.length;
    }

    @a1
    public static /* synthetic */ void s() {
    }

    public static int t(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean u(long[] jArr) {
        return jArr.length == 0;
    }

    @g
    public static Iterator<j2> v(long[] jArr) {
        return new a(jArr);
    }

    public static final void w(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String x(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends j2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(long j10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof j2)) {
            return false;
        }
        return h(((j2) obj).l0());
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return m(this.O, collection);
    }

    public boolean equals(Object obj) {
        return n(this.O, obj);
    }

    public boolean h(long j10) {
        return l(this.O, j10);
    }

    public int hashCode() {
        return t(this.O);
    }

    public boolean isEmpty() {
        return u(this.O);
    }

    @g
    public Iterator<j2> iterator() {
        return v(this.O);
    }

    /* renamed from: q */
    public int size() {
        return r(this.O);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return v.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        l0.p(tArr, "array");
        return v.b(this, tArr);
    }

    public String toString() {
        return x(this.O);
    }

    public final /* synthetic */ long[] y() {
        return this.O;
    }
}

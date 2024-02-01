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
public final class f2 implements Collection<e2>, ye.a {
    @g
    public final int[] O;

    public static final class a implements Iterator<e2>, ye.a {
        @g
        public final int[] O;
        public int P;

        public a(@g int[] iArr) {
            l0.p(iArr, "array");
            this.O = iArr;
        }

        public int a() {
            int i10 = this.P;
            int[] iArr = this.O;
            if (i10 < iArr.length) {
                this.P = i10 + 1;
                return e2.l(iArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.P));
        }

        public boolean hasNext() {
            return this.P < this.O.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return e2.b(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ f2(int[] iArr) {
        this.O = iArr;
    }

    public static final /* synthetic */ f2 c(int[] iArr) {
        return new f2(iArr);
    }

    @g
    public static int[] e(int i10) {
        return f(new int[i10]);
    }

    @g
    @a1
    public static int[] f(@g int[] iArr) {
        l0.p(iArr, "storage");
        return iArr;
    }

    public static boolean l(int[] iArr, int i10) {
        return p.R8(iArr, i10);
    }

    public static boolean m(int[] iArr, @g Collection<e2> collection) {
        boolean z10;
        l0.p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof e2) || !p.R8(iArr, ((e2) next).l0())) {
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

    public static boolean n(int[] iArr, Object obj) {
        return (obj instanceof f2) && l0.g(iArr, ((f2) obj).y());
    }

    public static final boolean o(int[] iArr, int[] iArr2) {
        return l0.g(iArr, iArr2);
    }

    public static final int p(int[] iArr, int i10) {
        return e2.l(iArr[i10]);
    }

    public static int r(int[] iArr) {
        return iArr.length;
    }

    @a1
    public static /* synthetic */ void s() {
    }

    public static int t(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean u(int[] iArr) {
        return iArr.length == 0;
    }

    @g
    public static Iterator<e2> v(int[] iArr) {
        return new a(iArr);
    }

    public static final void w(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends e2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        return h(((e2) obj).l0());
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return m(this.O, collection);
    }

    public boolean equals(Object obj) {
        return n(this.O, obj);
    }

    public boolean h(int i10) {
        return l(this.O, i10);
    }

    public int hashCode() {
        return t(this.O);
    }

    public boolean isEmpty() {
        return u(this.O);
    }

    @g
    public Iterator<e2> iterator() {
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

    public final /* synthetic */ int[] y() {
        return this.O;
    }
}

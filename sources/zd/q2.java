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
public final class q2 implements Collection<p2>, ye.a {
    @g
    public final short[] O;

    public static final class a implements Iterator<p2>, ye.a {
        @g
        public final short[] O;
        public int P;

        public a(@g short[] sArr) {
            l0.p(sArr, "array");
            this.O = sArr;
        }

        public short a() {
            int i10 = this.P;
            short[] sArr = this.O;
            if (i10 < sArr.length) {
                this.P = i10 + 1;
                return p2.l(sArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.P));
        }

        public boolean hasNext() {
            return this.P < this.O.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return p2.b(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ q2(short[] sArr) {
        this.O = sArr;
    }

    public static final /* synthetic */ q2 c(short[] sArr) {
        return new q2(sArr);
    }

    @g
    public static short[] e(int i10) {
        return f(new short[i10]);
    }

    @g
    @a1
    public static short[] f(@g short[] sArr) {
        l0.p(sArr, "storage");
        return sArr;
    }

    public static boolean l(short[] sArr, short s10) {
        return p.U8(sArr, s10);
    }

    public static boolean m(short[] sArr, @g Collection<p2> collection) {
        boolean z10;
        l0.p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof p2) || !p.U8(sArr, ((p2) next).j0())) {
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

    public static boolean n(short[] sArr, Object obj) {
        return (obj instanceof q2) && l0.g(sArr, ((q2) obj).y());
    }

    public static final boolean o(short[] sArr, short[] sArr2) {
        return l0.g(sArr, sArr2);
    }

    public static final short p(short[] sArr, int i10) {
        return p2.l(sArr[i10]);
    }

    public static int r(short[] sArr) {
        return sArr.length;
    }

    @a1
    public static /* synthetic */ void s() {
    }

    public static int t(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean u(short[] sArr) {
        return sArr.length == 0;
    }

    @g
    public static Iterator<p2> v(short[] sArr) {
        return new a(sArr);
    }

    public static final void w(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends p2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(short s10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof p2)) {
            return false;
        }
        return h(((p2) obj).j0());
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return m(this.O, collection);
    }

    public boolean equals(Object obj) {
        return n(this.O, obj);
    }

    public boolean h(short s10) {
        return l(this.O, s10);
    }

    public int hashCode() {
        return t(this.O);
    }

    public boolean isEmpty() {
        return u(this.O);
    }

    @g
    public Iterator<p2> iterator() {
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

    public final /* synthetic */ short[] y() {
        return this.O;
    }
}

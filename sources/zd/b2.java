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
public final class b2 implements Collection<a2>, ye.a {
    @g
    public final byte[] O;

    public static final class a implements Iterator<a2>, ye.a {
        @g
        public final byte[] O;
        public int P;

        public a(@g byte[] bArr) {
            l0.p(bArr, "array");
            this.O = bArr;
        }

        public byte a() {
            int i10 = this.P;
            byte[] bArr = this.O;
            if (i10 < bArr.length) {
                this.P = i10 + 1;
                return a2.l(bArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.P));
        }

        public boolean hasNext() {
            return this.P < this.O.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return a2.b(a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @a1
    public /* synthetic */ b2(byte[] bArr) {
        this.O = bArr;
    }

    public static final /* synthetic */ b2 c(byte[] bArr) {
        return new b2(bArr);
    }

    @g
    public static byte[] e(int i10) {
        return f(new byte[i10]);
    }

    @g
    @a1
    public static byte[] f(@g byte[] bArr) {
        l0.p(bArr, "storage");
        return bArr;
    }

    public static boolean l(byte[] bArr, byte b10) {
        return p.N8(bArr, b10);
    }

    public static boolean m(byte[] bArr, @g Collection<a2> collection) {
        boolean z10;
        l0.p(collection, "elements");
        if (!collection.isEmpty()) {
            for (T next : collection) {
                if (!(next instanceof a2) || !p.N8(bArr, ((a2) next).j0())) {
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

    public static boolean n(byte[] bArr, Object obj) {
        return (obj instanceof b2) && l0.g(bArr, ((b2) obj).y());
    }

    public static final boolean o(byte[] bArr, byte[] bArr2) {
        return l0.g(bArr, bArr2);
    }

    public static final byte p(byte[] bArr, int i10) {
        return a2.l(bArr[i10]);
    }

    public static int r(byte[] bArr) {
        return bArr.length;
    }

    @a1
    public static /* synthetic */ void s() {
    }

    public static int t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean u(byte[] bArr) {
        return bArr.length == 0;
    }

    @g
    public static Iterator<a2> v(byte[] bArr) {
        return new a(bArr);
    }

    public static final void w(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends a2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(byte b10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        return h(((a2) obj).j0());
    }

    public boolean containsAll(@g Collection<? extends Object> collection) {
        l0.p(collection, "elements");
        return m(this.O, collection);
    }

    public boolean equals(Object obj) {
        return n(this.O, obj);
    }

    public boolean h(byte b10) {
        return l(this.O, b10);
    }

    public int hashCode() {
        return t(this.O);
    }

    public boolean isEmpty() {
        return u(this.O);
    }

    @g
    public Iterator<a2> iterator() {
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

    public final /* synthetic */ byte[] y() {
        return this.O;
    }
}

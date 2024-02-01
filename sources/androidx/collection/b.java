package androidx.collection;

import d.m0;
import d.o0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {
    public static final boolean S = false;
    public static final String T = "ArraySet";
    public static final int[] U = new int[0];
    public static final Object[] V = new Object[0];
    public static final int W = 4;
    public static final int X = 10;
    @o0
    public static Object[] Y;
    public static int Z;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public static Object[] f1517a0;

    /* renamed from: b0  reason: collision with root package name */
    public static int f1518b0;
    public int[] O;
    public Object[] P;
    public int Q;
    public h<E, E> R;

    public class a extends h<E, E> {
        public a() {
        }

        public void a() {
            b.this.clear();
        }

        public Object b(int i10, int i11) {
            return b.this.P[i10];
        }

        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        public int d() {
            return b.this.Q;
        }

        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        public void g(E e10, E e11) {
            b.this.add(e10);
        }

        public void h(int i10) {
            b.this.m(i10);
        }

        public E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.O = U;
            this.P = V;
        } else {
            c(i10);
        }
        this.Q = 0;
    }

    public b(@o0 b<E> bVar) {
        this();
        if (bVar != null) {
            b(bVar);
        }
    }

    public b(@o0 Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    public static void f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1518b0 < 10) {
                    objArr[0] = f1517a0;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1517a0 = objArr;
                    f1518b0++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (Z < 10) {
                    objArr[0] = Y;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    Y = objArr;
                    Z++;
                }
            }
        }
    }

    public boolean add(@o0 E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = j();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = i(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.Q;
        int[] iArr = this.O;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.P;
            c(i14);
            int[] iArr2 = this.O;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.P, 0, objArr.length);
            }
            f(iArr, objArr, this.Q);
        }
        int i15 = this.Q;
        if (i12 < i15) {
            int[] iArr3 = this.O;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.P;
            System.arraycopy(objArr2, i12, objArr2, i16, this.Q - i12);
        }
        this.O[i12] = i10;
        this.P[i12] = e10;
        this.Q++;
        return true;
    }

    public boolean addAll(@m0 Collection<? extends E> collection) {
        e(this.Q + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public void b(@m0 b<? extends E> bVar) {
        int i10 = bVar.Q;
        e(this.Q + i10);
        if (this.Q != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(bVar.n(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.O, 0, this.O, 0, i10);
            System.arraycopy(bVar.P, 0, this.P, 0, i10);
            this.Q = i10;
        }
    }

    public final void c(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1517a0;
                if (objArr != null) {
                    this.P = objArr;
                    f1517a0 = (Object[]) objArr[0];
                    this.O = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1518b0--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = Y;
                if (objArr2 != null) {
                    this.P = objArr2;
                    Y = (Object[]) objArr2[0];
                    this.O = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    Z--;
                    return;
                }
            }
        }
        this.O = new int[i10];
        this.P = new Object[i10];
    }

    public void clear() {
        int i10 = this.Q;
        if (i10 != 0) {
            f(this.O, this.P, i10);
            this.O = U;
            this.P = V;
            this.Q = 0;
        }
    }

    public boolean contains(@o0 Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(@m0 Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void e(int i10) {
        int[] iArr = this.O;
        if (iArr.length < i10) {
            Object[] objArr = this.P;
            c(i10);
            int i11 = this.Q;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.O, 0, i11);
                System.arraycopy(objArr, 0, this.P, 0, this.Q);
            }
            f(iArr, objArr, this.Q);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.Q) {
                try {
                    if (!set.contains(n(i10))) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final h<E, E> h() {
        if (this.R == null) {
            this.R = new a();
        }
        return this.R;
    }

    public int hashCode() {
        int[] iArr = this.O;
        int i10 = this.Q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int i(Object obj, int i10) {
        int i11 = this.Q;
        if (i11 == 0) {
            return -1;
        }
        int a10 = e.a(this.O, i11, i10);
        if (a10 < 0 || obj.equals(this.P[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.O[i12] == i10) {
            if (obj.equals(this.P[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.O[i13] == i10) {
            if (obj.equals(this.P[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public int indexOf(@o0 Object obj) {
        return obj == null ? j() : i(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.Q <= 0;
    }

    public Iterator<E> iterator() {
        return h().m().iterator();
    }

    public final int j() {
        int i10 = this.Q;
        if (i10 == 0) {
            return -1;
        }
        int a10 = e.a(this.O, i10, 0);
        if (a10 < 0 || this.P[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.O[i11] == 0) {
            if (this.P[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.O[i12] == 0) {
            if (this.P[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean l(@m0 b<? extends E> bVar) {
        int i10 = bVar.Q;
        int i11 = this.Q;
        for (int i12 = 0; i12 < i10; i12++) {
            remove(bVar.n(i12));
        }
        return i11 != this.Q;
    }

    public E m(int i10) {
        E[] eArr = this.P;
        E e10 = eArr[i10];
        int i11 = this.Q;
        if (i11 <= 1) {
            f(this.O, eArr, i11);
            this.O = U;
            this.P = V;
            this.Q = 0;
        } else {
            int[] iArr = this.O;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.Q = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr = this.P;
                    System.arraycopy(objArr, i14, objArr, i10, this.Q - i10);
                }
                this.P[this.Q] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                c(i12);
                this.Q--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.O, 0, i10);
                    System.arraycopy(eArr, 0, this.P, 0, i10);
                }
                int i15 = this.Q;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.O, i10, i15 - i10);
                    System.arraycopy(eArr, i16, this.P, i10, this.Q - i10);
                }
            }
        }
        return e10;
    }

    @o0
    public E n(int i10) {
        return this.P[i10];
    }

    public boolean remove(@o0 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m(indexOf);
        return true;
    }

    public boolean removeAll(@m0 Collection<?> collection) {
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(@m0 Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.Q - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.P[i10])) {
                m(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public int size() {
        return this.Q;
    }

    @m0
    public Object[] toArray() {
        int i10 = this.Q;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.P, 0, objArr, 0, i10);
        return objArr;
    }

    @m0
    public <T> T[] toArray(@m0 T[] tArr) {
        if (tArr.length < this.Q) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.Q);
        }
        System.arraycopy(this.P, 0, tArr, 0, this.Q);
        int length = tArr.length;
        int i10 = this.Q;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.Q * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.Q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object n10 = n(i10);
            if (n10 != this) {
                sb2.append(n10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}

package androidx.collection;

import d.m0;
import d.o0;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class i<K, V> {
    public static final boolean R = false;
    public static final String S = "ArrayMap";
    public static final boolean T = true;
    public static final int U = 4;
    public static final int V = 10;
    @o0
    public static Object[] W;
    public static int X;
    @o0
    public static Object[] Y;
    public static int Z;
    public int[] O;
    public Object[] P;
    public int Q;

    public i() {
        this.O = e.f1528a;
        this.P = e.f1530c;
        this.Q = 0;
    }

    public i(int i10) {
        if (i10 == 0) {
            this.O = e.f1528a;
            this.P = e.f1530c;
        } else {
            b(i10);
        }
        this.Q = 0;
    }

    public i(i<K, V> iVar) {
        this();
        if (iVar != null) {
            n(iVar);
        }
    }

    private void b(int i10) {
        Class<i> cls = i.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = Y;
                if (objArr != null) {
                    this.P = objArr;
                    Y = (Object[]) objArr[0];
                    this.O = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Z--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = W;
                if (objArr2 != null) {
                    this.P = objArr2;
                    W = (Object[]) objArr2[0];
                    this.O = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    X--;
                    return;
                }
            }
        }
        this.O = new int[i10];
        this.P = new Object[(i10 << 1)];
    }

    public static int c(int[] iArr, int i10, int i11) {
        try {
            return e.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void f(int[] iArr, Object[] objArr, int i10) {
        Class<i> cls = i.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (Z < 10) {
                    objArr[0] = Y;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    Y = objArr;
                    Z++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (X < 10) {
                    objArr[0] = W;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    W = objArr;
                    X++;
                }
            }
        }
    }

    public void clear() {
        int i10 = this.Q;
        if (i10 > 0) {
            int[] iArr = this.O;
            Object[] objArr = this.P;
            this.O = e.f1528a;
            this.P = e.f1530c;
            this.Q = 0;
            f(iArr, objArr, i10);
        }
        if (this.Q > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@o0 Object obj) {
        return h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public void e(int i10) {
        int i11 = this.Q;
        int[] iArr = this.O;
        if (iArr.length < i10) {
            Object[] objArr = this.P;
            b(i10);
            if (this.Q > 0) {
                System.arraycopy(iArr, 0, this.O, 0, i11);
                System.arraycopy(objArr, 0, this.P, 0, i11 << 1);
            }
            f(iArr, objArr, i11);
        }
        if (this.Q != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (size() != iVar.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.Q) {
                try {
                    Object m10 = m(i10);
                    Object q10 = q(i10);
                    Object obj2 = iVar.get(m10);
                    if (q10 == null) {
                        if (obj2 != null || !iVar.containsKey(m10)) {
                            return false;
                        }
                    } else if (!q10.equals(obj2)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.Q) {
                try {
                    Object m11 = m(i11);
                    Object q11 = q(i11);
                    Object obj3 = map.get(m11);
                    if (q11 == null) {
                        if (obj3 != null || !map.containsKey(m11)) {
                            return false;
                        }
                    } else if (!q11.equals(obj3)) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int g(Object obj, int i10) {
        int i11 = this.Q;
        if (i11 == 0) {
            return -1;
        }
        int c10 = c(this.O, i11, i10);
        if (c10 < 0 || obj.equals(this.P[c10 << 1])) {
            return c10;
        }
        int i12 = c10 + 1;
        while (i12 < i11 && this.O[i12] == i10) {
            if (obj.equals(this.P[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = c10 - 1;
        while (i13 >= 0 && this.O[i13] == i10) {
            if (obj.equals(this.P[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    @o0
    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v10) {
        int h10 = h(obj);
        return h10 >= 0 ? this.P[(h10 << 1) + 1] : v10;
    }

    public int h(@o0 Object obj) {
        return obj == null ? k() : g(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.O;
        Object[] objArr = this.P;
        int i10 = this.Q;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public boolean isEmpty() {
        return this.Q <= 0;
    }

    public int k() {
        int i10 = this.Q;
        if (i10 == 0) {
            return -1;
        }
        int c10 = c(this.O, i10, 0);
        if (c10 < 0 || this.P[c10 << 1] == null) {
            return c10;
        }
        int i11 = c10 + 1;
        while (i11 < i10 && this.O[i11] == 0) {
            if (this.P[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = c10 - 1;
        while (i12 >= 0 && this.O[i12] == 0) {
            if (this.P[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    /* access modifiers changed from: package-private */
    public int l(Object obj) {
        int i10 = this.Q * 2;
        Object[] objArr = this.P;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public K m(int i10) {
        return this.P[i10 << 1];
    }

    public void n(@m0 i<? extends K, ? extends V> iVar) {
        int i10 = iVar.Q;
        e(this.Q + i10);
        if (this.Q != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(iVar.m(i11), iVar.q(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(iVar.O, 0, this.O, 0, i10);
            System.arraycopy(iVar.P, 0, this.P, 0, i10 << 1);
            this.Q = i10;
        }
    }

    public V o(int i10) {
        V[] vArr = this.P;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.Q;
        int i13 = 0;
        if (i12 <= 1) {
            f(this.O, vArr, i12);
            this.O = e.f1528a;
            this.P = e.f1530c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.O;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.P;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.P;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                b(i15);
                if (i12 == this.Q) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.O, 0, i10);
                        System.arraycopy(vArr, 0, this.P, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.O, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.P, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.Q) {
            this.Q = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V p(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.P;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    @o0
    public V put(K k10, V v10) {
        int i10;
        int i11;
        int i12 = this.Q;
        if (k10 == null) {
            i11 = k();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = g(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.P;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.O;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.P;
            b(i15);
            if (i12 == this.Q) {
                int[] iArr2 = this.O;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.P, 0, objArr.length);
                }
                f(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.O;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.P;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.Q - i14) << 1);
        }
        int i17 = this.Q;
        if (i12 == i17) {
            int[] iArr4 = this.O;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.P;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v10;
                this.Q = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @o0
    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V q(int i10) {
        return this.P[(i10 << 1) + 1];
    }

    @o0
    public V remove(Object obj) {
        int h10 = h(obj);
        if (h10 >= 0) {
            return o(h10);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int h10 = h(obj);
        if (h10 < 0) {
            return false;
        }
        Object q10 = q(h10);
        if (obj2 != q10 && (obj2 == null || !obj2.equals(q10))) {
            return false;
        }
        o(h10);
        return true;
    }

    @o0
    public V replace(K k10, V v10) {
        int h10 = h(k10);
        if (h10 >= 0) {
            return p(h10, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int h10 = h(k10);
        if (h10 < 0) {
            return false;
        }
        V q10 = q(h10);
        if (q10 != v10 && (v10 == null || !v10.equals(q10))) {
            return false;
        }
        p(h10, v11);
        return true;
    }

    public int size() {
        return this.Q;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.Q * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.Q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object q10 = q(i10);
            if (q10 != this) {
                sb2.append(q10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}

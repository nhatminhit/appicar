package androidx.recyclerview.widget;

import d.m0;
import d.o0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class c0<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f3375j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3376k = 10;

    /* renamed from: l  reason: collision with root package name */
    public static final int f3377l = 10;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3378m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3379n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3380o = 4;

    /* renamed from: a  reason: collision with root package name */
    public T[] f3381a;

    /* renamed from: b  reason: collision with root package name */
    public T[] f3382b;

    /* renamed from: c  reason: collision with root package name */
    public int f3383c;

    /* renamed from: d  reason: collision with root package name */
    public int f3384d;

    /* renamed from: e  reason: collision with root package name */
    public int f3385e;

    /* renamed from: f  reason: collision with root package name */
    public b f3386f;

    /* renamed from: g  reason: collision with root package name */
    public a f3387g;

    /* renamed from: h  reason: collision with root package name */
    public int f3388h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<T> f3389i;

    public static class a<T2> extends b<T2> {
        public final b<T2> O;
        public final f P;

        public a(b<T2> bVar) {
            this.O = bVar;
            this.P = new f(bVar);
        }

        public void a(int i10, int i11) {
            this.P.a(i10, i11);
        }

        public void b(int i10, int i11) {
            this.P.b(i10, i11);
        }

        public void c(int i10, int i11) {
            this.P.c(i10, i11);
        }

        public int compare(T2 t22, T2 t23) {
            return this.O.compare(t22, t23);
        }

        public void d(int i10, int i11, Object obj) {
            this.P.d(i10, i11, obj);
        }

        public boolean e(T2 t22, T2 t23) {
            return this.O.e(t22, t23);
        }

        public boolean f(T2 t22, T2 t23) {
            return this.O.f(t22, t23);
        }

        @o0
        public Object g(T2 t22, T2 t23) {
            return this.O.g(t22, t23);
        }

        public void h(int i10, int i11) {
            this.P.d(i10, i11, (Object) null);
        }

        public void i() {
            this.P.e();
        }
    }

    public static abstract class b<T2> implements Comparator<T2>, t {
        public abstract int compare(T2 t22, T2 t23);

        public void d(int i10, int i11, Object obj) {
            h(i10, i11);
        }

        public abstract boolean e(T2 t22, T2 t23);

        public abstract boolean f(T2 t22, T2 t23);

        @o0
        public Object g(T2 t22, T2 t23) {
            return null;
        }

        public abstract void h(int i10, int i11);
    }

    public c0(@m0 Class<T> cls, @m0 b<T> bVar) {
        this(cls, bVar, 10);
    }

    public c0(@m0 Class<T> cls, @m0 b<T> bVar, int i10) {
        this.f3389i = cls;
        this.f3381a = (Object[]) Array.newInstance(cls, i10);
        this.f3386f = bVar;
        this.f3388h = 0;
    }

    public final void A(@m0 T[] tArr) {
        boolean z10 = !(this.f3386f instanceof a);
        if (z10) {
            h();
        }
        this.f3383c = 0;
        this.f3384d = this.f3388h;
        this.f3382b = this.f3381a;
        this.f3385e = 0;
        int D = D(tArr);
        this.f3381a = (Object[]) Array.newInstance(this.f3389i, D);
        while (true) {
            int i10 = this.f3385e;
            if (i10 >= D && this.f3383c >= this.f3384d) {
                break;
            }
            int i11 = this.f3383c;
            int i12 = this.f3384d;
            if (i11 >= i12) {
                int i13 = D - i10;
                System.arraycopy(tArr, i10, this.f3381a, i10, i13);
                this.f3385e += i13;
                this.f3388h += i13;
                this.f3386f.b(i10, i13);
                break;
            } else if (i10 >= D) {
                int i14 = i12 - i11;
                this.f3388h -= i14;
                this.f3386f.c(i10, i14);
                break;
            } else {
                T t10 = this.f3382b[i11];
                T t11 = tArr[i10];
                int compare = this.f3386f.compare(t10, t11);
                if (compare < 0) {
                    B();
                } else {
                    if (compare <= 0) {
                        if (!this.f3386f.f(t10, t11)) {
                            B();
                        } else {
                            T[] tArr2 = this.f3381a;
                            int i15 = this.f3385e;
                            tArr2[i15] = t11;
                            this.f3383c++;
                            this.f3385e = i15 + 1;
                            if (!this.f3386f.e(t10, t11)) {
                                b bVar = this.f3386f;
                                bVar.d(this.f3385e - 1, 1, bVar.g(t10, t11));
                            }
                        }
                    }
                    z(t11);
                }
            }
        }
        this.f3382b = null;
        if (z10) {
            k();
        }
    }

    public final void B() {
        this.f3388h--;
        this.f3383c++;
        this.f3386f.c(this.f3385e, 1);
    }

    public int C() {
        return this.f3388h;
    }

    public final int D(@m0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f3386f);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 1; i12 < tArr.length; i12++) {
            T t10 = tArr[i12];
            if (this.f3386f.compare(tArr[i10], t10) == 0) {
                int m10 = m(t10, tArr, i10, i11);
                if (m10 != -1) {
                    tArr[m10] = t10;
                } else {
                    if (i11 != i12) {
                        tArr[i11] = t10;
                    }
                    i11++;
                }
            } else {
                if (i11 != i12) {
                    tArr[i11] = t10;
                }
                i10 = i11;
                i11++;
            }
        }
        return i11;
    }

    public final void E() {
        if (this.f3382b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void F(int i10, T t10) {
        E();
        T n10 = n(i10);
        boolean z10 = n10 == t10 || !this.f3386f.e(n10, t10);
        if (n10 == t10 || this.f3386f.compare(n10, t10) != 0) {
            if (z10) {
                b bVar = this.f3386f;
                bVar.d(i10, 1, bVar.g(n10, t10));
            }
            v(i10, false);
            int b10 = b(t10, false);
            if (i10 != b10) {
                this.f3386f.a(i10, b10);
                return;
            }
            return;
        }
        this.f3381a[i10] = t10;
        if (z10) {
            b bVar2 = this.f3386f;
            bVar2.d(i10, 1, bVar2.g(n10, t10));
        }
    }

    public int a(T t10) {
        E();
        return b(t10, true);
    }

    public final int b(T t10, boolean z10) {
        int l10 = l(t10, this.f3381a, 0, this.f3388h, 1);
        if (l10 == -1) {
            l10 = 0;
        } else if (l10 < this.f3388h) {
            T t11 = this.f3381a[l10];
            if (this.f3386f.f(t11, t10)) {
                if (this.f3386f.e(t11, t10)) {
                    this.f3381a[l10] = t10;
                    return l10;
                }
                this.f3381a[l10] = t10;
                b bVar = this.f3386f;
                bVar.d(l10, 1, bVar.g(t11, t10));
                return l10;
            }
        }
        g(l10, t10);
        if (z10) {
            this.f3386f.b(l10, 1);
        }
        return l10;
    }

    public void c(@m0 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance(this.f3389i, collection.size())), true);
    }

    public void d(@m0 T... tArr) {
        e(tArr, false);
    }

    public void e(@m0 T[] tArr, boolean z10) {
        E();
        if (tArr.length != 0) {
            if (z10) {
                f(tArr);
            } else {
                f(j(tArr));
            }
        }
    }

    public final void f(T[] tArr) {
        if (tArr.length >= 1) {
            int D = D(tArr);
            if (this.f3388h == 0) {
                this.f3381a = tArr;
                this.f3388h = D;
                this.f3386f.b(0, D);
                return;
            }
            q(tArr, D);
        }
    }

    public final void g(int i10, T t10) {
        int i11 = this.f3388h;
        if (i10 <= i11) {
            T[] tArr = this.f3381a;
            if (i11 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.f3389i, tArr.length + 10);
                System.arraycopy(this.f3381a, 0, tArr2, 0, i10);
                tArr2[i10] = t10;
                System.arraycopy(this.f3381a, i10, tArr2, i10 + 1, this.f3388h - i10);
                this.f3381a = tArr2;
            } else {
                System.arraycopy(tArr, i10, tArr, i10 + 1, i11 - i10);
                this.f3381a[i10] = t10;
            }
            this.f3388h++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i10 + " because size is " + this.f3388h);
    }

    public void h() {
        E();
        b bVar = this.f3386f;
        if (!(bVar instanceof a)) {
            if (this.f3387g == null) {
                this.f3387g = new a(bVar);
            }
            this.f3386f = this.f3387g;
        }
    }

    public void i() {
        E();
        int i10 = this.f3388h;
        if (i10 != 0) {
            Arrays.fill(this.f3381a, 0, i10, (Object) null);
            this.f3388h = 0;
            this.f3386f.c(0, i10);
        }
    }

    public final T[] j(T[] tArr) {
        T[] tArr2 = (Object[]) Array.newInstance(this.f3389i, tArr.length);
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    public void k() {
        E();
        b bVar = this.f3386f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f3386f;
        a aVar = this.f3387g;
        if (bVar2 == aVar) {
            this.f3386f = aVar.O;
        }
    }

    public final int l(T t10, T[] tArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = (i10 + i11) / 2;
            T t11 = tArr[i13];
            int compare = this.f3386f.compare(t11, t10);
            if (compare < 0) {
                i10 = i13 + 1;
            } else if (compare != 0) {
                i11 = i13;
            } else if (this.f3386f.f(t11, t10)) {
                return i13;
            } else {
                int p10 = p(t10, i13, i10, i11);
                return i12 == 1 ? p10 == -1 ? i13 : p10 : p10;
            }
        }
        if (i12 == 1) {
            return i10;
        }
        return -1;
    }

    public final int m(T t10, T[] tArr, int i10, int i11) {
        while (i10 < i11) {
            if (this.f3386f.f(tArr[i10], t10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = r3.f3385e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T n(int r4) throws java.lang.IndexOutOfBoundsException {
        /*
            r3 = this;
            int r0 = r3.f3388h
            if (r4 >= r0) goto L_0x001a
            if (r4 < 0) goto L_0x001a
            T[] r0 = r3.f3382b
            if (r0 == 0) goto L_0x0015
            int r1 = r3.f3385e
            if (r4 < r1) goto L_0x0015
            int r4 = r4 - r1
            int r1 = r3.f3383c
            int r4 = r4 + r1
            r4 = r0[r4]
            return r4
        L_0x0015:
            T[] r0 = r3.f3381a
            r4 = r0[r4]
            return r4
        L_0x001a:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Asked to get item at "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " but size is "
            r1.append(r4)
            int r4 = r3.f3388h
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c0.n(int):java.lang.Object");
    }

    public int o(T t10) {
        if (this.f3382b != null) {
            int l10 = l(t10, this.f3381a, 0, this.f3385e, 4);
            if (l10 != -1) {
                return l10;
            }
            int l11 = l(t10, this.f3382b, this.f3383c, this.f3384d, 4);
            if (l11 != -1) {
                return (l11 - this.f3383c) + this.f3385e;
            }
            return -1;
        }
        return l(t10, this.f3381a, 0, this.f3388h, 4);
    }

    public final int p(T t10, int i10, int i11, int i12) {
        T t11;
        int i13 = i10 - 1;
        while (i13 >= i11) {
            T t12 = this.f3381a[i13];
            if (this.f3386f.compare(t12, t10) != 0) {
                break;
            } else if (this.f3386f.f(t12, t10)) {
                return i13;
            } else {
                i13--;
            }
        }
        do {
            i10++;
            if (i10 >= i12) {
                return -1;
            }
            t11 = this.f3381a[i10];
            if (this.f3386f.compare(t11, t10) != 0) {
                return -1;
            }
        } while (!this.f3386f.f(t11, t10));
        return i10;
    }

    public final void q(T[] tArr, int i10) {
        boolean z10 = !(this.f3386f instanceof a);
        if (z10) {
            h();
        }
        this.f3382b = this.f3381a;
        int i11 = 0;
        this.f3383c = 0;
        int i12 = this.f3388h;
        this.f3384d = i12;
        this.f3381a = (Object[]) Array.newInstance(this.f3389i, i12 + i10 + 10);
        this.f3385e = 0;
        while (true) {
            int i13 = this.f3383c;
            int i14 = this.f3384d;
            if (i13 >= i14 && i11 >= i10) {
                break;
            } else if (i13 == i14) {
                int i15 = i10 - i11;
                System.arraycopy(tArr, i11, this.f3381a, this.f3385e, i15);
                int i16 = this.f3385e + i15;
                this.f3385e = i16;
                this.f3388h += i15;
                this.f3386f.b(i16 - i15, i15);
                break;
            } else if (i11 == i10) {
                int i17 = i14 - i13;
                System.arraycopy(this.f3382b, i13, this.f3381a, this.f3385e, i17);
                this.f3385e += i17;
                break;
            } else {
                T t10 = this.f3382b[i13];
                T t11 = tArr[i11];
                int compare = this.f3386f.compare(t10, t11);
                if (compare > 0) {
                    T[] tArr2 = this.f3381a;
                    int i18 = this.f3385e;
                    int i19 = i18 + 1;
                    this.f3385e = i19;
                    tArr2[i18] = t11;
                    this.f3388h++;
                    i11++;
                    this.f3386f.b(i19 - 1, 1);
                } else if (compare != 0 || !this.f3386f.f(t10, t11)) {
                    T[] tArr3 = this.f3381a;
                    int i20 = this.f3385e;
                    this.f3385e = i20 + 1;
                    tArr3[i20] = t10;
                    this.f3383c++;
                } else {
                    T[] tArr4 = this.f3381a;
                    int i21 = this.f3385e;
                    this.f3385e = i21 + 1;
                    tArr4[i21] = t11;
                    i11++;
                    this.f3383c++;
                    if (!this.f3386f.e(t10, t11)) {
                        b bVar = this.f3386f;
                        bVar.d(this.f3385e - 1, 1, bVar.g(t10, t11));
                    }
                }
            }
        }
        this.f3382b = null;
        if (z10) {
            k();
        }
    }

    public void r(int i10) {
        E();
        Object n10 = n(i10);
        v(i10, false);
        int b10 = b(n10, false);
        if (i10 != b10) {
            this.f3386f.a(i10, b10);
        }
    }

    public boolean s(T t10) {
        E();
        return t(t10, true);
    }

    public final boolean t(T t10, boolean z10) {
        int l10 = l(t10, this.f3381a, 0, this.f3388h, 2);
        if (l10 == -1) {
            return false;
        }
        v(l10, z10);
        return true;
    }

    public T u(int i10) {
        E();
        T n10 = n(i10);
        v(i10, true);
        return n10;
    }

    public final void v(int i10, boolean z10) {
        T[] tArr = this.f3381a;
        System.arraycopy(tArr, i10 + 1, tArr, i10, (this.f3388h - i10) - 1);
        int i11 = this.f3388h - 1;
        this.f3388h = i11;
        this.f3381a[i11] = null;
        if (z10) {
            this.f3386f.c(i10, 1);
        }
    }

    public void w(@m0 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance(this.f3389i, collection.size())), true);
    }

    public void x(@m0 T... tArr) {
        y(tArr, false);
    }

    public void y(@m0 T[] tArr, boolean z10) {
        E();
        if (z10) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }

    public final void z(T t10) {
        T[] tArr = this.f3381a;
        int i10 = this.f3385e;
        tArr[i10] = t10;
        int i11 = i10 + 1;
        this.f3385e = i11;
        this.f3388h++;
        this.f3386f.b(i11 - 1, 1);
    }
}

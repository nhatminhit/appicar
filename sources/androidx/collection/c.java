package androidx.collection;

public final class c<E> {

    /* renamed from: a  reason: collision with root package name */
    public E[] f1520a;

    /* renamed from: b  reason: collision with root package name */
    public int f1521b;

    /* renamed from: c  reason: collision with root package name */
    public int f1522c;

    /* renamed from: d  reason: collision with root package name */
    public int f1523d;

    public c() {
        this(8);
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f1523d = i10 - 1;
            this.f1520a = new Object[i10];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    public void a(E e10) {
        int i10 = (this.f1521b - 1) & this.f1523d;
        this.f1521b = i10;
        this.f1520a[i10] = e10;
        if (i10 == this.f1522c) {
            d();
        }
    }

    public void b(E e10) {
        E[] eArr = this.f1520a;
        int i10 = this.f1522c;
        eArr[i10] = e10;
        int i11 = this.f1523d & (i10 + 1);
        this.f1522c = i11;
        if (i11 == this.f1521b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public final void d() {
        E[] eArr = this.f1520a;
        int length = eArr.length;
        int i10 = this.f1521b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            E[] eArr2 = new Object[i12];
            System.arraycopy(eArr, i10, eArr2, 0, i11);
            System.arraycopy(this.f1520a, 0, eArr2, i11, this.f1521b);
            this.f1520a = eArr2;
            this.f1521b = 0;
            this.f1522c = length;
            this.f1523d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public E e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1520a[this.f1523d & (this.f1521b + i10)];
    }

    public E f() {
        int i10 = this.f1521b;
        if (i10 != this.f1522c) {
            return this.f1520a[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int i10 = this.f1521b;
        int i11 = this.f1522c;
        if (i10 != i11) {
            return this.f1520a[(i11 - 1) & this.f1523d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1521b == this.f1522c;
    }

    public E i() {
        int i10 = this.f1521b;
        if (i10 != this.f1522c) {
            E[] eArr = this.f1520a;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f1521b = (i10 + 1) & this.f1523d;
            return e10;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E j() {
        int i10 = this.f1521b;
        int i11 = this.f1522c;
        if (i10 != i11) {
            int i12 = this.f1523d & (i11 - 1);
            E[] eArr = this.f1520a;
            E e10 = eArr[i12];
            eArr[i12] = null;
            this.f1522c = i12;
            return e10;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i10) {
        int i11;
        if (i10 > 0) {
            if (i10 <= m()) {
                int i12 = 0;
                int i13 = this.f1522c;
                if (i10 < i13) {
                    i12 = i13 - i10;
                }
                int i14 = i12;
                while (true) {
                    i11 = this.f1522c;
                    if (i14 >= i11) {
                        break;
                    }
                    this.f1520a[i14] = null;
                    i14++;
                }
                int i15 = i11 - i12;
                int i16 = i10 - i15;
                this.f1522c = i11 - i15;
                if (i16 > 0) {
                    int length = this.f1520a.length;
                    this.f1522c = length;
                    int i17 = length - i16;
                    for (int i18 = i17; i18 < this.f1522c; i18++) {
                        this.f1520a[i18] = null;
                    }
                    this.f1522c = i17;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void l(int i10) {
        if (i10 > 0) {
            if (i10 <= m()) {
                int length = this.f1520a.length;
                int i11 = this.f1521b;
                if (i10 < length - i11) {
                    length = i11 + i10;
                }
                while (i11 < length) {
                    this.f1520a[i11] = null;
                    i11++;
                }
                int i12 = this.f1521b;
                int i13 = length - i12;
                int i14 = i10 - i13;
                this.f1521b = this.f1523d & (i12 + i13);
                if (i14 > 0) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        this.f1520a[i15] = null;
                    }
                    this.f1521b = i14;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int m() {
        return (this.f1522c - this.f1521b) & this.f1523d;
    }
}

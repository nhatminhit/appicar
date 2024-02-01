package androidx.collection;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1524a;

    /* renamed from: b  reason: collision with root package name */
    public int f1525b;

    /* renamed from: c  reason: collision with root package name */
    public int f1526c;

    /* renamed from: d  reason: collision with root package name */
    public int f1527d;

    public d() {
        this(8);
    }

    public d(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f1527d = i10 - 1;
            this.f1524a = new int[i10];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    public void a(int i10) {
        int i11 = (this.f1525b - 1) & this.f1527d;
        this.f1525b = i11;
        this.f1524a[i11] = i10;
        if (i11 == this.f1526c) {
            d();
        }
    }

    public void b(int i10) {
        int[] iArr = this.f1524a;
        int i11 = this.f1526c;
        iArr[i11] = i10;
        int i12 = this.f1527d & (i11 + 1);
        this.f1526c = i12;
        if (i12 == this.f1525b) {
            d();
        }
    }

    public void c() {
        this.f1526c = this.f1525b;
    }

    public final void d() {
        int[] iArr = this.f1524a;
        int length = iArr.length;
        int i10 = this.f1525b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f1524a, 0, iArr2, i11, this.f1525b);
            this.f1524a = iArr2;
            this.f1525b = 0;
            this.f1526c = length;
            this.f1527d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public int e(int i10) {
        if (i10 < 0 || i10 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1524a[this.f1527d & (this.f1525b + i10)];
    }

    public int f() {
        int i10 = this.f1525b;
        if (i10 != this.f1526c) {
            return this.f1524a[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int i10 = this.f1525b;
        int i11 = this.f1526c;
        if (i10 != i11) {
            return this.f1524a[(i11 - 1) & this.f1527d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f1525b == this.f1526c;
    }

    public int i() {
        int i10 = this.f1525b;
        if (i10 != this.f1526c) {
            int i11 = this.f1524a[i10];
            this.f1525b = (i10 + 1) & this.f1527d;
            return i11;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int j() {
        int i10 = this.f1525b;
        int i11 = this.f1526c;
        if (i10 != i11) {
            int i12 = this.f1527d & (i11 - 1);
            int i13 = this.f1524a[i12];
            this.f1526c = i12;
            return i13;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void k(int i10) {
        if (i10 > 0) {
            if (i10 <= m()) {
                this.f1526c = this.f1527d & (this.f1526c - i10);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void l(int i10) {
        if (i10 > 0) {
            if (i10 <= m()) {
                this.f1525b = this.f1527d & (this.f1525b + i10);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int m() {
        return (this.f1526c - this.f1525b) & this.f1527d;
    }
}

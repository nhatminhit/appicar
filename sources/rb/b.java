package rb;

import pb.a;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f22416f = new b(a.f21953a, 3);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f22417a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22418b;

    /* renamed from: c  reason: collision with root package name */
    public final c f22419c;

    /* renamed from: d  reason: collision with root package name */
    public final c f22420d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22421e;

    public b(int i10, int i11) {
        this.f22421e = i10;
        this.f22417a = new int[i10];
        this.f22418b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f22417a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f22418b[this.f22417a[i14]] = i14;
        }
        this.f22419c = new c(this, new int[]{0});
        this.f22420d = new c(this, new int[]{1});
    }

    public int a(int i10, int i11) {
        return (i10 + i11) % this.f22421e;
    }

    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f22419c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new c(this, iArr);
        }
    }

    public int c(int i10) {
        return this.f22417a[i10];
    }

    public c d() {
        return this.f22420d;
    }

    public int e() {
        return this.f22421e;
    }

    public c f() {
        return this.f22419c;
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.f22417a[(this.f22421e - this.f22418b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f22418b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f22417a;
        int[] iArr2 = this.f22418b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f22421e - 1)];
    }

    public int j(int i10, int i11) {
        int i12 = this.f22421e;
        return ((i10 + i12) - i11) % i12;
    }
}

package ab;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f16029h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f16030i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f16031j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f16032k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f16033l = new a(dg.a.kk, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f16034m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f16035n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f16036o;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f16037a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f16038b;

    /* renamed from: c  reason: collision with root package name */
    public final b f16039c;

    /* renamed from: d  reason: collision with root package name */
    public final b f16040d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16041e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16042f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16043g;

    static {
        a aVar = new a(67, 64, 1);
        f16031j = aVar;
        a aVar2 = new a(301, 256, 1);
        f16034m = aVar2;
        f16035n = aVar2;
        f16036o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f16042f = i10;
        this.f16041e = i11;
        this.f16043g = i12;
        this.f16037a = new int[i11];
        this.f16038b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f16037a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f16038b[this.f16037a[i15]] = i15;
        }
        this.f16039c = new b(this, new int[]{0});
        this.f16040d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f16039c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    public int c(int i10) {
        return this.f16037a[i10];
    }

    public int d() {
        return this.f16043g;
    }

    public b e() {
        return this.f16040d;
    }

    public int f() {
        return this.f16041e;
    }

    public b g() {
        return this.f16039c;
    }

    public int h(int i10) {
        if (i10 != 0) {
            return this.f16037a[(this.f16041e - this.f16038b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i10) {
        if (i10 != 0) {
            return this.f16038b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f16037a;
        int[] iArr2 = this.f16038b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f16041e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f16042f) + ',' + this.f16041e + ')';
    }
}

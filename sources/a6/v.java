package a6;

public abstract class v<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final int f265e = 12;

    /* renamed from: f  reason: collision with root package name */
    public static final int f266f = 16384;

    /* renamed from: g  reason: collision with root package name */
    public static final int f267g = 262144;

    /* renamed from: a  reason: collision with root package name */
    public T f268a;

    /* renamed from: b  reason: collision with root package name */
    public a<T> f269b;

    /* renamed from: c  reason: collision with root package name */
    public a<T> f270c;

    /* renamed from: d  reason: collision with root package name */
    public int f271d;

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f272a;

        /* renamed from: b  reason: collision with root package name */
        public final int f273b;

        /* renamed from: c  reason: collision with root package name */
        public a<T> f274c;

        public a(T t10, int i10) {
            this.f272a = t10;
            this.f273b = i10;
        }

        public int a(T t10, int i10) {
            System.arraycopy(this.f272a, 0, t10, i10, this.f273b);
            return i10 + this.f273b;
        }

        public T b() {
            return this.f272a;
        }

        public void c(a<T> aVar) {
            if (this.f274c == null) {
                this.f274c = aVar;
                return;
            }
            throw new IllegalStateException();
        }

        public a<T> d() {
            return this.f274c;
        }
    }

    public abstract T a(int i10);

    public void b() {
        a<T> aVar = this.f270c;
        if (aVar != null) {
            this.f268a = aVar.b();
        }
        this.f270c = null;
        this.f269b = null;
        this.f271d = 0;
    }

    public final T c(T t10, int i10) {
        a<T> aVar = new a<>(t10, i10);
        if (this.f269b == null) {
            this.f270c = aVar;
            this.f269b = aVar;
        } else {
            this.f270c.c(aVar);
            this.f270c = aVar;
        }
        this.f271d += i10;
        return a(i10 < 16384 ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int d() {
        return this.f271d;
    }

    public T e(T t10, int i10) {
        int i11 = this.f271d + i10;
        T a10 = a(i11);
        int i12 = 0;
        for (a<T> aVar = this.f269b; aVar != null; aVar = aVar.d()) {
            i12 = aVar.a(a10, i12);
        }
        System.arraycopy(t10, 0, a10, i12, i10);
        int i13 = i12 + i10;
        if (i13 == i11) {
            return a10;
        }
        throw new IllegalStateException("Should have gotten " + i11 + " entries, got " + i13);
    }

    public T f() {
        b();
        T t10 = this.f268a;
        return t10 == null ? a(12) : t10;
    }
}

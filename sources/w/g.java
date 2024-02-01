package w;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14299a = false;

    public interface a<T> {
        boolean a(T t10);

        T b();

        void c(T[] tArr, int i10);
    }

    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f14300a;

        /* renamed from: b  reason: collision with root package name */
        public int f14301b;

        public b(int i10) {
            if (i10 > 0) {
                this.f14300a = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public boolean a(T t10) {
            int i10 = this.f14301b;
            Object[] objArr = this.f14300a;
            if (i10 >= objArr.length) {
                return false;
            }
            objArr[i10] = t10;
            this.f14301b = i10 + 1;
            return true;
        }

        public T b() {
            int i10 = this.f14301b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T[] tArr = this.f14300a;
            T t10 = tArr[i11];
            tArr[i11] = null;
            this.f14301b = i10 - 1;
            return t10;
        }

        public void c(T[] tArr, int i10) {
            if (i10 > tArr.length) {
                i10 = tArr.length;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                T t10 = tArr[i11];
                int i12 = this.f14301b;
                Object[] objArr = this.f14300a;
                if (i12 < objArr.length) {
                    objArr[i12] = t10;
                    this.f14301b = i12 + 1;
                }
            }
        }

        public final boolean d(T t10) {
            for (int i10 = 0; i10 < this.f14301b; i10++) {
                if (this.f14300a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }
    }
}

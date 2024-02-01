package e1;

import d.m0;
import d.o0;

public final class m {

    public interface a<T> {
        boolean a(@m0 T t10);

        @o0
        T b();
    }

    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f6760a;

        /* renamed from: b  reason: collision with root package name */
        public int f6761b;

        public b(int i10) {
            if (i10 > 0) {
                this.f6760a = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        public boolean a(@m0 T t10) {
            if (!c(t10)) {
                int i10 = this.f6761b;
                Object[] objArr = this.f6760a;
                if (i10 >= objArr.length) {
                    return false;
                }
                objArr[i10] = t10;
                this.f6761b = i10 + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        public T b() {
            int i10 = this.f6761b;
            if (i10 <= 0) {
                return null;
            }
            int i11 = i10 - 1;
            T[] tArr = this.f6760a;
            T t10 = tArr[i11];
            tArr[i11] = null;
            this.f6761b = i10 - 1;
            return t10;
        }

        public final boolean c(@m0 T t10) {
            for (int i10 = 0; i10 < this.f6761b; i10++) {
                if (this.f6760a[i10] == t10) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class c<T> extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        public final Object f6762c = new Object();

        public c(int i10) {
            super(i10);
        }

        public boolean a(@m0 T t10) {
            boolean a10;
            synchronized (this.f6762c) {
                a10 = super.a(t10);
            }
            return a10;
        }

        public T b() {
            T b10;
            synchronized (this.f6762c) {
                b10 = super.b();
            }
            return b10;
        }
    }
}

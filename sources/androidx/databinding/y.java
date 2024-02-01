package androidx.databinding;

import java.util.List;

public interface y<T> extends List<T> {

    public static abstract class a<T extends y> {
        public abstract void a(T t10);

        public abstract void f(T t10, int i10, int i11);

        public abstract void g(T t10, int i10, int i11);

        public abstract void h(T t10, int i10, int i11, int i12);

        public abstract void i(T t10, int i10, int i11);
    }

    void N(a<? extends y<T>> aVar);

    void k(a<? extends y<T>> aVar);
}

package androidx.databinding;

import java.util.Map;

public interface z<K, V> extends Map<K, V> {

    public static abstract class a<T extends z<K, V>, K, V> {
        public abstract void a(T t10, K k10);
    }

    void a(a<? extends z<K, V>, K, V> aVar);

    void d(a<? extends z<K, V>, K, V> aVar);
}

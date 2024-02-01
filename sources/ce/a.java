package ce;

import be.h;
import fh.g;
import java.util.Map;
import java.util.Map.Entry;
import xe.l0;

public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends h<E> {
    public final boolean c(@g E e10) {
        l0.p(e10, "element");
        return e(e10);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return c((Map.Entry) obj);
    }

    public abstract boolean e(@g Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean f(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return f((Map.Entry) obj);
    }
}

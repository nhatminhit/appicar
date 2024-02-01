package g5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class b<T> implements Comparable<b<T>> {
    public final Type O;

    public b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.O = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
    }

    /* renamed from: a */
    public int compareTo(b<T> bVar) {
        return 0;
    }

    public Type b() {
        return this.O;
    }
}

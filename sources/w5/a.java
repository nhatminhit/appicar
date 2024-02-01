package w5;

import i5.c;
import i5.f;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import z5.b;

public class a extends i5.a implements Serializable {
    public static final long P = 1;
    public final HashMap<b, Class<?>> O = new HashMap<>();

    public j a(f fVar, j jVar) {
        Class cls = this.O.get(new b(jVar.g()));
        if (cls == null) {
            return null;
        }
        return fVar.M().V(jVar, cls);
    }

    public j b(f fVar, c cVar) {
        return null;
    }

    @Deprecated
    public j c(f fVar, j jVar) {
        return null;
    }

    public <T> a d(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        } else if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " to " + cls2.getName() + ", as latter is not a subtype of former");
        } else if (Modifier.isAbstract(cls.getModifiers())) {
            this.O.put(new b(cls), cls2);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " since it is not abstract");
        }
    }
}

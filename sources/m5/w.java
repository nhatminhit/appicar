package m5;

import v4.l0;
import v4.m0;

public class w extends m0.d {
    public static final long Q = 1;

    public w(Class<?> cls) {
        super(cls);
    }

    public l0<Object> b(Class<?> cls) {
        return cls == this.O ? this : new w(cls);
    }

    public Object c(Object obj) {
        throw new UnsupportedOperationException();
    }

    public l0.a f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new l0.a(getClass(), this.O, obj);
    }

    public l0<Object> h(Object obj) {
        return this;
    }
}

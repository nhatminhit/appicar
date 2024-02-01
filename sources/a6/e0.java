package a6;

import java.io.Serializable;

public class e0 implements Serializable {
    public static final long O = 1;
    public static final e0 P = new e0();

    public static final class a extends e0 implements Serializable {
        public static final long R = 1;
        public final Class<?>[] Q;

        public a(Class<?>[] clsArr) {
            this.Q = clsArr;
        }

        public boolean b(Class<?> cls) {
            for (Class<?> cls2 : this.Q) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b extends e0 {
        public static final long R = 1;
        public final Class<?> Q;

        public b(Class<?> cls) {
            this.Q = cls;
        }

        public boolean b(Class<?> cls) {
            Class<?> cls2 = this.Q;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static e0 a(Class<?>[] clsArr) {
        if (clsArr == null) {
            return P;
        }
        int length = clsArr.length;
        return length != 0 ? length != 1 ? new a(clsArr) : new b(clsArr[0]) : P;
    }

    public boolean b(Class<?> cls) {
        return false;
    }
}

package v4;

import g7.h;
import java.io.Serializable;

public abstract class l0<T> implements Serializable {

    public static final class a implements Serializable {
        public static final long S = 1;
        public final Class<?> O;
        public final Class<?> P;
        public final Object Q;
        public final int R;

        public a(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj != null) {
                this.O = cls;
                this.P = cls2;
                this.Q = obj;
                int hashCode = obj.hashCode() + cls.getName().hashCode();
                this.R = cls2 != null ? hashCode ^ cls2.getName().hashCode() : hashCode;
                return;
            }
            throw new IllegalArgumentException("Can not construct IdKey for null key");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.Q.equals(this.Q) && aVar.O == this.O && aVar.P == this.P;
        }

        public int hashCode() {
            return this.R;
        }

        public String toString() {
            Object[] objArr = new Object[3];
            objArr[0] = this.Q;
            Class<?> cls = this.O;
            String str = h.A;
            objArr[1] = cls == null ? str : cls.getName();
            Class<?> cls2 = this.P;
            if (cls2 != null) {
                str = cls2.getName();
            }
            objArr[2] = str;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract boolean a(l0<?> l0Var);

    public abstract l0<T> b(Class<?> cls);

    public abstract T c(Object obj);

    public abstract Class<?> d();

    public boolean e(String str, Object obj) {
        return false;
    }

    public abstract a f(Object obj);

    public boolean g() {
        return false;
    }

    public abstract l0<T> h(Object obj);
}

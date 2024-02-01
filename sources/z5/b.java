package z5;

import java.io.Serializable;

public final class b implements Comparable<b>, Serializable {
    public static final long R = 1;
    public String O;
    public Class<?> P;
    public int Q;

    public b() {
        this.P = null;
        this.O = null;
        this.Q = 0;
    }

    public b(Class<?> cls) {
        this.P = cls;
        String name = cls.getName();
        this.O = name;
        this.Q = name.hashCode();
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        return this.O.compareTo(bVar.O);
    }

    public void b(Class<?> cls) {
        this.P = cls;
        String name = cls.getName();
        this.O = name;
        this.Q = name.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == b.class) {
            return ((b) obj).P == this.P;
        }
        return false;
    }

    public int hashCode() {
        return this.Q;
    }

    public String toString() {
        return this.O;
    }
}

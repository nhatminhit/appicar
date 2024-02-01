package u5;

import java.io.Serializable;
import java.util.Objects;

public final class c implements Serializable {
    public static final long R = 1;
    public final Class<?> O;
    public final int P;
    public String Q;

    public c(Class<?> cls) {
        this(cls, (String) null);
    }

    public c(Class<?> cls, String str) {
        this.O = cls;
        this.P = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        d(str);
    }

    public String a() {
        return this.Q;
    }

    public Class<?> b() {
        return this.O;
    }

    public boolean c() {
        return this.Q != null;
    }

    public void d(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this.Q = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj;
        return this.O == cVar.O && Objects.equals(this.Q, cVar.Q);
    }

    public int hashCode() {
        return this.P;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[NamedType, class ");
        sb2.append(this.O.getName());
        sb2.append(", name: ");
        if (this.Q == null) {
            str = "null";
        } else {
            str = "'" + this.Q + "'";
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}

package xe;

import hf.i;
import java.io.Serializable;
import zd.h1;

@h1(version = "1.7")
public class c0 extends g0 implements Serializable {
    public final Class X;

    public c0(Class cls) {
        super(1);
        this.X = cls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return this.X.equals(((c0) obj).X);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    public String toString() {
        return "fun interface " + this.X.getName();
    }

    /* renamed from: y0 */
    public i w0() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}

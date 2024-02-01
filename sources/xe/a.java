package xe;

import hf.h;
import java.io.Serializable;
import zd.h1;

@h1(version = "1.4")
public class a implements e0, Serializable {
    public final Object O;
    public final Class P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final int T;
    public final int U;

    public a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, q.U, cls, str, str2, i11);
    }

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.O = obj;
        this.P = cls;
        this.Q = str;
        this.R = str2;
        this.S = (i11 & 1) == 1;
        this.T = i10;
        this.U = i11 >> 1;
    }

    public h c() {
        Class cls = this.P;
        if (cls == null) {
            return null;
        }
        return this.S ? l1.g(cls) : l1.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.S == aVar.S && this.T == aVar.T && this.U == aVar.U && l0.g(this.O, aVar.O) && l0.g(this.P, aVar.P) && this.Q.equals(aVar.Q) && this.R.equals(aVar.R);
    }

    public int g() {
        return this.T;
    }

    public int hashCode() {
        Object obj = this.O;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.P;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        return ((((((((((hashCode + i10) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31) + (this.S ? 1231 : 1237)) * 31) + this.T) * 31) + this.U;
    }

    public String toString() {
        return l1.w(this);
    }
}

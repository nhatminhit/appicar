package i5;

import java.io.Serializable;
import q5.h;
import v4.k0;

public class x implements Serializable {
    public static final long V = -1;
    public static final x W = new x(Boolean.TRUE, (String) null, (Integer) null, (String) null, (a) null, (k0) null, (k0) null);
    public static final x X = new x(Boolean.FALSE, (String) null, (Integer) null, (String) null, (a) null, (k0) null, (k0) null);
    public static final x Y = new x((Boolean) null, (String) null, (Integer) null, (String) null, (a) null, (k0) null, (k0) null);
    public final Boolean O;
    public final String P;
    public final Integer Q;
    public final String R;
    public final transient a S;
    public k0 T;
    public k0 U;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h f9127a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9128b;

        public a(h hVar, boolean z10) {
            this.f9127a = hVar;
            this.f9128b = z10;
        }

        public static a a(h hVar) {
            return new a(hVar, true);
        }

        public static a b(h hVar) {
            return new a(hVar, false);
        }

        public static a c(h hVar) {
            return new a(hVar, false);
        }
    }

    public x(Boolean bool, String str, Integer num, String str2, a aVar, k0 k0Var, k0 k0Var2) {
        this.O = bool;
        this.P = str;
        this.Q = num;
        this.R = (str2 == null || str2.isEmpty()) ? null : str2;
        this.S = aVar;
        this.T = k0Var;
        this.U = k0Var2;
    }

    public static x a(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? Y : bool.booleanValue() ? W : X : new x(bool, str, num, str2, (a) null, (k0) null, (k0) null);
    }

    @Deprecated
    public static x b(boolean z10, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? z10 ? W : X : new x(Boolean.valueOf(z10), str, num, str2, (a) null, (k0) null, (k0) null);
    }

    public k0 c() {
        return this.U;
    }

    public String d() {
        return this.R;
    }

    public String e() {
        return this.P;
    }

    public Integer f() {
        return this.Q;
    }

    public a g() {
        return this.S;
    }

    public Boolean h() {
        return this.O;
    }

    public k0 i() {
        return this.T;
    }

    public boolean j() {
        return this.R != null;
    }

    public boolean k() {
        return this.Q != null;
    }

    public boolean l() {
        Boolean bool = this.O;
        return bool != null && bool.booleanValue();
    }

    public Object m() {
        if (this.P != null || this.Q != null || this.R != null || this.S != null || this.T != null || this.U != null) {
            return this;
        }
        Boolean bool = this.O;
        return bool == null ? Y : bool.booleanValue() ? W : X;
    }

    public x n(String str) {
        if (str == null || str.isEmpty()) {
            if (this.R == null) {
                return this;
            }
            str = null;
        } else if (str.equals(this.R)) {
            return this;
        }
        return new x(this.O, this.P, this.Q, str, this.S, this.T, this.U);
    }

    public x o(String str) {
        return new x(this.O, str, this.Q, this.R, this.S, this.T, this.U);
    }

    public x p(Integer num) {
        return new x(this.O, this.P, num, this.R, this.S, this.T, this.U);
    }

    public x q(a aVar) {
        return new x(this.O, this.P, this.Q, this.R, aVar, this.T, this.U);
    }

    public x r(k0 k0Var, k0 k0Var2) {
        return new x(this.O, this.P, this.Q, this.R, this.S, k0Var, k0Var2);
    }

    public x s(Boolean bool) {
        Boolean bool2 = this.O;
        if (bool == null) {
            if (bool2 == null) {
                return this;
            }
        } else if (bool.equals(bool2)) {
            return this;
        }
        return new x(bool, this.P, this.Q, this.R, this.S, this.T, this.U);
    }
}

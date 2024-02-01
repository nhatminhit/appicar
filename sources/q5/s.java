package q5;

import a6.h;
import a6.t;
import i5.b;
import i5.j;
import i5.x;
import i5.y;
import java.util.Iterator;
import v4.u;

public abstract class s implements t {
    public static final u.b O = u.b.d();

    public Iterator<l> A() {
        return h.n();
    }

    public abstract f B();

    public abstract i C();

    public abstract String D();

    public h E() {
        l z10 = z();
        if (z10 != null) {
            return z10;
        }
        i J = J();
        return J == null ? B() : J;
    }

    public h F() {
        i J = J();
        return J == null ? B() : J;
    }

    public abstract h G();

    public abstract j H();

    public abstract Class<?> I();

    public abstract i J();

    public abstract boolean K();

    public abstract boolean L();

    public abstract boolean M();

    public boolean N(y yVar) {
        return a().equals(yVar);
    }

    public abstract boolean O();

    public abstract boolean P();

    public boolean Q() {
        return P();
    }

    public boolean R() {
        return false;
    }

    public abstract s S(y yVar);

    public abstract s T(String str);

    public abstract y a();

    public abstract x d();

    public abstract String getName();

    public boolean m() {
        return d().l();
    }

    public abstract y o();

    public boolean r() {
        return E() != null;
    }

    public boolean s() {
        return y() != null;
    }

    public abstract u.b t();

    public z u() {
        return null;
    }

    public String v() {
        b.a w10 = w();
        if (w10 == null) {
            return null;
        }
        return w10.b();
    }

    public b.a w() {
        return null;
    }

    public Class<?>[] x() {
        return null;
    }

    public h y() {
        i C = C();
        return C == null ? B() : C;
    }

    public abstract l z();
}

package xe;

import hf.c;
import hf.i;
import zd.h1;

public class g0 extends q implements e0, i {
    public final int V;
    @h1(version = "1.4")
    public final int W;

    public g0(int i10) {
        this(i10, q.U, (Class) null, (String) null, (String) null, 0);
    }

    @h1(version = "1.1")
    public g0(int i10, Object obj) {
        this(i10, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @h1(version = "1.4")
    public g0(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.V = i10;
        this.W = i11 >> 1;
    }

    @h1(version = "1.1")
    public boolean I() {
        return w0().I();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return getName().equals(g0Var.getName()) && x0().equals(g0Var.x0()) && this.W == g0Var.W && this.V == g0Var.V && l0.g(u0(), g0Var.u0()) && l0.g(v0(), g0Var.v0());
        } else if (obj instanceof i) {
            return obj.equals(r0());
        } else {
            return false;
        }
    }

    public int g() {
        return this.V;
    }

    public int hashCode() {
        return (((v0() == null ? 0 : v0().hashCode() * 31) + getName().hashCode()) * 31) + x0().hashCode();
    }

    @h1(version = "1.1")
    public boolean j() {
        return w0().j();
    }

    @h1(version = "1.1")
    public boolean l() {
        return w0().l();
    }

    @h1(version = "1.1")
    public boolean s() {
        return w0().s();
    }

    @h1(version = "1.1")
    public boolean s0() {
        return w0().s0();
    }

    @h1(version = "1.1")
    public c t0() {
        return l1.c(this);
    }

    public String toString() {
        c r02 = r0();
        if (r02 != this) {
            return r02.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + l1.f24529b;
    }

    @h1(version = "1.1")
    /* renamed from: y0 */
    public i w0() {
        return (i) super.w0();
    }
}

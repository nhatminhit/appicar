package xe;

import hf.c;
import hf.o;
import zd.h1;

public abstract class j1 extends q implements o {
    public j1() {
    }

    @h1(version = "1.1")
    public j1(Object obj) {
        super(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @h1(version = "1.4")
    public j1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return v0().equals(j1Var.v0()) && getName().equals(j1Var.getName()) && x0().equals(j1Var.x0()) && l0.g(u0(), j1Var.u0());
        } else if (obj instanceof o) {
            return obj.equals(r0());
        } else {
            return false;
        }
    }

    @h1(version = "1.1")
    public boolean f0() {
        return w0().f0();
    }

    public int hashCode() {
        return (((v0().hashCode() * 31) + getName().hashCode()) * 31) + x0().hashCode();
    }

    @h1(version = "1.1")
    public boolean r() {
        return w0().r();
    }

    public String toString() {
        c r02 = r0();
        if (r02 != this) {
            return r02.toString();
        }
        return "property " + getName() + l1.f24529b;
    }

    @h1(version = "1.1")
    /* renamed from: y0 */
    public o w0() {
        return (o) super.w0();
    }
}

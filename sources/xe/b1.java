package xe;

import fh.g;
import fh.h;
import hf.c;
import java.util.Collection;
import ve.q;
import zd.h1;

@h1(version = "1.1")
public final class b1 implements t {
    @g
    public final Class<?> O;
    @g
    public final String P;

    public b1(@g Class<?> cls, @g String str) {
        l0.p(cls, "jClass");
        l0.p(str, "moduleName");
        this.O = cls;
        this.P = str;
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof b1) && l0.g(o(), ((b1) obj).o());
    }

    public int hashCode() {
        return o().hashCode();
    }

    @g
    public Collection<c<?>> k() {
        throw new q();
    }

    @g
    public Class<?> o() {
        return this.O;
    }

    @g
    public String toString() {
        return o().toString() + l1.f24529b;
    }
}

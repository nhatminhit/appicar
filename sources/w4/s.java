package w4;

import g5.a;
import g5.b;
import java.io.IOException;
import java.util.Iterator;

public abstract class s extends z implements c0 {
    public abstract a0 a();

    public abstract a0 b();

    public abstract <T extends a0> T e(l lVar) throws IOException;

    public abstract l f(a0 a0Var);

    public abstract void g(i iVar, a0 a0Var) throws IOException;

    public f h() {
        return i();
    }

    @Deprecated
    public f i() {
        return h();
    }

    public abstract <T> T j(l lVar, a aVar) throws IOException;

    public abstract <T> T k(l lVar, b<T> bVar) throws IOException;

    public abstract <T> T l(l lVar, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> m(l lVar, a aVar) throws IOException;

    public abstract <T> Iterator<T> n(l lVar, b<T> bVar) throws IOException;

    public abstract <T> Iterator<T> o(l lVar, Class<T> cls) throws IOException;

    public abstract <T> T p(a0 a0Var, Class<T> cls) throws n;

    public abstract void q(i iVar, Object obj) throws IOException;

    public abstract b0 version();
}

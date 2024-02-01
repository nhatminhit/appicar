package i5;

import java.io.IOException;
import java.util.Collection;
import l5.s;
import l5.v;
import u5.f;
import w4.l;
import w4.n;

public abstract class k<T> implements s {

    public static abstract class a extends k<Object> {
    }

    public a6.a c() {
        return a6.a.CONSTANT;
    }

    public T d(g gVar) throws l {
        return p();
    }

    public abstract T f(l lVar, g gVar) throws IOException, n;

    public T g(l lVar, g gVar, T t10) throws IOException {
        gVar.a0(this);
        return f(lVar, gVar);
    }

    public Object h(l lVar, g gVar, f fVar) throws IOException {
        return fVar.c(lVar, gVar);
    }

    public Object i(l lVar, g gVar, f fVar, T t10) throws IOException {
        gVar.a0(this);
        return h(lVar, gVar, fVar);
    }

    public v j(String str) {
        throw new IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    public k<?> k() {
        return null;
    }

    public a6.a l() {
        return a6.a.DYNAMIC;
    }

    @Deprecated
    public Object m() {
        return p();
    }

    public Object n(g gVar) throws l {
        return d(gVar);
    }

    public Collection<Object> o() {
        return null;
    }

    @Deprecated
    public T p() {
        return null;
    }

    public m5.s q() {
        return null;
    }

    public Class<?> r() {
        return null;
    }

    public boolean s() {
        return false;
    }

    public k<?> t(k<?> kVar) {
        throw new UnsupportedOperationException();
    }

    public Boolean u(f fVar) {
        return null;
    }

    public k<T> v(a6.s sVar) {
        return this;
    }
}

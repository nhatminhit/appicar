package i5;

import a6.h;
import a6.s;
import java.io.IOException;
import java.util.Iterator;
import s5.e;
import s5.g;
import w4.i;

public abstract class o<T> implements e {

    public static abstract class a extends o<Object> {
    }

    public void e(g gVar, j jVar) throws l {
        gVar.q(jVar);
    }

    public o<?> f() {
        return null;
    }

    public Class<T> g() {
        return null;
    }

    public boolean h(e0 e0Var, T t10) {
        return t10 == null;
    }

    @Deprecated
    public boolean i(T t10) {
        return h((e0) null, t10);
    }

    public boolean j() {
        return false;
    }

    public Iterator<com.fasterxml.jackson.databind.ser.o> k() {
        return h.n();
    }

    public o<T> l(o<?> oVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void m(T t10, i iVar, e0 e0Var) throws IOException;

    public void n(T t10, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        Class<?> g10 = g();
        if (g10 == null) {
            g10 = t10.getClass();
        }
        e0Var.A(g10, String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{g10.getName(), getClass().getName()}));
    }

    public o<T> o(s sVar) {
        return this;
    }

    public boolean p() {
        return false;
    }

    public o<?> q(Object obj) {
        return this;
    }
}

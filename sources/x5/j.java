package x5;

import com.fasterxml.jackson.databind.ser.d;
import q5.z;
import v4.l0;
import v4.m0;

public class j extends m0.d {
    public static final long R = 1;
    public final d Q;

    public j(Class<?> cls, d dVar) {
        super(cls);
        this.Q = dVar;
    }

    public j(z zVar, d dVar) {
        this(zVar.f(), dVar);
    }

    public boolean a(l0<?> l0Var) {
        if (l0Var.getClass() != getClass()) {
            return false;
        }
        j jVar = (j) l0Var;
        return jVar.d() == this.O && jVar.Q == this.Q;
    }

    public l0<Object> b(Class<?> cls) {
        return cls == this.O ? this : new j(cls, this.Q);
    }

    public Object c(Object obj) {
        try {
            return this.Q.B(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException("Problem accessing property '" + this.Q.getName() + "': " + e11.getMessage(), e11);
        }
    }

    public l0.a f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new l0.a(getClass(), this.O, obj);
    }

    public l0<Object> h(Object obj) {
        return this;
    }
}

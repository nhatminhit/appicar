package n5;

import a6.a;
import a6.h;
import i5.f;
import i5.j;
import i5.k;
import i5.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import l5.s;
import l5.v;
import l5.y;
import m5.q;
import z5.n;

public abstract class g<T> extends a0<T> implements y.b {
    public final j T;
    public final s U;
    public final boolean V;
    public final Boolean W;

    public g(j jVar) {
        this(jVar, (s) null, (Boolean) null);
    }

    public g(j jVar, s sVar, Boolean bool) {
        super(jVar);
        this.T = jVar;
        this.W = bool;
        this.U = sVar;
        this.V = q.e(sVar);
    }

    public g(g<?> gVar) {
        this(gVar, gVar.U, gVar.W);
    }

    public g(g<?> gVar, s sVar, Boolean bool) {
        super(gVar.T);
        this.T = gVar.T;
        this.U = sVar;
        this.W = bool;
        this.V = q.e(sVar);
    }

    public abstract k<Object> E0();

    public j F0() {
        j jVar = this.T;
        return jVar == null ? n.l0() : jVar.d();
    }

    public <BOGUS> BOGUS G0(Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        h.o0(th2);
        if (!(th2 instanceof IOException) || (th2 instanceof l)) {
            throw l.y(th2, obj, (String) h.f0(str, "N/A"));
        }
        throw ((IOException) th2);
    }

    public y e() {
        return null;
    }

    public v j(String str) {
        k<Object> E0 = E0();
        if (E0 != null) {
            return E0.j(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, getClass().getName()}));
    }

    public a l() {
        return a.DYNAMIC;
    }

    public Object n(i5.g gVar) throws l {
        y e10 = e();
        if (e10 == null || !e10.i()) {
            j x02 = x0();
            gVar.z(x02, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{x02}));
        }
        try {
            return e10.t(gVar);
        } catch (IOException e11) {
            return h.n0(gVar, e11);
        }
    }

    public Boolean u(f fVar) {
        return Boolean.TRUE;
    }

    public j x0() {
        return this.T;
    }
}

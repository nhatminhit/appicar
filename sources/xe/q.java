package xe;

import hf.c;
import hf.h;
import hf.n;
import hf.s;
import hf.t;
import hf.w;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import zd.h1;

public abstract class q implements c, Serializable {
    @h1(version = "1.1")
    public static final Object U = a.O;
    public transient c O;
    @h1(version = "1.1")
    public final Object P;
    @h1(version = "1.4")
    public final Class Q;
    @h1(version = "1.4")
    public final String R;
    @h1(version = "1.4")
    public final String S;
    @h1(version = "1.4")
    public final boolean T;

    @h1(version = "1.2")
    public static class a implements Serializable {
        public static final a O = new a();

        public final Object b() throws ObjectStreamException {
            return O;
        }
    }

    public q() {
        this(U);
    }

    @h1(version = "1.1")
    public q(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    @h1(version = "1.4")
    public q(Object obj, Class cls, String str, String str2, boolean z10) {
        this.P = obj;
        this.Q = cls;
        this.R = str;
        this.S = str2;
        this.T = z10;
    }

    public List<n> K() {
        return w0().K();
    }

    public Object Q(Map map) {
        return w0().Q(map);
    }

    public Object c(Object... objArr) {
        return w0().c(objArr);
    }

    public s c0() {
        return w0().c0();
    }

    @h1(version = "1.1")
    public w d() {
        return w0().d();
    }

    @h1(version = "1.1")
    public boolean f() {
        return w0().f();
    }

    public List<Annotation> getAnnotations() {
        return w0().getAnnotations();
    }

    public String getName() {
        return this.R;
    }

    @h1(version = "1.1")
    public List<t> getTypeParameters() {
        return w0().getTypeParameters();
    }

    @h1(version = "1.1")
    public boolean h() {
        return w0().h();
    }

    @h1(version = "1.1")
    public boolean isOpen() {
        return w0().isOpen();
    }

    @h1(version = "1.3")
    public boolean j() {
        return w0().j();
    }

    @h1(version = "1.1")
    public c r0() {
        c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        c t02 = t0();
        this.O = t02;
        return t02;
    }

    public abstract c t0();

    @h1(version = "1.1")
    public Object u0() {
        return this.P;
    }

    public h v0() {
        Class cls = this.Q;
        if (cls == null) {
            return null;
        }
        return this.T ? l1.g(cls) : l1.d(cls);
    }

    @h1(version = "1.1")
    public c w0() {
        c r02 = r0();
        if (r02 != this) {
            return r02;
        }
        throw new ve.q();
    }

    public String x0() {
        return this.S;
    }
}

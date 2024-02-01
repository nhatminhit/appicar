package i5;

import com.fasterxml.jackson.databind.ser.h;
import com.fasterxml.jackson.databind.ser.s;
import java.util.Collection;
import java.util.Collections;
import k5.k;
import l5.g;
import l5.q;
import l5.r;
import l5.z;
import u5.c;
import w4.b0;
import w4.c0;
import w4.f;
import w4.i;
import w4.l;
import z5.n;
import z5.o;

public abstract class t implements c0 {

    public interface a {
        n A();

        void B(o oVar);

        boolean a(i.b bVar);

        k b(Class<?> cls);

        void c(h hVar);

        void d(l5.n nVar);

        void e(q5.t tVar);

        void f(s sVar);

        boolean g(h hVar);

        void h(a aVar);

        b0 i();

        void j(Collection<Class<?>> collection);

        void k(z zVar);

        boolean l(d0 d0Var);

        <C extends w4.s> C m();

        void n(b bVar);

        boolean o(l.a aVar);

        void p(z zVar);

        void q(g gVar);

        boolean r(q qVar);

        void s(q qVar);

        boolean t(f.a aVar);

        void u(s sVar);

        void v(b bVar);

        void w(Class<?>... clsArr);

        void x(Class<?> cls, Class<?> cls2);

        void y(c... cVarArr);

        void z(r rVar);
    }

    public Iterable<? extends t> a() {
        return Collections.emptyList();
    }

    public abstract String b();

    public Object c() {
        return getClass().getName();
    }

    public abstract void d(a aVar);

    public abstract b0 version();
}

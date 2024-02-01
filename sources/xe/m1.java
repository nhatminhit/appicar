package xe;

import hf.d;
import hf.g;
import hf.h;
import hf.i;
import hf.k;
import hf.l;
import hf.m;
import hf.p;
import hf.q;
import hf.r;
import hf.s;
import hf.t;
import hf.u;
import hf.v;
import java.util.List;
import zd.h1;

public class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24532a = "kotlin.jvm.functions.";

    public d a(Class cls) {
        return new u(cls);
    }

    public d b(Class cls, String str) {
        return new u(cls);
    }

    public i c(g0 g0Var) {
        return g0Var;
    }

    public d d(Class cls) {
        return new u(cls);
    }

    public d e(Class cls, String str) {
        return new u(cls);
    }

    public h f(Class cls, String str) {
        return new b1(cls, str);
    }

    @h1(version = "1.6")
    public s g(s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.W(), sVar.U(), w1Var.A(), w1Var.y() | 2);
    }

    public k h(u0 u0Var) {
        return u0Var;
    }

    public l i(w0 w0Var) {
        return w0Var;
    }

    public m j(y0 y0Var) {
        return y0Var;
    }

    @h1(version = "1.6")
    public s k(s sVar) {
        w1 w1Var = (w1) sVar;
        return new w1(sVar.W(), sVar.U(), w1Var.A(), w1Var.y() | 4);
    }

    @h1(version = "1.6")
    public s l(s sVar, s sVar2) {
        return new w1(sVar.W(), sVar.U(), sVar2, ((w1) sVar).y());
    }

    public p m(d1 d1Var) {
        return d1Var;
    }

    public q n(f1 f1Var) {
        return f1Var;
    }

    public r o(h1 h1Var) {
        return h1Var;
    }

    @h1(version = "1.3")
    public String p(e0 e0Var) {
        String obj = e0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(f24532a) ? obj.substring(21) : obj;
    }

    @h1(version = "1.1")
    public String q(n0 n0Var) {
        return p(n0Var);
    }

    @h1(version = "1.4")
    public void r(t tVar, List<s> list) {
        ((v1) tVar).b(list);
    }

    @h1(version = "1.4")
    public s s(g gVar, List<u> list, boolean z10) {
        return new w1(gVar, list, z10);
    }

    @h1(version = "1.4")
    public t t(Object obj, String str, v vVar, boolean z10) {
        return new v1(obj, str, vVar, z10);
    }
}

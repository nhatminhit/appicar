package y5;

import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.o;
import i5.d;
import i5.e0;
import i5.j;
import i5.x;
import i5.y;
import java.io.IOException;
import java.lang.annotation.Annotation;
import q5.h;
import s5.l;
import u5.i;

public class t extends o {
    public static final long Y = 1;
    public static final d Z = new d.a();
    public final i S;
    public final d T;
    public Object U;
    public Object V;
    public i5.o<Object> W;
    public i5.o<Object> X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(i iVar, d dVar) {
        super(dVar == null ? x.Y : dVar.d());
        this.S = iVar;
        this.T = dVar == null ? Z : dVar;
    }

    public y a() {
        return new y(getName());
    }

    public void b(l lVar, e0 e0Var) throws i5.l {
        this.T.b(lVar, e0Var);
    }

    @Deprecated
    public void c(u uVar, e0 e0Var) throws i5.l {
    }

    public j e() {
        return this.T.e();
    }

    public void g(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        i iVar2 = this.S;
        if (iVar2 == null) {
            this.X.m(this.V, iVar, e0Var);
        } else {
            this.X.n(this.V, iVar, e0Var, iVar2);
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.T.getAnnotation(cls);
    }

    public String getName() {
        Object obj = this.U;
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    public void h(Object obj, w4.i iVar, e0 e0Var) throws IOException {
        this.W.m(this.U, iVar, e0Var);
        i iVar2 = this.S;
        if (iVar2 == null) {
            this.X.m(this.V, iVar, e0Var);
        } else {
            this.X.n(this.V, iVar, e0Var, iVar2);
        }
    }

    public h i() {
        return this.T.i();
    }

    public <A extends Annotation> A l(Class<A> cls) {
        return this.T.l(cls);
    }

    public y o() {
        return this.T.o();
    }

    public void r(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        if (!iVar.l()) {
            iVar.G2(getName());
        }
    }

    public void s(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        iVar.k2();
    }

    public Object t() {
        return this.V;
    }

    @Deprecated
    public void u(Object obj, i5.o<Object> oVar, i5.o<Object> oVar2) {
        v(obj, this.V, oVar, oVar2);
    }

    public void v(Object obj, Object obj2, i5.o<Object> oVar, i5.o<Object> oVar2) {
        this.U = obj;
        this.V = obj2;
        this.W = oVar;
        this.X = oVar2;
    }

    public void w(Object obj) {
        this.V = obj;
    }
}

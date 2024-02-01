package h5;

import java.io.IOException;
import java.io.Serializable;
import w4.i;
import w4.t;

public class k implements t, Serializable {
    public static final long Q = 1;
    public String O;
    public m P;

    public k() {
        this(t.N.toString());
    }

    public k(String str) {
        this.O = str;
        this.P = t.M;
    }

    public void a(i iVar) throws IOException {
        iVar.H2('[');
    }

    public void b(i iVar) throws IOException {
        iVar.H2('{');
    }

    public void c(i iVar) throws IOException {
        iVar.H2(this.P.c());
    }

    public void d(String str) {
        this.O = str;
    }

    public void e(i iVar) throws IOException {
        iVar.H2(this.P.b());
    }

    public void f(i iVar, int i10) throws IOException {
        iVar.H2(']');
    }

    public void g(i iVar) throws IOException {
        String str = this.O;
        if (str != null) {
            iVar.I2(str);
        }
    }

    public void h(i iVar) throws IOException {
    }

    public void i(i iVar) throws IOException {
        iVar.H2(this.P.d());
    }

    public void j(i iVar) throws IOException {
    }

    public void k(i iVar, int i10) throws IOException {
        iVar.H2('}');
    }

    public k l(m mVar) {
        this.P = mVar;
        return this;
    }
}

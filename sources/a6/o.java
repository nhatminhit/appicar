package a6;

import c5.b;
import i5.d;
import i5.e0;
import i5.j;
import i5.n;
import java.io.IOException;
import w4.i;
import w4.r;

public class o implements n {
    public final String O;
    public final Object P;
    public final j Q;

    public o(String str, Object obj) {
        this(str, obj, (j) null);
    }

    public o(String str, Object obj, j jVar) {
        this.O = str;
        this.P = obj;
        this.Q = jVar;
    }

    public String a() {
        return this.O;
    }

    public j b() {
        return this.Q;
    }

    public Object c() {
        return this.P;
    }

    public void r(i iVar, e0 e0Var) throws IOException {
        i5.o<Object> e02;
        Object obj;
        iVar.I2(this.O);
        iVar.H2('(');
        if (this.P == null) {
            e0Var.R(iVar);
        } else {
            boolean z10 = iVar.a0() == null;
            if (z10) {
                iVar.p1(r.d());
            }
            try {
                j jVar = this.Q;
                if (jVar != null) {
                    e02 = e0Var.d0(jVar, true, (d) null);
                    obj = this.P;
                } else {
                    e02 = e0Var.e0(this.P.getClass(), true, (d) null);
                    obj = this.P;
                }
                e02.m(obj, iVar, e0Var);
            } finally {
                if (z10) {
                    iVar.p1((b) null);
                }
            }
        }
        iVar.H2(')');
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        r(iVar, e0Var);
    }
}

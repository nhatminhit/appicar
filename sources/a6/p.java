package a6;

import i5.d;
import i5.e0;
import i5.j;
import i5.n;
import java.io.IOException;
import w4.i;

public class p implements n {
    public final String O;
    public final String P;
    public final Object Q;
    public final j R;

    public p(String str, String str2, Object obj) {
        this(str, str2, obj, (j) null);
    }

    public p(String str, String str2, Object obj, j jVar) {
        this.O = str;
        this.P = str2;
        this.Q = obj;
        this.R = jVar;
    }

    public String a() {
        return this.O;
    }

    public j b() {
        return this.R;
    }

    public String c() {
        return this.P;
    }

    public Object d() {
        return this.Q;
    }

    public void r(i iVar, e0 e0Var) throws IOException, w4.n {
        String str = this.O;
        if (str != null) {
            iVar.I2(str);
        }
        Object obj = this.Q;
        if (obj == null) {
            e0Var.R(iVar);
        } else {
            j jVar = this.R;
            (jVar != null ? e0Var.d0(jVar, true, (d) null) : e0Var.e0(obj.getClass(), true, (d) null)).m(this.Q, iVar, e0Var);
        }
        String str2 = this.P;
        if (str2 != null) {
            iVar.I2(str2);
        }
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException, w4.n {
        r(iVar, e0Var);
    }
}

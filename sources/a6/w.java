package a6;

import i5.e0;
import i5.n;
import java.io.IOException;
import w4.i;
import w4.u;

public class w implements n {
    public Object O;

    public w(n nVar) {
        this.O = nVar;
    }

    public w(Object obj, boolean z10) {
        this.O = obj;
    }

    public w(String str) {
        this.O = str;
    }

    public w(u uVar) {
        this.O = uVar;
    }

    public void a(i iVar) throws IOException {
        Object obj = this.O;
        if (obj instanceof u) {
            iVar.P2((u) obj);
        } else {
            iVar.N2(String.valueOf(obj));
        }
    }

    public Object b() {
        return this.O;
    }

    public void c(i iVar) throws IOException {
        Object obj = this.O;
        if (obj instanceof n) {
            iVar.writeObject(obj);
        } else {
            a(iVar);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        Object obj2 = this.O;
        Object obj3 = ((w) obj).O;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.O;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void r(i iVar, e0 e0Var) throws IOException {
        Object obj = this.O;
        if (obj instanceof n) {
            ((n) obj).r(iVar, e0Var);
        } else {
            a(iVar);
        }
    }

    public String toString() {
        return String.format("[RawValue of type %s]", new Object[]{h.h(this.O)});
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        Object obj = this.O;
        if (obj instanceof n) {
            ((n) obj).y(iVar, e0Var, iVar2);
        } else if (obj instanceof u) {
            r(iVar, e0Var);
        }
    }
}

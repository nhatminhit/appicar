package x5;

import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.d;
import com.fasterxml.jackson.databind.ser.n;
import com.fasterxml.jackson.databind.ser.o;
import i5.e0;
import i5.l;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w4.i;

public class m implements com.fasterxml.jackson.databind.ser.c, n {

    public static class a implements n {
        public final /* synthetic */ com.fasterxml.jackson.databind.ser.c O;

        public a(com.fasterxml.jackson.databind.ser.c cVar) {
            this.O = cVar;
        }

        public void a(o oVar, u uVar, e0 e0Var) throws l {
            this.O.d((d) oVar, uVar, e0Var);
        }

        public void b(Object obj, i iVar, e0 e0Var, o oVar) throws Exception {
            this.O.e(obj, iVar, e0Var, (d) oVar);
        }

        public void c(Object obj, i iVar, e0 e0Var, o oVar) throws Exception {
            throw new UnsupportedOperationException();
        }

        public void f(o oVar, s5.l lVar, e0 e0Var) throws l {
            this.O.g((d) oVar, lVar, e0Var);
        }
    }

    public static class b extends m implements Serializable {
        public static final long P = 1;
        public final Set<String> O;

        public b(Set<String> set) {
            this.O = set;
        }

        public boolean k(d dVar) {
            return this.O.contains(dVar.getName());
        }

        public boolean l(o oVar) {
            return this.O.contains(oVar.getName());
        }
    }

    public static class c extends m implements Serializable {
        public static final long P = 1;
        public static final c Q = new c();
        public final Set<String> O;

        public c() {
            this.O = Collections.emptySet();
        }

        public c(Set<String> set) {
            this.O = set;
        }

        public boolean k(d dVar) {
            return !this.O.contains(dVar.getName());
        }

        public boolean l(o oVar) {
            return !this.O.contains(oVar.getName());
        }
    }

    public static m h(Set<String> set) {
        return new b(set);
    }

    public static m i(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new b(hashSet);
    }

    public static n j(com.fasterxml.jackson.databind.ser.c cVar) {
        return new a(cVar);
    }

    public static m n() {
        return c.Q;
    }

    @Deprecated
    public static m o(Set<String> set) {
        return new b(set);
    }

    public static m p(Set<String> set) {
        return new c(set);
    }

    public static m q(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new c(hashSet);
    }

    @Deprecated
    public void a(o oVar, u uVar, e0 e0Var) throws l {
        if (l(oVar)) {
            oVar.c(uVar, e0Var);
        }
    }

    public void b(Object obj, i iVar, e0 e0Var, o oVar) throws Exception {
        if (l(oVar)) {
            oVar.h(obj, iVar, e0Var);
        } else if (!iVar.l()) {
            oVar.r(obj, iVar, e0Var);
        }
    }

    public void c(Object obj, i iVar, e0 e0Var, o oVar) throws Exception {
        if (m(obj)) {
            oVar.g(obj, iVar, e0Var);
        }
    }

    @Deprecated
    public void d(d dVar, u uVar, e0 e0Var) throws l {
        if (k(dVar)) {
            dVar.c(uVar, e0Var);
        }
    }

    @Deprecated
    public void e(Object obj, i iVar, e0 e0Var, d dVar) throws Exception {
        if (k(dVar)) {
            dVar.h(obj, iVar, e0Var);
        } else if (!iVar.l()) {
            dVar.r(obj, iVar, e0Var);
        }
    }

    public void f(o oVar, s5.l lVar, e0 e0Var) throws l {
        if (l(oVar)) {
            oVar.b(lVar, e0Var);
        }
    }

    @Deprecated
    public void g(d dVar, s5.l lVar, e0 e0Var) throws l {
        if (k(dVar)) {
            dVar.b(lVar, e0Var);
        }
    }

    public boolean k(d dVar) {
        return true;
    }

    public boolean l(o oVar) {
        return true;
    }

    public boolean m(Object obj) {
        return true;
    }
}

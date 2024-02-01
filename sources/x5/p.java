package x5;

import g5.c;
import i5.d;
import i5.d0;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import j5.a;
import java.io.IOException;
import java.util.Collection;
import s5.b;
import w4.i;
import y5.f0;

@a
public class p extends f0<Collection<String>> {
    public static final p S = new p();

    public p() {
        super(Collection.class);
    }

    public p(p pVar, Boolean bool) {
        super(pVar, bool);
    }

    public o<?> M(d dVar, Boolean bool) {
        return new p(this, bool);
    }

    public void N(b bVar) throws l {
        bVar.i(s5.d.STRING);
    }

    public m O() {
        return u("string", true);
    }

    /* renamed from: Q */
    public void n(Collection<String> collection, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(collection, w4.p.START_ARRAY));
        iVar.A1(collection);
        S(collection, iVar, e0Var);
        iVar2.v(iVar, o10);
    }

    /* renamed from: R */
    public void m(Collection<String> collection, i iVar, e0 e0Var) throws IOException {
        int size = collection.size();
        if (size != 1 || ((this.R != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.R != Boolean.TRUE)) {
            iVar.U2(collection, size);
            S(collection, iVar, e0Var);
            iVar.f2();
            return;
        }
        S(collection, iVar, e0Var);
    }

    public final void S(Collection<String> collection, i iVar, e0 e0Var) throws IOException {
        int i10 = 0;
        try {
            for (String next : collection) {
                if (next == null) {
                    e0Var.R(iVar);
                } else {
                    iVar.Z2(next);
                }
                i10++;
            }
        } catch (Exception e10) {
            K(e0Var, e10, collection, 0);
        }
    }
}

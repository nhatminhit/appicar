package y5;

import i5.d;
import i5.d0;
import i5.e0;
import i5.o;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import u5.i;
import x5.k;

public class j extends b<Collection<?>> {
    public static final long Y = 1;

    @Deprecated
    public j(i5.j jVar, boolean z10, i iVar, d dVar, o<Object> oVar) {
        this(jVar, z10, iVar, oVar);
    }

    public j(i5.j jVar, boolean z10, i iVar, o<Object> oVar) {
        super((Class<?>) Collection.class, jVar, z10, iVar, oVar);
    }

    public j(j jVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super((b<?>) jVar, dVar, iVar, oVar, bool);
    }

    public com.fasterxml.jackson.databind.ser.i<?> M(i iVar) {
        return new j(this, this.S, iVar, (o<?>) this.W, this.U);
    }

    /* renamed from: X */
    public boolean Q(Collection<?> collection) {
        return collection.size() == 1;
    }

    /* renamed from: Y */
    public boolean h(e0 e0Var, Collection<?> collection) {
        return collection.isEmpty();
    }

    /* renamed from: Z */
    public final void m(Collection<?> collection, w4.i iVar, e0 e0Var) throws IOException {
        int size = collection.size();
        if (size != 1 || ((this.U != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.U != Boolean.TRUE)) {
            iVar.U2(collection, size);
            U(collection, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(collection, iVar, e0Var);
    }

    /* renamed from: a0 */
    public void U(Collection<?> collection, w4.i iVar, e0 e0Var) throws IOException {
        iVar.A1(collection);
        o<Object> oVar = this.W;
        if (oVar != null) {
            b0(collection, iVar, e0Var, oVar);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            k kVar = this.X;
            i iVar2 = this.V;
            int i10 = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        e0Var.R(iVar);
                    } else {
                        Class<?> cls = next.getClass();
                        o<Object> n10 = kVar.n(cls);
                        if (n10 == null) {
                            n10 = this.R.i() ? S(kVar, e0Var.k(this.R, cls), e0Var) : T(kVar, cls, e0Var);
                            kVar = this.X;
                        }
                        if (iVar2 == null) {
                            n10.m(next, iVar, e0Var);
                        } else {
                            n10.n(next, iVar, e0Var, iVar2);
                        }
                    }
                    i10++;
                } catch (Exception e10) {
                    K(e0Var, e10, collection, i10);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public void b0(Collection<?> collection, w4.i iVar, e0 e0Var, o<Object> oVar) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            i iVar2 = this.V;
            int i10 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        e0Var.R(iVar);
                    } catch (Exception e10) {
                        K(e0Var, e10, collection, i10);
                    }
                } else if (iVar2 == null) {
                    oVar.m(next, iVar, e0Var);
                } else {
                    oVar.n(next, iVar, e0Var, iVar2);
                }
                i10++;
            } while (it.hasNext());
        }
    }

    /* renamed from: c0 */
    public j W(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return new j(this, dVar, iVar, oVar, bool);
    }
}

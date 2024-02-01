package y5;

import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.o;
import j5.a;
import java.io.IOException;
import java.util.Iterator;
import u5.i;

@a
public class r extends b<Iterable<?>> {
    public r(j jVar, boolean z10, i iVar) {
        super((Class<?>) Iterable.class, jVar, z10, iVar, (o<Object>) null);
    }

    public r(r rVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super((b<?>) rVar, dVar, iVar, oVar, bool);
    }

    public com.fasterxml.jackson.databind.ser.i<?> M(i iVar) {
        return new r(this, this.S, iVar, this.W, this.U);
    }

    /* renamed from: X */
    public boolean Q(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    /* renamed from: Y */
    public boolean h(e0 e0Var, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    /* renamed from: Z */
    public final void m(Iterable<?> iterable, w4.i iVar, e0 e0Var) throws IOException {
        if (((this.U != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.U != Boolean.TRUE) || !Q(iterable)) {
            iVar.T2(iterable);
            U(iterable, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(iterable, iVar, e0Var);
    }

    /* renamed from: a0 */
    public void U(Iterable<?> iterable, w4.i iVar, e0 e0Var) throws IOException {
        o<Object> oVar;
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            i iVar2 = this.V;
            Class<?> cls = null;
            o<Object> oVar2 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    e0Var.R(iVar);
                } else {
                    o<Object> oVar3 = this.W;
                    if (oVar3 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            oVar2 = e0Var.i0(cls2, this.S);
                            cls = cls2;
                        }
                        oVar = oVar2;
                    } else {
                        o<Object> oVar4 = oVar3;
                        oVar = oVar2;
                        oVar2 = oVar4;
                    }
                    if (iVar2 == null) {
                        oVar2.m(next, iVar, e0Var);
                    } else {
                        oVar2.n(next, iVar, e0Var, iVar2);
                    }
                    oVar2 = oVar;
                }
            } while (it.hasNext());
        }
    }

    /* renamed from: b0 */
    public r W(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return new r(this, dVar, iVar, oVar, bool);
    }
}

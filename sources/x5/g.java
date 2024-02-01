package x5;

import i5.d;
import i5.e0;
import i5.j;
import i5.o;
import j5.a;
import java.io.IOException;
import java.util.Iterator;
import u5.i;
import y5.b;

@a
public class g extends b<Iterator<?>> {
    public g(j jVar, boolean z10, i iVar) {
        super((Class<?>) Iterator.class, jVar, z10, iVar, (o<Object>) null);
    }

    public g(g gVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super((b<?>) gVar, dVar, iVar, oVar, bool);
    }

    public com.fasterxml.jackson.databind.ser.i<?> M(i iVar) {
        return new g(this, this.S, iVar, this.W, this.U);
    }

    public void X(Iterator<?> it, w4.i iVar, e0 e0Var) throws IOException {
        i iVar2 = this.V;
        k kVar = this.X;
        do {
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
        } while (it.hasNext());
    }

    /* renamed from: Y */
    public boolean Q(Iterator<?> it) {
        return false;
    }

    /* renamed from: Z */
    public boolean h(e0 e0Var, Iterator<?> it) {
        return !it.hasNext();
    }

    /* renamed from: a0 */
    public final void m(Iterator<?> it, w4.i iVar, e0 e0Var) throws IOException {
        iVar.T2(it);
        U(it, iVar, e0Var);
        iVar.f2();
    }

    /* renamed from: b0 */
    public void U(Iterator<?> it, w4.i iVar, e0 e0Var) throws IOException {
        if (it.hasNext()) {
            o<Object> oVar = this.W;
            if (oVar == null) {
                X(it, iVar, e0Var);
                return;
            }
            i iVar2 = this.V;
            do {
                Object next = it.next();
                if (next == null) {
                    e0Var.R(iVar);
                } else if (iVar2 == null) {
                    oVar.m(next, iVar, e0Var);
                } else {
                    oVar.n(next, iVar, e0Var, iVar2);
                }
            } while (it.hasNext());
        }
    }

    /* renamed from: c0 */
    public g W(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return new g(this, dVar, iVar, oVar, bool);
    }
}

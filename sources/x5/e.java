package x5;

import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.o;
import j5.a;
import java.io.IOException;
import java.util.List;
import u5.i;
import y5.b;

@a
public final class e extends b<List<?>> {
    public static final long Y = 1;

    public e(j jVar, boolean z10, i iVar, o<Object> oVar) {
        super((Class<?>) List.class, jVar, z10, iVar, oVar);
    }

    public e(e eVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super((b<?>) eVar, dVar, iVar, oVar, bool);
    }

    public com.fasterxml.jackson.databind.ser.i<?> M(i iVar) {
        return new e(this, this.S, iVar, this.W, this.U);
    }

    /* renamed from: X */
    public boolean Q(List<?> list) {
        return list.size() == 1;
    }

    /* renamed from: Y */
    public boolean h(e0 e0Var, List<?> list) {
        return list.isEmpty();
    }

    /* renamed from: Z */
    public final void m(List<?> list, w4.i iVar, e0 e0Var) throws IOException {
        int size = list.size();
        if (size != 1 || ((this.U != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.U != Boolean.TRUE)) {
            iVar.U2(list, size);
            U(list, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(list, iVar, e0Var);
    }

    /* renamed from: a0 */
    public void U(List<?> list, w4.i iVar, e0 e0Var) throws IOException {
        o<Object> oVar = this.W;
        if (oVar != null) {
            b0(list, iVar, e0Var, oVar);
        } else if (this.V != null) {
            c0(list, iVar, e0Var);
        } else {
            int size = list.size();
            if (size != 0) {
                try {
                    k kVar = this.X;
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = list.get(i10);
                        if (obj == null) {
                            e0Var.R(iVar);
                        } else {
                            Class<?> cls = obj.getClass();
                            o<Object> n10 = kVar.n(cls);
                            if (n10 == null) {
                                n10 = this.R.i() ? S(kVar, e0Var.k(this.R, cls), e0Var) : T(kVar, cls, e0Var);
                                kVar = this.X;
                            }
                            n10.m(obj, iVar, e0Var);
                        }
                    }
                } catch (Exception e10) {
                    K(e0Var, e10, list, 0);
                }
            }
        }
    }

    public void b0(List<?> list, w4.i iVar, e0 e0Var, o<Object> oVar) throws IOException {
        int size = list.size();
        if (size != 0) {
            i iVar2 = this.V;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj == null) {
                    try {
                        e0Var.R(iVar);
                    } catch (Exception e10) {
                        K(e0Var, e10, list, i10);
                    }
                } else if (iVar2 == null) {
                    oVar.m(obj, iVar, e0Var);
                } else {
                    oVar.n(obj, iVar, e0Var, iVar2);
                }
            }
        }
    }

    public void c0(List<?> list, w4.i iVar, e0 e0Var) throws IOException {
        int size = list.size();
        if (size != 0) {
            try {
                i iVar2 = this.V;
                k kVar = this.X;
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (obj == null) {
                        e0Var.R(iVar);
                    } else {
                        Class<?> cls = obj.getClass();
                        o<Object> n10 = kVar.n(cls);
                        if (n10 == null) {
                            n10 = this.R.i() ? S(kVar, e0Var.k(this.R, cls), e0Var) : T(kVar, cls, e0Var);
                            kVar = this.X;
                        }
                        n10.n(obj, iVar, e0Var, iVar2);
                    }
                }
            } catch (Exception e10) {
                K(e0Var, e10, list, 0);
            }
        }
    }

    /* renamed from: d0 */
    public e W(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return new e(this, dVar, iVar, oVar, bool);
    }
}

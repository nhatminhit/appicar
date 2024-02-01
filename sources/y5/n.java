package y5;

import i5.d;
import i5.d0;
import i5.e0;
import i5.j;
import i5.o;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import u5.i;

public class n extends b<EnumSet<? extends Enum<?>>> {
    public n(j jVar) {
        super((Class<?>) EnumSet.class, jVar, true, (i) null, (o<Object>) null);
    }

    public n(n nVar, d dVar, i iVar, o<?> oVar, Boolean bool) {
        super((b<?>) nVar, dVar, iVar, oVar, bool);
    }

    /* renamed from: X */
    public n M(i iVar) {
        return this;
    }

    /* renamed from: Y */
    public boolean Q(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    /* renamed from: Z */
    public boolean h(e0 e0Var, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    /* renamed from: a0 */
    public final void m(EnumSet<? extends Enum<?>> enumSet, w4.i iVar, e0 e0Var) throws IOException {
        int size = enumSet.size();
        if (size != 1 || ((this.U != null || !e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.U != Boolean.TRUE)) {
            iVar.U2(enumSet, size);
            U(enumSet, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(enumSet, iVar, e0Var);
    }

    /* renamed from: b0 */
    public void U(EnumSet<? extends Enum<?>> enumSet, w4.i iVar, e0 e0Var) throws IOException {
        o<Object> oVar = this.W;
        Iterator<? extends Enum<?>> it = enumSet.iterator();
        while (it.hasNext()) {
            Enum enumR = (Enum) it.next();
            if (oVar == null) {
                oVar = e0Var.U(enumR.getDeclaringClass(), this.S);
            }
            oVar.m(enumR, iVar, e0Var);
        }
    }

    /* renamed from: c0 */
    public n W(d dVar, i iVar, o<?> oVar, Boolean bool) {
        return new n(this, dVar, iVar, oVar, bool);
    }
}

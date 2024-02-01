package y5;

import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.ser.j;
import g5.c;
import i5.d;
import i5.d0;
import i5.e0;
import i5.o;
import java.io.IOException;
import w4.p;

public abstract class a<T> extends i<T> implements j {
    public final d R;
    public final Boolean S;

    public a(Class<T> cls) {
        super(cls);
        this.R = null;
        this.S = null;
    }

    @Deprecated
    public a(Class<T> cls, d dVar) {
        super(cls);
        this.R = dVar;
        this.S = null;
    }

    public a(a<?> aVar) {
        super(aVar.O, false);
        this.R = aVar.R;
        this.S = aVar.S;
    }

    @Deprecated
    public a(a<?> aVar, d dVar) {
        super(aVar.O, false);
        this.R = dVar;
        this.S = aVar.S;
    }

    public a(a<?> aVar, d dVar, Boolean bool) {
        super(aVar.O, false);
        this.R = dVar;
        this.S = bool;
    }

    public final boolean S(e0 e0Var) {
        Boolean bool = this.S;
        return bool == null ? e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public abstract o<?> T(d dVar, Boolean bool);

    public abstract void U(T t10, w4.i iVar, e0 e0Var) throws IOException;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = (r2 = z(r2, r3, g())).h(v4.n.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r2, i5.d r3) throws i5.l {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x001b
            java.lang.Class r0 = r1.g()
            v4.n$d r2 = r1.z(r2, r3, r0)
            if (r2 == 0) goto L_0x001b
            v4.n$a r0 = v4.n.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r2 = r2.h(r0)
            java.lang.Boolean r0 = r1.S
            if (r2 == r0) goto L_0x001b
            i5.o r2 = r1.T(r3, r2)
            return r2
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.a.d(i5.e0, i5.d):i5.o");
    }

    public void m(T t10, w4.i iVar, e0 e0Var) throws IOException {
        if (!S(e0Var) || !Q(t10)) {
            iVar.T2(t10);
            U(t10, iVar, e0Var);
            iVar.f2();
            return;
        }
        U(t10, iVar, e0Var);
    }

    public final void n(T t10, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(t10, p.START_ARRAY));
        iVar.A1(t10);
        U(t10, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}

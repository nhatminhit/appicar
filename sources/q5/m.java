package q5;

import i5.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public abstract class m extends h {
    public static final long S = 1;
    public final p[] R;

    public m(d0 d0Var, p pVar, p[] pVarArr) {
        super(d0Var, pVar);
        this.R = pVarArr;
    }

    public m(m mVar, p[] pVarArr) {
        super(mVar);
        this.R = pVarArr;
    }

    public final l A(int i10) {
        return new l(this, D(i10), this.O, B(i10), i10);
    }

    public final p B(int i10) {
        p[] pVarArr = this.R;
        if (pVarArr == null || i10 < 0 || i10 >= pVarArr.length) {
            return null;
        }
        return pVarArr[i10];
    }

    public abstract int C();

    public abstract j D(int i10);

    public abstract Class<?> E(int i10);

    public l F(int i10, p pVar) {
        this.R[i10] = pVar;
        return A(i10);
    }

    public final void u(int i10, Annotation annotation) {
        p pVar = this.R[i10];
        if (pVar == null) {
            pVar = new p();
            this.R[i10] = pVar;
        }
        pVar.e(annotation);
    }

    public abstract Object v() throws Exception;

    public abstract Object w(Object[] objArr) throws Exception;

    public abstract Object x(Object obj) throws Exception;

    public final int y() {
        return this.P.size();
    }

    @Deprecated
    public abstract Type z(int i10);
}

package z5;

import g5.c;
import i5.e0;
import i5.j;
import i5.n;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p7.f;
import w4.i;
import w4.p;

public abstract class l extends j implements n {
    public static final long Y = 1;
    public static final m Z = m.h();

    /* renamed from: a0  reason: collision with root package name */
    public static final j[] f15875a0 = new j[0];
    public final j U;
    public final j[] V;
    public final m W;
    public volatile transient String X;

    public l(Class<?> cls, m mVar, j jVar, j[] jVarArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this.W = mVar == null ? Z : mVar;
        this.U = jVar;
        this.V = jVarArr;
    }

    public l(l lVar) {
        super(lVar);
        this.U = lVar.U;
        this.V = lVar.V;
        this.W = lVar.W;
    }

    public static j j0(Class<?> cls) {
        if (cls.getSuperclass() == null) {
            return null;
        }
        return n.l0();
    }

    public static StringBuilder k0(Class<?> cls, StringBuilder sb2, boolean z10) {
        char c10;
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = name.charAt(i10);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb2.append(charAt);
            }
            if (z10) {
                c10 = f.f11697h;
            }
            return sb2;
        } else if (cls == Boolean.TYPE) {
            c10 = 'Z';
        } else if (cls == Byte.TYPE) {
            c10 = 'B';
        } else if (cls == Short.TYPE) {
            c10 = 'S';
        } else if (cls == Character.TYPE) {
            c10 = 'C';
        } else if (cls == Integer.TYPE) {
            c10 = 'I';
        } else if (cls == Long.TYPE) {
            c10 = 'J';
        } else if (cls == Float.TYPE) {
            c10 = 'F';
        } else if (cls == Double.TYPE) {
            c10 = 'D';
        } else if (cls == Void.TYPE) {
            c10 = 'V';
        } else {
            throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
        }
        sb2.append(c10);
        return sb2;
    }

    /* renamed from: A */
    public j a(int i10) {
        return this.W.k(i10);
    }

    public final j C(Class<?> cls) {
        j C;
        j[] jVarArr;
        if (cls == this.O) {
            return this;
        }
        if (cls.isInterface() && (jVarArr = this.V) != null) {
            int length = jVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                j C2 = this.V[i10].C(cls);
                if (C2 != null) {
                    return C2;
                }
            }
        }
        j jVar = this.U;
        if (jVar == null || (C = jVar.C(cls)) == null) {
            return null;
        }
        return C;
    }

    public j[] D(Class<?> cls) {
        j C = C(cls);
        return C == null ? f15875a0 : C.F().q();
    }

    public m F() {
        return this.W;
    }

    public abstract StringBuilder K(StringBuilder sb2);

    public abstract StringBuilder M(StringBuilder sb2);

    public List<j> N() {
        j[] jVarArr = this.V;
        if (jVarArr == null) {
            return Collections.emptyList();
        }
        int length = jVarArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(jVarArr) : Collections.singletonList(jVarArr[0]) : Collections.emptyList();
    }

    public j Q() {
        return this.U;
    }

    public int b() {
        return this.W.p();
    }

    @Deprecated
    public String c(int i10) {
        return this.W.j(i10);
    }

    public String l0() {
        return this.O.getName();
    }

    public void r(i iVar, e0 e0Var) throws IOException, w4.n {
        iVar.Z2(x());
    }

    public String x() {
        String str = this.X;
        return str == null ? l0() : str;
    }

    public void y(i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c cVar = new c(this, p.VALUE_STRING);
        iVar2.o(iVar, cVar);
        r(iVar, e0Var);
        iVar2.v(iVar, cVar);
    }
}

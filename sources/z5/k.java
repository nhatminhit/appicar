package z5;

import i5.j;
import java.util.Collection;
import java.util.Map;
import p7.f;

public class k extends l {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f15874b0 = 1;

    public k(Class<?> cls) {
        this(cls, m.h(), (j) null, (j[]) null);
    }

    public k(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        this(cls, mVar, jVar, jVarArr, (Object) null, (Object) null, false);
    }

    public k(Class<?> cls, m mVar, j jVar, j[] jVarArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, i10, obj, obj2, z10);
    }

    public k(Class<?> cls, m mVar, j jVar, j[] jVarArr, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, 0, obj, obj2, z10);
    }

    public k(l lVar) {
        super(lVar);
    }

    public static j m0(Class<?> cls, m mVar) {
        if (cls == null) {
            return null;
        }
        if (cls == Object.class) {
            return n.l0();
        }
        return new k(cls, mVar, m0(cls.getSuperclass(), mVar), (j[]) null, (Object) null, (Object) null, false);
    }

    @Deprecated
    public static k n0(Class<?> cls) {
        if (Map.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Map (class: " + cls.getName() + ")");
        } else if (Collection.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Cannot construct SimpleType for a Collection (class: " + cls.getName() + ")");
        } else if (!cls.isArray()) {
            m h10 = m.h();
            return new k(cls, h10, m0(cls.getSuperclass(), h10), (j[]) null, (Object) null, (Object) null, false);
        } else {
            throw new IllegalArgumentException("Cannot construct SimpleType for an array (class: " + cls.getName() + ")");
        }
    }

    public static k o0(Class<?> cls) {
        return new k(cls, (m) null, (j) null, (j[]) null, (Object) null, (Object) null, false);
    }

    public StringBuilder K(StringBuilder sb2) {
        return l.k0(this.O, sb2, true);
    }

    public StringBuilder M(StringBuilder sb2) {
        l.k0(this.O, sb2, false);
        int p10 = this.W.p();
        if (p10 > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < p10; i10++) {
                sb2 = a(i10).M(sb2);
            }
            sb2.append('>');
        }
        sb2.append(f.f11697h);
        return sb2;
    }

    public boolean T() {
        return false;
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return null;
    }

    public j c0(j jVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    public j d0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.O != this.O) {
            return false;
        }
        return this.W.equals(kVar.W);
    }

    public String l0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O.getName());
        int p10 = this.W.p();
        if (p10 > 0) {
            sb2.append('<');
            for (int i10 = 0; i10 < p10; i10++) {
                j A = a(i10);
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(A.x());
            }
            sb2.append('>');
        }
        return sb2.toString();
    }

    public boolean o() {
        return false;
    }

    /* renamed from: p0 */
    public k e0(Object obj) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
    }

    /* renamed from: q0 */
    public k g0() {
        return this.S ? this : new k(this.O, this.W, this.U, this.V, this.Q, this.R, true);
    }

    /* renamed from: r0 */
    public k h0(Object obj) {
        if (this.R == obj) {
            return this;
        }
        return new k(this.O, this.W, this.U, this.V, this.Q, obj, this.S);
    }

    /* renamed from: s0 */
    public k i0(Object obj) {
        if (obj == this.Q) {
            return this;
        }
        return new k(this.O, this.W, this.U, this.V, obj, this.R, this.S);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[simple type, class ");
        sb2.append(l0());
        sb2.append(']');
        return sb2.toString();
    }

    @Deprecated
    public j z(Class<?> cls) {
        Class<?> cls2 = this.O;
        if (cls2 == cls) {
            return this;
        }
        if (!cls2.isAssignableFrom(cls)) {
            return new k(cls, this.W, this, this.V, this.Q, this.R, this.S);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Class<?> cls3 = this.O;
        if (superclass == cls3) {
            return new k(cls, this.W, this, this.V, this.Q, this.R, this.S);
        } else if (superclass == null || !cls3.isAssignableFrom(superclass)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i10 = 0;
            while (i10 < length) {
                Class<?> cls4 = interfaces[i10];
                Class<?> cls5 = this.O;
                if (cls4 == cls5) {
                    return new k(cls, this.W, (j) null, new j[]{this}, this.Q, this.R, this.S);
                } else if (cls5.isAssignableFrom(cls4)) {
                    return new k(cls, this.W, (j) null, new j[]{z(cls4)}, this.Q, this.R, this.S);
                } else {
                    i10++;
                }
            }
            throw new IllegalArgumentException("Internal error: Cannot resolve sub-type for Class " + cls.getName() + " to " + this.O.getName());
        } else {
            return new k(cls, this.W, z(superclass), (j[]) null, this.Q, this.R, this.S);
        }
    }
}

package z5;

import i5.j;
import java.lang.reflect.TypeVariable;

public final class e extends d {

    /* renamed from: d0  reason: collision with root package name */
    public static final long f15861d0 = 1;

    public e(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, jVar2, obj, obj2, z10);
    }

    public e(l lVar, j jVar) {
        super(lVar, jVar);
    }

    @Deprecated
    public static e v0(Class<?> cls, j jVar) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        return new e(cls, (typeParameters == null || typeParameters.length != 1) ? m.h() : m.b(cls, jVar), l.j0(cls), (j[]) null, jVar, (Object) null, (Object) null, false);
    }

    public static e w0(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2) {
        return new e(cls, mVar, jVar, jVarArr, jVar2, (Object) null, (Object) null, false);
    }

    /* renamed from: A0 */
    public e t0(Object obj) {
        return new e(this.O, this.W, this.U, this.V, this.f15860b0, this.Q, obj, this.S);
    }

    /* renamed from: B0 */
    public e u0(Object obj) {
        return new e(this.O, this.W, this.U, this.V, this.f15860b0, obj, this.R, this.S);
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new e(cls, mVar, jVar, jVarArr, this.f15860b0, this.Q, this.R, this.S);
    }

    public j c0(j jVar) {
        if (this.f15860b0 == jVar) {
            return this;
        }
        return new e(this.O, this.W, this.U, this.V, jVar, this.Q, this.R, this.S);
    }

    public String toString() {
        return "[collection type; class " + this.O.getName() + ", contains " + this.f15860b0 + "]";
    }

    /* renamed from: x0 */
    public e q0(Object obj) {
        return new e(this.O, this.W, this.U, this.V, this.f15860b0.h0(obj), this.Q, this.R, this.S);
    }

    /* renamed from: y0 */
    public e r0(Object obj) {
        return new e(this.O, this.W, this.U, this.V, this.f15860b0.i0(obj), this.Q, this.R, this.S);
    }

    @Deprecated
    public j z(Class<?> cls) {
        return new e(cls, this.W, this.U, this.V, this.f15860b0, (Object) null, (Object) null, this.S);
    }

    /* renamed from: z0 */
    public e s0() {
        return this.S ? this : new e(this.O, this.W, this.U, this.V, this.f15860b0.g0(), this.Q, this.R, true);
    }
}

package z5;

import i5.j;
import java.lang.reflect.TypeVariable;

public final class g extends f {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f15865e0 = 1;

    public g(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2, j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, jVar2, jVar3, obj, obj2, z10);
    }

    public g(l lVar, j jVar, j jVar2) {
        super(lVar, jVar, jVar2);
    }

    @Deprecated
    public static g x0(Class<?> cls, j jVar, j jVar2) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        return new g(cls, (typeParameters == null || typeParameters.length != 2) ? m.h() : m.c(cls, jVar, jVar2), l.j0(cls), (j[]) null, jVar, jVar2, (Object) null, (Object) null, false);
    }

    public static g y0(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2, j jVar3) {
        return new g(cls, mVar, jVar, jVarArr, jVar2, jVar3, (Object) null, (Object) null, false);
    }

    /* renamed from: A0 */
    public g q0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0.i0(obj), this.Q, this.R, this.S);
    }

    /* renamed from: B0 */
    public g r0(j jVar) {
        if (jVar == this.f15863b0) {
            return this;
        }
        return new g(this.O, this.W, this.U, this.V, jVar, this.f15864c0, this.Q, this.R, this.S);
    }

    /* renamed from: C0 */
    public g s0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0.h0(obj), this.f15864c0, this.Q, this.R, this.S);
    }

    /* renamed from: D0 */
    public g t0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0.i0(obj), this.f15864c0, this.Q, this.R, this.S);
    }

    /* renamed from: E0 */
    public g u0() {
        return this.S ? this : new g(this.O, this.W, this.U, this.V, this.f15863b0.g0(), this.f15864c0.g0(), this.Q, this.R, true);
    }

    /* renamed from: F0 */
    public g v0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0, this.Q, obj, this.S);
    }

    /* renamed from: G0 */
    public g w0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0, obj, this.R, this.S);
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new g(cls, mVar, jVar, jVarArr, this.f15863b0, this.f15864c0, this.Q, this.R, this.S);
    }

    public j c0(j jVar) {
        if (this.f15864c0 == jVar) {
            return this;
        }
        return new g(this.O, this.W, this.U, this.V, this.f15863b0, jVar, this.Q, this.R, this.S);
    }

    public String toString() {
        return "[map type; class " + this.O.getName() + ", " + this.f15863b0 + " -> " + this.f15864c0 + "]";
    }

    @Deprecated
    public j z(Class<?> cls) {
        return new g(cls, this.W, this.U, this.V, this.f15863b0, this.f15864c0, this.Q, this.R, this.S);
    }

    /* renamed from: z0 */
    public g p0(Object obj) {
        return new g(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0.h0(obj), this.Q, this.R, this.S);
    }
}

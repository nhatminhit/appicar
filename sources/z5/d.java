package z5;

import i5.j;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public class d extends l {

    /* renamed from: c0  reason: collision with root package name */
    public static final long f15859c0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final j f15860b0;

    public d(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, jVar2.hashCode(), obj, obj2, z10);
        this.f15860b0 = jVar2;
    }

    public d(l lVar, j jVar) {
        super(lVar);
        this.f15860b0 = jVar;
    }

    @Deprecated
    public static d m0(Class<?> cls, j jVar) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        return new d(cls, (typeParameters == null || typeParameters.length != 1) ? m.h() : m.b(cls, jVar), l.j0(cls), (j[]) null, jVar, (Object) null, (Object) null, false);
    }

    public static d n0(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2) {
        return new d(cls, mVar, jVar, jVarArr, jVar2, (Object) null, (Object) null, false);
    }

    public static d p0(j jVar, j jVar2) {
        if (jVar instanceof l) {
            return new d((l) jVar, jVar2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + jVar.getClass());
    }

    /* renamed from: G */
    public j d() {
        return this.f15860b0;
    }

    public Object H() {
        return this.f15860b0.R();
    }

    public Object I() {
        return this.f15860b0.S();
    }

    public StringBuilder K(StringBuilder sb2) {
        return l.k0(this.O, sb2, true);
    }

    public StringBuilder M(StringBuilder sb2) {
        l.k0(this.O, sb2, false);
        sb2.append('<');
        this.f15860b0.M(sb2);
        sb2.append(">;");
        return sb2;
    }

    public boolean U() {
        return super.U() || this.f15860b0.U();
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new d(cls, mVar, jVar, jVarArr, this.f15860b0, this.Q, this.R, this.S);
    }

    public j c0(j jVar) {
        if (this.f15860b0 == jVar) {
            return this;
        }
        return new d(this.O, this.W, this.U, this.V, jVar, this.Q, this.R, this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.O == dVar.O && this.f15860b0.equals(dVar.f15860b0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f15860b0.f0(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j f0(i5.j r3) {
        /*
            r2 = this;
            i5.j r0 = super.f0(r3)
            i5.j r3 = r3.d()
            if (r3 == 0) goto L_0x0018
            i5.j r1 = r2.f15860b0
            i5.j r3 = r1.f0(r3)
            i5.j r1 = r2.f15860b0
            if (r3 == r1) goto L_0x0018
            i5.j r0 = r0.c0(r3)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.f0(i5.j):i5.j");
    }

    public String l0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O.getName());
        if (this.f15860b0 != null) {
            sb2.append('<');
            sb2.append(this.f15860b0.x());
            sb2.append('>');
        }
        return sb2.toString();
    }

    public boolean m() {
        return true;
    }

    public boolean o() {
        return true;
    }

    public boolean o0() {
        return Collection.class.isAssignableFrom(this.O);
    }

    /* renamed from: q0 */
    public d d0(Object obj) {
        return new d(this.O, this.W, this.U, this.V, this.f15860b0.h0(obj), this.Q, this.R, this.S);
    }

    /* renamed from: r0 */
    public d e0(Object obj) {
        return new d(this.O, this.W, this.U, this.V, this.f15860b0.i0(obj), this.Q, this.R, this.S);
    }

    /* renamed from: s0 */
    public d g0() {
        return this.S ? this : new d(this.O, this.W, this.U, this.V, this.f15860b0.g0(), this.Q, this.R, true);
    }

    /* renamed from: t0 */
    public d h0(Object obj) {
        return new d(this.O, this.W, this.U, this.V, this.f15860b0, this.Q, obj, this.S);
    }

    public String toString() {
        return "[collection-like type; class " + this.O.getName() + ", contains " + this.f15860b0 + "]";
    }

    /* renamed from: u0 */
    public d i0(Object obj) {
        return new d(this.O, this.W, this.U, this.V, this.f15860b0, obj, this.R, this.S);
    }

    @Deprecated
    public j z(Class<?> cls) {
        return new d(cls, this.W, this.U, this.V, this.f15860b0, this.Q, this.R, this.S);
    }
}

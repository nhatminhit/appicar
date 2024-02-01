package z5;

import i5.j;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public class f extends l {

    /* renamed from: d0  reason: collision with root package name */
    public static final long f15862d0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final j f15863b0;

    /* renamed from: c0  reason: collision with root package name */
    public final j f15864c0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2, j jVar3, Object obj, Object obj2, boolean z10) {
        super(cls, mVar, jVar, jVarArr, jVar2.hashCode() ^ jVar3.hashCode(), obj, obj2, z10);
        this.f15863b0 = jVar2;
        this.f15864c0 = jVar3;
    }

    public f(l lVar, j jVar, j jVar2) {
        super(lVar);
        this.f15863b0 = jVar;
        this.f15864c0 = jVar2;
    }

    @Deprecated
    public static f m0(Class<?> cls, j jVar, j jVar2) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        return new f(cls, (typeParameters == null || typeParameters.length != 2) ? m.h() : m.c(cls, jVar, jVar2), l.j0(cls), (j[]) null, jVar, jVar2, (Object) null, (Object) null, false);
    }

    public static f o0(j jVar, j jVar2, j jVar3) {
        if (jVar instanceof l) {
            return new f((l) jVar, jVar2, jVar3);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + jVar.getClass());
    }

    /* renamed from: G */
    public j d() {
        return this.f15864c0;
    }

    public Object H() {
        return this.f15864c0.R();
    }

    public Object I() {
        return this.f15864c0.S();
    }

    public StringBuilder K(StringBuilder sb2) {
        return l.k0(this.O, sb2, true);
    }

    public StringBuilder M(StringBuilder sb2) {
        l.k0(this.O, sb2, false);
        sb2.append('<');
        this.f15863b0.M(sb2);
        this.f15864c0.M(sb2);
        sb2.append(">;");
        return sb2;
    }

    /* renamed from: O */
    public j e() {
        return this.f15863b0;
    }

    public boolean U() {
        return super.U() || this.f15864c0.U() || this.f15863b0.U();
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new f(cls, mVar, jVar, jVarArr, this.f15863b0, this.f15864c0, this.Q, this.R, this.S);
    }

    public j c0(j jVar) {
        if (this.f15864c0 == jVar) {
            return this;
        }
        return new f(this.O, this.W, this.U, this.V, this.f15863b0, jVar, this.Q, this.R, this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.O == fVar.O && this.f15863b0.equals(fVar.f15863b0) && this.f15864c0.equals(fVar.f15864c0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = r3.f15864c0.f0(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j f0(i5.j r4) {
        /*
            r3 = this;
            i5.j r0 = super.f0(r4)
            i5.j r1 = r4.e()
            boolean r2 = r0 instanceof z5.f
            if (r2 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            i5.j r2 = r3.f15863b0
            i5.j r1 = r2.f0(r1)
            i5.j r2 = r3.f15863b0
            if (r1 == r2) goto L_0x001e
            z5.f r0 = (z5.f) r0
            z5.f r0 = r0.r0(r1)
        L_0x001e:
            i5.j r4 = r4.d()
            if (r4 == 0) goto L_0x0032
            i5.j r1 = r3.f15864c0
            i5.j r4 = r1.f0(r4)
            i5.j r1 = r3.f15864c0
            if (r4 == r1) goto L_0x0032
            i5.j r0 = r0.c0(r4)
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.f.f0(i5.j):i5.j");
    }

    public String l0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.O.getName());
        if (this.f15863b0 != null) {
            sb2.append('<');
            sb2.append(this.f15863b0.x());
            sb2.append(',');
            sb2.append(this.f15864c0.x());
            sb2.append('>');
        }
        return sb2.toString();
    }

    public boolean n0() {
        return Map.class.isAssignableFrom(this.O);
    }

    public boolean o() {
        return true;
    }

    /* renamed from: p0 */
    public f d0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0.h0(obj), this.Q, this.R, this.S);
    }

    /* renamed from: q0 */
    public f e0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0.i0(obj), this.Q, this.R, this.S);
    }

    public f r0(j jVar) {
        if (jVar == this.f15863b0) {
            return this;
        }
        return new f(this.O, this.W, this.U, this.V, jVar, this.f15864c0, this.Q, this.R, this.S);
    }

    public f s0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0.h0(obj), this.f15864c0, this.Q, this.R, this.S);
    }

    public boolean t() {
        return true;
    }

    public f t0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0.i0(obj), this.f15864c0, this.Q, this.R, this.S);
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", new Object[]{this.O.getName(), this.f15863b0, this.f15864c0});
    }

    /* renamed from: u0 */
    public f g0() {
        return this.S ? this : new f(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0.g0(), this.Q, this.R, true);
    }

    /* renamed from: v0 */
    public f h0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0, this.Q, obj, this.S);
    }

    /* renamed from: w0 */
    public f i0(Object obj) {
        return new f(this.O, this.W, this.U, this.V, this.f15863b0, this.f15864c0, obj, this.R, this.S);
    }

    @Deprecated
    public j z(Class<?> cls) {
        return new f(cls, this.W, this.U, this.V, this.f15863b0, this.f15864c0, this.Q, this.R, this.S);
    }
}

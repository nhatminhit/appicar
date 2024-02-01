package z5;

import i5.j;
import java.lang.reflect.Array;

public final class a extends l {

    /* renamed from: d0  reason: collision with root package name */
    public static final long f15853d0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final j f15854b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Object f15855c0;

    public a(j jVar, m mVar, Object obj, Object obj2, Object obj3, boolean z10) {
        super(obj.getClass(), mVar, (j) null, (j[]) null, jVar.hashCode(), obj2, obj3, z10);
        this.f15854b0 = jVar;
        this.f15855c0 = obj;
    }

    public static a n0(j jVar, m mVar) {
        return o0(jVar, mVar, (Object) null, (Object) null);
    }

    public static a o0(j jVar, m mVar, Object obj, Object obj2) {
        return new a(jVar, mVar, Array.newInstance(jVar.g(), 0), obj, obj2, false);
    }

    /* renamed from: G */
    public j d() {
        return this.f15854b0;
    }

    public Object H() {
        return this.f15854b0.R();
    }

    public Object I() {
        return this.f15854b0.S();
    }

    public StringBuilder K(StringBuilder sb2) {
        sb2.append('[');
        return this.f15854b0.K(sb2);
    }

    public StringBuilder M(StringBuilder sb2) {
        sb2.append('[');
        return this.f15854b0.M(sb2);
    }

    public boolean U() {
        return super.U() || this.f15854b0.U();
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return null;
    }

    public j c0(j jVar) {
        return new a(jVar, this.W, Array.newInstance(jVar.g(), 0), this.Q, this.R, this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f15854b0.equals(((a) obj).f15854b0);
        }
        return false;
    }

    public boolean i() {
        return this.f15854b0.i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return true;
    }

    public final j m0() {
        throw new UnsupportedOperationException("Cannot narrow or widen array types");
    }

    public boolean n() {
        return true;
    }

    public boolean o() {
        return true;
    }

    /* renamed from: p0 */
    public a d0(Object obj) {
        return obj == this.f15854b0.R() ? this : new a(this.f15854b0.h0(obj), this.W, this.f15855c0, this.Q, this.R, this.S);
    }

    /* renamed from: q0 */
    public a e0(Object obj) {
        return obj == this.f15854b0.S() ? this : new a(this.f15854b0.i0(obj), this.W, this.f15855c0, this.Q, this.R, this.S);
    }

    /* renamed from: r0 */
    public a g0() {
        return this.S ? this : new a(this.f15854b0.g0(), this.W, this.f15855c0, this.Q, this.R, true);
    }

    /* renamed from: s0 */
    public a h0(Object obj) {
        if (obj == this.R) {
            return this;
        }
        return new a(this.f15854b0, this.W, this.f15855c0, this.Q, obj, this.S);
    }

    /* renamed from: t0 */
    public a i0(Object obj) {
        if (obj == this.Q) {
            return this;
        }
        return new a(this.f15854b0, this.W, this.f15855c0, obj, this.R, this.S);
    }

    public String toString() {
        return "[array type, component type: " + this.f15854b0 + "]";
    }

    @Deprecated
    public j z(Class<?> cls) {
        return m0();
    }
}

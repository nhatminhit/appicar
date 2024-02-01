package z5;

public class j extends l {

    /* renamed from: c0  reason: collision with root package name */
    public static final long f15872c0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public i5.j f15873b0;

    public j(Class<?> cls, m mVar) {
        super(cls, mVar, (i5.j) null, (i5.j[]) null, 0, (Object) null, (Object) null, false);
    }

    public m F() {
        i5.j jVar = this.f15873b0;
        return jVar != null ? jVar.F() : super.F();
    }

    public StringBuilder K(StringBuilder sb2) {
        i5.j jVar = this.f15873b0;
        return jVar != null ? jVar.K(sb2) : sb2;
    }

    public StringBuilder M(StringBuilder sb2) {
        i5.j jVar = this.f15873b0;
        if (jVar != null) {
            return jVar.K(sb2);
        }
        sb2.append("?");
        return sb2;
    }

    public i5.j Q() {
        i5.j jVar = this.f15873b0;
        return jVar != null ? jVar.Q() : super.Q();
    }

    public i5.j a0(Class<?> cls, m mVar, i5.j jVar, i5.j[] jVarArr) {
        return null;
    }

    public i5.j c0(i5.j jVar) {
        return this;
    }

    public i5.j d0(Object obj) {
        return this;
    }

    public i5.j e0(Object obj) {
        return this;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public i5.j g0() {
        return this;
    }

    public i5.j h0(Object obj) {
        return this;
    }

    public i5.j i0(Object obj) {
        return this;
    }

    public i5.j m0() {
        return this.f15873b0;
    }

    public void n0(i5.j jVar) {
        if (this.f15873b0 == null) {
            this.f15873b0 = jVar;
            return;
        }
        throw new IllegalStateException("Trying to re-set self reference; old value = " + this.f15873b0 + ", new = " + jVar);
    }

    public boolean o() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[recursive type; ");
        i5.j jVar = this.f15873b0;
        sb2.append(jVar == null ? "UNRESOLVED" : jVar.g().getName());
        return sb2.toString();
    }

    @Deprecated
    public i5.j z(Class<?> cls) {
        return this;
    }
}

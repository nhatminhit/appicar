package z5;

import i5.j;

public class h extends l {

    /* renamed from: d0  reason: collision with root package name */
    public static final long f15866d0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final int f15867b0;

    /* renamed from: c0  reason: collision with root package name */
    public j f15868c0;

    public h(int i10) {
        super(Object.class, m.h(), n.l0(), (j[]) null, 1, (Object) null, (Object) null, false);
        this.f15867b0 = i10;
    }

    public StringBuilder K(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this.f15867b0 + 1);
        return sb2;
    }

    public StringBuilder M(StringBuilder sb2) {
        return K(sb2);
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return (j) m0();
    }

    public j c0(j jVar) {
        return (j) m0();
    }

    public j d0(Object obj) {
        return (j) m0();
    }

    public j e0(Object obj) {
        return (j) m0();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public j g0() {
        return (j) m0();
    }

    public j h0(Object obj) {
        return (j) m0();
    }

    public j i0(Object obj) {
        return (j) m0();
    }

    public String l0() {
        return toString();
    }

    public final <T> T m0() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }

    public j n0() {
        return this.f15868c0;
    }

    public boolean o() {
        return false;
    }

    public void o0(j jVar) {
        this.f15868c0 = jVar;
    }

    public String toString() {
        return K(new StringBuilder()).toString();
    }

    @Deprecated
    public j z(Class<?> cls) {
        return (j) m0();
    }
}

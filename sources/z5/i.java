package z5;

import i5.j;

public class i extends k {

    /* renamed from: e0  reason: collision with root package name */
    public static final long f15869e0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    public final j f15870c0;

    /* renamed from: d0  reason: collision with root package name */
    public final j f15871d0;

    /* JADX WARNING: type inference failed for: r16v0, types: [i5.j] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(java.lang.Class<?> r11, z5.m r12, i5.j r13, i5.j[] r14, i5.j r15, i5.j r16, java.lang.Object r17, java.lang.Object r18, boolean r19) {
        /*
            r10 = this;
            r9 = r10
            int r5 = r15.hashCode()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r6 = r17
            r7 = r18
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r15
            r9.f15870c0 = r0
            if (r16 != 0) goto L_0x001a
            r0 = r9
            goto L_0x001c
        L_0x001a:
            r0 = r16
        L_0x001c:
            r9.f15871d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.i.<init>(java.lang.Class, z5.m, i5.j, i5.j[], i5.j, i5.j, java.lang.Object, java.lang.Object, boolean):void");
    }

    public i(l lVar, j jVar) {
        super(lVar);
        this.f15870c0 = jVar;
        this.f15871d0 = this;
    }

    @Deprecated
    public static i t0(Class<?> cls, j jVar) {
        return new i(cls, m.h(), (j) null, (j[]) null, (j) null, jVar, (Object) null, (Object) null, false);
    }

    public static i u0(Class<?> cls, m mVar, j jVar, j[] jVarArr, j jVar2) {
        return new i(cls, mVar, jVar, jVarArr, jVar2, (j) null, (Object) null, (Object) null, false);
    }

    public static i x0(j jVar, j jVar2) {
        if (jVar2 == null) {
            throw new IllegalArgumentException("Missing referencedType");
        } else if (jVar instanceof l) {
            return new i((l) jVar, jVar2);
        } else {
            throw new IllegalArgumentException("Cannot upgrade from an instance of " + jVar.getClass());
        }
    }

    /* renamed from: A0 */
    public i q0() {
        return this.S ? this : new i(this.O, this.W, this.U, this.V, this.f15870c0.g0(), this.f15871d0, this.Q, this.R, true);
    }

    /* renamed from: B0 */
    public i r0(Object obj) {
        if (obj == this.R) {
            return this;
        }
        return new i(this.O, this.W, this.U, this.V, this.f15870c0, this.f15871d0, this.Q, obj, this.S);
    }

    /* renamed from: C0 */
    public i s0(Object obj) {
        if (obj == this.Q) {
            return this;
        }
        return new i(this.O, this.W, this.U, this.V, this.f15870c0, this.f15871d0, obj, this.R, this.S);
    }

    /* renamed from: G */
    public j d() {
        return this.f15870c0;
    }

    public StringBuilder K(StringBuilder sb2) {
        return l.k0(this.O, sb2, true);
    }

    public StringBuilder M(StringBuilder sb2) {
        l.k0(this.O, sb2, false);
        sb2.append('<');
        StringBuilder M = this.f15870c0.M(sb2);
        M.append(">;");
        return M;
    }

    /* renamed from: P */
    public j h() {
        return this.f15870c0;
    }

    public boolean T() {
        return true;
    }

    public j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr) {
        return new i(cls, this.W, jVar, jVarArr, this.f15870c0, this.f15871d0, this.Q, this.R, this.S);
    }

    public j c0(j jVar) {
        if (this.f15870c0 == jVar) {
            return this;
        }
        return new i(this.O, this.W, this.U, this.V, jVar, this.f15871d0, this.Q, this.R, this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.O != this.O) {
            return false;
        }
        return this.f15870c0.equals(iVar.f15870c0);
    }

    public String l0() {
        return this.O.getName() + '<' + this.f15870c0.x() + '>';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("[reference type, class ");
        sb2.append(l0());
        sb2.append('<');
        sb2.append(this.f15870c0);
        sb2.append('>');
        sb2.append(']');
        return sb2.toString();
    }

    public boolean v() {
        return true;
    }

    public j v0() {
        return this.f15871d0;
    }

    public boolean w0() {
        return this.f15871d0 == this;
    }

    /* renamed from: y0 */
    public i d0(Object obj) {
        return obj == this.f15870c0.R() ? this : new i(this.O, this.W, this.U, this.V, this.f15870c0.h0(obj), this.f15871d0, this.Q, this.R, this.S);
    }

    @Deprecated
    public j z(Class<?> cls) {
        return new i(cls, this.W, this.U, this.V, this.f15870c0, this.f15871d0, this.Q, this.R, this.S);
    }

    /* renamed from: z0 */
    public i p0(Object obj) {
        if (obj == this.f15870c0.S()) {
            return this;
        }
        return new i(this.O, this.W, this.U, this.V, this.f15870c0.i0(obj), this.f15871d0, this.Q, this.R, this.S);
    }
}

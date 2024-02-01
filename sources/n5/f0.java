package n5;

import a6.h;
import i5.f;
import i5.g;
import i5.j;
import j5.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import l5.v;
import l5.y;
import q5.l;
import q5.m;

@a
public class f0 extends y implements Serializable {

    /* renamed from: f0  reason: collision with root package name */
    public static final long f10833f0 = 1;
    public final String O;
    public final Class<?> P;
    public m Q;
    public m R;
    public v[] S;
    public j T;
    public m U;
    public v[] V;
    public j W;
    public m X;
    public v[] Y;
    public m Z;

    /* renamed from: a0  reason: collision with root package name */
    public m f10834a0;

    /* renamed from: b0  reason: collision with root package name */
    public m f10835b0;

    /* renamed from: c0  reason: collision with root package name */
    public m f10836c0;

    /* renamed from: d0  reason: collision with root package name */
    public m f10837d0;

    /* renamed from: e0  reason: collision with root package name */
    public l f10838e0;

    public f0(f fVar, j jVar) {
        this.O = jVar == null ? "UNKNOWN TYPE" : jVar.toString();
        this.P = jVar == null ? Object.class : jVar.g();
    }

    @Deprecated
    public f0(f fVar, Class<?> cls) {
        this.O = h.e0(cls);
        this.P = cls == null ? Object.class : cls;
    }

    public f0(f0 f0Var) {
        this.O = f0Var.O;
        this.P = f0Var.P;
        this.Q = f0Var.Q;
        this.S = f0Var.S;
        this.R = f0Var.R;
        this.T = f0Var.T;
        this.U = f0Var.U;
        this.V = f0Var.V;
        this.W = f0Var.W;
        this.X = f0Var.X;
        this.Y = f0Var.Y;
        this.Z = f0Var.Z;
        this.f10834a0 = f0Var.f10834a0;
        this.f10835b0 = f0Var.f10835b0;
        this.f10836c0 = f0Var.f10836c0;
        this.f10837d0 = f0Var.f10837d0;
    }

    public v[] A(f fVar) {
        return this.S;
    }

    public l B() {
        return this.f10838e0;
    }

    public Class<?> C() {
        return this.P;
    }

    public String D() {
        return this.O;
    }

    public m E() {
        return this.R;
    }

    public final Object F(m mVar, v[] vVarArr, g gVar, Object obj) throws IOException {
        if (mVar == null) {
            throw new IllegalStateException("No delegate constructor for " + D());
        } else if (vVarArr == null) {
            try {
                return mVar.x(obj);
            } catch (Throwable th2) {
                throw O(gVar, th2);
            }
        } else {
            int length = vVarArr.length;
            Object[] objArr = new Object[length];
            for (int i10 = 0; i10 < length; i10++) {
                v vVar = vVarArr[i10];
                if (vVar == null) {
                    objArr[i10] = obj;
                } else {
                    objArr[i10] = gVar.M(vVar.z(), vVar, (Object) null);
                }
            }
            return mVar.w(objArr);
        }
    }

    public void G(m mVar, j jVar, v[] vVarArr) {
        this.X = mVar;
        this.W = jVar;
        this.Y = vVarArr;
    }

    public void H(m mVar) {
        this.f10837d0 = mVar;
    }

    public void I(m mVar) {
        this.f10836c0 = mVar;
    }

    public void J(m mVar) {
        this.f10834a0 = mVar;
    }

    public void K(m mVar) {
        this.f10835b0 = mVar;
    }

    public void L(m mVar, m mVar2, j jVar, v[] vVarArr, m mVar3, v[] vVarArr2) {
        this.Q = mVar;
        this.U = mVar2;
        this.T = jVar;
        this.V = vVarArr;
        this.R = mVar3;
        this.S = vVarArr2;
    }

    public void M(m mVar) {
        this.Z = mVar;
    }

    public void N(l lVar) {
        this.f10838e0 = lVar;
    }

    public i5.l O(g gVar, Throwable th2) {
        Throwable cause;
        if (((th2 instanceof ExceptionInInitializerError) || (th2 instanceof InvocationTargetException)) && (cause = th2.getCause()) != null) {
            th2 = cause;
        }
        return Q(gVar, th2);
    }

    @Deprecated
    public i5.l P(g gVar, Throwable th2) {
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof i5.l) {
                return (i5.l) th3;
            }
        }
        return gVar.u0(C(), th2);
    }

    public i5.l Q(g gVar, Throwable th2) {
        return th2 instanceof i5.l ? (i5.l) th2 : gVar.u0(C(), th2);
    }

    @Deprecated
    public i5.l R(Throwable th2) {
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof i5.l) {
                return (i5.l) th3;
            }
        }
        return new i5.l((Closeable) null, "Instantiation of " + D() + " value failed: " + h.o(th2), th2);
    }

    public boolean b() {
        return this.f10837d0 != null;
    }

    public boolean c() {
        return this.f10836c0 != null;
    }

    public boolean d() {
        return this.f10834a0 != null;
    }

    public boolean e() {
        return this.f10835b0 != null;
    }

    public boolean f() {
        return this.R != null;
    }

    public boolean g() {
        return this.Z != null;
    }

    public boolean h() {
        return this.W != null;
    }

    public boolean i() {
        return this.Q != null;
    }

    public boolean j() {
        return this.T != null;
    }

    public boolean k() {
        return i() || j() || h() || f() || g() || d() || e() || c() || b();
    }

    public Object l(g gVar, boolean z10) throws IOException {
        if (this.f10837d0 == null) {
            return super.l(gVar, z10);
        }
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            return this.f10837d0.x(valueOf);
        } catch (Throwable th2) {
            return gVar.b0(this.f10837d0.n(), valueOf, O(gVar, th2));
        }
    }

    public Object m(g gVar, double d10) throws IOException {
        if (this.f10836c0 == null) {
            return super.m(gVar, d10);
        }
        Double valueOf = Double.valueOf(d10);
        try {
            return this.f10836c0.x(valueOf);
        } catch (Throwable th2) {
            return gVar.b0(this.f10836c0.n(), valueOf, O(gVar, th2));
        }
    }

    public Object n(g gVar, int i10) throws IOException {
        Object valueOf;
        m mVar;
        if (this.f10834a0 != null) {
            valueOf = Integer.valueOf(i10);
            try {
                return this.f10834a0.x(valueOf);
            } catch (Throwable th2) {
                th = th2;
                mVar = this.f10834a0;
                return gVar.b0(mVar.n(), valueOf, O(gVar, th));
            }
        } else if (this.f10835b0 == null) {
            return super.n(gVar, i10);
        } else {
            valueOf = Long.valueOf((long) i10);
            try {
                return this.f10835b0.x(valueOf);
            } catch (Throwable th3) {
                th = th3;
                mVar = this.f10835b0;
                return gVar.b0(mVar.n(), valueOf, O(gVar, th));
            }
        }
    }

    public Object o(g gVar, long j10) throws IOException {
        if (this.f10835b0 == null) {
            return super.o(gVar, j10);
        }
        Long valueOf = Long.valueOf(j10);
        try {
            return this.f10835b0.x(valueOf);
        } catch (Throwable th2) {
            return gVar.b0(this.f10835b0.n(), valueOf, O(gVar, th2));
        }
    }

    public Object p(g gVar, Object[] objArr) throws IOException {
        m mVar = this.R;
        if (mVar == null) {
            return super.p(gVar, objArr);
        }
        try {
            return mVar.w(objArr);
        } catch (Exception e10) {
            return gVar.b0(this.P, objArr, O(gVar, e10));
        }
    }

    public Object r(g gVar, String str) throws IOException {
        m mVar = this.Z;
        if (mVar == null) {
            return a(gVar, str);
        }
        try {
            return mVar.x(str);
        } catch (Throwable th2) {
            return gVar.b0(this.Z.n(), str, O(gVar, th2));
        }
    }

    public Object s(g gVar, Object obj) throws IOException {
        m mVar = this.X;
        return (mVar != null || this.U == null) ? F(mVar, this.Y, gVar, obj) : u(gVar, obj);
    }

    public Object t(g gVar) throws IOException {
        m mVar = this.Q;
        if (mVar == null) {
            return super.t(gVar);
        }
        try {
            return mVar.v();
        } catch (Exception e10) {
            return gVar.b0(this.P, (Object) null, O(gVar, e10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.X;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object u(i5.g r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r2 = this;
            q5.m r0 = r2.U
            if (r0 != 0) goto L_0x000f
            q5.m r1 = r2.X
            if (r1 == 0) goto L_0x000f
            l5.v[] r0 = r2.Y
            java.lang.Object r3 = r2.F(r1, r0, r3, r4)
            return r3
        L_0x000f:
            l5.v[] r1 = r2.V
            java.lang.Object r3 = r2.F(r0, r1, r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.f0.u(i5.g, java.lang.Object):java.lang.Object");
    }

    public m v() {
        return this.X;
    }

    public j w(f fVar) {
        return this.W;
    }

    public m x() {
        return this.Q;
    }

    public m y() {
        return this.U;
    }

    public j z(f fVar) {
        return this.T;
    }
}

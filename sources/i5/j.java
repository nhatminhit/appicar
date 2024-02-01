package i5;

import a6.h;
import g5.a;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import z5.m;
import z5.n;

public abstract class j extends a implements Serializable, Type {
    public static final long T = 1;
    public final Class<?> O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final boolean S;

    public j(j jVar) {
        this.O = jVar.O;
        this.P = jVar.P;
        this.Q = jVar.Q;
        this.R = jVar.R;
        this.S = jVar.S;
    }

    public j(Class<?> cls, int i10, Object obj, Object obj2, boolean z10) {
        this.O = cls;
        this.P = cls.getName().hashCode() + i10;
        this.Q = obj;
        this.R = obj2;
        this.S = z10;
    }

    /* renamed from: A */
    public abstract j a(int i10);

    public j B(int i10) {
        j A = a(i10);
        return A == null ? n.l0() : A;
    }

    public abstract j C(Class<?> cls);

    public abstract j[] D(Class<?> cls);

    @Deprecated
    public j E(Class<?> cls) {
        return cls == this.O ? this : z(cls);
    }

    public abstract m F();

    /* renamed from: G */
    public j d() {
        return null;
    }

    public Object H() {
        return null;
    }

    public Object I() {
        return null;
    }

    public String J() {
        StringBuilder sb2 = new StringBuilder(40);
        K(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder K(StringBuilder sb2);

    public String L() {
        StringBuilder sb2 = new StringBuilder(40);
        M(sb2);
        return sb2.toString();
    }

    public abstract StringBuilder M(StringBuilder sb2);

    public abstract List<j> N();

    /* renamed from: O */
    public j e() {
        return null;
    }

    /* renamed from: P */
    public j h() {
        return null;
    }

    public abstract j Q();

    public <T> T R() {
        return this.R;
    }

    public <T> T S() {
        return this.Q;
    }

    public boolean T() {
        return true;
    }

    public boolean U() {
        return (this.R == null && this.Q == null) ? false : true;
    }

    public boolean V() {
        return this.Q != null;
    }

    public final boolean W() {
        return h.V(this.O) && this.O != Enum.class;
    }

    public final boolean X() {
        return this.O == Object.class;
    }

    public final boolean Y(Class<?> cls) {
        Class<?> cls2 = this.O;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean Z(Class<?> cls) {
        Class<?> cls2 = this.O;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract j a0(Class<?> cls, m mVar, j jVar, j[] jVarArr);

    public abstract int b();

    public final boolean b0() {
        return this.S;
    }

    @Deprecated
    public abstract String c(int i10);

    public abstract j c0(j jVar);

    public abstract j d0(Object obj);

    public abstract j e0(Object obj);

    public abstract boolean equals(Object obj);

    @Deprecated
    public Class<?> f() {
        return null;
    }

    public j f0(j jVar) {
        Object R2 = jVar.R();
        j h02 = R2 != this.R ? h0(R2) : this;
        Object S2 = jVar.S();
        return S2 != this.Q ? h02.i0(S2) : h02;
    }

    public final Class<?> g() {
        return this.O;
    }

    public abstract j g0();

    public abstract j h0(Object obj);

    public final int hashCode() {
        return this.P;
    }

    public boolean i() {
        return b() > 0;
    }

    public abstract j i0(Object obj);

    public final boolean j(Class<?> cls) {
        return this.O == cls;
    }

    public boolean k() {
        return Modifier.isAbstract(this.O.getModifiers());
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        if ((this.O.getModifiers() & d6.a.f6181d) == 0) {
            return true;
        }
        return this.O.isPrimitive();
    }

    public abstract boolean o();

    public final boolean p() {
        return h.V(this.O);
    }

    public final boolean q() {
        return Modifier.isFinal(this.O.getModifiers());
    }

    public final boolean s() {
        return this.O.isInterface();
    }

    public boolean t() {
        return false;
    }

    public abstract String toString();

    public final boolean u() {
        return this.O.isPrimitive();
    }

    public boolean w() {
        return Throwable.class.isAssignableFrom(this.O);
    }

    @Deprecated
    public abstract j z(Class<?> cls);
}

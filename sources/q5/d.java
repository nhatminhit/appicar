package q5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class d extends m {
    public static final long V = 1;
    public final Constructor<?> T;
    public a U;

    public static final class a implements Serializable {
        public static final long Q = 1;
        public Class<?> O;
        public Class<?>[] P;

        public a(Constructor<?> constructor) {
            this.O = constructor.getDeclaringClass();
            this.P = constructor.getParameterTypes();
        }
    }

    public d(a aVar) {
        super((d0) null, (p) null, (p[]) null);
        this.T = null;
        this.U = aVar;
    }

    public d(d0 d0Var, Constructor<?> constructor, p pVar, p[] pVarArr) {
        super(d0Var, pVar, pVarArr);
        if (constructor != null) {
            this.T = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }

    public int C() {
        return this.T.getParameterTypes().length;
    }

    public j D(int i10) {
        Type[] genericParameterTypes = this.T.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.O.a(genericParameterTypes[i10]);
    }

    public Class<?> E(int i10) {
        Class<?>[] parameterTypes = this.T.getParameterTypes();
        if (i10 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i10];
    }

    /* renamed from: G */
    public Constructor<?> c() {
        return this.T;
    }

    public Object H() {
        a aVar = this.U;
        Class<?> cls = aVar.O;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(aVar.P);
            if (!declaredConstructor.isAccessible()) {
                h.g(declaredConstructor, false);
            }
            return new d((d0) null, declaredConstructor, (p) null, (p[]) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + this.U.P.length + " args from Class '" + cls.getName());
        }
    }

    /* renamed from: I */
    public d t(p pVar) {
        return new d(this.O, this.T, pVar, this.R);
    }

    public Object J() {
        return new d(new a(this.T));
    }

    public int e() {
        return this.T.getModifiers();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h.O(obj, d.class) && ((d) obj).T == this.T;
    }

    public String f() {
        return this.T.getName();
    }

    public Class<?> g() {
        return this.T.getDeclaringClass();
    }

    public j h() {
        return this.O.a(g());
    }

    public int hashCode() {
        return this.T.getName().hashCode();
    }

    public Class<?> n() {
        return this.T.getDeclaringClass();
    }

    public Member p() {
        return this.T;
    }

    public Object r(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of " + n().getName());
    }

    public void s(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + n().getName());
    }

    public String toString() {
        return "[constructor for " + f() + ", annotations: " + this.P + "]";
    }

    public final Object v() throws Exception {
        return this.T.newInstance(new Object[0]);
    }

    public final Object w(Object[] objArr) throws Exception {
        return this.T.newInstance(objArr);
    }

    public final Object x(Object obj) throws Exception {
        return this.T.newInstance(new Object[]{obj});
    }

    @Deprecated
    public Type z(int i10) {
        Type[] genericParameterTypes = this.T.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i10];
    }
}

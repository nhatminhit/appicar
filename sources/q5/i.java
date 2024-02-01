package q5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class i extends m implements Serializable {
    public static final long W = 1;
    public final transient Method T;
    public Class<?>[] U;
    public a V;

    public static final class a implements Serializable {
        public static final long R = 1;
        public Class<?> O;
        public String P;
        public Class<?>[] Q;

        public a(Method method) {
            this.O = method.getDeclaringClass();
            this.P = method.getName();
            this.Q = method.getParameterTypes();
        }
    }

    public i(d0 d0Var, Method method, p pVar, p[] pVarArr) {
        super(d0Var, pVar, pVarArr);
        if (method != null) {
            this.T = method;
            return;
        }
        throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
    }

    public i(a aVar) {
        super((d0) null, (p) null, (p[]) null);
        this.T = null;
        this.V = aVar;
    }

    public int C() {
        return L().length;
    }

    public j D(int i10) {
        Type[] genericParameterTypes = this.T.getGenericParameterTypes();
        if (i10 >= genericParameterTypes.length) {
            return null;
        }
        return this.O.a(genericParameterTypes[i10]);
    }

    public Class<?> E(int i10) {
        Class<?>[] L = L();
        if (i10 >= L.length) {
            return null;
        }
        return L[i10];
    }

    public final Object G(Object obj) throws Exception {
        return this.T.invoke(obj, (Object[]) null);
    }

    public final Object H(Object obj, Object... objArr) throws Exception {
        return this.T.invoke(obj, objArr);
    }

    /* renamed from: I */
    public Method c() {
        return this.T;
    }

    @Deprecated
    public Type[] J() {
        return this.T.getGenericParameterTypes();
    }

    /* renamed from: K */
    public Method p() {
        return this.T;
    }

    public Class<?>[] L() {
        if (this.U == null) {
            this.U = this.T.getParameterTypes();
        }
        return this.U;
    }

    public Class<?> M() {
        return this.T.getReturnType();
    }

    public boolean N() {
        Class<?> M = M();
        return (M == Void.TYPE || M == Void.class) ? false : true;
    }

    public Object O() {
        a aVar = this.V;
        Class<?> cls = aVar.O;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aVar.P, aVar.Q);
            if (!declaredMethod.isAccessible()) {
                h.g(declaredMethod, false);
            }
            return new i((d0) null, declaredMethod, (p) null, (p[]) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.V.P + "' from Class '" + cls.getName());
        }
    }

    /* renamed from: P */
    public i t(p pVar) {
        return new i(this.O, this.T, pVar, this.R);
    }

    public Object Q() {
        return new i(new a(this.T));
    }

    public int e() {
        return this.T.getModifiers();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h.O(obj, i.class) && ((i) obj).T == this.T;
    }

    public String f() {
        return this.T.getName();
    }

    public Class<?> g() {
        return this.T.getReturnType();
    }

    public j h() {
        return this.O.a(this.T.getGenericReturnType());
    }

    public int hashCode() {
        return this.T.getName().hashCode();
    }

    public Class<?> n() {
        return this.T.getDeclaringClass();
    }

    public String o() {
        return String.format("%s(%d params)", new Object[]{super.o(), Integer.valueOf(C())});
    }

    public Object r(Object obj) throws IllegalArgumentException {
        try {
            return this.T.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to getValue() with method " + o() + ": " + e10.getMessage(), e10);
        }
    }

    public void s(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this.T.invoke(obj, new Object[]{obj2});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new IllegalArgumentException("Failed to setValue() with method " + o() + ": " + e10.getMessage(), e10);
        }
    }

    public String toString() {
        return "[method " + o() + "]";
    }

    public final Object v() throws Exception {
        return this.T.invoke((Object) null, new Object[0]);
    }

    public final Object w(Object[] objArr) throws Exception {
        return this.T.invoke((Object) null, objArr);
    }

    public final Object x(Object obj) throws Exception {
        return this.T.invoke((Object) null, new Object[]{obj});
    }

    @Deprecated
    public Type z(int i10) {
        Type[] J = J();
        if (i10 >= J.length) {
            return null;
        }
        return J[i10];
    }
}

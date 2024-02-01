package q5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public final class f extends h implements Serializable {
    public static final long T = 1;
    public final transient Field R;
    public a S;

    public static final class a implements Serializable {
        public static final long Q = 1;
        public Class<?> O;
        public String P;

        public a(Field field) {
            this.O = field.getDeclaringClass();
            this.P = field.getName();
        }
    }

    public f(d0 d0Var, Field field, p pVar) {
        super(d0Var, pVar);
        this.R = field;
    }

    public f(a aVar) {
        super((d0) null, (p) null);
        this.R = null;
        this.S = aVar;
    }

    public int e() {
        return this.R.getModifiers();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return h.O(obj, f.class) && ((f) obj).R == this.R;
    }

    public String f() {
        return this.R.getName();
    }

    public Class<?> g() {
        return this.R.getType();
    }

    public j h() {
        return this.O.a(this.R.getGenericType());
    }

    public int hashCode() {
        return this.R.getName().hashCode();
    }

    public Class<?> n() {
        return this.R.getDeclaringClass();
    }

    public Member p() {
        return this.R;
    }

    public Object r(Object obj) throws IllegalArgumentException {
        try {
            return this.R.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to getValue() for field " + o() + ": " + e10.getMessage(), e10);
        }
    }

    public void s(Object obj, Object obj2) throws IllegalArgumentException {
        try {
            this.R.set(obj, obj2);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to setValue() for field " + o() + ": " + e10.getMessage(), e10);
        }
    }

    public String toString() {
        return "[field " + o() + "]";
    }

    /* renamed from: u */
    public Field c() {
        return this.R;
    }

    public int v() {
        return this.P.size();
    }

    public boolean w() {
        return Modifier.isTransient(e());
    }

    public Object x() {
        a aVar = this.S;
        Class<?> cls = aVar.O;
        try {
            Field declaredField = cls.getDeclaredField(aVar.P);
            if (!declaredField.isAccessible()) {
                h.g(declaredField, false);
            }
            return new f((d0) null, declaredField, (p) null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + this.S.P + "' from Class '" + cls.getName());
        }
    }

    /* renamed from: y */
    public f t(p pVar) {
        return new f(this.O, this.R, pVar);
    }

    public Object z() {
        return new f(new a(this.R));
    }
}

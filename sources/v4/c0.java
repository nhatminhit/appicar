package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface c0 {

    public static class a implements b<c0>, Serializable {
        public static final long Q = 1;
        public static final a R;
        public final k0 O;
        public final k0 P;

        static {
            k0 k0Var = k0.DEFAULT;
            R = new a(k0Var, k0Var);
        }

        public a(k0 k0Var, k0 k0Var2) {
            this.O = k0Var;
            this.P = k0Var2;
        }

        public static boolean b(k0 k0Var, k0 k0Var2) {
            k0 k0Var3 = k0.DEFAULT;
            return k0Var == k0Var3 && k0Var2 == k0Var3;
        }

        public static a c(k0 k0Var, k0 k0Var2) {
            if (k0Var == null) {
                k0Var = k0.DEFAULT;
            }
            if (k0Var2 == null) {
                k0Var2 = k0.DEFAULT;
            }
            return b(k0Var, k0Var2) ? R : new a(k0Var, k0Var2);
        }

        public static a d() {
            return R;
        }

        public static a e(k0 k0Var) {
            return c(k0.DEFAULT, k0Var);
        }

        public static a f(k0 k0Var) {
            return c(k0Var, k0.DEFAULT);
        }

        public static a g(k0 k0Var, k0 k0Var2) {
            return c(k0Var, k0Var2);
        }

        public static a h(c0 c0Var) {
            return c0Var == null ? R : c(c0Var.nulls(), c0Var.contentNulls());
        }

        public static a k(a aVar, a aVar2) {
            return aVar == null ? aVar2 : aVar.p(aVar2);
        }

        public Class<c0> a() {
            return c0.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.O == this.O && aVar.P == this.P;
        }

        public int hashCode() {
            return this.O.ordinal() + (this.P.ordinal() << 2);
        }

        public k0 i() {
            return this.P;
        }

        public k0 j() {
            return this.O;
        }

        public k0 l() {
            k0 k0Var = this.P;
            if (k0Var == k0.DEFAULT) {
                return null;
            }
            return k0Var;
        }

        public k0 m() {
            k0 k0Var = this.O;
            if (k0Var == k0.DEFAULT) {
                return null;
            }
            return k0Var;
        }

        public Object n() {
            return b(this.O, this.P) ? R : this;
        }

        public a o(k0 k0Var) {
            if (k0Var == null) {
                k0Var = k0.DEFAULT;
            }
            return k0Var == this.P ? this : c(this.O, k0Var);
        }

        public a p(a aVar) {
            if (aVar == null || aVar == R) {
                return this;
            }
            k0 k0Var = aVar.O;
            k0 k0Var2 = aVar.P;
            k0 k0Var3 = k0.DEFAULT;
            if (k0Var == k0Var3) {
                k0Var = this.O;
            }
            if (k0Var2 == k0Var3) {
                k0Var2 = this.P;
            }
            return (k0Var == this.O && k0Var2 == this.P) ? this : c(k0Var, k0Var2);
        }

        public a q(k0 k0Var) {
            if (k0Var == null) {
                k0Var = k0.DEFAULT;
            }
            return k0Var == this.O ? this : c(k0Var, this.P);
        }

        public a r(k0 k0Var, k0 k0Var2) {
            if (k0Var == null) {
                k0Var = k0.DEFAULT;
            }
            if (k0Var2 == null) {
                k0Var2 = k0.DEFAULT;
            }
            return (k0Var == this.O && k0Var2 == this.P) ? this : c(k0Var, k0Var2);
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", new Object[]{this.O, this.P});
        }
    }

    k0 contentNulls() default k0.DEFAULT;

    k0 nulls() default k0.DEFAULT;

    String value() default "";
}

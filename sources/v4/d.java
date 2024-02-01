package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface d {

    public static class a implements b<d>, Serializable {
        public static final long Q = 1;
        public static final a R = new a((Object) null, (Boolean) null);
        public final Object O;
        public final Boolean P;

        public a(Object obj, Boolean bool) {
            this.O = obj;
            this.P = bool;
        }

        public static boolean b(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static a c(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return b(obj, bool) ? R : new a(obj, bool);
        }

        public static a d() {
            return R;
        }

        public static a e(Object obj) {
            return c(obj, (Boolean) null);
        }

        public static a f(d dVar) {
            return dVar == null ? R : c(dVar.value(), dVar.useInput().a());
        }

        public Class<d> a() {
            return d.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (o0.d(this.P, aVar.P)) {
                    Object obj2 = this.O;
                    Object obj3 = aVar.O;
                    return obj2 == null ? obj3 == null : obj2.equals(obj3);
                }
            }
            return false;
        }

        public Object g() {
            return this.O;
        }

        public Boolean h() {
            return this.P;
        }

        public int hashCode() {
            Object obj = this.O;
            int i10 = 1;
            if (obj != null) {
                i10 = 1 + obj.hashCode();
            }
            Boolean bool = this.P;
            return bool != null ? i10 + bool.hashCode() : i10;
        }

        public boolean i() {
            return this.O != null;
        }

        public boolean j(boolean z10) {
            Boolean bool = this.P;
            return bool == null ? z10 : bool.booleanValue();
        }

        public a k(Object obj) {
            Object obj2 = this.O;
            if (obj == null) {
                if (obj2 == null) {
                    return this;
                }
            } else if (obj.equals(obj2)) {
                return this;
            }
            return new a(obj, this.P);
        }

        public a l(Boolean bool) {
            Boolean bool2 = this.P;
            if (bool == null) {
                if (bool2 == null) {
                    return this;
                }
            } else if (bool.equals(bool2)) {
                return this;
            }
            return new a(this.O, bool);
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", new Object[]{this.O, this.P});
        }
    }

    o0 useInput() default o0.DEFAULT;

    String value() default "";
}

package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface u {

    public enum a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class b implements b<u>, Serializable {
        public static final long S = 1;
        public static final b T;
        public final a O;
        public final a P;
        public final Class<?> Q;
        public final Class<?> R;

        static {
            a aVar = a.USE_DEFAULTS;
            T = new b(aVar, aVar, (Class<?>) null, (Class<?>) null);
        }

        public b(a aVar, a aVar2, Class<?> cls, Class<?> cls2) {
            this.O = aVar == null ? a.USE_DEFAULTS : aVar;
            this.P = aVar2 == null ? a.USE_DEFAULTS : aVar2;
            this.Q = cls == Void.class ? null : cls;
            this.R = cls2 == Void.class ? null : cls2;
        }

        public b(u uVar) {
            this(uVar.value(), uVar.content(), uVar.valueFilter(), uVar.contentFilter());
        }

        public static b b(a aVar, a aVar2) {
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null)) ? T : new b(aVar, aVar2, (Class<?>) null, (Class<?>) null);
        }

        public static b c(a aVar, a aVar2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null) && cls == null && cls2 == null) ? T : new b(aVar, aVar2, cls, cls2);
        }

        public static b d() {
            return T;
        }

        public static b e(u uVar) {
            if (uVar == null) {
                return T;
            }
            a value = uVar.value();
            a content = uVar.content();
            a aVar = a.USE_DEFAULTS;
            if (value == aVar && content == aVar) {
                return T;
            }
            Class<?> valueFilter = uVar.valueFilter();
            Class<?> cls = null;
            if (valueFilter == Void.class) {
                valueFilter = null;
            }
            Class<?> contentFilter = uVar.contentFilter();
            if (contentFilter != Void.class) {
                cls = contentFilter;
            }
            return new b(value, content, valueFilter, cls);
        }

        public static b j(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.o(bVar2);
        }

        public static b k(b... bVarArr) {
            b bVar = null;
            for (b bVar2 : bVarArr) {
                if (bVar2 != null) {
                    if (bVar != null) {
                        bVar2 = bVar.o(bVar2);
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public Class<u> a() {
            return u.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.O == this.O && bVar.P == this.P && bVar.Q == this.Q && bVar.R == this.R;
        }

        public Class<?> f() {
            return this.R;
        }

        public a g() {
            return this.P;
        }

        public Class<?> h() {
            return this.Q;
        }

        public int hashCode() {
            return (this.O.hashCode() << 2) + this.P.hashCode();
        }

        public a i() {
            return this.O;
        }

        public Object l() {
            a aVar = this.O;
            a aVar2 = a.USE_DEFAULTS;
            return (aVar == aVar2 && this.P == aVar2 && this.Q == null && this.R == null) ? T : this;
        }

        public b m(Class<?> cls) {
            a aVar;
            if (cls == null || cls == Void.class) {
                aVar = a.USE_DEFAULTS;
                cls = null;
            } else {
                aVar = a.CUSTOM;
            }
            return c(this.O, aVar, this.Q, cls);
        }

        public b n(a aVar) {
            return aVar == this.P ? this : new b(this.O, aVar, this.Q, this.R);
        }

        public b o(b bVar) {
            if (!(bVar == null || bVar == T)) {
                a aVar = bVar.O;
                a aVar2 = bVar.P;
                Class<?> cls = bVar.Q;
                Class<?> cls2 = bVar.R;
                a aVar3 = this.O;
                boolean z10 = true;
                boolean z11 = (aVar == aVar3 || aVar == a.USE_DEFAULTS) ? false : true;
                a aVar4 = this.P;
                boolean z12 = (aVar2 == aVar4 || aVar2 == a.USE_DEFAULTS) ? false : true;
                Class<?> cls3 = this.Q;
                if (cls == cls3 && cls2 == cls3) {
                    z10 = false;
                }
                if (z11) {
                    return z12 ? new b(aVar, aVar2, cls, cls2) : new b(aVar, aVar4, cls, cls2);
                }
                if (z12) {
                    return new b(aVar3, aVar2, cls, cls2);
                }
                if (z10) {
                    return new b(aVar3, aVar4, cls, cls2);
                }
            }
            return this;
        }

        public b p(Class<?> cls) {
            a aVar;
            if (cls == null || cls == Void.class) {
                aVar = a.USE_DEFAULTS;
                cls = null;
            } else {
                aVar = a.CUSTOM;
            }
            return c(aVar, this.P, cls, this.R);
        }

        public b q(a aVar) {
            return aVar == this.O ? this : new b(aVar, this.P, this.Q, this.R);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("JsonInclude.Value(value=");
            sb2.append(this.O);
            sb2.append(",content=");
            sb2.append(this.P);
            if (this.Q != null) {
                sb2.append(",valueFilter=");
                sb2.append(this.Q.getName());
                sb2.append(".class");
            }
            if (this.R != null) {
                sb2.append(",contentFilter=");
                sb2.append(this.R.getName());
                sb2.append(".class");
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    a content() default a.ALWAYS;

    Class<?> contentFilter() default Void.class;

    a value() default a.ALWAYS;

    Class<?> valueFilter() default Void.class;
}

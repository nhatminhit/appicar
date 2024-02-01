package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface s {

    public static class a implements b<s>, Serializable {
        public static final long T = 1;
        public static final a U = new a(Collections.emptySet(), false, false, false, true);
        public final Set<String> O;
        public final boolean P;
        public final boolean Q;
        public final boolean R;
        public final boolean S;

        public a(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            this.O = set == null ? Collections.emptySet() : set;
            this.P = z10;
            this.Q = z11;
            this.R = z12;
            this.S = z13;
        }

        public static Set<String> b(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String add : strArr) {
                hashSet.add(add);
            }
            return hashSet;
        }

        public static boolean c(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            a aVar = U;
            if (z10 == aVar.P && z11 == aVar.Q && z12 == aVar.R && z13 == aVar.S) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        public static boolean d(a aVar, a aVar2) {
            return aVar.P == aVar2.P && aVar.S == aVar2.S && aVar.Q == aVar2.Q && aVar.R == aVar2.R && aVar.O.equals(aVar2.O);
        }

        public static Set<String> e(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static a f(Set<String> set, boolean z10, boolean z11, boolean z12, boolean z13) {
            return c(set, z10, z11, z12, z13) ? U : new a(set, z10, z11, z12, z13);
        }

        public static a g() {
            return U;
        }

        public static a j(boolean z10) {
            return z10 ? U.x() : U.E();
        }

        public static a k(Set<String> set) {
            return U.y(set);
        }

        public static a l(String... strArr) {
            return strArr.length == 0 ? U : U.y(b(strArr));
        }

        public static a m(s sVar) {
            return sVar == null ? U : f(b(sVar.value()), sVar.ignoreUnknown(), sVar.allowGetters(), sVar.allowSetters(), false);
        }

        public static a s(a aVar, a aVar2) {
            return aVar == null ? aVar2 : aVar.B(aVar2);
        }

        public static a t(a... aVarArr) {
            a aVar = null;
            for (a aVar2 : aVarArr) {
                if (aVar2 != null) {
                    if (aVar != null) {
                        aVar2 = aVar.B(aVar2);
                    }
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        public a A() {
            return this.S ? this : f(this.O, this.P, this.Q, this.R, true);
        }

        public a B(a aVar) {
            if (aVar == null || aVar == U) {
                return this;
            }
            if (!aVar.S) {
                return aVar;
            }
            if (d(this, aVar)) {
                return this;
            }
            Set<String> e10 = e(this.O, aVar.O);
            boolean z10 = false;
            boolean z11 = this.P || aVar.P;
            boolean z12 = this.Q || aVar.Q;
            if (this.R || aVar.R) {
                z10 = true;
            }
            return f(e10, z11, z12, z10, true);
        }

        public a C() {
            return !this.Q ? this : f(this.O, this.P, false, this.R, this.S);
        }

        public a D() {
            return !this.R ? this : f(this.O, this.P, this.Q, false, this.S);
        }

        public a E() {
            return !this.P ? this : f(this.O, false, this.Q, this.R, this.S);
        }

        public a F() {
            return f((Set<String>) null, this.P, this.Q, this.R, this.S);
        }

        public a G() {
            return !this.S ? this : f(this.O, this.P, this.Q, this.R, false);
        }

        public Class<s> a() {
            return s.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && d(this, (a) obj);
        }

        public Set<String> h() {
            return this.R ? Collections.emptySet() : this.O;
        }

        public int hashCode() {
            return this.O.size() + (this.P ? 1 : -3) + (this.Q ? 3 : -7) + (this.R ? 7 : -11) + (this.S ? 11 : -13);
        }

        public Set<String> i() {
            return this.Q ? Collections.emptySet() : this.O;
        }

        public boolean n() {
            return this.Q;
        }

        public boolean o() {
            return this.R;
        }

        public boolean p() {
            return this.P;
        }

        public Set<String> q() {
            return this.O;
        }

        public boolean r() {
            return this.S;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", new Object[]{this.O, Boolean.valueOf(this.P), Boolean.valueOf(this.Q), Boolean.valueOf(this.R), Boolean.valueOf(this.S)});
        }

        public Object u() {
            return c(this.O, this.P, this.Q, this.R, this.S) ? U : this;
        }

        public a v() {
            return this.Q ? this : f(this.O, this.P, true, this.R, this.S);
        }

        public a w() {
            return this.R ? this : f(this.O, this.P, this.Q, true, this.S);
        }

        public a x() {
            return this.P ? this : f(this.O, true, this.Q, this.R, this.S);
        }

        public a y(Set<String> set) {
            return f(set, this.P, this.Q, this.R, this.S);
        }

        public a z(String... strArr) {
            return f(b(strArr), this.P, this.Q, this.R, this.S);
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}

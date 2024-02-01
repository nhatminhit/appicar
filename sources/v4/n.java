package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface n {

    /* renamed from: n0  reason: collision with root package name */
    public static final String f14169n0 = "##default";

    /* renamed from: o0  reason: collision with root package name */
    public static final String f14170o0 = "##default";

    public enum a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f14171c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f14172a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14173b;

        public b(int i10, int i11) {
            this.f14172a = i10;
            this.f14173b = i11;
        }

        public static b a(n nVar) {
            return b(nVar.with(), nVar.without());
        }

        public static b b(a[] aVarArr, a[] aVarArr2) {
            int i10 = 0;
            for (a ordinal : aVarArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            int i11 = 0;
            for (a ordinal2 : aVarArr2) {
                i11 |= 1 << ordinal2.ordinal();
            }
            return new b(i10, i11);
        }

        public static b c() {
            return f14171c;
        }

        public Boolean d(a aVar) {
            int ordinal = 1 << aVar.ordinal();
            if ((this.f14173b & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & this.f14172a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public b e(a... aVarArr) {
            int i10 = this.f14172a;
            for (a ordinal : aVarArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            return i10 == this.f14172a ? this : new b(i10, this.f14173b);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f14172a == this.f14172a && bVar.f14173b == this.f14173b;
        }

        public b f(b bVar) {
            if (bVar == null) {
                return this;
            }
            int i10 = bVar.f14173b;
            int i11 = bVar.f14172a;
            if (i10 == 0 && i11 == 0) {
                return this;
            }
            int i12 = this.f14172a;
            if (i12 == 0 && this.f14173b == 0) {
                return bVar;
            }
            int i13 = ((~i10) & i12) | i11;
            int i14 = this.f14173b;
            int i15 = i10 | ((~i11) & i14);
            return (i13 == i12 && i15 == i14) ? this : new b(i13, i15);
        }

        public b g(a... aVarArr) {
            int i10 = this.f14173b;
            for (a ordinal : aVarArr) {
                i10 |= 1 << ordinal.ordinal();
            }
            return i10 == this.f14173b ? this : new b(this.f14172a, i10);
        }

        public int hashCode() {
            return this.f14173b + this.f14172a;
        }

        public String toString() {
            if (this == f14171c) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this.f14172a), Integer.valueOf(this.f14173b)});
        }
    }

    public enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean a() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean b() {
            return this == OBJECT || this == ARRAY;
        }
    }

    public static class d implements b<n>, Serializable {
        public static final long V = 1;
        public static final d W = new d();
        public final String O;
        public final c P;
        public final Locale Q;
        public final String R;
        public final Boolean S;
        public final b T;
        public transient TimeZone U;

        public d() {
            this("", c.ANY, "", "", b.c(), (Boolean) null);
        }

        @Deprecated
        public d(String str, c cVar, String str2, String str3, b bVar) {
            this(str, cVar, str2, str3, bVar, (Boolean) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(java.lang.String r14, v4.n.c r15, java.lang.String r16, java.lang.String r17, v4.n.b r18, java.lang.Boolean r19) {
            /*
                r13 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "##default"
                r3 = 0
                if (r0 == 0) goto L_0x001d
                int r4 = r16.length()
                if (r4 == 0) goto L_0x001d
                boolean r4 = r2.equals(r0)
                if (r4 == 0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                java.util.Locale r4 = new java.util.Locale
                r4.<init>(r0)
                r8 = r4
                goto L_0x001e
            L_0x001d:
                r8 = r3
            L_0x001e:
                if (r1 == 0) goto L_0x002f
                int r0 = r17.length()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.equals(r1)
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r9 = r1
                goto L_0x0030
            L_0x002f:
                r9 = r3
            L_0x0030:
                r10 = 0
                r5 = r13
                r6 = r14
                r7 = r15
                r11 = r18
                r12 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.n.d.<init>(java.lang.String, v4.n$c, java.lang.String, java.lang.String, v4.n$b, java.lang.Boolean):void");
        }

        @Deprecated
        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar) {
            this(str, cVar, locale, str2, timeZone, bVar, (Boolean) null);
        }

        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.O = str == null ? "" : str;
            this.P = cVar == null ? c.ANY : cVar;
            this.Q = locale;
            this.U = timeZone;
            this.R = str2;
            this.T = bVar == null ? b.c() : bVar;
            this.S = bool;
        }

        @Deprecated
        public d(String str, c cVar, Locale locale, TimeZone timeZone, b bVar) {
            this(str, cVar, locale, timeZone, bVar, (Boolean) null);
        }

        public d(String str, c cVar, Locale locale, TimeZone timeZone, b bVar, Boolean bool) {
            this.O = str == null ? "" : str;
            this.P = cVar == null ? c.ANY : cVar;
            this.Q = locale;
            this.U = timeZone;
            this.R = null;
            this.T = bVar == null ? b.c() : bVar;
            this.S = bool;
        }

        public d(n nVar) {
            this(nVar.pattern(), nVar.shape(), nVar.locale(), nVar.timezone(), b.a(nVar), nVar.lenient().a());
        }

        public static <T> boolean b(T t10, T t11) {
            if (t10 == null) {
                return t11 == null;
            }
            if (t11 == null) {
                return false;
            }
            return t10.equals(t11);
        }

        public static final d c() {
            return W;
        }

        public static d d(boolean z10) {
            return new d("", (c) null, (Locale) null, (String) null, (TimeZone) null, b.c(), Boolean.valueOf(z10));
        }

        public static d e(String str) {
            return new d(str, (c) null, (Locale) null, (String) null, (TimeZone) null, b.c(), (Boolean) null);
        }

        public static d f(c cVar) {
            return new d("", cVar, (Locale) null, (String) null, (TimeZone) null, b.c(), (Boolean) null);
        }

        public static final d g(n nVar) {
            return nVar == null ? W : new d(nVar);
        }

        public static d u(d dVar, d dVar2) {
            return dVar == null ? dVar2 : dVar.A(dVar2);
        }

        public static d v(d... dVarArr) {
            d dVar = null;
            for (d dVar2 : dVarArr) {
                if (dVar2 != null) {
                    if (dVar != null) {
                        dVar2 = dVar.A(dVar2);
                    }
                    dVar = dVar2;
                }
            }
            return dVar;
        }

        public final d A(d dVar) {
            d dVar2;
            TimeZone timeZone;
            String str;
            if (dVar == null || dVar == (dVar2 = W) || dVar == this) {
                return this;
            }
            if (this == dVar2) {
                return dVar;
            }
            String str2 = dVar.O;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.O;
            }
            String str3 = str2;
            c cVar = dVar.P;
            if (cVar == c.ANY) {
                cVar = this.P;
            }
            c cVar2 = cVar;
            Locale locale = dVar.Q;
            if (locale == null) {
                locale = this.Q;
            }
            Locale locale2 = locale;
            b bVar = this.T;
            b f10 = bVar == null ? dVar.T : bVar.f(dVar.T);
            Boolean bool = dVar.S;
            if (bool == null) {
                bool = this.S;
            }
            Boolean bool2 = bool;
            String str4 = dVar.R;
            if (str4 == null || str4.isEmpty()) {
                str = this.R;
                timeZone = this.U;
            } else {
                timeZone = dVar.U;
                str = str4;
            }
            return new d(str3, cVar2, locale2, str, timeZone, f10, bool2);
        }

        public d B(String str) {
            return new d(str, this.P, this.Q, this.R, this.U, this.T, this.S);
        }

        public d C(c cVar) {
            if (cVar == this.P) {
                return this;
            }
            return new d(this.O, cVar, this.Q, this.R, this.U, this.T, this.S);
        }

        public d D(TimeZone timeZone) {
            return new d(this.O, this.P, this.Q, (String) null, timeZone, this.T, this.S);
        }

        public d E(a aVar) {
            b g10 = this.T.g(aVar);
            return g10 == this.T ? this : new d(this.O, this.P, this.Q, this.R, this.U, g10, this.S);
        }

        public Class<n> a() {
            return n.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.P != dVar.P || !this.T.equals(dVar.T)) {
                return false;
            }
            return b(this.S, dVar.S) && b(this.R, dVar.R) && b(this.O, dVar.O) && b(this.U, dVar.U) && b(this.Q, dVar.Q);
        }

        public Boolean h(a aVar) {
            return this.T.d(aVar);
        }

        public int hashCode() {
            String str = this.R;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.O;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = hashCode + this.P.hashCode();
            Boolean bool = this.S;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.Q;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return hashCode2 ^ this.T.hashCode();
        }

        public b i() {
            return this.T;
        }

        public Boolean j() {
            return this.S;
        }

        public Locale k() {
            return this.Q;
        }

        public String l() {
            return this.O;
        }

        public c m() {
            return this.P;
        }

        public TimeZone n() {
            TimeZone timeZone = this.U;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.R;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.U = timeZone2;
            return timeZone2;
        }

        public boolean o() {
            return this.S != null;
        }

        public boolean p() {
            return this.Q != null;
        }

        public boolean q() {
            String str = this.O;
            return str != null && str.length() > 0;
        }

        public boolean r() {
            return this.P != c.ANY;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r1.R;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean s() {
            /*
                r1 = this;
                java.util.TimeZone r0 = r1.U
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r1.R
                if (r0 == 0) goto L_0x000f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0012
            L_0x0011:
                r0 = 1
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.n.d.s():boolean");
        }

        public boolean t() {
            return Boolean.TRUE.equals(this.S);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this.O, this.P, this.S, this.Q, this.R, this.T});
        }

        public String w() {
            TimeZone timeZone = this.U;
            return timeZone != null ? timeZone.getID() : this.R;
        }

        public d x(a aVar) {
            b e10 = this.T.e(aVar);
            return e10 == this.T ? this : new d(this.O, this.P, this.Q, this.R, this.U, e10, this.S);
        }

        public d y(Boolean bool) {
            return bool == this.S ? this : new d(this.O, this.P, this.Q, this.R, this.U, this.T, bool);
        }

        public d z(Locale locale) {
            return new d(this.O, this.P, locale, this.R, this.U, this.T, this.S);
        }
    }

    o0 lenient() default o0.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.ANY;

    String timezone() default "##default";

    a[] with() default {};

    a[] without() default {};
}

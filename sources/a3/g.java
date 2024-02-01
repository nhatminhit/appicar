package a3;

import java.util.regex.Pattern;
import p7.f;

public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f128j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: a  reason: collision with root package name */
    public boolean f129a = false;

    /* renamed from: b  reason: collision with root package name */
    public final String f130b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f131c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f132d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f133e;

    /* renamed from: f  reason: collision with root package name */
    public String f134f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f135g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f136h = null;

    /* renamed from: i  reason: collision with root package name */
    public String f137i = null;

    public g(String str) {
        this.f130b = str;
    }

    public static void a(StringBuilder sb2, String str, String str2) {
        if (!i(str2)) {
            sb2.append(str);
            sb2.append(str2);
        }
    }

    public static void b(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(f.f11698i);
    }

    public static g c(String str) {
        return new g(str);
    }

    public static boolean i(String str) {
        return str == null || str.length() == 0;
    }

    public g d(String[] strArr) {
        this.f131c = strArr;
        return this;
    }

    public f e() {
        if (!i(this.f134f) || i(this.f135g)) {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("SELECT ");
            if (this.f129a) {
                sb2.append("DISTINCT ");
            }
            String[] strArr = this.f131c;
            if (strArr == null || strArr.length == 0) {
                sb2.append(" * ");
            } else {
                b(sb2, strArr);
            }
            sb2.append(" FROM ");
            sb2.append(this.f130b);
            a(sb2, " WHERE ", this.f132d);
            a(sb2, " GROUP BY ", this.f134f);
            a(sb2, " HAVING ", this.f135g);
            a(sb2, " ORDER BY ", this.f136h);
            a(sb2, " LIMIT ", this.f137i);
            return new b(sb2.toString(), this.f133e);
        }
        throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    }

    public g f() {
        this.f129a = true;
        return this;
    }

    public g g(String str) {
        this.f134f = str;
        return this;
    }

    public g h(String str) {
        this.f135g = str;
        return this;
    }

    public g j(String str) {
        if (i(str) || f128j.matcher(str).matches()) {
            this.f137i = str;
            return this;
        }
        throw new IllegalArgumentException("invalid LIMIT clauses:" + str);
    }

    public g k(String str) {
        this.f136h = str;
        return this;
    }

    public g l(String str, Object[] objArr) {
        this.f132d = str;
        this.f133e = objArr;
        return this;
    }
}

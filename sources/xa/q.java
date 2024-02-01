package xa;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final r f24467a;

    public q(r rVar) {
        this.f24467a = rVar;
    }

    public static void c(String str, StringBuilder sb2) {
        if (str != null && !str.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append(10);
            }
            sb2.append(str);
        }
    }

    public static void d(String[] strArr, StringBuilder sb2) {
        if (strArr != null) {
            for (String c10 : strArr) {
                c(c10, sb2);
            }
        }
    }

    public abstract String a();

    public final r b() {
        return this.f24467a;
    }

    public final String toString() {
        return a();
    }
}

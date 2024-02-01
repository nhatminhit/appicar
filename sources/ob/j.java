package ob;

import qa.h;
import qa.m;
import ya.a;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final a f21334a;

    /* renamed from: b  reason: collision with root package name */
    public final s f21335b;

    public j(a aVar) {
        this.f21334a = aVar;
        this.f21335b = new s(aVar);
    }

    public static j a(a aVar) {
        if (aVar.n(1)) {
            return new g(aVar);
        }
        if (!aVar.n(2)) {
            return new k(aVar);
        }
        int g10 = s.g(aVar, 1, 4);
        if (g10 == 4) {
            return new a(aVar);
        }
        if (g10 == 5) {
            return new b(aVar);
        }
        int g11 = s.g(aVar, 1, 5);
        if (g11 == 12) {
            return new c(aVar);
        }
        if (g11 == 13) {
            return new d(aVar);
        }
        switch (s.g(aVar, 1, 7)) {
            case 56:
                return new e(aVar, "310", "11");
            case 57:
                return new e(aVar, "320", "11");
            case 58:
                return new e(aVar, "310", "13");
            case 59:
                return new e(aVar, "320", "13");
            case 60:
                return new e(aVar, "310", "15");
            case 61:
                return new e(aVar, "320", "15");
            case 62:
                return new e(aVar, "310", "17");
            case 63:
                return new e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    public final s b() {
        return this.f21335b;
    }

    public final a c() {
        return this.f21334a;
    }

    public abstract String d() throws m, h;
}

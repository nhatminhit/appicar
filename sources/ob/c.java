package ob;

import qa.h;
import qa.m;
import ya.a;

public final class c extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final int f21320d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f21321e = 2;

    public c(a aVar) {
        super(aVar);
    }

    public String d() throws m, h {
        if (c().s() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f10 = b().f(48, 2);
            sb2.append("(392");
            sb2.append(f10);
            sb2.append(')');
            sb2.append(b().c(50, (String) null).b());
            return sb2.toString();
        }
        throw m.a();
    }
}

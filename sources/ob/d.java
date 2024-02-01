package ob;

import qa.h;
import qa.m;
import ya.a;

public final class d extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final int f21322d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final int f21323e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f21324f = 10;

    public d(a aVar) {
        super(aVar);
    }

    public String d() throws m, h {
        if (c().s() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int f10 = b().f(48, 2);
            sb2.append("(393");
            sb2.append(f10);
            sb2.append(')');
            int f11 = b().f(50, 10);
            if (f11 / 100 == 0) {
                sb2.append('0');
            }
            if (f11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(f11);
            sb2.append(b().c(60, (String) null).b());
            return sb2.toString();
        }
        throw m.a();
    }
}

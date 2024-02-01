package ob;

import qa.m;
import ya.a;

public abstract class f extends i {

    /* renamed from: d  reason: collision with root package name */
    public static final int f21330d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final int f21331e = 15;

    public f(a aVar) {
        super(aVar);
    }

    public String d() throws m {
        if (c().s() == 60) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 5);
            j(sb2, 45, 15);
            return sb2.toString();
        }
        throw m.a();
    }
}

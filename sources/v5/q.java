package v5;

import i5.e;
import i5.j;
import java.io.IOException;
import u5.g;
import z5.n;

public abstract class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public final n f14190a;

    /* renamed from: b  reason: collision with root package name */
    public final j f14191b;

    public q() {
        this((j) null, (n) null);
    }

    public q(j jVar, n nVar) {
        this.f14191b = jVar;
        this.f14190a = nVar;
    }

    public String b() {
        return null;
    }

    public String d() {
        return c((Object) null, this.f14191b.g());
    }

    public void e(j jVar) {
    }

    public j g(e eVar, String str) throws IOException {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }
}

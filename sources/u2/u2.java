package u2;

import a3.h;
import d.x0;
import java.util.concurrent.atomic.AtomicBoolean;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class u2 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f13621a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final n2 f13622b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f13623c;

    public u2(n2 n2Var) {
        this.f13622b = n2Var;
    }

    public h a() {
        b();
        return e(this.f13621a.compareAndSet(false, true));
    }

    public void b() {
        this.f13622b.c();
    }

    public final h c() {
        return this.f13622b.h(d());
    }

    public abstract String d();

    public final h e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f13623c == null) {
            this.f13623c = c();
        }
        return this.f13623c;
    }

    public void f(h hVar) {
        if (hVar == this.f13623c) {
            this.f13621a.set(false);
        }
    }
}

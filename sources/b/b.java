package b;

import android.content.Context;
import d.m0;
import d.o0;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f4033a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f4034b;

    public void a(@m0 c cVar) {
        if (this.f4034b != null) {
            cVar.a(this.f4034b);
        }
        this.f4033a.add(cVar);
    }

    public void b() {
        this.f4034b = null;
    }

    public void c(@m0 Context context) {
        this.f4034b = context;
        for (c a10 : this.f4033a) {
            a10.a(context);
        }
    }

    @o0
    public Context d() {
        return this.f4034b;
    }

    public void e(@m0 c cVar) {
        this.f4033a.remove(cVar);
    }
}

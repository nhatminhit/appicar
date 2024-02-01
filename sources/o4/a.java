package o4;

import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.List;
import v3.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<C0191a<?>> f11052a = new ArrayList();

    /* renamed from: o4.a$a  reason: collision with other inner class name */
    public static final class C0191a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f11053a;

        /* renamed from: b  reason: collision with root package name */
        public final d<T> f11054b;

        public C0191a(@m0 Class<T> cls, @m0 d<T> dVar) {
            this.f11053a = cls;
            this.f11054b = dVar;
        }

        public boolean a(@m0 Class<?> cls) {
            return this.f11053a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@m0 Class<T> cls, @m0 d<T> dVar) {
        this.f11052a.add(new C0191a(cls, dVar));
    }

    @o0
    public synchronized <T> d<T> b(@m0 Class<T> cls) {
        for (C0191a next : this.f11052a) {
            if (next.a(cls)) {
                return next.f11054b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@m0 Class<T> cls, @m0 d<T> dVar) {
        this.f11052a.add(0, new C0191a(cls, dVar));
    }
}

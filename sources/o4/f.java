package o4;

import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.List;
import v3.l;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?>> f11066a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f11067a;

        /* renamed from: b  reason: collision with root package name */
        public final l<T> f11068b;

        public a(@m0 Class<T> cls, @m0 l<T> lVar) {
            this.f11067a = cls;
            this.f11068b = lVar;
        }

        public boolean a(@m0 Class<?> cls) {
            return this.f11067a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@m0 Class<Z> cls, @m0 l<Z> lVar) {
        this.f11066a.add(new a(cls, lVar));
    }

    @o0
    public synchronized <Z> l<Z> b(@m0 Class<Z> cls) {
        int size = this.f11066a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f11066a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f11068b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@m0 Class<Z> cls, @m0 l<Z> lVar) {
        this.f11066a.add(0, new a(cls, lVar));
    }
}

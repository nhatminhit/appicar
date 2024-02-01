package i2;

import fh.g;
import fh.h;
import java.util.LinkedHashMap;
import java.util.Map;
import xe.l0;

public abstract class a {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Map<b<?>, Object> f9016a = new LinkedHashMap();

    /* renamed from: i2.a$a  reason: collision with other inner class name */
    public static final class C0151a extends a {
        @g

        /* renamed from: b  reason: collision with root package name */
        public static final C0151a f9017b = new C0151a();

        @h
        public <T> T a(@g b<T> bVar) {
            l0.p(bVar, "key");
            return null;
        }
    }

    public interface b<T> {
    }

    @h
    public abstract <T> T a(@g b<T> bVar);

    @g
    public final Map<b<?>, Object> b() {
        return this.f9016a;
    }
}

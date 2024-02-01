package u4;

import android.util.Log;
import d.m0;
import e1.m;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13722a = "FactoryPools";

    /* renamed from: b  reason: collision with root package name */
    public static final int f13723b = 20;

    /* renamed from: c  reason: collision with root package name */
    public static final g<Object> f13724c = new C0228a();

    /* renamed from: u4.a$a  reason: collision with other inner class name */
    public class C0228a implements g<Object> {
        public void a(@m0 Object obj) {
        }
    }

    public class b implements d<List<T>> {
        @m0
        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    public class c implements g<List<T>> {
        /* renamed from: b */
        public void a(@m0 List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T a();
    }

    public static final class e<T> implements m.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final d<T> f13725a;

        /* renamed from: b  reason: collision with root package name */
        public final g<T> f13726b;

        /* renamed from: c  reason: collision with root package name */
        public final m.a<T> f13727c;

        public e(@m0 m.a<T> aVar, @m0 d<T> dVar, @m0 g<T> gVar) {
            this.f13727c = aVar;
            this.f13725a = dVar;
            this.f13726b = gVar;
        }

        public boolean a(@m0 T t10) {
            if (t10 instanceof f) {
                ((f) t10).i().b(true);
            }
            this.f13726b.a(t10);
            return this.f13727c.a(t10);
        }

        public T b() {
            T b10 = this.f13727c.b();
            if (b10 == null) {
                b10 = this.f13725a.a();
                if (Log.isLoggable(a.f13722a, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Created new ");
                    sb2.append(b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).i().b(false);
            }
            return b10;
        }
    }

    public interface f {
        @m0
        c i();
    }

    public interface g<T> {
        void a(@m0 T t10);
    }

    @m0
    public static <T extends f> m.a<T> a(@m0 m.a<T> aVar, @m0 d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @m0
    public static <T> m.a<T> b(@m0 m.a<T> aVar, @m0 d<T> dVar, @m0 g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @m0
    public static <T> g<T> c() {
        return f13724c;
    }

    @m0
    public static <T extends f> m.a<T> d(int i10, @m0 d<T> dVar) {
        return a(new m.b(i10), dVar);
    }

    @m0
    public static <T extends f> m.a<T> e(int i10, @m0 d<T> dVar) {
        return a(new m.c(i10), dVar);
    }

    @m0
    public static <T> m.a<List<T>> f() {
        return g(20);
    }

    @m0
    public static <T> m.a<List<T>> g(int i10) {
        return b(new m.c(i10), new b(), new c());
    }
}

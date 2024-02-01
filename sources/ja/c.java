package ja;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, ha.g<?>> f19853a;

    /* renamed from: b  reason: collision with root package name */
    public final ma.b f19854b = ma.b.a();

    public class a implements k<T> {
        public a() {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    public class b implements k<T> {
        public b() {
        }

        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: ja.c$c  reason: collision with other inner class name */
    public class C0333c implements k<T> {
        public C0333c() {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    public class d implements k<T> {
        public d() {
        }

        public T a() {
            return new j();
        }
    }

    public class e implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final o f19859a = o.b();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Class f19860b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Type f19861c;

        public e(Class cls, Type type) {
            this.f19860b = cls;
            this.f19861c = type;
        }

        public T a() {
            try {
                return this.f19859a.c(this.f19860b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f19861c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    public class f implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ha.g f19863a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f19864b;

        public f(ha.g gVar, Type type) {
            this.f19863a = gVar;
            this.f19864b = type;
        }

        public T a() {
            return this.f19863a.a(this.f19864b);
        }
    }

    public class g implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ha.g f19866a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f19867b;

        public g(ha.g gVar, Type type) {
            this.f19866a = gVar;
            this.f19867b = type;
        }

        public T a() {
            return this.f19866a.a(this.f19867b);
        }
    }

    public class h implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Constructor f19869a;

        public h(Constructor constructor) {
            this.f19869a = constructor;
        }

        public T a() {
            try {
                return this.f19869a.newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke " + this.f19869a + " with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke " + this.f19869a + " with no args", e11.getTargetException());
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    public class i implements k<T> {
        public i() {
        }

        public T a() {
            return new TreeSet();
        }
    }

    public class j implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f19872a;

        public j(Type type) {
            this.f19872a = type;
        }

        public T a() {
            Type type = this.f19872a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new ha.l("Invalid EnumSet type: " + this.f19872a.toString());
            }
            throw new ha.l("Invalid EnumSet type: " + this.f19872a.toString());
        }
    }

    public class k implements k<T> {
        public k() {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    public class l implements k<T> {
        public l() {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    public class m implements k<T> {
        public m() {
        }

        public T a() {
            return new ArrayList();
        }
    }

    public class n implements k<T> {
        public n() {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, ha.g<?>> map) {
        this.f19853a = map;
    }

    public <T> k<T> a(oa.a<T> aVar) {
        Type h10 = aVar.h();
        Class<? super T> f10 = aVar.f();
        ha.g gVar = this.f19853a.get(h10);
        if (gVar != null) {
            return new f(gVar, h10);
        }
        ha.g gVar2 = this.f19853a.get(f10);
        if (gVar2 != null) {
            return new g(gVar2, h10);
        }
        k<T> b10 = b(f10);
        if (b10 != null) {
            return b10;
        }
        k<T> c10 = c(h10, f10);
        return c10 != null ? c10 : d(h10, f10);
    }

    public final <T> k<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f19854b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> k<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(oa.a.c(((ParameterizedType) type).getActualTypeArguments()[0]).f())) ? new d() : new C0333c();
        }
        return null;
    }

    public final <T> k<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f19853a.toString();
    }
}

package u5;

import i5.j;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import k5.i;
import u5.d;

public class b extends d implements Serializable {
    public static final long P = 1;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f13750b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f13751a;

        public a() {
            HashSet hashSet = new HashSet();
            this.f13751a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }

        public boolean a(Class<?> cls) {
            return this.f13751a.contains(cls.getName());
        }
    }

    public d.b a(i<?> iVar, j jVar) {
        return e(iVar, jVar) ? d.b.DENIED : d.b.INDETERMINATE;
    }

    public d.b b(i<?> iVar, j jVar, String str) {
        return d.b.INDETERMINATE;
    }

    public d.b c(i<?> iVar, j jVar, j jVar2) {
        return d(iVar, jVar, jVar2) ? d.b.ALLOWED : d.b.DENIED;
    }

    public boolean d(i<?> iVar, j jVar, j jVar2) {
        return true;
    }

    public boolean e(i<?> iVar, j jVar) {
        return a.f13750b.a(jVar.g());
    }
}

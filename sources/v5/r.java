package v5;

import i5.e;
import i5.j;
import i5.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import k5.i;
import u5.c;
import v4.f0;

public class r extends q {

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f14192c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f14193d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, j> f14194e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14195f;

    public r(i<?> iVar, j jVar, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, j> hashMap) {
        super(jVar, iVar.M());
        this.f14192c = iVar;
        this.f14193d = concurrentHashMap;
        this.f14194e = hashMap;
        this.f14195f = iVar.T(q.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    public static String h(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public static r j(i<?> iVar, j jVar, Collection<c> collection, boolean z10, boolean z11) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        if (z10 != z11) {
            if (z10) {
                concurrentHashMap = new ConcurrentHashMap();
                hashMap = null;
            } else {
                hashMap = new HashMap();
                concurrentHashMap = new ConcurrentHashMap(4);
            }
            boolean T = iVar.T(q.ACCEPT_CASE_INSENSITIVE_VALUES);
            if (collection != null) {
                for (c next : collection) {
                    Class<?> b10 = next.b();
                    String a10 = next.c() ? next.a() : h(b10);
                    if (z10) {
                        concurrentHashMap.put(b10.getName(), a10);
                    }
                    if (z11) {
                        if (T) {
                            a10 = a10.toLowerCase();
                        }
                        j jVar2 = (j) hashMap.get(a10);
                        if (jVar2 == null || !b10.isAssignableFrom(jVar2.g())) {
                            hashMap.put(a10, iVar.h(b10));
                        }
                    }
                }
            }
            return new r(iVar, jVar, concurrentHashMap, hashMap);
        }
        throw new IllegalArgumentException();
    }

    public String a(Object obj) {
        return k(obj.getClass());
    }

    public String b() {
        return new TreeSet(this.f14194e.keySet()).toString();
    }

    public String c(Object obj, Class<?> cls) {
        return obj == null ? k(cls) : a(obj);
    }

    public f0.b f() {
        return f0.b.NAME;
    }

    public j g(e eVar, String str) {
        return i(str);
    }

    public j i(String str) {
        if (this.f14195f) {
            str = str.toLowerCase();
        }
        return this.f14194e.get(str);
    }

    public String k(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = this.f14193d.get(name);
        if (str == null) {
            Class<?> g10 = this.f14190a.Y(cls).g();
            if (this.f14192c.S()) {
                str = this.f14192c.m().o0(this.f14192c.P(g10).z());
            }
            if (str == null) {
                str = h(g10);
            }
            this.f14193d.put(name, str);
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{getClass().getName(), this.f14194e});
    }
}

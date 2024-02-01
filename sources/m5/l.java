package m5;

import a6.j;
import i5.g;
import i5.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n5.z;
import p7.f;
import z5.n;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10414a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10415b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10416c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10417d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10418e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10419f = 6;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10420g = 7;

    /* renamed from: h  reason: collision with root package name */
    public static final Class<?> f10421h = Arrays.asList(new Object[]{null, null}).getClass();

    /* renamed from: i  reason: collision with root package name */
    public static final Class<?> f10422i;

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?> f10423j;

    /* renamed from: k  reason: collision with root package name */
    public static final Class<?> f10424k;

    /* renamed from: l  reason: collision with root package name */
    public static final Class<?> f10425l;

    /* renamed from: m  reason: collision with root package name */
    public static final Class<?> f10426m;

    /* renamed from: n  reason: collision with root package name */
    public static final Class<?> f10427n = Collections.unmodifiableList(new LinkedList()).getClass();

    /* renamed from: o  reason: collision with root package name */
    public static final Class<?> f10428o;

    public static class b implements j<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final i5.j f10429a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10430b;

        public b(int i10, i5.j jVar) {
            this.f10429a = jVar;
            this.f10430b = i10;
        }

        public Object a(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f10430b) {
                case 1:
                    Set set = (Set) obj;
                    d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        public i5.j b(n nVar) {
            return this.f10429a;
        }

        public i5.j c(n nVar) {
            return this.f10429a;
        }

        public final void d(int i10) {
            if (i10 != 1) {
                throw new IllegalArgumentException("Can not deserialize Singleton container from " + i10 + " entries");
            }
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        f10422i = singleton.getClass();
        f10425l = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        f10423j = singletonList.getClass();
        f10426m = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap("a", f.f11703n);
        f10424k = singletonMap.getClass();
        f10428o = Collections.unmodifiableMap(singletonMap).getClass();
    }

    public static b a(int i10, i5.j jVar, Class<?> cls) {
        return new b(i10, jVar.C(cls));
    }

    public static k<?> b(g gVar, i5.j jVar) throws i5.l {
        int i10;
        int i11;
        Class cls;
        if (jVar.j(f10421h)) {
            i10 = 7;
        } else if (jVar.j(f10423j)) {
            i10 = 2;
        } else {
            if (jVar.j(f10422i)) {
                i11 = 1;
            } else if (jVar.j(f10426m) || jVar.j(f10427n)) {
                i10 = 5;
            } else if (!jVar.j(f10425l)) {
                return null;
            } else {
                i11 = 4;
            }
            cls = Set.class;
            return new z(a(i11, jVar, cls));
        }
        cls = List.class;
        return new z(a(i11, jVar, cls));
    }

    public static k<?> c(g gVar, i5.j jVar) throws i5.l {
        int i10;
        if (jVar.j(f10424k)) {
            i10 = 3;
        } else if (!jVar.j(f10428o)) {
            return null;
        } else {
            i10 = 6;
        }
        return new z(a(i10, jVar, Map.class));
    }
}

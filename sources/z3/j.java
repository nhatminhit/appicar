package z3;

import android.util.Log;
import d.g1;
import d.o0;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import t4.k;

public final class j implements b {

    /* renamed from: h  reason: collision with root package name */
    public static final int f15809h = 4194304;
    @g1

    /* renamed from: i  reason: collision with root package name */
    public static final int f15810i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f15811j = 2;

    /* renamed from: b  reason: collision with root package name */
    public final h<a, Object> f15812b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15813c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f15814d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, a<?>> f15815e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15816f;

    /* renamed from: g  reason: collision with root package name */
    public int f15817g;

    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f15818a;

        /* renamed from: b  reason: collision with root package name */
        public int f15819b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f15820c;

        public a(b bVar) {
            this.f15818a = bVar;
        }

        public void a() {
            this.f15818a.c(this);
        }

        public void b(int i10, Class<?> cls) {
            this.f15819b = i10;
            this.f15820c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15819b == aVar.f15819b && this.f15820c == aVar.f15820c;
        }

        public int hashCode() {
            int i10 = this.f15819b * 31;
            Class<?> cls = this.f15820c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f15819b + "array=" + this.f15820c + '}';
        }
    }

    public static final class b extends d<a> {
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i10, Class<?> cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    @g1
    public j() {
        this.f15812b = new h<>();
        this.f15813c = new b();
        this.f15814d = new HashMap();
        this.f15815e = new HashMap();
        this.f15816f = 4194304;
    }

    public j(int i10) {
        this.f15812b = new h<>();
        this.f15813c = new b();
        this.f15814d = new HashMap();
        this.f15815e = new HashMap();
        this.f15816f = i10;
    }

    public synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        } else if (i10 >= 20 || i10 == 15) {
            h(this.f15816f / 2);
        }
    }

    public synchronized void b() {
        h(0);
    }

    public synchronized <T> T c(int i10, Class<T> cls) {
        return m(this.f15813c.e(i10, cls), cls);
    }

    @Deprecated
    public <T> void d(T t10, Class<T> cls) {
        put(t10);
    }

    public synchronized <T> T e(int i10, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = n(cls).ceilingKey(Integer.valueOf(i10));
        return m(q(i10, ceilingKey) ? this.f15813c.e(ceilingKey.intValue(), cls) : this.f15813c.e(i10, cls), cls);
    }

    public final void f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> n10 = n(cls);
        Integer num = n10.get(Integer.valueOf(i10));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i10);
            if (intValue == 1) {
                n10.remove(valueOf);
            } else {
                n10.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
    }

    public final void g() {
        h(this.f15816f);
    }

    public final void h(int i10) {
        while (this.f15817g > i10) {
            Object f10 = this.f15812b.f();
            k.d(f10);
            a i11 = i(f10);
            this.f15817g -= i11.b(f10) * i11.a();
            f(i11.b(f10), f10.getClass());
            if (Log.isLoggable(i11.g(), 2)) {
                i11.g();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("evicted: ");
                sb2.append(i11.b(f10));
            }
        }
    }

    public final <T> a<T> i(T t10) {
        return j(t10.getClass());
    }

    public final <T> a<T> j(Class<T> cls) {
        a<T> aVar = this.f15815e.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else if (cls.equals(byte[].class)) {
                aVar = new g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f15815e.put(cls, aVar);
        }
        return aVar;
    }

    @o0
    public final <T> T k(a aVar) {
        return this.f15812b.a(aVar);
    }

    public int l() {
        int i10 = 0;
        for (Class next : this.f15814d.keySet()) {
            for (Integer num : this.f15814d.get(next).keySet()) {
                i10 += num.intValue() * ((Integer) this.f15814d.get(next).get(num)).intValue() * j(next).a();
            }
        }
        return i10;
    }

    public final <T> T m(a aVar, Class<T> cls) {
        a<T> j10 = j(cls);
        T k10 = k(aVar);
        if (k10 != null) {
            this.f15817g -= j10.b(k10) * j10.a();
            f(j10.b(k10), cls);
        }
        if (k10 != null) {
            return k10;
        }
        if (Log.isLoggable(j10.g(), 2)) {
            j10.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Allocated ");
            sb2.append(aVar.f15819b);
            sb2.append(" bytes");
        }
        return j10.newArray(aVar.f15819b);
    }

    public final NavigableMap<Integer, Integer> n(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f15814d.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f15814d.put(cls, treeMap);
        return treeMap;
    }

    public final boolean o() {
        int i10 = this.f15817g;
        return i10 == 0 || this.f15816f / i10 >= 2;
    }

    public final boolean p(int i10) {
        return i10 <= this.f15816f / 2;
    }

    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        a<?> j10 = j(cls);
        int b10 = j10.b(t10);
        int a10 = j10.a() * b10;
        if (p(a10)) {
            a e10 = this.f15813c.e(b10, cls);
            this.f15812b.d(e10, t10);
            NavigableMap<Integer, Integer> n10 = n(cls);
            Integer num = n10.get(Integer.valueOf(e10.f15819b));
            Integer valueOf = Integer.valueOf(e10.f15819b);
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            n10.put(valueOf, Integer.valueOf(i10));
            this.f15817g += a10;
            g();
        }
    }

    public final boolean q(int i10, Integer num) {
        return num != null && (o() || num.intValue() <= i10 * 8);
    }
}

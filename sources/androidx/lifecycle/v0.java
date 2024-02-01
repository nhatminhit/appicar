package androidx.lifecycle;

import d.j0;
import d.m0;
import d.o0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class v0 {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2854a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Set<Closeable> f2855b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f2856c;

    public v0() {
        this.f2854a = new HashMap();
        this.f2855b = new LinkedHashSet();
        this.f2856c = false;
    }

    public v0(@m0 Closeable... closeableArr) {
        this.f2854a = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f2855b = linkedHashSet;
        this.f2856c = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }

    public static void c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void a(@m0 Closeable closeable) {
        Set<Closeable> set = this.f2855b;
        if (set != null) {
            synchronized (set) {
                this.f2855b.add(closeable);
            }
        }
    }

    @j0
    public final void b() {
        this.f2856c = true;
        Map<String, Object> map = this.f2854a;
        if (map != null) {
            synchronized (map) {
                for (Object c10 : this.f2854a.values()) {
                    c(c10);
                }
            }
        }
        Set<Closeable> set = this.f2855b;
        if (set != null) {
            synchronized (set) {
                for (Closeable c11 : this.f2855b) {
                    c(c11);
                }
            }
        }
        e();
    }

    public <T> T d(String str) {
        T t10;
        Map<String, Object> map = this.f2854a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = this.f2854a.get(str);
        }
        return t10;
    }

    public void e() {
    }

    public <T> T f(String str, T t10) {
        T t11;
        synchronized (this.f2854a) {
            t11 = this.f2854a.get(str);
            if (t11 == null) {
                this.f2854a.put(str, t10);
            }
        }
        if (t11 != null) {
            t10 = t11;
        }
        if (this.f2856c) {
            c(t10);
        }
        return t10;
    }
}

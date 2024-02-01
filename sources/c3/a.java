package c3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import c3.c;
import d.m0;
import d.o0;
import f3.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f4798d = "Startup";

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f4799e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f4800f = new Object();
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f4801a = new HashMap();
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f4802b = new HashSet();
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final Context f4803c;

    public a(@m0 Context context) {
        this.f4803c = context.getApplicationContext();
    }

    @m0
    public static a e(@m0 Context context) {
        if (f4799e == null) {
            synchronized (f4800f) {
                if (f4799e == null) {
                    f4799e = new a(context);
                }
            }
        }
        return f4799e;
    }

    public static void h(@m0 a aVar) {
        synchronized (f4800f) {
            f4799e = aVar;
        }
    }

    public void a() {
        try {
            b.c(f4798d);
            b(this.f4803c.getPackageManager().getProviderInfo(new ComponentName(this.f4803c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            b.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new d((Throwable) e10);
        } catch (Throwable th2) {
            b.f();
            throw th2;
        }
    }

    public void b(@o0 Bundle bundle) {
        String string = this.f4803c.getString(c.a.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f4802b.add(cls);
                        }
                    }
                }
                for (Class<? extends b<?>> d10 : this.f4802b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d((Throwable) e10);
            }
        }
    }

    @m0
    public <T> T c(@m0 Class<? extends b<?>> cls) {
        T t10;
        synchronized (f4800f) {
            t10 = this.f4801a.get(cls);
            if (t10 == null) {
                t10 = d(cls, new HashSet());
            }
        }
        return t10;
    }

    @m0
    public final <T> T d(@m0 Class<? extends b<?>> cls, @m0 Set<Class<?>> set) {
        T t10;
        if (b.h()) {
            try {
                b.c(cls.getSimpleName());
            } catch (Throwable th2) {
                b.f();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4801a.containsKey(cls)) {
                set.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f4801a.containsKey(next)) {
                            d(next, set);
                        }
                    }
                }
                t10 = bVar.b(this.f4803c);
                set.remove(cls);
                this.f4801a.put(cls, t10);
            } else {
                t10 = this.f4801a.get(cls);
            }
            b.f();
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    @m0
    public <T> T f(@m0 Class<? extends b<T>> cls) {
        return c(cls);
    }

    public boolean g(@m0 Class<? extends b<?>> cls) {
        return this.f4802b.contains(cls);
    }
}

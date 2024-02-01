package rh;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import rh.c;
import rh.f;

public class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f22678c = f();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22679a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f22680b;

    public static final class a extends r {

        /* renamed from: rh.r$a$a  reason: collision with other inner class name */
        public static final class C0417a implements Executor {
            public final Handler O = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.O.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        public Executor c() {
            return new C0417a();
        }

        @Nullable
        public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return r.super.h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public r(boolean z10) {
        this.f22679a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f22680b = constructor;
    }

    public static r f() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new r(true);
    }

    public static r g() {
        return f22678c;
    }

    public List<? extends c.a> a(@Nullable Executor executor) {
        g gVar = new g(executor);
        if (!this.f22679a) {
            return Collections.singletonList(gVar);
        }
        return Arrays.asList(new c.a[]{e.f22604a, gVar});
    }

    public int b() {
        return this.f22679a ? 2 : 1;
    }

    @Nullable
    public Executor c() {
        return null;
    }

    public List<? extends f.a> d() {
        return this.f22679a ? Collections.singletonList(o.f22631a) : Collections.emptyList();
    }

    public int e() {
        return this.f22679a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f22680b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public boolean i(Method method) {
        return this.f22679a && method.isDefault();
    }
}

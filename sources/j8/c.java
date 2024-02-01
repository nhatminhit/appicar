package j8;

import android.os.Looper;
import d.m0;
import e8.a;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@a
public final class c {
    public c() {
        throw new AssertionError("Uninstantiable");
    }

    @a
    public static void a(@m0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkMainThread: current thread ");
            sb2.append(valueOf);
            sb2.append(" IS NOT the main thread ");
            sb2.append(valueOf2);
            sb2.append("!");
            throw new IllegalStateException(str);
        }
    }

    @a
    public static void b(@m0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkNotMainThread: current thread ");
            sb2.append(valueOf);
            sb2.append(" IS the main thread ");
            sb2.append(valueOf2);
            sb2.append("!");
            throw new IllegalStateException(str);
        }
    }

    @a
    @EnsuresNonNull({"#1"})
    public static void c(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @a
    @EnsuresNonNull({"#1"})
    public static void d(@Nullable Object obj, @m0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @a
    public static void e(@m0 Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @a
    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @a
    public static void g(boolean z10, @m0 Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}

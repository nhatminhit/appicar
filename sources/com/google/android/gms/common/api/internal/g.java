package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.f;
import d.m0;
import e8.a;
import j8.s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@a
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5667a = Collections.newSetFromMap(new WeakHashMap());

    @a
    @m0
    public static <L> f<L> a(@m0 L l10, @m0 Looper looper, @m0 String str) {
        s.m(l10, "Listener must not be null");
        s.m(looper, "Looper must not be null");
        s.m(str, "Listener type must not be null");
        return new f<>(looper, l10, str);
    }

    @a
    @m0
    public static <L> f<L> b(@m0 L l10, @m0 Executor executor, @m0 String str) {
        s.m(l10, "Listener must not be null");
        s.m(executor, "Executor must not be null");
        s.m(str, "Listener type must not be null");
        return new f<>(executor, l10, str);
    }

    @a
    @m0
    public static <L> f.a<L> c(@m0 L l10, @m0 String str) {
        s.m(l10, "Listener must not be null");
        s.m(str, "Listener type must not be null");
        s.i(str, "Listener type must not be empty");
        return new f.a<>(l10, str);
    }

    @m0
    public final f d(@m0 Object obj, @m0 Looper looper, @m0 String str) {
        f a10 = a(obj, looper, "NO_TYPE");
        this.f5667a.add(a10);
        return a10;
    }

    public final void e() {
        for (f a10 : this.f5667a) {
            a10.a();
        }
        this.f5667a.clear();
    }
}

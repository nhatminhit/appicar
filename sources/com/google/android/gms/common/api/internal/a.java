package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import w8.v;

@e8.a
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final a S = new a();
    public final AtomicBoolean O = new AtomicBoolean();
    public final AtomicBoolean P = new AtomicBoolean();
    @GuardedBy("sInstance")
    public final ArrayList Q = new ArrayList();
    @GuardedBy("sInstance")
    public boolean R = false;

    @e8.a
    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    public interface C0093a {
        @e8.a
        void a(boolean z10);
    }

    @e8.a
    @m0
    public static a b() {
        return S;
    }

    @e8.a
    public static void c(@m0 Application application) {
        a aVar = S;
        synchronized (aVar) {
            if (!aVar.R) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.R = true;
            }
        }
    }

    @e8.a
    public void a(@m0 C0093a aVar) {
        synchronized (S) {
            this.Q.add(aVar);
        }
    }

    @e8.a
    public boolean d() {
        return this.O.get();
    }

    @e8.a
    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.P.get()) {
            if (!v.e()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.P.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.O.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (S) {
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                ((C0093a) it.next()).a(z10);
            }
        }
    }

    public final void onActivityCreated(@m0 Activity activity, @o0 Bundle bundle) {
        boolean compareAndSet = this.O.compareAndSet(true, false);
        this.P.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(@m0 Activity activity) {
    }

    public final void onActivityPaused(@m0 Activity activity) {
    }

    public final void onActivityResumed(@m0 Activity activity) {
        boolean compareAndSet = this.O.compareAndSet(true, false);
        this.P.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(@m0 Activity activity, @m0 Bundle bundle) {
    }

    public final void onActivityStarted(@m0 Activity activity) {
    }

    public final void onActivityStopped(@m0 Activity activity) {
    }

    public final void onConfigurationChanged(@m0 Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.O.compareAndSet(false, true)) {
            this.P.set(true);
            f(true);
        }
    }
}

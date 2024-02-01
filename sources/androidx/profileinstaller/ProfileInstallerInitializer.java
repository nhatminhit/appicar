package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d.m0;
import d.t;
import d.t0;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r2.h;
import r2.i;
import r2.j;
import r2.k;

public class ProfileInstallerInitializer implements c3.b<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3042a = 5000;

    @t0(16)
    public static class a {
        @t
        public static void c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new k(runnable));
        }
    }

    @t0(28)
    public static class b {
        @t
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void l(@m0 Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new j(context));
    }

    @m0
    public List<Class<? extends c3.b<?>>> a() {
        return Collections.emptyList();
    }

    @m0
    /* renamed from: f */
    public c b(@m0 Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        g(context.getApplicationContext());
        return new c();
    }

    @t0(16)
    public void g(@m0 Context context) {
        a.c(new i(this, context));
    }

    /* renamed from: h */
    public void i(@m0 Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}

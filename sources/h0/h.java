package h0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import d.m0;
import d.x0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@x0({x0.a.LIBRARY})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8392a = "ActivityRecreator";

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f8393b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f8394c = b();

    /* renamed from: d  reason: collision with root package name */
    public static final Field f8395d = f();

    /* renamed from: e  reason: collision with root package name */
    public static final Method f8396e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f8397f;

    /* renamed from: g  reason: collision with root package name */
    public static final Method f8398g;

    /* renamed from: h  reason: collision with root package name */
    public static final Handler f8399h = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public final /* synthetic */ d O;
        public final /* synthetic */ Object P;

        public a(d dVar, Object obj) {
            this.O = dVar;
            this.P = obj;
        }

        public void run() {
            this.O.O = this.P;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Application O;
        public final /* synthetic */ d P;

        public b(Application application, d dVar) {
            this.O = application;
            this.P = dVar;
        }

        public void run() {
            this.O.unregisterActivityLifecycleCallbacks(this.P);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object O;
        public final /* synthetic */ Object P;

        public c(Object obj, Object obj2) {
            this.O = obj;
            this.P = obj2;
        }

        public void run() {
            try {
                Method method = h.f8396e;
                if (method != null) {
                    method.invoke(this.O, new Object[]{this.P, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                h.f8397f.invoke(this.O, new Object[]{this.P, Boolean.FALSE});
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object O;
        public Activity P;
        public final int Q;
        public boolean R = false;
        public boolean S = false;
        public boolean T = false;

        public d(@m0 Activity activity) {
            this.P = activity;
            this.Q = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.P == activity) {
                this.P = null;
                this.S = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.S && !this.T && !this.R && h.h(this.O, this.Q, activity)) {
                this.T = true;
                this.O = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.P == activity) {
                this.R = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f8393b = a10;
        f8396e = d(a10);
        f8397f = c(a10);
        f8398g = e(a10);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f8395d.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f8399h.postAtFrontOfQueue(new c(f8394c.get(activity), obj2));
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean i(@m0 Activity activity) {
        Object obj;
        Application application;
        d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f8398g == null) {
            return false;
        } else {
            if (f8397f == null && f8396e == null) {
                return false;
            }
            try {
                Object obj2 = f8395d.get(activity);
                if (obj2 == null || (obj = f8394c.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f8399h;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f8398g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}

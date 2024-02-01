package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import d.m0;
import d.o0;
import d.t0;
import d.x0;

@t0(api = 28)
@x0({x0.a.Q})
public class CoreComponentFactory extends AppComponentFactory {

    @x0({x0.a.Q})
    public interface a {
        Object a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.core.app.CoreComponentFactory.a) r1).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(T r1) {
        /*
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.a
            if (r0 == 0) goto L_0x000e
            r0 = r1
            androidx.core.app.CoreComponentFactory$a r0 = (androidx.core.app.CoreComponentFactory.a) r0
            java.lang.Object r0 = r0.a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.CoreComponentFactory.a(java.lang.Object):java.lang.Object");
    }

    @m0
    public Activity instantiateActivity(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @m0
    public Application instantiateApplication(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @m0
    public ContentProvider instantiateProvider(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @m0
    public BroadcastReceiver instantiateReceiver(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @m0
    public Service instantiateService(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}

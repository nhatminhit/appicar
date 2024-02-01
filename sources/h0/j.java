package h0;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import d.m0;
import d.o0;
import d.t0;
import java.lang.reflect.InvocationTargetException;

@t0(28)
public class j extends AppComponentFactory {
    @m0
    public Activity a(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @m0
    public Application b(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @m0
    public ContentProvider c(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @m0
    public BroadcastReceiver d(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @m0
    public Service e(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @m0
    public final Activity instantiateActivity(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @m0
    public final Application instantiateApplication(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @m0
    public final ContentProvider instantiateProvider(@m0 ClassLoader classLoader, @m0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @m0
    public final BroadcastReceiver instantiateReceiver(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @m0
    public final Service instantiateService(@m0 ClassLoader classLoader, @m0 String str, @o0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}

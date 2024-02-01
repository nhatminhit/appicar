package androidx.fragment.app;

import androidx.collection.i;
import androidx.fragment.app.Fragment;
import d.m0;
import java.lang.reflect.InvocationTargetException;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i<ClassLoader, i<String, Class<?>>> f2628a = new i<>();

    public static boolean b(@m0 ClassLoader classLoader, @m0 String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @m0
    public static Class<?> c(@m0 ClassLoader classLoader, @m0 String str) throws ClassNotFoundException {
        i<ClassLoader, i<String, Class<?>>> iVar = f2628a;
        i iVar2 = iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new i();
            iVar.put(classLoader, iVar2);
        }
        Class<?> cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    @m0
    public static Class<? extends Fragment> d(@m0 ClassLoader classLoader, @m0 String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        } catch (ClassCastException e11) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        }
    }

    @m0
    public Fragment a(@m0 ClassLoader classLoader, @m0 String str) {
        try {
            return (Fragment) d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e10) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}

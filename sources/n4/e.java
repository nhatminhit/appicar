package n4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final String f10801b = "ManifestParser";

    /* renamed from: c  reason: collision with root package name */
    public static final String f10802c = "GlideModule";

    /* renamed from: a  reason: collision with root package name */
    public final Context f10803a;

    public e(Context context) {
        this.f10803a = context;
    }

    public static c b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                c(cls, e10);
            }
            if (obj instanceof c) {
                return (c) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    public static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<c> a() {
        Log.isLoggable(f10801b, 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f10803a.getPackageManager().getApplicationInfo(this.f10803a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable(f10801b, 3);
                return arrayList;
            }
            if (Log.isLoggable(f10801b, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Got app info metadata: ");
                sb2.append(applicationInfo.metaData);
            }
            for (String next : applicationInfo.metaData.keySet()) {
                if (f10802c.equals(applicationInfo.metaData.get(next))) {
                    arrayList.add(b(next));
                    if (Log.isLoggable(f10801b, 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Loaded Glide module: ");
                        sb3.append(next);
                    }
                }
            }
            Log.isLoggable(f10801b, 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }
}

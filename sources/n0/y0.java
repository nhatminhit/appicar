package n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import d.m0;
import d.t0;
import d.x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k0.d;
import y0.f;
import zb.r;

@t0(21)
@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class y0 extends d1 {

    /* renamed from: d  reason: collision with root package name */
    public static final String f10741d = "TypefaceCompatApi21Impl";

    /* renamed from: e  reason: collision with root package name */
    public static final String f10742e = "android.graphics.FontFamily";

    /* renamed from: f  reason: collision with root package name */
    public static final String f10743f = "addFontWeightStyle";

    /* renamed from: g  reason: collision with root package name */
    public static final String f10744g = "createFromFamiliesWithDefault";

    /* renamed from: h  reason: collision with root package name */
    public static Class<?> f10745h = null;

    /* renamed from: i  reason: collision with root package name */
    public static Constructor<?> f10746i = null;

    /* renamed from: j  reason: collision with root package name */
    public static Method f10747j = null;

    /* renamed from: k  reason: collision with root package name */
    public static Method f10748k = null;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f10749l = false;

    public static boolean k(Object obj, String str, int i10, boolean z10) {
        n();
        try {
            return ((Boolean) f10747j.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Typeface l(Object obj) {
        n();
        try {
            Object newInstance = Array.newInstance(f10745h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10748k.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f10749l) {
            f10749l = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f10746i = constructor;
            f10745h = cls;
            f10747j = method;
            f10748k = method2;
        }
    }

    public static Object o() {
        n();
        try {
            return f10746i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Typeface b(Context context, d.c cVar, Resources resources, int i10) {
        Object o10 = o();
        d.C0165d[] a10 = cVar.a();
        int length = a10.length;
        int i11 = 0;
        while (i11 < length) {
            d.C0165d dVar = a10[i11];
            File e10 = e1.e(context);
            if (e10 == null) {
                return null;
            }
            try {
                if (!e1.c(e10, resources, dVar.b())) {
                    e10.delete();
                    return null;
                } else if (!k(o10, e10.getPath(), dVar.e(), dVar.f())) {
                    return null;
                } else {
                    i11++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e10.delete();
            }
        }
        return l(o10);
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, @m0 f.c[] cVarArr, int i10) {
        FileInputStream fileInputStream;
        if (cVarArr.length < 1) {
            return null;
        }
        f.c h10 = h(cVarArr, i10);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.d(), r.f25096b, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m10 = m(openFileDescriptor);
                if (m10 != null) {
                    if (m10.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m10);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d10 = super.d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d10;
            } catch (Throwable th2) {
                openFileDescriptor.close();
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th;
    }

    public final File m(@m0 ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}

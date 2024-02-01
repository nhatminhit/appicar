package n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.collection.i;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k0.d;
import y0.f;

@t0(24)
@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class z0 extends d1 {

    /* renamed from: d  reason: collision with root package name */
    public static final String f10750d = "TypefaceCompatApi24Impl";

    /* renamed from: e  reason: collision with root package name */
    public static final String f10751e = "android.graphics.FontFamily";

    /* renamed from: f  reason: collision with root package name */
    public static final String f10752f = "addFontWeightStyle";

    /* renamed from: g  reason: collision with root package name */
    public static final String f10753g = "createFromFamiliesWithDefault";

    /* renamed from: h  reason: collision with root package name */
    public static final Class<?> f10754h;

    /* renamed from: i  reason: collision with root package name */
    public static final Constructor<?> f10755i;

    /* renamed from: j  reason: collision with root package name */
    public static final Method f10756j;

    /* renamed from: k  reason: collision with root package name */
    public static final Method f10757k;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f10755i = constructor;
        f10754h = cls;
        f10756j = method;
        f10757k = method2;
    }

    public static boolean k(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f10756j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f10754h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f10757k.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        return f10756j != null;
    }

    public static Object n() {
        try {
            return f10755i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @o0
    public Typeface b(Context context, d.c cVar, Resources resources, int i10) {
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        for (d.C0165d dVar : cVar.a()) {
            ByteBuffer b10 = e1.b(context, resources, dVar.b());
            if (b10 == null || !k(n10, b10, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return l(n10);
    }

    @o0
    public Typeface c(Context context, @o0 CancellationSignal cancellationSignal, @m0 f.c[] cVarArr, int i10) {
        Object n10 = n();
        if (n10 == null) {
            return null;
        }
        i iVar = new i();
        for (f.c cVar : cVarArr) {
            Uri d10 = cVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(d10);
            if (byteBuffer == null) {
                byteBuffer = e1.f(context, cancellationSignal, d10);
                iVar.put(d10, byteBuffer);
            }
            if (byteBuffer == null || !k(n10, byteBuffer, cVar.c(), cVar.e(), cVar.f())) {
                return null;
            }
        }
        Typeface l10 = l(n10);
        if (l10 == null) {
            return null;
        }
        return Typeface.create(l10, i10);
    }
}

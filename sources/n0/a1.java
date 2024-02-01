package n0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import k0.d;
import y0.f;
import zb.r;

@t0(26)
@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a1 extends y0 {
    public static final int A = -1;

    /* renamed from: t  reason: collision with root package name */
    public static final String f10671t = "TypefaceCompatApi26Impl";

    /* renamed from: u  reason: collision with root package name */
    public static final String f10672u = "android.graphics.FontFamily";

    /* renamed from: v  reason: collision with root package name */
    public static final String f10673v = "addFontFromAssetManager";

    /* renamed from: w  reason: collision with root package name */
    public static final String f10674w = "addFontFromBuffer";

    /* renamed from: x  reason: collision with root package name */
    public static final String f10675x = "createFromFamiliesWithDefault";

    /* renamed from: y  reason: collision with root package name */
    public static final String f10676y = "freeze";

    /* renamed from: z  reason: collision with root package name */
    public static final String f10677z = "abortCreation";

    /* renamed from: m  reason: collision with root package name */
    public final Class<?> f10678m;

    /* renamed from: n  reason: collision with root package name */
    public final Constructor<?> f10679n;

    /* renamed from: o  reason: collision with root package name */
    public final Method f10680o;

    /* renamed from: p  reason: collision with root package name */
    public final Method f10681p;

    /* renamed from: q  reason: collision with root package name */
    public final Method f10682q;

    /* renamed from: r  reason: collision with root package name */
    public final Method f10683r;

    /* renamed from: s  reason: collision with root package name */
    public final Method f10684s;

    public a1() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y10 = y();
            constructor = z(y10);
            method4 = v(y10);
            method3 = w(y10);
            method2 = A(y10);
            method = u(y10);
            Class<?> cls2 = y10;
            method5 = x(y10);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to collect necessary methods for class ");
            sb2.append(e10.getClass().getName());
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f10678m = cls;
        this.f10679n = constructor;
        this.f10680o = method4;
        this.f10681p = method3;
        this.f10682q = method2;
        this.f10683r = method;
        this.f10684s = method5;
    }

    @o0
    private Object o() {
        try {
            return this.f10679n.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f10676y, new Class[0]);
    }

    @o0
    public Typeface b(Context context, d.c cVar, Resources resources, int i10) {
        if (!t()) {
            return super.b(context, cVar, resources, i10);
        }
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        for (d.C0165d dVar : cVar.a()) {
            if (!q(context, o10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                p(o10);
                return null;
            }
        }
        if (!s(o10)) {
            return null;
        }
        return l(o10);
    }

    @o0
    public Typeface c(Context context, @o0 CancellationSignal cancellationSignal, @m0 f.c[] cVarArr, int i10) {
        Typeface l10;
        ParcelFileDescriptor openFileDescriptor;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            f.c h10 = h(cVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h10.d(), r.f25096b, cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(h10.e()).setItalic(h10.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            Map<Uri, ByteBuffer> h11 = e1.h(context, cVarArr, cancellationSignal);
            Object o10 = o();
            if (o10 == null) {
                return null;
            }
            boolean z10 = false;
            for (f.c cVar : cVarArr) {
                ByteBuffer byteBuffer = h11.get(cVar.d());
                if (byteBuffer != null) {
                    if (!r(o10, byteBuffer, cVar.c(), cVar.e(), cVar.f() ? 1 : 0)) {
                        p(o10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                p(o10);
                return null;
            } else if (s(o10) && (l10 = l(o10)) != null) {
                return Typeface.create(l10, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    @o0
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        if (!t()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        if (!q(context, o10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            p(o10);
            return null;
        } else if (!s(o10)) {
            return null;
        } else {
            return l(o10);
        }
    }

    @o0
    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10678m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10684s.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void p(Object obj) {
        try {
            this.f10683r.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean q(Context context, Object obj, String str, int i10, int i11, int i12, @o0 FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10680o.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f10681p.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean s(Object obj) {
        try {
            return ((Boolean) this.f10682q.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean t() {
        return this.f10680o != null;
    }

    public Method u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod(f10677z, new Class[0]);
    }

    public Method v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f10673v, new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(f10674w, new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}

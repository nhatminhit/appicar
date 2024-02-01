package h5;

import java.lang.ref.SoftReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8834a = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";

    /* renamed from: b  reason: collision with root package name */
    public static final o f8835b;

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<SoftReference<a>> f8836c = new ThreadLocal<>();

    static {
        boolean z10;
        try {
            z10 = "true".equals(System.getProperty(f8834a));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f8835b = z10 ? o.a() : null;
    }

    public static a a() {
        ThreadLocal<SoftReference<a>> threadLocal = f8836c;
        SoftReference softReference = threadLocal.get();
        a aVar = softReference == null ? null : (a) softReference.get();
        if (aVar == null) {
            aVar = new a();
            o oVar = f8835b;
            threadLocal.set(oVar != null ? oVar.d(aVar) : new SoftReference<>(aVar));
        }
        return aVar;
    }

    public static int b() {
        o oVar = f8835b;
        if (oVar != null) {
            return oVar.b();
        }
        return -1;
    }
}

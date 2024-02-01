package yg;

import ah.a;
import ah.b;
import ah.f;
import ch.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import og.g0;
import og.h0;
import pg.e;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f24830a = l();

    /* renamed from: b  reason: collision with root package name */
    public static final int f24831b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static final int f24832c = 5;

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f24833d = Logger.getLogger(g0.class.getName());

    public static List<String> b(List<h0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0 h0Var = list.get(i10);
            if (h0Var != h0.HTTP_1_0) {
                arrayList.add(h0Var.toString());
            }
        }
        return arrayList;
    }

    public static byte[] f(List<h0> list) {
        c cVar = new c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0 h0Var = list.get(i10);
            if (h0Var != h0.HTTP_1_0) {
                cVar.writeByte(h0Var.toString().length());
                cVar.D0(h0Var.toString());
            }
        }
        return cVar.S();
    }

    public static h j() {
        h A = c.A();
        if (A != null) {
            return A;
        }
        h A2 = d.A();
        if (A2 != null) {
            return A2;
        }
        throw new NullPointerException("No platform found on Android");
    }

    public static h k() {
        e y10;
        if (t() && (y10 = e.y()) != null) {
            return y10;
        }
        g y11 = g.y();
        if (y11 != null) {
            return y11;
        }
        h y12 = f.y();
        return y12 != null ? y12 : new h();
    }

    public static h l() {
        return r() ? j() : k();
    }

    public static h m() {
        return f24830a;
    }

    public static boolean r() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean t() {
        if ("conscrypt".equals(e.s("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    @Nullable
    public static <T> T w(Object obj, Class<T> cls, String str) {
        Object w10;
        Class<Object> cls2 = Object.class;
        Class cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        if (str.equals("delegate") || (w10 = w(obj, cls2, "delegate")) == null) {
            return null;
        }
        return w(w10, cls, str);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public ah.c c(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x10 = x(sSLSocketFactory);
        if (x10 != null) {
            return d(x10);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + m() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public ah.c d(X509TrustManager x509TrustManager) {
        return new a(e(x509TrustManager));
    }

    public f e(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void g(SSLSocketFactory sSLSocketFactory) {
    }

    public void h(SSLSocket sSLSocket, @Nullable String str, List<h0> list) throws IOException {
    }

    public void i(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public String n() {
        return "OkHttp";
    }

    public SSLContext o() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Nullable
    public String p(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object q(String str) {
        if (f24833d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean s(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void u(int i10, String str, @Nullable Throwable th2) {
        f24833d.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void v(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        u(5, str, (Throwable) obj);
    }

    @Nullable
    public X509TrustManager x(SSLSocketFactory sSLSocketFactory) {
        try {
            Object w10 = w(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (w10 == null) {
                return null;
            }
            return (X509TrustManager) w(w10, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

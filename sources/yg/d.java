package yg;

import ah.f;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import og.h0;
import pg.e;

public class d extends h {

    /* renamed from: l  reason: collision with root package name */
    public static final int f24805l = 4000;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f24806e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f24807f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f24808g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f24809h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f24810i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f24811j;

    /* renamed from: k  reason: collision with root package name */
    public final b f24812k = b.b();

    public static final class a extends ah.c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f24813a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24814b;

        public a(Object obj, Method method) {
            this.f24813a = obj;
            this.f24814b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f24814b.invoke(this.f24813a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f24815a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24816b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f24817c;

        public b(Method method, Method method2, Method method3) {
            this.f24815a = method;
            this.f24816b = method2;
            this.f24817c = method3;
        }

        public static b b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new b(method3, method, method2);
        }

        public Object a(String str) {
            Method method = this.f24815a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f24816b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f24817c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f24818a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24819b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f24819b = method;
            this.f24818a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f24819b.invoke(this.f24818a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24818a.equals(cVar.f24818a) && this.f24819b.equals(cVar.f24819b);
        }

        public int hashCode() {
            return this.f24818a.hashCode() + (this.f24819b.hashCode() * 31);
        }
    }

    public d(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f24806e = cls;
        this.f24807f = cls2;
        this.f24808g = method;
        this.f24809h = method2;
        this.f24810i = method3;
        this.f24811j = method4;
    }

    @Nullable
    public static h A() {
        if (!h.r()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                return new d(cls, cls2, declaredMethod, method, cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int B() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    public ah.c d(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.d(x509TrustManager);
        }
    }

    public f e(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    public void h(SSLSocket sSLSocket, String str, List<h0> list) throws IOException {
        if (this.f24807f.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f24808g.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f24809h.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new AssertionError(e10);
                }
            }
            this.f24811j.invoke(sSLSocket, new Object[]{h.f(list)});
        }
    }

    public void i(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (e.B(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e11);
            }
            throw e11;
        }
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
        if (!this.f24807f.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f24810i.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Nullable
    public Object q(String str) {
        return this.f24812k.a(str);
    }

    public boolean s(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return z(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.s(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            throw new AssertionError("unable to determine cleartext support", e10);
        }
    }

    public void u(int i10, String str, @Nullable Throwable th2) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th2 != null) {
            str = str + 10 + Log.getStackTraceString(th2);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    public void v(String str, Object obj) {
        if (!this.f24812k.c(obj)) {
            u(5, str, (Throwable) null);
        }
    }

    @Nullable
    public X509TrustManager x(SSLSocketFactory sSLSocketFactory) {
        Object w10 = h.w(sSLSocketFactory, this.f24806e, "sslParameters");
        if (w10 == null) {
            try {
                w10 = h.w(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.x(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) h.w(w10, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) h.w(w10, X509TrustManager.class, "trustManager");
    }

    public final boolean y(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.s(str);
        }
    }

    public final boolean z(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return y(str, cls, obj);
        }
    }
}

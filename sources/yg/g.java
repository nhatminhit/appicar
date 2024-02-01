package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import og.h0;

public final class g extends h {

    /* renamed from: e  reason: collision with root package name */
    public final Method f24828e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f24829f;

    public g(Method method, Method method2) {
        this.f24828e = method;
        this.f24829f = method2;
    }

    public static g y() {
        try {
            return new g(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void h(SSLSocket sSLSocket, String str, List<h0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b10 = h.b(list);
            this.f24828e.invoke(sSLParameters, new Object[]{b10.toArray(new String[b10.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Nullable
    public String p(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f24829f.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }

    public X509TrustManager x(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}

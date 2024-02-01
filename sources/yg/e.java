package yg;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import og.h0;
import org.conscrypt.Conscrypt;

public class e extends h {
    public static e y() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new e();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void g(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public void h(SSLSocket sSLSocket, String str, List<h0> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h.b(list).toArray(new String[0]));
            return;
        }
        super.h(sSLSocket, str, list);
    }

    public SSLContext o() {
        try {
            return SSLContext.getInstance("TLSv1.3", z());
        } catch (NoSuchAlgorithmException e10) {
            try {
                return SSLContext.getInstance("TLS", z());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e10);
            }
        }
    }

    @Nullable
    public String p(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.p(sSLSocket);
    }

    @Nullable
    public X509TrustManager x(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.x(sSLSocketFactory);
        }
        try {
            Object w10 = h.w(sSLSocketFactory, Object.class, "sslParameters");
            if (w10 != null) {
                return (X509TrustManager) h.w(w10, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e10) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e10);
        }
    }

    public final Provider z() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }
}

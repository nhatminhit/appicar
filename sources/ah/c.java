package ah;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import yg.h;

public abstract class c {
    public static c b(X509TrustManager x509TrustManager) {
        return h.m().d(x509TrustManager);
    }

    public static c c(X509Certificate... x509CertificateArr) {
        return new a(new b(x509CertificateArr));
    }

    public abstract List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}

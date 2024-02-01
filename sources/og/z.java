package og;

import g7.h;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import pg.e;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f21785a;

    /* renamed from: b  reason: collision with root package name */
    public final l f21786b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f21787c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f21788d;

    public z(o0 o0Var, l lVar, List<Certificate> list, List<Certificate> list2) {
        this.f21785a = o0Var;
        this.f21786b = lVar;
        this.f21787c = list;
        this.f21788d = list2;
    }

    public static z b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            l b10 = l.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!h.A.equals(protocol)) {
                o0 a10 = o0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List v10 = certificateArr != null ? e.v(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new z(a10, b10, v10, localCertificates != null ? e.v(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static z c(o0 o0Var, l lVar, List<Certificate> list, List<Certificate> list2) {
        if (o0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (lVar != null) {
            return new z(o0Var, lVar, e.u(list), e.u(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public l a() {
        return this.f21786b;
    }

    public List<Certificate> d() {
        return this.f21788d;
    }

    @Nullable
    public Principal e() {
        if (!this.f21788d.isEmpty()) {
            return ((X509Certificate) this.f21788d.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f21785a.equals(zVar.f21785a) && this.f21786b.equals(zVar.f21786b) && this.f21787c.equals(zVar.f21787c) && this.f21788d.equals(zVar.f21788d);
    }

    public final List<String> f(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            arrayList.add(next instanceof X509Certificate ? String.valueOf(((X509Certificate) next).getSubjectDN()) : next.getType());
        }
        return arrayList;
    }

    public List<Certificate> g() {
        return this.f21787c;
    }

    @Nullable
    public Principal h() {
        if (!this.f21787c.isEmpty()) {
            return ((X509Certificate) this.f21787c.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public int hashCode() {
        return ((((((527 + this.f21785a.hashCode()) * 31) + this.f21786b.hashCode()) * 31) + this.f21787c.hashCode()) * 31) + this.f21788d.hashCode();
    }

    public o0 i() {
        return this.f21785a;
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f21785a + " cipherSuite=" + this.f21786b + " peerCertificates=" + f(this.f21787c) + " localCertificates=" + f(this.f21788d) + '}';
    }
}

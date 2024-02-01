package og;

import ah.c;
import ch.f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final i f21612c = new a().b();

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f21613a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final c f21614b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f21615a = new ArrayList();

        public a a(String str, String... strArr) {
            if (str != null) {
                for (String bVar : strArr) {
                    this.f21615a.add(new b(str, bVar));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public i b() {
            return new i(new LinkedHashSet(this.f21615a), (c) null);
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final String f21616e = "*.";

        /* renamed from: a  reason: collision with root package name */
        public final String f21617a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21618b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21619c;

        /* renamed from: d  reason: collision with root package name */
        public final f f21620d;

        public b(String str, String str2) {
            StringBuilder sb2;
            int i10;
            this.f21617a = str;
            if (str.startsWith(f21616e)) {
                sb2 = new StringBuilder();
                sb2.append("http://");
                str = str.substring(2);
            } else {
                sb2 = new StringBuilder();
                sb2.append("http://");
            }
            sb2.append(str);
            this.f21618b = c0.m(sb2.toString()).p();
            if (str2.startsWith("sha1/")) {
                this.f21619c = "sha1/";
                i10 = 5;
            } else if (str2.startsWith("sha256/")) {
                this.f21619c = "sha256/";
                i10 = 7;
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
            this.f21620d = f.j(str2.substring(i10));
            if (this.f21620d == null) {
                throw new IllegalArgumentException("pins must be base64: " + str2);
            }
        }

        public boolean a(String str) {
            if (!this.f21617a.startsWith(f21616e)) {
                return str.equals(this.f21618b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f21618b.length()) {
                String str2 = this.f21618b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f21617a.equals(bVar.f21617a) && this.f21619c.equals(bVar.f21619c) && this.f21620d.equals(bVar.f21620d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f21617a.hashCode()) * 31) + this.f21619c.hashCode()) * 31) + this.f21620d.hashCode();
        }

        public String toString() {
            return this.f21619c + this.f21620d.b();
        }
    }

    public i(Set<b> set, @Nullable c cVar) {
        this.f21613a = set;
        this.f21614b = cVar;
    }

    public static String d(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + f((X509Certificate) certificate).b();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static f e(X509Certificate x509Certificate) {
        return f.I(x509Certificate.getPublicKey().getEncoded()).O();
    }

    public static f f(X509Certificate x509Certificate) {
        return f.I(x509Certificate.getPublicKey().getEncoded()).P();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> c10 = c(str);
        if (!c10.isEmpty()) {
            c cVar = this.f21614b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                int size2 = c10.size();
                f fVar = null;
                f fVar2 = null;
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = c10.get(i11);
                    if (bVar.f21619c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = f(x509Certificate);
                        }
                        if (bVar.f21620d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f21619c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = e(x509Certificate);
                        }
                        if (bVar.f21620d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f21619c);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i12 = 0; i12 < size3; i12++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
                sb2.append("\n    ");
                sb2.append(d(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = c10.size();
            for (int i13 = 0; i13 < size4; i13++) {
                sb2.append("\n    ");
                sb2.append(c10.get(i13));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    public void b(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        a(str, Arrays.asList(certificateArr));
    }

    public List<b> c(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.f21613a) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return Objects.equals(this.f21614b, iVar.f21614b) && this.f21613a.equals(iVar.f21613a);
        }
    }

    public i g(@Nullable c cVar) {
        return Objects.equals(this.f21614b, cVar) ? this : new i(this.f21613a, cVar);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f21614b) * 31) + this.f21613a.hashCode();
    }
}

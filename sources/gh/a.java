package gh;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import jh.f;
import kh.g;

public interface a {

    /* renamed from: gh.a$a  reason: collision with other inner class name */
    public interface C0315a<T extends C0315a> {
        T B(String str);

        List<String> E(String str);

        Map<String, List<String>> G();

        Map<String, String> H();

        String J(String str);

        T N(String str, String str2);

        boolean O(String str);

        T P(String str);

        String Q(String str);

        Map<String, String> R();

        T a(c cVar);

        T d(String str, String str2);

        T j(String str, String str2);

        c method();

        T r(URL url);

        boolean v(String str);

        URL y();

        boolean z(String str, String str2);
    }

    public interface b {
        String a();

        String c();

        b d(String str);

        b e(InputStream inputStream);

        b f(String str);

        b g(String str);

        boolean h();

        InputStream n();

        String value();
    }

    public enum c {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        public final boolean O;

        /* access modifiers changed from: public */
        c(boolean z10) {
            this.O = z10;
        }

        public final boolean a() {
            return this.O;
        }
    }

    public interface d extends C0315a<d> {
        SSLSocketFactory A();

        Proxy C();

        Collection<b> F();

        d I(b bVar);

        boolean L();

        String T();

        int U();

        g X();

        int b();

        d f(boolean z10);

        d g(g gVar);

        d h(String str);

        d i(String str, int i10);

        d k(int i10);

        d l(int i10);

        d m(boolean z10);

        void n(SSLSocketFactory sSLSocketFactory);

        d o(String str);

        d p(Proxy proxy);

        d q(boolean z10);

        boolean s();

        String t();

        boolean x();
    }

    public interface e extends C0315a<e> {
        e D(String str);

        e K();

        f M() throws IOException;

        int S();

        String V();

        byte[] W();

        String c();

        String e();

        BufferedInputStream u();

        String w();
    }

    a A(d dVar);

    a B(String str);

    a C(Map<String, String> map);

    a D(String str, String str2, InputStream inputStream);

    f E() throws IOException;

    a F(String... strArr);

    b G(String str);

    a H(Map<String, String> map);

    a a(c cVar);

    d c();

    a d(String str, String str2);

    e e() throws IOException;

    a f(boolean z10);

    a g(g gVar);

    f get() throws IOException;

    a h(String str);

    a i(String str, int i10);

    a j(String str, String str2);

    a k(int i10);

    a l(int i10);

    a m(boolean z10);

    a n(SSLSocketFactory sSLSocketFactory);

    a o(String str);

    a p(Proxy proxy);

    a q(boolean z10);

    a r(URL url);

    a s(String str);

    a t(e eVar);

    a u(Collection<b> collection);

    a v(Map<String, String> map);

    a w(String str, String str2, InputStream inputStream, String str3);

    a x(String str);

    e y();

    a z(String str, String str2);
}

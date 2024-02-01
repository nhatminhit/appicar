package hh;

import gh.a;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import jh.f;
import kh.g;
import kh.j;
import w7.l;

public class c implements gh.a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f19570c = "Content-Encoding";

    /* renamed from: d  reason: collision with root package name */
    public static final String f19571d = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";

    /* renamed from: e  reason: collision with root package name */
    public static final String f19572e = "User-Agent";

    /* renamed from: f  reason: collision with root package name */
    public static final String f19573f = "Content-Type";

    /* renamed from: g  reason: collision with root package name */
    public static final String f19574g = "multipart/form-data";

    /* renamed from: h  reason: collision with root package name */
    public static final String f19575h = "application/x-www-form-urlencoded";

    /* renamed from: i  reason: collision with root package name */
    public static final int f19576i = 307;

    /* renamed from: j  reason: collision with root package name */
    public static final String f19577j = "application/octet-stream";

    /* renamed from: a  reason: collision with root package name */
    public a.d f19578a = new d();

    /* renamed from: b  reason: collision with root package name */
    public a.e f19579b = new e();

    public static abstract class b<T extends a.C0315a> implements a.C0315a<T> {

        /* renamed from: a  reason: collision with root package name */
        public URL f19580a;

        /* renamed from: b  reason: collision with root package name */
        public a.c f19581b;

        /* renamed from: c  reason: collision with root package name */
        public Map<String, List<String>> f19582c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String> f19583d;

        public b() {
            this.f19582c = new LinkedHashMap();
            this.f19583d = new LinkedHashMap();
        }

        public static String Y(String str) {
            try {
                byte[] bytes = str.getBytes("ISO-8859-1");
                return !a0(bytes) ? str : new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return str;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if ((((r8[1] & 255) == 187) & ((r8[2] & 255) == 191)) != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean a0(byte[] r8) {
            /*
                int r0 = r8.length
                r1 = 3
                r2 = 1
                r3 = 0
                if (r0 < r1) goto L_0x0029
                byte r0 = r8[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 239(0xef, float:3.35E-43)
                if (r0 != r4) goto L_0x0029
                byte r0 = r8[r2]
                r0 = r0 & 255(0xff, float:3.57E-43)
                r4 = 187(0xbb, float:2.62E-43)
                if (r0 != r4) goto L_0x0018
                r0 = r2
                goto L_0x0019
            L_0x0018:
                r0 = r3
            L_0x0019:
                r4 = 2
                byte r4 = r8[r4]
                r4 = r4 & 255(0xff, float:3.57E-43)
                r5 = 191(0xbf, float:2.68E-43)
                if (r4 != r5) goto L_0x0024
                r4 = r2
                goto L_0x0025
            L_0x0024:
                r4 = r3
            L_0x0025:
                r0 = r0 & r4
                if (r0 == 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = r3
            L_0x002a:
                int r0 = r8.length
            L_0x002b:
                if (r1 >= r0) goto L_0x0061
                byte r4 = r8[r1]
                r5 = r4 & 128(0x80, float:1.794E-43)
                if (r5 != 0) goto L_0x0034
                goto L_0x005e
            L_0x0034:
                r5 = r4 & 224(0xe0, float:3.14E-43)
                r6 = 192(0xc0, float:2.69E-43)
                if (r5 != r6) goto L_0x003d
                int r4 = r1 + 1
                goto L_0x004e
            L_0x003d:
                r5 = r4 & 240(0xf0, float:3.36E-43)
                r7 = 224(0xe0, float:3.14E-43)
                if (r5 != r7) goto L_0x0046
                int r4 = r1 + 2
                goto L_0x004e
            L_0x0046:
                r4 = r4 & 248(0xf8, float:3.48E-43)
                r5 = 240(0xf0, float:3.36E-43)
                if (r4 != r5) goto L_0x0060
                int r4 = r1 + 3
            L_0x004e:
                int r5 = r8.length
                if (r4 < r5) goto L_0x0052
                return r3
            L_0x0052:
                if (r1 >= r4) goto L_0x005e
                int r1 = r1 + 1
                byte r5 = r8[r1]
                r5 = r5 & r6
                r7 = 128(0x80, float:1.794E-43)
                if (r5 == r7) goto L_0x0052
                return r3
            L_0x005e:
                int r1 = r1 + r2
                goto L_0x002b
            L_0x0060:
                return r3
            L_0x0061:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: hh.c.b.a0(byte[]):boolean");
        }

        public T B(String str) {
            d.i(str, "Cookie name must not be empty");
            this.f19583d.remove(str);
            return this;
        }

        public List<String> E(String str) {
            d.h(str);
            return Z(str);
        }

        public Map<String, List<String>> G() {
            return this.f19582c;
        }

        public Map<String, String> H() {
            return this.f19583d;
        }

        public String J(String str) {
            d.i(str, "Cookie name must not be empty");
            return this.f19583d.get(str);
        }

        public T N(String str, String str2) {
            d.h(str);
            if (str2 == null) {
                str2 = "";
            }
            List E = E(str);
            if (E.isEmpty()) {
                E = new ArrayList();
                this.f19582c.put(str, E);
            }
            E.add(Y(str2));
            return this;
        }

        public boolean O(String str) {
            d.i(str, "Cookie name must not be empty");
            return this.f19583d.containsKey(str);
        }

        public T P(String str) {
            d.i(str, "Header name must not be empty");
            Map.Entry<String, List<String>> b02 = b0(str);
            if (b02 != null) {
                this.f19582c.remove(b02.getKey());
            }
            return this;
        }

        public String Q(String str) {
            d.k(str, "Header name must not be null");
            List<String> Z = Z(str);
            if (Z.size() > 0) {
                return ih.c.j(Z, ", ");
            }
            return null;
        }

        public Map<String, String> R() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f19582c.size());
            for (Map.Entry next : this.f19582c.entrySet()) {
                String str = (String) next.getKey();
                List list = (List) next.getValue();
                if (list.size() > 0) {
                    linkedHashMap.put(str, list.get(0));
                }
            }
            return linkedHashMap;
        }

        public final List<String> Z(String str) {
            d.j(str);
            for (Map.Entry next : this.f19582c.entrySet()) {
                if (str.equalsIgnoreCase((String) next.getKey())) {
                    return (List) next.getValue();
                }
            }
            return Collections.emptyList();
        }

        public T a(a.c cVar) {
            d.k(cVar, "Method must not be null");
            this.f19581b = cVar;
            return this;
        }

        public final Map.Entry<String, List<String>> b0(String str) {
            String a10 = ih.b.a(str);
            for (Map.Entry<String, List<String>> next : this.f19582c.entrySet()) {
                if (ih.b.a(next.getKey()).equals(a10)) {
                    return next;
                }
            }
            return null;
        }

        public T d(String str, String str2) {
            d.i(str, "Header name must not be empty");
            P(str);
            N(str, str2);
            return this;
        }

        public T j(String str, String str2) {
            d.i(str, "Cookie name must not be empty");
            d.k(str2, "Cookie value must not be null");
            this.f19583d.put(str, str2);
            return this;
        }

        public a.c method() {
            return this.f19581b;
        }

        public T r(URL url) {
            d.k(url, "URL must not be null");
            this.f19580a = url;
            return this;
        }

        public boolean v(String str) {
            d.i(str, "Header name must not be empty");
            return !Z(str).isEmpty();
        }

        public URL y() {
            return this.f19580a;
        }

        public boolean z(String str, String str2) {
            d.h(str);
            d.h(str2);
            for (String equalsIgnoreCase : E(str)) {
                if (str2.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: hh.c$c  reason: collision with other inner class name */
    public static class C0320c implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public String f19584a;

        /* renamed from: b  reason: collision with root package name */
        public String f19585b;

        /* renamed from: c  reason: collision with root package name */
        public InputStream f19586c;

        /* renamed from: d  reason: collision with root package name */
        public String f19587d;

        public static C0320c b(String str, String str2) {
            return new C0320c().g(str).d(str2);
        }

        public static C0320c i(String str, String str2, InputStream inputStream) {
            return new C0320c().g(str).d(str2).e(inputStream);
        }

        public String a() {
            return this.f19584a;
        }

        public String c() {
            return this.f19587d;
        }

        public a.b f(String str) {
            d.h(str);
            this.f19587d = str;
            return this;
        }

        public boolean h() {
            return this.f19586c != null;
        }

        /* renamed from: j */
        public C0320c e(InputStream inputStream) {
            d.k(this.f19585b, "Data input stream must not be null");
            this.f19586c = inputStream;
            return this;
        }

        /* renamed from: k */
        public C0320c g(String str) {
            d.i(str, "Data key must not be empty");
            this.f19584a = str;
            return this;
        }

        /* renamed from: l */
        public C0320c d(String str) {
            d.k(str, "Data value must not be null");
            this.f19585b = str;
            return this;
        }

        public InputStream n() {
            return this.f19586c;
        }

        public String toString() {
            return this.f19584a + l.f14755k + this.f19585b;
        }

        public String value() {
            return this.f19585b;
        }
    }

    public static class d extends b<a.d> implements a.d {

        /* renamed from: e  reason: collision with root package name */
        public Proxy f19588e;

        /* renamed from: f  reason: collision with root package name */
        public int f19589f = 30000;

        /* renamed from: g  reason: collision with root package name */
        public int f19590g = 2097152;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19591h = true;

        /* renamed from: i  reason: collision with root package name */
        public Collection<a.b> f19592i = new ArrayList();

        /* renamed from: j  reason: collision with root package name */
        public String f19593j = null;

        /* renamed from: k  reason: collision with root package name */
        public boolean f19594k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19595l = false;

        /* renamed from: m  reason: collision with root package name */
        public g f19596m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f19597n = false;

        /* renamed from: o  reason: collision with root package name */
        public String f19598o = "UTF-8";

        /* renamed from: p  reason: collision with root package name */
        public SSLSocketFactory f19599p;

        public d() {
            super();
            this.f19581b = a.c.GET;
            N("Accept-Encoding", "gzip");
            N("User-Agent", c.f19571d);
            this.f19596m = g.c();
        }

        public SSLSocketFactory A() {
            return this.f19599p;
        }

        public /* bridge */ /* synthetic */ a.C0315a B(String str) {
            return super.B(str);
        }

        public Proxy C() {
            return this.f19588e;
        }

        public /* bridge */ /* synthetic */ List E(String str) {
            return super.E(str);
        }

        public Collection<a.b> F() {
            return this.f19592i;
        }

        public /* bridge */ /* synthetic */ Map G() {
            return super.G();
        }

        public /* bridge */ /* synthetic */ Map H() {
            return super.H();
        }

        public /* bridge */ /* synthetic */ String J(String str) {
            return super.J(str);
        }

        public boolean L() {
            return this.f19591h;
        }

        public /* bridge */ /* synthetic */ a.C0315a N(String str, String str2) {
            return super.N(str, str2);
        }

        public /* bridge */ /* synthetic */ boolean O(String str) {
            return super.O(str);
        }

        public /* bridge */ /* synthetic */ a.C0315a P(String str) {
            return super.P(str);
        }

        public /* bridge */ /* synthetic */ String Q(String str) {
            return super.Q(str);
        }

        public /* bridge */ /* synthetic */ Map R() {
            return super.R();
        }

        public String T() {
            return this.f19593j;
        }

        public int U() {
            return this.f19590g;
        }

        public g X() {
            return this.f19596m;
        }

        public /* bridge */ /* synthetic */ a.C0315a a(a.c cVar) {
            return super.a(cVar);
        }

        public int b() {
            return this.f19589f;
        }

        public /* bridge */ /* synthetic */ a.C0315a d(String str, String str2) {
            return super.d(str, str2);
        }

        /* renamed from: d0 */
        public d I(a.b bVar) {
            d.k(bVar, "Key val must not be null");
            this.f19592i.add(bVar);
            return this;
        }

        /* renamed from: e0 */
        public d g(g gVar) {
            this.f19596m = gVar;
            this.f19597n = true;
            return this;
        }

        public a.d f(boolean z10) {
            this.f19591h = z10;
            return this;
        }

        /* renamed from: f0 */
        public d i(String str, int i10) {
            this.f19588e = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i10));
            return this;
        }

        /* renamed from: g0 */
        public d p(Proxy proxy) {
            this.f19588e = proxy;
            return this;
        }

        public a.d h(String str) {
            this.f19593j = str;
            return this;
        }

        /* renamed from: h0 */
        public d k(int i10) {
            d.e(i10 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f19589f = i10;
            return this;
        }

        public /* bridge */ /* synthetic */ a.C0315a j(String str, String str2) {
            return super.j(str, str2);
        }

        public a.d l(int i10) {
            d.e(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f19590g = i10;
            return this;
        }

        public a.d m(boolean z10) {
            this.f19594k = z10;
            return this;
        }

        public /* bridge */ /* synthetic */ a.c method() {
            return super.method();
        }

        public void n(SSLSocketFactory sSLSocketFactory) {
            this.f19599p = sSLSocketFactory;
        }

        public a.d o(String str) {
            d.k(str, "Charset must not be null");
            if (Charset.isSupported(str)) {
                this.f19598o = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        public a.d q(boolean z10) {
            this.f19595l = z10;
            return this;
        }

        public /* bridge */ /* synthetic */ a.C0315a r(URL url) {
            return super.r(url);
        }

        public boolean s() {
            return this.f19594k;
        }

        public String t() {
            return this.f19598o;
        }

        public /* bridge */ /* synthetic */ boolean v(String str) {
            return super.v(str);
        }

        public boolean x() {
            return this.f19595l;
        }

        public /* bridge */ /* synthetic */ URL y() {
            return super.y();
        }

        public /* bridge */ /* synthetic */ boolean z(String str, String str2) {
            return super.z(str, str2);
        }
    }

    public static class e extends b<a.e> implements a.e {

        /* renamed from: p  reason: collision with root package name */
        public static final int f19600p = 20;

        /* renamed from: q  reason: collision with root package name */
        public static final String f19601q = "Location";

        /* renamed from: r  reason: collision with root package name */
        public static final Pattern f19602r = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: e  reason: collision with root package name */
        public int f19603e;

        /* renamed from: f  reason: collision with root package name */
        public String f19604f;

        /* renamed from: g  reason: collision with root package name */
        public ByteBuffer f19605g;

        /* renamed from: h  reason: collision with root package name */
        public InputStream f19606h;

        /* renamed from: i  reason: collision with root package name */
        public HttpURLConnection f19607i;

        /* renamed from: j  reason: collision with root package name */
        public String f19608j;

        /* renamed from: k  reason: collision with root package name */
        public String f19609k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19610l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f19611m = false;

        /* renamed from: n  reason: collision with root package name */
        public int f19612n = 0;

        /* renamed from: o  reason: collision with root package name */
        public a.d f19613o;

        public e() {
            super();
        }

        public e(e eVar) throws IOException {
            super();
            if (eVar != null) {
                int i10 = eVar.f19612n + 1;
                this.f19612n = i10;
                if (i10 >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{eVar.y()}));
                }
            }
        }

        public static HttpURLConnection d0(a.d dVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) (dVar.C() == null ? dVar.y().openConnection() : dVar.y().openConnection(dVar.C()));
            httpURLConnection.setRequestMethod(dVar.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(dVar.b());
            httpURLConnection.setReadTimeout(dVar.b() / 2);
            if (dVar.A() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(dVar.A());
            }
            if (dVar.method().a()) {
                httpURLConnection.setDoOutput(true);
            }
            if (dVar.H().size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", h0(dVar));
            }
            for (Map.Entry next : dVar.G().entrySet()) {
                for (String addRequestProperty : (List) next.getValue()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                }
            }
            return httpURLConnection;
        }

        public static LinkedHashMap<String, List<String>> e0(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i10);
                String headerField = httpURLConnection.getHeaderField(i10);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i10++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        public static e f0(a.d dVar) throws IOException {
            return g0(dVar, (e) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ IOException -> 0x01fd }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac A[Catch:{ IOException -> 0x01fa }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0117 A[Catch:{ IOException -> 0x01fa }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0200  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static hh.c.e g0(gh.a.d r9, hh.c.e r10) throws java.io.IOException {
            /*
                java.lang.String r0 = "Content-Encoding"
                java.lang.String r1 = "Location"
                java.lang.String r2 = "Request must not be null"
                hh.d.k(r9, r2)
                java.net.URL r2 = r9.y()
                java.lang.String r3 = "URL must be specified to connect"
                hh.d.k(r2, r3)
                java.net.URL r2 = r9.y()
                java.lang.String r2 = r2.getProtocol()
                java.lang.String r3 = "http"
                boolean r3 = r2.equals(r3)
                if (r3 != 0) goto L_0x0033
                java.lang.String r3 = "https"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x002b
                goto L_0x0033
            L_0x002b:
                java.net.MalformedURLException r9 = new java.net.MalformedURLException
                java.lang.String r10 = "Only http & https protocols supported"
                r9.<init>(r10)
                throw r9
            L_0x0033:
                gh.a$c r2 = r9.method()
                boolean r2 = r2.a()
                java.lang.String r3 = r9.T()
                r4 = 1
                if (r3 == 0) goto L_0x0044
                r3 = r4
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                if (r2 != 0) goto L_0x005f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Cannot set a request body for HTTP method "
                r5.append(r6)
                gh.a$c r6 = r9.method()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                hh.d.c(r3, r5)
            L_0x005f:
                java.util.Collection r5 = r9.F()
                int r5 = r5.size()
                r6 = 0
                if (r5 <= 0) goto L_0x0072
                if (r2 == 0) goto L_0x006e
                if (r3 == 0) goto L_0x0072
            L_0x006e:
                l0(r9)
                goto L_0x0079
            L_0x0072:
                if (r2 == 0) goto L_0x0079
                java.lang.String r2 = m0(r9)
                goto L_0x007a
            L_0x0079:
                r2 = r6
            L_0x007a:
                long r7 = java.lang.System.nanoTime()
                java.net.HttpURLConnection r3 = d0(r9)
                r3.connect()     // Catch:{ IOException -> 0x01fd }
                boolean r5 = r3.getDoOutput()     // Catch:{ IOException -> 0x01fd }
                if (r5 == 0) goto L_0x0092
                java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x01fd }
                o0(r9, r5, r2)     // Catch:{ IOException -> 0x01fd }
            L_0x0092:
                int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x01fd }
                hh.c$e r5 = new hh.c$e     // Catch:{ IOException -> 0x01fd }
                r5.<init>(r10)     // Catch:{ IOException -> 0x01fd }
                r5.n0(r3, r10)     // Catch:{ IOException -> 0x01fa }
                r5.f19613o = r9     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r5.v(r1)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0117
                boolean r10 = r9.L()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0117
                r10 = 307(0x133, float:4.3E-43)
                if (r2 == r10) goto L_0x00c4
                gh.a$c r10 = gh.a.c.GET     // Catch:{ IOException -> 0x01fa }
                r9.a(r10)     // Catch:{ IOException -> 0x01fa }
                java.util.Collection r10 = r9.F()     // Catch:{ IOException -> 0x01fa }
                r10.clear()     // Catch:{ IOException -> 0x01fa }
                r9.h(r6)     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = "Content-Type"
                r9.P(r10)     // Catch:{ IOException -> 0x01fa }
            L_0x00c4:
                java.lang.String r10 = r5.Q(r1)     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = "http:/"
                boolean r0 = r10.startsWith(r0)     // Catch:{ IOException -> 0x01fa }
                if (r0 == 0) goto L_0x00dd
                r0 = 6
                char r1 = r10.charAt(r0)     // Catch:{ IOException -> 0x01fa }
                r2 = 47
                if (r1 == r2) goto L_0x00dd
                java.lang.String r10 = r10.substring(r0)     // Catch:{ IOException -> 0x01fa }
            L_0x00dd:
                java.net.URL r0 = r9.y()     // Catch:{ IOException -> 0x01fa }
                java.net.URL r10 = ih.c.q(r0, r10)     // Catch:{ IOException -> 0x01fa }
                java.net.URL r10 = hh.c.N(r10)     // Catch:{ IOException -> 0x01fa }
                r9.r(r10)     // Catch:{ IOException -> 0x01fa }
                java.util.Map<java.lang.String, java.lang.String> r10 = r5.f19583d     // Catch:{ IOException -> 0x01fa }
                java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x01fa }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x01fa }
            L_0x00f6:
                boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x01fa }
                if (r0 == 0) goto L_0x0112
                java.lang.Object r0 = r10.next()     // Catch:{ IOException -> 0x01fa }
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x01fa }
                java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x01fa }
                java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01fa }
                r9.j(r1, r0)     // Catch:{ IOException -> 0x01fa }
                goto L_0x00f6
            L_0x0112:
                hh.c$e r9 = g0(r9, r5)     // Catch:{ IOException -> 0x01fa }
                return r9
            L_0x0117:
                r10 = 200(0xc8, float:2.8E-43)
                if (r2 < r10) goto L_0x011f
                r10 = 400(0x190, float:5.6E-43)
                if (r2 < r10) goto L_0x0125
            L_0x011f:
                boolean r10 = r9.s()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01ea
            L_0x0125:
                java.lang.String r10 = r5.c()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0156
                boolean r1 = r9.x()     // Catch:{ IOException -> 0x01fa }
                if (r1 != 0) goto L_0x0156
                java.lang.String r1 = "text/"
                boolean r1 = r10.startsWith(r1)     // Catch:{ IOException -> 0x01fa }
                if (r1 != 0) goto L_0x0156
                java.util.regex.Pattern r1 = f19602r     // Catch:{ IOException -> 0x01fa }
                java.util.regex.Matcher r1 = r1.matcher(r10)     // Catch:{ IOException -> 0x01fa }
                boolean r1 = r1.matches()     // Catch:{ IOException -> 0x01fa }
                if (r1 == 0) goto L_0x0146
                goto L_0x0156
            L_0x0146:
                gh.f r0 = new gh.f     // Catch:{ IOException -> 0x01fa }
                java.lang.String r1 = "Unhandled content type. Must be text/*, application/xml, or application/*+xml"
                java.net.URL r9 = r9.y()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x01fa }
                r0.<init>(r1, r10, r9)     // Catch:{ IOException -> 0x01fa }
                throw r0     // Catch:{ IOException -> 0x01fa }
            L_0x0156:
                if (r10 == 0) goto L_0x0178
                java.util.regex.Pattern r1 = f19602r     // Catch:{ IOException -> 0x01fa }
                java.util.regex.Matcher r10 = r1.matcher(r10)     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r10.matches()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0178
                boolean r10 = r9 instanceof hh.c.d     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x0178
                r10 = r9
                hh.c$d r10 = (hh.c.d) r10     // Catch:{ IOException -> 0x01fa }
                boolean r10 = r10.f19597n     // Catch:{ IOException -> 0x01fa }
                if (r10 != 0) goto L_0x0178
                kh.g r10 = kh.g.r()     // Catch:{ IOException -> 0x01fa }
                r9.g(r10)     // Catch:{ IOException -> 0x01fa }
            L_0x0178:
                java.lang.String r10 = r5.f19609k     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = hh.b.d(r10)     // Catch:{ IOException -> 0x01fa }
                r5.f19608j = r10     // Catch:{ IOException -> 0x01fa }
                int r10 = r3.getContentLength()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01e1
                gh.a$c r10 = r9.method()     // Catch:{ IOException -> 0x01fa }
                gh.a$c r1 = gh.a.c.HEAD     // Catch:{ IOException -> 0x01fa }
                if (r10 == r1) goto L_0x01e1
                r5.f19606h = r6     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x019b
                java.io.InputStream r10 = r3.getErrorStream()     // Catch:{ IOException -> 0x01fa }
                goto L_0x019f
            L_0x019b:
                java.io.InputStream r10 = r3.getInputStream()     // Catch:{ IOException -> 0x01fa }
            L_0x019f:
                r5.f19606h = r10     // Catch:{ IOException -> 0x01fa }
                java.lang.String r10 = "gzip"
                boolean r10 = r5.z(r0, r10)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01b3
                java.util.zip.GZIPInputStream r10 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r0 = r5.f19606h     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0)     // Catch:{ IOException -> 0x01fa }
            L_0x01b0:
                r5.f19606h = r10     // Catch:{ IOException -> 0x01fa }
                goto L_0x01c8
            L_0x01b3:
                java.lang.String r10 = "deflate"
                boolean r10 = r5.z(r0, r10)     // Catch:{ IOException -> 0x01fa }
                if (r10 == 0) goto L_0x01c8
                java.util.zip.InflaterInputStream r10 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x01fa }
                java.io.InputStream r0 = r5.f19606h     // Catch:{ IOException -> 0x01fa }
                java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x01fa }
                r1.<init>(r4)     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0, r1)     // Catch:{ IOException -> 0x01fa }
                goto L_0x01b0
            L_0x01c8:
                java.io.InputStream r10 = r5.f19606h     // Catch:{ IOException -> 0x01fa }
                r0 = 32768(0x8000, float:4.5918E-41)
                int r1 = r9.U()     // Catch:{ IOException -> 0x01fa }
                ih.a r10 = ih.a.h(r10, r0, r1)     // Catch:{ IOException -> 0x01fa }
                int r9 = r9.b()     // Catch:{ IOException -> 0x01fa }
                long r0 = (long) r9     // Catch:{ IOException -> 0x01fa }
                ih.a r9 = r10.g(r7, r0)     // Catch:{ IOException -> 0x01fa }
                r5.f19606h = r9     // Catch:{ IOException -> 0x01fa }
                goto L_0x01e7
            L_0x01e1:
                java.nio.ByteBuffer r9 = hh.b.c()     // Catch:{ IOException -> 0x01fa }
                r5.f19605g = r9     // Catch:{ IOException -> 0x01fa }
            L_0x01e7:
                r5.f19610l = r4
                return r5
            L_0x01ea:
                gh.b r10 = new gh.b     // Catch:{ IOException -> 0x01fa }
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r9 = r9.y()     // Catch:{ IOException -> 0x01fa }
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x01fa }
                r10.<init>(r0, r2, r9)     // Catch:{ IOException -> 0x01fa }
                throw r10     // Catch:{ IOException -> 0x01fa }
            L_0x01fa:
                r9 = move-exception
                r6 = r5
                goto L_0x01fe
            L_0x01fd:
                r9 = move-exception
            L_0x01fe:
                if (r6 == 0) goto L_0x0203
                r6.k0()
            L_0x0203:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hh.c.e.g0(gh.a$d, hh.c$e):hh.c$e");
        }

        public static String h0(a.d dVar) {
            StringBuilder b10 = ih.c.b();
            boolean z10 = true;
            for (Map.Entry next : dVar.H().entrySet()) {
                if (!z10) {
                    b10.append("; ");
                } else {
                    z10 = false;
                }
                b10.append((String) next.getKey());
                b10.append('=');
                b10.append((String) next.getValue());
            }
            return ih.c.o(b10);
        }

        public static void l0(a.d dVar) throws IOException {
            boolean z10;
            URL y10 = dVar.y();
            StringBuilder b10 = ih.c.b();
            b10.append(y10.getProtocol());
            b10.append("://");
            b10.append(y10.getAuthority());
            b10.append(y10.getPath());
            b10.append("?");
            if (y10.getQuery() != null) {
                b10.append(y10.getQuery());
                z10 = false;
            } else {
                z10 = true;
            }
            for (a.b next : dVar.F()) {
                d.c(next.h(), "InputStream data not supported in URL query string.");
                if (!z10) {
                    b10.append('&');
                } else {
                    z10 = false;
                }
                b10.append(URLEncoder.encode(next.a(), "UTF-8"));
                b10.append('=');
                b10.append(URLEncoder.encode(next.value(), "UTF-8"));
            }
            dVar.r(new URL(ih.c.o(b10)));
            dVar.F().clear();
        }

        public static String m0(a.d dVar) {
            StringBuilder sb2;
            String str;
            if (dVar.v(c.f19573f)) {
                if (dVar.Q(c.f19573f).contains(c.f19574g) && !dVar.Q(c.f19573f).contains("boundary")) {
                    str = b.h();
                    sb2 = new StringBuilder();
                }
                return null;
            } else if (c.O(dVar)) {
                str = b.h();
                sb2 = new StringBuilder();
            } else {
                dVar.d(c.f19573f, "application/x-www-form-urlencoded; charset=" + dVar.t());
                return null;
            }
            sb2.append("multipart/form-data; boundary=");
            sb2.append(str);
            dVar.d(c.f19573f, sb2.toString());
            return str;
        }

        public static void o0(a.d dVar, OutputStream outputStream, String str) throws IOException {
            Collection<a.b> F = dVar.F();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, dVar.t()));
            if (str != null) {
                for (a.b next : F) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(c.L(next.a()));
                    bufferedWriter.write("\"");
                    if (next.h()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(c.L(next.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        bufferedWriter.write(next.c() != null ? next.c() : c.f19577j);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        b.a(next.n(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(next.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else if (dVar.T() != null) {
                bufferedWriter.write(dVar.T());
            } else {
                boolean z10 = true;
                for (a.b next2 : F) {
                    if (!z10) {
                        bufferedWriter.append('&');
                    } else {
                        z10 = false;
                    }
                    bufferedWriter.write(URLEncoder.encode(next2.a(), dVar.t()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(next2.value(), dVar.t()));
                }
            }
            bufferedWriter.close();
        }

        public /* bridge */ /* synthetic */ a.C0315a B(String str) {
            return super.B(str);
        }

        public /* bridge */ /* synthetic */ List E(String str) {
            return super.E(str);
        }

        public /* bridge */ /* synthetic */ Map G() {
            return super.G();
        }

        public /* bridge */ /* synthetic */ Map H() {
            return super.H();
        }

        public /* bridge */ /* synthetic */ String J(String str) {
            return super.J(str);
        }

        public a.e K() {
            i0();
            return this;
        }

        public f M() throws IOException {
            d.e(this.f19610l, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            if (this.f19605g != null) {
                this.f19606h = new ByteArrayInputStream(this.f19605g.array());
                this.f19611m = false;
            }
            d.c(this.f19611m, "Input stream already read and parsed, cannot re-read.");
            f i10 = b.i(this.f19606h, this.f19608j, this.f19580a.toExternalForm(), this.f19613o.X());
            this.f19608j = i10.I2().a().name();
            this.f19611m = true;
            k0();
            return i10;
        }

        public /* bridge */ /* synthetic */ a.C0315a N(String str, String str2) {
            return super.N(str, str2);
        }

        public /* bridge */ /* synthetic */ boolean O(String str) {
            return super.O(str);
        }

        public /* bridge */ /* synthetic */ a.C0315a P(String str) {
            return super.P(str);
        }

        public /* bridge */ /* synthetic */ String Q(String str) {
            return super.Q(str);
        }

        public /* bridge */ /* synthetic */ Map R() {
            return super.R();
        }

        public int S() {
            return this.f19603e;
        }

        public String V() {
            return this.f19604f;
        }

        public byte[] W() {
            i0();
            return this.f19605g.array();
        }

        public /* bridge */ /* synthetic */ a.C0315a a(a.c cVar) {
            return super.a(cVar);
        }

        public String c() {
            return this.f19609k;
        }

        /* renamed from: c0 */
        public e D(String str) {
            this.f19608j = str;
            return this;
        }

        public /* bridge */ /* synthetic */ a.C0315a d(String str, String str2) {
            return super.d(str, str2);
        }

        public String e() {
            i0();
            String str = this.f19608j;
            if (str == null) {
                str = "UTF-8";
            }
            String charBuffer = Charset.forName(str).decode(this.f19605g).toString();
            this.f19605g.rewind();
            return charBuffer;
        }

        public final void i0() {
            d.e(this.f19610l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f19605g == null) {
                d.c(this.f19611m, "Request has already been read (with .parse())");
                try {
                    this.f19605g = b.j(this.f19606h, this.f19613o.U());
                    this.f19611m = true;
                    k0();
                } catch (IOException e10) {
                    throw new gh.e(e10);
                } catch (Throwable th2) {
                    this.f19611m = true;
                    k0();
                    throw th2;
                }
            }
        }

        public /* bridge */ /* synthetic */ a.C0315a j(String str, String str2) {
            return super.j(str, str2);
        }

        public void j0(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    List<String> list = (List) next.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                j jVar = new j(str2);
                                String trim = jVar.e(l.f14755k).trim();
                                String trim2 = jVar.m(";").trim();
                                if (trim.length() > 0) {
                                    j(trim, trim2);
                                }
                            }
                        }
                    }
                    for (String N : list) {
                        N(str, N);
                    }
                }
            }
        }

        public final void k0() {
            InputStream inputStream = this.f19606h;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f19606h = null;
                    throw th2;
                }
                this.f19606h = null;
            }
            HttpURLConnection httpURLConnection = this.f19607i;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f19607i = null;
            }
        }

        public /* bridge */ /* synthetic */ a.c method() {
            return super.method();
        }

        public final void n0(HttpURLConnection httpURLConnection, e eVar) throws IOException {
            this.f19607i = httpURLConnection;
            this.f19581b = a.c.valueOf(httpURLConnection.getRequestMethod());
            this.f19580a = httpURLConnection.getURL();
            this.f19603e = httpURLConnection.getResponseCode();
            this.f19604f = httpURLConnection.getResponseMessage();
            this.f19609k = httpURLConnection.getContentType();
            j0(e0(httpURLConnection));
            if (eVar != null) {
                for (Map.Entry entry : eVar.H().entrySet()) {
                    if (!O((String) entry.getKey())) {
                        j((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                eVar.k0();
            }
        }

        public /* bridge */ /* synthetic */ a.C0315a r(URL url) {
            return super.r(url);
        }

        public BufferedInputStream u() {
            d.e(this.f19610l, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            d.c(this.f19611m, "Request has already been read");
            this.f19611m = true;
            return ih.a.h(this.f19606h, 32768, this.f19613o.U());
        }

        public /* bridge */ /* synthetic */ boolean v(String str) {
            return super.v(str);
        }

        public String w() {
            return this.f19608j;
        }

        public /* bridge */ /* synthetic */ URL y() {
            return super.y();
        }

        public /* bridge */ /* synthetic */ boolean z(String str, String str2) {
            return super.z(str, str2);
        }
    }

    public static gh.a J(String str) {
        c cVar = new c();
        cVar.x(str);
        return cVar;
    }

    public static gh.a K(URL url) {
        c cVar = new c();
        cVar.r(url);
        return cVar;
    }

    public static String L(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\"", "%22");
    }

    public static String M(String str) {
        try {
            return N(new URL(str)).toExternalForm();
        } catch (Exception unused) {
            return str;
        }
    }

    public static URL N(URL url) {
        try {
            return new URL(new URI(url.toExternalForm().replace(" ", "%20")).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return url;
        }
    }

    public static boolean O(a.d dVar) {
        for (a.b h10 : dVar.F()) {
            if (h10.h()) {
                return true;
            }
        }
        return false;
    }

    public gh.a A(a.d dVar) {
        this.f19578a = dVar;
        return this;
    }

    public gh.a B(String str) {
        d.k(str, "Referrer must not be null");
        this.f19578a.d("Referer", str);
        return this;
    }

    public gh.a C(Map<String, String> map) {
        d.k(map, "Cookie map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f19578a.j((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public gh.a D(String str, String str2, InputStream inputStream) {
        this.f19578a.I(C0320c.i(str, str2, inputStream));
        return this;
    }

    public f E() throws IOException {
        this.f19578a.a(a.c.POST);
        e();
        return this.f19579b.M();
    }

    public gh.a F(String... strArr) {
        d.k(strArr, "Data key value pairs must not be null");
        d.e(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i10 = 0; i10 < strArr.length; i10 += 2) {
            String str = strArr[i10];
            String str2 = strArr[i10 + 1];
            d.i(str, "Data key must not be empty");
            d.k(str2, "Data value must not be null");
            this.f19578a.I(C0320c.b(str, str2));
        }
        return this;
    }

    public a.b G(String str) {
        d.i(str, "Data key must not be empty");
        for (a.b next : c().F()) {
            if (next.a().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public gh.a H(Map<String, String> map) {
        d.k(map, "Data map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f19578a.I(C0320c.b((String) next.getKey(), (String) next.getValue()));
        }
        return this;
    }

    public gh.a a(a.c cVar) {
        this.f19578a.a(cVar);
        return this;
    }

    public a.d c() {
        return this.f19578a;
    }

    public gh.a d(String str, String str2) {
        this.f19578a.d(str, str2);
        return this;
    }

    public a.e e() throws IOException {
        e f02 = e.f0(this.f19578a);
        this.f19579b = f02;
        return f02;
    }

    public gh.a f(boolean z10) {
        this.f19578a.f(z10);
        return this;
    }

    public gh.a g(g gVar) {
        this.f19578a.g(gVar);
        return this;
    }

    public f get() throws IOException {
        this.f19578a.a(a.c.GET);
        e();
        return this.f19579b.M();
    }

    public gh.a h(String str) {
        this.f19578a.h(str);
        return this;
    }

    public gh.a i(String str, int i10) {
        this.f19578a.i(str, i10);
        return this;
    }

    public gh.a j(String str, String str2) {
        this.f19578a.j(str, str2);
        return this;
    }

    public gh.a k(int i10) {
        this.f19578a.k(i10);
        return this;
    }

    public gh.a l(int i10) {
        this.f19578a.l(i10);
        return this;
    }

    public gh.a m(boolean z10) {
        this.f19578a.m(z10);
        return this;
    }

    public gh.a n(SSLSocketFactory sSLSocketFactory) {
        this.f19578a.n(sSLSocketFactory);
        return this;
    }

    public gh.a o(String str) {
        this.f19578a.o(str);
        return this;
    }

    public gh.a p(Proxy proxy) {
        this.f19578a.p(proxy);
        return this;
    }

    public gh.a q(boolean z10) {
        this.f19578a.q(z10);
        return this;
    }

    public gh.a r(URL url) {
        this.f19578a.r(url);
        return this;
    }

    public gh.a s(String str) {
        d.k(str, "User agent must not be null");
        this.f19578a.d("User-Agent", str);
        return this;
    }

    public gh.a t(a.e eVar) {
        this.f19579b = eVar;
        return this;
    }

    public gh.a u(Collection<a.b> collection) {
        d.k(collection, "Data collection must not be null");
        for (a.b I : collection) {
            this.f19578a.I(I);
        }
        return this;
    }

    public gh.a v(Map<String, String> map) {
        d.k(map, "Header map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f19578a.d((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    public gh.a w(String str, String str2, InputStream inputStream, String str3) {
        this.f19578a.I(C0320c.i(str, str2, inputStream).f(str3));
        return this;
    }

    public gh.a x(String str) {
        d.i(str, "Must supply a valid URL");
        try {
            this.f19578a.r(new URL(M(str)));
            return this;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Malformed URL: " + str, e10);
        }
    }

    public a.e y() {
        return this.f19579b;
    }

    public gh.a z(String str, String str2) {
        this.f19578a.I(C0320c.b(str, str2));
        return this;
    }
}

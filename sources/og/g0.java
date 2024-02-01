package og;

import ah.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import og.b0;
import og.g;
import og.l0;
import og.p0;
import og.x;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import pg.e;
import rg.f;
import yg.h;

public class g0 implements Cloneable, g.a, p0.a {

    /* renamed from: q0  reason: collision with root package name */
    public static final List<h0> f21568q0 = e.v(h0.HTTP_2, h0.HTTP_1_1);

    /* renamed from: r0  reason: collision with root package name */
    public static final List<o> f21569r0 = e.v(o.f21734h, o.f21736j);
    public final s O;
    @Nullable
    public final Proxy P;
    public final List<h0> Q;
    public final List<o> R;
    public final List<d0> S;
    public final List<d0> T;
    public final x.b U;
    public final ProxySelector V;
    public final q W;
    @Nullable
    public final e X;
    @Nullable
    public final f Y;
    public final SocketFactory Z;

    /* renamed from: a0  reason: collision with root package name */
    public final SSLSocketFactory f21570a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c f21571b0;

    /* renamed from: c0  reason: collision with root package name */
    public final HostnameVerifier f21572c0;

    /* renamed from: d0  reason: collision with root package name */
    public final i f21573d0;

    /* renamed from: e0  reason: collision with root package name */
    public final d f21574e0;

    /* renamed from: f0  reason: collision with root package name */
    public final d f21575f0;

    /* renamed from: g0  reason: collision with root package name */
    public final n f21576g0;

    /* renamed from: h0  reason: collision with root package name */
    public final v f21577h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f21578i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f21579j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f21580k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f21581l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f21582m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f21583n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f21584o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f21585p0;

    public class a extends pg.a {
        public void a(b0.a aVar, String str) {
            aVar.f(str);
        }

        public void b(b0.a aVar, String str, String str2) {
            aVar.g(str, str2);
        }

        public void c(o oVar, SSLSocket sSLSocket, boolean z10) {
            oVar.a(sSLSocket, z10);
        }

        public int d(l0.a aVar) {
            return aVar.f21716c;
        }

        public boolean e(a aVar, a aVar2) {
            return aVar.d(aVar2);
        }

        @Nullable
        public tg.c f(l0 l0Var) {
            return l0Var.f21712a0;
        }

        public void g(l0.a aVar, tg.c cVar) {
            aVar.k(cVar);
        }

        public g i(g0 g0Var, j0 j0Var) {
            return i0.i(g0Var, j0Var, true);
        }

        public tg.g j(n nVar) {
            return nVar.f21727a;
        }
    }

    public static final class b {
        public int A;
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public s f21586a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public Proxy f21587b;

        /* renamed from: c  reason: collision with root package name */
        public List<h0> f21588c;

        /* renamed from: d  reason: collision with root package name */
        public List<o> f21589d;

        /* renamed from: e  reason: collision with root package name */
        public final List<d0> f21590e;

        /* renamed from: f  reason: collision with root package name */
        public final List<d0> f21591f;

        /* renamed from: g  reason: collision with root package name */
        public x.b f21592g;

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f21593h;

        /* renamed from: i  reason: collision with root package name */
        public q f21594i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public e f21595j;
        @Nullable

        /* renamed from: k  reason: collision with root package name */
        public f f21596k;

        /* renamed from: l  reason: collision with root package name */
        public SocketFactory f21597l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public SSLSocketFactory f21598m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public c f21599n;

        /* renamed from: o  reason: collision with root package name */
        public HostnameVerifier f21600o;

        /* renamed from: p  reason: collision with root package name */
        public i f21601p;

        /* renamed from: q  reason: collision with root package name */
        public d f21602q;

        /* renamed from: r  reason: collision with root package name */
        public d f21603r;

        /* renamed from: s  reason: collision with root package name */
        public n f21604s;

        /* renamed from: t  reason: collision with root package name */
        public v f21605t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f21606u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f21607v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f21608w;

        /* renamed from: x  reason: collision with root package name */
        public int f21609x;

        /* renamed from: y  reason: collision with root package name */
        public int f21610y;

        /* renamed from: z  reason: collision with root package name */
        public int f21611z;

        public b() {
            this.f21590e = new ArrayList();
            this.f21591f = new ArrayList();
            this.f21586a = new s();
            this.f21588c = g0.f21568q0;
            this.f21589d = g0.f21569r0;
            this.f21592g = x.l(x.f21778a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f21593h = proxySelector;
            if (proxySelector == null) {
                this.f21593h = new zg.a();
            }
            this.f21594i = q.f21767a;
            this.f21597l = SocketFactory.getDefault();
            this.f21600o = ah.e.f16120a;
            this.f21601p = i.f21612c;
            d dVar = d.f21500a;
            this.f21602q = dVar;
            this.f21603r = dVar;
            this.f21604s = new n();
            this.f21605t = v.f21776a;
            this.f21606u = true;
            this.f21607v = true;
            this.f21608w = true;
            this.f21609x = 0;
            this.f21610y = 10000;
            this.f21611z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public b(g0 g0Var) {
            ArrayList arrayList = new ArrayList();
            this.f21590e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f21591f = arrayList2;
            this.f21586a = g0Var.O;
            this.f21587b = g0Var.P;
            this.f21588c = g0Var.Q;
            this.f21589d = g0Var.R;
            arrayList.addAll(g0Var.S);
            arrayList2.addAll(g0Var.T);
            this.f21592g = g0Var.U;
            this.f21593h = g0Var.V;
            this.f21594i = g0Var.W;
            this.f21596k = g0Var.Y;
            this.f21595j = g0Var.X;
            this.f21597l = g0Var.Z;
            this.f21598m = g0Var.f21570a0;
            this.f21599n = g0Var.f21571b0;
            this.f21600o = g0Var.f21572c0;
            this.f21601p = g0Var.f21573d0;
            this.f21602q = g0Var.f21574e0;
            this.f21603r = g0Var.f21575f0;
            this.f21604s = g0Var.f21576g0;
            this.f21605t = g0Var.f21577h0;
            this.f21606u = g0Var.f21578i0;
            this.f21607v = g0Var.f21579j0;
            this.f21608w = g0Var.f21580k0;
            this.f21609x = g0Var.f21581l0;
            this.f21610y = g0Var.f21582m0;
            this.f21611z = g0Var.f21583n0;
            this.A = g0Var.f21584o0;
            this.B = g0Var.f21585p0;
        }

        public b A(d dVar) {
            if (dVar != null) {
                this.f21602q = dVar;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        public b B(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f21593h = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        public b C(long j10, TimeUnit timeUnit) {
            this.f21611z = e.e("timeout", j10, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public b D(Duration duration) {
            this.f21611z = e.e("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b E(boolean z10) {
            this.f21608w = z10;
            return this;
        }

        public b F(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            } else if (!(socketFactory instanceof SSLSocketFactory)) {
                this.f21597l = socketFactory;
                return this;
            } else {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
        }

        public b G(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f21598m = sSLSocketFactory;
                this.f21599n = h.m().c(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        public b H(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f21598m = sSLSocketFactory;
                this.f21599n = c.b(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        public b I(long j10, TimeUnit timeUnit) {
            this.A = e.e("timeout", j10, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public b J(Duration duration) {
            this.A = e.e("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b a(d0 d0Var) {
            if (d0Var != null) {
                this.f21590e.add(d0Var);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public b b(d0 d0Var) {
            if (d0Var != null) {
                this.f21591f.add(d0Var);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public b c(d dVar) {
            if (dVar != null) {
                this.f21603r = dVar;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public g0 d() {
            return new g0(this);
        }

        public b e(@Nullable e eVar) {
            this.f21595j = eVar;
            this.f21596k = null;
            return this;
        }

        public b f(long j10, TimeUnit timeUnit) {
            this.f21609x = e.e("timeout", j10, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public b g(Duration duration) {
            this.f21609x = e.e("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b h(i iVar) {
            if (iVar != null) {
                this.f21601p = iVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        public b i(long j10, TimeUnit timeUnit) {
            this.f21610y = e.e("timeout", j10, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public b j(Duration duration) {
            this.f21610y = e.e("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b k(n nVar) {
            if (nVar != null) {
                this.f21604s = nVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public b l(List<o> list) {
            this.f21589d = e.u(list);
            return this;
        }

        public b m(q qVar) {
            if (qVar != null) {
                this.f21594i = qVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        public b n(s sVar) {
            if (sVar != null) {
                this.f21586a = sVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public b o(v vVar) {
            if (vVar != null) {
                this.f21605t = vVar;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        public b p(x xVar) {
            if (xVar != null) {
                this.f21592g = x.l(xVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public b q(x.b bVar) {
            if (bVar != null) {
                this.f21592g = bVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public b r(boolean z10) {
            this.f21607v = z10;
            return this;
        }

        public b s(boolean z10) {
            this.f21606u = z10;
            return this;
        }

        public b t(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f21600o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public List<d0> u() {
            return this.f21590e;
        }

        public List<d0> v() {
            return this.f21591f;
        }

        public b w(long j10, TimeUnit timeUnit) {
            this.B = e.e("interval", j10, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public b x(Duration duration) {
            this.B = e.e("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public b y(List<h0> list) {
            ArrayList arrayList = new ArrayList(list);
            h0 h0Var = h0.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(h0Var) && !arrayList.contains(h0.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            } else if (arrayList.contains(h0Var) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            } else if (arrayList.contains(h0.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            } else if (!arrayList.contains((Object) null)) {
                arrayList.remove(h0.SPDY_3);
                this.f21588c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        public b z(@Nullable Proxy proxy) {
            this.f21587b = proxy;
            return this;
        }
    }

    static {
        pg.a.f22062a = new a();
    }

    public g0() {
        this(new b());
    }

    public g0(b bVar) {
        boolean z10;
        c cVar;
        this.O = bVar.f21586a;
        this.P = bVar.f21587b;
        this.Q = bVar.f21588c;
        List<o> list = bVar.f21589d;
        this.R = list;
        this.S = e.u(bVar.f21590e);
        this.T = e.u(bVar.f21591f);
        this.U = bVar.f21592g;
        this.V = bVar.f21593h;
        this.W = bVar.f21594i;
        this.X = bVar.f21595j;
        this.Y = bVar.f21596k;
        this.Z = bVar.f21597l;
        Iterator<o> it = list.iterator();
        loop0:
        while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                o next = it.next();
                if (z10 || next.d()) {
                    z10 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f21598m;
        if (sSLSocketFactory != null || !z10) {
            this.f21570a0 = sSLSocketFactory;
            cVar = bVar.f21599n;
        } else {
            X509TrustManager E = e.E();
            this.f21570a0 = B(E);
            cVar = c.b(E);
        }
        this.f21571b0 = cVar;
        if (this.f21570a0 != null) {
            h.m().g(this.f21570a0);
        }
        this.f21572c0 = bVar.f21600o;
        this.f21573d0 = bVar.f21601p.g(this.f21571b0);
        this.f21574e0 = bVar.f21602q;
        this.f21575f0 = bVar.f21603r;
        this.f21576g0 = bVar.f21604s;
        this.f21577h0 = bVar.f21605t;
        this.f21578i0 = bVar.f21606u;
        this.f21579j0 = bVar.f21607v;
        this.f21580k0 = bVar.f21608w;
        this.f21581l0 = bVar.f21609x;
        this.f21582m0 = bVar.f21610y;
        this.f21583n0 = bVar.f21611z;
        this.f21584o0 = bVar.A;
        this.f21585p0 = bVar.B;
        if (this.S.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.S);
        } else if (this.T.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.T);
        }
    }

    public static SSLSocketFactory B(X509TrustManager x509TrustManager) {
        try {
            SSLContext o10 = h.m().o();
            o10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return o10.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    public b A() {
        return new b(this);
    }

    public int C() {
        return this.f21585p0;
    }

    public List<h0> D() {
        return this.Q;
    }

    @Nullable
    public Proxy E() {
        return this.P;
    }

    public d F() {
        return this.f21574e0;
    }

    public ProxySelector G() {
        return this.V;
    }

    public int H() {
        return this.f21583n0;
    }

    public boolean I() {
        return this.f21580k0;
    }

    public SocketFactory J() {
        return this.Z;
    }

    public SSLSocketFactory K() {
        return this.f21570a0;
    }

    public int L() {
        return this.f21584o0;
    }

    public g a(j0 j0Var) {
        return i0.i(this, j0Var, false);
    }

    public p0 d(j0 j0Var, q0 q0Var) {
        bh.b bVar = new bh.b(j0Var, q0Var, new Random(), (long) this.f21585p0);
        bVar.o(this);
        return bVar;
    }

    public d g() {
        return this.f21575f0;
    }

    @Nullable
    public e i() {
        return this.X;
    }

    public int j() {
        return this.f21581l0;
    }

    public i k() {
        return this.f21573d0;
    }

    public int m() {
        return this.f21582m0;
    }

    public n n() {
        return this.f21576g0;
    }

    public List<o> p() {
        return this.R;
    }

    public q q() {
        return this.W;
    }

    public s r() {
        return this.O;
    }

    public v s() {
        return this.f21577h0;
    }

    public x.b t() {
        return this.U;
    }

    public boolean u() {
        return this.f21579j0;
    }

    public boolean v() {
        return this.f21578i0;
    }

    public HostnameVerifier w() {
        return this.f21572c0;
    }

    public List<d0> x() {
        return this.S;
    }

    @Nullable
    public f y() {
        e eVar = this.X;
        return eVar != null ? eVar.O : this.Y;
    }

    public List<d0> z() {
        return this.T;
    }
}

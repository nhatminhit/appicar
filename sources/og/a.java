package og;

import gc.t;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import og.c0;
import pg.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f21457a;

    /* renamed from: b  reason: collision with root package name */
    public final v f21458b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f21459c;

    /* renamed from: d  reason: collision with root package name */
    public final d f21460d;

    /* renamed from: e  reason: collision with root package name */
    public final List<h0> f21461e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f21462f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f21463g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f21464h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f21465i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f21466j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final i f21467k;

    public a(String str, int i10, v vVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable i iVar, d dVar, @Nullable Proxy proxy, List<h0> list, List<o> list2, ProxySelector proxySelector) {
        this.f21457a = new c0.a().H(sSLSocketFactory != null ? t.f19111e : t.f19110d).q(str).x(i10).h();
        if (vVar != null) {
            this.f21458b = vVar;
            if (socketFactory != null) {
                this.f21459c = socketFactory;
                if (dVar != null) {
                    this.f21460d = dVar;
                    if (list != null) {
                        this.f21461e = e.u(list);
                        if (list2 != null) {
                            this.f21462f = e.u(list2);
                            if (proxySelector != null) {
                                this.f21463g = proxySelector;
                                this.f21464h = proxy;
                                this.f21465i = sSLSocketFactory;
                                this.f21466j = hostnameVerifier;
                                this.f21467k = iVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    public i a() {
        return this.f21467k;
    }

    public List<o> b() {
        return this.f21462f;
    }

    public v c() {
        return this.f21458b;
    }

    public boolean d(a aVar) {
        return this.f21458b.equals(aVar.f21458b) && this.f21460d.equals(aVar.f21460d) && this.f21461e.equals(aVar.f21461e) && this.f21462f.equals(aVar.f21462f) && this.f21463g.equals(aVar.f21463g) && Objects.equals(this.f21464h, aVar.f21464h) && Objects.equals(this.f21465i, aVar.f21465i) && Objects.equals(this.f21466j, aVar.f21466j) && Objects.equals(this.f21467k, aVar.f21467k) && l().E() == aVar.l().E();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.f21466j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f21457a.equals(aVar.f21457a) && d(aVar);
        }
    }

    public List<h0> f() {
        return this.f21461e;
    }

    @Nullable
    public Proxy g() {
        return this.f21464h;
    }

    public d h() {
        return this.f21460d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f21457a.hashCode()) * 31) + this.f21458b.hashCode()) * 31) + this.f21460d.hashCode()) * 31) + this.f21461e.hashCode()) * 31) + this.f21462f.hashCode()) * 31) + this.f21463g.hashCode()) * 31) + Objects.hashCode(this.f21464h)) * 31) + Objects.hashCode(this.f21465i)) * 31) + Objects.hashCode(this.f21466j)) * 31) + Objects.hashCode(this.f21467k);
    }

    public ProxySelector i() {
        return this.f21463g;
    }

    public SocketFactory j() {
        return this.f21459c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.f21465i;
    }

    public c0 l() {
        return this.f21457a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f21457a.p());
        sb2.append(":");
        sb2.append(this.f21457a.E());
        if (this.f21464h != null) {
            sb2.append(", proxy=");
            obj = this.f21464h;
        } else {
            sb2.append(", proxySelector=");
            obj = this.f21463g;
        }
        sb2.append(obj);
        sb2.append(p7.a.f11639j);
        return sb2.toString();
    }
}

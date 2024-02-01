package og;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;
import p7.a;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f21728a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f21729b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f21730c;

    public n0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f21728a = aVar;
            this.f21729b = proxy;
            this.f21730c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public a a() {
        return this.f21728a;
    }

    public Proxy b() {
        return this.f21729b;
    }

    public boolean c() {
        return this.f21728a.f21465i != null && this.f21729b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f21730c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            return n0Var.f21728a.equals(this.f21728a) && n0Var.f21729b.equals(this.f21729b) && n0Var.f21730c.equals(this.f21730c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f21728a.hashCode()) * 31) + this.f21729b.hashCode()) * 31) + this.f21730c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f21730c + a.f11639j;
    }
}

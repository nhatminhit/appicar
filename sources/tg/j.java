package tg;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import og.c0;
import og.g;
import og.n0;
import og.x;
import pg.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final og.a f23271a;

    /* renamed from: b  reason: collision with root package name */
    public final h f23272b;

    /* renamed from: c  reason: collision with root package name */
    public final g f23273c;

    /* renamed from: d  reason: collision with root package name */
    public final x f23274d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f23275e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f23276f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f23277g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<n0> f23278h = new ArrayList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<n0> f23279a;

        /* renamed from: b  reason: collision with root package name */
        public int f23280b = 0;

        public a(List<n0> list) {
            this.f23279a = list;
        }

        public List<n0> a() {
            return new ArrayList(this.f23279a);
        }

        public boolean b() {
            return this.f23280b < this.f23279a.size();
        }

        public n0 c() {
            if (b()) {
                List<n0> list = this.f23279a;
                int i10 = this.f23280b;
                this.f23280b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public j(og.a aVar, h hVar, g gVar, x xVar) {
        this.f23271a = aVar;
        this.f23272b = hVar;
        this.f23273c = gVar;
        this.f23274d = xVar;
        g(aVar.l(), aVar.g());
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    public boolean b() {
        return c() || !this.f23278h.isEmpty();
    }

    public final boolean c() {
        return this.f23276f < this.f23275e.size();
    }

    public a d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e10 = e();
                int size = this.f23277g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n0 n0Var = new n0(this.f23271a, e10, this.f23277g.get(i10));
                    if (this.f23272b.c(n0Var)) {
                        this.f23278h.add(n0Var);
                    } else {
                        arrayList.add(n0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f23278h);
                this.f23278h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy e() throws IOException {
        if (c()) {
            List<Proxy> list = this.f23275e;
            int i10 = this.f23276f;
            this.f23276f = i10 + 1;
            Proxy proxy = list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f23271a.l().p() + "; exhausted proxy configurations: " + this.f23275e);
    }

    public final void f(Proxy proxy) throws IOException {
        String str;
        int i10;
        this.f23277g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f23271a.l().p();
            i10 = this.f23271a.l().E();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i10 < 1 || i10 > 65535) {
            throw new SocketException("No route to " + str + ":" + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f23277g.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            this.f23274d.k(this.f23273c, str);
            List<InetAddress> a10 = this.f23271a.c().a(str);
            if (!a10.isEmpty()) {
                this.f23274d.j(this.f23273c, str, a10);
                int size = a10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f23277g.add(new InetSocketAddress(a10.get(i11), i10));
                }
                return;
            }
            throw new UnknownHostException(this.f23271a.c() + " returned no addresses for " + str);
        }
    }

    public final void g(c0 c0Var, Proxy proxy) {
        List<Proxy> v10;
        if (proxy != null) {
            v10 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f23271a.i().select(c0Var.R());
            if (select == null || select.isEmpty()) {
                v10 = e.v(Proxy.NO_PROXY);
            } else {
                v10 = e.u(select);
            }
        }
        this.f23275e = v10;
        this.f23276f = 0;
    }
}

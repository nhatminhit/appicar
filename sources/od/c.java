package od;

import d6.f0;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import od.d;
import og.g;
import og.p0;
import pd.a;
import qd.c;
import wd.c;
import wd.e;

public class c extends pd.a {
    public static final String A = "reconnect_error";
    public static final String B = "reconnect_failed";
    public static final String C = "reconnect_attempt";
    public static final String D = "transport";
    public static p0.a E = null;
    public static g.a F = null;

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f21372u = Logger.getLogger(c.class.getName());

    /* renamed from: v  reason: collision with root package name */
    public static final String f21373v = "open";

    /* renamed from: w  reason: collision with root package name */
    public static final String f21374w = "close";

    /* renamed from: x  reason: collision with root package name */
    public static final String f21375x = "packet";

    /* renamed from: y  reason: collision with root package name */
    public static final String f21376y = "error";

    /* renamed from: z  reason: collision with root package name */
    public static final String f21377z = "reconnect";

    /* renamed from: b  reason: collision with root package name */
    public l f21378b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21379c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21380d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21381e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21382f;

    /* renamed from: g  reason: collision with root package name */
    public int f21383g;

    /* renamed from: h  reason: collision with root package name */
    public long f21384h;

    /* renamed from: i  reason: collision with root package name */
    public long f21385i;

    /* renamed from: j  reason: collision with root package name */
    public double f21386j;

    /* renamed from: k  reason: collision with root package name */
    public nd.a f21387k;

    /* renamed from: l  reason: collision with root package name */
    public long f21388l;

    /* renamed from: m  reason: collision with root package name */
    public URI f21389m;

    /* renamed from: n  reason: collision with root package name */
    public List<wd.d> f21390n;

    /* renamed from: o  reason: collision with root package name */
    public Queue<d.b> f21391o;

    /* renamed from: p  reason: collision with root package name */
    public k f21392p;

    /* renamed from: q  reason: collision with root package name */
    public qd.c f21393q;

    /* renamed from: r  reason: collision with root package name */
    public e.b f21394r;

    /* renamed from: s  reason: collision with root package name */
    public e.a f21395s;

    /* renamed from: t  reason: collision with root package name */
    public ConcurrentHashMap<String, e> f21396t;

    public class a implements Runnable {
        public final /* synthetic */ j O;

        /* renamed from: od.c$a$a  reason: collision with other inner class name */
        public class C0375a implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f21397a;

            public C0375a(c cVar) {
                this.f21397a = cVar;
            }

            public void c(Object... objArr) {
                this.f21397a.a("transport", objArr);
            }
        }

        public class b implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f21399a;

            public b(c cVar) {
                this.f21399a = cVar;
            }

            public void c(Object... objArr) {
                this.f21399a.L();
                j jVar = a.this.O;
                if (jVar != null) {
                    jVar.a((Exception) null);
                }
            }
        }

        /* renamed from: od.c$a$c  reason: collision with other inner class name */
        public class C0376c implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f21401a;

            public C0376c(c cVar) {
                this.f21401a = cVar;
            }

            public void c(Object... objArr) {
                Exception exc = null;
                Exception exc2 = objArr.length > 0 ? objArr[0] : null;
                c.f21372u.fine(e.f21428o);
                this.f21401a.D();
                c cVar = this.f21401a;
                cVar.f21378b = l.CLOSED;
                cVar.a("error", exc2);
                if (a.this.O != null) {
                    if (exc2 instanceof Exception) {
                        exc = exc2;
                    }
                    a.this.O.a(new f("Connection error", exc));
                    return;
                }
                this.f21401a.H();
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ long O;
            public final /* synthetic */ d.b P;
            public final /* synthetic */ qd.c Q;

            public d(long j10, d.b bVar, qd.c cVar) {
                this.O = j10;
                this.P = bVar;
                this.Q = cVar;
            }

            public void run() {
                c.f21372u.fine(String.format("connect attempt timed out after %d", new Object[]{Long.valueOf(this.O)}));
                this.P.destroy();
                this.Q.D();
                this.Q.a("error", new f("timeout"));
            }
        }

        public class e extends TimerTask {
            public final /* synthetic */ Runnable O;

            public e(Runnable runnable) {
                this.O = runnable;
            }

            public void run() {
                xd.a.h(this.O);
            }
        }

        public class f implements d.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Timer f21403a;

            public f(Timer timer) {
                this.f21403a = timer;
            }

            public void destroy() {
                this.f21403a.cancel();
            }
        }

        public a(j jVar) {
            this.O = jVar;
        }

        public void run() {
            l lVar;
            Logger j10 = c.f21372u;
            Level level = Level.FINE;
            if (j10.isLoggable(level)) {
                c.f21372u.fine(String.format("readyState %s", new Object[]{c.this.f21378b}));
            }
            l lVar2 = c.this.f21378b;
            if (lVar2 != l.OPEN && lVar2 != (lVar = l.OPENING)) {
                if (c.f21372u.isLoggable(level)) {
                    c.f21372u.fine(String.format("opening %s", new Object[]{c.this.f21389m}));
                }
                c.this.f21393q = new i(c.this.f21389m, c.this.f21392p);
                c cVar = c.this;
                qd.c cVar2 = cVar.f21393q;
                cVar.f21378b = lVar;
                boolean unused = cVar.f21380d = false;
                cVar2.g("transport", new C0375a(cVar));
                d.b a10 = d.a(cVar2, "open", new b(cVar));
                d.b a11 = d.a(cVar2, "error", new C0376c(cVar));
                long A = c.this.f21388l;
                d dVar = new d(A, a10, cVar2);
                if (A == 0) {
                    xd.a.h(dVar);
                    return;
                }
                if (c.this.f21388l > 0) {
                    c.f21372u.fine(String.format("connection attempt will timeout after %d", new Object[]{Long.valueOf(A)}));
                    Timer timer = new Timer();
                    timer.schedule(new e(dVar), A);
                    c.this.f21391o.add(new f(timer));
                }
                c.this.f21391o.add(a10);
                c.this.f21391o.add(a11);
                c.this.f21393q.R();
            }
        }
    }

    public class b implements a.C0385a {
        public b() {
        }

        public void c(Object... objArr) {
            String str = objArr[0];
            try {
                if (str instanceof String) {
                    c.this.f21395s.c(str);
                } else if (str instanceof byte[]) {
                    c.this.f21395s.b((byte[]) str);
                }
            } catch (wd.b e10) {
                Logger j10 = c.f21372u;
                j10.fine("error while decoding the packet: " + e10.getMessage());
            }
        }
    }

    /* renamed from: od.c$c  reason: collision with other inner class name */
    public class C0377c implements a.C0385a {
        public C0377c() {
        }

        public void c(Object... objArr) {
            c.this.K(objArr[0]);
        }
    }

    public class d implements a.C0385a {
        public d() {
        }

        public void c(Object... objArr) {
            c.this.I(objArr[0]);
        }
    }

    public class e implements e.a.C0479a {
        public e() {
        }

        public void a(wd.d dVar) {
            c.this.J(dVar);
        }
    }

    public class f implements e.b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f21409a;

        public f(c cVar) {
            this.f21409a = cVar;
        }

        public void c(Object[] objArr) {
            for (String str : objArr) {
                if (str instanceof String) {
                    this.f21409a.f21393q.e0(str);
                } else if (str instanceof byte[]) {
                    this.f21409a.f21393q.g0((byte[]) str);
                }
            }
            boolean unused = this.f21409a.f21382f = false;
            this.f21409a.Q();
        }
    }

    public class g extends TimerTask {
        public final /* synthetic */ c O;

        public class a implements Runnable {

            /* renamed from: od.c$g$a$a  reason: collision with other inner class name */
            public class C0378a implements j {
                public C0378a() {
                }

                public void a(Exception exc) {
                    if (exc != null) {
                        c.f21372u.fine("reconnect attempt error");
                        boolean unused = g.this.O.f21381e = false;
                        g.this.O.T();
                        g.this.O.a(c.A, exc);
                        return;
                    }
                    c.f21372u.fine("reconnect success");
                    g.this.O.M();
                }
            }

            public a() {
            }

            public void run() {
                if (!g.this.O.f21380d) {
                    c.f21372u.fine("attempting reconnect");
                    int b10 = g.this.O.f21387k.b();
                    g.this.O.a(c.C, Integer.valueOf(b10));
                    if (!g.this.O.f21380d) {
                        g.this.O.O(new C0378a());
                    }
                }
            }
        }

        public g(c cVar) {
            this.O = cVar;
        }

        public void run() {
            xd.a.h(new a());
        }
    }

    public class h implements d.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Timer f21412a;

        public h(Timer timer) {
            this.f21412a = timer;
        }

        public void destroy() {
            this.f21412a.cancel();
        }
    }

    public static class i extends qd.c {
        public i(URI uri, c.t tVar) {
            super(uri, tVar);
        }
    }

    public interface j {
        void a(Exception exc);
    }

    public static class k extends c.t {
        public long A = f0.f6302r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f21414s = true;

        /* renamed from: t  reason: collision with root package name */
        public int f21415t;

        /* renamed from: u  reason: collision with root package name */
        public long f21416u;

        /* renamed from: v  reason: collision with root package name */
        public long f21417v;

        /* renamed from: w  reason: collision with root package name */
        public double f21418w;

        /* renamed from: x  reason: collision with root package name */
        public e.b f21419x;

        /* renamed from: y  reason: collision with root package name */
        public e.a f21420y;

        /* renamed from: z  reason: collision with root package name */
        public Map<String, String> f21421z;
    }

    public enum l {
        CLOSED,
        OPENING,
        OPEN
    }

    public c() {
        this((URI) null, (k) null);
    }

    public c(URI uri) {
        this(uri, (k) null);
    }

    public c(URI uri, k kVar) {
        kVar = kVar == null ? new k() : kVar;
        if (kVar.f22360b == null) {
            kVar.f22360b = "/socket.io";
        }
        if (kVar.f22368j == null) {
            kVar.f22368j = E;
        }
        if (kVar.f22369k == null) {
            kVar.f22369k = F;
        }
        this.f21392p = kVar;
        this.f21396t = new ConcurrentHashMap<>();
        this.f21391o = new LinkedList();
        U(kVar.f21414s);
        int i10 = kVar.f21415t;
        X(i10 == 0 ? Integer.MAX_VALUE : i10);
        long j10 = kVar.f21416u;
        Z(j10 == 0 ? 1000 : j10);
        long j11 = kVar.f21417v;
        b0(j11 == 0 ? b6.h.f4357h : j11);
        double d10 = kVar.f21418w;
        S(d10 == 0.0d ? 0.5d : d10);
        this.f21387k = new nd.a().g(Y()).f(a0()).e(R());
        f0(kVar.A);
        this.f21378b = l.CLOSED;
        this.f21389m = uri;
        this.f21382f = false;
        this.f21390n = new ArrayList();
        e.b bVar = kVar.f21419x;
        this.f21394r = bVar == null ? new c.C0478c() : bVar;
        e.a aVar = kVar.f21420y;
        this.f21395s = aVar == null ? new c.b() : aVar;
    }

    public c(k kVar) {
        this((URI) null, kVar);
    }

    public final void D() {
        f21372u.fine("cleanup");
        while (true) {
            d.b poll = this.f21391o.poll();
            if (poll != null) {
                poll.destroy();
            } else {
                this.f21395s.a((e.a.C0479a) null);
                this.f21390n.clear();
                this.f21382f = false;
                this.f21395s.destroy();
                return;
            }
        }
    }

    public void E() {
        f21372u.fine(e.f21427n);
        this.f21380d = true;
        this.f21381e = false;
        if (this.f21378b != l.OPEN) {
            D();
        }
        this.f21387k.c();
        this.f21378b = l.CLOSED;
        qd.c cVar = this.f21393q;
        if (cVar != null) {
            cVar.D();
        }
    }

    public void F() {
        synchronized (this.f21396t) {
            for (e I : this.f21396t.values()) {
                if (I.I()) {
                    f21372u.fine("socket is still active, skipping close");
                    return;
                }
            }
            E();
        }
    }

    public boolean G() {
        return this.f21381e;
    }

    public final void H() {
        if (!this.f21381e && this.f21379c && this.f21387k.b() == 0) {
            T();
        }
    }

    public final void I(String str) {
        f21372u.fine("onclose");
        D();
        this.f21387k.c();
        this.f21378b = l.CLOSED;
        a("close", str);
        if (this.f21379c && !this.f21380d) {
            T();
        }
    }

    public final void J(wd.d dVar) {
        a("packet", dVar);
    }

    public final void K(Exception exc) {
        f21372u.log(Level.FINE, "error", exc);
        a("error", exc);
    }

    public final void L() {
        f21372u.fine("open");
        D();
        this.f21378b = l.OPEN;
        a("open", new Object[0]);
        qd.c cVar = this.f21393q;
        this.f21391o.add(d.a(cVar, "data", new b()));
        this.f21391o.add(d.a(cVar, "error", new C0377c()));
        this.f21391o.add(d.a(cVar, "close", new d()));
        this.f21395s.a(new e());
    }

    public final void M() {
        int b10 = this.f21387k.b();
        this.f21381e = false;
        this.f21387k.c();
        a(f21377z, Integer.valueOf(b10));
    }

    public c N() {
        return O((j) null);
    }

    public c O(j jVar) {
        xd.a.h(new a(jVar));
        return this;
    }

    public void P(wd.d dVar) {
        Logger logger = f21372u;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("writing packet %s", new Object[]{dVar}));
        }
        if (!this.f21382f) {
            this.f21382f = true;
            this.f21394r.a(dVar, new f(this));
            return;
        }
        this.f21390n.add(dVar);
    }

    public final void Q() {
        if (!this.f21390n.isEmpty() && !this.f21382f) {
            P(this.f21390n.remove(0));
        }
    }

    public final double R() {
        return this.f21386j;
    }

    public c S(double d10) {
        this.f21386j = d10;
        nd.a aVar = this.f21387k;
        if (aVar != null) {
            aVar.e(d10);
        }
        return this;
    }

    public final void T() {
        if (!this.f21381e && !this.f21380d) {
            if (this.f21387k.b() >= this.f21383g) {
                f21372u.fine("reconnect failed");
                this.f21387k.c();
                a(B, new Object[0]);
                this.f21381e = false;
                return;
            }
            long a10 = this.f21387k.a();
            f21372u.fine(String.format("will wait %dms before reconnect attempt", new Object[]{Long.valueOf(a10)}));
            this.f21381e = true;
            Timer timer = new Timer();
            timer.schedule(new g(this), a10);
            this.f21391o.add(new h(timer));
        }
    }

    public c U(boolean z10) {
        this.f21379c = z10;
        return this;
    }

    public boolean V() {
        return this.f21379c;
    }

    public int W() {
        return this.f21383g;
    }

    public c X(int i10) {
        this.f21383g = i10;
        return this;
    }

    public final long Y() {
        return this.f21384h;
    }

    public c Z(long j10) {
        this.f21384h = j10;
        nd.a aVar = this.f21387k;
        if (aVar != null) {
            aVar.g(j10);
        }
        return this;
    }

    public final long a0() {
        return this.f21385i;
    }

    public c b0(long j10) {
        this.f21385i = j10;
        nd.a aVar = this.f21387k;
        if (aVar != null) {
            aVar.f(j10);
        }
        return this;
    }

    public e c0(String str) {
        return d0(str, (k) null);
    }

    public e d0(String str, k kVar) {
        e eVar;
        synchronized (this.f21396t) {
            eVar = this.f21396t.get(str);
            if (eVar == null) {
                eVar = new e(this, str, kVar);
                this.f21396t.put(str, eVar);
            }
        }
        return eVar;
    }

    public long e0() {
        return this.f21388l;
    }

    public c f0(long j10) {
        this.f21388l = j10;
        return this;
    }
}

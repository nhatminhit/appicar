package qd;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import og.g;
import og.g0;
import og.p0;
import org.json.JSONException;
import pd.a;
import qd.d;

public class c extends pd.a {
    public static final Logger C = Logger.getLogger(c.class.getName());
    public static final String D = "probe error";
    public static final String E = "open";
    public static final String F = "close";
    public static final String G = "message";
    public static final String H = "error";
    public static final String I = "upgradeError";
    public static final String J = "flush";
    public static final String K = "drain";
    public static final String L = "handshake";
    public static final String M = "upgrading";
    public static final String N = "upgrade";
    public static final String O = "packet";
    public static final String P = "packetCreate";
    public static final String Q = "heartbeat";
    public static final String R = "data";
    public static final String S = "ping";
    public static final String T = "pong";
    public static final String U = "transport";
    public static final int V = 4;
    public static boolean W = false;
    public static p0.a X;
    public static g.a Y;
    public static g0 Z;
    public ScheduledExecutorService A;
    public final a.C0385a B;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22266b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22267c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22268d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22269e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22270f;

    /* renamed from: g  reason: collision with root package name */
    public int f22271g;

    /* renamed from: h  reason: collision with root package name */
    public int f22272h;

    /* renamed from: i  reason: collision with root package name */
    public int f22273i;

    /* renamed from: j  reason: collision with root package name */
    public long f22274j;

    /* renamed from: k  reason: collision with root package name */
    public long f22275k;

    /* renamed from: l  reason: collision with root package name */
    public String f22276l;

    /* renamed from: m  reason: collision with root package name */
    public String f22277m;

    /* renamed from: n  reason: collision with root package name */
    public String f22278n;

    /* renamed from: o  reason: collision with root package name */
    public String f22279o;

    /* renamed from: p  reason: collision with root package name */
    public List<String> f22280p;

    /* renamed from: q  reason: collision with root package name */
    public Map<String, d.C0393d> f22281q;

    /* renamed from: r  reason: collision with root package name */
    public List<String> f22282r;

    /* renamed from: s  reason: collision with root package name */
    public Map<String, String> f22283s;

    /* renamed from: t  reason: collision with root package name */
    public LinkedList<sd.b> f22284t;

    /* renamed from: u  reason: collision with root package name */
    public d f22285u;

    /* renamed from: v  reason: collision with root package name */
    public Future f22286v;

    /* renamed from: w  reason: collision with root package name */
    public p0.a f22287w;

    /* renamed from: x  reason: collision with root package name */
    public g.a f22288x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<String, List<String>> f22289y;

    /* renamed from: z  reason: collision with root package name */
    public u f22290z;

    public class a implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.C0385a f22291a;

        public a(a.C0385a aVar) {
            this.f22291a = aVar;
        }

        public void c(Object... objArr) {
            this.f22291a.c("transport closed");
        }
    }

    public class b implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.C0385a f22293a;

        public b(a.C0385a aVar) {
            this.f22293a = aVar;
        }

        public void c(Object... objArr) {
            this.f22293a.c("socket closed");
        }
    }

    /* renamed from: qd.c$c  reason: collision with other inner class name */
    public class C0390c implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d[] f22295a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.C0385a f22296b;

        public C0390c(d[] dVarArr, a.C0385a aVar) {
            this.f22295a = dVarArr;
            this.f22296b = aVar;
        }

        public void c(Object... objArr) {
            d dVar = objArr[0];
            d dVar2 = this.f22295a[0];
            if (dVar2 != null && !dVar.f22346c.equals(dVar2.f22346c)) {
                if (c.C.isLoggable(Level.FINE)) {
                    c.C.fine(String.format("'%s' works - aborting '%s'", new Object[]{dVar.f22346c, this.f22295a[0].f22346c}));
                }
                this.f22296b.c(new Object[0]);
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ d[] O;
        public final /* synthetic */ a.C0385a P;
        public final /* synthetic */ a.C0385a Q;
        public final /* synthetic */ a.C0385a R;
        public final /* synthetic */ c S;
        public final /* synthetic */ a.C0385a T;
        public final /* synthetic */ a.C0385a U;

        public d(d[] dVarArr, a.C0385a aVar, a.C0385a aVar2, a.C0385a aVar3, c cVar, a.C0385a aVar4, a.C0385a aVar5) {
            this.O = dVarArr;
            this.P = aVar;
            this.Q = aVar2;
            this.R = aVar3;
            this.S = cVar;
            this.T = aVar4;
            this.U = aVar5;
        }

        public void run() {
            this.O[0].f("open", this.P);
            this.O[0].f("error", this.Q);
            this.O[0].f("close", this.R);
            this.S.f("close", this.T);
            this.S.f(c.M, this.U);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            c.this.X("pong", (Runnable) null);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ c O;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                if (f.this.O.f22290z != u.CLOSED) {
                    f.this.O.J("ping timeout");
                }
            }
        }

        public f(c cVar) {
            this.O = cVar;
        }

        public void run() {
            xd.a.h(new a());
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ String O;
        public final /* synthetic */ Runnable P;

        public g(String str, Runnable runnable) {
            this.O = str;
            this.P = runnable;
        }

        public void run() {
            c.this.Y("message", this.O, this.P);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ byte[] O;
        public final /* synthetic */ Runnable P;

        public h(byte[] bArr, Runnable runnable) {
            this.O = bArr;
            this.P = runnable;
        }

        public void run() {
            c.this.Z("message", this.O, this.P);
        }
    }

    public class i implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f22298a;

        public i(Runnable runnable) {
            this.f22298a = runnable;
        }

        public void c(Object... objArr) {
            this.f22298a.run();
        }
    }

    public class j implements Runnable {

        public class a implements Runnable {
            public final /* synthetic */ c O;

            public a(c cVar) {
                this.O = cVar;
            }

            public void run() {
                this.O.J("forced close");
                c.C.fine("socket closing - telling transport to close");
                this.O.f22285u.j();
            }
        }

        public class b implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f22300a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a.C0385a[] f22301b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Runnable f22302c;

            public b(c cVar, a.C0385a[] aVarArr, Runnable runnable) {
                this.f22300a = cVar;
                this.f22301b = aVarArr;
                this.f22302c = runnable;
            }

            public void c(Object... objArr) {
                this.f22300a.f("upgrade", this.f22301b[0]);
                this.f22300a.f(c.I, this.f22301b[0]);
                this.f22302c.run();
            }
        }

        /* renamed from: qd.c$j$c  reason: collision with other inner class name */
        public class C0391c implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ a.C0385a[] P;

            public C0391c(c cVar, a.C0385a[] aVarArr) {
                this.O = cVar;
                this.P = aVarArr;
            }

            public void run() {
                this.O.h("upgrade", this.P[0]);
                this.O.h(c.I, this.P[0]);
            }
        }

        public class d implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f22304a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Runnable f22305b;

            public d(Runnable runnable, Runnable runnable2) {
                this.f22304a = runnable;
                this.f22305b = runnable2;
            }

            public void c(Object... objArr) {
                (c.this.f22269e ? this.f22304a : this.f22305b).run();
            }
        }

        public j() {
        }

        public void run() {
            if (c.this.f22290z == u.OPENING || c.this.f22290z == u.OPEN) {
                u unused = c.this.f22290z = u.CLOSING;
                c cVar = c.this;
                a aVar = new a(cVar);
                a.C0385a[] aVarArr = {new b(cVar, aVarArr, aVar)};
                C0391c cVar2 = new C0391c(cVar, aVarArr);
                if (c.this.f22284t.size() > 0) {
                    c.this.h("drain", new d(cVar2, aVar));
                } else if (c.this.f22269e) {
                    cVar2.run();
                } else {
                    aVar.run();
                }
            }
        }
    }

    public class k implements a.C0385a {
        public k() {
        }

        public void c(Object... objArr) {
            c.this.O();
        }
    }

    public class l implements Runnable {

        public class a implements Runnable {
            public final /* synthetic */ c O;

            public a(c cVar) {
                this.O = cVar;
            }

            public void run() {
                this.O.a("error", new a("No transports available"));
            }
        }

        public l() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                qd.c r0 = qd.c.this
                boolean r0 = r0.f22270f
                java.lang.String r1 = "websocket"
                if (r0 == 0) goto L_0x001d
                boolean r0 = qd.c.W
                if (r0 == 0) goto L_0x001d
                qd.c r0 = qd.c.this
                java.util.List r0 = r0.f22280p
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x001d
                goto L_0x0042
            L_0x001d:
                qd.c r0 = qd.c.this
                java.util.List r0 = r0.f22280p
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0034
                qd.c r0 = qd.c.this
                qd.c$l$a r1 = new qd.c$l$a
                r1.<init>(r0)
                xd.a.j(r1)
                return
            L_0x0034:
                qd.c r0 = qd.c.this
                java.util.List r0 = r0.f22280p
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
            L_0x0042:
                qd.c r0 = qd.c.this
                qd.c$u r2 = qd.c.u.OPENING
                qd.c.u unused = r0.f22290z = r2
                qd.c r0 = qd.c.this
                qd.d r0 = r0.E(r1)
                qd.c r1 = qd.c.this
                r1.d0(r0)
                r0.s()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qd.c.l.run():void");
        }
    }

    public class m implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22308a;

        public m(c cVar) {
            this.f22308a = cVar;
        }

        public void c(Object... objArr) {
            this.f22308a.J("transport close");
        }
    }

    public class n implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22310a;

        public n(c cVar) {
            this.f22310a = cVar;
        }

        public void c(Object... objArr) {
            this.f22310a.M(objArr.length > 0 ? objArr[0] : null);
        }
    }

    public class o implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22312a;

        public o(c cVar) {
            this.f22312a = cVar;
        }

        public void c(Object... objArr) {
            this.f22312a.Q(objArr.length > 0 ? objArr[0] : null);
        }
    }

    public class p implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22314a;

        public p(c cVar) {
            this.f22314a = cVar;
        }

        public void c(Object... objArr) {
            this.f22314a.L();
        }
    }

    public class q implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f22316a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f22317b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d[] f22318c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f22319d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Runnable[] f22320e;

        public class a implements a.C0385a {

            /* renamed from: qd.c$q$a$a  reason: collision with other inner class name */
            public class C0392a implements Runnable {
                public C0392a() {
                }

                public void run() {
                    q qVar = q.this;
                    if (!qVar.f22316a[0] && u.CLOSED != qVar.f22319d.f22290z) {
                        c.C.fine("changing transport and sending upgrade packet");
                        q.this.f22320e[0].run();
                        q qVar2 = q.this;
                        qVar2.f22319d.d0(qVar2.f22318c[0]);
                        sd.b bVar = new sd.b("upgrade");
                        q.this.f22318c[0].t(new sd.b[]{bVar});
                        q qVar3 = q.this;
                        qVar3.f22319d.a("upgrade", qVar3.f22318c[0]);
                        q qVar4 = q.this;
                        qVar4.f22318c[0] = null;
                        boolean unused = qVar4.f22319d.f22269e = false;
                        q.this.f22319d.G();
                    }
                }
            }

            public a() {
            }

            public void c(Object... objArr) {
                if (!q.this.f22316a[0]) {
                    sd.b bVar = objArr[0];
                    if (!"pong".equals(bVar.f22956a) || !"probe".equals(bVar.f22957b)) {
                        if (c.C.isLoggable(Level.FINE)) {
                            c.C.fine(String.format("probe transport '%s' failed", new Object[]{q.this.f22317b}));
                        }
                        a aVar = new a(c.D);
                        q qVar = q.this;
                        aVar.O = qVar.f22318c[0].f22346c;
                        qVar.f22319d.a(c.I, aVar);
                        return;
                    }
                    Logger m10 = c.C;
                    Level level = Level.FINE;
                    if (m10.isLoggable(level)) {
                        c.C.fine(String.format("probe transport '%s' pong", new Object[]{q.this.f22317b}));
                    }
                    boolean unused = q.this.f22319d.f22269e = true;
                    q qVar2 = q.this;
                    qVar2.f22319d.a(c.M, qVar2.f22318c[0]);
                    d dVar = q.this.f22318c[0];
                    if (dVar != null) {
                        boolean unused2 = c.W = rd.c.f22474x.equals(dVar.f22346c);
                        if (c.C.isLoggable(level)) {
                            c.C.fine(String.format("pausing current transport '%s'", new Object[]{q.this.f22319d.f22285u.f22346c}));
                        }
                        ((rd.a) q.this.f22319d.f22285u).G(new C0392a());
                    }
                }
            }
        }

        public q(boolean[] zArr, String str, d[] dVarArr, c cVar, Runnable[] runnableArr) {
            this.f22316a = zArr;
            this.f22317b = str;
            this.f22318c = dVarArr;
            this.f22319d = cVar;
            this.f22320e = runnableArr;
        }

        public void c(Object... objArr) {
            if (!this.f22316a[0]) {
                if (c.C.isLoggable(Level.FINE)) {
                    c.C.fine(String.format("probe transport '%s' opened", new Object[]{this.f22317b}));
                }
                sd.b bVar = new sd.b("ping", "probe");
                this.f22318c[0].t(new sd.b[]{bVar});
                this.f22318c[0].h("packet", new a());
            }
        }
    }

    public class r implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f22323a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable[] f22324b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d[] f22325c;

        public r(boolean[] zArr, Runnable[] runnableArr, d[] dVarArr) {
            this.f22323a = zArr;
            this.f22324b = runnableArr;
            this.f22325c = dVarArr;
        }

        public void c(Object... objArr) {
            boolean[] zArr = this.f22323a;
            if (!zArr[0]) {
                zArr[0] = true;
                this.f22324b[0].run();
                this.f22325c[0].j();
                this.f22325c[0] = null;
            }
        }
    }

    public class s implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d[] f22327a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.C0385a f22328b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f22329c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f22330d;

        public s(d[] dVarArr, a.C0385a aVar, String str, c cVar) {
            this.f22327a = dVarArr;
            this.f22328b = aVar;
            this.f22329c = str;
            this.f22330d = cVar;
        }

        public void c(Object... objArr) {
            a aVar;
            Exception exc = objArr[0];
            if (exc instanceof Exception) {
                aVar = new a(c.D, exc);
            } else if (exc instanceof String) {
                aVar = new a("probe error: " + exc);
            } else {
                aVar = new a(c.D);
            }
            aVar.O = this.f22327a[0].f22346c;
            this.f22328b.c(new Object[0]);
            if (c.C.isLoggable(Level.FINE)) {
                c.C.fine(String.format("probe transport \"%s\" failed because of error: %s", new Object[]{this.f22329c, exc}));
            }
            this.f22330d.a(c.I, aVar);
        }
    }

    public static class t extends d.C0393d {

        /* renamed from: m  reason: collision with root package name */
        public String[] f22332m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f22333n = true;

        /* renamed from: o  reason: collision with root package name */
        public boolean f22334o;

        /* renamed from: p  reason: collision with root package name */
        public String f22335p;

        /* renamed from: q  reason: collision with root package name */
        public String f22336q;

        /* renamed from: r  reason: collision with root package name */
        public Map<String, d.C0393d> f22337r;

        public static t b(URI uri, t tVar) {
            if (tVar == null) {
                tVar = new t();
            }
            tVar.f22335p = uri.getHost();
            tVar.f22362d = gc.t.f19111e.equals(uri.getScheme()) || "wss".equals(uri.getScheme());
            tVar.f22364f = uri.getPort();
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                tVar.f22336q = rawQuery;
            }
            return tVar;
        }
    }

    public enum u {
        OPENING,
        OPEN,
        CLOSING,
        CLOSED;

        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public c() {
        this(new t());
    }

    public c(String str) throws URISyntaxException {
        this(str, (t) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str, t tVar) throws URISyntaxException {
        this(str == null ? null : new URI(str), tVar);
    }

    public c(URI uri) {
        this(uri, (t) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(URI uri, t tVar) {
        this(uri != null ? t.b(uri, tVar) : tVar);
    }

    public c(t tVar) {
        this.f22284t = new LinkedList<>();
        this.B = new k();
        String str = tVar.f22335p;
        if (str != null) {
            if (str.split(":").length > 2) {
                int indexOf = str.indexOf(91);
                str = indexOf != -1 ? str.substring(indexOf + 1) : str;
                int lastIndexOf = str.lastIndexOf(93);
                if (lastIndexOf != -1) {
                    str = str.substring(0, lastIndexOf);
                }
            }
            tVar.f22359a = str;
        }
        boolean z10 = tVar.f22362d;
        this.f22266b = z10;
        if (tVar.f22364f == -1) {
            tVar.f22364f = z10 ? 443 : 80;
        }
        String str2 = tVar.f22359a;
        this.f22277m = str2 == null ? "localhost" : str2;
        this.f22271g = tVar.f22364f;
        String str3 = tVar.f22336q;
        this.f22283s = str3 != null ? vd.a.a(str3) : new HashMap<>();
        this.f22267c = tVar.f22333n;
        StringBuilder sb2 = new StringBuilder();
        String str4 = tVar.f22360b;
        sb2.append((str4 == null ? "/engine.io" : str4).replaceAll("/$", ""));
        sb2.append("/");
        this.f22278n = sb2.toString();
        String str5 = tVar.f22361c;
        this.f22279o = str5 == null ? zb.t.f25097a : str5;
        this.f22268d = tVar.f22363e;
        String[] strArr = tVar.f22332m;
        this.f22280p = new ArrayList(Arrays.asList(strArr == null ? new String[]{rd.a.f22425y, rd.c.f22474x} : strArr));
        Map<String, d.C0393d> map = tVar.f22337r;
        this.f22281q = map == null ? new HashMap<>() : map;
        int i10 = tVar.f22365g;
        this.f22272h = i10 == 0 ? 843 : i10;
        this.f22270f = tVar.f22334o;
        g.a aVar = tVar.f22369k;
        aVar = aVar == null ? Y : aVar;
        this.f22288x = aVar;
        p0.a aVar2 = tVar.f22368j;
        this.f22287w = aVar2 == null ? X : aVar2;
        if (aVar == null) {
            if (Z == null) {
                Z = new g0();
            }
            this.f22288x = Z;
        }
        if (this.f22287w == null) {
            if (Z == null) {
                Z = new g0();
            }
            this.f22287w = Z;
        }
        this.f22289y = tVar.f22370l;
    }

    public static void b0(g.a aVar) {
        Y = aVar;
    }

    public static void c0(p0.a aVar) {
        X = aVar;
    }

    public c D() {
        xd.a.h(new j());
        return this;
    }

    public final d E(String str) {
        d dVar;
        Logger logger = C;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("creating transport '%s'", new Object[]{str}));
        }
        HashMap hashMap = new HashMap(this.f22283s);
        hashMap.put("EIO", String.valueOf(4));
        hashMap.put("transport", str);
        String str2 = this.f22276l;
        if (str2 != null) {
            hashMap.put("sid", str2);
        }
        d.C0393d dVar2 = this.f22281q.get(str);
        d.C0393d dVar3 = new d.C0393d();
        dVar3.f22366h = hashMap;
        dVar3.f22367i = this;
        dVar3.f22359a = dVar2 != null ? dVar2.f22359a : this.f22277m;
        dVar3.f22364f = dVar2 != null ? dVar2.f22364f : this.f22271g;
        dVar3.f22362d = dVar2 != null ? dVar2.f22362d : this.f22266b;
        dVar3.f22360b = dVar2 != null ? dVar2.f22360b : this.f22278n;
        dVar3.f22363e = dVar2 != null ? dVar2.f22363e : this.f22268d;
        dVar3.f22361c = dVar2 != null ? dVar2.f22361c : this.f22279o;
        dVar3.f22365g = dVar2 != null ? dVar2.f22365g : this.f22272h;
        dVar3.f22369k = dVar2 != null ? dVar2.f22369k : this.f22288x;
        dVar3.f22368j = dVar2 != null ? dVar2.f22368j : this.f22287w;
        dVar3.f22370l = this.f22289y;
        if (rd.c.f22474x.equals(str)) {
            dVar = new rd.c(dVar3);
        } else if (rd.a.f22425y.equals(str)) {
            dVar = new rd.b(dVar3);
        } else {
            throw new RuntimeException();
        }
        a("transport", dVar);
        return dVar;
    }

    public List<String> F(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (this.f22280p.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final void G() {
        if (this.f22290z != u.CLOSED && this.f22285u.f22345b && !this.f22269e && this.f22284t.size() != 0) {
            Logger logger = C;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("flushing %d packets in socket", new Object[]{Integer.valueOf(this.f22284t.size())}));
            }
            this.f22273i = this.f22284t.size();
            d dVar = this.f22285u;
            LinkedList<sd.b> linkedList = this.f22284t;
            dVar.t((sd.b[]) linkedList.toArray(new sd.b[linkedList.size()]));
            a(J, new Object[0]);
        }
    }

    public final ScheduledExecutorService H() {
        ScheduledExecutorService scheduledExecutorService = this.A;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.A = Executors.newSingleThreadScheduledExecutor();
        }
        return this.A;
    }

    public String I() {
        return this.f22276l;
    }

    public final void J(String str) {
        K(str, (Exception) null);
    }

    public final void K(String str, Exception exc) {
        u uVar = u.OPENING;
        u uVar2 = this.f22290z;
        if (uVar == uVar2 || u.OPEN == uVar2 || u.CLOSING == uVar2) {
            Logger logger = C;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("socket close with reason: %s", new Object[]{str}));
            }
            Future future = this.f22286v;
            if (future != null) {
                future.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.A;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.f22285u.e("close");
            this.f22285u.j();
            this.f22285u.d();
            this.f22290z = u.CLOSED;
            this.f22276l = null;
            a("close", str, exc);
            this.f22284t.clear();
            this.f22273i = 0;
        }
    }

    public final void L() {
        for (int i10 = 0; i10 < this.f22273i; i10++) {
            this.f22284t.poll();
        }
        this.f22273i = 0;
        if (this.f22284t.size() == 0) {
            a("drain", new Object[0]);
        } else {
            G();
        }
    }

    public final void M(Exception exc) {
        Logger logger = C;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("socket error %s", new Object[]{exc}));
        }
        W = false;
        a("error", exc);
        K("transport error", exc);
    }

    public final void N(b bVar) {
        a(L, bVar);
        String str = bVar.f22262a;
        this.f22276l = str;
        this.f22285u.f22347d.put("sid", str);
        this.f22282r = F(Arrays.asList(bVar.f22263b));
        this.f22274j = bVar.f22264c;
        this.f22275k = bVar.f22265d;
        P();
        if (u.CLOSED != this.f22290z) {
            O();
            f(Q, this.B);
            g(Q, this.B);
        }
    }

    public final void O() {
        Future future = this.f22286v;
        if (future != null) {
            future.cancel(false);
        }
        this.f22286v = H().schedule(new f(this), this.f22274j + this.f22275k, TimeUnit.MILLISECONDS);
    }

    public final void P() {
        Logger logger = C;
        logger.fine("socket open");
        u uVar = u.OPEN;
        this.f22290z = uVar;
        W = rd.c.f22474x.equals(this.f22285u.f22346c);
        a("open", new Object[0]);
        G();
        if (this.f22290z == uVar && this.f22267c && (this.f22285u instanceof rd.a)) {
            logger.fine("starting upgrade probes");
            for (String S2 : this.f22282r) {
                S(S2);
            }
        }
    }

    public final void Q(sd.b bVar) {
        u uVar = this.f22290z;
        if (uVar == u.OPENING || uVar == u.OPEN || uVar == u.CLOSING) {
            Logger logger = C;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("socket received: type '%s', data '%s'", new Object[]{bVar.f22956a, bVar.f22957b}));
            }
            a("packet", bVar);
            a(Q, new Object[0]);
            if ("open".equals(bVar.f22956a)) {
                try {
                    N(new b((String) bVar.f22957b));
                } catch (JSONException e10) {
                    a("error", new a((Throwable) e10));
                }
            } else if ("ping".equals(bVar.f22956a)) {
                a("ping", new Object[0]);
                xd.a.h(new e());
            } else if ("error".equals(bVar.f22956a)) {
                a aVar = new a("server error");
                aVar.P = bVar.f22957b;
                M(aVar);
            } else if ("message".equals(bVar.f22956a)) {
                a("data", bVar.f22957b);
                a("message", bVar.f22957b);
            }
        } else {
            Logger logger2 = C;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(String.format("packet received with socket readyState '%s'", new Object[]{this.f22290z}));
            }
        }
    }

    public c R() {
        xd.a.h(new l());
        return this;
    }

    public final void S(String str) {
        Logger logger = C;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("probing transport '%s'", new Object[]{str}));
        }
        d[] dVarArr = {E(str)};
        boolean[] zArr = {false};
        W = false;
        q qVar = new q(zArr, str, dVarArr, this, r12);
        r rVar = new r(zArr, r12, dVarArr);
        d[] dVarArr2 = dVarArr;
        s sVar = new s(dVarArr2, rVar, str, this);
        a aVar = new a(sVar);
        b bVar = new b(sVar);
        C0390c cVar = new C0390c(dVarArr, rVar);
        Runnable[] runnableArr = {new d(dVarArr2, qVar, sVar, aVar, this, bVar, cVar)};
        dVarArr[0].h("open", qVar);
        dVarArr[0].h("error", sVar);
        dVarArr[0].h("close", aVar);
        h("close", bVar);
        h(M, cVar);
        dVarArr[0].s();
    }

    public void T(String str) {
        U(str, (Runnable) null);
    }

    public void U(String str, Runnable runnable) {
        xd.a.h(new g(str, runnable));
    }

    public void V(byte[] bArr) {
        W(bArr, (Runnable) null);
    }

    public void W(byte[] bArr, Runnable runnable) {
        xd.a.h(new h(bArr, runnable));
    }

    public final void X(String str, Runnable runnable) {
        a0(new sd.b(str), runnable);
    }

    public final void Y(String str, String str2, Runnable runnable) {
        a0(new sd.b(str, str2), runnable);
    }

    public final void Z(String str, byte[] bArr, Runnable runnable) {
        a0(new sd.b(str, bArr), runnable);
    }

    public final void a0(sd.b bVar, Runnable runnable) {
        u uVar = u.CLOSING;
        u uVar2 = this.f22290z;
        if (uVar != uVar2 && u.CLOSED != uVar2) {
            a(P, bVar);
            this.f22284t.offer(bVar);
            if (runnable != null) {
                h(J, new i(runnable));
            }
            G();
        }
    }

    public final void d0(d dVar) {
        Logger logger = C;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.fine(String.format("setting transport %s", new Object[]{dVar.f22346c}));
        }
        if (this.f22285u != null) {
            if (logger.isLoggable(level)) {
                logger.fine(String.format("clearing existing transport %s", new Object[]{this.f22285u.f22346c}));
            }
            this.f22285u.d();
        }
        this.f22285u = dVar;
        dVar.g("drain", new p(this)).g("packet", new o(this)).g("error", new n(this)).g("close", new m(this));
    }

    public void e0(String str) {
        f0(str, (Runnable) null);
    }

    public void f0(String str, Runnable runnable) {
        U(str, runnable);
    }

    public void g0(byte[] bArr) {
        h0(bArr, (Runnable) null);
    }

    public void h0(byte[] bArr, Runnable runnable) {
        W(bArr, runnable);
    }
}

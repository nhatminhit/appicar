package rd;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import og.c0;
import og.e0;
import og.g;
import og.g0;
import og.h;
import og.j0;
import og.k0;
import og.l0;
import pd.a;
import qd.d;

public class b extends a {
    public static final Logger B;
    public static boolean C;

    public class a implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22441a;

        /* renamed from: rd.b$a$a  reason: collision with other inner class name */
        public class C0399a implements Runnable {
            public final /* synthetic */ Object[] O;

            public C0399a(Object[] objArr) {
                this.O = objArr;
            }

            public void run() {
                a.this.f22441a.a("responseHeaders", this.O[0]);
            }
        }

        public a(b bVar) {
            this.f22441a = bVar;
        }

        public void c(Object... objArr) {
            xd.a.h(new C0399a(objArr));
        }
    }

    /* renamed from: rd.b$b  reason: collision with other inner class name */
    public class C0400b implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22443a;

        public C0400b(b bVar) {
            this.f22443a = bVar;
        }

        public void c(Object... objArr) {
            this.f22443a.a("requestHeaders", objArr[0]);
        }
    }

    public class c implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f22445a;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                c.this.f22445a.run();
            }
        }

        public c(Runnable runnable) {
            this.f22445a = runnable;
        }

        public void c(Object... objArr) {
            xd.a.h(new a());
        }
    }

    public class d implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22447a;

        public class a implements Runnable {
            public final /* synthetic */ Object[] O;

            public a(Object[] objArr) {
                this.O = objArr;
            }

            public void run() {
                Exception exc;
                Object[] objArr = this.O;
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof Exception) {
                        exc = (Exception) obj;
                        qd.d unused = d.this.f22447a.p("xhr post error", exc);
                    }
                }
                exc = null;
                qd.d unused2 = d.this.f22447a.p("xhr post error", exc);
            }
        }

        public d(b bVar) {
            this.f22447a = bVar;
        }

        public void c(Object... objArr) {
            xd.a.h(new a(objArr));
        }
    }

    public class e implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22449a;

        public class a implements Runnable {
            public final /* synthetic */ Object[] O;

            public a(Object[] objArr) {
                this.O = objArr;
            }

            public void run() {
                Object[] objArr = this.O;
                e.this.f22449a.n(objArr.length > 0 ? objArr[0] : null);
            }
        }

        public e(b bVar) {
            this.f22449a = bVar;
        }

        public void c(Object... objArr) {
            xd.a.h(new a(objArr));
        }
    }

    public class f implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22451a;

        public class a implements Runnable {
            public final /* synthetic */ Object[] O;

            public a(Object[] objArr) {
                this.O = objArr;
            }

            public void run() {
                Exception exc;
                Object[] objArr = this.O;
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof Exception) {
                        exc = (Exception) obj;
                        qd.d unused = f.this.f22451a.p("xhr poll error", exc);
                    }
                }
                exc = null;
                qd.d unused2 = f.this.f22451a.p("xhr poll error", exc);
            }
        }

        public f(b bVar) {
            this.f22451a = bVar;
        }

        public void c(Object... objArr) {
            xd.a.h(new a(objArr));
        }
    }

    public static class g extends pd.a {

        /* renamed from: i  reason: collision with root package name */
        public static final String f22453i = "success";

        /* renamed from: j  reason: collision with root package name */
        public static final String f22454j = "data";

        /* renamed from: k  reason: collision with root package name */
        public static final String f22455k = "error";

        /* renamed from: l  reason: collision with root package name */
        public static final String f22456l = "requestHeaders";

        /* renamed from: m  reason: collision with root package name */
        public static final String f22457m = "responseHeaders";

        /* renamed from: n  reason: collision with root package name */
        public static final String f22458n = "text/plain;charset=UTF-8";

        /* renamed from: o  reason: collision with root package name */
        public static final e0 f22459o = e0.d(f22458n);

        /* renamed from: b  reason: collision with root package name */
        public String f22460b;

        /* renamed from: c  reason: collision with root package name */
        public String f22461c;

        /* renamed from: d  reason: collision with root package name */
        public String f22462d;

        /* renamed from: e  reason: collision with root package name */
        public g.a f22463e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, List<String>> f22464f;

        /* renamed from: g  reason: collision with root package name */
        public l0 f22465g;

        /* renamed from: h  reason: collision with root package name */
        public og.g f22466h;

        public class a implements h {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f22467a;

            public a(g gVar) {
                this.f22467a = gVar;
            }

            public void a(og.g gVar, l0 l0Var) throws IOException {
                l0 unused = this.f22467a.f22465g = l0Var;
                this.f22467a.s(l0Var.q().n());
                try {
                    if (l0Var.w()) {
                        this.f22467a.q();
                    } else {
                        this.f22467a.p(new IOException(Integer.toString(l0Var.i())));
                    }
                } finally {
                    l0Var.close();
                }
            }

            public void b(og.g gVar, IOException iOException) {
                this.f22467a.p(iOException);
            }
        }

        /* renamed from: rd.b$g$b  reason: collision with other inner class name */
        public static class C0401b {

            /* renamed from: a  reason: collision with root package name */
            public String f22469a;

            /* renamed from: b  reason: collision with root package name */
            public String f22470b;

            /* renamed from: c  reason: collision with root package name */
            public String f22471c;

            /* renamed from: d  reason: collision with root package name */
            public g.a f22472d;

            /* renamed from: e  reason: collision with root package name */
            public Map<String, List<String>> f22473e;
        }

        public g(C0401b bVar) {
            String str = bVar.f22470b;
            this.f22460b = str == null ? "GET" : str;
            this.f22461c = bVar.f22469a;
            this.f22462d = bVar.f22471c;
            g.a aVar = bVar.f22472d;
            this.f22463e = aVar == null ? new g0() : aVar;
            this.f22464f = bVar.f22473e;
        }

        public void n() {
            if (b.C) {
                b.B.fine(String.format("xhr open %s: %s", new Object[]{this.f22460b, this.f22461c}));
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Map<String, List<String>> map = this.f22464f;
            if (map != null) {
                treeMap.putAll(map);
            }
            if ("POST".equals(this.f22460b)) {
                treeMap.put("Content-type", new LinkedList(Collections.singletonList(f22458n)));
            }
            treeMap.put("Accept", new LinkedList(Collections.singletonList("*/*")));
            r(treeMap);
            if (b.C) {
                b.B.fine(String.format("sending xhr with url %s | data %s", new Object[]{this.f22461c, this.f22462d}));
            }
            j0.a aVar = new j0.a();
            for (Map.Entry entry : treeMap.entrySet()) {
                for (String a10 : (List) entry.getValue()) {
                    aVar.a((String) entry.getKey(), a10);
                }
            }
            k0 k0Var = null;
            String str = this.f22462d;
            if (str != null) {
                k0Var = k0.e(f22459o, str);
            }
            og.g a11 = this.f22463e.a(aVar.s(c0.u(this.f22461c)).j(this.f22460b, k0Var).b());
            this.f22466h = a11;
            a11.o(new a(this));
        }

        public final void o(String str) {
            a("data", str);
            t();
        }

        public final void p(Exception exc) {
            a("error", exc);
        }

        public final void q() {
            try {
                o(this.f22465g.c().A());
            } catch (IOException e10) {
                p(e10);
            }
        }

        public final void r(Map<String, List<String>> map) {
            a("requestHeaders", map);
        }

        public final void s(Map<String, List<String>> map) {
            a("responseHeaders", map);
        }

        public final void t() {
            a(f22453i, new Object[0]);
        }
    }

    static {
        Logger logger = Logger.getLogger(b.class.getName());
        B = logger;
        C = logger.isLoggable(Level.FINE);
    }

    public b(d.C0393d dVar) {
        super(dVar);
    }

    public void E() {
        B.fine("xhr poll");
        g N = N();
        N.g("data", new e(this));
        N.g("error", new f(this));
        N.n();
    }

    public void F(String str, Runnable runnable) {
        g.C0401b bVar = new g.C0401b();
        bVar.f22470b = "POST";
        bVar.f22471c = str;
        bVar.f22473e = this.f22358o;
        g O = O(bVar);
        O.g(g.f22453i, new c(runnable));
        O.g("error", new d(this));
        O.n();
    }

    public g N() {
        return O((g.C0401b) null);
    }

    public g O(g.C0401b bVar) {
        if (bVar == null) {
            bVar = new g.C0401b();
        }
        bVar.f22469a = I();
        bVar.f22472d = this.f22357n;
        bVar.f22473e = this.f22358o;
        g gVar = new g(bVar);
        gVar.g("requestHeaders", new C0400b(this)).g("responseHeaders", new a(this));
        return gVar;
    }
}

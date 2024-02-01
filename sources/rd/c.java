package rd;

import ch.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;
import og.g0;
import og.j0;
import og.l0;
import og.p0;
import og.q0;
import qd.d;
import sd.c;

public class c extends d {

    /* renamed from: x  reason: collision with root package name */
    public static final String f22474x = "websocket";

    /* renamed from: y  reason: collision with root package name */
    public static final Logger f22475y = Logger.getLogger(b.class.getName());

    /* renamed from: w  reason: collision with root package name */
    public p0 f22476w;

    public class a extends q0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22477a;

        /* renamed from: rd.c$a$a  reason: collision with other inner class name */
        public class C0402a implements Runnable {
            public final /* synthetic */ Map O;

            public C0402a(Map map) {
                this.O = map;
            }

            public void run() {
                a.this.f22477a.a("responseHeaders", this.O);
                a.this.f22477a.q();
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ String O;

            public b(String str) {
                this.O = str;
            }

            public void run() {
                a.this.f22477a.n(this.O);
            }
        }

        /* renamed from: rd.c$a$c  reason: collision with other inner class name */
        public class C0403c implements Runnable {
            public final /* synthetic */ f O;

            public C0403c(f fVar) {
                this.O = fVar;
            }

            public void run() {
                a.this.f22477a.o(this.O.Z());
            }
        }

        public class d implements Runnable {
            public d() {
            }

            public void run() {
                a.this.f22477a.m();
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ Throwable O;

            public e(Throwable th2) {
                this.O = th2;
            }

            public void run() {
                qd.d unused = a.this.f22477a.p("websocket error", (Exception) this.O);
            }
        }

        public a(c cVar) {
            this.f22477a = cVar;
        }

        public void a(p0 p0Var, int i10, String str) {
            xd.a.h(new d());
        }

        public void c(p0 p0Var, Throwable th2, l0 l0Var) {
            if (th2 instanceof Exception) {
                xd.a.h(new e(th2));
            }
        }

        public void d(p0 p0Var, f fVar) {
            if (fVar != null) {
                xd.a.h(new C0403c(fVar));
            }
        }

        public void e(p0 p0Var, String str) {
            if (str != null) {
                xd.a.h(new b(str));
            }
        }

        public void f(p0 p0Var, l0 l0Var) {
            xd.a.h(new C0402a(l0Var.q().n()));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ c O;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                c cVar = b.this.O;
                cVar.f22345b = true;
                cVar.a("drain", new Object[0]);
            }
        }

        public b(c cVar) {
            this.O = cVar;
        }

        public void run() {
            xd.a.j(new a());
        }
    }

    /* renamed from: rd.c$c  reason: collision with other inner class name */
    public class C0404c implements c.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f22479a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int[] f22480b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f22481c;

        public C0404c(c cVar, int[] iArr, Runnable runnable) {
            this.f22479a = cVar;
            this.f22480b = iArr;
            this.f22481c = runnable;
        }

        public void a(Object obj) {
            try {
                if (obj instanceof String) {
                    this.f22479a.f22476w.b((String) obj);
                } else if (obj instanceof byte[]) {
                    this.f22479a.f22476w.h(f.I((byte[]) obj));
                }
            } catch (IllegalStateException unused) {
                c.f22475y.fine("websocket closed before we could write");
            }
            int[] iArr = this.f22480b;
            int i10 = iArr[0] - 1;
            iArr[0] = i10;
            if (i10 == 0) {
                this.f22481c.run();
            }
        }
    }

    public c(d.C0393d dVar) {
        super(dVar);
        this.f22346c = f22474x;
    }

    public String C() {
        String str;
        String str2;
        Map map = this.f22347d;
        if (map == null) {
            map = new HashMap();
        }
        String str3 = this.f22348e ? "wss" : "ws";
        if (this.f22350g <= 0 || ((!"wss".equals(str3) || this.f22350g == 443) && (!"ws".equals(str3) || this.f22350g == 80))) {
            str = "";
        } else {
            str = ":" + this.f22350g;
        }
        if (this.f22349f) {
            map.put(this.f22353j, yd.a.c());
        }
        String b10 = vd.a.b(map);
        if (b10.length() > 0) {
            b10 = "?" + b10;
        }
        boolean contains = this.f22352i.contains(":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("://");
        if (contains) {
            str2 = "[" + this.f22352i + "]";
        } else {
            str2 = this.f22352i;
        }
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.f22351h);
        sb2.append(b10);
        return sb2.toString();
    }

    public void k() {
        p0 p0Var = this.f22476w;
        if (p0Var != null) {
            p0Var.f(1000, "");
            this.f22476w = null;
        }
    }

    public void l() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Map<String, List<String>> map = this.f22358o;
        if (map != null) {
            treeMap.putAll(map);
        }
        a("requestHeaders", treeMap);
        p0.a aVar = this.f22356m;
        if (aVar == null) {
            aVar = new g0();
        }
        j0.a q10 = new j0.a().q(C());
        for (Map.Entry entry : treeMap.entrySet()) {
            for (String a10 : (List) entry.getValue()) {
                q10.a((String) entry.getKey(), a10);
            }
        }
        this.f22476w = aVar.d(q10.b(), new a(this));
    }

    public void u(sd.b[] bVarArr) {
        int i10 = 0;
        this.f22345b = false;
        b bVar = new b(this);
        int[] iArr = {bVarArr.length};
        int length = bVarArr.length;
        while (i10 < length) {
            sd.b bVar2 = bVarArr[i10];
            d.e eVar = this.f22355l;
            if (eVar == d.e.OPENING || eVar == d.e.OPEN) {
                sd.c.e(bVar2, new C0404c(this, iArr, bVar));
                i10++;
            } else {
                return;
            }
        }
    }
}

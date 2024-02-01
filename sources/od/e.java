package od;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import od.c;
import od.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pd.a;

public class e extends pd.a {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f21425l = Logger.getLogger(e.class.getName());

    /* renamed from: m  reason: collision with root package name */
    public static final String f21426m = "connect";

    /* renamed from: n  reason: collision with root package name */
    public static final String f21427n = "disconnect";

    /* renamed from: o  reason: collision with root package name */
    public static final String f21428o = "connect_error";

    /* renamed from: p  reason: collision with root package name */
    public static final String f21429p = "message";

    /* renamed from: q  reason: collision with root package name */
    public static Map<String, Integer> f21430q = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f21431b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f21432c;

    /* renamed from: d  reason: collision with root package name */
    public int f21433d;

    /* renamed from: e  reason: collision with root package name */
    public String f21434e;

    /* renamed from: f  reason: collision with root package name */
    public c f21435f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f21436g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, a> f21437h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Queue<d.b> f21438i;

    /* renamed from: j  reason: collision with root package name */
    public final Queue<List<Object>> f21439j = new LinkedList();

    /* renamed from: k  reason: collision with root package name */
    public final Queue<wd.d<JSONArray>> f21440k = new LinkedList();

    public static class a extends HashMap<String, Integer> {
        public a() {
            put(e.f21426m, 1);
            put(e.f21428o, 1);
            put(e.f21427n, 1);
            put("disconnecting", 1);
            put("newListener", 1);
            put("removeListener", 1);
        }
    }

    public class b extends LinkedList<d.b> {
        public final /* synthetic */ c O;

        public class a implements a.C0385a {
            public a() {
            }

            public void c(Object... objArr) {
                e.this.O();
            }
        }

        /* renamed from: od.e$b$b  reason: collision with other inner class name */
        public class C0379b implements a.C0385a {
            public C0379b() {
            }

            public void c(Object... objArr) {
                e.this.P(objArr[0]);
            }
        }

        public class c implements a.C0385a {
            public c() {
            }

            public void c(Object... objArr) {
                if (!e.this.f21432c) {
                    pd.a unused = b.super.a(e.f21428o, objArr[0]);
                }
            }
        }

        public class d implements a.C0385a {
            public d() {
            }

            public void c(Object... objArr) {
                e.this.K(objArr.length > 0 ? objArr[0] : null);
            }
        }

        public b(c cVar) {
            this.O = cVar;
            add(d.a(cVar, "open", new a()));
            add(d.a(cVar, "packet", new C0379b()));
            add(d.a(cVar, "error", new c()));
            add(d.a(cVar, "close", new d()));
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            if (!e.this.f21432c && !e.this.f21435f.G()) {
                e.this.T();
                e.this.f21435f.N();
                if (c.l.OPEN == e.this.f21435f.f21378b) {
                    e.this.O();
                }
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ Object[] O;

        public d(Object[] objArr) {
            this.O = objArr;
        }

        public void run() {
            e.this.a("message", this.O);
        }
    }

    /* renamed from: od.e$e  reason: collision with other inner class name */
    public class C0380e implements Runnable {
        public final /* synthetic */ Object[] O;
        public final /* synthetic */ String P;

        public C0380e(Object[] objArr, String str) {
            this.O = objArr;
            this.P = str;
        }

        public void run() {
            a aVar;
            Object[] objArr = this.O;
            int length = objArr.length - 1;
            if (objArr.length <= 0 || !(objArr[length] instanceof a)) {
                aVar = null;
            } else {
                objArr = new Object[length];
                for (int i10 = 0; i10 < length; i10++) {
                    objArr[i10] = this.O[i10];
                }
                aVar = (a) this.O[length];
            }
            e.this.E(this.P, objArr, aVar);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ String O;
        public final /* synthetic */ Object[] P;
        public final /* synthetic */ a Q;

        public f(String str, Object[] objArr, a aVar) {
            this.O = str;
            this.P = objArr;
            this.Q = aVar;
        }

        public void run() {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.O);
            Object[] objArr = this.P;
            if (objArr != null) {
                for (Object put : objArr) {
                    jSONArray.put(put);
                }
            }
            wd.d dVar = new wd.d(2, jSONArray);
            if (this.Q != null) {
                e.f21425l.fine(String.format("emitting packet with ack id %d", new Object[]{Integer.valueOf(e.this.f21433d)}));
                e.this.f21437h.put(Integer.valueOf(e.this.f21433d), this.Q);
                dVar.f24039b = e.v(e.this);
            }
            if (e.this.f21432c) {
                e.this.R(dVar);
            } else {
                e.this.f21440k.add(dVar);
            }
        }
    }

    public class g implements a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f21445a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21446b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e f21447c;

        public class a implements Runnable {
            public final /* synthetic */ Object[] O;

            public a(Object[] objArr) {
                this.O = objArr;
            }

            public void run() {
                boolean[] zArr = g.this.f21445a;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (e.f21425l.isLoggable(Level.FINE)) {
                        Logger w10 = e.f21425l;
                        Object[] objArr = this.O;
                        if (objArr.length == 0) {
                            objArr = null;
                        }
                        w10.fine(String.format("sending ack %s", objArr));
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (Object put : this.O) {
                        jSONArray.put(put);
                    }
                    wd.d dVar = new wd.d(3, jSONArray);
                    g gVar = g.this;
                    dVar.f24039b = gVar.f21446b;
                    gVar.f21447c.R(dVar);
                }
            }
        }

        public g(boolean[] zArr, int i10, e eVar) {
            this.f21445a = zArr;
            this.f21446b = i10;
            this.f21447c = eVar;
        }

        public void c(Object... objArr) {
            xd.a.h(new a(objArr));
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public void run() {
            if (e.this.f21432c) {
                if (e.f21425l.isLoggable(Level.FINE)) {
                    e.f21425l.fine(String.format("performing disconnect (%s)", new Object[]{e.this.f21434e}));
                }
                e.this.R(new wd.d(1));
            }
            e.this.C();
            if (e.this.f21432c) {
                e.this.K("io client disconnect");
            }
        }
    }

    public e(c cVar, String str, c.k kVar) {
        this.f21435f = cVar;
        this.f21434e = str;
        if (kVar != null) {
            this.f21436g = kVar.f21421z;
        }
    }

    public static Object[] U(JSONArray jSONArray) {
        Object obj;
        int length = jSONArray.length();
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj2 = null;
            try {
                obj = jSONArray.get(i10);
            } catch (JSONException e10) {
                f21425l.log(Level.WARNING, "An error occured while retrieving data from JSONArray", e10);
                obj = null;
            }
            if (!JSONObject.NULL.equals(obj)) {
                obj2 = obj;
            }
            objArr[i10] = obj2;
        }
        return objArr;
    }

    public static /* synthetic */ int v(e eVar) {
        int i10 = eVar.f21433d;
        eVar.f21433d = i10 + 1;
        return i10;
    }

    public e A() {
        return Q();
    }

    public boolean B() {
        return this.f21432c;
    }

    public final void C() {
        Queue<d.b> queue = this.f21438i;
        if (queue != null) {
            for (d.b destroy : queue) {
                destroy.destroy();
            }
            this.f21438i = null;
        }
        this.f21435f.F();
    }

    public e D() {
        return z();
    }

    public pd.a E(String str, Object[] objArr, a aVar) {
        xd.a.h(new f(str, objArr, aVar));
        return this;
    }

    public final void F() {
        while (true) {
            List poll = this.f21439j.poll();
            if (poll == null) {
                break;
            }
            super.a((String) poll.get(0), poll.toArray());
        }
        this.f21439j.clear();
        while (true) {
            wd.d poll2 = this.f21440k.poll();
            if (poll2 != null) {
                R(poll2);
            } else {
                this.f21440k.clear();
                return;
            }
        }
    }

    public String G() {
        return this.f21431b;
    }

    public c H() {
        return this.f21435f;
    }

    public boolean I() {
        return this.f21438i != null;
    }

    public final void J(wd.d<JSONArray> dVar) {
        a remove = this.f21437h.remove(Integer.valueOf(dVar.f24039b));
        if (remove != null) {
            Logger logger = f21425l;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("calling ack %s with %s", new Object[]{Integer.valueOf(dVar.f24039b), dVar.f24041d}));
            }
            remove.c(U((JSONArray) dVar.f24041d));
            return;
        }
        Logger logger2 = f21425l;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(String.format("bad ack %s", new Object[]{Integer.valueOf(dVar.f24039b)}));
        }
    }

    public final void K(String str) {
        Logger logger = f21425l;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("close (%s)", new Object[]{str}));
        }
        this.f21432c = false;
        this.f21431b = null;
        super.a(f21427n, str);
    }

    public final void L(String str) {
        this.f21432c = true;
        this.f21431b = str;
        F();
        super.a(f21426m, new Object[0]);
    }

    public final void M() {
        Logger logger = f21425l;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("server disconnect (%s)", new Object[]{this.f21434e}));
        }
        C();
        K("io server disconnect");
    }

    public final void N(wd.d<JSONArray> dVar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(U((JSONArray) dVar.f24041d)));
        Logger logger = f21425l;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("emitting event %s", new Object[]{arrayList}));
        }
        if (dVar.f24039b >= 0) {
            logger.fine("attaching ack callback to event");
            arrayList.add(y(dVar.f24039b));
        }
        if (!this.f21432c) {
            this.f21439j.add(arrayList);
        } else if (!arrayList.isEmpty()) {
            super.a(arrayList.remove(0).toString(), arrayList.toArray());
        }
    }

    public final void O() {
        f21425l.fine("transport is open - connecting");
        R(this.f21436g != null ? new wd.d(0, new JSONObject(this.f21436g)) : new wd.d(0));
    }

    public final void P(wd.d<?> dVar) {
        if (this.f21434e.equals(dVar.f24040c)) {
            switch (dVar.f24038a) {
                case 0:
                    T t10 = dVar.f24041d;
                    if (!(t10 instanceof JSONObject) || !((JSONObject) t10).has("sid")) {
                        super.a(f21428o, new f("It seems you are trying to reach a Socket.IO server in v2.x with a v3.x client, which is not possible"));
                        return;
                    }
                    try {
                        L(((JSONObject) dVar.f24041d).getString("sid"));
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                case 1:
                    M();
                    return;
                case 2:
                case 5:
                    N(dVar);
                    return;
                case 3:
                case 6:
                    J(dVar);
                    return;
                case 4:
                    super.a(f21428o, dVar.f24041d);
                    return;
                default:
                    return;
            }
        }
    }

    public e Q() {
        xd.a.h(new c());
        return this;
    }

    public final void R(wd.d dVar) {
        dVar.f24040c = this.f21434e;
        this.f21435f.P(dVar);
    }

    public e S(Object... objArr) {
        xd.a.h(new d(objArr));
        return this;
    }

    public final void T() {
        if (this.f21438i == null) {
            this.f21438i = new b(this.f21435f);
        }
    }

    public pd.a a(String str, Object... objArr) {
        if (!f21430q.containsKey(str)) {
            xd.a.h(new C0380e(objArr, str));
            return this;
        }
        throw new RuntimeException("'" + str + "' is a reserved event name");
    }

    public final a y(int i10) {
        return new g(new boolean[]{false}, i10, this);
    }

    public e z() {
        xd.a.h(new h());
        return this;
    }
}

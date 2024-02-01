package kj;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Date;
import li.p;
import org.json.JSONException;
import org.json.JSONObject;
import qj.a;
import sj.i;
import t7.t;

public class a implements li.a {
    public static final String T = "SocketController";
    public static a U;
    public String O = "";
    public Context P;
    public g Q;
    public f R;
    public sj.d S = new sj.d();

    /* renamed from: kj.a$a  reason: collision with other inner class name */
    public class C0350a implements pc.b {
        public C0350a() {
        }

        public <T> void a(T t10) {
            if (a.this.R != null) {
                try {
                    a.this.R.l(((JSONObject) t10).getString("message"));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public class b implements pc.b {
        public b() {
        }

        public <T> void a(T t10) {
            try {
                JSONObject jSONObject = (JSONObject) t10;
                if (a.this.R != null) {
                    a.this.R.d(jSONObject.getString("title"), jSONObject.getString(t.f13205o));
                }
            } catch (JSONException unused) {
            }
        }
    }

    public class c implements pc.b {
        public c() {
        }

        public <T> void a(T t10) {
            try {
                JSONObject jSONObject = (JSONObject) t10;
                if (a.this.R != null) {
                    a.this.R.h(jSONObject.getString("title"), jSONObject.getString(t.f13205o), jSONObject.getLong("during"));
                }
            } catch (JSONException unused) {
            }
        }
    }

    public class d implements pc.b {
        public d() {
        }

        public <T> void a(T t10) {
            yi.b bVar = (yi.b) a.this.S.b(((JSONObject) t10).toString(), yi.b.class);
            if (bVar.c().intValue() == 200 && a.this.Q != null) {
                a.this.Q.j(bVar);
            }
        }
    }

    public class e implements pc.b {
        public e() {
        }

        public <T> void a(T t10) {
            yi.b bVar = (yi.b) a.this.S.b(((JSONObject) t10).toString(), yi.b.class);
            if (bVar.c().intValue() == 200 && a.this.Q != null) {
                a.this.Q.j(bVar);
            }
        }
    }

    public interface f {
        void a();

        void d(String str, String str2);

        void h(String str, String str2, long j10);

        void l(String str);
    }

    public interface g {
        void j(yi.b bVar);
    }

    @SuppressLint({"SimpleDateFormat"})
    public a(Context context) {
        this.P = context;
        if (!new di.a(context).q().equals("")) {
            p.A().B(context, pi.b.f22098b, (ci.e) null);
            p.A().V(this);
            p.A().x();
        }
    }

    public static a j(Context context) {
        if (U == null) {
            U = new a(context);
        }
        return U;
    }

    public void B() {
    }

    public void O(String str) {
        this.O = str;
        p A = p.A();
        A.v("remote-" + str, new C0350a());
        p.A().v("dialogue", new b());
        p.A().v("notification", new c());
    }

    public void a() {
        f fVar = this.R;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void d() {
    }

    public void e() {
    }

    public void g() {
        U = null;
    }

    public void h(wi.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(new sj.d().a(bVar));
            p A = p.A();
            A.v("youtube-search-cache-" + this.O, new d());
            p.A().z("youtube-search-cache", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void i(wi.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject(new sj.d().a(cVar));
            p A = p.A();
            A.v("youtube-suggest-cache-" + this.O, new e());
            p.A().z("youtube-suggest-cache", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void k(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("name", "icare");
            jSONObject2.put(j3.c.Y, i.r(this.P).c());
            jSONObject2.put("message", jSONObject);
            jSONObject2.put("time", new Date().getTime());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        p.A().z("remote-response", jSONObject2);
    }

    public void l(a.C0395a aVar) {
        try {
            p.A().z("remote-response", new JSONObject(new sj.d().a(new qj.a((double) new Date().getTime(), "icare", i.r(this.P).c(), aVar))));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public <T> void m(T t10) {
    }

    public void n(ci.b bVar) {
    }

    public void o(g gVar) {
        this.Q = gVar;
    }

    public void p(f fVar) {
        this.R = fVar;
    }

    public void z(String str, long j10) {
    }
}

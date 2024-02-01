package ei;

import android.content.Context;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public f f18695a;

    public class a implements d<ci.a> {
        public a() {
        }

        public void a(b<ci.a> bVar, u<ci.a> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                g.this.f18695a.k(uVar.a(), uVar.b(), str, (JSONObject) null);
            } else if (uVar.b() == 400) {
                try {
                    JSONObject jSONObject = new JSONObject(uVar.e().A());
                    g.this.f18695a.k((ci.a) null, uVar.b(), jSONObject.getString("message"), jSONObject);
                } catch (Exception unused) {
                }
            } else {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().getMessage();
                }
                g.this.f18695a.k((ci.a) null, uVar.b(), str, (JSONObject) null);
            }
        }

        public void b(b<ci.a> bVar, Throwable th2) {
            g.this.f18695a.k((ci.a) null, 600, "Không nhận dược phản hồi từ hệ thống", (JSONObject) null);
        }
    }

    public g(f fVar) {
        this.f18695a = fVar;
    }

    public void a(b bVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).g(bVar).l(new a());
    }
}

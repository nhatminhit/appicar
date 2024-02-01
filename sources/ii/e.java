package ii;

import android.content.Context;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public d f19816a;

    public class a implements d<ci.a> {
        public a() {
        }

        public void a(b<ci.a> bVar, u<ci.a> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                e.this.f19816a.N(uVar.a(), uVar.b(), str, (JSONObject) null);
            } else if (uVar.b() == 400) {
                try {
                    JSONObject jSONObject = new JSONObject(uVar.e().A());
                    e.this.f19816a.N((ci.a) null, uVar.b(), jSONObject.getString("message"), jSONObject);
                } catch (Exception unused) {
                }
            } else {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().getMessage();
                }
                e.this.f19816a.N((ci.a) null, uVar.b(), str, (JSONObject) null);
            }
        }

        public void b(b<ci.a> bVar, Throwable th2) {
            e.this.f19816a.N((ci.a) null, 600, "Không nhận dược phản hồi từ hệ thống", (JSONObject) null);
        }
    }

    public e(d dVar) {
        this.f19816a = dVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).b(aVar).l(new a());
    }
}

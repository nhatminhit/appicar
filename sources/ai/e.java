package ai;

import android.content.Context;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public c f16146a;

    public class a implements d<b> {
        public a() {
        }

        public void a(b<b> bVar, u<b> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                e.this.f16146a.o(uVar.a(), uVar.b(), str, (JSONObject) null);
                return;
            }
            try {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().b();
                }
                e.this.f16146a.o((b) null, uVar.b(), str, (JSONObject) null);
            } catch (Exception unused) {
            }
        }

        public void b(b<b> bVar, Throwable th2) {
            e.this.f16146a.o((b) null, 600, "Không nhận dược phản hồi từ hệ thống", (JSONObject) null);
        }
    }

    public e(c cVar) {
        this.f16146a = cVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).e(aVar).l(new a());
    }
}

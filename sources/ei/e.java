package ei;

import android.content.Context;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public d f18693a;

    public class a implements d<ci.a> {
        public a() {
        }

        public void a(b<ci.a> bVar, u<ci.a> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                e.this.f18693a.x(uVar.a(), uVar.b(), str);
                return;
            }
            try {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().getMessage();
                }
                e.this.f18693a.x((ci.a) null, uVar.b(), str);
            } catch (Exception unused) {
            }
        }

        public void b(b<ci.a> bVar, Throwable th2) {
            e.this.f18693a.x((ci.a) null, 600, "Không nhận dược phản hồi từ hệ thống");
        }
    }

    public e(d dVar) {
        this.f18693a = dVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).f(aVar).l(new a());
    }
}

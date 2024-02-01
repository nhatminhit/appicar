package ii;

import android.content.Context;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public f f19820a;

    public class a implements d<ci.a> {
        public a() {
        }

        public void a(b<ci.a> bVar, u<ci.a> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                h.this.f19820a.D(uVar.a(), uVar.b(), str);
                return;
            }
            try {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().getMessage();
                }
                h.this.f19820a.D((ci.a) null, uVar.b(), str);
            } catch (Exception unused) {
            }
        }

        public void b(b<ci.a> bVar, Throwable th2) {
            h.this.f19820a.D((ci.a) null, 600, "Không nhận dược phản hồi từ hệ thống");
        }
    }

    public h(f fVar) {
        this.f19820a = fVar;
    }

    public void a(c cVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).k(cVar).l(new a());
    }
}

package ai;

import android.content.Context;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import rh.b;
import rh.u;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public c f16144a;

    public class a implements rh.d<b> {
        public a() {
        }

        public void a(b<b> bVar, u<b> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                d.this.f16144a.o(uVar.a(), uVar.b(), str, (JSONObject) null);
            } else if (uVar.b() == 403) {
                try {
                    d.this.f16144a.o((b) null, uVar.b(), str, new JSONObject(uVar.e().A()));
                } catch (IOException | JSONException e10) {
                    e10.printStackTrace();
                }
            } else if (uVar.b() == 400) {
                d.this.f16144a.o((b) null, uVar.b(), "Tài khoản hoặc mật khẩu không chính xác", (JSONObject) null);
            } else {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str = uVar.a().b();
                    }
                    d.this.f16144a.o((b) null, uVar.b(), str, (JSONObject) null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(b<b> bVar, Throwable th2) {
            d.this.f16144a.o((b) null, 600, "Không nhận dược phản hồi từ hệ thống", (JSONObject) null);
        }
    }

    public d(c cVar) {
        this.f16144a = cVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).c(aVar).l(new a());
    }
}

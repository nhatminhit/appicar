package bi;

import ai.c;
import android.content.Context;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import rh.d;
import rh.u;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public c f16342a;

    public class a implements d<ai.b> {
        public a() {
        }

        public void a(rh.b<ai.b> bVar, u<ai.b> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                b.this.f16342a.o(uVar.a(), uVar.b(), str, (JSONObject) null);
            } else if (uVar.b() == 403) {
                try {
                    b.this.f16342a.o((ai.b) null, uVar.b(), str, new JSONObject(uVar.e().A()));
                } catch (IOException | JSONException e10) {
                    e10.printStackTrace();
                }
            } else {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str = uVar.a().b();
                    }
                    b.this.f16342a.o((ai.b) null, uVar.b(), str, (JSONObject) null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(rh.b<ai.b> bVar, Throwable th2) {
            b.this.f16342a.o((ai.b) null, 600, "Không nhận dược phản hồi từ hệ thống", (JSONObject) null);
        }
    }

    public b(c cVar) {
        this.f16342a = cVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).i(aVar).l(new a());
    }
}

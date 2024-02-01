package wi;

import android.content.Context;
import org.json.JSONObject;
import pi.c;
import rh.d;
import rh.u;
import yi.b;

public class e {

    /* renamed from: b  reason: collision with root package name */
    public static final String f24305b = "MarkErrorVideoRepository";

    /* renamed from: a  reason: collision with root package name */
    public d f24306a;

    public class a implements d<b> {
        public a() {
        }

        public void a(rh.b<b> bVar, u<b> uVar) {
            d dVar;
            b bVar2;
            String str = "";
            if (uVar.b() == 200) {
                dVar = e.this.f24306a;
                bVar2 = uVar.a();
            } else {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str = uVar.a().b();
                    }
                    ad.d.c(e.f24305b, uVar.b() + "/" + str);
                } catch (Exception e10) {
                    ad.d.c(e.f24305b, e10.getMessage());
                }
                dVar = e.this.f24306a;
                bVar2 = null;
            }
            dVar.a(bVar2, uVar.b(), str);
        }

        public void b(rh.b<b> bVar, Throwable th2) {
        }
    }

    public e(d dVar) {
        this.f24306a = dVar;
    }

    public void a(a aVar, Context context, Context context2) {
        ((c) jc.b.b(context, pi.b.f22097a, c.class)).k(aVar).l(new a());
    }
}

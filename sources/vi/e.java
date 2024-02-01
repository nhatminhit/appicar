package vi;

import android.content.Context;
import org.json.JSONObject;
import pi.c;
import rh.b;
import rh.d;
import rh.u;

public class e {

    /* renamed from: b  reason: collision with root package name */
    public static final String f23685b = "MarkErrorTvRepository";

    /* renamed from: a  reason: collision with root package name */
    public d f23686a;

    public class a implements d<c> {
        public a() {
        }

        public void a(b<c> bVar, u<c> uVar) {
            d dVar;
            c cVar;
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                dVar = e.this.f23686a;
                cVar = uVar.a();
            } else {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        dVar = e.this.f23686a;
                        cVar = null;
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(e.f23685b, e10.getMessage());
                }
                dVar = e.this.f23686a;
                cVar = null;
            }
            dVar.a(cVar, uVar.b(), str2);
        }

        public void b(b<c> bVar, Throwable th2) {
        }
    }

    public e(d dVar) {
        this.f23686a = dVar;
    }

    public void a(b bVar, Context context) {
        ((c) jc.b.b(context, pi.b.f22097a, c.class)).e(bVar).l(new a());
    }
}

package ri;

import android.annotation.SuppressLint;
import android.content.Context;
import pi.c;
import rh.b;
import rh.d;
import rh.u;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public e f22772a;

    public class a implements d<d> {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ boolean f22773b = false;

        public a() {
        }

        @SuppressLint({"SetTextI18n"})
        public void a(b<d> bVar, u<d> uVar) {
            if (uVar.b() == 200) {
                d a10 = uVar.a();
                if (f.this.f22772a != null) {
                    f.this.f22772a.a(a10, uVar.b());
                }
            }
        }

        public void b(b<d> bVar, Throwable th2) {
        }
    }

    public f(e eVar) {
        this.f22772a = eVar;
    }

    public void b(Context context) {
        ((c) jc.b.b(context, pi.b.f22097a, c.class)).a().l(new a());
    }
}

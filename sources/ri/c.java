package ri;

import android.annotation.SuppressLint;
import android.content.Context;
import rh.b;
import rh.d;
import rh.u;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public b f22762a;

    public class a implements d<i> {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ boolean f22763b = false;

        public a() {
        }

        @SuppressLint({"SetTextI18n"})
        public void a(b<i> bVar, u<i> uVar) {
            if (uVar.b() == 200) {
                i a10 = uVar.a();
                if (c.this.f22762a != null) {
                    c.this.f22762a.a(a10, uVar.b());
                }
            }
        }

        public void b(b<i> bVar, Throwable th2) {
        }
    }

    public c(b bVar) {
        this.f22762a = bVar;
    }

    public void b(Context context) {
        ((pi.c) jc.b.b(context, pi.b.f22099c, pi.c.class)).f(context.getPackageName()).l(new a());
    }
}

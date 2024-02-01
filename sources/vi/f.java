package vi;

import android.content.Context;
import android.os.Handler;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import jc.b;
import org.json.JSONObject;
import pi.c;
import rh.u;
import sj.d;
import sj.i;
import sj.k;

public class f {

    /* renamed from: f  reason: collision with root package name */
    public static final String f23688f = "RadioRepository";

    /* renamed from: a  reason: collision with root package name */
    public g f23689a;

    /* renamed from: b  reason: collision with root package name */
    public d f23690b = new d();

    /* renamed from: c  reason: collision with root package name */
    public long f23691c;

    /* renamed from: d  reason: collision with root package name */
    public int f23692d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f23693e = 0;

    public class a implements rh.d<c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23694a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f23695b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f23696c;

        /* renamed from: vi.f$a$a  reason: collision with other inner class name */
        public class C0468a implements ErrorDialog.a {
            public C0468a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                f.this.f(aVar.f23695b, aVar.f23694a, aVar.f23696c);
            }

            public void v(ErrorDialog errorDialog) {
                errorDialog.dismiss();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            public void run() {
                a aVar = a.this;
                f.this.f(aVar.f23695b, aVar.f23694a, aVar.f23696c);
            }
        }

        public a(Context context, a aVar, Context context2) {
            this.f23694a = context;
            this.f23695b = aVar;
            this.f23696c = context2;
        }

        public void a(rh.b<c> bVar, u<c> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                f.this.f23689a.k(uVar.a(), uVar.b(), str2);
                i.r(this.f23694a).F0(f.this.f23690b.a(uVar.a()));
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f23694a, str2);
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(f.f23688f, e10.getMessage());
                }
                k.m(this.f23694a, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    f.this.f23689a.k((c) null, uVar.b(), str2);
                    ad.d.c(f.f23688f, uVar.b() + "/" + str2);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = f.this.f23692d = 0;
            int unused3 = f.this.f23693e = 0;
        }

        public void b(rh.b<c> bVar, Throwable th2) {
            ad.d.c(f.f23688f, "onFailure: " + th2.getMessage());
            k.l(this.f23694a, "Không nhận dược phản hồi từ hệ thống", new C0468a(), false);
            f.this.e();
            new Handler().postDelayed(new b(), f.this.f23691c);
        }
    }

    public f(g gVar) {
        this.f23689a = gVar;
    }

    public final void e() {
        long j10;
        int i10 = this.f23692d;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f23692d = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f23693e + 1;
            this.f23693e = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f23691c = j10;
        if (this.f23691c > 40000) {
            this.f23691c = 40000;
        }
    }

    public void f(a aVar, Context context, Context context2) {
        ((c) b.b(context, pi.b.f22097a, c.class)).l(aVar).l(new a(context, aVar, context2));
    }
}

package xi;

import android.content.Context;
import android.os.Handler;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import h0.u0;
import jc.b;
import org.json.JSONObject;
import rh.u;
import sj.d;
import sj.i;
import sj.k;

public class c {

    /* renamed from: f  reason: collision with root package name */
    public static final String f24598f = "ChannelListRepository";

    /* renamed from: a  reason: collision with root package name */
    public b f24599a;

    /* renamed from: b  reason: collision with root package name */
    public d f24600b = new d();

    /* renamed from: c  reason: collision with root package name */
    public long f24601c;

    /* renamed from: d  reason: collision with root package name */
    public int f24602d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f24603e = 0;

    public class a implements rh.d<a> {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ boolean f24604d = false;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24605a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ vi.a f24606b;

        /* renamed from: xi.c$a$a  reason: collision with other inner class name */
        public class C0491a implements ErrorDialog.a {
            public C0491a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                c.this.f(aVar.f24606b, aVar.f24605a);
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
                c.this.f(aVar.f24606b, aVar.f24605a);
            }
        }

        public a(Context context, vi.a aVar) {
            this.f24605a = context;
            this.f24606b = aVar;
        }

        public void a(rh.b<a> bVar, u<a> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                c.this.f24599a.i(uVar.a(), uVar.b(), str2);
                i.r(this.f24605a).A0(c.this.f24600b.a(uVar.a()));
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f24605a, str2);
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(c.f24598f, e10.getMessage());
                }
                k.m(this.f24605a, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    c.this.f24599a.i((a) null, uVar.b(), str2);
                    ad.d.c(c.f24598f, uVar.b() + "/" + str2);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = c.this.f24602d = 0;
            int unused3 = c.this.f24603e = 0;
        }

        public void b(rh.b<a> bVar, Throwable th2) {
            ad.d.c(c.f24598f, "onFailure: " + th2.getMessage());
            k.l(this.f24605a, "Không nhận dược phản hồi từ hệ thống", new C0491a(), false);
            c.this.e();
            new Handler().postDelayed(new b(), c.this.f24601c);
        }
    }

    public c(b bVar) {
        this.f24599a = bVar;
    }

    public final void e() {
        long j10;
        int i10 = this.f24602d;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f24602d = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f24603e + 1;
            this.f24603e = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f24601c = j10;
        if (this.f24601c > 40000) {
            this.f24601c = 40000;
        }
    }

    public void f(vi.a aVar, Context context) {
        ad.d.c(f24598f, u0.f8524n0);
        ((pi.c) b.b(context, pi.b.f22097a, pi.c.class)).d(aVar).l(new a(context, aVar));
    }
}

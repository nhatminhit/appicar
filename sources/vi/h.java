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

public class h {

    /* renamed from: f  reason: collision with root package name */
    public static final String f23698f = "TvRepository";

    /* renamed from: a  reason: collision with root package name */
    public g f23699a;

    /* renamed from: b  reason: collision with root package name */
    public d f23700b = new d();

    /* renamed from: c  reason: collision with root package name */
    public long f23701c;

    /* renamed from: d  reason: collision with root package name */
    public int f23702d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f23703e = 0;

    public class a implements rh.d<c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23704a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f23705b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f23706c;

        /* renamed from: vi.h$a$a  reason: collision with other inner class name */
        public class C0469a implements ErrorDialog.a {
            public C0469a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                h.this.f(aVar.f23705b, aVar.f23704a, aVar.f23706c);
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
                h.this.f(aVar.f23705b, aVar.f23704a, aVar.f23706c);
            }
        }

        public a(Context context, a aVar, Context context2) {
            this.f23704a = context;
            this.f23705b = aVar;
            this.f23706c = context2;
        }

        public void a(rh.b<c> bVar, u<c> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                h.this.f23699a.k(uVar.a(), uVar.b(), str2);
                i.r(this.f23704a).I0(h.this.f23700b.a(uVar.a()));
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f23704a, str2);
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(h.f23698f, e10.getMessage());
                }
                k.m(this.f23704a, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    h.this.f23699a.k((c) null, uVar.b(), str2);
                    ad.d.c(h.f23698f, uVar.b() + "/" + str2);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = h.this.f23702d = 0;
            int unused3 = h.this.f23703e = 0;
        }

        public void b(rh.b<c> bVar, Throwable th2) {
            ad.d.c(h.f23698f, "onFailure: " + th2.getMessage());
            k.l(this.f23704a, "Không nhận dược phản hồi từ hệ thống", new C0469a(), false);
            h.this.e();
            new Handler().postDelayed(new b(), h.this.f23701c);
        }
    }

    public h(g gVar) {
        this.f23699a = gVar;
    }

    public final void e() {
        long j10;
        int i10 = this.f23702d;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f23702d = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f23703e + 1;
            this.f23703e = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f23701c = j10;
        if (this.f23701c > 40000) {
            this.f23701c = 40000;
        }
    }

    public void f(a aVar, Context context, Context context2) {
        ((c) b.b(context, pi.b.f22097a, c.class)).c(aVar).l(new a(context, aVar, context2));
    }
}

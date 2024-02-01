package yi;

import aj.a;
import android.content.Context;
import android.os.Handler;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import jc.b;
import org.json.JSONObject;
import pi.c;
import rh.u;
import sj.i;
import sj.k;

public class d {

    /* renamed from: f  reason: collision with root package name */
    public static final String f24860f = "VideoRepository";

    /* renamed from: a  reason: collision with root package name */
    public c f24861a;

    /* renamed from: b  reason: collision with root package name */
    public sj.d f24862b = new sj.d();

    /* renamed from: c  reason: collision with root package name */
    public long f24863c;

    /* renamed from: d  reason: collision with root package name */
    public int f24864d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f24865e = 0;

    public class a implements rh.d<b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24866a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f24867b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f24868c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f24869d;

        /* renamed from: yi.d$a$a  reason: collision with other inner class name */
        public class C0495a implements ErrorDialog.a {
            public C0495a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                d.this.g(aVar.f24868c, aVar.f24867b, aVar.f24869d, aVar.f24866a);
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
                d.this.g(aVar.f24868c, aVar.f24867b, aVar.f24869d, aVar.f24866a);
            }
        }

        public a(String str, Context context, a aVar, Context context2) {
            this.f24866a = str;
            this.f24867b = context;
            this.f24868c = aVar;
            this.f24869d = context2;
        }

        public void a(rh.b<b> bVar, u<b> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                d.this.f24861a.m(uVar.a(), uVar.b(), str2, this.f24866a);
                d.this.h(uVar.a(), this.f24867b, this.f24866a);
            } else if (200 < uVar.b() && uVar.b() < 300) {
                try {
                    d.this.f24861a.m((b) null, uVar.b(), uVar.a().b(), this.f24866a);
                } catch (Exception e10) {
                    ad.d.c(d.f24860f, e10.getMessage());
                }
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f24867b, str2);
                    }
                    str2 = str;
                } catch (Exception e11) {
                    ad.d.c(d.f24860f, e11.getMessage());
                }
                k.m(this.f24867b, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    d.this.f24861a.m((b) null, uVar.b(), str2, this.f24866a);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = d.this.f24864d = 0;
            int unused3 = d.this.f24865e = 0;
        }

        public void b(rh.b<b> bVar, Throwable th2) {
            k.l(this.f24867b, "Không nhận dược phản hồi từ hệ thống", new C0495a(), false);
            d.this.f();
            new Handler().postDelayed(new b(), d.this.f24863c);
        }
    }

    public d(c cVar) {
        this.f24861a = cVar;
    }

    public final void f() {
        long j10;
        int i10 = this.f24864d;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f24864d = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f24865e + 1;
            this.f24865e = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f24863c = j10;
        if (this.f24863c > 40000) {
            this.f24863c = 40000;
        }
    }

    public void g(a aVar, Context context, Context context2, String str) {
        ((c) b.b(context, pi.b.f22097a, c.class)).b(aVar).l(new a(str, context, aVar, context2));
    }

    public final void h(b bVar, Context context, String str) {
        String str2 = ui.a.b().f23398a;
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 98260:
                if (str2.equals(a.e.f16178j)) {
                    c10 = 0;
                    break;
                }
                break;
            case 106182:
                if (str2.equals(a.e.f16177i)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3377875:
                if (str2.equals(a.e.f16176h)) {
                    c10 = 2;
                    break;
                }
                break;
            case 109770997:
                if (str2.equals(a.e.f16174f)) {
                    c10 = 3;
                    break;
                }
                break;
            case 926934164:
                if (str2.equals(a.e.f16175g)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1359515147:
                if (str2.equals(a.e.f16173e)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i.r(context).B0(this.f24862b.a(bVar));
                return;
            case 1:
                i.r(context).D0(this.f24862b.a(bVar));
                return;
            case 2:
                i.r(context).E0(this.f24862b.a(bVar));
                return;
            case 3:
                i.r(context).H0(this.f24862b.a(bVar));
                return;
            case 4:
                i.r(context).C0(this.f24862b.a(bVar));
                return;
            case 5:
                i.r(context).G0(this.f24862b.a(bVar));
                return;
            default:
                return;
        }
    }
}

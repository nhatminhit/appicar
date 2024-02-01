package fi;

import android.content.Context;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import d.m0;
import org.json.JSONObject;
import rh.d;
import rh.u;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f18928b = "RefreshTokenRepository";

    /* renamed from: a  reason: collision with root package name */
    public c f18929a;

    public class a implements d<ci.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ di.a f18930a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f18931b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f18932c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f18933d;

        /* renamed from: fi.b$a$a  reason: collision with other inner class name */
        public class C0307a implements ErrorDialog.a {
            public final /* synthetic */ u O;

            public C0307a(u uVar) {
                this.O = uVar;
            }

            public void l(ErrorDialog errorDialog) {
                b.this.f18929a.y(false, this.O.b());
            }

            public void v(ErrorDialog errorDialog) {
            }
        }

        /* renamed from: fi.b$a$b  reason: collision with other inner class name */
        public class C0308b implements ErrorDialog.a {
            public C0308b() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                b.this.a(aVar.f18932c, aVar.f18931b, aVar.f18933d);
            }

            public void v(ErrorDialog errorDialog) {
            }
        }

        public a(di.a aVar, Context context, a aVar2, String str) {
            this.f18930a = aVar;
            this.f18931b = context;
            this.f18932c = aVar2;
            this.f18933d = str;
        }

        public void a(@m0 rh.b<ci.d> bVar, @m0 u<ci.d> uVar) {
            c cVar;
            boolean z10 = false;
            if (uVar.b() == 200) {
                ci.d a10 = uVar.a();
                this.f18930a.H(a10.getData().get(0).getAccessToken());
                this.f18930a.B(a10.getData().get(0).getRefreshToken());
                this.f18930a.D(a10.getData().get(0).getSub());
                this.f18930a.I(a10.getData().get(0).getUserId());
                this.f18930a.G(a10.getData().get(0).getExp().longValue());
                cVar = b.this.f18929a;
                z10 = true;
            } else {
                ad.d.c(b.f18928b, uVar.b() + " RefreshToken: " + this.f18930a.j() + "//token: " + this.f18930a.q());
                gi.a c10 = gi.a.c(this.f18931b);
                c10.b("RefreshTokenRepository//" + uVar.b() + " RefreshToken: " + this.f18930a.j() + "//token: " + this.f18930a.q());
                if (uVar.b() == 401) {
                    String str = "";
                    try {
                        if (uVar.e() != null) {
                            str = new JSONObject(uVar.e().A()).getString("message");
                        } else if (uVar.a() != null) {
                            str = uVar.a().getMessage();
                        }
                    } catch (Exception unused) {
                    }
                    new ErrorDialog(this.f18931b, new C0307a(uVar)).m("Thông báo").l("Ok").k(str).n(false).show();
                    return;
                }
                cVar = b.this.f18929a;
            }
            cVar.y(z10, uVar.b());
        }

        public void b(@m0 rh.b<ci.d> bVar, @m0 Throwable th2) {
            ad.d.e(b.f18928b, "onFailure" + th2.getMessage());
            new ErrorDialog(this.f18931b, new C0308b()).k("Không nhận dược phản hồi từ hệ thống").n(false).show();
        }
    }

    public b(c cVar) {
        this.f18929a = cVar;
    }

    public void a(a aVar, Context context, String str) {
        ((zh.a) jc.b.b(context, str, zh.a.class)).j(aVar).l(new a(new di.a(context), context, aVar, str));
    }
}

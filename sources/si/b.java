package si;

import android.content.Context;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import org.json.JSONObject;
import pi.c;
import rh.d;
import rh.u;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f23026b = "LogoutRepository";

    /* renamed from: a  reason: collision with root package name */
    public a f23027a;

    public class a implements d<qi.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23028a;

        /* renamed from: si.b$a$a  reason: collision with other inner class name */
        public class C0423a implements ErrorDialog.a {
            public C0423a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                b.this.a(aVar.f23028a);
            }

            public void v(ErrorDialog errorDialog) {
            }
        }

        public a(Context context) {
            this.f23028a = context;
        }

        public void a(rh.b<qi.a> bVar, u<qi.a> uVar) {
            a aVar;
            qi.a aVar2;
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                aVar = b.this.f23027a;
                aVar2 = uVar.a();
            } else if (uVar.b() == 401) {
                b.this.f23027a.a(uVar.a(), 200, str2);
                return;
            } else {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        aVar = b.this.f23027a;
                        aVar2 = null;
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(b.f23026b, e10.getMessage());
                }
                aVar = b.this.f23027a;
                aVar2 = null;
            }
            aVar.a(aVar2, uVar.b(), str2);
        }

        public void b(rh.b<qi.a> bVar, Throwable th2) {
            new ErrorDialog(this.f23028a, new C0423a()).k("Không nhận dược phản hồi từ hệ thống").n(false).show();
        }
    }

    public b(a aVar) {
        this.f23027a = aVar;
    }

    public void a(Context context) {
        ((c) jc.b.b(context, pi.b.f22097a, c.class)).i().l(new a(context));
    }
}

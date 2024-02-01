package ri;

import android.content.Context;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import org.json.JSONObject;
import rh.b;
import rh.d;
import rh.u;
import sj.i;

public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final String f22775b = "MigrateRepository";

    /* renamed from: a  reason: collision with root package name */
    public g f22776a;

    public class a implements d<qi.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22777a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f22778b;

        /* renamed from: ri.h$a$a  reason: collision with other inner class name */
        public class C0418a implements ErrorDialog.a {
            public C0418a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                h.this.a(aVar.f22778b, aVar.f22777a);
            }

            public void v(ErrorDialog errorDialog) {
            }
        }

        public a(Context context, a aVar) {
            this.f22777a = context;
            this.f22778b = aVar;
        }

        public void a(b<qi.a> bVar, u<qi.a> uVar) {
            String str = "";
            if (uVar.b() == 200) {
                h.this.f22776a.K(uVar.a(), uVar.b(), str);
                return;
            }
            try {
                if (uVar.e() != null) {
                    str = new JSONObject(uVar.e().A()).getString("message");
                } else if (uVar.a() != null) {
                    str = uVar.a().b();
                }
                h.this.f22776a.K((qi.a) null, uVar.b(), str);
                ad.d.c(h.f22775b, uVar.b() + "/" + str);
            } catch (Exception unused) {
            }
        }

        public void b(b<qi.a> bVar, Throwable th2) {
            ad.d.c(h.f22775b, "onFailure: " + th2.getMessage());
            new ErrorDialog(this.f22777a, new C0418a()).k("Không nhận dược phản hồi từ hệ thống").n(false).show();
        }
    }

    public h(g gVar) {
        this.f22776a = gVar;
    }

    public void a(a aVar, Context context) {
        pi.b.a(pi.b.f22097a).j(aVar, i.r(context).s()).l(new a(context, aVar));
    }
}

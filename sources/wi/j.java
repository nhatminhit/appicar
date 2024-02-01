package wi;

import android.content.Context;
import android.os.Handler;
import android.util.Base64;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import h0.u0;
import ha.e;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import pi.b;
import qc.c;
import rh.d;
import rh.u;
import sj.k;

public class j {

    /* renamed from: e  reason: collision with root package name */
    public static final String f24322e = "RegexRepository";

    /* renamed from: a  reason: collision with root package name */
    public g f24323a;

    /* renamed from: b  reason: collision with root package name */
    public long f24324b;

    /* renamed from: c  reason: collision with root package name */
    public int f24325c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f24326d = 0;

    public class a implements d<qi.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24327a;

        /* renamed from: wi.j$a$a  reason: collision with other inner class name */
        public class C0483a implements ErrorDialog.a {
            public C0483a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                j.this.h(aVar.f24327a);
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
                j.this.h(aVar.f24327a);
            }
        }

        public a(Context context) {
            this.f24327a = context;
        }

        public void a(rh.b<qi.a> bVar, u<qi.a> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                byte[] decode = Base64.decode(uVar.a().a().get(0).toString(), 0);
                try {
                    j.this.f24323a.A((f) new e().m(new String(decode, "UTF-8"), f.class), uVar.b(), str2);
                } catch (UnsupportedEncodingException e10) {
                    e10.printStackTrace();
                }
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f24327a, str2);
                    }
                    str2 = str;
                } catch (Exception e11) {
                    ad.d.c(j.f24322e, e11.getMessage());
                }
                k.m(this.f24327a, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    j.this.f24323a.A((f) null, uVar.b(), str2);
                    ad.d.c(j.f24322e, uVar.b() + "/" + str2);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = j.this.f24325c = 0;
            int unused3 = j.this.f24326d = 0;
        }

        public void b(rh.b<qi.a> bVar, Throwable th2) {
            ad.d.c(j.f24322e, "onFailure: " + th2.getMessage());
            k.l(this.f24327a, "Không nhận dược phản hồi từ hệ thống", new C0483a(), false);
            j.this.g();
            new Handler().postDelayed(new b(), j.this.f24324b);
        }
    }

    public j(g gVar) {
        this.f24323a = gVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(Context context, Object obj) {
        i(context);
    }

    public final void g() {
        long j10;
        int i10 = this.f24325c;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f24325c = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f24326d + 1;
            this.f24326d = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f24324b = j10;
        if (this.f24324b > 40000) {
            this.f24324b = 40000;
        }
    }

    public void h(Context context) {
        ad.d.c(f24322e, u0.f8524n0);
        if (yc.a.c(new di.a(context).q()) - uc.a.a() < 172800) {
            new c().c(new h(new jc.c(context, b.f22097a)), new i(this, context));
            return;
        }
        i(context);
    }

    public final void i(Context context) {
        ((pi.c) jc.b.b(context, b.f22097a, pi.c.class)).m().l(new a(context));
    }
}

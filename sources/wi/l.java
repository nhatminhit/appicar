package wi;

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

public class l {

    /* renamed from: f  reason: collision with root package name */
    public static final String f24338f = "SuggestYoutubeRepository";

    /* renamed from: a  reason: collision with root package name */
    public m f24339a;

    /* renamed from: b  reason: collision with root package name */
    public d f24340b = new d();

    /* renamed from: c  reason: collision with root package name */
    public long f24341c;

    /* renamed from: d  reason: collision with root package name */
    public int f24342d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f24343e = 0;

    public class a implements rh.d<yi.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24344a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f24345b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f24346c;

        /* renamed from: wi.l$a$a  reason: collision with other inner class name */
        public class C0485a implements ErrorDialog.a {
            public C0485a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                l.this.f(aVar.f24345b, aVar.f24344a, aVar.f24346c);
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
                l.this.f(aVar.f24345b, aVar.f24344a, aVar.f24346c);
            }
        }

        public a(Context context, c cVar, Context context2) {
            this.f24344a = context;
            this.f24345b = cVar;
            this.f24346c = context2;
        }

        public void a(rh.b<yi.b> bVar, u<yi.b> uVar) {
            String str;
            String str2 = "";
            if (uVar.b() == 200) {
                if (uVar.a().a().size() > 0) {
                    l.this.f24339a.t(uVar.a(), uVar.b(), str2);
                    i.r(this.f24344a).J0(l.this.f24340b.a(uVar.a()));
                } else if (i.r(this.f24344a).C().equals(str2)) {
                    l.this.f24339a.t(uVar.a(), uVar.b(), str2);
                }
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str = uVar.a().b();
                        }
                        k.m(this.f24344a, str2);
                    }
                    str2 = str;
                } catch (Exception e10) {
                    ad.d.c(l.f24338f, e10.getMessage());
                }
                k.m(this.f24344a, str2);
            } else {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else if (uVar.a() != null) {
                        str2 = uVar.a().b();
                    }
                    l.this.f24339a.t((yi.b) null, uVar.b(), str2);
                    ad.d.c(l.f24338f, uVar.b() + "/" + str2);
                } catch (Exception unused) {
                }
            }
            k.k();
            int unused2 = l.this.f24342d = 0;
            int unused3 = l.this.f24343e = 0;
        }

        public void b(rh.b<yi.b> bVar, Throwable th2) {
            ad.d.c(l.f24338f, "onFailure: " + th2.getMessage());
            C0485a aVar = new C0485a();
            Context context = this.f24344a;
            if (context != null) {
                k.l(context, "Không nhận dược phản hồi từ hệ thống", aVar, false);
                l.this.e();
                new Handler().postDelayed(new b(), l.this.f24341c);
            }
        }
    }

    public l(m mVar) {
        this.f24339a = mVar;
    }

    public final void e() {
        long j10;
        int i10 = this.f24342d;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f24342d = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f24343e + 1;
            this.f24343e = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f24341c = j10;
        if (this.f24341c > 40000) {
            this.f24341c = 40000;
        }
    }

    public void f(c cVar, Context context, Context context2) {
        ((c) b.b(context, pi.b.f22097a, c.class)).h(cVar).l(new a(context, cVar, context2));
    }
}

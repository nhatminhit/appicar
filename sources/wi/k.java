package wi;

import android.content.Context;
import android.os.Handler;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import jc.b;
import org.json.JSONArray;
import org.json.JSONObject;
import pi.c;
import rh.d;
import rh.u;

public class k {

    /* renamed from: e  reason: collision with root package name */
    public static final String f24329e = "SearchYoutubeRepository";

    /* renamed from: a  reason: collision with root package name */
    public m f24330a;

    /* renamed from: b  reason: collision with root package name */
    public long f24331b;

    /* renamed from: c  reason: collision with root package name */
    public int f24332c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f24333d = 0;

    public class a implements d<yi.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24334a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f24335b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f24336c;

        /* renamed from: wi.k$a$a  reason: collision with other inner class name */
        public class C0484a implements ErrorDialog.a {
            public C0484a() {
            }

            public void l(ErrorDialog errorDialog) {
                errorDialog.dismiss();
                a aVar = a.this;
                k.this.f(aVar.f24335b, aVar.f24334a, aVar.f24336c);
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
                k.this.f(aVar.f24335b, aVar.f24334a, aVar.f24336c);
            }
        }

        public a(Context context, b bVar, Context context2) {
            this.f24334a = context;
            this.f24335b = bVar;
            this.f24336c = context2;
        }

        public void a(rh.b<yi.b> bVar, u<yi.b> uVar) {
            String str;
            String str2;
            String str3 = "";
            if (uVar.b() == 200) {
                k.this.f24330a.r(uVar.a(), uVar.b(), str3);
            } else if (uVar.b() == 401) {
                try {
                    if (uVar.e() != null) {
                        str2 = new JSONObject(uVar.e().A()).getString("message");
                    } else {
                        if (uVar.a() != null) {
                            str2 = uVar.a().b();
                        }
                        sj.k.m(this.f24334a, str3);
                    }
                    str3 = str2;
                } catch (Exception e10) {
                    ad.d.c(k.f24329e, e10.getMessage());
                }
                sj.k.m(this.f24334a, str3);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(uVar.b());
                sb2.append("ok nhe");
                try {
                    if (uVar.e() != null) {
                        JSONObject jSONObject = new JSONObject(uVar.e().A());
                        str = jSONObject.getString("message");
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(jSONObject2.getString("field"));
                            sb3.append("//");
                            sb3.append(jSONObject2.getString("error"));
                        }
                    } else {
                        str = uVar.a() != null ? uVar.a().b() : str3;
                    }
                    k.this.f24330a.r((yi.b) null, uVar.b(), str);
                    ad.d.c(k.f24329e, uVar.b() + "/" + str);
                } catch (Exception unused) {
                    k.this.f24330a.r((yi.b) null, uVar.b(), str3);
                    ad.d.c(k.f24329e, uVar.b() + str3);
                }
            }
            sj.k.k();
            int unused2 = k.this.f24332c = 0;
            int unused3 = k.this.f24333d = 0;
        }

        public void b(rh.b<yi.b> bVar, Throwable th2) {
            ad.d.c(k.f24329e, "onFailure: " + th2.getMessage());
            C0484a aVar = new C0484a();
            Context context = this.f24334a;
            if (context != null) {
                sj.k.l(context, "Không nhận dược phản hồi từ hệ thống", aVar, false);
                k.this.e();
                new Handler().postDelayed(new b(), k.this.f24331b);
            }
        }
    }

    public k(m mVar) {
        this.f24330a = mVar;
    }

    public final void e() {
        long j10;
        int i10 = this.f24332c;
        if (i10 < 3) {
            int i11 = i10 + 1;
            this.f24332c = i11;
            j10 = (long) ((Math.pow(2.0d, (double) i11) + 2.0d) * 1000.0d);
        } else {
            int i12 = this.f24333d + 1;
            this.f24333d = i12;
            j10 = (long) ((Math.pow(5.0d, (double) i12) + 15.0d) * 1000.0d);
        }
        this.f24331b = j10;
        if (this.f24331b > 40000) {
            this.f24331b = 40000;
        }
    }

    public void f(b bVar, Context context, Context context2) {
        ((c) b.b(context, pi.b.f22097a, c.class)).g(bVar).l(new a(context, bVar, context2));
    }
}

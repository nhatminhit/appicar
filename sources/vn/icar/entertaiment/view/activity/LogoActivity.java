package vn.icar.entertaiment.view.activity;

import ad.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import b6.h;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import d.o0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ri.g;
import sj.i;
import sj.k;
import vn.icar.entertaiment.R;
import wi.f;
import wi.j;

public class LogoActivity extends BaseActivity<zi.c> implements ErrorDialog.a, fi.c, g, wi.g, xi.b {

    /* renamed from: v0  reason: collision with root package name */
    public static final String f23822v0 = "LogoActivity";

    /* renamed from: q0  reason: collision with root package name */
    public Intent f23823q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f23824r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f23825s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public String[] f23826t0 = {"ELLIVIEW S4", "ELLIVIEW U4", "ELLIVIEW S3", "MOBILE PHONE", "ANDROID BOX", "ELLIVIEW U3", "ELLIVIEW D4", "OWNICE C970", "OWNICE C970 (+360)", "OWNICE C960", "OWNICE C800", "OWNICE C500+"};

    /* renamed from: u0  reason: collision with root package name */
    public di.a f23827u0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            vc.c.g().n(LogoActivity.this.f23826t0[i10]);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            if (vc.c.g().d().b().equals("")) {
                LogoActivity.this.S0("Không thể đọc ghi file, vui lòng kiểm tra quyền ứng dụng");
                LogoActivity.this.finish();
                return;
            }
            ((zi.c) LogoActivity.this.f17786l0).f25159u0.f25170z0.setVisibility(8);
            LogoActivity.this.e1();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            LogoActivity.this.g1();
        }
    }

    public void A(f fVar, int i10, String str) {
        if (i10 == 200) {
            i.r(this.f17785k0).T0(fVar.a().b().a());
            i.r(this.f17785k0).U0(fVar.a().c().a());
            i.r(this.f17785k0).k0(fVar.a().a().get(0));
            i.r(this.f17785k0).k1(fVar.a().b().b());
            i.r(this.f17785k0).l1(fVar.a().c().b());
            ej.a.b().z(true);
            Z0();
            return;
        }
        k.l(this.f17785k0, str, this, false);
    }

    public void K(qi.a aVar, int i10, String str) {
        if (i10 == 200) {
            try {
                JSONObject jSONObject = new JSONArray(aVar.a()).getJSONObject(0);
                this.f23827u0.H(jSONObject.getString("accessToken"));
                this.f23827u0.B(jSONObject.getString("refreshToken"));
                this.f23827u0.D(jSONObject.getString("sub"));
                i.r(this.f17785k0).i1("");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            a1();
            return;
        }
        d.c(f23822v0, "Migrate token không thành công, chuyển sang đăng nhập");
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public String[] K0() {
        return new String[]{"vn.icar.entertaiment.Interactive"};
    }

    public void R0(Context context, Intent intent) {
        if (intent.getAction() != null) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("vn.icar.entertaiment.Interactive")) {
                c1(intent);
            }
        }
    }

    public final void Z0() {
        new xi.c(this).f(new vi.a(i.r(this.f17785k0).s()), this.f17785k0);
    }

    public final void a1() {
        new j(this).h(this.f17785k0);
    }

    public int b() {
        return R.layout.activity_logo;
    }

    public final void b1() {
        vc.c g10;
        String str;
        if (!this.f23827u0.M()) {
            if (k.j("com.iauto.txbt", this.f17785k0.getPackageManager())) {
                g10 = vc.c.g();
                str = "ELLIVIEW D4";
            } else if (k.j("com.carsyso.bluetooth", this.f17785k0.getPackageManager())) {
                g10 = vc.c.g();
                str = "ELLIVIEW D5";
            } else {
                if (k.j("com.applepie.bluetooth", this.f17785k0.getPackageManager())) {
                    g10 = vc.c.g();
                    str = "ELLIVIEW DE";
                }
                this.f23827u0.R(true);
            }
            g10.n(str);
            this.f23827u0.R(true);
        }
        e1();
    }

    public final void c1(Intent intent) {
        if (intent.getAction().equals("vn.icar.entertaiment.Interactive")) {
            if (this.f23823q0 == null) {
                this.f23823q0 = new Intent(this, HomeActivity.class);
            }
            String str = "key";
            if (intent.getStringExtra(str) == null) {
                str = "key2";
                if (intent.getStringExtra(str) == null) {
                    str = "key3";
                    if (intent.getStringExtra(str) == null) {
                        return;
                    }
                }
            }
            this.f23823q0.putExtra(str, intent.getStringExtra(str).toString().trim());
        }
    }

    public final void d1() {
        new Handler().postDelayed(new c(), h.f4357h);
    }

    public final void e1() {
        if (vc.c.g().d() == null) {
            if (sj.a.b().a("DEVICE").equals("")) {
                ((zi.c) this.f17786l0).f25159u0.f25170z0.setVisibility(0);
                f1();
                return;
            }
            vc.c.g().n(sj.a.b().a("DEVICE"));
        }
        i1();
    }

    public final void f1() {
        ((zi.c) this.f17786l0).f25159u0.f25167w0.setAdapter(new oi.c(this.f17785k0, this.f23826t0));
        vc.c.g().n(this.f23826t0[0]);
        ((zi.c) this.f17786l0).f25159u0.f25167w0.setOnItemSelectedListener(new a());
        ((zi.c) this.f17786l0).f25159u0.f25164t0.setOnClickListener(new b());
    }

    public final void g1() {
        if (this.f23824r0) {
            if (this.f23823q0 == null) {
                this.f23823q0 = new Intent(this, HomeActivity.class);
            }
            this.f23823q0.setFlags(b6.c.A);
            startActivity(this.f23823q0);
            finish();
            return;
        }
        this.f23824r0 = true;
    }

    public final void h1() {
        if (this.f23827u0.q().equals("") || this.f23827u0.j().equals("")) {
            if (!i.r(this.f17785k0).a().equals("") && !i.r(this.f17785k0).L().equals("")) {
                this.f23827u0.H(i.r(this.f17785k0).a());
                this.f23827u0.B(i.r(this.f17785k0).L());
                h1();
            } else if (!i.r(this.f17785k0).c0().equals("")) {
                new ri.h(this).a(new ri.a(i.r(this.f17785k0).c0(), i.r(this.f17785k0).c(), ni.b.f21291e, i.r(this.f17785k0).D(), "fcm"), this.f17785k0);
            } else {
                d.c(f23822v0, "Có mạng , không có dữ liệu token, chuyển sang màn home");
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }
        } else if (yc.a.c(this.f23827u0.q()) - uc.a.a() < 21600) {
            d.c(f23822v0, "Thời gian token nhỏ hơn 6 tiếng, call refreshToken");
            new fi.b(this).a(new fi.a(this.f23827u0.j()), this.f17785k0, pi.b.f22097a);
        } else {
            a1();
        }
    }

    public void i(xi.a aVar, int i10, String str) {
        if (i10 == 200) {
            ej.a.b().u(true);
            g1();
            return;
        }
        k.l(this.f17785k0, str, this, false);
    }

    public final void i1() {
        if (I0()) {
            h1();
            return;
        }
        if (this.f23827u0.q().equals("")) {
            if (!i.r(this.f17785k0).a().equals("")) {
                this.f23827u0.H(i.r(this.f17785k0).a());
                this.f23827u0.B(i.r(this.f17785k0).a());
            } else {
                d.c(f23822v0, "Không có mạng và ko có dữ liệu token, chuyển sang màn login");
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                return;
            }
        }
        g1();
    }

    public void l(ErrorDialog errorDialog) {
        errorDialog.dismiss();
        e1();
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        O0();
        N0();
        di.a aVar = new di.a(this.f17785k0);
        this.f23827u0 = aVar;
        aVar.u("vi-VN");
        ((zi.c) this.f17786l0).f25159u0.f25170z0.setVisibility(8);
        b1();
        d1();
    }

    public void v(ErrorDialog errorDialog) {
        errorDialog.dismiss();
        finish();
    }

    public void y(boolean z10, int i10) {
        if (z10) {
            a1();
        } else if (i10 == 401) {
            d.c(f23822v0, "refresh Token: 401 chuyển sang đăng nhập");
            T0();
        } else {
            d.c(f23822v0, "Lỗi refresh Token: " + i10);
        }
    }
}

package vn.icar.entertaiment.view.activity;

import ad.d;
import android.content.Intent;
import android.os.Bundle;
import ci.e;
import d.o0;
import ni.b;
import sj.i;
import vc.c;
import vn.icar.baseauthentication.view.BaseQRLoginAuthActivity;

public class LoginActivity extends BaseQRLoginAuthActivity {
    public static final String D0 = "LoginActivity";

    public String L1() {
        return i.r(this.f17785k0).c();
    }

    public String M1() {
        return b.f21291e;
    }

    public String N1() {
        return i.r(this.f17785k0).D().equals("") ? i.r(this.f17785k0).c() : i.r(this.f17785k0).D();
    }

    public String O1() {
        return pi.b.f22097a;
    }

    public void R1(ai.b bVar) {
        this.f17787m0.H(bVar.a().get(0).a());
        this.f17787m0.B(bVar.a().get(0).h());
        this.f17787m0.D(bVar.a().get(0).i());
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    public String V0() {
        return pi.b.f22098b;
    }

    public <T> void m(T t10) {
        super.m(t10);
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        d.c(D0, i.r(this.f17785k0).D() + "ok");
        e2();
        T0(new e().setAppId(i.r(this.f17785k0).c()).setDeviceId(i.r(this.f17785k0).D().equals("") ? i.r(this.f17785k0).c() : i.r(this.f17785k0).D()).setAppVersion(b.f21291e).setDeviceName(c.g().i()).setFcmToken(""));
    }
}

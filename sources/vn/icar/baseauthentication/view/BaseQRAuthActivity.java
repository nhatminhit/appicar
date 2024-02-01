package vn.icar.baseauthentication.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import ci.e;
import d.o0;
import hi.c;
import java.util.Date;
import li.p;
import vn.icar.baseauthentication.a;

public abstract class BaseQRAuthActivity extends BaseAuthActivity<c> implements View.OnClickListener {

    /* renamed from: q0  reason: collision with root package name */
    public static String f23773q0 = "QRAuthActivity";

    /* access modifiers changed from: private */
    public /* synthetic */ void Z0() {
        ((c) this.f17786l0).f19628u0.setVisibility(0);
        ((c) this.f17786l0).f19629v0.setVisibility(8);
    }

    public void B() {
        ((c) this.f17786l0).f19628u0.setVisibility(0);
        ((c) this.f17786l0).f19629v0.setVisibility(8);
        ((c) this.f17786l0).f19630w0.setVisibility(8);
    }

    public String[] K0() {
        return new String[0];
    }

    public void N0() {
        ((c) this.f17786l0).f19628u0.setOnClickListener(this);
        ((c) this.f17786l0).f19627t0.setOnClickListener(this);
    }

    public void O0() {
        super.O0();
        ((c) this.f17786l0).f19631x0.setText(Y0());
        ((c) this.f17786l0).f19627t0.setVisibility(X0() ? 0 : 8);
    }

    public void R0(Context context, Intent intent) {
    }

    public abstract boolean X0();

    public String Y0() {
        return getString(a.o.qr_description);
    }

    public abstract void a1();

    public int b() {
        return a.l.activity_qr_auth;
    }

    public <T> void m(T t10) {
        M0().Q(2);
        p.A().B(this.f17785k0, V0(), (e) null);
        p.A().x();
    }

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == a.i.btn_recreate_code) {
            p.A().Q();
            ((c) this.f17786l0).f19630w0.setVisibility(0);
            ((c) this.f17786l0).f19628u0.setVisibility(8);
        } else if (id2 == a.i.btn_back) {
            a1();
        }
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        O0();
        N0();
    }

    public void z(String str, long j10) {
        new dd.a().a(str, ((c) this.f17786l0).f19629v0, 500);
        ((c) this.f17786l0).f19629v0.setVisibility(0);
        ((c) this.f17786l0).f19628u0.setVisibility(8);
        ((c) this.f17786l0).f19630w0.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("time qrcode: ");
        long j11 = j10 * 1000;
        sb2.append(j11 - new Date().getTime());
        new Handler().postDelayed(new mi.a(this), j11 - new Date().getTime());
    }
}

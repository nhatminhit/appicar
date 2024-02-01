package vn.icar.baseauthentication.view;

import android.view.View;
import hi.a;
import vn.icar.baseauthentication.a;

public abstract class BaseOptionAuthActivity extends BaseAuthActivity<a> implements View.OnClickListener {
    public void F() {
        super.F();
        int L = M0().L();
        if (L == 1) {
            a1();
        } else if (L == 2) {
            b1();
        } else if (M0().q().equals("")) {
            O0();
            N0();
        } else {
            Z0();
        }
    }

    public void N0() {
        ((a) this.f17786l0).f19620t0.setOnClickListener(this);
        ((a) this.f17786l0).f19621u0.setOnClickListener(this);
    }

    public void O0() {
        super.O0();
        ((a) this.f17786l0).f19622v0.setText(W0());
        ((a) this.f17786l0).f19620t0.setText(X0());
        ((a) this.f17786l0).f19621u0.setText(Y0());
    }

    public abstract String W0();

    public abstract String X0();

    public abstract String Y0();

    public abstract void Z0();

    public abstract void a1();

    public int b() {
        return a.l.activity_option_login;
    }

    public abstract void b1();

    public void d() {
    }

    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == a.i.btn_left) {
            M0().Q(1);
            a1();
        } else if (id2 == a.i.btn_right) {
            b1();
        }
    }

    public void z(String str, long j10) {
    }
}

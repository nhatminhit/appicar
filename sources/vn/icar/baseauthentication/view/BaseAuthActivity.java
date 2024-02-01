package vn.icar.baseauthentication.view;

import androidx.databinding.ViewDataBinding;
import ci.b;
import ci.e;
import com.tatv.baseapp.view.activity.BaseActivity;
import li.a;
import li.p;

public abstract class BaseAuthActivity<V extends ViewDataBinding> extends BaseActivity<V> implements a {
    public void B() {
    }

    public void F() {
        super.F();
        this.f17787m0 = new di.a(this.f17785k0);
        p.A().V(this);
    }

    public void O(String str) {
    }

    public void T0(e eVar) {
        p.A().B(this.f17785k0, V0(), eVar);
        p.A().x();
    }

    /* renamed from: U0 */
    public di.a M0() {
        return (di.a) this.f17787m0;
    }

    public abstract String V0();

    public void a() {
    }

    public void d() {
    }

    public void e() {
    }

    public <T> void m(T t10) {
    }

    public void n(b bVar) {
    }

    public void z(String str, long j10) {
    }
}

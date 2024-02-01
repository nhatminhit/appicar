package vn.icar.entertaiment.view.activity;

import android.app.Activity;
import android.content.Intent;
import androidx.databinding.ViewDataBinding;

public abstract class BaseActivity<V extends ViewDataBinding> extends com.tatv.baseapp.view.activity.BaseActivity<V> {
    public void T0() {
        this.f17785k0.startActivity(new Intent(this.f17785k0, LoginActivity.class));
        ((Activity) this.f17785k0).finish();
    }
}

package com.tatv.baseapp.service;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.google.android.material.badge.BadgeDrawable;
import rc.a;

public abstract class BaseScreenService<V extends ViewDataBinding> extends BaseService implements a {
    public V U;
    public WindowManager V;
    public WindowManager.LayoutParams W;

    public int a() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public void k() {
        super.k();
        this.V = (WindowManager) getSystemService("window");
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        V v10 = this.U;
        if (v10 != null) {
            this.V.removeView(v10.getRoot());
        }
    }

    public WindowManager.LayoutParams q() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2006, 8, -3);
        this.W = layoutParams;
        layoutParams.gravity = BadgeDrawable.f16647f0;
        layoutParams.x = a();
        this.W.y = c();
        return this.W;
    }

    public abstract void r();

    public abstract void s();

    public void t() {
        if (b() != 0 && this.U == null) {
            V j10 = m.j(LayoutInflater.from(this), b(), (ViewGroup) null, false);
            this.U = j10;
            this.V.addView(j10.getRoot(), q());
        }
    }
}

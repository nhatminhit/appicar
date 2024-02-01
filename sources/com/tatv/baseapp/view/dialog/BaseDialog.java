package com.tatv.baseapp.view.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.tatv.baseapp.a;
import d.m0;

public abstract class BaseDialog<V extends ViewDataBinding> extends Dialog {
    public Context O;
    public V P;

    public BaseDialog(@m0 Context context) {
        super(context);
    }

    public abstract int a();

    public abstract void b();

    public void c() {
        if (a() != 0) {
            V j10 = m.j(LayoutInflater.from(this.O), a(), (ViewGroup) null, false);
            this.P = j10;
            setContentView(j10.getRoot());
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void d() {
        this.O = getContext();
        getWindow().setBackgroundDrawable(this.O.getDrawable(a.g.background_transparent));
        getWindow().setLayout(-1, -1);
        c();
        b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }
}

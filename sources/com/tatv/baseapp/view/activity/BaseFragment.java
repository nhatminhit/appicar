package com.tatv.baseapp.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.fragment.app.Fragment;
import d.m0;
import d.o0;
import jd.b;
import jd.c;

public abstract class BaseFragment<V extends ViewDataBinding> extends Fragment implements c {
    public Context Y0;
    public V Z0;

    /* access modifiers changed from: private */
    public /* synthetic */ void M0(String str) {
        Toast.makeText(this.Y0, str, 0).show();
    }

    public void F() {
    }

    public abstract void K0();

    public abstract void L0();

    public void N0(String str) {
        getActivity().runOnUiThread(new b(this, str));
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.Y0 = getContext();
        F();
    }

    @o0
    public View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        this.Z0 = m.j(layoutInflater, b(), viewGroup, false);
        L0();
        K0();
        return this.Z0.getRoot();
    }
}

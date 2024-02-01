package com.tatv.baseapp.view.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tatv.baseapp.a;
import d.m0;
import id.c;
import md.k;
import nc.e;

public class PermissionDialog extends BaseDialog<e> {
    public a Q;
    public String R;
    public String S;

    public interface a {
        void a(PermissionDialog permissionDialog);
    }

    public PermissionDialog(@m0 Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(this);
        }
        c.a(view);
    }

    public int a() {
        return a.l.dialog_permission;
    }

    public void b() {
        ((e) this.P).f21225u0.setOnClickListener(new kd.e(this));
    }

    public void c() {
        super.c();
        ((e) this.P).f21228x0.setText(this.R);
        ((e) this.P).f21227w0.setText(this.S);
        V v10 = this.P;
        ((e) v10).f21224t0.g(((e) v10).f21224t0, new k(getContext())).c(getWindow().getDecorView().getBackground()).f(20.0f);
    }

    public PermissionDialog g(String str) {
        this.S = str;
        V v10 = this.P;
        if (v10 != null) {
            ((e) v10).f21227w0.setText(str);
        }
        return this;
    }

    public PermissionDialog h(a aVar) {
        this.Q = aVar;
        return this;
    }

    public PermissionDialog i(String str) {
        this.R = str;
        V v10 = this.P;
        if (v10 != null) {
            ((e) v10).f21228x0.setText(str);
        }
        return this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }
}

package com.tatv.baseapp.view.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import cd.b;
import cd.d;
import d.o0;
import jd.c;

public abstract class BaseActivity<V extends ViewDataBinding> extends AppCompatActivity implements c, d {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f17781o0 = "BaseActivity";

    /* renamed from: p0  reason: collision with root package name */
    public static BaseActivity f17782p0;

    /* renamed from: i0  reason: collision with root package name */
    public final IntentFilter f17783i0 = new IntentFilter();

    /* renamed from: j0  reason: collision with root package name */
    public BroadcastReceiver f17784j0;

    /* renamed from: k0  reason: collision with root package name */
    public Context f17785k0;

    /* renamed from: l0  reason: collision with root package name */
    public V f17786l0;

    /* renamed from: m0  reason: collision with root package name */
    public mc.a f17787m0;

    /* renamed from: n0  reason: collision with root package name */
    public b f17788n0;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            BaseActivity.this.R0(context, intent);
        }
    }

    public static BaseActivity J0() {
        return f17782p0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q0(String str) {
        Toast.makeText(this.f17785k0, str, 0).show();
    }

    public void F() {
    }

    public /* synthetic */ void G(int i10) {
        cd.c.a(this, i10);
    }

    public final void H0() {
        for (String addAction : K0()) {
            this.f17783i0.addAction(addAction);
        }
        if (this.f17784j0 == null) {
            a aVar = new a();
            this.f17784j0 = aVar;
            registerReceiver(aVar, this.f17783i0);
        }
    }

    public boolean I0() {
        return this.f17788n0.k();
    }

    public void J(long j10) {
    }

    public String[] K0() {
        return new String[0];
    }

    public double L0() {
        DisplayMetrics displayMetrics = this.f17785k0.getResources().getDisplayMetrics();
        return ((double) displayMetrics.widthPixels) / ((double) displayMetrics.heightPixels);
    }

    public <T extends mc.a> T M0() {
        return this.f17787m0;
    }

    public void N0() {
    }

    public void O0() {
        if (b() != 0) {
            this.f17786l0 = m.l(this, b());
        }
    }

    public boolean P0() {
        return getResources().getConfiguration().orientation == 2;
    }

    public void R0(Context context, Intent intent) {
    }

    public void S0(String str) {
        runOnUiThread(new jd.a(this, str));
    }

    public void f(boolean z10) {
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.f17785k0 = this;
        f17782p0 = this;
        this.f17787m0 = new mc.a(this);
        b bVar = new b(this.f17785k0);
        this.f17788n0 = bVar;
        bVar.c(new b.C0267b(f17781o0, this));
        H0();
        F();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f17784j0 != null) {
            o2.a.b(this).f(this.f17784j0);
        }
        b bVar = this.f17788n0;
        if (bVar != null) {
            bVar.o(f17781o0);
        }
    }
}

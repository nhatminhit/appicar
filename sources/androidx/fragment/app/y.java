package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.x0;
import d.m0;
import d.o0;
import i2.a;
import y2.c;
import y2.d;
import y2.e;

public class y implements o, e, b1 {
    public final Fragment O;
    public final a1 P;
    public x0.b Q;
    public a0 R = null;
    public d S = null;

    public y(@m0 Fragment fragment, @m0 a1 a1Var) {
        this.O = fragment;
        this.P = a1Var;
    }

    public void a(@m0 p.a aVar) {
        this.R.l(aVar);
    }

    public void b() {
        if (this.R == null) {
            this.R = new a0(this);
            this.S = d.a(this);
        }
    }

    public boolean c() {
        return this.R != null;
    }

    public void d(@o0 Bundle bundle) {
        this.S.d(bundle);
    }

    public void e(@m0 Bundle bundle) {
        this.S.e(bundle);
    }

    public void f(@m0 p.b bVar) {
        this.R.s(bVar);
    }

    @m0
    public x0.b getDefaultViewModelProviderFactory() {
        x0.b defaultViewModelProviderFactory = this.O.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.O.J0)) {
            this.Q = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.Q == null) {
            Application application = null;
            Context context = this.O.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.Q = new r0(application, this, this.O.getArguments());
        }
        return this.Q;
    }

    @m0
    public p getLifecycle() {
        b();
        return this.R;
    }

    @m0
    public c getSavedStateRegistry() {
        b();
        return this.S.b();
    }

    @m0
    public a1 getViewModelStore() {
        b();
        return this.P;
    }

    public /* synthetic */ a q() {
        return n.a(this);
    }
}

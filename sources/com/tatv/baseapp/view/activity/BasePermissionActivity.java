package com.tatv.baseapp.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import d.m0;
import d.o0;
import h0.b;
import i0.d;
import pc.f;

public abstract class BasePermissionActivity extends Activity implements f {
    public static final int P = 12;
    public Context O;

    public boolean a(String str) {
        return d.a(this.O, str) == 0;
    }

    public abstract String[] b();

    public boolean c() {
        for (String a10 : b()) {
            if (!a(a10)) {
                return false;
            }
        }
        return true;
    }

    public void d() {
        if (b().length > 0) {
            b.D(this, b(), 12);
        }
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.O = this;
    }

    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 12 && !c()) {
            I();
        }
    }
}

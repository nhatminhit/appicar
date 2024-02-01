package com.tatv.baseapp.view.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import d.m0;
import d.o0;
import h0.b;
import i0.d;
import pc.f;

public abstract class BasePermissionCombatActivity extends AppCompatActivity implements f {

    /* renamed from: j0  reason: collision with root package name */
    public static final int f17790j0 = 12;

    /* renamed from: i0  reason: collision with root package name */
    public Context f17791i0;

    public boolean G0(String str) {
        return d.a(this.f17791i0, str) == 0;
    }

    public abstract String[] H0();

    public boolean I0() {
        for (String G0 : H0()) {
            if (!G0(G0)) {
                return false;
            }
        }
        return true;
    }

    public void J0() {
        if (H0().length > 0) {
            b.D(this, H0(), 12);
        }
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.f17791i0 = this;
    }

    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 12 && !I0()) {
            I();
        }
    }
}

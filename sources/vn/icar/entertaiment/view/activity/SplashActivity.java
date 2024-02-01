package vn.icar.entertaiment.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import com.tatv.baseapp.view.activity.BasePermissionCombatActivity;
import com.tatv.baseapp.view.dialog.PermissionDialog;
import d.o0;
import d.t0;
import ej.a;
import java.util.ArrayList;
import tj.b;
import tj.c;
import vn.icar.entertaiment.R;

public class SplashActivity extends BasePermissionCombatActivity {

    /* renamed from: l0  reason: collision with root package name */
    public static final String f23828l0 = "SplashScreen";

    /* renamed from: k0  reason: collision with root package name */
    public PermissionDialog f23829k0;

    /* access modifiers changed from: private */
    public /* synthetic */ void Q0(PermissionDialog permissionDialog) {
        permissionDialog.dismiss();
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT").setData(Uri.parse(String.format("package:%s", new Object[]{this.f17791i0.getPackageName()}))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R0(PermissionDialog permissionDialog) {
        permissionDialog.dismiss();
        startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + this.f17791i0.getPackageName())));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S0(PermissionDialog permissionDialog) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        startActivity(intent);
    }

    public String[] H0() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 30) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void I() {
        PermissionDialog h10 = new PermissionDialog(this.f17791i0).i(getString(R.string.text_app_permission_title)).g(getString(R.string.text_app_permission_description)).h(new c(this));
        this.f23829k0 = h10;
        h10.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (I0() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        J0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (I0() != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N0() {
        /*
            r2 = this;
            boolean r0 = r2.P0()
            if (r0 != 0) goto L_0x000a
            r2.U0()
            goto L_0x002e
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L_0x0021
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r2.I0()
            if (r0 == 0) goto L_0x002b
            goto L_0x0027
        L_0x001d:
            r2.V0()
            goto L_0x002e
        L_0x0021:
            boolean r0 = r2.I0()
            if (r0 == 0) goto L_0x002b
        L_0x0027:
            r2.T0()
            goto L_0x002e
        L_0x002b:
            r2.J0()
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.icar.entertaiment.view.activity.SplashActivity.N0():void");
    }

    public final void O0() {
        PermissionDialog permissionDialog = this.f23829k0;
        if (permissionDialog != null && permissionDialog.isShowing()) {
            this.f23829k0.cancel();
        }
    }

    public final boolean P0() {
        return ((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(this.f17791i0.getPackageName());
    }

    public final void T0() {
        if (!a.b().r()) {
            startActivity(new Intent(this, LogoActivity.class));
        }
        finish();
    }

    public final void U0() {
        PermissionDialog h10 = new PermissionDialog(this.f17791i0).i(getString(R.string.text_battery_optimizations_permission_title)).g(getString(R.string.text_battery_optimizations_permission_description)).h(new b(this));
        this.f23829k0 = h10;
        h10.show();
    }

    @t0(api = 30)
    public final void V0() {
        new PermissionDialog(this.f17791i0).i(getString(R.string.text_app_permission_manage_all_file_title)).g(getString(R.string.text_app_permission_manage_all_file_description)).h(new tj.a(this)).show();
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        O0();
    }

    public void onResume() {
        super.onResume();
        N0();
    }

    public void t() {
        T0();
    }
}

package vn.icar.entertaiment.view.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import org.json.JSONArray;
import sj.h;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.MediaPlayerService;
import vn.icar.entertaiment.utils.UpdateDialog;
import vn.icar.entertaiment.view.fragment.OfflineFragment;
import vn.icar.entertaiment.view.fragment.TvFragment;
import vn.icar.entertaiment.view.fragment.YoutubeFragment;
import zi.a;

public class HomeActivity extends BaseActivity<a> {

    /* renamed from: t0  reason: collision with root package name */
    public static final String f23818t0 = "HomeActivity";

    /* renamed from: q0  reason: collision with root package name */
    public MediaPlayerService f23819q0;

    /* renamed from: r0  reason: collision with root package name */
    public fj.a f23820r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f23821s0 = false;

    public void U0() {
        this.f23820r0.B();
    }

    public boolean V0() {
        return ui.a.b().I;
    }

    public void W0() {
        ((a) this.f17786l0).f25130u0.setVisibility(4);
    }

    public void X0() {
        ((a) this.f17786l0).f25130u0.setVisibility(0);
    }

    public void Y0(String str) {
        this.f23820r0.H(str);
    }

    public void Z0() {
        this.f23820r0.T.f();
    }

    public void a1() {
        this.f23820r0.S.u();
    }

    public int b() {
        return R.layout.activity_home;
    }

    public OfflineFragment b1() {
        return this.f23820r0.S.w();
    }

    public void c1(int i10) {
        this.f23820r0.P(i10);
    }

    public TvFragment d1() {
        return this.f23820r0.S.x();
    }

    public YoutubeFragment e1() {
        return this.f23820r0.S.z();
    }

    public void f1(boolean z10) {
        this.f23820r0.Q(z10);
    }

    public void g1(JSONArray jSONArray) {
        fj.a aVar = this.f23820r0;
        aVar.T.g(jSONArray, aVar.S);
    }

    public void onActivityResult(int i10, int i11, @o0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 2526) {
            if (i10 == 2527) {
                this.f23820r0.M();
                return;
            } else if (i10 != 2529) {
                return;
            }
        }
        if (h.b(this)) {
            new UpdateDialog(this.f17785k0).show();
        }
    }

    public void onBackPressed() {
        this.f23820r0.I();
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        O0();
        N0();
        MediaPlayerService.s(this.f17785k0);
        this.f23820r0 = new fj.a(this, (a) this.f17786l0);
        this.f17785k0.sendBroadcast(new Intent("vn.icar.entertaiment.STARTUP"));
        this.f23820r0.C((TextView) null, (RelativeLayout) null);
    }

    public void onDestroy() {
        this.f23820r0.K();
        super.onDestroy();
    }

    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        fj.a aVar = this.f23820r0;
        aVar.R.y(z10, aVar.S);
        super.onPictureInPictureModeChanged(z10, configuration);
    }

    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 2525) {
            if (i10 == 2528) {
                this.f23820r0.M();
            }
        } else if (h.b(this) && this.f23821s0) {
            new UpdateDialog(this.f17785k0).show();
        }
    }

    public void onResume() {
        super.onResume();
    }
}

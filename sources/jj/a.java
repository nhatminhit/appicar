package jj;

import aj.a;
import android.content.Context;
import android.content.Intent;
import oj.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.t;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f19977c;

    /* renamed from: a  reason: collision with root package name */
    public Context f19978a;

    /* renamed from: b  reason: collision with root package name */
    public HomeActivity f19979b;

    public a(Context context) {
        this.f19978a = context;
    }

    public static a b(Context context) {
        if (f19977c == null) {
            f19977c = new a(context);
        }
        return f19977c;
    }

    public void a(String str) {
        HomeActivity homeActivity;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1273775369:
                if (str.equals("previous")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    c10 = 2;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                homeActivity = this.f19979b;
                i10 = 88;
                break;
            case 1:
                homeActivity = this.f19979b;
                i10 = 87;
                break;
            case 2:
            case 3:
                homeActivity = this.f19979b;
                i10 = 85;
                break;
            default:
                return;
        }
        homeActivity.c1(i10);
    }

    public final void c(String str) {
        this.f19979b.Y0(str);
    }

    public final void d(String str) {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            this.f19979b.d1().C1(str.toLowerCase());
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            this.f19979b.b1().v1(str);
        } else {
            this.f19979b.e1().s1(str, 0.0f);
        }
    }

    public final void e(String str) {
        d(str.trim());
    }

    public void f(HomeActivity homeActivity, String str) {
        this.f19979b = homeActivity;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("action");
            char c10 = 65535;
            switch (string.hashCode()) {
                case -934610874:
                    if (string.equals("remote")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -906336856:
                    if (string.equals("search")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -906224877:
                    if (string.equals("seekTo")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -810883302:
                    if (string.equals("volume")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -490428775:
                    if (string.equals("get_channels")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 114581:
                    if (string.equals("tab")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3417674:
                    if (string.equals("open")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 3443508:
                    if (string.equals("play")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 110066619:
                    if (string.equals("fullscreen")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 1085444827:
                    if (string.equals("refresh")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1432626128:
                    if (string.equals("channels")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c(jSONObject.getString(t.f13205o));
                    return;
                case 1:
                    e(jSONObject.getJSONArray("data").getJSONObject(0).getString("id"));
                    return;
                case 2:
                    a(jSONObject.getString(t.f13205o));
                    return;
                case 3:
                    i();
                    return;
                case 4:
                    o(Integer.parseInt(jSONObject.getString(t.f13205o)));
                    return;
                case 5:
                    n(Float.parseFloat(jSONObject.getString(t.f13205o)));
                    return;
                case 6:
                    g(jSONObject.getString(t.f13205o));
                    break;
                case 7:
                    break;
                case 8:
                    p(jSONObject.getJSONArray("data"));
                    return;
                case 9:
                    homeActivity.U0();
                    return;
                case 10:
                    homeActivity.startActivity(new Intent(this.f19978a, HomeActivity.class));
                    return;
                default:
                    return;
            }
            j();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void g(String str) {
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            this.f19979b.e1().v1(str, true);
        }
    }

    public void h(float f10) {
        if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = true;
            sb2.append(this.f19979b == null);
            sb2.append("//");
            if (this.f19979b.f23819q0 != null) {
                z10 = false;
            }
            sb2.append(z10);
            HomeActivity homeActivity = this.f19979b;
            if (homeActivity != null && homeActivity.f23819q0 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("seekToVideo: ");
                sb3.append(f10);
                this.f19979b.f23819q0.q().seekTo(((int) f10) * 1000);
                return;
            }
            return;
        }
        c.v(this.f19978a).y().u(f10);
    }

    public final void i() {
        k();
    }

    public void j() {
        this.f19979b.Z0();
    }

    public void k() {
        if (this.f19979b == null) {
            return;
        }
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            if (this.f19979b.d1() != null) {
                this.f19979b.d1().J1();
            }
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            if (this.f19979b.b1() != null) {
                this.f19979b.b1().C1();
            }
        } else if (this.f19979b.e1() != null) {
            this.f19979b.e1().w1();
        }
    }

    public void l() {
        if (this.f19979b == null) {
            return;
        }
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            if (this.f19979b.d1() != null) {
                this.f19979b.d1().L1();
            }
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            if (this.f19979b.b1() != null) {
                this.f19979b.b1().D1();
            }
        } else if (this.f19979b.e1() != null) {
            this.f19979b.e1().y1();
        }
    }

    public void m(HomeActivity homeActivity) {
        this.f19979b = homeActivity;
    }

    public final void n(float f10) {
        h(f10);
    }

    public void o(int i10) {
        mj.a.d(this.f19978a).k(i10);
    }

    public final void p(JSONArray jSONArray) {
        this.f19979b.g1(jSONArray);
    }
}

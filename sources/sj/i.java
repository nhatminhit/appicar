package sj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;
import mj.a;
import vc.c;

public class i {

    /* renamed from: b  reason: collision with root package name */
    public static i f23061b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final String f23062c = "pref_app_id";

    /* renamed from: d  reason: collision with root package name */
    public static final String f23063d = "icare.";

    /* renamed from: a  reason: collision with root package name */
    public Context f23064a;

    public i(Context context) {
        this.f23064a = context;
    }

    public static i r(Context context) {
        i iVar = f23061b;
        return iVar == null ? new i(context) : iVar;
    }

    public String A() {
        return O().getString("ListVideoStory", "");
    }

    public void A0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListAllChannels", str);
        edit.apply();
    }

    public String B() {
        return O().getString("ListVideoTv", "");
    }

    public void B0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoCar", str);
        edit.apply();
    }

    public String C() {
        return O().getString("ListVideoYoutube", "");
    }

    public void C0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoHistory", str);
        edit.apply();
    }

    public String D() {
        return O().getString("mac", "");
    }

    public void D0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoKid", str);
        edit.apply();
    }

    public String E() {
        return O().getString("NameChannelsVideoYoutube", "");
    }

    public void E0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoNews", str);
        edit.apply();
    }

    public String F() {
        return O().getString("NameMusicOffline", "All");
    }

    public void F0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoRadio", str);
        edit.apply();
    }

    public String G() {
        return O().getString("NameVideoYoutube", "");
    }

    public void G0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoReview", str);
        edit.apply();
    }

    public boolean H() {
        return O().getBoolean("OpenOffline", false);
    }

    public void H0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoStory", str);
        edit.apply();
    }

    public boolean I() {
        return O().getBoolean("PictureInPicture", true);
    }

    public void I0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoTv", str);
        edit.apply();
    }

    public boolean J() {
        return O().getBoolean("PingInternet", true);
    }

    public void J0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("ListVideoYoutube", str);
        edit.apply();
    }

    public String K() {
        return O().getString("idRadio", "");
    }

    public void K0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("mac", str);
        edit.apply();
    }

    public String L() {
        return O().getString("RefreshToken", "");
    }

    public void L0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("NameChannelsVideoYoutube", str);
        edit.apply();
    }

    public String M() {
        return O().getString("RegexSearch", "");
    }

    public void M0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("NameMusicOffline", str);
        edit.apply();
    }

    public String N() {
        return O().getString("RegexSuggest", "");
    }

    public void N0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("NameVideoYoutube", str);
        edit.apply();
    }

    public SharedPreferences O() {
        return PreferenceManager.getDefaultSharedPreferences(this.f23064a);
    }

    public void O0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("OpenOffline", z10);
        edit.apply();
    }

    public String P() {
        return O().getString("KEY_SUB", "");
    }

    public void P0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("PictureInPicture", z10);
        edit.apply();
    }

    public String Q() {
        return O().getString("idTv", "");
    }

    public void Q0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("PingInternet", z10);
        edit.apply();
    }

    public String R() {
        return O().getString("thumbVideoYoutube", "");
    }

    public void R0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idRadio", str);
        edit.apply();
    }

    public long S() {
        return O().getLong("KEY_TIME_ACCESS_TOKEN", 0);
    }

    public void S0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("RefreshToken", str);
        edit.apply();
    }

    public String T() {
        return O().getString("TimeAppEnd", "");
    }

    public void T0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("RegexSearch", str);
        edit.apply();
    }

    public long U() {
        return O().getLong("KEY_TIME_REFRESH_TOKEN", 0);
    }

    public void U0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("RegexSuggest", str);
        edit.apply();
    }

    public float V() {
        return O().getFloat("timevideoCar", 0.0f);
    }

    public void V0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("KEY_SUB", str);
        edit.apply();
    }

    public float W() {
        return O().getFloat("timevideoHistory", 0.0f);
    }

    public void W0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idTv", str);
        edit.apply();
    }

    public float X() {
        return O().getFloat("timevideoKid", 0.0f);
    }

    public void X0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("thumbVideoYoutube", str);
        edit.apply();
    }

    public float Y() {
        return O().getFloat("timevideoNews", 0.0f);
    }

    public void Y0(long j10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putLong("KEY_TIME_ACCESS_TOKEN", j10);
        edit.apply();
    }

    public float Z() {
        return O().getFloat("timevideoReview", 0.0f);
    }

    public void Z0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("TimeAppEnd", str);
        edit.apply();
    }

    public String a() {
        return O().getString("AccessToken", "");
    }

    public float a0() {
        return O().getFloat("timevideoStory", 0.0f);
    }

    public void a1(long j10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putLong("KEY_TIME_REFRESH_TOKEN", j10);
        edit.apply();
    }

    public String b() {
        return O().getString("Agents", "");
    }

    public float b0() {
        return O().getFloat("timevideoYoutube", 0.0f);
    }

    public void b1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoCar", f10);
        edit.apply();
    }

    @SuppressLint({"HardwareIds"})
    public String c() {
        String string = Settings.Secure.getString(this.f23064a.getContentResolver(), "android_id");
        return f23063d + string;
    }

    public String c0() {
        return O().getString("Token", "");
    }

    public void c1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoHistory", f10);
        edit.apply();
    }

    public String d() {
        String string = O().getString("pref_app_id", "");
        if (!string.equals("")) {
            return string;
        }
        String c10 = new c().c(f23063d);
        l0(c10);
        return c10;
    }

    public String d0() {
        return O().getString("TypeOffline", "All");
    }

    public void d1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoKid", f10);
        edit.apply();
    }

    public String e() {
        return O().getString("Category", "");
    }

    public String e0() {
        return O().getString("UrlSearch", "");
    }

    public void e1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoNews", f10);
        edit.apply();
    }

    public boolean f() {
        return O().getBoolean("ContinuePlayIcarE", true);
    }

    public String f0() {
        return O().getString("UrlSuggest", "");
    }

    public void f1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoReview", f10);
        edit.apply();
    }

    public boolean g() {
        return O().getBoolean("DailyNewsIcarE", false);
    }

    public Integer g0() {
        return Integer.valueOf(O().getInt("UserId", 0));
    }

    public void g1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoStory", f10);
        edit.apply();
    }

    public String h() {
        return O().getString("DefaultPlay", "");
    }

    public int h0() {
        return O().getInt("Volume", a.d(this.f23064a).g());
    }

    public void h1(float f10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putFloat("timevideoYoutube", f10);
        edit.apply();
    }

    public boolean i() {
        return O().getBoolean("HideAppIcarE", true);
    }

    public String i0() {
        return O().getString("time", "");
    }

    public void i1(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("Token", str);
        edit.apply();
    }

    public List<String> j() {
        ArrayList arrayList = new ArrayList();
        if (!O().getString("h1", "").equals("")) {
            arrayList.add(O().getString("h1", ""));
        }
        if (!O().getString("h2", "").equals("")) {
            arrayList.add(O().getString("h2", ""));
        }
        if (!O().getString("h3", "").equals("")) {
            arrayList.add(O().getString("h3", ""));
        }
        if (!O().getString("h4", "").equals("")) {
            arrayList.add(O().getString("h4", ""));
        }
        if (!O().getString("h5", "").equals("")) {
            arrayList.add(O().getString("h5", ""));
        }
        return arrayList;
    }

    public void j0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("AccessToken", str);
        edit.apply();
    }

    public void j1(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("TypeOffline", str);
        edit.apply();
    }

    public String k() {
        return O().getString("idvideoCar", "");
    }

    public void k0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("Agents", str);
        edit.apply();
    }

    public void k1(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("UrlSearch", str);
        edit.apply();
    }

    public String l() {
        return O().getString("idvideoHistory", "");
    }

    public void l0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("pref_app_id", str);
        edit.apply();
    }

    public void l1(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("UrlSuggest", str);
        edit.apply();
    }

    public String m() {
        return O().getString("idvideoKid", "");
    }

    public void m0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("Category", str);
        edit.apply();
    }

    public void m1(Integer num) {
        SharedPreferences.Editor edit = O().edit();
        edit.putInt("UserId", num.intValue());
        edit.apply();
    }

    public String n() {
        return O().getString("idvideoNews", "");
    }

    public void n0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("ContinuePlayIcarE", z10);
        edit.apply();
    }

    public void n1(int i10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putInt("Volume", i10);
        edit.apply();
    }

    public String o() {
        return O().getString("idvideoReview", "");
    }

    public void o0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("DailyNewsIcarE", z10);
        edit.apply();
    }

    public void o1(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("time", str);
        edit.apply();
    }

    public String p() {
        return O().getString("idvideoStory", "");
    }

    public void p0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("DefaultPlay", str);
        edit.apply();
    }

    public String q() {
        return O().getString("idvideoYoutube", "");
    }

    public void q0(boolean z10) {
        SharedPreferences.Editor edit = O().edit();
        edit.putBoolean("HideAppIcarE", z10);
        edit.apply();
    }

    public void r0(String str) {
        for (String equals : j()) {
            if (equals.equals(str)) {
                return;
            }
        }
        SharedPreferences.Editor edit = O().edit();
        edit.putString("h5", O().getString("h4", ""));
        edit.putString("h4", O().getString("h3", ""));
        edit.putString("h3", O().getString("h2", ""));
        edit.putString("h2", O().getString("h1", ""));
        edit.putString("h1", str);
        edit.commit();
    }

    public String s() {
        return O().getString("Language", "vi-VN");
    }

    public void s0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoCar", str);
        edit.apply();
    }

    public String t() {
        return O().getString("ListAllChannels", "");
    }

    public void t0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoHistory", str);
        edit.apply();
    }

    public String u() {
        return O().getString("ListVideoCar", "");
    }

    public void u0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoKid", str);
        edit.apply();
    }

    public String v() {
        return O().getString("ListVideoHistory", "");
    }

    public void v0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoNews", str);
        edit.apply();
    }

    public String w() {
        return O().getString("ListVideoKid", "");
    }

    public void w0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoReview", str);
        edit.apply();
    }

    public String x() {
        return O().getString("ListVideoNews", "");
    }

    public void x0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoStory", str);
        edit.apply();
    }

    public String y() {
        return O().getString("ListVideoRadio", "");
    }

    public void y0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("idvideoYoutube", str);
        edit.apply();
    }

    public String z() {
        return O().getString("ListVideoReview", "");
    }

    public void z0(String str) {
        SharedPreferences.Editor edit = O().edit();
        edit.putString("Language", str);
        edit.apply();
    }
}

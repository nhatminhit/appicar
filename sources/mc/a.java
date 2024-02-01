package mc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kc.e;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f21027c = "pref_app_id";

    /* renamed from: d  reason: collision with root package name */
    public static final String f21028d = "pref_language";

    /* renamed from: e  reason: collision with root package name */
    public static final String f21029e = "pref_token";

    /* renamed from: f  reason: collision with root package name */
    public static final String f21030f = "pref_refresh_token";

    /* renamed from: g  reason: collision with root package name */
    public static final String f21031g = "pref_sub_id";

    /* renamed from: h  reason: collision with root package name */
    public static final String f21032h = "pref_user_id";

    /* renamed from: i  reason: collision with root package name */
    public static final String f21033i = "pref_last_time_report";

    /* renamed from: j  reason: collision with root package name */
    public static final String f21034j = "pref_time_token_exp";

    /* renamed from: k  reason: collision with root package name */
    public static final String f21035k = "pref_tire_press_unit";

    /* renamed from: l  reason: collision with root package name */
    public static final String f21036l = "pref_tire_temp_unit";

    /* renamed from: m  reason: collision with root package name */
    public static final String f21037m = "pref_overlay";

    /* renamed from: n  reason: collision with root package name */
    public static final String f21038n = "pref_sound_alert";

    /* renamed from: o  reason: collision with root package name */
    public static final String f21039o = "pref_vibration_alert";

    /* renamed from: p  reason: collision with root package name */
    public static final String f21040p = "pref_tire_press_max_v2";

    /* renamed from: q  reason: collision with root package name */
    public static final String f21041q = "pref_tire_press_min_v2";

    /* renamed from: r  reason: collision with root package name */
    public static final String f21042r = "pref_tire_temp_max_v2";

    /* renamed from: s  reason: collision with root package name */
    public static final String f21043s = "pref_device_bluetooth";

    /* renamed from: t  reason: collision with root package name */
    public static final String f21044t = "product_type";

    /* renamed from: a  reason: collision with root package name */
    public Context f21045a;

    /* renamed from: b  reason: collision with root package name */
    public xc.a f21046b = new xc.a();

    public a(Context context) {
        this.f21045a = context;
    }

    public void A(e eVar) {
        SharedPreferences.Editor edit = k().edit();
        new xc.a();
        edit.putString(f21044t, xc.a.a(eVar));
        edit.apply();
    }

    public void B(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21030f, str);
        edit.apply();
    }

    public void C(boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean(f21038n, z10);
        edit.apply();
    }

    public void D(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21031g, str);
        edit.apply();
    }

    public void E(int i10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putInt(f21042r, i10);
        edit.apply();
    }

    public void F(int i10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putInt(f21036l, i10);
        edit.apply();
    }

    public void G(long j10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putLong(f21034j, j10);
        edit.apply();
    }

    public void H(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21029e, str);
        edit.apply();
    }

    public void I(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21032h, str);
        edit.apply();
    }

    public void J(boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean(f21039o, z10);
        edit.apply();
    }

    public void a() {
        String string = k().getString("pref_app_id", "");
        SharedPreferences.Editor edit = k().edit();
        edit.clear();
        edit.apply();
        edit.putString("pref_app_id", string);
        edit.apply();
    }

    public String b() {
        return k().getString(f21043s, "");
    }

    public String c() {
        return k().getString(f21028d, "vi");
    }

    public long d() {
        return k().getLong(f21033i, 0);
    }

    public boolean e() {
        return k().getBoolean(f21037m, false);
    }

    public float f() {
        return k().getFloat(f21040p, 3.2f);
    }

    public float g() {
        return k().getFloat(f21041q, 1.8f);
    }

    public int h() {
        return k().getInt(f21035k, 0);
    }

    public e i() {
        String string = k().getString(f21044t, "");
        if (string.equals("")) {
            return null;
        }
        new xc.a();
        return (e) xc.a.c(string, e.class);
    }

    public String j() {
        return k().getString(f21030f, "");
    }

    public SharedPreferences k() {
        return PreferenceManager.getDefaultSharedPreferences(this.f21045a);
    }

    public boolean l() {
        return k().getBoolean(f21038n, false);
    }

    public String m() {
        return k().getString(f21031g, "");
    }

    public int n() {
        return k().getInt(f21042r, 70);
    }

    public int o() {
        return k().getInt(f21036l, 0);
    }

    public long p() {
        return k().getLong(f21034j, 0);
    }

    public String q() {
        return k().getString(f21029e, "");
    }

    public String r() {
        return k().getString(f21032h, "");
    }

    public boolean s() {
        return k().getBoolean(f21039o, false);
    }

    public void t(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21043s, str);
        edit.apply();
    }

    public void u(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f21028d, str);
        edit.apply();
    }

    public void v(long j10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putLong(f21033i, j10);
        edit.apply();
    }

    public void w(boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean(f21037m, z10);
        edit.apply();
    }

    public void x(float f10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putFloat(f21040p, f10);
        edit.apply();
    }

    public void y(float f10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putFloat(f21041q, f10);
        edit.apply();
    }

    public void z(int i10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putInt(f21035k, i10);
        edit.apply();
    }
}

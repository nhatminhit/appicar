package di;

import android.content.Context;
import android.content.SharedPreferences;
import ci.d;

public class a extends mc.a {

    /* renamed from: u  reason: collision with root package name */
    public static final int f18401u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final String f18402v = "pref_auth_option";

    /* renamed from: w  reason: collision with root package name */
    public static final String f18403w = "pref_auth";

    /* renamed from: x  reason: collision with root package name */
    public static final String f18404x = "pref_phone_number";

    /* renamed from: y  reason: collision with root package name */
    public static final String f18405y = "CHECK_BOX";

    public a(Context context) {
        super(context);
    }

    public d K() {
        String string = k().getString(f18403w, "");
        if (string.equals("")) {
            return null;
        }
        return (d) xc.a.c(string, d.class);
    }

    public int L() {
        return k().getInt(f18402v, 1);
    }

    public boolean M() {
        return k().getBoolean(f18405y, false);
    }

    public String N() {
        return k().getString(f18404x, "0000000000");
    }

    public boolean O() {
        return !q().equals("");
    }

    public void P(d dVar) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f18403w, xc.a.a(dVar));
        edit.apply();
    }

    public void Q(int i10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putInt(f18402v, i10);
        edit.apply();
    }

    public void R(boolean z10) {
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean(f18405y, z10);
        edit.apply();
    }

    public void S(String str) {
        SharedPreferences.Editor edit = k().edit();
        edit.putString(f18404x, str);
        edit.apply();
    }
}

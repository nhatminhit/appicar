package h0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import d.m0;
import i0.l;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8400a = "android.support.AppLaunchChecker";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8401b = "startedFromLauncher";

    public static boolean a(@m0 Context context) {
        return context.getSharedPreferences(f8400a, 0).getBoolean(f8401b, false);
    }

    public static void b(@m0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f8400a, 0);
        if (sharedPreferences.getBoolean(f8401b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(l.f8976e)) {
            sharedPreferences.edit().putBoolean(f8401b, true).apply();
        }
    }
}

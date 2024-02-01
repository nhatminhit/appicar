package h0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import d.m0;
import d.o0;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8735a = "NavUtils";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8736b = "android.support.PARENT_ACTIVITY";

    @o0
    public static Intent a(@m0 Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String d10 = d(activity);
        if (d10 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d10);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getParentActivityIntent: bad parentActivityName '");
            sb2.append(d10);
            sb2.append("' in manifest");
            return null;
        }
    }

    @o0
    public static Intent b(@m0 Context context, @m0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e10 = e(context, componentName);
        if (e10 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e10);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @o0
    public static Intent c(@m0 Context context, @m0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e10 = e(context, new ComponentName(context, cls));
        if (e10 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e10);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @o0
    public static String d(@m0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @o0
    public static String e(@m0 Context context, @m0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 640;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f8736b)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void f(@m0 Activity activity) {
        Intent a10 = a(activity);
        if (a10 != null) {
            g(activity, a10);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@m0 Activity activity, @m0 Intent intent) {
        activity.navigateUpTo(intent);
    }

    public static boolean h(@m0 Activity activity, @m0 Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}

package sj;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import i0.d;
import vn.icar.entertaiment.R;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23056a = 2525;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23057b = 2526;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23058c = 2527;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23059d = 2528;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23060e = 2529;

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity O;

        public a(Activity activity) {
            this.O = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            h0.b.D(this.O, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, h.f23056a);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity O;

        public b(Activity activity) {
            this.O = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            this.O.finish();
        }
    }

    public static boolean a(Activity activity) {
        if (Build.VERSION.SDK_INT < 30) {
            return d(activity);
        }
        if (Environment.isExternalStorageManager()) {
            return d(activity);
        }
        e(activity);
        return false;
    }

    public static boolean b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (!activity.getPackageManager().canRequestPackageInstalls()) {
                activity.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse(String.format("package:%s", new Object[]{activity.getPackageName()}))), f23057b);
            } else if (a(activity)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Activity activity) {
        if (!((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            activity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), f23058c);
            return false;
        } else if (d.a(activity, "android.permission.RECORD_AUDIO") == 0) {
            return true;
        } else {
            h0.b.D(activity, new String[]{"android.permission.RECORD_AUDIO"}, f23059d);
            return false;
        }
    }

    public static boolean d(Activity activity) {
        if (d.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") + d.a(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        if (h0.b.J(activity, "android.permission.WRITE_EXTERNAL_STORAGE") || h0.b.J(activity, "android.permission.READ_EXTERNAL_STORAGE")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(R.string.you_have_not_granted_enough_permissions);
            builder.setMessage(R.string.content_permissions);
            builder.setPositiveButton(R.string.ok, new a(activity));
            builder.setNegativeButton("Cancel", new b(activity));
            builder.create().show();
            return false;
        }
        h0.b.D(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, f23056a);
        return false;
    }

    public static void e(Activity activity) {
        try {
            Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse(String.format("package:%s", new Object[]{activity.getApplicationContext().getPackageName()})));
            activity.startActivityForResult(intent, f23060e);
        } catch (Exception unused) {
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
            activity.startActivityForResult(intent2, f23060e);
        }
    }
}

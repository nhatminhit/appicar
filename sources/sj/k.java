package sj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import eb.j;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.regex.Pattern;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.view.activity.LoginActivity;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ErrorDialog f23089a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f23090b = "";

    public class a implements Runnable {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void run() {
            this.O.setClickable(true);
        }
    }

    public class b implements ErrorDialog.a {
        public final /* synthetic */ Context O;

        public b(Context context) {
            this.O = context;
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
            new di.a(this.O).a();
            ad.d.c("ContentValues", "refreshToken 401: chuyển sang đăng nhâp");
            RemoteService.D();
            this.O.startActivity(new Intent(this.O, LoginActivity.class));
            ((Activity) this.O).finish();
        }

        public void v(ErrorDialog errorDialog) {
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ View O;

        public c(View view) {
            this.O = view;
        }

        public void run() {
            this.O.setClickable(true);
        }
    }

    public static class d extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public pj.e f23091a;

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            } catch (IOException unused) {
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            this.f23091a.a(bitmap);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final char[] f23092a = {192, 193, 194, 195, 200, 201, 202, 204, 205, 210, 211, 212, 213, 217, 218, 221, 224, 225, 226, 227, 232, 233, 234, j.f18559e, j.f18560f, lb.d.f20445j, lb.d.f20446k, lb.d.f20447l, 245, 249, 250, 253, 258, 259, 272, 273, 296, 297, 360, 361, 416, 417, 431, 432, 7840, 7841, 7842, 7843, 7844, 7845, 7846, 7847, 7848, 7849, 7850, 7851, 7852, 7853, 7854, 7855, 7856, 7857, 7858, 7859, 7860, 7861, 7862, 7863, 7864, 7865, 7866, 7867, 7868, 7869, 7870, 7871, 7872, 7873, 7874, 7875, 7876, 7877, 7878, 7879, 7880, 7881, 7882, 7883, 7884, 7885, 7886, 7887, 7888, 7889, 7890, 7891, 7892, 7893, 7894, 7895, 7896, 7897, 7898, 7899, 7900, 7901, 7902, 7903, 7904, 7905, 7906, 7907, 7908, 7909, 7910, 7911, 7912, 7913, 7914, 7915, 7916, 7917, 7918, 7919, 7920, 7921};

        /* renamed from: b  reason: collision with root package name */
        public static final char[] f23093b = {'A', 'A', 'A', 'A', 'E', 'E', 'E', 'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a', 'a', 'a', 'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u', 'y', 'A', 'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'I', 'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u'};

        public static char a(char c10) {
            int binarySearch = Arrays.binarySearch(f23092a, c10);
            return binarySearch >= 0 ? f23093b[binarySearch] : c10;
        }

        public static String b(String str) {
            StringBuilder sb2 = new StringBuilder(str);
            for (int i10 = 0; i10 < sb2.length(); i10++) {
                sb2.setCharAt(i10, a(sb2.charAt(i10)));
            }
            return sb2.toString();
        }
    }

    public static int a(Context context, float f10) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((double) ((((float) displayMetrics.widthPixels) / displayMetrics.density) / f10)) + 0.5d);
    }

    public static double b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return ((double) displayMetrics.widthPixels) / ((double) displayMetrics.heightPixels);
    }

    public static void c(View view) {
        view.setClickable(false);
        view.postDelayed(new a(view), 500);
    }

    public static boolean d(String str, String str2) {
        if (str2.matches("[a-zA-Z0-9 ]+")) {
            str = e.b(str);
            str2 = e.b(str2);
        }
        String replace = str.toLowerCase().replace(" ", "");
        for (char c10 : str2.toLowerCase().replace(" ", "").toCharArray()) {
            if (!replace.contains(c10 + "")) {
                return false;
            }
            replace = replace.substring(replace.indexOf(c10));
        }
        return true;
    }

    public static void e(View view) {
        view.setClickable(false);
        view.postDelayed(new c(view), 300);
    }

    public static String f(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.getMessage();
            return String.valueOf(R.string.does_not_exist);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(android.content.Context r8) {
        /*
            java.lang.String r0 = "android.intent.category.LAUNCHER"
            vc.c r1 = vc.c.g()
            vc.a r1 = r1.d()
            java.lang.String r1 = r1.b()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case -1864985416: goto L_0x0046;
                case -1864985355: goto L_0x003b;
                case -1864985354: goto L_0x0030;
                case 326786986: goto L_0x0025;
                case 1576255573: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0050
        L_0x001a:
            java.lang.String r2 = "OWNICE C970 (+360)"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0023
            goto L_0x0050
        L_0x0023:
            r3 = 4
            goto L_0x0050
        L_0x0025:
            java.lang.String r2 = "OWNICE C970"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002e
            goto L_0x0050
        L_0x002e:
            r3 = 3
            goto L_0x0050
        L_0x0030:
            java.lang.String r2 = "ELLIVIEW U4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            r3 = 2
            goto L_0x0050
        L_0x003b:
            java.lang.String r2 = "ELLIVIEW U3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0044
            goto L_0x0050
        L_0x0044:
            r3 = 1
            goto L_0x0050
        L_0x0046:
            java.lang.String r2 = "ELLIVIEW S4"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            java.lang.String r1 = "android.intent.category.HOME"
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r4 = "android.intent.action.MAIN"
            switch(r3) {
                case 0: goto L_0x0072;
                case 1: goto L_0x0072;
                case 2: goto L_0x0072;
                case 3: goto L_0x006a;
                case 4: goto L_0x006a;
                default: goto L_0x0059;
            }
        L_0x0059:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
        L_0x005e:
            android.content.Intent r0 = r0.addCategory(r1)
            android.content.Intent r0 = r0.setFlags(r2)
            r8.startActivity(r0)
            goto L_0x00be
        L_0x006a:
            vn.tw.service.xt.TWCommand r8 = vn.tw.service.xt.TWCommand.getInstance()
            r8.goHome()
            goto L_0x00be
        L_0x0072:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0090 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0090 }
            android.content.Intent r3 = r3.addCategory(r0)     // Catch:{ Exception -> 0x0090 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Exception -> 0x0090 }
            java.lang.String r6 = "com.android.launcher4"
            java.lang.String r7 = "com.android.launcher4.Launcher"
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x0090 }
            android.content.Intent r3 = r3.setComponent(r5)     // Catch:{ Exception -> 0x0090 }
            android.content.Intent r3 = r3.setFlags(r2)     // Catch:{ Exception -> 0x0090 }
            r8.startActivity(r3)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00b8
        L_0x0090:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00ae }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ae }
            android.content.Intent r0 = r3.addCategory(r0)     // Catch:{ Exception -> 0x00ae }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Exception -> 0x00ae }
            java.lang.String r5 = "com.android.launcher3"
            java.lang.String r6 = "com.android.launcher3.Launcher"
            r3.<init>(r5, r6)     // Catch:{ Exception -> 0x00ae }
            android.content.Intent r0 = r0.setComponent(r3)     // Catch:{ Exception -> 0x00ae }
            android.content.Intent r0 = r0.setFlags(r2)     // Catch:{ Exception -> 0x00ae }
            r8.startActivity(r0)     // Catch:{ Exception -> 0x00ae }
            goto L_0x00b8
        L_0x00ae:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "ContentValues"
            ad.d.c(r3, r0)
        L_0x00b8:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            goto L_0x005e
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.k.g(android.content.Context):void");
    }

    public static void h(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static boolean i(String str, String str2) {
        return Pattern.compile(str2).matcher(str).find();
    }

    public static boolean j(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void k() {
        ErrorDialog errorDialog = f23089a;
        if (errorDialog != null && errorDialog.isShowing()) {
            f23089a.cancel();
        }
    }

    public static void l(Context context, String str, ErrorDialog.a aVar, boolean z10) {
        ErrorDialog errorDialog;
        ErrorDialog errorDialog2 = f23089a;
        if (errorDialog2 == null || !errorDialog2.isShowing()) {
            f23090b = str;
            errorDialog = new ErrorDialog(context, aVar);
        } else if (!f23090b.equals(str)) {
            f23090b = str;
            f23089a.cancel();
            errorDialog = new ErrorDialog(context, aVar);
        } else {
            return;
        }
        f23089a = errorDialog;
        errorDialog.k(str).n(z10).show();
    }

    public static void m(Context context, String str) {
        RemoteService.D();
        ErrorDialog l10 = new ErrorDialog(context, new b(context)).m("Thông báo").l("Ok");
        if (str.equals("")) {
            str = "Hết phiên đăng nhập, vui lòng gia hạn thêm thời gian sử dụng!";
        }
        l10.k(str).n(false).show();
    }
}

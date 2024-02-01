package sj;

import android.app.ActivityManager;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.c;
import h0.k2;
import h0.u0;
import java.util.List;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f23052a = "DownloadUtil";

    /* renamed from: b  reason: collision with root package name */
    public static NotificationManager f23053b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23054c = 69;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f23055d = false;

    public class a extends Thread {
        public final /* synthetic */ String O;
        public final /* synthetic */ Context P;
        public final /* synthetic */ String Q;
        public final /* synthetic */ u0.g R;
        public final /* synthetic */ ProgressBar S;
        public final /* synthetic */ k2 T;
        public final /* synthetic */ Dialog U;
        public final /* synthetic */ String[] V;

        public a(String str, Context context, String str2, u0.g gVar, ProgressBar progressBar, k2 k2Var, Dialog dialog, String[] strArr) {
            this.O = str;
            this.P = context;
            this.Q = str2;
            this.R = gVar;
            this.S = progressBar;
            this.T = k2Var;
            this.U = dialog;
            this.V = strArr;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:5|6|7|(2:9|10)(2:11|12)|13|14|(2:15|(3:17|(2:19|55)(1:56)|20)(1:54))|21|(1:23)(1:24)|25|26|53) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0075 */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0149  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00cd A[EDGE_INSN: B:54:0x00cd->B:21:0x00cd ?: BREAK  , SYNTHETIC] */
        @android.annotation.SuppressLint({"ObsoleteSdkInt"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                r1 = r15
                r2 = 1
                sj.f.f23055d = r2
                r3 = 0
                r0 = r3
                r4 = r0
            L_0x0007:
                r5 = -1
                if (r0 != 0) goto L_0x011a
                r7 = 3
                if (r4 >= r7) goto L_0x011a
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x010c }
                java.lang.String r7 = r1.O     // Catch:{ Exception -> 0x010c }
                r0.<init>(r7)     // Catch:{ Exception -> 0x010c }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x010c }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x010c }
                java.lang.String r7 = "GET"
                r0.setRequestMethod(r7)     // Catch:{ Exception -> 0x010c }
                r0.setDoOutput(r2)     // Catch:{ Exception -> 0x010c }
                r0.connect()     // Catch:{ Exception -> 0x010c }
                int r7 = r0.getContentLength()     // Catch:{ Exception -> 0x010c }
                java.lang.String r8 = "/mnt/sdcard/Download/"
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x010c }
                r9.<init>(r8)     // Catch:{ Exception -> 0x010c }
                r9.mkdirs()     // Catch:{ Exception -> 0x010c }
                r8 = 0
                int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x010c }
                r11 = 30
                java.lang.String r12 = ".apk"
                if (r10 < r11) goto L_0x005e
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0075 }
                android.content.Context r10 = r1.P     // Catch:{ Exception -> 0x0075 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
                r11.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r13 = r1.Q     // Catch:{ Exception -> 0x0075 }
                r11.append(r13)     // Catch:{ Exception -> 0x0075 }
                r11.append(r12)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0075 }
                java.io.File r10 = r10.getFileStreamPath(r11)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r10 = r10.getPath()     // Catch:{ Exception -> 0x0075 }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0075 }
                r8 = r9
                goto L_0x0075
            L_0x005e:
                java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0075 }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
                r11.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r13 = r1.Q     // Catch:{ Exception -> 0x0075 }
                r11.append(r13)     // Catch:{ Exception -> 0x0075 }
                r11.append(r12)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0075 }
                r10.<init>(r9, r11)     // Catch:{ Exception -> 0x0075 }
                r8 = r10
            L_0x0075:
                java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010c }
                r9.<init>(r8)     // Catch:{ Exception -> 0x010c }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x010c }
                r10 = 1024(0x400, float:1.435E-42)
                byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x010c }
                r11 = 0
                r13 = r3
            L_0x0085:
                int r14 = r0.read(r10)     // Catch:{ Exception -> 0x010c }
                if (r14 == r5) goto L_0x00cd
                long r5 = (long) r14     // Catch:{ Exception -> 0x010c }
                long r11 = r11 + r5
                r9.write(r10, r3, r14)     // Catch:{ Exception -> 0x010c }
                r5 = 100
                long r5 = r5 * r11
                long r2 = (long) r7     // Catch:{ Exception -> 0x010c }
                long r5 = r5 / r2
                int r2 = (int) r5     // Catch:{ Exception -> 0x010c }
                if (r2 <= r13) goto L_0x00c9
                h0.u0$g r3 = r1.R     // Catch:{ Exception -> 0x010c }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010c }
                r5.<init>()     // Catch:{ Exception -> 0x010c }
                r5.append(r2)     // Catch:{ Exception -> 0x010c }
                java.lang.String r6 = "%"
                r5.append(r6)     // Catch:{ Exception -> 0x010c }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x010c }
                r3.N(r5)     // Catch:{ Exception -> 0x010c }
                android.widget.ProgressBar r3 = r1.S     // Catch:{ Exception -> 0x010c }
                r3.setProgress(r2)     // Catch:{ Exception -> 0x010c }
                h0.u0$g r3 = r1.R     // Catch:{ Exception -> 0x010c }
                r5 = 100
                r6 = 0
                r3.j0(r5, r2, r6)     // Catch:{ Exception -> 0x010c }
                h0.k2 r3 = r1.T     // Catch:{ Exception -> 0x010c }
                h0.u0$g r5 = r1.R     // Catch:{ Exception -> 0x010c }
                android.app.Notification r5 = r5.h()     // Catch:{ Exception -> 0x010c }
                r6 = 69
                r3.C(r6, r5)     // Catch:{ Exception -> 0x010c }
                r13 = r2
            L_0x00c9:
                r2 = 1
                r3 = 0
                r5 = -1
                goto L_0x0085
            L_0x00cd:
                r9.close()     // Catch:{ Exception -> 0x010c }
                r0.close()     // Catch:{ Exception -> 0x010c }
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x010c }
                r2 = 24
                if (r0 < r2) goto L_0x00f0
                android.content.Context r0 = r1.P     // Catch:{ Exception -> 0x010c }
                java.lang.String r2 = "vn.icar.entertaiment.fileprovider"
                android.net.Uri r0 = androidx.core.content.FileProvider.e(r0, r2, r8)     // Catch:{ Exception -> 0x010c }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "android.intent.action.INSTALL_PACKAGE"
                r2.<init>(r3)     // Catch:{ Exception -> 0x010c }
                r2.setData(r0)     // Catch:{ Exception -> 0x010c }
                r3 = 1
                r2.setFlags(r3)     // Catch:{ Exception -> 0x010c }
                goto L_0x0105
            L_0x00f0:
                android.net.Uri r0 = android.net.Uri.fromFile(r8)     // Catch:{ Exception -> 0x010c }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "android.intent.action.VIEW"
                r2.<init>(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "application/vnd.android.package-archive"
                r2.setDataAndType(r0, r3)     // Catch:{ Exception -> 0x010c }
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                r2.setFlags(r0)     // Catch:{ Exception -> 0x010c }
            L_0x0105:
                android.content.Context r0 = r1.P     // Catch:{ Exception -> 0x010c }
                r0.startActivity(r2)     // Catch:{ Exception -> 0x010c }
                r0 = 1
                goto L_0x0114
            L_0x010c:
                r0 = move-exception
                java.lang.String unused = sj.f.f23052a
                r0.getMessage()
                r0 = 0
            L_0x0114:
                int r4 = r4 + 1
                r2 = 1
                r3 = 0
                goto L_0x0007
            L_0x011a:
                android.widget.ProgressBar r2 = r1.S
                r3 = 4
                r2.setVisibility(r3)
                android.app.NotificationManager r2 = sj.f.f23053b     // Catch:{ Exception -> 0x012a }
                r3 = 69
                r2.cancel(r3)     // Catch:{ Exception -> 0x012c }
                goto L_0x0131
            L_0x012a:
                r3 = 69
            L_0x012c:
                android.content.Context r2 = r1.P
                sj.f.g(r2, r3)
            L_0x0131:
                android.app.Dialog r2 = r1.U
                r2.dismiss()
                java.lang.String[] r2 = r1.V
                java.lang.String r3 = r1.Q
                r4 = 0
                r2[r4] = r3
                android.content.Context r2 = r1.P
                android.content.res.Resources r2 = r2.getResources()
                if (r0 == 0) goto L_0x0149
                r3 = 2131820638(0x7f11005e, float:1.9273997E38)
                goto L_0x014c
            L_0x0149:
                r3 = 2131820637(0x7f11005d, float:1.9273995E38)
            L_0x014c:
                java.lang.String r2 = r2.getString(r3)
                if (r0 == 0) goto L_0x0156
                r0 = 17301634(0x1080082, float:2.497962E-38)
                goto L_0x0159
            L_0x0156:
                r0 = 17301624(0x1080078, float:2.497959E-38)
            L_0x0159:
                h0.u0$g r3 = r1.R
                java.lang.String[] r4 = r1.V
                r5 = 0
                r4 = r4[r5]
                r3.O(r4)
                h0.u0$g r3 = r1.R
                r4 = 2
                r3.i0(r4)
                h0.u0$g r3 = r1.R
                r3.r0(r0)
                h0.u0$g r0 = r1.R
                r0.g0(r5)
                h0.u0$g r0 = r1.R
                r3 = 1
                r0.C(r3)
                h0.u0$g r0 = r1.R
                r0.N(r2)
                h0.u0$g r0 = r1.R
                r2 = -1
                r0.i0(r2)
                h0.u0$g r0 = r1.R
                r0.j0(r5, r5, r5)
                h0.k2 r0 = r1.T
                java.util.Date r2 = new java.util.Date
                r2.<init>()
                long r2 = r2.getTime()
                int r2 = (int) r2
                h0.u0$g r3 = r1.R
                android.app.Notification r3 = r3.h()
                r0.C(r2, r3)
                sj.f.f23055d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.f.a.run():void");
        }
    }

    public static u0.g c(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, "ICAR APP MANAGER", 2);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            f23053b = notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        return new u0.g(context, str);
    }

    public static boolean d(Context context, String str) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return Boolean.valueOf(runningAppProcessInfo.importance != 100).booleanValue();
    }

    public static boolean e(Context context, String str) {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService(c.f1244r)).getRunningTasks(context.getPackageManager().getInstalledPackages(128).size());
        if (!runningTasks.isEmpty()) {
            for (int i10 = 0; i10 < runningTasks.size(); i10++) {
                ComponentName componentName = runningTasks.get(i10).topActivity;
            }
        }
        return false;
    }

    public static boolean f(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void g(Context context, int i10) {
        ((NotificationManager) context.getApplicationContext().getSystemService("notification")).cancel(i10);
    }

    public static void h(Context context, String str, String str2, ProgressBar progressBar, Dialog dialog) {
        if (str.equals("")) {
            Toast.makeText(context, R.string.link_not_found, 1).show();
            return;
        }
        k2 p10 = k2.p(context);
        String[] strArr = {context.getResources().getString(R.string.start_downloading)};
        PendingIntent activity = PendingIntent.getActivity(context, 69, new Intent(context, HomeActivity.class), 134217728);
        u0.g c10 = c(context, "downloader_channel");
        c10.M(activity);
        c10.z0(context.getResources().getString(R.string.loading_application_from_server));
        c10.i0(2);
        c10.g0(true);
        c10.C(false);
        c10.r0(17301633);
        c10.O(strArr[0]);
        c10.N("0%");
        c10.j0(100, 0, false);
        p10.C(69, c10.h());
        progressBar.setVisibility(0);
        new a(str, context, str2, c10, progressBar, p10, dialog, strArr).start();
    }
}

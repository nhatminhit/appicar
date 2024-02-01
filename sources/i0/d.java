package i0;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.t;
import d.t0;
import d.u;
import h0.u0;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import w7.s;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8967a = "ContextCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8968b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8969c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static TypedValue f8970d;

    @t0(16)
    public static class a {
        @t
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @t
        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @t0(19)
    public static class b {
        @t
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @t
        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @t
        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    @t0(21)
    public static class c {
        @t
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @t
        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        @t
        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @t0(23)
    /* renamed from: i0.d$d  reason: collision with other inner class name */
    public static class C0149d {
        @t
        public static int a(Context context, int i10) {
            return context.getColor(i10);
        }

        @t
        public static ColorStateList b(Context context, int i10) {
            return context.getColorStateList(i10);
        }

        @t
        public static <T> T c(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @t
        public static String d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @t0(24)
    public static class e {
        @t
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @t
        public static File b(Context context) {
            return context.getDataDir();
        }

        @t
        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @t0(26)
    public static class f {
        @t
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @t0(28)
    public static class g {
        @t
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    @t0(30)
    public static class h {
        @t
        public static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<Class<?>, String> f8971a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f8971a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, androidx.appcompat.widget.c.f1244r);
            hashMap.put(AlarmManager.class, u0.f8536t0);
            hashMap.put(AudioManager.class, s.f14801b);
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    public static int a(@m0 Context context, @m0 String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    @o0
    public static Context b(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File c(java.io.File r3) {
        /*
            java.lang.Object r0 = f8969c
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0024 }
            r1.append(r2)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.d.c(java.io.File):java.io.File");
    }

    @o0
    public static String d(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    public static File e(@m0 Context context) {
        return c.a(context);
    }

    @l
    public static int f(@m0 Context context, @n int i10) {
        return C0149d.a(context, i10);
    }

    @o0
    public static ColorStateList g(@m0 Context context, @n int i10) {
        return k0.g.e(context.getResources(), i10, context.getTheme());
    }

    @o0
    public static File h(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @o0
    public static Drawable i(@m0 Context context, @u int i10) {
        return c.b(context, i10);
    }

    @m0
    public static File[] j(@m0 Context context) {
        return b.a(context);
    }

    @m0
    public static File[] k(@m0 Context context, @o0 String str) {
        return b.b(context, str);
    }

    public static Executor l(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : x0.f.a(new Handler(context.getMainLooper()));
    }

    @o0
    public static File m(@m0 Context context) {
        return c.c(context);
    }

    @m0
    public static File[] n(@m0 Context context) {
        return b.c(context);
    }

    @o0
    public static <T> T o(@m0 Context context, @m0 Class<T> cls) {
        return C0149d.c(context, cls);
    }

    @o0
    public static String p(@m0 Context context, @m0 Class<?> cls) {
        return C0149d.d(context, cls);
    }

    public static boolean q(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(context);
        }
        return false;
    }

    public static boolean r(@m0 Context context, @m0 Intent[] intentArr) {
        return s(context, intentArr, (Bundle) null);
    }

    public static boolean s(@m0 Context context, @m0 Intent[] intentArr, @o0 Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void t(@m0 Context context, @m0 Intent intent, @o0 Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void u(@m0 Context context, @m0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

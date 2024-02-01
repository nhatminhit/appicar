package d8;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.ConnectionResult;
import d.m0;
import d.o0;
import e8.a;
import j8.k;
import j8.s;
import j8.w;
import java.util.concurrent.atomic.AtomicBoolean;
import va.e;
import w8.c0;
import w8.d0;
import w8.l;
import w8.v;

@a
@w
public class j {
    @a
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f6608a = 12451000;
    @a
    @Deprecated
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f6609b = "com.google.android.gms";
    @a
    @m0

    /* renamed from: c  reason: collision with root package name */
    public static final String f6610c = "com.google.android.play.games";
    @a
    @m0

    /* renamed from: d  reason: collision with root package name */
    public static final String f6611d = "com.android.vending";
    @a

    /* renamed from: e  reason: collision with root package name */
    public static final int f6612e = 39789;
    @a

    /* renamed from: f  reason: collision with root package name */
    public static final int f6613f = 10436;
    @a
    @d0

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicBoolean f6614g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    public static boolean f6615h = false;
    @d0

    /* renamed from: i  reason: collision with root package name */
    public static boolean f6616i = false;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicBoolean f6617j = new AtomicBoolean();

    @a
    @Deprecated
    public static void a(@m0 Context context) {
        if (!f6614g.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(f6613f);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @a
    @w
    public static void b() {
        f6617j.set(true);
    }

    @a
    @Deprecated
    public static void c(@m0 Context context, int i10) throws h, g {
        int k10 = f.i().k(context, i10);
        if (k10 != 0) {
            Intent e10 = f.i().e(context, k10, e.f23523d);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(k10);
            if (e10 == null) {
                throw new g(k10);
            }
            throw new h(k10, "Google Play Services not available", e10);
        }
    }

    @a
    @w
    @Deprecated
    public static int d(@m0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @a
    @w
    @Deprecated
    public static int e(@m0 Context context) {
        s.r(true);
        return w8.e.a(context, context.getPackageName());
    }

    @a
    @o0
    @Deprecated
    public static PendingIntent f(int i10, @m0 Context context, int i11) {
        return f.i().f(context, i10, i11);
    }

    @a
    @m0
    @Deprecated
    @d0
    public static String g(int i10) {
        return ConnectionResult.p1(i10);
    }

    @a
    @o0
    @w
    @Deprecated
    public static Intent h(int i10) {
        return f.i().e((Context) null, i10, (String) null);
    }

    @a
    @o0
    public static Context i(@m0 Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @a
    @o0
    public static Resources j(@m0 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @a
    @w
    public static boolean k(@m0 Context context) {
        if (!f6616i) {
            try {
                PackageInfo f10 = y8.e.a(context).f("com.google.android.gms", 64);
                k.a(context);
                if (f10 == null || k.f(f10, false) || !k.f(f10, true)) {
                    f6615h = false;
                } else {
                    f6615h = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th2) {
                f6616i = true;
                throw th2;
            }
            f6616i = true;
        }
        return f6615h || !l.j();
    }

    @a
    @k
    @Deprecated
    public static int l(@m0 Context context) {
        return m(context, f6608a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    @e8.a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m(@d.m0 android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0009 }
            int r1 = d8.q.b.common_google_play_services_unknown_issue     // Catch:{ all -> 0x0009 }
            r0.getString(r1)     // Catch:{ all -> 0x0009 }
        L_0x0009:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicBoolean r0 = f6617j
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            int r0 = j8.j1.a(r9)
            if (r0 == 0) goto L_0x002f
            int r2 = f6608a
            if (r0 != r2) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0035:
            boolean r0 = w8.l.l(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0045
            boolean r0 = w8.l.n(r9)
            if (r0 != 0) goto L_0x0045
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r10 < 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            j8.s.a(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L_0x006f
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0063 }
            goto L_0x0070
        L_0x0063:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
        L_0x0069:
            r9.concat(r10)
            r2 = r6
            goto L_0x0108
        L_0x006f:
            r7 = 0
        L_0x0070:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch:{ NameNotFoundException -> 0x00ff }
            d8.k.a(r9)
            boolean r9 = d8.k.f(r8, r2)
            if (r9 != 0) goto L_0x0086
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            goto L_0x0069
        L_0x0086:
            if (r0 == 0) goto L_0x0098
            j8.s.l(r7)
            boolean r9 = d8.k.f(r7, r2)
            if (r9 != 0) goto L_0x0098
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0069
        L_0x0098:
            if (r0 == 0) goto L_0x00b1
            if (r7 == 0) goto L_0x00b1
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b1
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x0069
        L_0x00b1:
            int r9 = r8.versionCode
            int r9 = w8.f0.a(r9)
            int r0 = w8.f0.a(r10)
            if (r9 >= r0) goto L_0x00de
            int r9 = r8.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Google Play services out of date for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            r2 = 2
            goto L_0x0108
        L_0x00de:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x00f8
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00e7 }
            goto L_0x00f8
        L_0x00e7:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.wtf(r0, r10, r9)
            goto L_0x0108
        L_0x00f8:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x00fe
            r2 = 3
            goto L_0x0108
        L_0x00fe:
            return r3
        L_0x00ff:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.j.m(android.content.Context, int):int");
    }

    @a
    @Deprecated
    public static boolean n(@m0 Context context, int i10) {
        return c0.a(context, i10);
    }

    @a
    @w
    @Deprecated
    public static boolean o(@m0 Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return u(context, "com.google.android.gms");
        }
        return false;
    }

    @a
    @w
    @Deprecated
    public static boolean p(@m0 Context context, int i10) {
        if (i10 == 9) {
            return u(context, "com.android.vending");
        }
        return false;
    }

    @a
    @TargetApi(18)
    public static boolean q(@m0 Context context) {
        if (!v.g()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        s.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @a
    @w
    @Deprecated
    @d0
    public static boolean r(@m0 Context context) {
        return l.f(context);
    }

    @a
    @Deprecated
    public static boolean s(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @a
    @TargetApi(19)
    @Deprecated
    public static boolean t(@m0 Context context, int i10, @m0 String str) {
        return c0.b(context, i10, str);
    }

    @TargetApi(21)
    public static boolean u(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (v.j()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !q(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}

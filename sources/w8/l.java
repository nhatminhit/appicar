package w8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import d.m0;
import d.o0;
import d8.j;
import e8.a;

@a
public final class l {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f14904a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f14905b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f14906c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f14907d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f14908e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public static Boolean f14909f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f14910g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f14911h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f14912i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f14913j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public static Boolean f14914k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f14915l;

    @a
    public static boolean a(@m0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f14912i == null) {
            boolean z10 = false;
            if (v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f14912i = Boolean.valueOf(z10);
        }
        return f14912i.booleanValue();
    }

    @a
    public static boolean b(@m0 Context context) {
        if (f14915l == null) {
            boolean z10 = false;
            if (v.q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z10 = true;
            }
            f14915l = Boolean.valueOf(z10);
        }
        return f14915l.booleanValue();
    }

    @a
    public static boolean c(@m0 Context context) {
        if (f14909f == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f14909f = Boolean.valueOf(z10);
        }
        return f14909f.booleanValue();
    }

    @a
    public static boolean d(@m0 Context context) {
        if (f14904a == null) {
            boolean z10 = false;
            if (!g(context) && !k(context) && !n(context)) {
                if (f14911h == null) {
                    f14911h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!f14911h.booleanValue() && !a(context) && !i(context)) {
                    if (f14914k == null) {
                        f14914k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!f14914k.booleanValue() && !b(context)) {
                        z10 = true;
                    }
                }
            }
            f14904a = Boolean.valueOf(z10);
        }
        return f14904a.booleanValue();
    }

    @a
    public static boolean e(@m0 Context context) {
        return o(context.getResources());
    }

    @a
    @TargetApi(21)
    public static boolean f(@m0 Context context) {
        return m(context);
    }

    @a
    public static boolean g(@m0 Context context) {
        return h(context.getResources());
    }

    @a
    public static boolean h(@m0 Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f14905b == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || o(resources)) {
                z10 = true;
            }
            f14905b = Boolean.valueOf(z10);
        }
        return f14905b.booleanValue();
    }

    @a
    public static boolean i(@m0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f14913j == null) {
            boolean z10 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z10 = false;
            }
            f14913j = Boolean.valueOf(z10);
        }
        return f14913j.booleanValue();
    }

    @a
    public static boolean j() {
        int i10 = j.f6608a;
        return "user".equals(Build.TYPE);
    }

    @a
    @TargetApi(20)
    public static boolean k(@m0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f14907d == null) {
            boolean z10 = false;
            if (v.i() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f14907d = Boolean.valueOf(z10);
        }
        return f14907d.booleanValue();
    }

    @a
    @TargetApi(26)
    public static boolean l(@m0 Context context) {
        if (k(context) && !v.m()) {
            return true;
        }
        if (m(context)) {
            return !v.n() || v.q();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean m(@m0 Context context) {
        if (f14908e == null) {
            boolean z10 = false;
            if (v.j() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f14908e = Boolean.valueOf(z10);
        }
        return f14908e.booleanValue();
    }

    public static boolean n(@m0 Context context) {
        if (f14910g == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f14910g = Boolean.valueOf(z10);
        }
        return f14910g.booleanValue();
    }

    public static boolean o(@m0 Resources resources) {
        boolean z10 = false;
        if (resources == null) {
            return false;
        }
        if (f14906c == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z10 = true;
            }
            f14906c = Boolean.valueOf(z10);
        }
        return f14906c.booleanValue();
    }
}

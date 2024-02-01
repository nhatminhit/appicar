package d8;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import d.m0;
import d.o0;
import e8.a;
import j8.k;
import j8.l0;
import w8.d0;

public final class i extends j {
    @m0

    /* renamed from: k  reason: collision with root package name */
    public static final String f6604k = "GooglePlayServicesErrorDialog";
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f6605l = j.f6608a;
    @Deprecated
    @m0

    /* renamed from: m  reason: collision with root package name */
    public static final String f6606m = "com.google.android.gms";
    @m0

    /* renamed from: n  reason: collision with root package name */
    public static final String f6607n = "com.android.vending";

    @Deprecated
    public static void A(int i10, @m0 Context context) {
        e x10 = e.x();
        if (j.o(context, i10) || j.p(context, i10)) {
            x10.J(context);
        } else {
            x10.C(context, i10);
        }
    }

    @Deprecated
    @m0
    public static PendingIntent f(int i10, @m0 Context context, int i11) {
        return j.f(i10, context, i11);
    }

    @Deprecated
    @d0
    @m0
    public static String g(int i10) {
        return j.g(i10);
    }

    @m0
    public static Context i(@m0 Context context) {
        return j.i(context);
    }

    @m0
    public static Resources j(@m0 Context context) {
        return j.j(context);
    }

    @k
    @Deprecated
    public static int l(@m0 Context context) {
        return j.l(context);
    }

    @a
    @Deprecated
    public static int m(@m0 Context context, int i10) {
        return j.m(context, i10);
    }

    @Deprecated
    public static boolean s(int i10) {
        return j.s(i10);
    }

    @o0
    @Deprecated
    public static Dialog v(int i10, @m0 Activity activity, int i11) {
        return w(i10, activity, i11, (DialogInterface.OnCancelListener) null);
    }

    @o0
    @Deprecated
    public static Dialog w(int i10, @m0 Activity activity, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == j.o(activity, i10)) {
            i10 = 18;
        }
        return e.x().t(activity, i10, i11, onCancelListener);
    }

    @Deprecated
    public static boolean x(int i10, @m0 Activity activity, int i11) {
        return y(i10, activity, i11, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static boolean y(int i10, @m0 Activity activity, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        return z(i10, activity, (Fragment) null, i11, onCancelListener);
    }

    public static boolean z(int i10, @m0 Activity activity, @o0 Fragment fragment, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        if (true == j.o(activity, i10)) {
            i10 = 18;
        }
        e x10 = e.x();
        if (fragment == null) {
            return x10.B(activity, i10, i11, onCancelListener);
        }
        Dialog E = x10.E(activity, i10, l0.c(fragment, e.x().e(activity, i10, f.f6598d), i11), onCancelListener);
        if (E == null) {
            return false;
        }
        x10.H(activity, E, f6604k, onCancelListener);
        return true;
    }
}

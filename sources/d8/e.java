package d8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b9.d;
import b9.o;
import b9.p;
import c8.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import com.google.errorprone.annotations.RestrictedInheritance;
import d.j0;
import d.m0;
import d.o0;
import d.z;
import f8.j;
import f8.l;
import g8.f1;
import g8.h;
import g8.j1;
import h0.u0;
import h9.m;
import j8.h0;
import j8.k;
import j8.l0;
import j8.s;
import j8.w;
import java.util.ArrayList;
import java.util.Arrays;
import w8.v;
import y8.b;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {d.class, b9.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class e extends f {

    /* renamed from: h  reason: collision with root package name */
    public static final int f6590h = f.f6595a;
    @m0

    /* renamed from: i  reason: collision with root package name */
    public static final String f6591i = "com.google.android.gms";

    /* renamed from: j  reason: collision with root package name */
    public static final Object f6592j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final e f6593k = new e();
    @z("mLock")

    /* renamed from: g  reason: collision with root package name */
    public String f6594g;

    @m0
    public static final m M(@m0 l lVar, @m0 l... lVarArr) {
        s.m(lVar, "Requested API must not be null.");
        for (l m10 : lVarArr) {
            s.m(m10, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(lVarArr.length + 1);
        arrayList.add(lVar);
        arrayList.addAll(Arrays.asList(lVarArr));
        return com.google.android.gms.common.api.internal.d.y().B(arrayList);
    }

    @m0
    public static e x() {
        return f6593k;
    }

    public boolean A(@m0 Activity activity, int i10, int i11) {
        return B(activity, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    public boolean B(@m0 Activity activity, int i10, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog t10 = t(activity, i10, i11, onCancelListener);
        if (t10 == null) {
            return false;
        }
        H(activity, t10, i.f6604k, onCancelListener);
        return true;
    }

    public void C(@m0 Context context, int i10) {
        I(context, i10, (String) null, g(context, i10, 0, "n"));
    }

    public void D(@m0 Context context, @m0 ConnectionResult connectionResult) {
        I(context, connectionResult.X0(), (String) null, w(context, connectionResult));
    }

    @o0
    public final Dialog E(@m0 Context context, int i10, l0 l0Var, @o0 DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(h0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = h0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, l0Var);
        }
        String g10 = h0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)});
        new IllegalArgumentException();
        return builder.create();
    }

    @m0
    public final Dialog F(@m0 Activity activity, @m0 DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(h0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        H(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @o0
    public final zabx G(Context context, f1 f1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabx = new zabx(f1Var);
        o.v(context, zabx, intentFilter);
        zabx.a(context);
        if (n(context, "com.google.android.gms")) {
            return zabx;
        }
        f1Var.a();
        zabx.b();
        return null;
    }

    public final void H(Activity activity, Dialog dialog, String str, @o0 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.R0(dialog, onCancelListener).show(((FragmentActivity) activity).X(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.b(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void I(Context context, int i10, @o0 String str, @o0 PendingIntent pendingIntent) {
        int i11;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null});
        new IllegalArgumentException();
        if (i10 == 18) {
            J(context);
        } else if (pendingIntent != null) {
            String f10 = h0.f(context, i10);
            String e10 = h0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) s.l(context.getSystemService("notification"));
            u0.g x02 = new u0.g(context).c0(true).C(true).O(f10).x0(new u0.e().A(e10));
            if (w8.l.k(context)) {
                s.r(v.i());
                x02.r0(context.getApplicationInfo().icon).i0(2);
                if (w8.l.l(context)) {
                    x02.a(a.c.common_full_open_on_phone, resources.getString(a.e.common_open_on_phone), pendingIntent);
                } else {
                    x02.M(pendingIntent);
                }
            } else {
                x02.r0(17301642).z0(resources.getString(a.e.common_google_play_services_notification_ticker)).F0(System.currentTimeMillis()).M(pendingIntent).N(e10);
            }
            if (v.n()) {
                s.r(v.n());
                synchronized (f6592j) {
                    str2 = this.f6594g;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a10 = notificationManager.getNotificationChannel(str2);
                    String b10 = h0.b(context);
                    if (a10 == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b10, 4));
                    } else if (!b10.contentEquals(a10.getName())) {
                        a10.setName(b10);
                        notificationManager.createNotificationChannel(a10);
                    }
                }
                x02.G(str2);
            }
            Notification h10 = x02.h();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                j.f6614g.set(false);
                i11 = j.f6613f;
            } else {
                i11 = j.f6612e;
            }
            notificationManager.notify(i11, h10);
        }
    }

    public final void J(Context context) {
        new v(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean K(@m0 Activity activity, @m0 h hVar, int i10, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog E = E(activity, i10, l0.d(hVar, e(activity, i10, f.f6598d), 2), onCancelListener);
        if (E == null) {
            return false;
        }
        H(activity, E, i.f6604k, onCancelListener);
        return true;
    }

    public final boolean L(@m0 Context context, @m0 ConnectionResult connectionResult, int i10) {
        PendingIntent w10;
        if (b.a(context) || (w10 = w(context, connectionResult)) == null) {
            return false;
        }
        I(context, connectionResult.X0(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, w10, i10, true), p.f4754a | 134217728));
        return true;
    }

    @e8.a
    @w
    public int c(@m0 Context context) {
        return super.c(context);
    }

    @e8.a
    @o0
    @w
    public Intent e(@o0 Context context, int i10, @o0 String str) {
        return super.e(context, i10, str);
    }

    @o0
    public PendingIntent f(@m0 Context context, int i10, int i11) {
        return super.f(context, i10, i11);
    }

    @m0
    public final String h(int i10) {
        return super.h(i10);
    }

    @k
    public int j(@m0 Context context) {
        return super.j(context);
    }

    @e8.a
    @w
    public int k(@m0 Context context, int i10) {
        return super.k(context, i10);
    }

    public final boolean o(int i10) {
        return super.o(i10);
    }

    @m0
    public m<Void> q(@m0 j<?> jVar, @m0 j<?>... jVarArr) {
        return M(jVar, jVarArr).w(u.f6654a);
    }

    @m0
    public m<Void> r(@m0 l<?> lVar, @m0 l<?>... lVarArr) {
        return M(lVar, lVarArr).w(t.f6652a);
    }

    @o0
    public Dialog s(@m0 Activity activity, int i10, int i11) {
        return t(activity, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    @o0
    public Dialog t(@m0 Activity activity, int i10, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        return E(activity, i10, l0.b(activity, e(activity, i10, f.f6598d), i11), onCancelListener);
    }

    @o0
    public Dialog u(@m0 Fragment fragment, int i10, int i11) {
        return v(fragment, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    @o0
    public Dialog v(@m0 Fragment fragment, int i10, int i11, @o0 DialogInterface.OnCancelListener onCancelListener) {
        return E(fragment.requireContext(), i10, l0.c(fragment, e(fragment.requireContext(), i10, f.f6598d), i11), onCancelListener);
    }

    @o0
    public PendingIntent w(@m0 Context context, @m0 ConnectionResult connectionResult) {
        return connectionResult.g1() ? connectionResult.f1() : f(context, connectionResult.X0(), 0);
    }

    @j0
    @m0
    public m<Void> y(@m0 Activity activity) {
        int i10 = f6590h;
        s.g("makeGooglePlayServicesAvailable must be called from the main thread");
        int k10 = k(activity, i10);
        if (k10 == 0) {
            return h9.p.g(null);
        }
        j1 u10 = j1.u(activity);
        u10.t(new ConnectionResult(k10, (PendingIntent) null), 0);
        return u10.v();
    }

    @TargetApi(26)
    public void z(@m0 Context context, @m0 String str) {
        if (v.n()) {
            s.l(((NotificationManager) s.l(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (f6592j) {
            this.f6594g = str;
        }
    }
}

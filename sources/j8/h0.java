package j8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.i;
import c8.a;
import d.m0;
import d.o0;
import d8.q;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import w8.l;
import x0.d;
import y8.e;

public final class h0 {
    @GuardedBy("sCache")

    /* renamed from: a  reason: collision with root package name */
    public static final i f9766a = new i();
    @GuardedBy("sCache")
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static Locale f9767b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(a.e.common_google_play_services_notification_channel_name);
    }

    @m0
    public static String c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? 17039370 : a.e.common_google_play_services_enable_button : a.e.common_google_play_services_update_button : a.e.common_google_play_services_install_button);
    }

    @m0
    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(a.e.common_google_play_services_install_text, new Object[]{a10});
        } else if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(a.e.common_google_play_services_enable_text, new Object[]{a10});
            } else if (i10 == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i10 == 7) {
                    return h(context, "common_google_play_services_network_error_text", a10);
                }
                if (i10 == 9) {
                    return resources.getString(a.e.common_google_play_services_unsupported_text, new Object[]{a10});
                } else if (i10 == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i10) {
                        case 16:
                            return h(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return h(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(a.e.common_google_play_services_updating_text, new Object[]{a10});
                        default:
                            return resources.getString(q.b.common_google_play_services_unknown_issue, new Object[]{a10});
                    }
                }
            }
        } else if (l.l(context)) {
            return resources.getString(a.e.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(a.e.common_google_play_services_update_text, new Object[]{a10});
        }
    }

    @m0
    public static String e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i10);
    }

    @m0
    public static String f(Context context, int i10) {
        String i11 = i10 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i10);
        return i11 == null ? context.getResources().getString(a.e.common_google_play_services_notification_ticker) : i11;
    }

    @o0
    public static String g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(a.e.common_google_play_services_install_title);
            case 2:
                return resources.getString(a.e.common_google_play_services_update_title);
            case 3:
                return resources.getString(a.e.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                return null;
        }
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i10 = i(context, str);
        if (i10 == null) {
            i10 = resources.getString(q.b.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i10, new Object[]{str2});
    }

    @o0
    public static String i(Context context, String str) {
        i iVar = f9766a;
        synchronized (iVar) {
            Locale d10 = d.a(context.getResources().getConfiguration()).d(0);
            if (!d10.equals(f9767b)) {
                iVar.clear();
                f9767b = d10;
            }
            String str2 = (String) iVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources j10 = d8.i.j(context);
            if (j10 == null) {
                return null;
            }
            int identifier = j10.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing resource: ");
                sb2.append(str);
                return null;
            }
            String string = j10.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Got empty resource: ");
                sb3.append(str);
                return null;
            }
            iVar.put(str, string);
            return string;
        }
    }
}

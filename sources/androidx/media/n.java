package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.media.j;
import d.m0;
import e1.i;

public class n implements j.a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f3011c = "MediaSessionManager";

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3012d = j.f3003c;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3013e = "android.permission.STATUS_BAR_SERVICE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f3014f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* renamed from: g  reason: collision with root package name */
    public static final String f3015g = "enabled_notification_listeners";

    /* renamed from: a  reason: collision with root package name */
    public Context f3016a;

    /* renamed from: b  reason: collision with root package name */
    public ContentResolver f3017b;

    public static class a implements j.c {

        /* renamed from: a  reason: collision with root package name */
        public String f3018a;

        /* renamed from: b  reason: collision with root package name */
        public int f3019b;

        /* renamed from: c  reason: collision with root package name */
        public int f3020c;

        public a(String str, int i10, int i11) {
            this.f3018a = str;
            this.f3019b = i10;
            this.f3020c = i11;
        }

        public int b() {
            return this.f3020c;
        }

        public int c() {
            return this.f3019b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f3018a, aVar.f3018a) && this.f3019b == aVar.f3019b && this.f3020c == aVar.f3020c;
        }

        public int hashCode() {
            return i.b(this.f3018a, Integer.valueOf(this.f3019b), Integer.valueOf(this.f3020c));
        }

        public String n() {
            return this.f3018a;
        }
    }

    public n(Context context) {
        this.f3016a = context;
        this.f3017b = context.getContentResolver();
    }

    public boolean a(@m0 j.c cVar) {
        try {
            if (this.f3016a.getPackageManager().getApplicationInfo(cVar.n(), 0).uid == cVar.b()) {
                return c(cVar, f3013e) || c(cVar, f3014f) || cVar.b() == 1000 || b(cVar);
            }
            if (f3012d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Package name ");
                sb2.append(cVar.n());
                sb2.append(" doesn't match with the uid ");
                sb2.append(cVar.b());
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f3012d) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Package ");
                sb3.append(cVar.n());
                sb3.append(" doesn't exist");
            }
            return false;
        }
    }

    public boolean b(@m0 j.c cVar) {
        String string = Settings.Secure.getString(this.f3017b, "enabled_notification_listeners");
        if (string != null) {
            String[] split = string.split(":");
            for (String unflattenFromString : split) {
                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                if (unflattenFromString2 != null && unflattenFromString2.getPackageName().equals(cVar.n())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(j.c cVar, String str) {
        return cVar.c() < 0 ? this.f3016a.getPackageManager().checkPermission(str, cVar.n()) == 0 : this.f3016a.checkPermission(str, cVar.c(), cVar.b()) == 0;
    }

    public Context e() {
        return this.f3016a;
    }
}

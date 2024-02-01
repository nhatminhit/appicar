package d8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.common.o;
import d.m0;
import d.o0;
import e8.a;
import j8.f2;
import j8.k;
import j8.w;
import w8.l;
import y8.e;

@a
@w
public class f {
    @a

    /* renamed from: a  reason: collision with root package name */
    public static final int f6595a = j.f6608a;
    @a
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f6596b = "com.google.android.gms";
    @a
    @m0

    /* renamed from: c  reason: collision with root package name */
    public static final String f6597c = "com.android.vending";
    @a

    /* renamed from: d  reason: collision with root package name */
    public static final String f6598d = "d";
    @a

    /* renamed from: e  reason: collision with root package name */
    public static final String f6599e = "n";

    /* renamed from: f  reason: collision with root package name */
    public static final f f6600f = new f();

    @a
    @m0
    public static f i() {
        return f6600f;
    }

    @a
    public void a(@m0 Context context) {
        j.a(context);
    }

    @a
    @w
    public int b(@m0 Context context) {
        return j.d(context);
    }

    @a
    @w
    public int c(@m0 Context context) {
        return j.e(context);
    }

    @a
    @o0
    @w
    @Deprecated
    public Intent d(int i10) {
        return e((Context) null, i10, (String) null);
    }

    @a
    @o0
    @w
    public Intent e(@o0 Context context, int i10, @o0 String str) {
        if (i10 == 1 || i10 == 2) {
            if (context != null && l.l(context)) {
                return f2.a();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f6595a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(e.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return f2.b("com.google.android.gms", sb2.toString());
        } else if (i10 != 3) {
            return null;
        } else {
            return f2.c("com.google.android.gms");
        }
    }

    @a
    @o0
    public PendingIntent f(@m0 Context context, int i10, int i11) {
        return g(context, i10, i11, (String) null);
    }

    @a
    @o0
    @w
    public PendingIntent g(@m0 Context context, int i10, int i11, @o0 String str) {
        Intent e10 = e(context, i10, str);
        if (e10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, e10, o.f5841a | 134217728);
    }

    @a
    @m0
    public String h(int i10) {
        return j.g(i10);
    }

    @a
    @k
    public int j(@m0 Context context) {
        return k(context, f6595a);
    }

    @a
    public int k(@m0 Context context, int i10) {
        int m10 = j.m(context, i10);
        if (j.o(context, m10)) {
            return 18;
        }
        return m10;
    }

    @a
    @w
    public boolean l(@m0 Context context, int i10) {
        return j.o(context, i10);
    }

    @a
    @w
    public boolean m(@m0 Context context, int i10) {
        return j.p(context, i10);
    }

    @a
    public boolean n(@m0 Context context, @m0 String str) {
        return j.u(context, str);
    }

    @a
    public boolean o(int i10) {
        return j.s(i10);
    }

    @a
    public void p(@m0 Context context, int i10) throws h, g {
        j.c(context, i10);
    }
}

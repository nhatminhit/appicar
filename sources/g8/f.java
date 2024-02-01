package g8;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;
import d8.q;
import e8.a;
import j8.j1;
import j8.s;
import j8.x;
import javax.annotation.concurrent.GuardedBy;
import w8.d0;

@a
@Deprecated
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f8205e = new Object();
    @GuardedBy("sLock")
    @o0

    /* renamed from: f  reason: collision with root package name */
    public static f f8206f;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final String f8207a;

    /* renamed from: b  reason: collision with root package name */
    public final Status f8208b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8209c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8210d;

    @a
    @d0
    public f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(q.b.common_google_play_services_unknown_issue));
        boolean z10 = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z11 = integer == 0;
            z10 = integer == 0 ? false : z10;
            this.f8210d = z11;
        } else {
            this.f8210d = false;
        }
        this.f8209c = z10;
        String b10 = j1.b(context);
        b10 = b10 == null ? new x(context).a("google_app_id") : b10;
        if (TextUtils.isEmpty(b10)) {
            this.f8208b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f8207a = null;
            return;
        }
        this.f8207a = b10;
        this.f8208b = Status.U;
    }

    @a
    @d0
    public f(String str, boolean z10) {
        this.f8207a = str;
        this.f8208b = Status.U;
        this.f8209c = z10;
        this.f8210d = !z10;
    }

    @a
    public static f b(String str) {
        f fVar;
        synchronized (f8205e) {
            fVar = f8206f;
            if (fVar == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return fVar;
    }

    @a
    @d0
    public static void c() {
        synchronized (f8205e) {
            f8206f = null;
        }
    }

    @a
    @o0
    public static String d() {
        return b("getGoogleAppId").f8207a;
    }

    @a
    @m0
    public static Status e(@m0 Context context) {
        Status status;
        s.m(context, "Context must not be null.");
        synchronized (f8205e) {
            if (f8206f == null) {
                f8206f = new f(context);
            }
            status = f8206f.f8208b;
        }
        return status;
    }

    @a
    @m0
    public static Status f(@m0 Context context, @m0 String str, boolean z10) {
        s.m(context, "Context must not be null.");
        s.i(str, "App ID must be nonempty.");
        synchronized (f8205e) {
            f fVar = f8206f;
            if (fVar != null) {
                Status a10 = fVar.a(str);
                return a10;
            }
            f fVar2 = new f(str, z10);
            f8206f = fVar2;
            Status status = fVar2.f8208b;
            return status;
        }
    }

    @a
    public static boolean g() {
        f b10 = b("isMeasurementEnabled");
        return b10.f8208b.r1() && b10.f8209c;
    }

    @a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").f8210d;
    }

    @a
    @d0
    public Status a(String str) {
        String str2 = this.f8207a;
        if (str2 == null || str2.equals(str)) {
            return Status.U;
        }
        String str3 = this.f8207a;
        return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + str3 + "'.");
    }
}

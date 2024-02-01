package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import d.g1;
import d.m0;
import d.w0;
import i0.o;
import java.util.Calendar;

public class n {

    /* renamed from: d  reason: collision with root package name */
    public static final String f867d = "TwilightManager";

    /* renamed from: e  reason: collision with root package name */
    public static final int f868e = 6;

    /* renamed from: f  reason: collision with root package name */
    public static final int f869f = 22;

    /* renamed from: g  reason: collision with root package name */
    public static n f870g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f871a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f872b;

    /* renamed from: c  reason: collision with root package name */
    public final a f873c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f874a;

        /* renamed from: b  reason: collision with root package name */
        public long f875b;

        /* renamed from: c  reason: collision with root package name */
        public long f876c;

        /* renamed from: d  reason: collision with root package name */
        public long f877d;

        /* renamed from: e  reason: collision with root package name */
        public long f878e;

        /* renamed from: f  reason: collision with root package name */
        public long f879f;
    }

    @g1
    public n(@m0 Context context, @m0 LocationManager locationManager) {
        this.f871a = context;
        this.f872b = locationManager;
    }

    public static n a(@m0 Context context) {
        if (f870g == null) {
            Context applicationContext = context.getApplicationContext();
            f870g = new n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f870g;
    }

    @g1
    public static void f(n nVar) {
        f870g = nVar;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location location = null;
        Location c10 = o.d(this.f871a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (o.d(this.f871a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f872b.isProviderEnabled(str)) {
                return this.f872b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f873c;
        if (e()) {
            return aVar.f874a;
        }
        Location b10 = b();
        if (b10 != null) {
            g(b10);
            return aVar.f874a;
        }
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f873c.f879f > System.currentTimeMillis();
    }

    public final void g(@m0 Location location) {
        long j10;
        a aVar = this.f873c;
        long currentTimeMillis = System.currentTimeMillis();
        m b10 = m.b();
        m mVar = b10;
        mVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f864a;
        mVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = true;
        if (b10.f866c != 1) {
            z10 = false;
        }
        long j12 = b10.f865b;
        long j13 = j11;
        long j14 = b10.f864a;
        long j15 = j12;
        boolean z11 = z10;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j16 = b10.f865b;
        if (j15 == -1 || j14 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j14 ? 0 + j16 : currentTimeMillis > j15 ? 0 + j14 : 0 + j15) + 60000;
        }
        aVar.f874a = z11;
        aVar.f875b = j13;
        aVar.f876c = j15;
        aVar.f877d = j14;
        aVar.f878e = j16;
        aVar.f879f = j10;
    }
}

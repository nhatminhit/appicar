package u0;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import d.e0;
import d.m0;
import d.t0;
import d.v;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class a {
    @SuppressLint({"InlinedApi"})

    /* renamed from: a  reason: collision with root package name */
    public static final int f13363a = 0;
    @SuppressLint({"InlinedApi"})

    /* renamed from: b  reason: collision with root package name */
    public static final int f13364b = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: c  reason: collision with root package name */
    public static final int f13365c = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: d  reason: collision with root package name */
    public static final int f13366d = 3;
    @SuppressLint({"InlinedApi"})

    /* renamed from: e  reason: collision with root package name */
    public static final int f13367e = 4;
    @SuppressLint({"InlinedApi"})

    /* renamed from: f  reason: collision with root package name */
    public static final int f13368f = 5;
    @SuppressLint({"InlinedApi"})

    /* renamed from: g  reason: collision with root package name */
    public static final int f13369g = 6;
    @SuppressLint({"InlinedApi"})

    /* renamed from: h  reason: collision with root package name */
    public static final int f13370h = 7;

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    public static abstract class C0221a {
        public void a(@e0(from = 0) int i10) {
        }

        public void b(@m0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    @x0({x0.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @t0(24)
    @m0
    public static a n(@m0 GnssStatus gnssStatus) {
        return new f(gnssStatus);
    }

    @SuppressLint({"ReferencesDeprecated"})
    @m0
    public static a o(@m0 GpsStatus gpsStatus) {
        return new g(gpsStatus);
    }

    @v(from = 0.0d, to = 360.0d)
    public abstract float a(@e0(from = 0) int i10);

    @v(from = 0.0d, to = 63.0d)
    public abstract float b(@e0(from = 0) int i10);

    @v(from = 0.0d)
    public abstract float c(@e0(from = 0) int i10);

    @v(from = 0.0d, to = 63.0d)
    public abstract float d(@e0(from = 0) int i10);

    public abstract int e(@e0(from = 0) int i10);

    @v(from = -90.0d, to = 90.0d)
    public abstract float f(@e0(from = 0) int i10);

    @e0(from = 0)
    public abstract int g();

    @e0(from = 1, to = 200)
    public abstract int h(@e0(from = 0) int i10);

    public abstract boolean i(@e0(from = 0) int i10);

    public abstract boolean j(@e0(from = 0) int i10);

    public abstract boolean k(@e0(from = 0) int i10);

    public abstract boolean l(@e0(from = 0) int i10);

    public abstract boolean m(@e0(from = 0) int i10);
}

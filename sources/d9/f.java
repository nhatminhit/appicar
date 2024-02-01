package d9;

import com.google.android.gms.internal.location.zzdh;
import d.e0;
import d.m0;
import d.v;
import j8.s;
import w8.k;

public interface f {

    /* renamed from: r  reason: collision with root package name */
    public static final int f6677r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f6678s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f6679t = 4;

    /* renamed from: u  reason: collision with root package name */
    public static final long f6680u = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6681a = null;
        @c

        /* renamed from: b  reason: collision with root package name */
        public int f6682b = 0;

        /* renamed from: c  reason: collision with root package name */
        public long f6683c = Long.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public short f6684d = -1;

        /* renamed from: e  reason: collision with root package name */
        public double f6685e;

        /* renamed from: f  reason: collision with root package name */
        public double f6686f;

        /* renamed from: g  reason: collision with root package name */
        public float f6687g;

        /* renamed from: h  reason: collision with root package name */
        public int f6688h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f6689i = -1;

        @m0
        public f a() {
            if (this.f6681a != null) {
                int i10 = this.f6682b;
                if (i10 == 0) {
                    throw new IllegalArgumentException("Transitions types not set.");
                } else if ((i10 & 4) != 0 && this.f6689i < 0) {
                    throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                } else if (this.f6683c == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f6684d == -1) {
                    throw new IllegalArgumentException("Geofence region not set.");
                } else if (this.f6688h >= 0) {
                    return new zzdh(this.f6681a, this.f6682b, 1, this.f6685e, this.f6686f, this.f6687g, this.f6683c, this.f6688h, this.f6689i);
                } else {
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                }
            } else {
                throw new IllegalArgumentException("Request ID not set.");
            }
        }

        @m0
        public a b(@v(from = -90.0d, to = 90.0d) double d10, @v(from = -180.0d, to = 180.0d) double d11, @v(from = 0.0d, fromInclusive = false) float f10) {
            boolean z10 = false;
            s.b(d10 >= -90.0d && d10 <= 90.0d, "Invalid latitude: " + d10);
            s.b(d11 >= -180.0d && d11 <= 180.0d, "Invalid longitude: " + d11);
            if (f10 > 0.0f) {
                z10 = true;
            }
            s.b(z10, "Invalid radius: " + f10);
            this.f6684d = 1;
            this.f6685e = d10;
            this.f6686f = d11;
            this.f6687g = f10;
            return this;
        }

        @m0
        public a c(long j10) {
            if (j10 < 0) {
                this.f6683c = -1;
            } else {
                this.f6683c = k.e().a() + j10;
            }
            return this;
        }

        @m0
        public a d(int i10) {
            this.f6689i = i10;
            return this;
        }

        @m0
        public a e(@e0(from = 0) int i10) {
            this.f6688h = i10;
            return this;
        }

        @m0
        public a f(@m0 String str) {
            this.f6681a = (String) s.m(str, "Request ID can't be set to null");
            return this;
        }

        @m0
        public a g(@c int i10) {
            this.f6682b = i10;
            return this;
        }
    }

    public @interface b {
    }

    public @interface c {
    }

    @m0
    String A();

    double a0();

    long e0();

    float h();

    int l();

    double q();

    int t();

    @c
    int z0();
}

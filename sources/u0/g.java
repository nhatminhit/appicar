package u0;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import d.x0;
import d.z;
import e1.n;
import java.util.Iterator;

@x0({x0.a.LIBRARY})
public class g extends a {

    /* renamed from: n  reason: collision with root package name */
    public static final int f13372n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13373o = 32;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13374p = 33;

    /* renamed from: q  reason: collision with root package name */
    public static final int f13375q = 64;

    /* renamed from: r  reason: collision with root package name */
    public static final int f13376r = -87;

    /* renamed from: s  reason: collision with root package name */
    public static final int f13377s = 64;

    /* renamed from: t  reason: collision with root package name */
    public static final int f13378t = 24;

    /* renamed from: u  reason: collision with root package name */
    public static final int f13379u = 193;

    /* renamed from: v  reason: collision with root package name */
    public static final int f13380v = 200;

    /* renamed from: w  reason: collision with root package name */
    public static final int f13381w = 200;

    /* renamed from: x  reason: collision with root package name */
    public static final int f13382x = 35;

    /* renamed from: i  reason: collision with root package name */
    public final GpsStatus f13383i;
    @z("mWrapped")

    /* renamed from: j  reason: collision with root package name */
    public int f13384j = -1;
    @z("mWrapped")

    /* renamed from: k  reason: collision with root package name */
    public Iterator<GpsSatellite> f13385k;
    @z("mWrapped")

    /* renamed from: l  reason: collision with root package name */
    public int f13386l;
    @z("mWrapped")

    /* renamed from: m  reason: collision with root package name */
    public GpsSatellite f13387m;

    public g(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) n.g(gpsStatus);
        this.f13383i = gpsStatus2;
        this.f13385k = gpsStatus2.getSatellites().iterator();
        this.f13386l = -1;
        this.f13387m = null;
    }

    public static int p(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < 193 || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    public static int r(int i10) {
        int p10 = p(i10);
        return p10 != 2 ? p10 != 3 ? p10 != 5 ? i10 : i10 - 200 : i10 - 64 : i10 + 87;
    }

    public float a(int i10) {
        return q(i10).getAzimuth();
    }

    public float b(int i10) {
        throw new UnsupportedOperationException();
    }

    public float c(int i10) {
        throw new UnsupportedOperationException();
    }

    public float d(int i10) {
        return q(i10).getSnr();
    }

    public int e(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(q(i10).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f13383i.equals(((g) obj).f13383i);
    }

    public float f(int i10) {
        return q(i10).getElevation();
    }

    public int g() {
        int i10;
        synchronized (this.f13383i) {
            if (this.f13384j == -1) {
                for (GpsSatellite next : this.f13383i.getSatellites()) {
                    this.f13384j++;
                }
                this.f13384j++;
            }
            i10 = this.f13384j;
        }
        return i10;
    }

    public int h(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        int prn = q(i10).getPrn();
        return i11 < 24 ? prn : r(prn);
    }

    public int hashCode() {
        return this.f13383i.hashCode();
    }

    public boolean i(int i10) {
        return q(i10).hasAlmanac();
    }

    public boolean j(int i10) {
        return false;
    }

    public boolean k(int i10) {
        return false;
    }

    public boolean l(int i10) {
        return q(i10).hasEphemeris();
    }

    public boolean m(int i10) {
        return q(i10).usedInFix();
    }

    public final GpsSatellite q(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f13383i) {
            if (i10 < this.f13386l) {
                this.f13385k = this.f13383i.getSatellites().iterator();
                this.f13386l = -1;
            }
            while (true) {
                int i11 = this.f13386l;
                if (i11 >= i10) {
                    break;
                }
                this.f13386l = i11 + 1;
                if (!this.f13385k.hasNext()) {
                    this.f13387m = null;
                    break;
                }
                this.f13387m = this.f13385k.next();
            }
            gpsSatellite = this.f13387m;
        }
        return (GpsSatellite) n.g(gpsSatellite);
    }
}

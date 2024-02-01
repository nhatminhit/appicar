package u0;

import android.location.GnssStatus;
import android.os.Build;
import d.t0;
import d.x0;
import e1.n;

@t0(24)
@x0({x0.a.LIBRARY})
public class f extends a {

    /* renamed from: i  reason: collision with root package name */
    public final GnssStatus f13371i;

    public f(GnssStatus gnssStatus) {
        this.f13371i = (GnssStatus) n.g(gnssStatus);
    }

    public float a(int i10) {
        return this.f13371i.getAzimuthDegrees(i10);
    }

    public float b(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f13371i.getBasebandCn0DbHz(i10);
        }
        throw new UnsupportedOperationException();
    }

    public float c(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f13371i.getCarrierFrequencyHz(i10);
        }
        throw new UnsupportedOperationException();
    }

    public float d(int i10) {
        return this.f13371i.getCn0DbHz(i10);
    }

    public int e(int i10) {
        return this.f13371i.getConstellationType(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f13371i.equals(((f) obj).f13371i);
    }

    public float f(int i10) {
        return this.f13371i.getElevationDegrees(i10);
    }

    public int g() {
        return this.f13371i.getSatelliteCount();
    }

    public int h(int i10) {
        return this.f13371i.getSvid(i10);
    }

    public int hashCode() {
        return this.f13371i.hashCode();
    }

    public boolean i(int i10) {
        return this.f13371i.hasAlmanacData(i10);
    }

    public boolean j(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f13371i.hasBasebandCn0DbHz(i10);
        }
        return false;
    }

    public boolean k(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f13371i.hasCarrierFrequencyHz(i10);
        }
        return false;
    }

    public boolean l(int i10) {
        return this.f13371i.hasEphemerisData(i10);
    }

    public boolean m(int i10) {
        return this.f13371i.usedInFix(i10);
    }
}

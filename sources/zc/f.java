package zc;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import d.m0;

public class f {

    /* renamed from: f  reason: collision with root package name */
    public static final String f25103f = "Satellite";

    /* renamed from: a  reason: collision with root package name */
    public LocationManager f25104a;

    /* renamed from: b  reason: collision with root package name */
    public GpsStatus.Listener f25105b;

    /* renamed from: c  reason: collision with root package name */
    public GnssStatus.Callback f25106c;

    /* renamed from: d  reason: collision with root package name */
    public GpsStatus f25107d;

    /* renamed from: e  reason: collision with root package name */
    public b f25108e;

    public class a extends GnssStatus.Callback {
        public a() {
        }

        public void onSatelliteStatusChanged(@m0 GnssStatus gnssStatus) {
            super.onSatelliteStatusChanged(gnssStatus);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < gnssStatus.getSatelliteCount(); i12++) {
                if (gnssStatus.usedInFix(i12)) {
                    i11++;
                }
                if (Build.VERSION.SDK_INT >= 30 && gnssStatus.getBasebandCn0DbHz(i12) > 0.0f) {
                    i10++;
                }
            }
            if (i10 < i11) {
                i10 = i11;
            }
            if (f.this.f25108e != null) {
                f.this.f25108e.a(i11, i10);
            }
        }
    }

    public interface b {
        void a(int i10, int i11);
    }

    @SuppressLint({"MissingPermission"})
    public f(LocationManager locationManager) {
        this.f25104a = locationManager;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f25106c = new a();
        } else {
            this.f25105b = new e(this, locationManager);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(LocationManager locationManager, int i10) {
        GpsStatus gpsStatus = locationManager.getGpsStatus(this.f25107d);
        this.f25107d = gpsStatus;
        if (gpsStatus != null) {
            int i11 = 0;
            int i12 = 0;
            for (GpsSatellite usedInFix : gpsStatus.getSatellites()) {
                if (usedInFix.usedInFix()) {
                    i11++;
                }
                i12++;
            }
            b bVar = this.f25108e;
            if (bVar != null) {
                bVar.a(i11, i12);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void d(b bVar) {
        this.f25108e = bVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            boolean unused = this.f25104a.registerGnssStatusCallback(this.f25106c, (Handler) null);
        } else if (i10 >= 24) {
            boolean unused2 = this.f25104a.registerGnssStatusCallback(this.f25106c);
        } else {
            this.f25104a.addGpsStatusListener(this.f25105b);
        }
    }

    public void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f25104a.unregisterGnssStatusCallback(this.f25106c);
        }
    }
}

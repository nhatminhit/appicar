package zc;

import android.location.GpsStatus;
import android.location.LocationManager;

public final /* synthetic */ class e implements GpsStatus.Listener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f25101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LocationManager f25102b;

    public /* synthetic */ e(f fVar, LocationManager locationManager) {
        this.f25101a = fVar;
        this.f25102b = locationManager;
    }

    public final void onGpsStatusChanged(int i10) {
        this.f25101a.c(this.f25102b, i10);
    }
}

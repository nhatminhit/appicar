package zc;

import ad.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationRequest;
import com.tatv.baseapp.utils.location.ILocation;
import d.m0;
import d.o0;
import d9.n;
import f8.k;
import zc.f;

public class c implements k.b, k.c, LocationListener, f.b {
    public static final String W = "Locate";
    @SuppressLint({"StaticFieldLeak"})
    public static c X = null;
    public static final int Y = 1000;
    public static final float Z = 0.0f;
    public LocationManager O;
    public a P;
    public f Q;
    public Context R;
    public int S;
    public int T;
    public k U;
    public LocationRequest V;

    public interface a {
        void a(int i10, int i11);

        void b(ILocation iLocation);

        void c(String str, boolean z10);
    }

    public c(Context context) {
        this.R = context;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.O = locationManager;
        this.Q = new f(locationManager);
    }

    public static c e(Context context) {
        if (X == null) {
            X = new c(context);
        }
        return X;
    }

    public void D(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onConnectionSuspended: ");
        sb2.append(i10);
    }

    public void H(@m0 ConnectionResult connectionResult) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onConnectionFailed, connectionResult: ");
        sb2.append(connectionResult.h1());
    }

    @SuppressLint({"MissingPermission"})
    public void J(@o0 Bundle bundle) {
        d.e(W, "onConnected");
        if (this.V == null) {
            try {
                LocationRequest locationRequest = new LocationRequest();
                this.V = locationRequest;
                locationRequest.Y1(1000);
                this.V.X1(1000);
                this.V.c2(1.0f);
                this.V.b2(100);
                n.f6702b.j(this.U, this.V, new b(this));
            } catch (Exception e10) {
                d.c(W, e10.getMessage());
            }
        }
    }

    public void a(int i10, int i11) {
        this.S = i10;
        this.T = i11;
        a aVar = this.P;
        if (aVar != null) {
            aVar.a(i10, i11);
        }
    }

    @SuppressLint({"MissingPermission"})
    public c b() {
        if (this.U == null) {
            try {
                k h10 = new k.a(this.R).e(this).f(this).a(n.f6701a).h();
                this.U = h10;
                h10.g();
            } catch (Exception e10) {
                d.c(W, e10.toString());
            }
        }
        return this;
    }

    @SuppressLint({"MissingPermission"})
    public final c c() {
        if (f()) {
            this.O.requestLocationUpdates("gps", 1000, 0.0f, this);
        }
        return this;
    }

    @SuppressLint({"MissingPermission"})
    public c d() {
        if (g()) {
            this.O.requestLocationUpdates("network", 1000, 0.0f, this);
        }
        return this;
    }

    public boolean f() {
        LocationManager locationManager = this.O;
        return locationManager != null && locationManager.isProviderEnabled("gps");
    }

    public boolean g() {
        LocationManager locationManager = this.O;
        return locationManager != null && locationManager.isProviderEnabled("network");
    }

    @SuppressLint({"MissingPermission"})
    public c h(a aVar) {
        if (this.P == null) {
            b();
            this.Q.d(this);
        }
        this.P = aVar;
        return this;
    }

    @SuppressLint({"MissingPermission"})
    public c i(a aVar) {
        if (this.P == null) {
            c();
            this.Q.d(this);
        }
        this.P = aVar;
        return this;
    }

    public void j() {
        LocationManager locationManager = this.O;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
        f fVar = this.Q;
        if (fVar != null) {
            fVar.e();
        }
        k kVar = this.U;
        if (kVar != null && kVar.u()) {
            this.U.i();
        }
        this.P = null;
    }

    @SuppressLint({"MissingPermission"})
    public void onLocationChanged(@m0 Location location) {
        a aVar = this.P;
        if (aVar != null) {
            aVar.b(new ILocation(location).q(this.S).r(this.T).a());
        }
    }

    public void onProviderDisabled(@m0 String str) {
        super.onProviderDisabled(str);
        d.e(W, "onProviderDisabled: " + str);
        if (str.equals("gps")) {
            a(0, 0);
        }
        a aVar = this.P;
        if (aVar != null) {
            aVar.c(str, false);
        }
    }

    public void onProviderEnabled(@m0 String str) {
        super.onProviderEnabled(str);
        d.e(W, "onProviderEnabled: " + str);
        a aVar = this.P;
        if (aVar != null) {
            aVar.c(str, true);
        }
    }

    public void onStatusChanged(String str, int i10, Bundle bundle) {
        super.onStatusChanged(str, i10, bundle);
    }
}

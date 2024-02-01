package com.tatv.baseapp.service;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import d.m0;
import pc.e;

public abstract class BaseLocationService extends BaseService implements LocationListener, e {
    public LocationManager U;

    public void onCreate() {
        super.onCreate();
        q();
    }

    public void onLocationChanged(@m0 Location location) {
        d(location);
    }

    public void onProviderDisabled(@m0 String str) {
    }

    public void onProviderEnabled(@m0 String str) {
    }

    public void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    public final void q() {
        this.U = (LocationManager) getApplicationContext().getSystemService("location");
    }
}

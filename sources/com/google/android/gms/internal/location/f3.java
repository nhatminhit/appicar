package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzb;
import j8.l;

public final class f3 extends a implements g3 {
    public f3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void B1(boolean z10) throws RemoteException {
        Parcel D = D();
        c1.c(D, z10);
        J(12, D);
    }

    public final void G0(zzdb zzdb, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, zzdb);
        c1.e(D, eVar);
        J(89, D);
    }

    public final void H0(PendingIntent pendingIntent, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, pendingIntent);
        c1.e(D, eVar);
        J(73, D);
    }

    public final void K1(String[] strArr, e3 e3Var, String str) throws RemoteException {
        Parcel D = D();
        D.writeStringArray(strArr);
        c1.e(D, e3Var);
        D.writeString(str);
        J(3, D);
    }

    public final void L1(PendingIntent pendingIntent, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, pendingIntent);
        c1.e(D, eVar);
        J(69, D);
    }

    public final void M(zzb zzb, PendingIntent pendingIntent, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, zzb);
        c1.d(D, pendingIntent);
        c1.e(D, eVar);
        J(70, D);
    }

    public final void N1(zzdb zzdb, LocationRequest locationRequest, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, zzdb);
        c1.d(D, locationRequest);
        c1.e(D, eVar);
        J(88, D);
    }

    public final void P1(c3 c3Var) throws RemoteException {
        Parcel D = D();
        c1.e(D, c3Var);
        J(67, D);
    }

    public final void U(Location location) throws RemoteException {
        Parcel D = D();
        c1.d(D, location);
        J(13, D);
    }

    public final void U0(PendingIntent pendingIntent) throws RemoteException {
        Parcel D = D();
        c1.d(D, pendingIntent);
        J(6, D);
    }

    public final Location c() throws RemoteException {
        Parcel H = H(7, D());
        Location location = (Location) c1.a(H, Location.CREATOR);
        H.recycle();
        return location;
    }

    public final void c1(PendingIntent pendingIntent, e3 e3Var, String str) throws RemoteException {
        Parcel D = D();
        c1.d(D, pendingIntent);
        c1.e(D, e3Var);
        D.writeString(str);
        J(2, D);
    }

    public final void f0(LastLocationRequest lastLocationRequest, i3 i3Var) throws RemoteException {
        Parcel D = D();
        c1.d(D, lastLocationRequest);
        c1.e(D, i3Var);
        J(82, D);
    }

    public final void g1(long j10, boolean z10, PendingIntent pendingIntent) throws RemoteException {
        Parcel D = D();
        D.writeLong(j10);
        c1.c(D, true);
        c1.d(D, pendingIntent);
        J(5, D);
    }

    public final void j1(Location location, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, location);
        c1.e(D, eVar);
        J(85, D);
    }

    public final void k0(zzdf zzdf) throws RemoteException {
        Parcel D = D();
        c1.d(D, zzdf);
        J(59, D);
    }

    public final void m1(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, activityTransitionRequest);
        c1.d(D, pendingIntent);
        c1.e(D, eVar);
        J(72, D);
    }

    public final void o0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, e eVar) throws RemoteException {
        Parcel D = D();
        c1.d(D, pendingIntent);
        c1.d(D, sleepSegmentRequest);
        c1.e(D, eVar);
        J(79, D);
    }

    public final LocationAvailability o1(String str) throws RemoteException {
        Parcel D = D();
        D.writeString(str);
        Parcel H = H(34, D);
        LocationAvailability locationAvailability = (LocationAvailability) c1.a(H, LocationAvailability.CREATOR);
        H.recycle();
        return locationAvailability;
    }

    public final l q1(CurrentLocationRequest currentLocationRequest, i3 i3Var) throws RemoteException {
        Parcel D = D();
        c1.d(D, currentLocationRequest);
        c1.e(D, i3Var);
        Parcel H = H(87, D);
        l H2 = l.a.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void t0(LocationSettingsRequest locationSettingsRequest, k3 k3Var, String str) throws RemoteException {
        Parcel D = D();
        c1.d(D, locationSettingsRequest);
        c1.e(D, k3Var);
        D.writeString((String) null);
        J(63, D);
    }

    public final void u0(boolean z10, e eVar) throws RemoteException {
        Parcel D = D();
        c1.c(D, z10);
        c1.e(D, eVar);
        J(84, D);
    }

    public final void u1(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, e3 e3Var) throws RemoteException {
        Parcel D = D();
        c1.d(D, geofencingRequest);
        c1.d(D, pendingIntent);
        c1.e(D, e3Var);
        J(57, D);
    }
}

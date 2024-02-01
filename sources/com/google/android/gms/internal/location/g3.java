package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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

public interface g3 extends IInterface {
    @Deprecated
    void B1(boolean z10) throws RemoteException;

    void G0(zzdb zzdb, e eVar) throws RemoteException;

    void H0(PendingIntent pendingIntent, e eVar) throws RemoteException;

    void K1(String[] strArr, e3 e3Var, String str) throws RemoteException;

    void L1(PendingIntent pendingIntent, e eVar) throws RemoteException;

    void M(zzb zzb, PendingIntent pendingIntent, e eVar) throws RemoteException;

    void N1(zzdb zzdb, LocationRequest locationRequest, e eVar) throws RemoteException;

    void P1(c3 c3Var) throws RemoteException;

    @Deprecated
    void U(Location location) throws RemoteException;

    void U0(PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    Location c() throws RemoteException;

    void c1(PendingIntent pendingIntent, e3 e3Var, String str) throws RemoteException;

    @Deprecated
    void f0(LastLocationRequest lastLocationRequest, i3 i3Var) throws RemoteException;

    void g1(long j10, boolean z10, PendingIntent pendingIntent) throws RemoteException;

    void j1(Location location, e eVar) throws RemoteException;

    @Deprecated
    void k0(zzdf zzdf) throws RemoteException;

    void m1(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, e eVar) throws RemoteException;

    void o0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, e eVar) throws RemoteException;

    @Deprecated
    LocationAvailability o1(String str) throws RemoteException;

    @Deprecated
    l q1(CurrentLocationRequest currentLocationRequest, i3 i3Var) throws RemoteException;

    void t0(LocationSettingsRequest locationSettingsRequest, k3 k3Var, String str) throws RemoteException;

    void u0(boolean z10, e eVar) throws RemoteException;

    void u1(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, e3 e3Var) throws RemoteException;
}

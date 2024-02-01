package d9;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import d.m0;
import d.o0;
import d.w0;
import f8.k;
import f8.o;

@Deprecated
public interface d {
    @Deprecated
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f6673a = "com.google.android.location.LOCATION";
    @Deprecated
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f6674b = "mockLocation";

    @o0
    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    LocationAvailability a(@m0 k kVar);

    @m0
    o<Status> b(@m0 k kVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> c(@m0 k kVar, @m0 LocationRequest locationRequest, @m0 l lVar, @m0 Looper looper);

    @o0
    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    Location d(@m0 k kVar);

    @m0
    o<Status> e(@m0 k kVar, @m0 m mVar);

    @m0
    o<Status> f(@m0 k kVar, @m0 l lVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> g(@m0 k kVar, @m0 LocationRequest locationRequest, @m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> h(@m0 k kVar, @m0 Location location);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> i(@m0 k kVar, @m0 LocationRequest locationRequest, @m0 m mVar, @m0 Looper looper);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> j(@m0 k kVar, @m0 LocationRequest locationRequest, @m0 m mVar);

    @m0
    o<Status> k(@m0 k kVar, @m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    o<Status> l(@m0 k kVar, boolean z10);
}

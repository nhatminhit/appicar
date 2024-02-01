package d9;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import d.m0;
import d.o0;
import d.w0;
import f8.a;
import f8.l;
import h9.m;
import java.util.concurrent.Executor;

public interface e extends l<a.d.C0128d> {
    @Deprecated
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f6675a = "mockLocation";
    @Deprecated
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f6676b = "verticalAccuracy";

    @m0
    m<Void> A();

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Location> B(int i10, @o0 h9.a aVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<LocationAvailability> C();

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> D(@m0 LocationRequest locationRequest, @m0 Executor executor, @m0 l lVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> E(@m0 LocationRequest locationRequest, @m0 Executor executor, @m0 m mVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> c(@m0 LocationRequest locationRequest, @m0 l lVar, @o0 Looper looper);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> i(boolean z10);

    @m0
    m<Void> l(@m0 m mVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> n(@m0 Location location);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> o(@m0 LocationRequest locationRequest, @m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Location> p(@m0 CurrentLocationRequest currentLocationRequest, @o0 h9.a aVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Void> t(@m0 LocationRequest locationRequest, @m0 m mVar, @o0 Looper looper);

    @m0
    m<Void> v(@m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Location> w();

    @m0
    m<Void> x(@m0 l lVar);

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @m0
    m<Location> z(@m0 LastLocationRequest lastLocationRequest);
}

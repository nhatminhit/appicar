package d9;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import d.m0;
import d.w0;
import f8.k;
import f8.o;
import java.util.List;

@Deprecated
public interface h {
    @m0
    o<Status> a(@m0 k kVar, @m0 PendingIntent pendingIntent);

    @m0
    o<Status> b(@m0 k kVar, @m0 List<String> list);

    @m0
    @w0("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    o<Status> c(@m0 k kVar, @m0 List<f> list, @m0 PendingIntent pendingIntent);

    @w0("android.permission.ACCESS_FINE_LOCATION")
    @m0
    o<Status> d(@m0 k kVar, @m0 GeofencingRequest geofencingRequest, @m0 PendingIntent pendingIntent);
}

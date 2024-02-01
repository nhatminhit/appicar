package d9;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;
import d.m0;
import d.w0;
import f8.a;
import f8.l;
import h9.m;
import java.util.List;

public interface i extends l<a.d.C0128d> {
    @m0
    m<Void> a(@m0 PendingIntent pendingIntent);

    @m0
    m<Void> d(@m0 List<String> list);

    @w0("android.permission.ACCESS_FINE_LOCATION")
    @m0
    m<Void> y(@m0 GeofencingRequest geofencingRequest, @m0 PendingIntent pendingIntent);
}

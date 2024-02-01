package u0;

import android.location.Location;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n¨\u0006\u0004"}, d2 = {"Landroid/location/Location;", "", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class i {
    public static final double a(@g Location location) {
        l0.p(location, "<this>");
        return location.getLatitude();
    }

    public static final double b(@g Location location) {
        l0.p(location, "<this>");
        return location.getLongitude();
    }
}

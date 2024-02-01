package d9;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import l8.a;

public final class b1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        List list = LocationResult.P;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            if (a.O(X) != 1) {
                a.h0(parcel, X);
            } else {
                list = a.L(parcel, X, Location.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}

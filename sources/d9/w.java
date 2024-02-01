package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import l8.a;

public final class w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                status = (Status) a.C(parcel, X, Status.CREATOR);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                locationSettingsStates = (LocationSettingsStates) a.C(parcel, X, LocationSettingsStates.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsResult[i10];
    }
}

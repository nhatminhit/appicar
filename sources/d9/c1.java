package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;
import l8.a;

public final class c1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        ArrayList<LocationRequest> arrayList = null;
        boolean z11 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, LocationRequest.CREATOR);
            } else if (O == 2) {
                z10 = a.P(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                z11 = a.P(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new LocationSettingsRequest(arrayList, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}

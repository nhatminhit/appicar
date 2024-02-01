package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsStates;
import l8.a;

public final class x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    z10 = a.P(parcel, X);
                    break;
                case 2:
                    z11 = a.P(parcel, X);
                    break;
                case 3:
                    z12 = a.P(parcel, X);
                    break;
                case 4:
                    z13 = a.P(parcel, X);
                    break;
                case 5:
                    z14 = a.P(parcel, X);
                    break;
                case 6:
                    z15 = a.P(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new LocationSettingsStates(z10, z11, z12, z13, z14, z15);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsStates[i10];
    }
}

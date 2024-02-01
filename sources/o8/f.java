package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import l8.a;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        int i10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                z10 = a.P(parcel, X);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ModuleAvailabilityResponse(z10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleAvailabilityResponse[i10];
    }
}

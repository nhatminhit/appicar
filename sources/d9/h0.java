package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransition;
import l8.a;

public final class h0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                i11 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ActivityTransition(i10, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransition[i10];
    }
}

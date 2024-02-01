package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import l8.a;

public final class i0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i11 = a.Z(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                j10 = a.c0(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ActivityTransitionEvent(i10, i11, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionEvent[i10];
    }
}

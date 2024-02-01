package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepSegmentEvent;
import l8.a;

public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                j10 = a.c0(parcel, X);
            } else if (O == 2) {
                j11 = a.c0(parcel, X);
            } else if (O == 3) {
                i10 = a.Z(parcel, X);
            } else if (O == 4) {
                i11 = a.Z(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                i12 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new SleepSegmentEvent(j10, j11, i10, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SleepSegmentEvent[i10];
    }
}

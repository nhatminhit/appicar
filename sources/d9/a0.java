package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepClassifyEvent;
import l8.a;

public final class a0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel, X);
                    break;
                case 2:
                    i11 = a.Z(parcel, X);
                    break;
                case 3:
                    i12 = a.Z(parcel, X);
                    break;
                case 4:
                    i13 = a.Z(parcel, X);
                    break;
                case 5:
                    i14 = a.Z(parcel, X);
                    break;
                case 6:
                    i15 = a.Z(parcel, X);
                    break;
                case 7:
                    i16 = a.Z(parcel, X);
                    break;
                case 8:
                    z10 = a.P(parcel, X);
                    break;
                case 9:
                    i17 = a.Z(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new SleepClassifyEvent(i10, i11, i12, i13, i14, i15, i16, z10, i17);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SleepClassifyEvent[i10];
    }
}

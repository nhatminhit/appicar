package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzaj;
import l8.a;

public final class e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i11 = a.Z(parcel, X);
            } else if (O == 3) {
                i12 = a.Z(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                i13 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzaj(i10, i11, i12, i13);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaj[i10];
    }
}

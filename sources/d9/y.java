package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzac;
import l8.a;

public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i11 = a.Z(parcel, X);
            } else if (O == 3) {
                j10 = a.c0(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                j11 = a.c0(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzac(i10, i11, j10, j11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}

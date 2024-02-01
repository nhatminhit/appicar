package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import l8.a;

public final class d0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                str = a.G(parcel, X);
            } else if (O == 2) {
                i10 = a.Z(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                j10 = a.c0(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new Feature(str, i10, j10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}

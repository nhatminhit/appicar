package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
import l8.a;

public final class q0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                z10 = a.P(parcel, X);
            } else if (O == 2) {
                str = a.G(parcel, X);
            } else if (O == 3) {
                i11 = a.Z(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzq(z10, str, i11, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}

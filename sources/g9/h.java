package g9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import l8.a;

public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        zat zat = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                zat = (zat) a.C(parcel, X, zat.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zai(i10, zat);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zai[i10];
    }
}

package g9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import l8.a;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ConnectionResult connectionResult = null;
        int i10 = 0;
        zav zav = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                connectionResult = (ConnectionResult) a.C(parcel, X, ConnectionResult.CREATOR);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                zav = (zav) a.C(parcel, X, zav.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zak(i10, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}

package j8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import l8.a;

public final class z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                iBinder = a.Y(parcel, X);
            } else if (O == 3) {
                connectionResult = (ConnectionResult) a.C(parcel, X, ConnectionResult.CREATOR);
            } else if (O == 4) {
                z10 = a.P(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                z11 = a.P(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zav(i10, iBinder, connectionResult, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}

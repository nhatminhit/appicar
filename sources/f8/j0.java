package f8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import l8.a;

public final class j0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i11 = a.Z(parcel, X);
            } else if (O == 2) {
                str = a.G(parcel, X);
            } else if (O == 3) {
                pendingIntent = (PendingIntent) a.C(parcel, X, PendingIntent.CREATOR);
            } else if (O == 4) {
                connectionResult = (ConnectionResult) a.C(parcel, X, ConnectionResult.CREATOR);
            } else if (O != 1000) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new Status(i10, i11, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}

package t8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zan;
import l8.a;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        Parcel parcel2 = null;
        int i10 = 0;
        zan zan = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                parcel2 = a.y(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                zan = (zan) a.C(parcel, X, zan.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new SafeParcelResponse(i10, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SafeParcelResponse[i10];
    }
}

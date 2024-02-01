package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.location.GeofencingRequest;
import java.util.ArrayList;
import l8.a;

public final class q0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<zzdh> arrayList = null;
        int i10 = 0;
        String str = "";
        String str2 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, zzdh.CREATOR);
            } else if (O == 2) {
                i10 = a.Z(parcel, X);
            } else if (O == 3) {
                str = a.G(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                str2 = a.G(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new GeofencingRequest(arrayList, i10, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GeofencingRequest[i10];
    }
}

package t8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import java.util.ArrayList;
import l8.a;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        String str = null;
        int i10 = 0;
        ArrayList<zam> arrayList = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                str = a.G(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                arrayList = a.L(parcel, X, zam.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zal(i10, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zal[i10];
    }
}

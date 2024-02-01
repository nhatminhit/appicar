package t8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zan;
import java.util.ArrayList;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = l8.a.i0(parcel);
        ArrayList<zal> arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X = l8.a.X(parcel);
            int O = l8.a.O(X);
            if (O == 1) {
                i10 = l8.a.Z(parcel, X);
            } else if (O == 2) {
                arrayList = l8.a.L(parcel, X, zal.CREATOR);
            } else if (O != 3) {
                l8.a.h0(parcel, X);
            } else {
                str = l8.a.G(parcel, X);
            }
        }
        l8.a.N(parcel, i02);
        return new zan(i10, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zan[i10];
    }
}

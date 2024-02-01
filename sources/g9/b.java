package g9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zaa;
import l8.a;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i11 = a.Z(parcel, X);
            } else if (O != 3) {
                a.h0(parcel, X);
            } else {
                intent = (Intent) a.C(parcel, X, Intent.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zaa(i10, i11, intent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zaa[i10];
    }
}

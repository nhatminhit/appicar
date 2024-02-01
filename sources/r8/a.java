package r8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = l8.a.i0(parcel);
        int i10 = 0;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < i02) {
            int X = l8.a.X(parcel);
            int O = l8.a.O(X);
            if (O == 1) {
                i10 = l8.a.Z(parcel, X);
            } else if (O == 2) {
                str = l8.a.G(parcel, X);
            } else if (O != 3) {
                l8.a.h0(parcel, X);
            } else {
                i11 = l8.a.Z(parcel, X);
            }
        }
        l8.a.N(parcel, i02);
        return new FavaDiagnosticsEntity(i10, str, i11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new FavaDiagnosticsEntity[i10];
    }
}
